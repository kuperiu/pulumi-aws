// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2;

import com.pulumi.aws.wafv2.inputs.RegexPatternSetRegularExpressionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegexPatternSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegexPatternSetArgs Empty = new RegexPatternSetArgs();

    /**
     * A friendly description of the regular expression pattern set.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A friendly description of the regular expression pattern set.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A friendly name of the regular expression pattern set.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A friendly name of the regular expression pattern set.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
     * 
     */
    @Import(name="regularExpressions")
    private @Nullable Output<List<RegexPatternSetRegularExpressionArgs>> regularExpressions;

    /**
     * @return One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
     * 
     */
    public Optional<Output<List<RegexPatternSetRegularExpressionArgs>>> regularExpressions() {
        return Optional.ofNullable(this.regularExpressions);
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     * An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private RegexPatternSetArgs() {}

    private RegexPatternSetArgs(RegexPatternSetArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.regularExpressions = $.regularExpressions;
        this.scope = $.scope;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegexPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegexPatternSetArgs $;

        public Builder() {
            $ = new RegexPatternSetArgs();
        }

        public Builder(RegexPatternSetArgs defaults) {
            $ = new RegexPatternSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A friendly description of the regular expression pattern set.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A friendly description of the regular expression pattern set.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name A friendly name of the regular expression pattern set.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A friendly name of the regular expression pattern set.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param regularExpressions One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
         * 
         * @return builder
         * 
         */
        public Builder regularExpressions(@Nullable Output<List<RegexPatternSetRegularExpressionArgs>> regularExpressions) {
            $.regularExpressions = regularExpressions;
            return this;
        }

        /**
         * @param regularExpressions One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
         * 
         * @return builder
         * 
         */
        public Builder regularExpressions(List<RegexPatternSetRegularExpressionArgs> regularExpressions) {
            return regularExpressions(Output.of(regularExpressions));
        }

        /**
         * @param regularExpressions One or more blocks of regular expression patterns that you want AWS WAF to search for, such as `B[a@]dB[o0]t`. See Regular Expression below for details.
         * 
         * @return builder
         * 
         */
        public Builder regularExpressions(RegexPatternSetRegularExpressionArgs... regularExpressions) {
            return regularExpressions(List.of(regularExpressions));
        }

        /**
         * @param scope Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param tags An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public RegexPatternSetArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}