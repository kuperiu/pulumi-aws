// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.outputs;

import com.pulumi.aws.iot.outputs.ThingGroupPropertiesAttributePayload;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ThingGroupProperties {
    /**
     * @return The Thing Group attributes. Defined below.
     * 
     */
    private final @Nullable ThingGroupPropertiesAttributePayload attributePayload;
    /**
     * @return A description of the Thing Group.
     * 
     */
    private final @Nullable String description;

    @CustomType.Constructor
    private ThingGroupProperties(
        @CustomType.Parameter("attributePayload") @Nullable ThingGroupPropertiesAttributePayload attributePayload,
        @CustomType.Parameter("description") @Nullable String description) {
        this.attributePayload = attributePayload;
        this.description = description;
    }

    /**
     * @return The Thing Group attributes. Defined below.
     * 
     */
    public Optional<ThingGroupPropertiesAttributePayload> attributePayload() {
        return Optional.ofNullable(this.attributePayload);
    }
    /**
     * @return A description of the Thing Group.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThingGroupProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ThingGroupPropertiesAttributePayload attributePayload;
        private @Nullable String description;

        public Builder() {
    	      // Empty
        }

        public Builder(ThingGroupProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributePayload = defaults.attributePayload;
    	      this.description = defaults.description;
        }

        public Builder attributePayload(@Nullable ThingGroupPropertiesAttributePayload attributePayload) {
            this.attributePayload = attributePayload;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }        public ThingGroupProperties build() {
            return new ThingGroupProperties(attributePayload, description);
        }
    }
}