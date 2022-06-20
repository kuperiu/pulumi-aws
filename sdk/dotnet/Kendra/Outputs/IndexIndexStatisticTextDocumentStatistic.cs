// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra.Outputs
{

    [OutputType]
    public sealed class IndexIndexStatisticTextDocumentStatistic
    {
        /// <summary>
        /// The total size, in bytes, of the indexed documents.
        /// </summary>
        public readonly int? IndexedTextBytes;
        /// <summary>
        /// The number of text documents indexed.
        /// </summary>
        public readonly int? IndexedTextDocumentsCount;

        [OutputConstructor]
        private IndexIndexStatisticTextDocumentStatistic(
            int? indexedTextBytes,

            int? indexedTextDocumentsCount)
        {
            IndexedTextBytes = indexedTextBytes;
            IndexedTextDocumentsCount = indexedTextDocumentsCount;
        }
    }
}