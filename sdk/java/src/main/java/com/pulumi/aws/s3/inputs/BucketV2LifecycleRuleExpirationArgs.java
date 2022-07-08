// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketV2LifecycleRuleExpirationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketV2LifecycleRuleExpirationArgs Empty = new BucketV2LifecycleRuleExpirationArgs();

    /**
     * Specifies the date after which you want the corresponding action to take effect.
     * 
     */
    @Import(name="date")
    private @Nullable Output<String> date;

    /**
     * @return Specifies the date after which you want the corresponding action to take effect.
     * 
     */
    public Optional<Output<String>> date() {
        return Optional.ofNullable(this.date);
    }

    /**
     * Specifies the number of days after object creation when the specific rule action takes effect.
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    /**
     * @return Specifies the number of days after object creation when the specific rule action takes effect.
     * 
     */
    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    /**
     * On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
     * 
     */
    @Import(name="expiredObjectDeleteMarker")
    private @Nullable Output<Boolean> expiredObjectDeleteMarker;

    /**
     * @return On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
     * 
     */
    public Optional<Output<Boolean>> expiredObjectDeleteMarker() {
        return Optional.ofNullable(this.expiredObjectDeleteMarker);
    }

    private BucketV2LifecycleRuleExpirationArgs() {}

    private BucketV2LifecycleRuleExpirationArgs(BucketV2LifecycleRuleExpirationArgs $) {
        this.date = $.date;
        this.days = $.days;
        this.expiredObjectDeleteMarker = $.expiredObjectDeleteMarker;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketV2LifecycleRuleExpirationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketV2LifecycleRuleExpirationArgs $;

        public Builder() {
            $ = new BucketV2LifecycleRuleExpirationArgs();
        }

        public Builder(BucketV2LifecycleRuleExpirationArgs defaults) {
            $ = new BucketV2LifecycleRuleExpirationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param date Specifies the date after which you want the corresponding action to take effect.
         * 
         * @return builder
         * 
         */
        public Builder date(@Nullable Output<String> date) {
            $.date = date;
            return this;
        }

        /**
         * @param date Specifies the date after which you want the corresponding action to take effect.
         * 
         * @return builder
         * 
         */
        public Builder date(String date) {
            return date(Output.of(date));
        }

        /**
         * @param days Specifies the number of days after object creation when the specific rule action takes effect.
         * 
         * @return builder
         * 
         */
        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days Specifies the number of days after object creation when the specific rule action takes effect.
         * 
         * @return builder
         * 
         */
        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        /**
         * @param expiredObjectDeleteMarker On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
         * 
         * @return builder
         * 
         */
        public Builder expiredObjectDeleteMarker(@Nullable Output<Boolean> expiredObjectDeleteMarker) {
            $.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }

        /**
         * @param expiredObjectDeleteMarker On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
         * 
         * @return builder
         * 
         */
        public Builder expiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
            return expiredObjectDeleteMarker(Output.of(expiredObjectDeleteMarker));
        }

        public BucketV2LifecycleRuleExpirationArgs build() {
            return $;
        }
    }

}