// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package budgets

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a budget action resource. Budget actions are cost savings controls that run either automatically on your behalf or by using a workflow approval process.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/budgets"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/iam"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		examplePolicy, err := iam.NewPolicy(ctx, "examplePolicy", &iam.PolicyArgs{
// 			Description: pulumi.String("My example policy"),
// 			Policy:      pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "      \"Action\": [\n", "        \"ec2:Describe*\"\n", "      ],\n", "      \"Effect\": \"Allow\",\n", "      \"Resource\": \"*\"\n", "    }\n", "  ]\n", "}\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		current, err := aws.GetPartition(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleRole, err := iam.NewRole(ctx, "exampleRole", &iam.RoleArgs{
// 			AssumeRolePolicy: pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v%v", "{\n", "  \"Version\": \"2012-10-17\",\n", "  \"Statement\": [\n", "    {\n", "      \"Effect\": \"Allow\",\n", "      \"Principal\": {\n", "        \"Service\": [\n", "          \"budgets.", current.DnsSuffix, "\"\n", "        ]\n", "      },\n", "      \"Action\": [\n", "        \"sts:AssumeRole\"\n", "      ]\n", "    }\n", "  ]\n", "}\n")),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleBudget, err := budgets.NewBudget(ctx, "exampleBudget", &budgets.BudgetArgs{
// 			BudgetType:      pulumi.String("USAGE"),
// 			LimitAmount:     pulumi.String("10.0"),
// 			LimitUnit:       pulumi.String("dollars"),
// 			TimePeriodStart: pulumi.String("2006-01-02_15:04"),
// 			TimeUnit:        pulumi.String("MONTHLY"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = budgets.NewBudgetAction(ctx, "exampleBudgetAction", &budgets.BudgetActionArgs{
// 			BudgetName:       exampleBudget.Name,
// 			ActionType:       pulumi.String("APPLY_IAM_POLICY"),
// 			ApprovalModel:    pulumi.String("AUTOMATIC"),
// 			NotificationType: pulumi.String("ACTUAL"),
// 			ExecutionRoleArn: exampleRole.Arn,
// 			ActionThreshold: &budgets.BudgetActionActionThresholdArgs{
// 				ActionThresholdType:  pulumi.String("ABSOLUTE_VALUE"),
// 				ActionThresholdValue: pulumi.Float64(100),
// 			},
// 			Definition: &budgets.BudgetActionDefinitionArgs{
// 				IamActionDefinition: &budgets.BudgetActionDefinitionIamActionDefinitionArgs{
// 					PolicyArn: examplePolicy.Arn,
// 					Roles: pulumi.StringArray{
// 						exampleRole.Name,
// 					},
// 				},
// 			},
// 			Subscribers: budgets.BudgetActionSubscriberArray{
// 				&budgets.BudgetActionSubscriberArgs{
// 					Address:          pulumi.String("example@example.example"),
// 					SubscriptionType: pulumi.String("EMAIL"),
// 				},
// 			},
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
// Budgets can be imported using `AccountID:ActionID:BudgetName`, e.g.
//
// ```sh
//  $ pulumi import aws:budgets/budgetAction:BudgetAction myBudget 123456789012:some-id:myBudget`
// ```
type BudgetAction struct {
	pulumi.CustomResourceState

	// The ID of the target account for budget. Will use current user's accountId by default if omitted.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The id of the budget action.
	ActionId pulumi.StringOutput `pulumi:"actionId"`
	// The trigger threshold of the action. See Action Threshold.
	ActionThreshold BudgetActionActionThresholdOutput `pulumi:"actionThreshold"`
	// The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. Valid values are `APPLY_IAM_POLICY`, `APPLY_SCP_POLICY`, and `RUN_SSM_DOCUMENTS`.
	ActionType pulumi.StringOutput `pulumi:"actionType"`
	// This specifies if the action needs manual or automatic approval. Valid values are `AUTOMATIC` and `MANUAL`.
	ApprovalModel pulumi.StringOutput `pulumi:"approvalModel"`
	// The ARN of the budget action.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The name of a budget.
	BudgetName pulumi.StringOutput `pulumi:"budgetName"`
	// Specifies all of the type-specific parameters. See Definition.
	Definition BudgetActionDefinitionOutput `pulumi:"definition"`
	// The role passed for action execution and reversion. Roles and actions must be in the same account.
	ExecutionRoleArn pulumi.StringOutput `pulumi:"executionRoleArn"`
	// The type of a notification. Valid values are `ACTUAL` or `FORECASTED`.
	NotificationType pulumi.StringOutput `pulumi:"notificationType"`
	// The status of the budget action.
	Status pulumi.StringOutput `pulumi:"status"`
	// A list of subscribers. See Subscriber.
	Subscribers BudgetActionSubscriberArrayOutput `pulumi:"subscribers"`
}

// NewBudgetAction registers a new resource with the given unique name, arguments, and options.
func NewBudgetAction(ctx *pulumi.Context,
	name string, args *BudgetActionArgs, opts ...pulumi.ResourceOption) (*BudgetAction, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ActionThreshold == nil {
		return nil, errors.New("invalid value for required argument 'ActionThreshold'")
	}
	if args.ActionType == nil {
		return nil, errors.New("invalid value for required argument 'ActionType'")
	}
	if args.ApprovalModel == nil {
		return nil, errors.New("invalid value for required argument 'ApprovalModel'")
	}
	if args.BudgetName == nil {
		return nil, errors.New("invalid value for required argument 'BudgetName'")
	}
	if args.Definition == nil {
		return nil, errors.New("invalid value for required argument 'Definition'")
	}
	if args.ExecutionRoleArn == nil {
		return nil, errors.New("invalid value for required argument 'ExecutionRoleArn'")
	}
	if args.NotificationType == nil {
		return nil, errors.New("invalid value for required argument 'NotificationType'")
	}
	if args.Subscribers == nil {
		return nil, errors.New("invalid value for required argument 'Subscribers'")
	}
	var resource BudgetAction
	err := ctx.RegisterResource("aws:budgets/budgetAction:BudgetAction", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBudgetAction gets an existing BudgetAction resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBudgetAction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BudgetActionState, opts ...pulumi.ResourceOption) (*BudgetAction, error) {
	var resource BudgetAction
	err := ctx.ReadResource("aws:budgets/budgetAction:BudgetAction", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BudgetAction resources.
type budgetActionState struct {
	// The ID of the target account for budget. Will use current user's accountId by default if omitted.
	AccountId *string `pulumi:"accountId"`
	// The id of the budget action.
	ActionId *string `pulumi:"actionId"`
	// The trigger threshold of the action. See Action Threshold.
	ActionThreshold *BudgetActionActionThreshold `pulumi:"actionThreshold"`
	// The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. Valid values are `APPLY_IAM_POLICY`, `APPLY_SCP_POLICY`, and `RUN_SSM_DOCUMENTS`.
	ActionType *string `pulumi:"actionType"`
	// This specifies if the action needs manual or automatic approval. Valid values are `AUTOMATIC` and `MANUAL`.
	ApprovalModel *string `pulumi:"approvalModel"`
	// The ARN of the budget action.
	Arn *string `pulumi:"arn"`
	// The name of a budget.
	BudgetName *string `pulumi:"budgetName"`
	// Specifies all of the type-specific parameters. See Definition.
	Definition *BudgetActionDefinition `pulumi:"definition"`
	// The role passed for action execution and reversion. Roles and actions must be in the same account.
	ExecutionRoleArn *string `pulumi:"executionRoleArn"`
	// The type of a notification. Valid values are `ACTUAL` or `FORECASTED`.
	NotificationType *string `pulumi:"notificationType"`
	// The status of the budget action.
	Status *string `pulumi:"status"`
	// A list of subscribers. See Subscriber.
	Subscribers []BudgetActionSubscriber `pulumi:"subscribers"`
}

type BudgetActionState struct {
	// The ID of the target account for budget. Will use current user's accountId by default if omitted.
	AccountId pulumi.StringPtrInput
	// The id of the budget action.
	ActionId pulumi.StringPtrInput
	// The trigger threshold of the action. See Action Threshold.
	ActionThreshold BudgetActionActionThresholdPtrInput
	// The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. Valid values are `APPLY_IAM_POLICY`, `APPLY_SCP_POLICY`, and `RUN_SSM_DOCUMENTS`.
	ActionType pulumi.StringPtrInput
	// This specifies if the action needs manual or automatic approval. Valid values are `AUTOMATIC` and `MANUAL`.
	ApprovalModel pulumi.StringPtrInput
	// The ARN of the budget action.
	Arn pulumi.StringPtrInput
	// The name of a budget.
	BudgetName pulumi.StringPtrInput
	// Specifies all of the type-specific parameters. See Definition.
	Definition BudgetActionDefinitionPtrInput
	// The role passed for action execution and reversion. Roles and actions must be in the same account.
	ExecutionRoleArn pulumi.StringPtrInput
	// The type of a notification. Valid values are `ACTUAL` or `FORECASTED`.
	NotificationType pulumi.StringPtrInput
	// The status of the budget action.
	Status pulumi.StringPtrInput
	// A list of subscribers. See Subscriber.
	Subscribers BudgetActionSubscriberArrayInput
}

func (BudgetActionState) ElementType() reflect.Type {
	return reflect.TypeOf((*budgetActionState)(nil)).Elem()
}

type budgetActionArgs struct {
	// The ID of the target account for budget. Will use current user's accountId by default if omitted.
	AccountId *string `pulumi:"accountId"`
	// The trigger threshold of the action. See Action Threshold.
	ActionThreshold BudgetActionActionThreshold `pulumi:"actionThreshold"`
	// The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. Valid values are `APPLY_IAM_POLICY`, `APPLY_SCP_POLICY`, and `RUN_SSM_DOCUMENTS`.
	ActionType string `pulumi:"actionType"`
	// This specifies if the action needs manual or automatic approval. Valid values are `AUTOMATIC` and `MANUAL`.
	ApprovalModel string `pulumi:"approvalModel"`
	// The name of a budget.
	BudgetName string `pulumi:"budgetName"`
	// Specifies all of the type-specific parameters. See Definition.
	Definition BudgetActionDefinition `pulumi:"definition"`
	// The role passed for action execution and reversion. Roles and actions must be in the same account.
	ExecutionRoleArn string `pulumi:"executionRoleArn"`
	// The type of a notification. Valid values are `ACTUAL` or `FORECASTED`.
	NotificationType string `pulumi:"notificationType"`
	// A list of subscribers. See Subscriber.
	Subscribers []BudgetActionSubscriber `pulumi:"subscribers"`
}

// The set of arguments for constructing a BudgetAction resource.
type BudgetActionArgs struct {
	// The ID of the target account for budget. Will use current user's accountId by default if omitted.
	AccountId pulumi.StringPtrInput
	// The trigger threshold of the action. See Action Threshold.
	ActionThreshold BudgetActionActionThresholdInput
	// The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. Valid values are `APPLY_IAM_POLICY`, `APPLY_SCP_POLICY`, and `RUN_SSM_DOCUMENTS`.
	ActionType pulumi.StringInput
	// This specifies if the action needs manual or automatic approval. Valid values are `AUTOMATIC` and `MANUAL`.
	ApprovalModel pulumi.StringInput
	// The name of a budget.
	BudgetName pulumi.StringInput
	// Specifies all of the type-specific parameters. See Definition.
	Definition BudgetActionDefinitionInput
	// The role passed for action execution and reversion. Roles and actions must be in the same account.
	ExecutionRoleArn pulumi.StringInput
	// The type of a notification. Valid values are `ACTUAL` or `FORECASTED`.
	NotificationType pulumi.StringInput
	// A list of subscribers. See Subscriber.
	Subscribers BudgetActionSubscriberArrayInput
}

func (BudgetActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*budgetActionArgs)(nil)).Elem()
}

type BudgetActionInput interface {
	pulumi.Input

	ToBudgetActionOutput() BudgetActionOutput
	ToBudgetActionOutputWithContext(ctx context.Context) BudgetActionOutput
}

func (*BudgetAction) ElementType() reflect.Type {
	return reflect.TypeOf((*BudgetAction)(nil))
}

func (i *BudgetAction) ToBudgetActionOutput() BudgetActionOutput {
	return i.ToBudgetActionOutputWithContext(context.Background())
}

func (i *BudgetAction) ToBudgetActionOutputWithContext(ctx context.Context) BudgetActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BudgetActionOutput)
}

func (i *BudgetAction) ToBudgetActionPtrOutput() BudgetActionPtrOutput {
	return i.ToBudgetActionPtrOutputWithContext(context.Background())
}

func (i *BudgetAction) ToBudgetActionPtrOutputWithContext(ctx context.Context) BudgetActionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BudgetActionPtrOutput)
}

