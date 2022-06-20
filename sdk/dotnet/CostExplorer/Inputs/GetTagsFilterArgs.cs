// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CostExplorer.Inputs
{

    public sealed class GetTagsFilterInputArgs : Pulumi.ResourceArgs
    {
        [Input("ands")]
        private InputList<Inputs.GetTagsFilterAndInputArgs>? _ands;

        /// <summary>
        /// Return results that match both `Dimension` objects.
        /// </summary>
        public InputList<Inputs.GetTagsFilterAndInputArgs> Ands
        {
            get => _ands ?? (_ands = new InputList<Inputs.GetTagsFilterAndInputArgs>());
            set => _ands = value;
        }

        /// <summary>
        /// Configuration block for the filter that's based on `CostCategory` values. See below.
        /// </summary>
        [Input("costCategory")]
        public Input<Inputs.GetTagsFilterCostCategoryInputArgs>? CostCategory { get; set; }

        /// <summary>
        /// Configuration block for the specific `Dimension` to use for `Expression`. See below.
        /// </summary>
        [Input("dimension")]
        public Input<Inputs.GetTagsFilterDimensionInputArgs>? Dimension { get; set; }

        /// <summary>
        /// Return results that match both `Dimension` object.
        /// </summary>
        [Input("not")]
        public Input<Inputs.GetTagsFilterNotInputArgs>? Not { get; set; }

        [Input("ors")]
        private InputList<Inputs.GetTagsFilterOrInputArgs>? _ors;

        /// <summary>
        /// Return results that match both `Dimension` object.
        /// </summary>
        public InputList<Inputs.GetTagsFilterOrInputArgs> Ors
        {
            get => _ors ?? (_ors = new InputList<Inputs.GetTagsFilterOrInputArgs>());
            set => _ors = value;
        }

        /// <summary>
        /// Tags that match your request.
        /// </summary>
        [Input("tags")]
        public Input<Inputs.GetTagsFilterTagsInputArgs>? Tags { get; set; }

        public GetTagsFilterInputArgs()
        {
        }
    }
}