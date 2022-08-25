// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.comprehend.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EntityRecognizerInputDataConfigEntityList {
    /**
     * @return Location of entity list.
     * 
     */
    private String s3Uri;

    private EntityRecognizerInputDataConfigEntityList() {}
    /**
     * @return Location of entity list.
     * 
     */
    public String s3Uri() {
        return this.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityRecognizerInputDataConfigEntityList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String s3Uri;
        public Builder() {}
        public Builder(EntityRecognizerInputDataConfigEntityList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Uri = defaults.s3Uri;
        }

        @CustomType.Setter
        public Builder s3Uri(String s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }
        public EntityRecognizerInputDataConfigEntityList build() {
            final var o = new EntityRecognizerInputDataConfigEntityList();
            o.s3Uri = s3Uri;
            return o;
        }
    }
}