type BudgetActionPtrInput interface {
	pulumi.Input

	ToBudgetActionPtrOutput() BudgetActionPtrOutput
	ToBudgetActionPtrOutputWithContext(ctx context.Context) BudgetActionPtrOutput
}

type budgetActionPtrType BudgetActionArgs

func (*budgetActionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**BudgetAction)(nil))
}

func (i *budgetActionPtrType) ToBudgetActionPtrOutput() BudgetActionPtrOutput {
	return i.ToBudgetActionPtrOutputWithContext(context.Background())
}

func (i *budgetActionPtrType) ToBudgetActionPtrOutputWithContext(ctx context.Context) BudgetActionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BudgetActionPtrOutput)
}

// BudgetActionArrayInput is an input type that accepts BudgetActionArray and BudgetActionArrayOutput values.
// You can construct a concrete instance of `BudgetActionArrayInput` via:
//
//          BudgetActionArray{ BudgetActionArgs{...} }
type BudgetActionArrayInput interface {
	pulumi.Input

	ToBudgetActionArrayOutput() BudgetActionArrayOutput
	ToBudgetActionArrayOutputWithContext(context.Context) BudgetActionArrayOutput
}

type BudgetActionArray []BudgetActionInput

func (BudgetActionArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*BudgetAction)(nil))
}

