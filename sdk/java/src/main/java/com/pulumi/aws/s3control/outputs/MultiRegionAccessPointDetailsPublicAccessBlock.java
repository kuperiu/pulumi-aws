// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MultiRegionAccessPointDetailsPublicAccessBlock {
    /**
     * @return Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     * * PUT Object calls fail if the request includes a public ACL.
     * * PUT Bucket calls fail if the request includes a public ACL.
     * 
     */
    private final @Nullable Boolean blockPublicAcls;
    /**
     * @return Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    private final @Nullable Boolean blockPublicPolicy;
    /**
     * @return Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn&#39;t prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore all public ACLs on buckets in this account and any objects that they contain.
     * 
     */
    private final @Nullable Boolean ignorePublicAcls;
    /**
     * @return Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access buckets with public policies.
     * 
     */
    private final @Nullable Boolean restrictPublicBuckets;

    @CustomType.Constructor
    private MultiRegionAccessPointDetailsPublicAccessBlock(
        @CustomType.Parameter("blockPublicAcls") @Nullable Boolean blockPublicAcls,
        @CustomType.Parameter("blockPublicPolicy") @Nullable Boolean blockPublicPolicy,
        @CustomType.Parameter("ignorePublicAcls") @Nullable Boolean ignorePublicAcls,
        @CustomType.Parameter("restrictPublicBuckets") @Nullable Boolean restrictPublicBuckets) {
        this.blockPublicAcls = blockPublicAcls;
        this.blockPublicPolicy = blockPublicPolicy;
        this.ignorePublicAcls = ignorePublicAcls;
        this.restrictPublicBuckets = restrictPublicBuckets;
    }

    /**
     * @return Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
     * * PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.
     * * PUT Object calls fail if the request includes a public ACL.
     * * PUT Bucket calls fail if the request includes a public ACL.
     * 
     */
    public Optional<Boolean> blockPublicAcls() {
        return Optional.ofNullable(this.blockPublicAcls);
    }
    /**
     * @return Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
     * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
     * 
     */
    public Optional<Boolean> blockPublicPolicy() {
        return Optional.ofNullable(this.blockPublicPolicy);
    }
    /**
     * @return Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `true`. Enabling this setting does not affect the persistence of any existing ACLs and doesn&#39;t prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
     * * Ignore all public ACLs on buckets in this account and any objects that they contain.
     * 
     */
    public Optional<Boolean> ignorePublicAcls() {
        return Optional.ofNullable(this.ignorePublicAcls);
    }
    /**
     * @return Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `true`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
     * * Only the bucket owner and AWS Services can access buckets with public policies.
     * 
     */
    public Optional<Boolean> restrictPublicBuckets() {
        return Optional.ofNullable(this.restrictPublicBuckets);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointDetailsPublicAccessBlock defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean blockPublicAcls;
        private @Nullable Boolean blockPublicPolicy;
        private @Nullable Boolean ignorePublicAcls;
        private @Nullable Boolean restrictPublicBuckets;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointDetailsPublicAccessBlock defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blockPublicAcls = defaults.blockPublicAcls;
    	      this.blockPublicPolicy = defaults.blockPublicPolicy;
    	      this.ignorePublicAcls = defaults.ignorePublicAcls;
    	      this.restrictPublicBuckets = defaults.restrictPublicBuckets;
        }

        public Builder blockPublicAcls(@Nullable Boolean blockPublicAcls) {
            this.blockPublicAcls = blockPublicAcls;
            return this;
        }
        public Builder blockPublicPolicy(@Nullable Boolean blockPublicPolicy) {
            this.blockPublicPolicy = blockPublicPolicy;
            return this;
        }
        public Builder ignorePublicAcls(@Nullable Boolean ignorePublicAcls) {
            this.ignorePublicAcls = ignorePublicAcls;
            return this;
        }
        public Builder restrictPublicBuckets(@Nullable Boolean restrictPublicBuckets) {
            this.restrictPublicBuckets = restrictPublicBuckets;
            return this;
        }        public MultiRegionAccessPointDetailsPublicAccessBlock build() {
            return new MultiRegionAccessPointDetailsPublicAccessBlock(blockPublicAcls, blockPublicPolicy, ignorePublicAcls, restrictPublicBuckets);
        }
    }
}