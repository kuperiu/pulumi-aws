// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2transitgateway

import (
	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/go/pulumi"
)

// Manages an EC2 Transit Gateway VPC Attachment. For examples of custom route table association and propagation, see the EC2 Transit Gateway Networking Examples Guide.
type VpcAttachment struct {
	s *pulumi.ResourceState
}

// NewVpcAttachment registers a new resource with the given unique name, arguments, and options.
func NewVpcAttachment(ctx *pulumi.Context,
	name string, args *VpcAttachmentArgs, opts ...pulumi.ResourceOpt) (*VpcAttachment, error) {
	if args == nil || args.SubnetIds == nil {
		return nil, errors.New("missing required argument 'SubnetIds'")
	}
	if args == nil || args.TransitGatewayId == nil {
		return nil, errors.New("missing required argument 'TransitGatewayId'")
	}
	if args == nil || args.VpcId == nil {
		return nil, errors.New("missing required argument 'VpcId'")
	}
	inputs := make(map[string]interface{})
	if args == nil {
		inputs["dnsSupport"] = nil
		inputs["ipv6Support"] = nil
		inputs["subnetIds"] = nil
		inputs["tags"] = nil
		inputs["transitGatewayDefaultRouteTableAssociation"] = nil
		inputs["transitGatewayDefaultRouteTablePropagation"] = nil
		inputs["transitGatewayId"] = nil
		inputs["vpcId"] = nil
	} else {
		inputs["dnsSupport"] = args.DnsSupport
		inputs["ipv6Support"] = args.Ipv6Support
		inputs["subnetIds"] = args.SubnetIds
		inputs["tags"] = args.Tags
		inputs["transitGatewayDefaultRouteTableAssociation"] = args.TransitGatewayDefaultRouteTableAssociation
		inputs["transitGatewayDefaultRouteTablePropagation"] = args.TransitGatewayDefaultRouteTablePropagation
		inputs["transitGatewayId"] = args.TransitGatewayId
		inputs["vpcId"] = args.VpcId
	}
	inputs["vpcOwnerId"] = nil
	s, err := ctx.RegisterResource("aws:ec2transitgateway/vpcAttachment:VpcAttachment", name, true, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &VpcAttachment{s: s}, nil
}

// GetVpcAttachment gets an existing VpcAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVpcAttachment(ctx *pulumi.Context,
	name string, id pulumi.ID, state *VpcAttachmentState, opts ...pulumi.ResourceOpt) (*VpcAttachment, error) {
	inputs := make(map[string]interface{})
	if state != nil {
		inputs["dnsSupport"] = state.DnsSupport
		inputs["ipv6Support"] = state.Ipv6Support
		inputs["subnetIds"] = state.SubnetIds
		inputs["tags"] = state.Tags
		inputs["transitGatewayDefaultRouteTableAssociation"] = state.TransitGatewayDefaultRouteTableAssociation
		inputs["transitGatewayDefaultRouteTablePropagation"] = state.TransitGatewayDefaultRouteTablePropagation
		inputs["transitGatewayId"] = state.TransitGatewayId
		inputs["vpcId"] = state.VpcId
		inputs["vpcOwnerId"] = state.VpcOwnerId
	}
	s, err := ctx.ReadResource("aws:ec2transitgateway/vpcAttachment:VpcAttachment", name, id, inputs, opts...)
	if err != nil {
		return nil, err
	}
	return &VpcAttachment{s: s}, nil
}

// URN is this resource's unique name assigned by Pulumi.
func (r *VpcAttachment) URN() *pulumi.URNOutput {
	return r.s.URN()
}

// ID is this resource's unique identifier assigned by its provider.
func (r *VpcAttachment) ID() *pulumi.IDOutput {
	return r.s.ID()
}

// Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
func (r *VpcAttachment) DnsSupport() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["dnsSupport"])
}

// Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
func (r *VpcAttachment) Ipv6Support() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["ipv6Support"])
}

// Identifiers of EC2 Subnets.
func (r *VpcAttachment) SubnetIds() *pulumi.ArrayOutput {
	return (*pulumi.ArrayOutput)(r.s.State["subnetIds"])
}

// Key-value tags for the EC2 Transit Gateway VPC Attachment.
func (r *VpcAttachment) Tags() *pulumi.MapOutput {
	return (*pulumi.MapOutput)(r.s.State["tags"])
}

// Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
func (r *VpcAttachment) TransitGatewayDefaultRouteTableAssociation() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["transitGatewayDefaultRouteTableAssociation"])
}

// Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
func (r *VpcAttachment) TransitGatewayDefaultRouteTablePropagation() *pulumi.BoolOutput {
	return (*pulumi.BoolOutput)(r.s.State["transitGatewayDefaultRouteTablePropagation"])
}

// Identifier of EC2 Transit Gateway.
func (r *VpcAttachment) TransitGatewayId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["transitGatewayId"])
}

// Identifier of EC2 VPC.
func (r *VpcAttachment) VpcId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["vpcId"])
}

// Identifier of the AWS account that owns the EC2 VPC.
func (r *VpcAttachment) VpcOwnerId() *pulumi.StringOutput {
	return (*pulumi.StringOutput)(r.s.State["vpcOwnerId"])
}

// Input properties used for looking up and filtering VpcAttachment resources.
type VpcAttachmentState struct {
	// Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
	DnsSupport interface{}
	// Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
	Ipv6Support interface{}
	// Identifiers of EC2 Subnets.
	SubnetIds interface{}
	// Key-value tags for the EC2 Transit Gateway VPC Attachment.
	Tags interface{}
	// Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
	TransitGatewayDefaultRouteTableAssociation interface{}
	// Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
	TransitGatewayDefaultRouteTablePropagation interface{}
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId interface{}
	// Identifier of EC2 VPC.
	VpcId interface{}
	// Identifier of the AWS account that owns the EC2 VPC.
	VpcOwnerId interface{}
}

// The set of arguments for constructing a VpcAttachment resource.
type VpcAttachmentArgs struct {
	// Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
	DnsSupport interface{}
	// Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
	Ipv6Support interface{}
	// Identifiers of EC2 Subnets.
	SubnetIds interface{}
	// Key-value tags for the EC2 Transit Gateway VPC Attachment.
	Tags interface{}
	// Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
	TransitGatewayDefaultRouteTableAssociation interface{}
	// Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
	TransitGatewayDefaultRouteTablePropagation interface{}
	// Identifier of EC2 Transit Gateway.
	TransitGatewayId interface{}
	// Identifier of EC2 VPC.
	VpcId interface{}
}