func (i BudgetActionArray) ToBudgetActionArrayOutput() BudgetActionArrayOutput {
	return i.ToBudgetActionArrayOutputWithContext(context.Background())
}

func (i BudgetActionArray) ToBudgetActionArrayOutputWithContext(ctx context.Context) BudgetActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BudgetActionArrayOutput)
}

// BudgetActionMapInput is an input type that accepts BudgetActionMap and BudgetActionMapOutput values.
// You can construct a concrete instance of `BudgetActionMapInput` via:
//
//          BudgetActionMap{ "key": BudgetActionArgs{...} }
type BudgetActionMapInput interface {
	pulumi.Input

	ToBudgetActionMapOutput() BudgetActionMapOutput
	ToBudgetActionMapOutputWithContext(context.Context) BudgetActionMapOutput
}

type BudgetActionMap map[string]BudgetActionInput

func (BudgetActionMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*BudgetAction)(nil))
}

func (i BudgetActionMap) ToBudgetActionMapOutput() BudgetActionMapOutput {
	return i.ToBudgetActionMapOutputWithContext(context.Background())
}

func (i BudgetActionMap) ToBudgetActionMapOutputWithContext(ctx context.Context) BudgetActionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BudgetActionMapOutput)
}

type BudgetActionOutput struct {
	*pulumi.OutputState
}

