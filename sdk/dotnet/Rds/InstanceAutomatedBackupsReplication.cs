// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rds
{
    /// <summary>
    /// Manage cross-region replication of automated backups to a different AWS Region. Documentation for cross-region automated backup replication can be found at:
    /// 
    /// * [Replicating automated backups to another AWS Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html)
    /// 
    /// &gt; **Note:** This resource has to be created in the destination region.
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
    ///         var @default = new Aws.Rds.InstanceAutomatedBackupsReplication("default", new Aws.Rds.InstanceAutomatedBackupsReplicationArgs
    ///         {
    ///             RetentionPeriod = 14,
    ///             SourceDbInstanceArn = "arn:aws:rds:us-west-2:123456789012:db:mydatabase",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Encrypting the automated backup with KMS
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var @default = new Aws.Rds.InstanceAutomatedBackupsReplication("default", new Aws.Rds.InstanceAutomatedBackupsReplicationArgs
    ///         {
    ///             KmsKeyId = "arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012",
    ///             SourceDbInstanceArn = "arn:aws:rds:us-west-2:123456789012:db:mydatabase",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Example including a RDS DB instance
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var replica = new Aws.Provider("replica", new Aws.ProviderArgs
    ///         {
    ///             Region = "us-west-2",
    ///         });
    ///         var defaultInstance = new Aws.Rds.Instance("defaultInstance", new Aws.Rds.InstanceArgs
    ///         {
    ///             AllocatedStorage = 10,
    ///             Identifier = "mydb",
    ///             Engine = "postgres",
    ///             EngineVersion = "13.4",
    ///             InstanceClass = "db.t3.micro",
    ///             Name = "mydb",
    ///             Username = "masterusername",
    ///             Password = "mustbeeightcharacters",
    ///             BackupRetentionPeriod = 7,
    ///             StorageEncrypted = true,
    ///             SkipFinalSnapshot = true,
    ///         });
    ///         var defaultKey = new Aws.Kms.Key("defaultKey", new Aws.Kms.KeyArgs
    ///         {
    ///             Description = "Encryption key for automated backups",
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = "aws.replica",
    ///         });
    ///         var defaultInstanceAutomatedBackupsReplication = new Aws.Rds.InstanceAutomatedBackupsReplication("defaultInstanceAutomatedBackupsReplication", new Aws.Rds.InstanceAutomatedBackupsReplicationArgs
    ///         {
    ///             SourceDbInstanceArn = defaultInstance.Arn,
    ///             KmsKeyId = defaultKey.Arn,
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = "aws.replica",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// RDS instance automated backups replication can be imported using the `arn`, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:rds/instanceAutomatedBackupsReplication:InstanceAutomatedBackupsReplication default arn:aws:rds:us-east-1:123456789012:auto-backup:ab-faaa2mgdj1vmp4xflr7yhsrmtbtob7ltrzzz2my
    /// ```
    /// </summary>
    [AwsResourceType("aws:rds/instanceAutomatedBackupsReplication:InstanceAutomatedBackupsReplication")]
    public partial class InstanceAutomatedBackupsReplication : Pulumi.CustomResource
    {
        /// <summary>
        /// The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
        /// </summary>
        [Output("preSignedUrl")]
        public Output<string?> PreSignedUrl { get; private set; } = null!;

        /// <summary>
        /// The retention period for the replicated automated backups, defaults to `7`.
        /// </summary>
        [Output("retentionPeriod")]
        public Output<int?> RetentionPeriod { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
        /// </summary>
        [Output("sourceDbInstanceArn")]
        public Output<string> SourceDbInstanceArn { get; private set; } = null!;


        /// <summary>
        /// Create a InstanceAutomatedBackupsReplication resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InstanceAutomatedBackupsReplication(string name, InstanceAutomatedBackupsReplicationArgs args, CustomResourceOptions? options = null)
            : base("aws:rds/instanceAutomatedBackupsReplication:InstanceAutomatedBackupsReplication", name, args ?? new InstanceAutomatedBackupsReplicationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InstanceAutomatedBackupsReplication(string name, Input<string> id, InstanceAutomatedBackupsReplicationState? state = null, CustomResourceOptions? options = null)
            : base("aws:rds/instanceAutomatedBackupsReplication:InstanceAutomatedBackupsReplication", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InstanceAutomatedBackupsReplication resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InstanceAutomatedBackupsReplication Get(string name, Input<string> id, InstanceAutomatedBackupsReplicationState? state = null, CustomResourceOptions? options = null)
        {
            return new InstanceAutomatedBackupsReplication(name, id, state, options);
        }
    }

    public sealed class InstanceAutomatedBackupsReplicationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
        /// </summary>
        [Input("preSignedUrl")]
        public Input<string>? PreSignedUrl { get; set; }

        /// <summary>
        /// The retention period for the replicated automated backups, defaults to `7`.
        /// </summary>
        [Input("retentionPeriod")]
        public Input<int>? RetentionPeriod { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
        /// </summary>
        [Input("sourceDbInstanceArn", required: true)]
        public Input<string> SourceDbInstanceArn { get; set; } = null!;

        public InstanceAutomatedBackupsReplicationArgs()
        {
        }
    }

    public sealed class InstanceAutomatedBackupsReplicationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
        /// </summary>
        [Input("preSignedUrl")]
        public Input<string>? PreSignedUrl { get; set; }

        /// <summary>
        /// The retention period for the replicated automated backups, defaults to `7`.
        /// </summary>
        [Input("retentionPeriod")]
        public Input<int>? RetentionPeriod { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
        /// </summary>
        [Input("sourceDbInstanceArn")]
        public Input<string>? SourceDbInstanceArn { get; set; }

        public InstanceAutomatedBackupsReplicationState()
        {
        }
    }
}