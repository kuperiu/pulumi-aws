// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class GatewayRouteSpecGrpcRouteGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The action to take if a match is determined.
        /// </summary>
        [Input("action", required: true)]
        public Input<Inputs.GatewayRouteSpecGrpcRouteActionGetArgs> Action { get; set; } = null!;

        /// <summary>
        /// The criteria for determining a request match.
        /// </summary>
        [Input("match", required: true)]
        public Input<Inputs.GatewayRouteSpecGrpcRouteMatchGetArgs> Match { get; set; } = null!;

        public GatewayRouteSpecGrpcRouteGetArgs()
        {
        }
        public static new GatewayRouteSpecGrpcRouteGetArgs Empty => new GatewayRouteSpecGrpcRouteGetArgs();
    }
}
