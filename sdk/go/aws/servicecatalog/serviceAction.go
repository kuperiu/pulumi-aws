// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Service Catalog self-service action.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/servicecatalog"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := servicecatalog.NewServiceAction(ctx, "example", &servicecatalog.ServiceActionArgs{
// 			Definition: &servicecatalog.ServiceActionDefinitionArgs{
// 				Name: pulumi.String("AWS-RestartEC2Instance"),
// 			},
// 			Description: pulumi.String("Motor generator unit"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// `aws_servicecatalog_service_action` can be imported using the service action ID, e.g.
//
// ```sh
//  $ pulumi import aws:servicecatalog/serviceAction:ServiceAction example act-f1w12eperfslh
// ```
type ServiceAction struct {
	pulumi.CustomResourceState

	// Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
	AcceptLanguage pulumi.StringPtrOutput `pulumi:"acceptLanguage"`
	// Self-service action definition configuration block. Detailed below.
	Definition ServiceActionDefinitionOutput `pulumi:"definition"`
	// Self-service action description.
	Description pulumi.StringOutput `pulumi:"description"`
	// Self-service action name.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewServiceAction registers a new resource with the given unique name, arguments, and options.
func NewServiceAction(ctx *pulumi.Context,
	name string, args *ServiceActionArgs, opts ...pulumi.ResourceOption) (*ServiceAction, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Definition == nil {
		return nil, errors.New("invalid value for required argument 'Definition'")
	}
	var resource ServiceAction
	err := ctx.RegisterResource("aws:servicecatalog/serviceAction:ServiceAction", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceAction gets an existing ServiceAction resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceAction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceActionState, opts ...pulumi.ResourceOption) (*ServiceAction, error) {
	var resource ServiceAction
	err := ctx.ReadResource("aws:servicecatalog/serviceAction:ServiceAction", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceAction resources.
type serviceActionState struct {
	// Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Self-service action definition configuration block. Detailed below.
	Definition *ServiceActionDefinition `pulumi:"definition"`
	// Self-service action description.
	Description *string `pulumi:"description"`
	// Self-service action name.
	Name *string `pulumi:"name"`
}

type ServiceActionState struct {
	// Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
	AcceptLanguage pulumi.StringPtrInput
	// Self-service action definition configuration block. Detailed below.
	Definition ServiceActionDefinitionPtrInput
	// Self-service action description.
	Description pulumi.StringPtrInput
	// Self-service action name.
	Name pulumi.StringPtrInput
}

func (ServiceActionState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceActionState)(nil)).Elem()
}

type serviceActionArgs struct {
	// Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Self-service action definition configuration block. Detailed below.
	Definition ServiceActionDefinition `pulumi:"definition"`
	// Self-service action description.
	Description *string `pulumi:"description"`
	// Self-service action name.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a ServiceAction resource.
type ServiceActionArgs struct {
	// Language code. Valid values are `en` (English), `jp` (Japanese), and `zh` (Chinese). Default is `en`.
	AcceptLanguage pulumi.StringPtrInput
	// Self-service action definition configuration block. Detailed below.
	Definition ServiceActionDefinitionInput
	// Self-service action description.
	Description pulumi.StringPtrInput
	// Self-service action name.
	Name pulumi.StringPtrInput
}

func (ServiceActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceActionArgs)(nil)).Elem()
}

type ServiceActionInput interface {
	pulumi.Input

	ToServiceActionOutput() ServiceActionOutput
	ToServiceActionOutputWithContext(ctx context.Context) ServiceActionOutput
}

func (*ServiceAction) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceAction)(nil))
}

func (i *ServiceAction) ToServiceActionOutput() ServiceActionOutput {
	return i.ToServiceActionOutputWithContext(context.Background())
}

func (i *ServiceAction) ToServiceActionOutputWithContext(ctx context.Context) ServiceActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceActionOutput)
}

func (i *ServiceAction) ToServiceActionPtrOutput() ServiceActionPtrOutput {
	return i.ToServiceActionPtrOutputWithContext(context.Background())
}

func (i *ServiceAction) ToServiceActionPtrOutputWithContext(ctx context.Context) ServiceActionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceActionPtrOutput)
}

type ServiceActionPtrInput interface {
	pulumi.Input

	ToServiceActionPtrOutput() ServiceActionPtrOutput
	ToServiceActionPtrOutputWithContext(ctx context.Context) ServiceActionPtrOutput
}

type serviceActionPtrType ServiceActionArgs

func (*serviceActionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceAction)(nil))
}

func (i *serviceActionPtrType) ToServiceActionPtrOutput() ServiceActionPtrOutput {
	return i.ToServiceActionPtrOutputWithContext(context.Background())
}

