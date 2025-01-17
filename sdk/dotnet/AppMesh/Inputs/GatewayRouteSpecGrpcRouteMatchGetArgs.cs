// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class GatewayRouteSpecGrpcRouteMatchGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The fully qualified domain name for the service to match from the request.
        /// </summary>
        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        public GatewayRouteSpecGrpcRouteMatchGetArgs()
        {
        }
        public static new GatewayRouteSpecGrpcRouteMatchGetArgs Empty => new GatewayRouteSpecGrpcRouteMatchGetArgs();
    }
}
