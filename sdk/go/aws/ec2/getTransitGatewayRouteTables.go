// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package ec2

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides information for multiple EC2 Transit Gateway Route Tables, such as their identifiers.
//
// ## Example Usage
//
// The following shows outputing all Transit Gateway Route Table Ids.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v3/go/aws/ec2"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := ec2.GetTransitGatewayRouteTables(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		ctx.Export("example", data.Aws_ec2_transit_gateway_route_table.Example.Ids)
// 		return nil
// 	})
// }
// ```
func GetTransitGatewayRouteTables(ctx *pulumi.Context, args *GetTransitGatewayRouteTablesArgs, opts ...pulumi.InvokeOption) (*GetTransitGatewayRouteTablesResult, error) {
	var rv GetTransitGatewayRouteTablesResult
	err := ctx.Invoke("aws:ec2/getTransitGatewayRouteTables:getTransitGatewayRouteTables", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTransitGatewayRouteTables.
type GetTransitGatewayRouteTablesArgs struct {
	// Custom filter block as described below.
	Filters []GetTransitGatewayRouteTablesFilter `pulumi:"filters"`
	// A mapping of tags, each pair of which must exactly match
	// a pair on the desired transit gateway route table.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getTransitGatewayRouteTables.
type GetTransitGatewayRouteTablesResult struct {
	Filters []GetTransitGatewayRouteTablesFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set of Transit Gateway Route Table identifiers.
	Ids  []string          `pulumi:"ids"`
	Tags map[string]string `pulumi:"tags"`
}