func (i *serviceActionPtrType) ToServiceActionPtrOutputWithContext(ctx context.Context) ServiceActionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceActionPtrOutput)
}

// ServiceActionArrayInput is an input type that accepts ServiceActionArray and ServiceActionArrayOutput values.
// You can construct a concrete instance of `ServiceActionArrayInput` via:
//
//          ServiceActionArray{ ServiceActionArgs{...} }
type ServiceActionArrayInput interface {
	pulumi.Input

	ToServiceActionArrayOutput() ServiceActionArrayOutput
	ToServiceActionArrayOutputWithContext(context.Context) ServiceActionArrayOutput
}

type ServiceActionArray []ServiceActionInput

func (ServiceActionArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ServiceAction)(nil))
}

func (i ServiceActionArray) ToServiceActionArrayOutput() ServiceActionArrayOutput {
	return i.ToServiceActionArrayOutputWithContext(context.Background())
}

func (i ServiceActionArray) ToServiceActionArrayOutputWithContext(ctx context.Context) ServiceActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceActionArrayOutput)
}

// ServiceActionMapInput is an input type that accepts ServiceActionMap and ServiceActionMapOutput values.
// You can construct a concrete instance of `ServiceActionMapInput` via:
//
//          ServiceActionMap{ "key": ServiceActionArgs{...} }
type ServiceActionMapInput interface {
	pulumi.Input

	ToServiceActionMapOutput() ServiceActionMapOutput
	ToServiceActionMapOutputWithContext(context.Context) ServiceActionMapOutput
}

type ServiceActionMap map[string]ServiceActionInput

func (ServiceActionMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ServiceAction)(nil))
}

func (i ServiceActionMap) ToServiceActionMapOutput() ServiceActionMapOutput {
	return i.ToServiceActionMapOutputWithContext(context.Background())
}

func (i ServiceActionMap) ToServiceActionMapOutputWithContext(ctx context.Context) ServiceActionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceActionMapOutput)
}

type ServiceActionOutput struct {
	*pulumi.OutputState
}

func (ServiceActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ServiceAction)(nil))
}

func (o ServiceActionOutput) ToServiceActionOutput() ServiceActionOutput {
	return o
}

func (o ServiceActionOutput) ToServiceActionOutputWithContext(ctx context.Context) ServiceActionOutput {
	return o
}

func (o ServiceActionOutput) ToServiceActionPtrOutput() ServiceActionPtrOutput {
	return o.ToServiceActionPtrOutputWithContext(context.Background())
}

func (o ServiceActionOutput) ToServiceActionPtrOutputWithContext(ctx context.Context) ServiceActionPtrOutput {
	return o.ApplyT(func(v ServiceAction) *ServiceAction {
		return &v
	}).(ServiceActionPtrOutput)
}

type ServiceActionPtrOutput struct {
	*pulumi.OutputState
}

func (ServiceActionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceAction)(nil))
}

func (o ServiceActionPtrOutput) ToServiceActionPtrOutput() ServiceActionPtrOutput {
	return o
}

func (o ServiceActionPtrOutput) ToServiceActionPtrOutputWithContext(ctx context.Context) ServiceActionPtrOutput {
	return o
}

type ServiceActionArrayOutput struct{ *pulumi.OutputState }

func (ServiceActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ServiceAction)(nil))
}

func (o ServiceActionArrayOutput) ToServiceActionArrayOutput() ServiceActionArrayOutput {
	return o
}

func (o ServiceActionArrayOutput) ToServiceActionArrayOutputWithContext(ctx context.Context) ServiceActionArrayOutput {
	return o
}

func (o ServiceActionArrayOutput) Index(i pulumi.IntInput) ServiceActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ServiceAction {
		return vs[0].([]ServiceAction)[vs[1].(int)]
	}).(ServiceActionOutput)
}

type ServiceActionMapOutput struct{ *pulumi.OutputState }

func (ServiceActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ServiceAction)(nil))
}

func (o ServiceActionMapOutput) ToServiceActionMapOutput() ServiceActionMapOutput {
	return o
}

func (o ServiceActionMapOutput) ToServiceActionMapOutputWithContext(ctx context.Context) ServiceActionMapOutput {
	return o
}

func (o ServiceActionMapOutput) MapIndex(k pulumi.StringInput) ServiceActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ServiceAction {
		return vs[0].(map[string]ServiceAction)[vs[1].(string)]
	}).(ServiceActionOutput)
}

func init() {
	pulumi.RegisterOutputType(ServiceActionOutput{})
	pulumi.RegisterOutputType(ServiceActionPtrOutput{})
	pulumi.RegisterOutputType(ServiceActionArrayOutput{})
	pulumi.RegisterOutputType(ServiceActionMapOutput{})
}