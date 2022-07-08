// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opensearch.outputs;

import com.pulumi.aws.opensearch.outputs.GetDomainClusterConfigColdStorageOption;
import com.pulumi.aws.opensearch.outputs.GetDomainClusterConfigZoneAwarenessConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainClusterConfig {
    /**
     * @return Configuration block containing cold storage configuration.
     * 
     */
    private final List<GetDomainClusterConfigColdStorageOption> coldStorageOptions;
    /**
     * @return Number of dedicated master nodes in the cluster.
     * 
     */
    private final Integer dedicatedMasterCount;
    /**
     * @return Indicates whether dedicated master nodes are enabled for the cluster.
     * 
     */
    private final Boolean dedicatedMasterEnabled;
    /**
     * @return Instance type of the dedicated master nodes in the cluster.
     * 
     */
    private final String dedicatedMasterType;
    /**
     * @return Number of instances in the cluster.
     * 
     */
    private final Integer instanceCount;
    /**
     * @return Instance type of data nodes in the cluster.
     * 
     */
    private final String instanceType;
    /**
     * @return Number of warm nodes in the cluster.
     * 
     */
    private final Integer warmCount;
    /**
     * @return Indicates warm storage is enabled.
     * 
     */
    private final @Nullable Boolean warmEnabled;
    /**
     * @return Instance type for the OpenSearch cluster&#39;s warm nodes.
     * 
     */
    private final String warmType;
    /**
     * @return Configuration block containing zone awareness settings.
     * 
     */
    private final List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs;
    /**
     * @return Indicates whether zone awareness is enabled.
     * 
     */
    private final Boolean zoneAwarenessEnabled;

    @CustomType.Constructor
    private GetDomainClusterConfig(
        @CustomType.Parameter("coldStorageOptions") List<GetDomainClusterConfigColdStorageOption> coldStorageOptions,
        @CustomType.Parameter("dedicatedMasterCount") Integer dedicatedMasterCount,
        @CustomType.Parameter("dedicatedMasterEnabled") Boolean dedicatedMasterEnabled,
        @CustomType.Parameter("dedicatedMasterType") String dedicatedMasterType,
        @CustomType.Parameter("instanceCount") Integer instanceCount,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("warmCount") Integer warmCount,
        @CustomType.Parameter("warmEnabled") @Nullable Boolean warmEnabled,
        @CustomType.Parameter("warmType") String warmType,
        @CustomType.Parameter("zoneAwarenessConfigs") List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs,
        @CustomType.Parameter("zoneAwarenessEnabled") Boolean zoneAwarenessEnabled) {
        this.coldStorageOptions = coldStorageOptions;
        this.dedicatedMasterCount = dedicatedMasterCount;
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
        this.dedicatedMasterType = dedicatedMasterType;
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.warmCount = warmCount;
        this.warmEnabled = warmEnabled;
        this.warmType = warmType;
        this.zoneAwarenessConfigs = zoneAwarenessConfigs;
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    /**
     * @return Configuration block containing cold storage configuration.
     * 
     */
    public List<GetDomainClusterConfigColdStorageOption> coldStorageOptions() {
        return this.coldStorageOptions;
    }
    /**
     * @return Number of dedicated master nodes in the cluster.
     * 
     */
    public Integer dedicatedMasterCount() {
        return this.dedicatedMasterCount;
    }
    /**
     * @return Indicates whether dedicated master nodes are enabled for the cluster.
     * 
     */
    public Boolean dedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }
    /**
     * @return Instance type of the dedicated master nodes in the cluster.
     * 
     */
    public String dedicatedMasterType() {
        return this.dedicatedMasterType;
    }
    /**
     * @return Number of instances in the cluster.
     * 
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }
    /**
     * @return Instance type of data nodes in the cluster.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return Number of warm nodes in the cluster.
     * 
     */
    public Integer warmCount() {
        return this.warmCount;
    }
    /**
     * @return Indicates warm storage is enabled.
     * 
     */
    public Optional<Boolean> warmEnabled() {
        return Optional.ofNullable(this.warmEnabled);
    }
    /**
     * @return Instance type for the OpenSearch cluster&#39;s warm nodes.
     * 
     */
    public String warmType() {
        return this.warmType;
    }
    /**
     * @return Configuration block containing zone awareness settings.
     * 
     */
    public List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs() {
        return this.zoneAwarenessConfigs;
    }
    /**
     * @return Indicates whether zone awareness is enabled.
     * 
     */
    public Boolean zoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetDomainClusterConfigColdStorageOption> coldStorageOptions;
        private Integer dedicatedMasterCount;
        private Boolean dedicatedMasterEnabled;
        private String dedicatedMasterType;
        private Integer instanceCount;
        private String instanceType;
        private Integer warmCount;
        private @Nullable Boolean warmEnabled;
        private String warmType;
        private List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs;
        private Boolean zoneAwarenessEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coldStorageOptions = defaults.coldStorageOptions;
    	      this.dedicatedMasterCount = defaults.dedicatedMasterCount;
    	      this.dedicatedMasterEnabled = defaults.dedicatedMasterEnabled;
    	      this.dedicatedMasterType = defaults.dedicatedMasterType;
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.warmCount = defaults.warmCount;
    	      this.warmEnabled = defaults.warmEnabled;
    	      this.warmType = defaults.warmType;
    	      this.zoneAwarenessConfigs = defaults.zoneAwarenessConfigs;
    	      this.zoneAwarenessEnabled = defaults.zoneAwarenessEnabled;
        }

        public Builder coldStorageOptions(List<GetDomainClusterConfigColdStorageOption> coldStorageOptions) {
            this.coldStorageOptions = Objects.requireNonNull(coldStorageOptions);
            return this;
        }
        public Builder coldStorageOptions(GetDomainClusterConfigColdStorageOption... coldStorageOptions) {
            return coldStorageOptions(List.of(coldStorageOptions));
        }
        public Builder dedicatedMasterCount(Integer dedicatedMasterCount) {
            this.dedicatedMasterCount = Objects.requireNonNull(dedicatedMasterCount);
            return this;
        }
        public Builder dedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
            this.dedicatedMasterEnabled = Objects.requireNonNull(dedicatedMasterEnabled);
            return this;
        }
        public Builder dedicatedMasterType(String dedicatedMasterType) {
            this.dedicatedMasterType = Objects.requireNonNull(dedicatedMasterType);
            return this;
        }
        public Builder instanceCount(Integer instanceCount) {
            this.instanceCount = Objects.requireNonNull(instanceCount);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder warmCount(Integer warmCount) {
            this.warmCount = Objects.requireNonNull(warmCount);
            return this;
        }
        public Builder warmEnabled(@Nullable Boolean warmEnabled) {
            this.warmEnabled = warmEnabled;
            return this;
        }
        public Builder warmType(String warmType) {
            this.warmType = Objects.requireNonNull(warmType);
            return this;
        }
        public Builder zoneAwarenessConfigs(List<GetDomainClusterConfigZoneAwarenessConfig> zoneAwarenessConfigs) {
            this.zoneAwarenessConfigs = Objects.requireNonNull(zoneAwarenessConfigs);
            return this;
        }
        public Builder zoneAwarenessConfigs(GetDomainClusterConfigZoneAwarenessConfig... zoneAwarenessConfigs) {
            return zoneAwarenessConfigs(List.of(zoneAwarenessConfigs));
        }
        public Builder zoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
            this.zoneAwarenessEnabled = Objects.requireNonNull(zoneAwarenessEnabled);
            return this;
        }        public GetDomainClusterConfig build() {
            return new GetDomainClusterConfig(coldStorageOptions, dedicatedMasterCount, dedicatedMasterEnabled, dedicatedMasterType, instanceCount, instanceType, warmCount, warmEnabled, warmType, zoneAwarenessConfigs, zoneAwarenessEnabled);
        }
    }
}