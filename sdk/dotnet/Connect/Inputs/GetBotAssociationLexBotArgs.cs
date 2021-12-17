// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect.Inputs
{

    public sealed class GetBotAssociationLexBotInputArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Region that the Amazon Lex (V1) bot was created in.
        /// </summary>
        [Input("lexRegion", required: true)]
        public Input<string> LexRegion { get; set; } = null!;

        /// <summary>
        /// The name of the Amazon Lex (V1) bot.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetBotAssociationLexBotInputArgs()
        {
        }
    }
}