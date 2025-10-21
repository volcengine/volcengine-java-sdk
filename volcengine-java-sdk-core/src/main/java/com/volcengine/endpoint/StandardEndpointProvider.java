package com.volcengine.endpoint;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StandardEndpointProvider implements EndpointResolver {

    public static final String DEFAULT_FORMAT = "${Service}${Region}.${SiteStack}.com";
    private static final Pattern VAR_PATTERN = Pattern.compile("\\$\\{(\\w+)}");

    // 站点栈
    public static final String SiteStackVolcIPv4 = "volcengineapi";
    public static final String SiteStackVolcDualStack = "volcengine-api";

    private String format;
    private final Variables variables;
    private Map<String, ServiceInfo> customServices;

    public static class Variables {
        private String Service;
        private String Region;
        private String SiteStack;
        private Map<String,String> extension = new HashMap<>();

        public Variables() {
            this.SiteStack = SiteStackVolcIPv4;
        }

        public void setService(String Service) {
            this.Service = Service;
        }
        public void setRegion(String Region) {
            this.Region = Region;
        }
        public void setSiteStack(String SiteStack) {
            if (!StringUtils.isBlank(SiteStack)) {
                this.SiteStack = SiteStack;
            }
        }

        public void addExtension(String key,String value) {
            this.extension.put(key,value);
        }

        public void setExtension(Map<String,String> extension) {
            if (extension != null) {
                this.extension.putAll(extension);
            }
        }

        public Map<String, String> getVariables() {
            Map<String,String> vars = new HashMap<>();
            vars.put("Service", Service);
            vars.put("Region", Region);
            vars.put("SiteStack", SiteStack);
            vars.putAll(extension);
            return vars;
        }
    }

    private static class ServiceInfo {
        public final String service;
        public final boolean isGlobal;

        public ServiceInfo(String service, boolean isGlobal) {
            this.service = service;
            this.isGlobal = isGlobal;
        }
    }

    private static class RegionInfo {

    }

    private static class RegionChecker {
        private final Map<String, RegionInfo> whiteRegions;
        private final Pattern regexp;

        public RegionChecker(Map<String, RegionInfo> whiteRegions, Pattern regexp) {
            this.whiteRegions = whiteRegions;
            this.regexp = regexp;
        }

        public boolean validate(String region) {
            if (StringUtils.isBlank(region)) {
                return false;
            }

            if (whiteRegions != null && whiteRegions.containsKey(region)){
                return true;
            }
            if (regexp != null) {
                return regexp.matcher(region).matches();
            }
            return false;
        }
    }

    // ------- 构造与辅助方法 -------
    public StandardEndpointProvider() {
        this(DEFAULT_FORMAT, SiteStackVolcIPv4, new HashMap<>(), new HashMap<>());
    }

    public StandardEndpointProvider(String format, String siteStack,  Map<String,String> extension, Map<String, ServiceInfo> customServices) {
        if (StringUtils.isNotBlank(format)) {
            this.format = format;
        }
        Variables variables = new Variables();
        variables.setSiteStack(siteStack);
        variables.setExtension(extension);
        this.variables = variables;
        this.customServices = customServices == null ? new HashMap<>() : customServices;
    }

    private static String standardizeDomainServiceCode(String serviceCode) {
        return StringUtils.lowerCase(serviceCode).replace("_", "-");
    }

    // 简易模板渲染：替换 ${Service}${Region}.${SiteStack}.com
    private static String renderTemplate(String format, Variables v) {
        Matcher matcher = VAR_PATTERN.matcher(format);
        StringBuffer sb = new StringBuffer();
        Map<String, String> vars = v.getVariables();
        while (matcher.find()) {
            String key = matcher.group(1);
            String value = vars.getOrDefault(key, "");
            matcher.appendReplacement(sb, Matcher.quoteReplacement(value));
        }
        matcher.appendTail(sb);
        return sb.toString();
    }


    private static final Map<String, ServiceInfo> SERVICE_INFOS = new HashMap<>();
    private static final RegionChecker REGION_MATCHER;

    static {
        SERVICE_INFOS.put("vpc", new ServiceInfo("vpc", false));
        SERVICE_INFOS.put("ecs", new ServiceInfo("ecs", false));
        SERVICE_INFOS.put("billing", new ServiceInfo("billing", true));
        SERVICE_INFOS.put("ark", new ServiceInfo("ark", false));
        SERVICE_INFOS.put("iam", new ServiceInfo("iam", true));
        SERVICE_INFOS.put("mcs", new ServiceInfo("mcs", false));
        SERVICE_INFOS.put("rocketmq", new ServiceInfo("rocketmq", false));
        SERVICE_INFOS.put("bytehouse", new ServiceInfo("bytehouse", false));
        SERVICE_INFOS.put("dns", new ServiceInfo("dns", true));
        SERVICE_INFOS.put("autoscaling", new ServiceInfo("autoscaling", false));
        SERVICE_INFOS.put("spark", new ServiceInfo("spark", false));
        SERVICE_INFOS.put("cloud_detect", new ServiceInfo("cloud_detect", false));
        SERVICE_INFOS.put("filenas", new ServiceInfo("filenas", false));
        SERVICE_INFOS.put("escloud", new ServiceInfo("escloud", false));
        SERVICE_INFOS.put("flink", new ServiceInfo("flink", false));
        SERVICE_INFOS.put("cp", new ServiceInfo("cp", false));
        SERVICE_INFOS.put("vefaas", new ServiceInfo("vefaas", false));
        SERVICE_INFOS.put("ml_platform", new ServiceInfo("ml_platform", false));
        SERVICE_INFOS.put("edx", new ServiceInfo("edx", true));
        SERVICE_INFOS.put("dcdn", new ServiceInfo("dcdn", true));
        SERVICE_INFOS.put("cdn", new ServiceInfo("cdn", true));
        SERVICE_INFOS.put("kafka", new ServiceInfo("kafka", false));
        SERVICE_INFOS.put("certificate_service", new ServiceInfo("certificate_service", true));
        SERVICE_INFOS.put("waf", new ServiceInfo("waf", true));
        SERVICE_INFOS.put("rds_mssql", new ServiceInfo("rds_mssql", false));
        SERVICE_INFOS.put("cloudtrail", new ServiceInfo("cloudtrail", false));
        SERVICE_INFOS.put("vei_api", new ServiceInfo("vei_api", true));
        SERVICE_INFOS.put("cen", new ServiceInfo("cen", true));
        SERVICE_INFOS.put("rabbitmq", new ServiceInfo("rabbitmq", false));
        SERVICE_INFOS.put("vmp", new ServiceInfo("vmp", false));
        SERVICE_INFOS.put("volc_observe", new ServiceInfo("volc_observe", false));
        SERVICE_INFOS.put("dataleap", new ServiceInfo("dataleap", false));
        SERVICE_INFOS.put("fw_center", new ServiceInfo("fw_center", true));
        SERVICE_INFOS.put("redis", new ServiceInfo("redis", false));
        SERVICE_INFOS.put("mcdn", new ServiceInfo("mcdn", true));
        SERVICE_INFOS.put("cloudidentity", new ServiceInfo("cloudidentity", false));
        SERVICE_INFOS.put("vedbm", new ServiceInfo("vedbm", false));
        SERVICE_INFOS.put("cv", new ServiceInfo("cv", true));
        SERVICE_INFOS.put("translate", new ServiceInfo("translate", true));
        SERVICE_INFOS.put("cloud_trail", new ServiceInfo("cloud_trail", false));
        SERVICE_INFOS.put("bio", new ServiceInfo("bio", false));
        SERVICE_INFOS.put("nta", new ServiceInfo("nta", true));
        SERVICE_INFOS.put("elasticmapreduce", new ServiceInfo("elasticmapreduce", false));
        SERVICE_INFOS.put("vepfs", new ServiceInfo("vepfs", false));
        SERVICE_INFOS.put("seccenter", new ServiceInfo("seccenter", true));
        SERVICE_INFOS.put("advdefence", new ServiceInfo("advdefence", true));
        SERVICE_INFOS.put("tis", new ServiceInfo("tis", true));
        SERVICE_INFOS.put("organization", new ServiceInfo("organization", true));
        SERVICE_INFOS.put("vke", new ServiceInfo("vke", false));
        SERVICE_INFOS.put("Redis", new ServiceInfo("Redis", false));
        SERVICE_INFOS.put("privatelink", new ServiceInfo("privatelink", false));
        SERVICE_INFOS.put("RocketMQ", new ServiceInfo("RocketMQ", false));
        SERVICE_INFOS.put("Kafka", new ServiceInfo("Kafka", false));
        SERVICE_INFOS.put("rds_mysql", new ServiceInfo("rds_mysql", false));
        SERVICE_INFOS.put("rds_postgresql", new ServiceInfo("rds_postgresql", false));
        SERVICE_INFOS.put("storage_ebs", new ServiceInfo("storage_ebs", false));
        SERVICE_INFOS.put("clb", new ServiceInfo("clb", false));
        SERVICE_INFOS.put("alb", new ServiceInfo("alb", false));
        SERVICE_INFOS.put("FileNAS", new ServiceInfo("FileNAS", false));
        SERVICE_INFOS.put("configcenter", new ServiceInfo("configcenter", false));
        SERVICE_INFOS.put("cr", new ServiceInfo("cr", false));
        SERVICE_INFOS.put("sts", new ServiceInfo("sts", false));
        SERVICE_INFOS.put("mongodb", new ServiceInfo("mongodb", false));
        SERVICE_INFOS.put("transitrouter", new ServiceInfo("transitrouter", false));
        SERVICE_INFOS.put("Volc_Observe", new ServiceInfo("Volc_Observe", false));
        SERVICE_INFOS.put("dms", new ServiceInfo("dms", false));
        SERVICE_INFOS.put("auto_scaling", new ServiceInfo("auto_scaling", false));
        SERVICE_INFOS.put("directconnect", new ServiceInfo("directconnect", false));
        SERVICE_INFOS.put("kms", new ServiceInfo("kms", false));
        SERVICE_INFOS.put("dbw", new ServiceInfo("dbw", false));
        SERVICE_INFOS.put("dts", new ServiceInfo("dts", false));
        SERVICE_INFOS.put("natgateway", new ServiceInfo("natgateway", false));
        SERVICE_INFOS.put("tos", new ServiceInfo("tos", false));
        SERVICE_INFOS.put("TLS", new ServiceInfo("TLS", false));
        SERVICE_INFOS.put("vpn", new ServiceInfo("vpn", false));
        SERVICE_INFOS.put("vod", new ServiceInfo("vod", false));
        SERVICE_INFOS.put("quota", new ServiceInfo("quota", true));
        SERVICE_INFOS.put("ecs_ops", new ServiceInfo("ecs_ops", true));
        SERVICE_INFOS.put("as_ops", new ServiceInfo("as_ops", true));
        SERVICE_INFOS.put("account_management", new ServiceInfo("account_management", true));
        SERVICE_INFOS.put("account_management_byteplus", new ServiceInfo("account_management_byteplus", true));
        SERVICE_INFOS.put("bandwidthquota", new ServiceInfo("bandwidthquota", true));
        SERVICE_INFOS.put("psa_manager", new ServiceInfo("psa_manager", true));
        SERVICE_INFOS.put("dc_controller", new ServiceInfo("dc_controller", false));
        SERVICE_INFOS.put("eps_platform_trade", new ServiceInfo("eps_platform_trade", false));
        SERVICE_INFOS.put("eps_platform_fund", new ServiceInfo("eps_platform_fund", false));
        SERVICE_INFOS.put("commercialization", new ServiceInfo("commercialization", true));
        SERVICE_INFOS.put("veecp_openapi", new ServiceInfo("veecp_openapi", false));
        SERVICE_INFOS.put("orgnization", new ServiceInfo("orgnization", true));
        SERVICE_INFOS.put("coze", new ServiceInfo("coze", true));
        SERVICE_INFOS.put("sec_agent", new ServiceInfo("sec_agent", true));
        SERVICE_INFOS.put("sec_intelligent_dev", new ServiceInfo("sec_intelligent_dev", true));
        SERVICE_INFOS.put("vegame", new ServiceInfo("vegame", false));
        SERVICE_INFOS.put("acep", new ServiceInfo("acep", true));
        SERVICE_INFOS.put("private_zone", new ServiceInfo("private_zone", true));
        SERVICE_INFOS.put("sqs", new ServiceInfo("sqs", false));
        SERVICE_INFOS.put("resourcecenter", new ServiceInfo("resourcecenter", true));
        SERVICE_INFOS.put("aiotvideo", new ServiceInfo("aiotvideo", true));
        SERVICE_INFOS.put("apig", new ServiceInfo("apig", false));
        SERVICE_INFOS.put("bmq", new ServiceInfo("bmq", false));
        SERVICE_INFOS.put("bytehouse_ce", new ServiceInfo("bytehouse_ce", false));
        SERVICE_INFOS.put("cloudmonitor", new ServiceInfo("cloudmonitor", false));
        SERVICE_INFOS.put("emr", new ServiceInfo("emr", false));
        SERVICE_INFOS.put("ga", new ServiceInfo("ga", true));
        SERVICE_INFOS.put("graph", new ServiceInfo("graph", false));
        SERVICE_INFOS.put("gtm", new ServiceInfo("gtm", true));
        SERVICE_INFOS.put("hbase", new ServiceInfo("hbase", false));
        SERVICE_INFOS.put("metakms", new ServiceInfo("metakms", false));
        SERVICE_INFOS.put("na", new ServiceInfo("na", true));
        SERVICE_INFOS.put("resource_share", new ServiceInfo("resource_share", true));
        SERVICE_INFOS.put("speech_saas_prod", new ServiceInfo("speech_saas_prod", true));
        SERVICE_INFOS.put("tag", new ServiceInfo("tag", true));
        SERVICE_INFOS.put("vefaas_dev", new ServiceInfo("vefaas_dev", false));
        SERVICE_INFOS.put("vms", new ServiceInfo("vms", false));
        SERVICE_INFOS.put("eco_partner", new ServiceInfo("eco_partner", true));
        SERVICE_INFOS.put("smc", new ServiceInfo("smc", true));

        // -------- Region 匹配器（白名单 + 正则） --------
        Map<String, RegionInfo> white = new HashMap<>();
        white.put("ap-singapore-1", new RegionInfo());
        white.put("ap-southeast-1", new RegionInfo());
        white.put("ap-southeast-2", new RegionInfo());
        white.put("ap-southeast-3", new RegionInfo());
        white.put("byteplus-global", new RegionInfo());
        white.put("cn-beijing", new RegionInfo());
        white.put("cn-beijing-autodriving", new RegionInfo());
        white.put("cn-beijing-selfdrive", new RegionInfo());
        white.put("cn-beijing2", new RegionInfo());
        white.put("cn-beijing300", new RegionInfo());
        white.put("cn-changsha-sdv", new RegionInfo());
        white.put("cn-chengdu", new RegionInfo());
        white.put("cn-chengdu-sdv", new RegionInfo());
        white.put("cn-chongqing-sdv", new RegionInfo());
        white.put("cn-datong", new RegionInfo());
        white.put("cn-east-1-dedicated", new RegionInfo());
        white.put("cn-gaofang-bj", new RegionInfo());
        white.put("cn-gaofang-gz1", new RegionInfo());
        white.put("cn-gaofang-nt1", new RegionInfo());
        white.put("cn-gaofang-nt2", new RegionInfo());
        white.put("cn-gaofang-nt3", new RegionInfo());
        white.put("cn-gaofang-nt4", new RegionInfo());
        white.put("cn-gaofang-nt5", new RegionInfo());
        white.put("cn-guangzhou", new RegionInfo());
        white.put("cn-guilin-boe", new RegionInfo());
        white.put("cn-hangzhou", new RegionInfo());
        white.put("cn-hjxj", new RegionInfo());
        white.put("cn-hjzg", new RegionInfo());
        white.put("cn-hlbx", new RegionInfo());
        white.put("cn-hlxj", new RegionInfo());
        white.put("cn-hlzg", new RegionInfo());
        white.put("cn-hongkong", new RegionInfo());
        white.put("cn-hongkong-pop", new RegionInfo());
        white.put("cn-lfbx", new RegionInfo());
        white.put("cn-lfxj", new RegionInfo());
        white.put("cn-lfzg", new RegionInfo());
        white.put("cn-macau-pop-sdv", new RegionInfo());
        white.put("cn-mainland", new RegionInfo());
        white.put("cn-nanjing-bbit", new RegionInfo());
        white.put("cn-ningbo-sdv", new RegionInfo());
        white.put("cn-north-1", new RegionInfo());
        white.put("cn-north-1-dedicated", new RegionInfo());
        white.put("cn-north-boe", new RegionInfo());
        white.put("cn-shanghai", new RegionInfo());
        white.put("cn-shanghai-autodriving", new RegionInfo());
        white.put("cn-taiwan-boe", new RegionInfo());
        white.put("cn-wuhan", new RegionInfo());
        white.put("cn-wulanchabu", new RegionInfo());
        white.put("cn-xian-boe-sdv", new RegionInfo());
        white.put("overseas-1", new RegionInfo());
        white.put("rec-cn", new RegionInfo());
        white.put("rec-sg", new RegionInfo());

        Pattern pattern = Pattern.compile(
                "^(?:[a-z]{2}-[a-z]+(?:-[a-z]+)?|(?:cn|ap|eu|na|sa|me|af)-[a-z]+-\\d+(?:-(?:finance|exclusive|local|inner))?)$"
        );

        REGION_MATCHER = new RegionChecker(white, pattern);
    }

    private void checkParamNonBlank(String paramName, String paramValue) {
        if (StringUtils.isBlank(paramValue)) {
            throw new IllegalArgumentException(paramName + " must not be null.");
        }
    }

    @Override
    public ResolvedEndpoint endpointFor(ResolveEndpointOption option) {
        String region = option.getRegion();
        String service = option.getService();
        Boolean useDualStack = option.getUseDualStack();
        checkParamNonBlank("region", region);
        checkParamNonBlank("service", service);
        if (!REGION_MATCHER.validate(region)) {
            throw new IllegalArgumentException(String.format(
                    "InvalidRegion: invalid region [%s] for standard endpoint resolver, please upgrade the sdk endpoint resolver to the latest version",
                    region));
        }

        if (StringUtils.isEmpty(this.format)) {
            this.format = DEFAULT_FORMAT;
        }

        // 1) 归一化放入变量
        this.variables.Service = standardizeDomainServiceCode(service);

        // 2) 获取服务信息
        ServiceInfo info = SERVICE_INFOS.get(service);
        if (info == null) {
            info = this.customServices.get(service);
            if (info == null) {
                throw new IllegalArgumentException(String.format(
                        "ServiceNotFound: service [%s] not found in ServiceInfos or CustomServices, please upgrade the sdk endpoint resolver to the latest version",
                        service));
            }
        }

        // 3) region 处理（非 Global 才带 .region）
        if (!info.isGlobal) {
            this.variables.Region = "." + region;
        } else {
            this.variables.Region = "";
        }

        // 4) IP 版本选择 SiteStack（与 Go 逻辑一致：仅在匹配时覆盖）
        if (useDualStack != null && useDualStack) {
            this.variables.SiteStack = SiteStackVolcDualStack;
        } else {
            this.variables.SiteStack = SiteStackVolcIPv4;
        }

        // 5) 渲染模板
        String url = renderTemplate(this.format, this.variables);
        ResolvedEndpoint resolved = new ResolvedEndpoint();
        resolved.setEndpoint(url);

        return resolved;
    }

}
