// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SsoAdmin
{
    /// <summary>
    /// Provides an IAM inline policy for a Single Sign-On (SSO) Permission Set resource
    /// 
    /// &gt; **NOTE:** AWS Single Sign-On (SSO) only supports one IAM inline policy per `aws.ssoadmin.PermissionSet` resource.
    /// Creating or updating this resource will automatically [Provision the Permission Set](https://docs.aws.amazon.com/singlesignon/latest/APIReference/API_ProvisionPermissionSet.html) to apply the corresponding updates to all assigned accounts.
    /// 
    /// ## Import
    /// 
    /// SSO Permission Set Inline Policies can be imported using the `permission_set_arn` and `instance_arn` separated by a comma (`,`) e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy example arn:aws:sso:::permissionSet/ssoins-2938j0x8920sbj72/ps-80383020jr9302rk,arn:aws:sso:::instance/ssoins-2938j0x8920sbj72
    /// ```
    /// </summary>
    [AwsResourceType("aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy")]
    public partial class PermissionSetInlinePolicy : Pulumi.CustomResource
    {
        /// <summary>
        /// The IAM inline policy to attach to a Permission Set.
        /// </summary>
        [Output("inlinePolicy")]
        public Output<string> InlinePolicy { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
        /// </summary>
        [Output("instanceArn")]
        public Output<string> InstanceArn { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Permission Set.
        /// </summary>
        [Output("permissionSetArn")]
        public Output<string> PermissionSetArn { get; private set; } = null!;


        /// <summary>
        /// Create a PermissionSetInlinePolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PermissionSetInlinePolicy(string name, PermissionSetInlinePolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy", name, args ?? new PermissionSetInlinePolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PermissionSetInlinePolicy(string name, Input<string> id, PermissionSetInlinePolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:ssoadmin/permissionSetInlinePolicy:PermissionSetInlinePolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PermissionSetInlinePolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PermissionSetInlinePolicy Get(string name, Input<string> id, PermissionSetInlinePolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new PermissionSetInlinePolicy(name, id, state, options);
        }
    }

    public sealed class PermissionSetInlinePolicyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IAM inline policy to attach to a Permission Set.
        /// </summary>
        [Input("inlinePolicy", required: true)]
        public Input<string> InlinePolicy { get; set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
        /// </summary>
        [Input("instanceArn", required: true)]
        public Input<string> InstanceArn { get; set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Permission Set.
        /// </summary>
        [Input("permissionSetArn", required: true)]
        public Input<string> PermissionSetArn { get; set; } = null!;

        public PermissionSetInlinePolicyArgs()
        {
        }
    }

    public sealed class PermissionSetInlinePolicyState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IAM inline policy to attach to a Permission Set.
        /// </summary>
        [Input("inlinePolicy")]
        public Input<string>? InlinePolicy { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the SSO Instance under which the operation will be executed.
        /// </summary>
        [Input("instanceArn")]
        public Input<string>? InstanceArn { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the Permission Set.
        /// </summary>
        [Input("permissionSetArn")]
        public Input<string>? PermissionSetArn { get; set; }

        public PermissionSetInlinePolicyState()
        {
        }
    }
}