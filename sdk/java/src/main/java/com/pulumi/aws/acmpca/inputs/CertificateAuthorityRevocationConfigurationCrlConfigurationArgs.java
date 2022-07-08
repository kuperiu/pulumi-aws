// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityRevocationConfigurationCrlConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityRevocationConfigurationCrlConfigurationArgs Empty = new CertificateAuthorityRevocationConfigurationCrlConfigurationArgs();

    /**
     * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don&#39;t want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
     * 
     */
    @Import(name="customCname")
    private @Nullable Output<String> customCname;

    /**
     * @return Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don&#39;t want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
     * 
     */
    public Optional<Output<String>> customCname() {
        return Optional.ofNullable(this.customCname);
    }

    /**
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Number of days until a certificate expires. Must be between 1 and 5000.
     * 
     */
    @Import(name="expirationInDays", required=true)
    private Output<Integer> expirationInDays;

    /**
     * @return Number of days until a certificate expires. Must be between 1 and 5000.
     * 
     */
    public Output<Integer> expirationInDays() {
        return this.expirationInDays;
    }

    /**
     * Name of the S3 bucket that contains the CRL. If you do not provide a value for the `custom_cname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
     * 
     */
    @Import(name="s3BucketName")
    private @Nullable Output<String> s3BucketName;

    /**
     * @return Name of the S3 bucket that contains the CRL. If you do not provide a value for the `custom_cname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
     * 
     */
    public Optional<Output<String>> s3BucketName() {
        return Optional.ofNullable(this.s3BucketName);
    }

    /**
     * Determines whether the CRL will be publicly readable or privately held in the CRL Amazon S3 bucket. Defaults to `PUBLIC_READ`.
     * 
     */
    @Import(name="s3ObjectAcl")
    private @Nullable Output<String> s3ObjectAcl;

    /**
     * @return Determines whether the CRL will be publicly readable or privately held in the CRL Amazon S3 bucket. Defaults to `PUBLIC_READ`.
     * 
     */
    public Optional<Output<String>> s3ObjectAcl() {
        return Optional.ofNullable(this.s3ObjectAcl);
    }

    private CertificateAuthorityRevocationConfigurationCrlConfigurationArgs() {}

    private CertificateAuthorityRevocationConfigurationCrlConfigurationArgs(CertificateAuthorityRevocationConfigurationCrlConfigurationArgs $) {
        this.customCname = $.customCname;
        this.enabled = $.enabled;
        this.expirationInDays = $.expirationInDays;
        this.s3BucketName = $.s3BucketName;
        this.s3ObjectAcl = $.s3ObjectAcl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityRevocationConfigurationCrlConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityRevocationConfigurationCrlConfigurationArgs $;

        public Builder() {
            $ = new CertificateAuthorityRevocationConfigurationCrlConfigurationArgs();
        }

        public Builder(CertificateAuthorityRevocationConfigurationCrlConfigurationArgs defaults) {
            $ = new CertificateAuthorityRevocationConfigurationCrlConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customCname Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don&#39;t want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder customCname(@Nullable Output<String> customCname) {
            $.customCname = customCname;
            return this;
        }

        /**
         * @param customCname Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don&#39;t want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder customCname(String customCname) {
            return customCname(Output.of(customCname));
        }

        /**
         * @param enabled Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param expirationInDays Number of days until a certificate expires. Must be between 1 and 5000.
         * 
         * @return builder
         * 
         */
        public Builder expirationInDays(Output<Integer> expirationInDays) {
            $.expirationInDays = expirationInDays;
            return this;
        }

        /**
         * @param expirationInDays Number of days until a certificate expires. Must be between 1 and 5000.
         * 
         * @return builder
         * 
         */
        public Builder expirationInDays(Integer expirationInDays) {
            return expirationInDays(Output.of(expirationInDays));
        }

        /**
         * @param s3BucketName Name of the S3 bucket that contains the CRL. If you do not provide a value for the `custom_cname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(@Nullable Output<String> s3BucketName) {
            $.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * @param s3BucketName Name of the S3 bucket that contains the CRL. If you do not provide a value for the `custom_cname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(String s3BucketName) {
            return s3BucketName(Output.of(s3BucketName));
        }

        /**
         * @param s3ObjectAcl Determines whether the CRL will be publicly readable or privately held in the CRL Amazon S3 bucket. Defaults to `PUBLIC_READ`.
         * 
         * @return builder
         * 
         */
        public Builder s3ObjectAcl(@Nullable Output<String> s3ObjectAcl) {
            $.s3ObjectAcl = s3ObjectAcl;
            return this;
        }

        /**
         * @param s3ObjectAcl Determines whether the CRL will be publicly readable or privately held in the CRL Amazon S3 bucket. Defaults to `PUBLIC_READ`.
         * 
         * @return builder
         * 
         */
        public Builder s3ObjectAcl(String s3ObjectAcl) {
            return s3ObjectAcl(Output.of(s3ObjectAcl));
        }

        public CertificateAuthorityRevocationConfigurationCrlConfigurationArgs build() {
            $.expirationInDays = Objects.requireNonNull($.expirationInDays, "expected parameter 'expirationInDays' to be non-null");
            return $;
        }
    }

}