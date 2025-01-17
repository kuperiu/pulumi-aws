// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey;
import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasic;
import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustom;
import com.pulumi.aws.appflow.outputs.ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnector {
    /**
     * @return A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * 
     */
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey apiKey;
    /**
     * @return The authentication type that the custom connector uses for authenticating while creating a connector profile. One of: `APIKEY`, `BASIC`, `CUSTOM`, `OAUTH2`.
     * 
     */
    private String authenticationType;
    /**
     * @return The basic credentials that are required for the authentication of the user.
     * 
     */
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasic basic;
    /**
     * @return If the connector uses the custom authentication mechanism, this holds the required credentials.
     * 
     */
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustom custom;
    /**
     * @return The OAuth 2.0 credentials required for the authentication of the user.
     * 
     */
    private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2 oauth2;

    private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnector() {}
    /**
     * @return A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    /**
     * @return The authentication type that the custom connector uses for authenticating while creating a connector profile. One of: `APIKEY`, `BASIC`, `CUSTOM`, `OAUTH2`.
     * 
     */
    public String authenticationType() {
        return this.authenticationType;
    }
    /**
     * @return The basic credentials that are required for the authentication of the user.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasic> basic() {
        return Optional.ofNullable(this.basic);
    }
    /**
     * @return If the connector uses the custom authentication mechanism, this holds the required credentials.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustom> custom() {
        return Optional.ofNullable(this.custom);
    }
    /**
     * @return The OAuth 2.0 credentials required for the authentication of the user.
     * 
     */
    public Optional<ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2> oauth2() {
        return Optional.ofNullable(this.oauth2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey apiKey;
        private String authenticationType;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasic basic;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustom custom;
        private @Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2 oauth2;
        public Builder() {}
        public Builder(ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.authenticationType = defaults.authenticationType;
    	      this.basic = defaults.basic;
    	      this.custom = defaults.custom;
    	      this.oauth2 = defaults.oauth2;
        }

        @CustomType.Setter
        public Builder apiKey(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorApiKey apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        @CustomType.Setter
        public Builder basic(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorBasic basic) {
            this.basic = basic;
            return this;
        }
        @CustomType.Setter
        public Builder custom(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorCustom custom) {
            this.custom = custom;
            return this;
        }
        @CustomType.Setter
        public Builder oauth2(@Nullable ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnectorOauth2 oauth2) {
            this.oauth2 = oauth2;
            return this;
        }
        public ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnector build() {
            final var o = new ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsCustomConnector();
            o.apiKey = apiKey;
            o.authenticationType = authenticationType;
            o.basic = basic;
            o.custom = custom;
            o.oauth2 = oauth2;
            return o;
        }
    }
}
