// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx.Inputs
{

    public sealed class OntapStorageVirtualMachineActiveDirectoryConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The NetBIOS name of the Active Directory computer object that will be created for your SVM. This is often the same as the SVM name but can be different. It is limited to 15 characters because of standard NetBIOS naming limits.
        /// </summary>
        [Input("netbiosName")]
        public Input<string>? NetbiosName { get; set; }

        [Input("selfManagedActiveDirectoryConfiguration")]
        public Input<Inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfigurationArgs>? SelfManagedActiveDirectoryConfiguration { get; set; }

        public OntapStorageVirtualMachineActiveDirectoryConfigurationArgs()
        {
        }
    }
}