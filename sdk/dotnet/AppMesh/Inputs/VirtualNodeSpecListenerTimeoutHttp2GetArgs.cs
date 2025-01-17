// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Inputs
{

    public sealed class VirtualNodeSpecListenerTimeoutHttp2GetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
        /// </summary>
        [Input("idle")]
        public Input<Inputs.VirtualNodeSpecListenerTimeoutHttp2IdleGetArgs>? Idle { get; set; }

        /// <summary>
        /// The per request timeout.
        /// </summary>
        [Input("perRequest")]
        public Input<Inputs.VirtualNodeSpecListenerTimeoutHttp2PerRequestGetArgs>? PerRequest { get; set; }

        public VirtualNodeSpecListenerTimeoutHttp2GetArgs()
        {
        }
        public static new VirtualNodeSpecListenerTimeoutHttp2GetArgs Empty => new VirtualNodeSpecListenerTimeoutHttp2GetArgs();
    }
}
