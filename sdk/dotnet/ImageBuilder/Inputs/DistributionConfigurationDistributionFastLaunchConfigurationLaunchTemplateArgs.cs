// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ImageBuilder.Inputs
{

    public sealed class DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Amazon EC2 launch template to use.
        /// </summary>
        [Input("launchTemplateId")]
        public Input<string>? LaunchTemplateId { get; set; }

        /// <summary>
        /// The name of the launch template to use for faster launching for a Windows AMI.
        /// </summary>
        [Input("launchTemplateName")]
        public Input<string>? LaunchTemplateName { get; set; }

        /// <summary>
        /// The version of the launch template to use for faster launching for a Windows AMI.
        /// </summary>
        [Input("launchTemplateVersion")]
        public Input<string>? LaunchTemplateVersion { get; set; }

        public DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs()
        {
        }
        public static new DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs Empty => new DistributionConfigurationDistributionFastLaunchConfigurationLaunchTemplateArgs();
    }
}