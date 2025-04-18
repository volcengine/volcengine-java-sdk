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
    public static final String REGION_CODE_AP_SOUTH_EAST_3 = "ap-southeast-3";
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
        BOOTSTRAP_REGION.add(REGION_CODE_AP_SOUTH_EAST_3);
    }

    static {
        // --------------------------- vke ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vke", new ServiceEndpointInfo(
                "vke",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(REGION_CODE_CN_BEIJING_AUTODRIVING, "vke")
        ));

        // --------------------------- Redis ---------------------------
        DEFAULT_ENDPOINT_MAP.put("Redis", new ServiceEndpointInfo(
                "Redis",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "redis",
                        REGION_CODE_AP_SOUTH_EAST_3, "redis"
                )
        ));

        // --------------------------- privatelink ---------------------------
        DEFAULT_ENDPOINT_MAP.put("privatelink", new ServiceEndpointInfo(
                "privatelink",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "privatelink",
                        REGION_CODE_AP_SOUTH_EAST_3, "privatelink"
                )
        ));

        // --------------------------- vpc ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vpc", new ServiceEndpointInfo(
                "vpc",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "vpc",
                        REGION_CODE_AP_SOUTH_EAST_3, "vpc"
                )
        ));

        // --------------------------- RocketMQ ---------------------------
        DEFAULT_ENDPOINT_MAP.put("RocketMQ", new ServiceEndpointInfo(
                "RocketMQ",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "rocketmq",
                        REGION_CODE_AP_SOUTH_EAST_3, "rocketmq"
                )
        ));

        // --------------------------- Kafka ---------------------------
        DEFAULT_ENDPOINT_MAP.put("Kafka", new ServiceEndpointInfo(
                "Kafka",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "kafka",
                        REGION_CODE_AP_SOUTH_EAST_3, "kafka"
                )
        ));

        // --------------------------- rds_mysql ---------------------------
        DEFAULT_ENDPOINT_MAP.put("rds_mysql", new ServiceEndpointInfo(
                "rds_mysql",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "rds-mysql",
                        REGION_CODE_AP_SOUTH_EAST_3, "rds-mysql"
                )
        ));

        // --------------------------- rds_postgresql ---------------------------
        DEFAULT_ENDPOINT_MAP.put("rds_postgresql", new ServiceEndpointInfo(
                "rds_postgresql",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "rds-postgresql",
                        REGION_CODE_AP_SOUTH_EAST_3, "rds-postgresql"
                )
        ));

        // --------------------------- storage_ebs ---------------------------
        DEFAULT_ENDPOINT_MAP.put("storage_ebs", new ServiceEndpointInfo(
                "storage_ebs",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "storage-ebs",
                        REGION_CODE_AP_SOUTH_EAST_3, "storage-ebs"
                )
        ));

        // --------------------------- clb ---------------------------
        DEFAULT_ENDPOINT_MAP.put("clb", new ServiceEndpointInfo(
                "clb",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(REGION_CODE_CN_BEIJING_AUTODRIVING, "clb")
        ));

        // --------------------------- ecs ---------------------------
        DEFAULT_ENDPOINT_MAP.put("ecs", new ServiceEndpointInfo(
                "ecs",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "ecs",
                        REGION_CODE_AP_SOUTH_EAST_3, "ecs"
                )
        ));

        // --------------------------- alb ---------------------------
        DEFAULT_ENDPOINT_MAP.put("alb", new ServiceEndpointInfo(
                "alb",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "alb",
                        REGION_CODE_AP_SOUTH_EAST_3, "alb"
                )
        ));

        // --------------------------- FileNAS ---------------------------
        DEFAULT_ENDPOINT_MAP.put("FileNAS", new ServiceEndpointInfo(
                "FileNAS",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(REGION_CODE_CN_BEIJING_AUTODRIVING, "filenas")
        ));

        // --------------------------- configcenter ---------------------------
        DEFAULT_ENDPOINT_MAP.put("configcenter", new ServiceEndpointInfo(
                "configcenter",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(REGION_CODE_CN_BEIJING_AUTODRIVING, "configcenter")
        ));

        // --------------------------- cr ---------------------------
        DEFAULT_ENDPOINT_MAP.put("cr", new ServiceEndpointInfo(
                "cr",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(REGION_CODE_CN_BEIJING_AUTODRIVING, "cr")
        ));

        // --------------------------- sts ---------------------------
        DEFAULT_ENDPOINT_MAP.put("sts", new ServiceEndpointInfo(
                "sts",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(REGION_CODE_CN_BEIJING_AUTODRIVING, "sts")
        ));

        // --------------------------- mongodb ---------------------------
        DEFAULT_ENDPOINT_MAP.put("mongodb", new ServiceEndpointInfo(
                "mongodb",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "mongodb",
                        REGION_CODE_AP_SOUTH_EAST_3, "mongodb"
                )
        ));

        // --------------------------- transitrouter ---------------------------
        DEFAULT_ENDPOINT_MAP.put("transitrouter", new ServiceEndpointInfo(
                "transitrouter",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "transitrouter",
                        REGION_CODE_AP_SOUTH_EAST_3, "transitrouter"
                )
        ));

        // --------------------------- Volc_Observe ---------------------------
        DEFAULT_ENDPOINT_MAP.put("Volc_Observe", new ServiceEndpointInfo(
                "Volc_Observe",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "volc-observe",
                        REGION_CODE_AP_SOUTH_EAST_3, "volc-observe"
                )
        ));

        // --------------------------- dms ---------------------------
        DEFAULT_ENDPOINT_MAP.put("dms", new ServiceEndpointInfo(
                "dms",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "dms",
                        REGION_CODE_AP_SOUTH_EAST_3, "dms"
                )
        ));

        // --------------------------- auto_scaling ---------------------------
        DEFAULT_ENDPOINT_MAP.put("auto_scaling", new ServiceEndpointInfo(
                "auto_scaling",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "auto-scaling",
                        REGION_CODE_AP_SOUTH_EAST_3, "auto-scaling"
                )
        ));

        // --------------------------- directconnect ---------------------------
        DEFAULT_ENDPOINT_MAP.put("directconnect", new ServiceEndpointInfo(
                "directconnect",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "directconnect",
                        REGION_CODE_AP_SOUTH_EAST_3, "directconnect"
                )
        ));

        // --------------------------- kms ---------------------------
        DEFAULT_ENDPOINT_MAP.put("kms", new ServiceEndpointInfo(
                "kms",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(REGION_CODE_CN_BEIJING_AUTODRIVING, "kms")
        ));

        // --------------------------- dbw ---------------------------
        DEFAULT_ENDPOINT_MAP.put("dbw", new ServiceEndpointInfo(
                "dbw",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(REGION_CODE_AP_SOUTH_EAST_3, "dbw")
        ));

        // --------------------------- dts ---------------------------
        DEFAULT_ENDPOINT_MAP.put("dts", new ServiceEndpointInfo(
                "dts",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "dts",
                        REGION_CODE_AP_SOUTH_EAST_3, "dts"
                )
        ));

        // --------------------------- natgateway ---------------------------
        DEFAULT_ENDPOINT_MAP.put("natgateway", new ServiceEndpointInfo(
                "natgateway",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(REGION_CODE_AP_SOUTH_EAST_3, "natgateway")
        ));

        // --------------------------- tos ---------------------------
        DEFAULT_ENDPOINT_MAP.put("tos", new ServiceEndpointInfo(
                "tos",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "tos",
                        REGION_CODE_AP_SOUTH_EAST_3, "tos"
                )
        ));

        // --------------------------- TLS ---------------------------
        DEFAULT_ENDPOINT_MAP.put("TLS", new ServiceEndpointInfo(
                "TLS",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(
                        REGION_CODE_CN_BEIJING_AUTODRIVING, "tls",
                        REGION_CODE_AP_SOUTH_EAST_3, "tls"
                )
        ));

        // --------------------------- vpn ---------------------------
        DEFAULT_ENDPOINT_MAP.put("vpn", new ServiceEndpointInfo(
                "vpn",
                false,
                "",
                ENDPOINT,
                createRegionEndpointMap(REGION_CODE_AP_SOUTH_EAST_3, "vpn")
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
                                                          Set<String> customBootstrapRegion) {
        String resultEndpoint = ENDPOINT;
        ServiceEndpointInfo endpointInfo = DEFAULT_ENDPOINT_MAP.get(service);
        if (endpointInfo == null || !inBootstrapRegionList(regionCode, customBootstrapRegion)) {
            return resultEndpoint;
        }

        String endpointSuffix = hasEnabledDualstack() ? DUALSTACK_ENDPOINT_SUFFIX : ENDPOINT_SUFFIX;

        if (endpointInfo.isGlobal) {
            if (!endpointInfo.globalEndpoint.isEmpty()) {
                resultEndpoint = endpointInfo.globalEndpoint;
                return resultEndpoint;
            }

            resultEndpoint = standardizeDomainServiceCode(service) + endpointSuffix;
            return resultEndpoint;
        }

        String regionEndpoint = endpointInfo.regionEndpointMap.get(regionCode);
        if (regionEndpoint != null) {
            resultEndpoint = regionEndpoint;
            return resultEndpoint;
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
                e.printStackTrace();
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

    private static boolean hasEnabledDualstack() {
        String enableDualstack = System.getenv("VOLC_ENABLE_DUALSTACK");
        return enableDualstack != null && enableDualstack.equals("true");
    }

    @Override
    public ResolvedEndpoint endpointFor(ResolveEndpointOption option) {
        String endpoint = DefaultEndpointProvider.getDefaultEndpointByServiceInfo(option.getService(),
                option.getRegion(), option.getCustomBootstrapRegion());
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


