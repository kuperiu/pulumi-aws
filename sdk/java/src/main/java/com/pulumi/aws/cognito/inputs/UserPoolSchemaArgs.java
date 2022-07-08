// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.inputs;

import com.pulumi.aws.cognito.inputs.UserPoolSchemaNumberAttributeConstraintsArgs;
import com.pulumi.aws.cognito.inputs.UserPoolSchemaStringAttributeConstraintsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserPoolSchemaArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserPoolSchemaArgs Empty = new UserPoolSchemaArgs();

    /**
     * Attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
     * 
     */
    @Import(name="attributeDataType", required=true)
    private Output<String> attributeDataType;

    /**
     * @return Attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
     * 
     */
    public Output<String> attributeDataType() {
        return this.attributeDataType;
    }

    /**
     * Whether the attribute type is developer only.
     * 
     */
    @Import(name="developerOnlyAttribute")
    private @Nullable Output<Boolean> developerOnlyAttribute;

    /**
     * @return Whether the attribute type is developer only.
     * 
     */
    public Optional<Output<Boolean>> developerOnlyAttribute() {
        return Optional.ofNullable(this.developerOnlyAttribute);
    }

    /**
     * Whether the attribute can be changed once it has been created.
     * 
     */
    @Import(name="mutable")
    private @Nullable Output<Boolean> mutable;

    /**
     * @return Whether the attribute can be changed once it has been created.
     * 
     */
    public Optional<Output<Boolean>> mutable() {
        return Optional.ofNullable(this.mutable);
    }

    /**
     * Name of the attribute.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the attribute.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Configuration block for the constraints for an attribute of the number type. Detailed below.
     * 
     */
    @Import(name="numberAttributeConstraints")
    private @Nullable Output<UserPoolSchemaNumberAttributeConstraintsArgs> numberAttributeConstraints;

    /**
     * @return Configuration block for the constraints for an attribute of the number type. Detailed below.
     * 
     */
    public Optional<Output<UserPoolSchemaNumberAttributeConstraintsArgs>> numberAttributeConstraints() {
        return Optional.ofNullable(this.numberAttributeConstraints);
    }

    /**
     * Whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
     * 
     */
    @Import(name="required")
    private @Nullable Output<Boolean> required;

    /**
     * @return Whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
     * 
     */
    public Optional<Output<Boolean>> required() {
        return Optional.ofNullable(this.required);
    }

    /**
     * Constraints for an attribute of the string type. Detailed below.
     * 
     */
    @Import(name="stringAttributeConstraints")
    private @Nullable Output<UserPoolSchemaStringAttributeConstraintsArgs> stringAttributeConstraints;

    /**
     * @return Constraints for an attribute of the string type. Detailed below.
     * 
     */
    public Optional<Output<UserPoolSchemaStringAttributeConstraintsArgs>> stringAttributeConstraints() {
        return Optional.ofNullable(this.stringAttributeConstraints);
    }

    private UserPoolSchemaArgs() {}

    private UserPoolSchemaArgs(UserPoolSchemaArgs $) {
        this.attributeDataType = $.attributeDataType;
        this.developerOnlyAttribute = $.developerOnlyAttribute;
        this.mutable = $.mutable;
        this.name = $.name;
        this.numberAttributeConstraints = $.numberAttributeConstraints;
        this.required = $.required;
        this.stringAttributeConstraints = $.stringAttributeConstraints;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserPoolSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPoolSchemaArgs $;

        public Builder() {
            $ = new UserPoolSchemaArgs();
        }

        public Builder(UserPoolSchemaArgs defaults) {
            $ = new UserPoolSchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attributeDataType Attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
         * 
         * @return builder
         * 
         */
        public Builder attributeDataType(Output<String> attributeDataType) {
            $.attributeDataType = attributeDataType;
            return this;
        }

        /**
         * @param attributeDataType Attribute data type. Must be one of `Boolean`, `Number`, `String`, `DateTime`.
         * 
         * @return builder
         * 
         */
        public Builder attributeDataType(String attributeDataType) {
            return attributeDataType(Output.of(attributeDataType));
        }

        /**
         * @param developerOnlyAttribute Whether the attribute type is developer only.
         * 
         * @return builder
         * 
         */
        public Builder developerOnlyAttribute(@Nullable Output<Boolean> developerOnlyAttribute) {
            $.developerOnlyAttribute = developerOnlyAttribute;
            return this;
        }

        /**
         * @param developerOnlyAttribute Whether the attribute type is developer only.
         * 
         * @return builder
         * 
         */
        public Builder developerOnlyAttribute(Boolean developerOnlyAttribute) {
            return developerOnlyAttribute(Output.of(developerOnlyAttribute));
        }

        /**
         * @param mutable Whether the attribute can be changed once it has been created.
         * 
         * @return builder
         * 
         */
        public Builder mutable(@Nullable Output<Boolean> mutable) {
            $.mutable = mutable;
            return this;
        }

        /**
         * @param mutable Whether the attribute can be changed once it has been created.
         * 
         * @return builder
         * 
         */
        public Builder mutable(Boolean mutable) {
            return mutable(Output.of(mutable));
        }

        /**
         * @param name Name of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the attribute.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param numberAttributeConstraints Configuration block for the constraints for an attribute of the number type. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder numberAttributeConstraints(@Nullable Output<UserPoolSchemaNumberAttributeConstraintsArgs> numberAttributeConstraints) {
            $.numberAttributeConstraints = numberAttributeConstraints;
            return this;
        }

        /**
         * @param numberAttributeConstraints Configuration block for the constraints for an attribute of the number type. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder numberAttributeConstraints(UserPoolSchemaNumberAttributeConstraintsArgs numberAttributeConstraints) {
            return numberAttributeConstraints(Output.of(numberAttributeConstraints));
        }

        /**
         * @param required Whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
         * 
         * @return builder
         * 
         */
        public Builder required(@Nullable Output<Boolean> required) {
            $.required = required;
            return this;
        }

        /**
         * @param required Whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
         * 
         * @return builder
         * 
         */
        public Builder required(Boolean required) {
            return required(Output.of(required));
        }

        /**
         * @param stringAttributeConstraints Constraints for an attribute of the string type. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder stringAttributeConstraints(@Nullable Output<UserPoolSchemaStringAttributeConstraintsArgs> stringAttributeConstraints) {
            $.stringAttributeConstraints = stringAttributeConstraints;
            return this;
        }

        /**
         * @param stringAttributeConstraints Constraints for an attribute of the string type. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder stringAttributeConstraints(UserPoolSchemaStringAttributeConstraintsArgs stringAttributeConstraints) {
            return stringAttributeConstraints(Output.of(stringAttributeConstraints));
        }

        public UserPoolSchemaArgs build() {
            $.attributeDataType = Objects.requireNonNull($.attributeDataType, "expected parameter 'attributeDataType' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}