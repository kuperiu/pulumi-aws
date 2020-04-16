// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Msk.Outputs
{

    [OutputType]
    public sealed class ClusterBrokerNodeGroupInfo
    {
        /// <summary>
        /// The distribution of broker nodes across availability zones ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-model-brokerazdistribution)). Currently the only valid value is `DEFAULT`.
        /// </summary>
        public readonly string? AzDistribution;
        /// <summary>
        /// A list of subnets to connect to in client VPC ([documentation](https://docs.aws.amazon.com/msk/1.0/apireference/clusters.html#clusters-prop-brokernodegroupinfo-clientsubnets)).
        /// </summary>
        public readonly ImmutableArray<string> ClientSubnets;
        /// <summary>
        /// The size in GiB of the EBS volume for the data drive on each broker node.
        /// </summary>
        public readonly int EbsVolumeSize;
        /// <summary>
        /// Specify the instance type to use for the kafka brokers. e.g. kafka.m5.large. ([Pricing info](https://aws.amazon.com/msk/pricing/))
        /// </summary>
        public readonly string InstanceType;
        /// <summary>
        /// A list of the security groups to associate with the elastic network interfaces to control who can communicate with the cluster.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;

        [OutputConstructor]
        private ClusterBrokerNodeGroupInfo(
            string? azDistribution,

            ImmutableArray<string> clientSubnets,

            int ebsVolumeSize,

            string instanceType,

            ImmutableArray<string> securityGroups)
        {
            AzDistribution = azDistribution;
            ClientSubnets = clientSubnets;
            EbsVolumeSize = ebsVolumeSize;
            InstanceType = instanceType;
            SecurityGroups = securityGroups;
        }
    }
}