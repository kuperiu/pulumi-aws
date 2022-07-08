// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAssociationState Empty = new NetworkAssociationState();

    /**
     * The unique ID of the target network association.
     * 
     */
    @Import(name="associationId")
    private @Nullable Output<String> associationId;

    /**
     * @return The unique ID of the target network association.
     * 
     */
    public Optional<Output<String>> associationId() {
        return Optional.ofNullable(this.associationId);
    }

    /**
     * The ID of the Client VPN endpoint.
     * 
     */
    @Import(name="clientVpnEndpointId")
    private @Nullable Output<String> clientVpnEndpointId;

    /**
     * @return The ID of the Client VPN endpoint.
     * 
     */
    public Optional<Output<String>> clientVpnEndpointId() {
        return Optional.ofNullable(this.clientVpnEndpointId);
    }

    /**
     * A list of up to five custom security groups to apply to the target network. If not specified, the VPC&#39;s default security group is assigned.
     * 
     * @deprecated
     * Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
     * 
     */
    @Deprecated /* Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead. */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return A list of up to five custom security groups to apply to the target network. If not specified, the VPC&#39;s default security group is assigned.
     * 
     * @deprecated
     * Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
     * 
     */
    @Deprecated /* Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead. */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * **Deprecated** The current state of the target network association.
     * 
     * @deprecated
     * This attribute has been deprecated.
     * 
     */
    @Deprecated /* This attribute has been deprecated. */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return **Deprecated** The current state of the target network association.
     * 
     * @deprecated
     * This attribute has been deprecated.
     * 
     */
    @Deprecated /* This attribute has been deprecated. */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The ID of the VPC in which the target subnet is located.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the VPC in which the target subnet is located.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private NetworkAssociationState() {}

    private NetworkAssociationState(NetworkAssociationState $) {
        this.associationId = $.associationId;
        this.clientVpnEndpointId = $.clientVpnEndpointId;
        this.securityGroups = $.securityGroups;
        this.status = $.status;
        this.subnetId = $.subnetId;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAssociationState $;

        public Builder() {
            $ = new NetworkAssociationState();
        }

        public Builder(NetworkAssociationState defaults) {
            $ = new NetworkAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param associationId The unique ID of the target network association.
         * 
         * @return builder
         * 
         */
        public Builder associationId(@Nullable Output<String> associationId) {
            $.associationId = associationId;
            return this;
        }

        /**
         * @param associationId The unique ID of the target network association.
         * 
         * @return builder
         * 
         */
        public Builder associationId(String associationId) {
            return associationId(Output.of(associationId));
        }

        /**
         * @param clientVpnEndpointId The ID of the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder clientVpnEndpointId(@Nullable Output<String> clientVpnEndpointId) {
            $.clientVpnEndpointId = clientVpnEndpointId;
            return this;
        }

        /**
         * @param clientVpnEndpointId The ID of the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder clientVpnEndpointId(String clientVpnEndpointId) {
            return clientVpnEndpointId(Output.of(clientVpnEndpointId));
        }

        /**
         * @param securityGroups A list of up to five custom security groups to apply to the target network. If not specified, the VPC&#39;s default security group is assigned.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
         * 
         */
        @Deprecated /* Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead. */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups A list of up to five custom security groups to apply to the target network. If not specified, the VPC&#39;s default security group is assigned.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
         * 
         */
        @Deprecated /* Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead. */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups A list of up to five custom security groups to apply to the target network. If not specified, the VPC&#39;s default security group is assigned.
         * 
         * @return builder
         * 
         * @deprecated
         * Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead.
         * 
         */
        @Deprecated /* Use the `security_group_ids` attribute of the `aws_ec2_client_vpn_endpoint` resource instead. */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param status **Deprecated** The current state of the target network association.
         * 
         * @return builder
         * 
         * @deprecated
         * This attribute has been deprecated.
         * 
         */
        @Deprecated /* This attribute has been deprecated. */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status **Deprecated** The current state of the target network association.
         * 
         * @return builder
         * 
         * @deprecated
         * This attribute has been deprecated.
         * 
         */
        @Deprecated /* This attribute has been deprecated. */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param subnetId The ID of the subnet to associate with the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the subnet to associate with the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param vpcId The ID of the VPC in which the target subnet is located.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC in which the target subnet is located.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public NetworkAssociationState build() {
            return $;
        }
    }

}