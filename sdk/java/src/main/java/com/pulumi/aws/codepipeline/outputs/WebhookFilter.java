// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebhookFilter {
    /**
     * @return The [JSON path](https://github.com/json-path/JsonPath) to filter on.
     * 
     */
    private final String jsonPath;
    /**
     * @return The value to match on (e.g., `refs/heads/{Branch}`). See [AWS docs](https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_WebhookFilterRule.html) for details.
     * 
     */
    private final String matchEquals;

    @CustomType.Constructor
    private WebhookFilter(
        @CustomType.Parameter("jsonPath") String jsonPath,
        @CustomType.Parameter("matchEquals") String matchEquals) {
        this.jsonPath = jsonPath;
        this.matchEquals = matchEquals;
    }

    /**
     * @return The [JSON path](https://github.com/json-path/JsonPath) to filter on.
     * 
     */
    public String jsonPath() {
        return this.jsonPath;
    }
    /**
     * @return The value to match on (e.g., `refs/heads/{Branch}`). See [AWS docs](https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_WebhookFilterRule.html) for details.
     * 
     */
    public String matchEquals() {
        return this.matchEquals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String jsonPath;
        private String matchEquals;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonPath = defaults.jsonPath;
    	      this.matchEquals = defaults.matchEquals;
        }

        public Builder jsonPath(String jsonPath) {
            this.jsonPath = Objects.requireNonNull(jsonPath);
            return this;
        }
        public Builder matchEquals(String matchEquals) {
            this.matchEquals = Objects.requireNonNull(matchEquals);
            return this;
        }        public WebhookFilter build() {
            return new WebhookFilter(jsonPath, matchEquals);
        }
    }
}