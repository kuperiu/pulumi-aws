// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs Empty = new ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs();

    /**
     * The object property to use in the condition.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return The object property to use in the condition.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs() {}

    private ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs $;

        public Builder() {
            $ = new ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs();
        }

        public Builder(ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs defaults) {
            $ = new ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The object property to use in the condition.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The object property to use in the condition.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClassificationJobS3JobDefinitionScopingIncludesAndTagScopeTermTagValueArgs build() {
            return $;
        }
    }

}