package com.volcengine.endpoint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DefaultEndpointProvider implements EndpointResolver {

    // 区域代码常量
    public static final String REGION_CODE_CN_BEIJING_AUTODRIVING = "cn-beijing-autodriving";
    public static final String REGION_CODE_CN_SHANGHAI_AUTODRIVING = "cn-shanghai-autodriving";
    public static final String REGION_CODE_AP_SOUTH_EAST_2 = "ap-southeast-2";
    public static final String REGION_CODE_AP_SOUTH_EAST_3 = "ap-southeast-3";
    public static final String REGION_CODE_CN_HONGKONG = "cn-hongkong";
    // 常量
    private static final String SEPARATOR = ".";
    private static final String OPEN_PREFIX = "open";
    private static final String ENDPOINT_SUFFIX = SEPARATOR + "volcengineapi.com";
    private static final String ENDPOINT = OPEN_PREFIX + ENDPOINT_SUFFIX;
    private static final String DUALSTACK_ENDPOINT_SUFFIX = SEPARATOR + "volcengine-api.com";
    private static final Map<String, ServiceEndpointInfo> DEFAULT_ENDPOINT_MAP = new HashMap<>();
    private static final Set<String> BOOTSTRAP_REGION = new HashSet<>();

    static {
        BOOTSTRAP_REGION.add(REGION_CODE_CN_BEIJING_AUTODRIVING);
        BOOTSTRAP_REGION.add(REGION_CODE_AP_SOUTH_EAST_2);
        BOOTSTRAP_REGION.add(REGION_CODE_AP_SOUTH_EAST_3);
        BOOTSTRAP_REGION.add(REGION_CODE_CN_SHANGHAI_AUTODRIVING);
    }

    static {
        // --------------------------- advdefence ---------------------------
        DEFAULT_ENDPOINT_MAP.put("advdefence", new ServiceEndpointInfo(
                "advdefence",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- ark ---------------------------
        DEFAULT_ENDPOINT_MAP.put("ark", new ServiceEndpointInfo(
                "ark",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- billing ---------------------------
        DEFAULT_ENDPOINT_MAP.put("billing", new ServiceEndpointInfo(
                "billing",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- bio ---------------------------
        DEFAULT_ENDPOINT_MAP.put("bio", new ServiceEndpointInfo(
                "bio",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- cdn ---------------------------
        DEFAULT_ENDPOINT_MAP.put("cdn", new ServiceEndpointInfo(
                "cdn",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- iam ---------------------------
        DEFAULT_ENDPOINT_MAP.put("iam", new ServiceEndpointInfo(
                "iam",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- vke ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vke", new ServiceEndpointInfo(
                "vke",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- vmp ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vmp", new ServiceEndpointInfo(
                "vmp",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- volc_content_platform ---------------------------
        DEFAULT_ENDPOINT_MAP.put("volc_content_platform", new ServiceEndpointInfo(
                "volc_content_platform",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- volc_observe ---------------------------
        DEFAULT_ENDPOINT_MAP.put("volc_observe", new ServiceEndpointInfo(
                "volc_observe",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- Redis ---------------------------
        DEFAULT_ENDPOINT_MAP.put("Redis", new ServiceEndpointInfo(
                "Redis",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- privatelink ---------------------------
        DEFAULT_ENDPOINT_MAP.put("privatelink", new ServiceEndpointInfo(
                "privatelink",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- rabbitmq ---------------------------
        DEFAULT_ENDPOINT_MAP.put("rabbitmq", new ServiceEndpointInfo(
                "rabbitmq",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- vpc ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vpc", new ServiceEndpointInfo(
                "vpc",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- RocketMQ ---------------------------
        DEFAULT_ENDPOINT_MAP.put("RocketMQ", new ServiceEndpointInfo(
                "RocketMQ",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- kafka ---------------------------
        DEFAULT_ENDPOINT_MAP.put("kafka", new ServiceEndpointInfo(
                "kafka",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- rds_mysql ---------------------------
        DEFAULT_ENDPOINT_MAP.put("rds_mysql", new ServiceEndpointInfo(
                "rds_mysql",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- rds_mssql ---------------------------
        DEFAULT_ENDPOINT_MAP.put("rds_mssql", new ServiceEndpointInfo(
                "rds_mssql",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- rds_postgresql ---------------------------
        DEFAULT_ENDPOINT_MAP.put("rds_postgresql", new ServiceEndpointInfo(
                "rds_postgresql",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- redis ---------------------------
        DEFAULT_ENDPOINT_MAP.put("redis", new ServiceEndpointInfo(
                "redis",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- rocketmq ---------------------------
        DEFAULT_ENDPOINT_MAP.put("rocketmq", new ServiceEndpointInfo(
                "rocketmq",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- seccenter ---------------------------
        DEFAULT_ENDPOINT_MAP.put("seccenter", new ServiceEndpointInfo(
                "seccenter",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- spark ---------------------------
        DEFAULT_ENDPOINT_MAP.put("spark", new ServiceEndpointInfo(
                "spark",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- storage_ebs ---------------------------
        DEFAULT_ENDPOINT_MAP.put("storage_ebs", new ServiceEndpointInfo(
                "storage_ebs",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- clb ---------------------------
        DEFAULT_ENDPOINT_MAP.put("clb", new ServiceEndpointInfo(
                "clb",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- cloud_detect ---------------------------
        DEFAULT_ENDPOINT_MAP.put("cloud_detect", new ServiceEndpointInfo(
                "cloud_detect",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- cloud_trail ---------------------------
        DEFAULT_ENDPOINT_MAP.put("cloud_trail", new ServiceEndpointInfo(
                "cloud_trail",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- ecs ---------------------------
        DEFAULT_ENDPOINT_MAP.put("ecs", new ServiceEndpointInfo(
                "ecs",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- edx ---------------------------
        DEFAULT_ENDPOINT_MAP.put("edx", new ServiceEndpointInfo(
                "edx",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- emr ---------------------------
        DEFAULT_ENDPOINT_MAP.put("emr", new ServiceEndpointInfo(
                "emr",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- escloud ---------------------------
        DEFAULT_ENDPOINT_MAP.put("escloud", new ServiceEndpointInfo(
                "escloud",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- alb ---------------------------
        DEFAULT_ENDPOINT_MAP.put("alb", new ServiceEndpointInfo(
                "alb",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- filenas ---------------------------
        DEFAULT_ENDPOINT_MAP.put("filenas", new ServiceEndpointInfo(
                "filenas",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- flink ---------------------------
        DEFAULT_ENDPOINT_MAP.put("flink", new ServiceEndpointInfo(
                "flink",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- fw_center ---------------------------
        DEFAULT_ENDPOINT_MAP.put("fw_center", new ServiceEndpointInfo(
                "fw_center",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- httpdns ---------------------------
        DEFAULT_ENDPOINT_MAP.put("httpdns", new ServiceEndpointInfo(
                "httpdns",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- configcenter ---------------------------
        DEFAULT_ENDPOINT_MAP.put("configcenter", new ServiceEndpointInfo(
                "configcenter",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- cen ---------------------------
        DEFAULT_ENDPOINT_MAP.put("cen", new ServiceEndpointInfo(
                "cen",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // ---------------------------  ---------------------------
        DEFAULT_ENDPOINT_MAP.put("certificate_service", new ServiceEndpointInfo(
                "certificate_service",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- cr ---------------------------
        DEFAULT_ENDPOINT_MAP.put("cr", new ServiceEndpointInfo(
                "cr",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- cv ---------------------------
        DEFAULT_ENDPOINT_MAP.put("cv", new ServiceEndpointInfo(
                "cv",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- dataleap ---------------------------
        DEFAULT_ENDPOINT_MAP.put("dataleap", new ServiceEndpointInfo(
                "dataleap",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- dcdn ---------------------------
        DEFAULT_ENDPOINT_MAP.put("dcdn", new ServiceEndpointInfo(
                "dcdn",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- sts ---------------------------
        DEFAULT_ENDPOINT_MAP.put("sts", new ServiceEndpointInfo(
                "sts",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- tis ---------------------------
        DEFAULT_ENDPOINT_MAP.put("tis", new ServiceEndpointInfo(
                "tis",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- mongodb ---------------------------
        DEFAULT_ENDPOINT_MAP.put("mongodb", new ServiceEndpointInfo(
                "mongodb",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- transitrouter ---------------------------
        DEFAULT_ENDPOINT_MAP.put("transitrouter", new ServiceEndpointInfo(
                "transitrouter",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- translate ---------------------------
        DEFAULT_ENDPOINT_MAP.put("translate", new ServiceEndpointInfo(
                "translate",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- vedbm ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vedbm", new ServiceEndpointInfo(
                "vedbm",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- vefaas ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vefaas", new ServiceEndpointInfo(
                "vefaas",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- vei_api ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vei_api", new ServiceEndpointInfo(
                "vei_api",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- vei_api ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vepfs", new ServiceEndpointInfo(
                "vepfs",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- Volc_Observe ---------------------------
        DEFAULT_ENDPOINT_MAP.put("Volc_Observe", new ServiceEndpointInfo(
                "Volc_Observe",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- dms ---------------------------
        DEFAULT_ENDPOINT_MAP.put("dms", new ServiceEndpointInfo(
                "dms",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- dns ---------------------------
        DEFAULT_ENDPOINT_MAP.put("dns", new ServiceEndpointInfo(
                "dns",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- auto_scaling ---------------------------
        DEFAULT_ENDPOINT_MAP.put("auto_scaling", new ServiceEndpointInfo(
                "auto_scaling",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- directconnect ---------------------------
        DEFAULT_ENDPOINT_MAP.put("directconnect", new ServiceEndpointInfo(
                "directconnect",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- kms ---------------------------
        DEFAULT_ENDPOINT_MAP.put("kms", new ServiceEndpointInfo(
                "kms",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- mcdn ---------------------------
        DEFAULT_ENDPOINT_MAP.put("mcdn", new ServiceEndpointInfo(
                "mcdn",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- mcs ---------------------------
        DEFAULT_ENDPOINT_MAP.put("mcs", new ServiceEndpointInfo(
                "mcs",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- ml_platform ---------------------------
        DEFAULT_ENDPOINT_MAP.put("ml_platform", new ServiceEndpointInfo(
                "ml_platform",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- dbw ---------------------------
        DEFAULT_ENDPOINT_MAP.put("dbw", new ServiceEndpointInfo(
                "dbw",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- dts ---------------------------
        DEFAULT_ENDPOINT_MAP.put("dts", new ServiceEndpointInfo(
                "dts",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- natgateway ---------------------------
        DEFAULT_ENDPOINT_MAP.put("natgateway", new ServiceEndpointInfo(
                "natgateway",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- nta ---------------------------
        DEFAULT_ENDPOINT_MAP.put("nta", new ServiceEndpointInfo(
                "nta",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- organization ---------------------------
        DEFAULT_ENDPOINT_MAP.put("organization", new ServiceEndpointInfo(
                "organization",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- tos ---------------------------
        DEFAULT_ENDPOINT_MAP.put("tos", new ServiceEndpointInfo(
                "tos",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- TLS ---------------------------
        DEFAULT_ENDPOINT_MAP.put("TLS", new ServiceEndpointInfo(
                "TLS",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- vpn ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vpn", new ServiceEndpointInfo(
                "vpn",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- waf ---------------------------
        DEFAULT_ENDPOINT_MAP.put("waf", new ServiceEndpointInfo(
                "waf",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));

        // --------------------------- quota ---------------------------
        DEFAULT_ENDPOINT_MAP.put("quota", new ServiceEndpointInfo(
                "quota",
                true,
                "",
                ENDPOINT,
                createRegionEndpointMap()
        ));
    }


    // 创建区域端点映射的辅助方法
    private static RegionEndpointMap createRegionEndpointMap(String... keyValuePairs) {
        RegionEndpointMap map = new RegionEndpointMap();
        for (int i = 0; i < keyValuePairs.length; i += 2) {
            String regionCode = keyValuePairs[i];
            String servicePrefix = keyValuePairs[i + 1];
            map.put(regionCode, servicePrefix + SEPARATOR + regionCode + ENDPOINT_SUFFIX);
        }
        return map;
    }

    private static String standardizeDomainServiceCode(String serviceCode) {
        return serviceCode.toLowerCase().replaceAll("_", "-");
    }

    private static String getDefaultEndpointByServiceInfo(String service, String regionCode,
                                                          Set<String> customBootstrapRegion, Boolean useDualStack) {
        String resultEndpoint = ENDPOINT;
        ServiceEndpointInfo endpointInfo = DEFAULT_ENDPOINT_MAP.get(service);
        if (endpointInfo == null || !inBootstrapRegionList(regionCode, customBootstrapRegion)) {
            return resultEndpoint;
        }

        String endpointSuffix = hasEnabledDualstack(useDualStack) ? DUALSTACK_ENDPOINT_SUFFIX : ENDPOINT_SUFFIX;

        if (endpointInfo.isGlobal) {
            if (!endpointInfo.globalEndpoint.isEmpty()) {
                resultEndpoint = endpointInfo.globalEndpoint;
                return resultEndpoint;
            }

            resultEndpoint = standardizeDomainServiceCode(service) + endpointSuffix;
            return resultEndpoint;
        }

        if (endpointInfo.regionEndpointMap != null) {
            String regionEndpoint = endpointInfo.regionEndpointMap.get(regionCode);
            if (regionEndpoint != null) {
                resultEndpoint = regionEndpoint;
                return resultEndpoint;
            }
        }

        resultEndpoint = standardizeDomainServiceCode(service) + SEPARATOR + regionCode + endpointSuffix;
        return resultEndpoint;
    }

    private static boolean inBootstrapRegionList(String region, Set<String> customBootstrapRegion) {
        String regionCode = region.trim();
        String bsRegionListPath = System.getenv("VOLC_BOOTSTRAP_REGION_LIST_CONF");

        if (bsRegionListPath != null && !bsRegionListPath.isEmpty()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(bsRegionListPath));
                String line;
                while ((line = reader.readLine()) != null) {
                    line = line.trim();
                    if (line.isEmpty()) {
                        continue;
                    }
                    if (line.equals(regionCode)) {
                        reader.close();
                        return true;
                    }
                }
                reader.close();
            } catch (Exception e) {
                System.err.println("Error when reading " + bsRegionListPath + ": " + e.getMessage());
            }
        }

        if (BOOTSTRAP_REGION.contains(region)) {
            return true;
        }

        if (customBootstrapRegion != null) {
            return customBootstrapRegion.contains(region);
        }

        return false;
    }

    private static boolean hasEnabledDualstack(Boolean useDualStack) {
        if (useDualStack == null) {
            String enableDualstack = System.getenv("VOLC_ENABLE_DUALSTACK");
            return enableDualstack != null && enableDualstack.equals("true");
        }

        return useDualStack;
    }

    @Override
    public ResolvedEndpoint endpointFor(ResolveEndpointOption option) {
        String endpoint = DefaultEndpointProvider.getDefaultEndpointByServiceInfo(option.getService(),
                option.getRegion(), option.getCustomBootstrapRegion(), option.getUseDualStack());
        ResolvedEndpoint result = new ResolvedEndpoint();
        result.setEndpoint(endpoint);
        return result;
    }

    // 区域端点映射类型
    private static class RegionEndpointMap extends HashMap<String, String> {
    }

    private static class ServiceEndpointInfo {
        private String service;
        private boolean isGlobal;
        private String globalEndpoint;
        private String defaultEndpoint;
        private RegionEndpointMap regionEndpointMap;

        public ServiceEndpointInfo(String service, boolean isGlobal, String globalEndpoint,
                                   String defaultEndpoint, RegionEndpointMap regionEndpointMap) {
            this.service = service;
            this.isGlobal = isGlobal;
            this.globalEndpoint = globalEndpoint;
            this.defaultEndpoint = defaultEndpoint;
            this.regionEndpointMap = regionEndpointMap;
        }
    }

}


