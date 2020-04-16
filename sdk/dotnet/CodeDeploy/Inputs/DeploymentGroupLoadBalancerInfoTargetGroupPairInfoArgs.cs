// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeDeploy.Inputs
{

    public sealed class DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration block for the production traffic route (documented below).
        /// </summary>
        [Input("prodTrafficRoute", required: true)]
        public Input<Inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoProdTrafficRouteArgs> ProdTrafficRoute { get; set; } = null!;

        [Input("targetGroups", required: true)]
        private InputList<Inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs>? _targetGroups;

        /// <summary>
        /// Configuration blocks for a target group within a target group pair (documented below).
        /// </summary>
        public InputList<Inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs> TargetGroups
        {
            get => _targetGroups ?? (_targetGroups = new InputList<Inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTargetGroupArgs>());
            set => _targetGroups = value;
        }

        /// <summary>
        /// Configuration block for the test traffic route (documented below).
        /// </summary>
        [Input("testTrafficRoute")]
        public Input<Inputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfoTestTrafficRouteArgs>? TestTrafficRoute { get; set; }

        public DeploymentGroupLoadBalancerInfoTargetGroupPairInfoArgs()
        {
        }
    }
}