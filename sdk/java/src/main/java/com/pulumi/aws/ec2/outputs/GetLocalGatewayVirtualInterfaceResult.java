// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetLocalGatewayVirtualInterfaceResult {
    private @Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters;
    private String id;
    /**
     * @return Local address.
     * 
     */
    private String localAddress;
    /**
     * @return Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the EC2 Local Gateway.
     * 
     */
    private Integer localBgpAsn;
    /**
     * @return Identifier of the EC2 Local Gateway.
     * 
     */
    private String localGatewayId;
    private List<String> localGatewayVirtualInterfaceIds;
    /**
     * @return Peer address.
     * 
     */
    private String peerAddress;
    /**
     * @return Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the peer.
     * 
     */
    private Integer peerBgpAsn;
    private Map<String,String> tags;
    /**
     * @return Virtual Local Area Network.
     * 
     */
    private Integer vlan;

    private GetLocalGatewayVirtualInterfaceResult() {}
    public List<GetLocalGatewayVirtualInterfaceFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Local address.
     * 
     */
    public String localAddress() {
        return this.localAddress;
    }
    /**
     * @return Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the EC2 Local Gateway.
     * 
     */
    public Integer localBgpAsn() {
        return this.localBgpAsn;
    }
    /**
     * @return Identifier of the EC2 Local Gateway.
     * 
     */
    public String localGatewayId() {
        return this.localGatewayId;
    }
    public List<String> localGatewayVirtualInterfaceIds() {
        return this.localGatewayVirtualInterfaceIds;
    }
    /**
     * @return Peer address.
     * 
     */
    public String peerAddress() {
        return this.peerAddress;
    }
    /**
     * @return Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the peer.
     * 
     */
    public Integer peerBgpAsn() {
        return this.peerBgpAsn;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return Virtual Local Area Network.
     * 
     */
    public Integer vlan() {
        return this.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayVirtualInterfaceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters;
        private String id;
        private String localAddress;
        private Integer localBgpAsn;
        private String localGatewayId;
        private List<String> localGatewayVirtualInterfaceIds;
        private String peerAddress;
        private Integer peerBgpAsn;
        private Map<String,String> tags;
        private Integer vlan;
        public Builder() {}
        public Builder(GetLocalGatewayVirtualInterfaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.localAddress = defaults.localAddress;
    	      this.localBgpAsn = defaults.localBgpAsn;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.localGatewayVirtualInterfaceIds = defaults.localGatewayVirtualInterfaceIds;
    	      this.peerAddress = defaults.peerAddress;
    	      this.peerBgpAsn = defaults.peerBgpAsn;
    	      this.tags = defaults.tags;
    	      this.vlan = defaults.vlan;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetLocalGatewayVirtualInterfaceFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder localAddress(String localAddress) {
            this.localAddress = Objects.requireNonNull(localAddress);
            return this;
        }
        @CustomType.Setter
        public Builder localBgpAsn(Integer localBgpAsn) {
            this.localBgpAsn = Objects.requireNonNull(localBgpAsn);
            return this;
        }
        @CustomType.Setter
        public Builder localGatewayId(String localGatewayId) {
            this.localGatewayId = Objects.requireNonNull(localGatewayId);
            return this;
        }
        @CustomType.Setter
        public Builder localGatewayVirtualInterfaceIds(List<String> localGatewayVirtualInterfaceIds) {
            this.localGatewayVirtualInterfaceIds = Objects.requireNonNull(localGatewayVirtualInterfaceIds);
            return this;
        }
        public Builder localGatewayVirtualInterfaceIds(String... localGatewayVirtualInterfaceIds) {
            return localGatewayVirtualInterfaceIds(List.of(localGatewayVirtualInterfaceIds));
        }
        @CustomType.Setter
        public Builder peerAddress(String peerAddress) {
            this.peerAddress = Objects.requireNonNull(peerAddress);
            return this;
        }
        @CustomType.Setter
        public Builder peerBgpAsn(Integer peerBgpAsn) {
            this.peerBgpAsn = Objects.requireNonNull(peerBgpAsn);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder vlan(Integer vlan) {
            this.vlan = Objects.requireNonNull(vlan);
            return this;
        }
        public GetLocalGatewayVirtualInterfaceResult build() {
            final var o = new GetLocalGatewayVirtualInterfaceResult();
            o.filters = filters;
            o.id = id;
            o.localAddress = localAddress;
            o.localBgpAsn = localBgpAsn;
            o.localGatewayId = localGatewayId;
            o.localGatewayVirtualInterfaceIds = localGatewayVirtualInterfaceIds;
            o.peerAddress = peerAddress;
            o.peerBgpAsn = peerBgpAsn;
            o.tags = tags;
            o.vlan = vlan;
            return o;
        }
    }
}
