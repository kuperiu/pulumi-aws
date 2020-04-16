// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeDeploy.Inputs
{

    public sealed class DeploymentConfigTrafficRoutingConfigTimeBasedLinearGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of minutes between each incremental traffic shift of a `TimeBasedLinear` deployment.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// The percentage of traffic that is shifted at the start of each increment of a `TimeBasedLinear` deployment.
        /// </summary>
        [Input("percentage")]
        public Input<int>? Percentage { get; set; }

        public DeploymentConfigTrafficRoutingConfigTimeBasedLinearGetArgs()
        {
        }
    }
}