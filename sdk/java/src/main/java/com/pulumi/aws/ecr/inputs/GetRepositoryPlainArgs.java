// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryPlainArgs Empty = new GetRepositoryPlainArgs();

    /**
     * The name of the ECR Repository.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the ECR Repository.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The registry ID where the repository was created.
     * 
     */
    @Import(name="registryId")
    private @Nullable String registryId;

    /**
     * @return The registry ID where the repository was created.
     * 
     */
    public Optional<String> registryId() {
        return Optional.ofNullable(this.registryId);
    }

    /**
     * A map of tags assigned to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags assigned to the resource.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetRepositoryPlainArgs() {}

    private GetRepositoryPlainArgs(GetRepositoryPlainArgs $) {
        this.name = $.name;
        this.registryId = $.registryId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryPlainArgs $;

        public Builder() {
            $ = new GetRepositoryPlainArgs();
        }

        public Builder(GetRepositoryPlainArgs defaults) {
            $ = new GetRepositoryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the ECR Repository.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param registryId The registry ID where the repository was created.
         * 
         * @return builder
         * 
         */
        public Builder registryId(@Nullable String registryId) {
            $.registryId = registryId;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetRepositoryPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}