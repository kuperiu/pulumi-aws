// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Outputs
{

    [OutputType]
    public sealed class BucketV2LifecycleRuleNoncurrentVersionExpiration
    {
        /// <summary>
        /// The number of days specified for the default retention period.
        /// </summary>
        public readonly int? Days;

        [OutputConstructor]
        private BucketV2LifecycleRuleNoncurrentVersionExpiration(int? days)
        {
            Days = days;
        }
    }
}