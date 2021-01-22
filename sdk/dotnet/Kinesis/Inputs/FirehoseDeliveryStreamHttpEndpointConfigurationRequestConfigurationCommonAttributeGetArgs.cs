// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kinesis.Inputs
{

    public sealed class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the HTTP endpoint common attribute.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The value of the HTTP endpoint common attribute.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttributeGetArgs()
        {
        }
    }
}