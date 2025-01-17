// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// `ec2.InternetGateway` provides details about a specific Internet Gateway.
func LookupInternetGateway(ctx *pulumi.Context, args *LookupInternetGatewayArgs, opts ...pulumi.InvokeOption) (*LookupInternetGatewayResult, error) {
	var rv LookupInternetGatewayResult
	err := ctx.Invoke("aws:ec2/getInternetGateway:getInternetGateway", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInternetGateway.
type LookupInternetGatewayArgs struct {
	// Custom filter block as described below.
	Filters []GetInternetGatewayFilter `pulumi:"filters"`
	// The id of the specific Internet Gateway to retrieve.
	InternetGatewayId *string `pulumi:"internetGatewayId"`
	// A map of tags, each pair of which must exactly match
	// a pair on the desired Internet Gateway.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getInternetGateway.
type LookupInternetGatewayResult struct {
	// The ARN of the Internet Gateway.
	Arn         string                             `pulumi:"arn"`
	Attachments []GetInternetGatewayAttachmentType `pulumi:"attachments"`
	Filters     []GetInternetGatewayFilter         `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id                string `pulumi:"id"`
	InternetGatewayId string `pulumi:"internetGatewayId"`
	// The ID of the AWS account that owns the internet gateway.
	OwnerId string            `pulumi:"ownerId"`
	Tags    map[string]string `pulumi:"tags"`
}

func LookupInternetGatewayOutput(ctx *pulumi.Context, args LookupInternetGatewayOutputArgs, opts ...pulumi.InvokeOption) LookupInternetGatewayResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupInternetGatewayResult, error) {
			args := v.(LookupInternetGatewayArgs)
			r, err := LookupInternetGateway(ctx, &args, opts...)
			var s LookupInternetGatewayResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupInternetGatewayResultOutput)
}

// A collection of arguments for invoking getInternetGateway.
type LookupInternetGatewayOutputArgs struct {
	// Custom filter block as described below.
	Filters GetInternetGatewayFilterArrayInput `pulumi:"filters"`
	// The id of the specific Internet Gateway to retrieve.
	InternetGatewayId pulumi.StringPtrInput `pulumi:"internetGatewayId"`
	// A map of tags, each pair of which must exactly match
	// a pair on the desired Internet Gateway.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupInternetGatewayOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInternetGatewayArgs)(nil)).Elem()
}

// A collection of values returned by getInternetGateway.
type LookupInternetGatewayResultOutput struct{ *pulumi.OutputState }

func (LookupInternetGatewayResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInternetGatewayResult)(nil)).Elem()
}

func (o LookupInternetGatewayResultOutput) ToLookupInternetGatewayResultOutput() LookupInternetGatewayResultOutput {
	return o
}

func (o LookupInternetGatewayResultOutput) ToLookupInternetGatewayResultOutputWithContext(ctx context.Context) LookupInternetGatewayResultOutput {
	return o
}

// The ARN of the Internet Gateway.
func (o LookupInternetGatewayResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInternetGatewayResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o LookupInternetGatewayResultOutput) Attachments() GetInternetGatewayAttachmentTypeArrayOutput {
	return o.ApplyT(func(v LookupInternetGatewayResult) []GetInternetGatewayAttachmentType { return v.Attachments }).(GetInternetGatewayAttachmentTypeArrayOutput)
}

func (o LookupInternetGatewayResultOutput) Filters() GetInternetGatewayFilterArrayOutput {
	return o.ApplyT(func(v LookupInternetGatewayResult) []GetInternetGatewayFilter { return v.Filters }).(GetInternetGatewayFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupInternetGatewayResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInternetGatewayResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupInternetGatewayResultOutput) InternetGatewayId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInternetGatewayResult) string { return v.InternetGatewayId }).(pulumi.StringOutput)
}

// The ID of the AWS account that owns the internet gateway.
func (o LookupInternetGatewayResultOutput) OwnerId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInternetGatewayResult) string { return v.OwnerId }).(pulumi.StringOutput)
}

func (o LookupInternetGatewayResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupInternetGatewayResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInternetGatewayResultOutput{})
}