func (BudgetActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*BudgetAction)(nil))
}

func (o BudgetActionOutput) ToBudgetActionOutput() BudgetActionOutput {
	return o
}

func (o BudgetActionOutput) ToBudgetActionOutputWithContext(ctx context.Context) BudgetActionOutput {
	return o
}

func (o BudgetActionOutput) ToBudgetActionPtrOutput() BudgetActionPtrOutput {
	return o.ToBudgetActionPtrOutputWithContext(context.Background())
}

func (o BudgetActionOutput) ToBudgetActionPtrOutputWithContext(ctx context.Context) BudgetActionPtrOutput {
	return o.ApplyT(func(v BudgetAction) *BudgetAction {
		return &v
	}).(BudgetActionPtrOutput)
}

type BudgetActionPtrOutput struct {
	*pulumi.OutputState
}

func (BudgetActionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BudgetAction)(nil))
}

func (o BudgetActionPtrOutput) ToBudgetActionPtrOutput() BudgetActionPtrOutput {
	return o
}

func (o BudgetActionPtrOutput) ToBudgetActionPtrOutputWithContext(ctx context.Context) BudgetActionPtrOutput {
	return o
}

type BudgetActionArrayOutput struct{ *pulumi.OutputState }

func (BudgetActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]BudgetAction)(nil))
}

func (o BudgetActionArrayOutput) ToBudgetActionArrayOutput() BudgetActionArrayOutput {
	return o
}

func (o BudgetActionArrayOutput) ToBudgetActionArrayOutputWithContext(ctx context.Context) BudgetActionArrayOutput {
	return o
}

func (o BudgetActionArrayOutput) Index(i pulumi.IntInput) BudgetActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) BudgetAction {
		return vs[0].([]BudgetAction)[vs[1].(int)]
	}).(BudgetActionOutput)
}

type BudgetActionMapOutput struct{ *pulumi.OutputState }

func (BudgetActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]BudgetAction)(nil))
}

func (o BudgetActionMapOutput) ToBudgetActionMapOutput() BudgetActionMapOutput {
	return o
}

func (o BudgetActionMapOutput) ToBudgetActionMapOutputWithContext(ctx context.Context) BudgetActionMapOutput {
	return o
}

func (o BudgetActionMapOutput) MapIndex(k pulumi.StringInput) BudgetActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) BudgetAction {
		return vs[0].(map[string]BudgetAction)[vs[1].(string)]
	}).(BudgetActionOutput)
}

func init() {
	pulumi.RegisterOutputType(BudgetActionOutput{})
	pulumi.RegisterOutputType(BudgetActionPtrOutput{})
	pulumi.RegisterOutputType(BudgetActionArrayOutput{})
	pulumi.RegisterOutputType(BudgetActionMapOutput{})
}