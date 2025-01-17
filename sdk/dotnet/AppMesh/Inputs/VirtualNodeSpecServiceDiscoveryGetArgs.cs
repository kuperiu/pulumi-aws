// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class VirtualNodeSpecServiceDiscoveryGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies any AWS Cloud Map information for the virtual node.
        /// </summary>
        [Input("awsCloudMap")]
        public Input<Inputs.VirtualNodeSpecServiceDiscoveryAwsCloudMapGetArgs>? AwsCloudMap { get; set; }

        /// <summary>
        /// Specifies the DNS service name for the virtual node.
        /// </summary>
        [Input("dns")]
        public Input<Inputs.VirtualNodeSpecServiceDiscoveryDnsGetArgs>? Dns { get; set; }

        public VirtualNodeSpecServiceDiscoveryGetArgs()
        {
        }
        public static new VirtualNodeSpecServiceDiscoveryGetArgs Empty => new VirtualNodeSpecServiceDiscoveryGetArgs();
    }
}
