// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.s3.inputs.BucketLifecycleConfigurationV2RuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketLifecycleConfigurationV2Args extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleConfigurationV2Args Empty = new BucketLifecycleConfigurationV2Args();

    /**
     * The name of the source S3 bucket you want Amazon S3 to monitor.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the source S3 bucket you want Amazon S3 to monitor.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     * 
     */
    @Import(name="expectedBucketOwner")
    private @Nullable Output<String> expectedBucketOwner;

    /**
     * @return The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     * 
     */
    public Optional<Output<String>> expectedBucketOwner() {
        return Optional.ofNullable(this.expectedBucketOwner);
    }

    /**
     * List of configuration blocks describing the rules managing the replication documented below.
     * 
     */
    @Import(name="rules", required=true)
    private Output<List<BucketLifecycleConfigurationV2RuleArgs>> rules;

    /**
     * @return List of configuration blocks describing the rules managing the replication documented below.
     * 
     */
    public Output<List<BucketLifecycleConfigurationV2RuleArgs>> rules() {
        return this.rules;
    }

    private BucketLifecycleConfigurationV2Args() {}

    private BucketLifecycleConfigurationV2Args(BucketLifecycleConfigurationV2Args $) {
        this.bucket = $.bucket;
        this.expectedBucketOwner = $.expectedBucketOwner;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleConfigurationV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleConfigurationV2Args $;

        public Builder() {
            $ = new BucketLifecycleConfigurationV2Args();
        }

        public Builder(BucketLifecycleConfigurationV2Args defaults) {
            $ = new BucketLifecycleConfigurationV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the source S3 bucket you want Amazon S3 to monitor.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the source S3 bucket you want Amazon S3 to monitor.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param expectedBucketOwner The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         * 
         * @return builder
         * 
         */
        public Builder expectedBucketOwner(@Nullable Output<String> expectedBucketOwner) {
            $.expectedBucketOwner = expectedBucketOwner;
            return this;
        }

        /**
         * @param expectedBucketOwner The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         * 
         * @return builder
         * 
         */
        public Builder expectedBucketOwner(String expectedBucketOwner) {
            return expectedBucketOwner(Output.of(expectedBucketOwner));
        }

        /**
         * @param rules List of configuration blocks describing the rules managing the replication documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(Output<List<BucketLifecycleConfigurationV2RuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules List of configuration blocks describing the rules managing the replication documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<BucketLifecycleConfigurationV2RuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules List of configuration blocks describing the rules managing the replication documented below.
         * 
         * @return builder
         * 
         */
        public Builder rules(BucketLifecycleConfigurationV2RuleArgs... rules) {
            return rules(List.of(rules));
        }

        public BucketLifecycleConfigurationV2Args build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.rules = Objects.requireNonNull($.rules, "expected parameter 'rules' to be non-null");
            return $;
        }
    }

}