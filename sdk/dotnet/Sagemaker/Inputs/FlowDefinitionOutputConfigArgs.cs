// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class FlowDefinitionOutputConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Key Management Service (KMS) key ARN for server-side encryption.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The Amazon S3 path where the object containing human output will be made available.
        /// </summary>
        [Input("s3OutputPath", required: true)]
        public Input<string> S3OutputPath { get; set; } = null!;

        public FlowDefinitionOutputConfigArgs()
        {
        }
    }
}