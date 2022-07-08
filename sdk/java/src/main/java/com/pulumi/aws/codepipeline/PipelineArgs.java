// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codepipeline;

import com.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreArgs;
import com.pulumi.aws.codepipeline.inputs.PipelineStageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipelineArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * One or more artifact_store blocks. Artifact stores are documented below.
     * 
     */
    @Import(name="artifactStores", required=true)
    private Output<List<PipelineArtifactStoreArgs>> artifactStores;

    /**
     * @return One or more artifact_store blocks. Artifact stores are documented below.
     * 
     */
    public Output<List<PipelineArtifactStoreArgs>> artifactStores() {
        return this.artifactStores;
    }

    /**
     * The name of the pipeline.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the pipeline.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * A stage block. Stages are documented below.
     * 
     */
    @Import(name="stages", required=true)
    private Output<List<PipelineStageArgs>> stages;

    /**
     * @return A stage block. Stages are documented below.
     * 
     */
    public Output<List<PipelineStageArgs>> stages() {
        return this.stages;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PipelineArgs() {}

    private PipelineArgs(PipelineArgs $) {
        this.artifactStores = $.artifactStores;
        this.name = $.name;
        this.roleArn = $.roleArn;
        this.stages = $.stages;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineArgs $;

        public Builder() {
            $ = new PipelineArgs();
        }

        public Builder(PipelineArgs defaults) {
            $ = new PipelineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactStores One or more artifact_store blocks. Artifact stores are documented below.
         * 
         * @return builder
         * 
         */
        public Builder artifactStores(Output<List<PipelineArtifactStoreArgs>> artifactStores) {
            $.artifactStores = artifactStores;
            return this;
        }

        /**
         * @param artifactStores One or more artifact_store blocks. Artifact stores are documented below.
         * 
         * @return builder
         * 
         */
        public Builder artifactStores(List<PipelineArtifactStoreArgs> artifactStores) {
            return artifactStores(Output.of(artifactStores));
        }

        /**
         * @param artifactStores One or more artifact_store blocks. Artifact stores are documented below.
         * 
         * @return builder
         * 
         */
        public Builder artifactStores(PipelineArtifactStoreArgs... artifactStores) {
            return artifactStores(List.of(artifactStores));
        }

        /**
         * @param name The name of the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the pipeline.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param roleArn A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param stages A stage block. Stages are documented below.
         * 
         * @return builder
         * 
         */
        public Builder stages(Output<List<PipelineStageArgs>> stages) {
            $.stages = stages;
            return this;
        }

        /**
         * @param stages A stage block. Stages are documented below.
         * 
         * @return builder
         * 
         */
        public Builder stages(List<PipelineStageArgs> stages) {
            return stages(Output.of(stages));
        }

        /**
         * @param stages A stage block. Stages are documented below.
         * 
         * @return builder
         * 
         */
        public Builder stages(PipelineStageArgs... stages) {
            return stages(List.of(stages));
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PipelineArgs build() {
            $.artifactStores = Objects.requireNonNull($.artifactStores, "expected parameter 'artifactStores' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.stages = Objects.requireNonNull($.stages, "expected parameter 'stages' to be non-null");
            return $;
        }
    }

}