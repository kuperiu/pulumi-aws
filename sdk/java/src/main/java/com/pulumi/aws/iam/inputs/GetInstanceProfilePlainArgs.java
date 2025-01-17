// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceProfilePlainArgs Empty = new GetInstanceProfilePlainArgs();

    /**
     * The friendly IAM instance profile name to match.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The friendly IAM instance profile name to match.
     * 
     */
    public String name() {
        return this.name;
    }

    private GetInstanceProfilePlainArgs() {}

    private GetInstanceProfilePlainArgs(GetInstanceProfilePlainArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceProfilePlainArgs $;

        public Builder() {
            $ = new GetInstanceProfilePlainArgs();
        }

        public Builder(GetInstanceProfilePlainArgs defaults) {
            $ = new GetInstanceProfilePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The friendly IAM instance profile name to match.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetInstanceProfilePlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
