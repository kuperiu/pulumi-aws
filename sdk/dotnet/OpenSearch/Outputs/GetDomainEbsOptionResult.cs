// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.OpenSearch.Outputs
{

    [OutputType]
    public sealed class GetDomainEbsOptionResult
    {
        /// <summary>
        /// Whether EBS volumes are attached to data nodes in the domain.
        /// </summary>
        public readonly bool EbsEnabled;
        /// <summary>
        /// Baseline input/output (I/O) performance of EBS volumes attached to data nodes.
        /// </summary>
        public readonly int Iops;
        /// <summary>
        /// Size of EBS volumes attached to data nodes (in GB).
        /// </summary>
        public readonly int VolumeSize;
        /// <summary>
        /// Type of EBS volumes attached to data nodes.
        /// </summary>
        public readonly string VolumeType;

        [OutputConstructor]
        private GetDomainEbsOptionResult(
            bool ebsEnabled,

            int iops,

            int volumeSize,

            string volumeType)
        {
            EbsEnabled = ebsEnabled;
            Iops = iops;
            VolumeSize = volumeSize;
            VolumeType = volumeType;
        }
    }
}