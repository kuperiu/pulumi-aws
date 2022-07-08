// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.location.outputs;

import com.pulumi.aws.location.outputs.GetMapConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMapResult {
    /**
     * @return List of configurations that specify the map tile style selected from a partner data provider.
     * 
     */
    private final List<GetMapConfiguration> configurations;
    /**
     * @return The timestamp for when the map resource was created in ISO 8601 format.
     * 
     */
    private final String createTime;
    /**
     * @return The optional description for the map resource.
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The Amazon Resource Name (ARN) for the map resource.
     * 
     */
    private final String mapArn;
    private final String mapName;
    /**
     * @return Key-value map of resource tags for the map.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The timestamp for when the map resource was last updated in ISO 8601.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetMapResult(
        @CustomType.Parameter("configurations") List<GetMapConfiguration> configurations,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("mapArn") String mapArn,
        @CustomType.Parameter("mapName") String mapName,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.configurations = configurations;
        this.createTime = createTime;
        this.description = description;
        this.id = id;
        this.mapArn = mapArn;
        this.mapName = mapName;
        this.tags = tags;
        this.updateTime = updateTime;
    }

    /**
     * @return List of configurations that specify the map tile style selected from a partner data provider.
     * 
     */
    public List<GetMapConfiguration> configurations() {
        return this.configurations;
    }
    /**
     * @return The timestamp for when the map resource was created in ISO 8601 format.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The optional description for the map resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Amazon Resource Name (ARN) for the map resource.
     * 
     */
    public String mapArn() {
        return this.mapArn;
    }
    public String mapName() {
        return this.mapName;
    }
    /**
     * @return Key-value map of resource tags for the map.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The timestamp for when the map resource was last updated in ISO 8601.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMapResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetMapConfiguration> configurations;
        private String createTime;
        private String description;
        private String id;
        private String mapArn;
        private String mapName;
        private Map<String,String> tags;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMapResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurations = defaults.configurations;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.mapArn = defaults.mapArn;
    	      this.mapName = defaults.mapName;
    	      this.tags = defaults.tags;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder configurations(List<GetMapConfiguration> configurations) {
            this.configurations = Objects.requireNonNull(configurations);
            return this;
        }
        public Builder configurations(GetMapConfiguration... configurations) {
            return configurations(List.of(configurations));
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder mapArn(String mapArn) {
            this.mapArn = Objects.requireNonNull(mapArn);
            return this;
        }
        public Builder mapName(String mapName) {
            this.mapName = Objects.requireNonNull(mapName);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetMapResult build() {
            return new GetMapResult(configurations, createTime, description, id, mapArn, mapName, tags, updateTime);
        }
    }
}