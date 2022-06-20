// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra.Inputs
{

    public sealed class IndexDocumentMetadataConfigurationUpdateArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the name of the Index.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("relevances")]
        private InputList<Inputs.IndexDocumentMetadataConfigurationUpdateRelevanceArgs>? _relevances;

        /// <summary>
        /// A block that provides manual tuning parameters to determine how the field affects the search results. Documented below.
        /// </summary>
        public InputList<Inputs.IndexDocumentMetadataConfigurationUpdateRelevanceArgs> Relevances
        {
            get => _relevances ?? (_relevances = new InputList<Inputs.IndexDocumentMetadataConfigurationUpdateRelevanceArgs>());
            set => _relevances = value;
        }

        [Input("searches")]
        private InputList<Inputs.IndexDocumentMetadataConfigurationUpdateSearchArgs>? _searches;

        /// <summary>
        /// A block that provides information about how the field is used during a search. Documented below.
        /// </summary>
        public InputList<Inputs.IndexDocumentMetadataConfigurationUpdateSearchArgs> Searches
        {
            get => _searches ?? (_searches = new InputList<Inputs.IndexDocumentMetadataConfigurationUpdateSearchArgs>());
            set => _searches = value;
        }

        /// <summary>
        /// The data type of the index field. Valid values are `STRING_VALUE`, `STRING_LIST_VALUE`, `LONG_VALUE`, `DATE_VALUE`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public IndexDocumentMetadataConfigurationUpdateArgs()
        {
        }
    }
}