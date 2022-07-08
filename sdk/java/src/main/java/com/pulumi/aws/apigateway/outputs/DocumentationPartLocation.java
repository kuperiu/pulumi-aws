// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DocumentationPartLocation {
    /**
     * @return The HTTP verb of a method. The default value is `*` for any method.
     * 
     */
    private final @Nullable String method;
    /**
     * @return The name of the targeted API entity.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The URL path of the target. The default value is `/` for the root resource.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The HTTP status code of a response. The default value is `*` for any status code.
     * 
     */
    private final @Nullable String statusCode;
    /**
     * @return The type of API entity to which the documentation content appliesE.g., `API`, `METHOD` or `REQUEST_BODY`
     * 
     */
    private final String type;

    @CustomType.Constructor
    private DocumentationPartLocation(
        @CustomType.Parameter("method") @Nullable String method,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("statusCode") @Nullable String statusCode,
        @CustomType.Parameter("type") String type) {
        this.method = method;
        this.name = name;
        this.path = path;
        this.statusCode = statusCode;
        this.type = type;
    }

    /**
     * @return The HTTP verb of a method. The default value is `*` for any method.
     * 
     */
    public Optional<String> method() {
        return Optional.ofNullable(this.method);
    }
    /**
     * @return The name of the targeted API entity.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The URL path of the target. The default value is `/` for the root resource.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The HTTP status code of a response. The default value is `*` for any status code.
     * 
     */
    public Optional<String> statusCode() {
        return Optional.ofNullable(this.statusCode);
    }
    /**
     * @return The type of API entity to which the documentation content appliesE.g., `API`, `METHOD` or `REQUEST_BODY`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationPartLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String method;
        private @Nullable String name;
        private @Nullable String path;
        private @Nullable String statusCode;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationPartLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.statusCode = defaults.statusCode;
    	      this.type = defaults.type;
        }

        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder statusCode(@Nullable String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public DocumentationPartLocation build() {
            return new DocumentationPartLocation(method, name, path, statusCode, type);
        }
    }
}