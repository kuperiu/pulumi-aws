// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kms.Inputs
{

    public sealed class GetSecretsSecretInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("context")]
        private InputMap<string>? _context;

        /// <summary>
        /// An optional mapping that makes up the Encryption Context for the secret.
        /// </summary>
        public InputMap<string> Context
        {
            get => _context ?? (_context = new InputMap<string>());
            set => _context = value;
        }

        [Input("grantTokens")]
        private InputList<string>? _grantTokens;

        /// <summary>
        /// An optional list of Grant Tokens for the secret.
        /// </summary>
        public InputList<string> GrantTokens
        {
            get => _grantTokens ?? (_grantTokens = new InputList<string>());
            set => _grantTokens = value;
        }

        /// <summary>
        /// The name to export this secret under in the attributes.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Base64 encoded payload, as returned from a KMS encrypt operation.
        /// </summary>
        [Input("payload", required: true)]
        public Input<string> Payload { get; set; } = null!;

        public GetSecretsSecretInputArgs()
        {
        }
        public static new GetSecretsSecretInputArgs Empty => new GetSecretsSecretInputArgs();
    }
}
