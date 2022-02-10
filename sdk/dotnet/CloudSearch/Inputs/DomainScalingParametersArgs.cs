// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudSearch.Inputs
{

    public sealed class DomainScalingParametersArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The instance type that you want to preconfigure for your domain. See the [AWS documentation](https://docs.aws.amazon.com/cloudsearch/latest/developerguide/API_ScalingParameters.html) for valid values.
        /// </summary>
        [Input("desiredInstanceType")]
        public Input<string>? DesiredInstanceType { get; set; }

        /// <summary>
        /// The number of partitions you want to preconfigure for your domain. Only valid when you select `search.2xlarge` as the instance type.
        /// </summary>
        [Input("desiredPartitionCount")]
        public Input<int>? DesiredPartitionCount { get; set; }

        /// <summary>
        /// The number of replicas you want to preconfigure for each index partition.
        /// </summary>
        [Input("desiredReplicationCount")]
        public Input<int>? DesiredReplicationCount { get; set; }

        public DomainScalingParametersArgs()
        {
        }
    }
}