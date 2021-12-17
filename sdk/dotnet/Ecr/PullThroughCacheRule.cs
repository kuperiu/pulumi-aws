// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ecr
{
    /// <summary>
    /// Provides an Elastic Container Registry Pull Through Cache Rule.
    /// 
    /// More information about pull through cache rules, including the set of supported
    /// upstream repositories, see [Using pull through cache rules](https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new Aws.Ecr.PullThroughCacheRule("example", new Aws.Ecr.PullThroughCacheRuleArgs
    ///         {
    ///             EcrRepositoryPrefix = "ecr-public",
    ///             UpstreamRegistryUrl = "public.ecr.aws",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Use the `ecr_repository_prefix` to import a Pull Through Cache Rule. For example
    /// 
    /// ```sh
    ///  $ pulumi import aws:ecr/pullThroughCacheRule:PullThroughCacheRule example ecr-public
    /// ```
    /// </summary>
    [AwsResourceType("aws:ecr/pullThroughCacheRule:PullThroughCacheRule")]
    public partial class PullThroughCacheRule : Pulumi.CustomResource
    {
        /// <summary>
        /// The repository name prefix to use when caching images from the source registry.
        /// </summary>
        [Output("ecrRepositoryPrefix")]
        public Output<string> EcrRepositoryPrefix { get; private set; } = null!;

        /// <summary>
        /// The registry ID where the repository was created.
        /// </summary>
        [Output("registryId")]
        public Output<string> RegistryId { get; private set; } = null!;

        /// <summary>
        /// The registry URL of the upstream public registry to use as the source.
        /// </summary>
        [Output("upstreamRegistryUrl")]
        public Output<string> UpstreamRegistryUrl { get; private set; } = null!;


        /// <summary>
        /// Create a PullThroughCacheRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PullThroughCacheRule(string name, PullThroughCacheRuleArgs args, CustomResourceOptions? options = null)
            : base("aws:ecr/pullThroughCacheRule:PullThroughCacheRule", name, args ?? new PullThroughCacheRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PullThroughCacheRule(string name, Input<string> id, PullThroughCacheRuleState? state = null, CustomResourceOptions? options = null)
            : base("aws:ecr/pullThroughCacheRule:PullThroughCacheRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PullThroughCacheRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PullThroughCacheRule Get(string name, Input<string> id, PullThroughCacheRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new PullThroughCacheRule(name, id, state, options);
        }
    }

    public sealed class PullThroughCacheRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The repository name prefix to use when caching images from the source registry.
        /// </summary>
        [Input("ecrRepositoryPrefix", required: true)]
        public Input<string> EcrRepositoryPrefix { get; set; } = null!;

        /// <summary>
        /// The registry URL of the upstream public registry to use as the source.
        /// </summary>
        [Input("upstreamRegistryUrl", required: true)]
        public Input<string> UpstreamRegistryUrl { get; set; } = null!;

        public PullThroughCacheRuleArgs()
        {
        }
    }

    public sealed class PullThroughCacheRuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The repository name prefix to use when caching images from the source registry.
        /// </summary>
        [Input("ecrRepositoryPrefix")]
        public Input<string>? EcrRepositoryPrefix { get; set; }

        /// <summary>
        /// The registry ID where the repository was created.
        /// </summary>
        [Input("registryId")]
        public Input<string>? RegistryId { get; set; }

        /// <summary>
        /// The registry URL of the upstream public registry to use as the source.
        /// </summary>
        [Input("upstreamRegistryUrl")]
        public Input<string>? UpstreamRegistryUrl { get; set; }

        public PullThroughCacheRuleState()
        {
        }
    }
}