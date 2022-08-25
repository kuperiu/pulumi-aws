// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Comprehend.Inputs
{

    public sealed class EntityRecognizerInputDataConfigAnnotationsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Location of entity list.
        /// </summary>
        [Input("s3Uri", required: true)]
        public Input<string> S3Uri { get; set; } = null!;

        [Input("testS3Uri")]
        public Input<string>? TestS3Uri { get; set; }

        public EntityRecognizerInputDataConfigAnnotationsGetArgs()
        {
        }
        public static new EntityRecognizerInputDataConfigAnnotationsGetArgs Empty => new EntityRecognizerInputDataConfigAnnotationsGetArgs();
    }
}