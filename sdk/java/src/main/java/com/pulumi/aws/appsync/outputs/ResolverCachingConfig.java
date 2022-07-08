// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResolverCachingConfig {
    /**
     * @return The list of caching key.
     * 
     */
    private final @Nullable List<String> cachingKeys;
    /**
     * @return The TTL in seconds.
     * 
     */
    private final @Nullable Integer ttl;

    @CustomType.Constructor
    private ResolverCachingConfig(
        @CustomType.Parameter("cachingKeys") @Nullable List<String> cachingKeys,
        @CustomType.Parameter("ttl") @Nullable Integer ttl) {
        this.cachingKeys = cachingKeys;
        this.ttl = ttl;
    }

    /**
     * @return The list of caching key.
     * 
     */
    public List<String> cachingKeys() {
        return this.cachingKeys == null ? List.of() : this.cachingKeys;
    }
    /**
     * @return The TTL in seconds.
     * 
     */
    public Optional<Integer> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverCachingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> cachingKeys;
        private @Nullable Integer ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverCachingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cachingKeys = defaults.cachingKeys;
    	      this.ttl = defaults.ttl;
        }

        public Builder cachingKeys(@Nullable List<String> cachingKeys) {
            this.cachingKeys = cachingKeys;
            return this;
        }
        public Builder cachingKeys(String... cachingKeys) {
            return cachingKeys(List.of(cachingKeys));
        }
        public Builder ttl(@Nullable Integer ttl) {
            this.ttl = ttl;
            return this;
        }        public ResolverCachingConfig build() {
            return new ResolverCachingConfig(cachingKeys, ttl);
        }
    }
}