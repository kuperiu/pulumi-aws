// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const documents = new aws.s3.BucketObjectv2("documents", {});
 * // ...
 * const entities = new aws.s3.BucketObjectv2("entities", {});
 * // ...
 * const example = new aws.comprehend.EntityRecognizer("example", {
 *     dataAccessRoleArn: aws_iam_role.example.arn,
 *     languageCode: "en",
 *     inputDataConfig: {
 *         entityTypes: [
 *             {
 *                 type: "ENTITY_1",
 *             },
 *             {
 *                 type: "ENTITY_2",
 *             },
 *         ],
 *         documents: {
 *             s3Uri: pulumi.interpolate`s3://${aws_s3_bucket.documents.bucket}/${documents.id}`,
 *         },
 *         entityList: {
 *             s3Uri: pulumi.interpolate`s3://${aws_s3_bucket.entities.bucket}/${entities.id}`,
 *         },
 *     },
 * }, {
 *     dependsOn: [aws_iam_role_policy.example],
 * });
 * ```
 *
 * ## Import
 *
 * Comprehend Entity Recognizer can be imported using the ARN, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:comprehend/entityRecognizer:EntityRecognizer example arn:aws:comprehend:us-west-2:123456789012:entity-recognizer/example
 * ```
 */
export class EntityRecognizer extends pulumi.CustomResource {
    /**
     * Get an existing EntityRecognizer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EntityRecognizerState, opts?: pulumi.CustomResourceOptions): EntityRecognizer {
        return new EntityRecognizer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:comprehend/entityRecognizer:EntityRecognizer';

    /**
     * Returns true if the given object is an instance of EntityRecognizer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EntityRecognizer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EntityRecognizer.__pulumiType;
    }

    /**
     * ARN of the Entity Recognizer version.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The ARN for an IAM Role which allows Comprehend to read the training and testing data.
     */
    public readonly dataAccessRoleArn!: pulumi.Output<string>;
    /**
     * Configuration for the training and testing data.
     * See the `inputDataConfig` Configuration Block section below.
     */
    public readonly inputDataConfig!: pulumi.Output<outputs.comprehend.EntityRecognizerInputDataConfig>;
    /**
     * Two-letter language code for the language.
     * One of `en`, `es`, `fr`, `it`, `de`, or `pt`.
     */
    public readonly languageCode!: pulumi.Output<string>;
    /**
     * The ID or ARN of a KMS Key used to encrypt trained Entity Recognizers.
     */
    public readonly modelKmsKeyId!: pulumi.Output<string | undefined>;
    /**
     * Name for the Entity Recognizer.
     * Has a maximum length of 63 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` Configuration Block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    public readonly versionName!: pulumi.Output<string>;
    /**
     * Creates a unique version name beginning with the specified prefix.
     * Has a maximum length of 37 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     * Conflicts with `versionName`.
     */
    public readonly versionNamePrefix!: pulumi.Output<string>;
    /**
     * ID or ARN of a KMS Key used to encrypt storage volumes during job processing.
     */
    public readonly volumeKmsKeyId!: pulumi.Output<string | undefined>;
    /**
     * Configuration parameters for VPC to contain Entity Recognizer resources.
     * See the `vpcConfig` Configuration Block section below.
     */
    public readonly vpcConfig!: pulumi.Output<outputs.comprehend.EntityRecognizerVpcConfig | undefined>;

    /**
     * Create a EntityRecognizer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EntityRecognizerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EntityRecognizerArgs | EntityRecognizerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EntityRecognizerState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["dataAccessRoleArn"] = state ? state.dataAccessRoleArn : undefined;
            resourceInputs["inputDataConfig"] = state ? state.inputDataConfig : undefined;
            resourceInputs["languageCode"] = state ? state.languageCode : undefined;
            resourceInputs["modelKmsKeyId"] = state ? state.modelKmsKeyId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["versionName"] = state ? state.versionName : undefined;
            resourceInputs["versionNamePrefix"] = state ? state.versionNamePrefix : undefined;
            resourceInputs["volumeKmsKeyId"] = state ? state.volumeKmsKeyId : undefined;
            resourceInputs["vpcConfig"] = state ? state.vpcConfig : undefined;
        } else {
            const args = argsOrState as EntityRecognizerArgs | undefined;
            if ((!args || args.dataAccessRoleArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataAccessRoleArn'");
            }
            if ((!args || args.inputDataConfig === undefined) && !opts.urn) {
                throw new Error("Missing required property 'inputDataConfig'");
            }
            if ((!args || args.languageCode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'languageCode'");
            }
            resourceInputs["dataAccessRoleArn"] = args ? args.dataAccessRoleArn : undefined;
            resourceInputs["inputDataConfig"] = args ? args.inputDataConfig : undefined;
            resourceInputs["languageCode"] = args ? args.languageCode : undefined;
            resourceInputs["modelKmsKeyId"] = args ? args.modelKmsKeyId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["versionName"] = args ? args.versionName : undefined;
            resourceInputs["versionNamePrefix"] = args ? args.versionNamePrefix : undefined;
            resourceInputs["volumeKmsKeyId"] = args ? args.volumeKmsKeyId : undefined;
            resourceInputs["vpcConfig"] = args ? args.vpcConfig : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EntityRecognizer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EntityRecognizer resources.
 */
export interface EntityRecognizerState {
    /**
     * ARN of the Entity Recognizer version.
     */
    arn?: pulumi.Input<string>;
    /**
     * The ARN for an IAM Role which allows Comprehend to read the training and testing data.
     */
    dataAccessRoleArn?: pulumi.Input<string>;
    /**
     * Configuration for the training and testing data.
     * See the `inputDataConfig` Configuration Block section below.
     */
    inputDataConfig?: pulumi.Input<inputs.comprehend.EntityRecognizerInputDataConfig>;
    /**
     * Two-letter language code for the language.
     * One of `en`, `es`, `fr`, `it`, `de`, or `pt`.
     */
    languageCode?: pulumi.Input<string>;
    /**
     * The ID or ARN of a KMS Key used to encrypt trained Entity Recognizers.
     */
    modelKmsKeyId?: pulumi.Input<string>;
    /**
     * Name for the Entity Recognizer.
     * Has a maximum length of 63 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` Configuration Block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    versionName?: pulumi.Input<string>;
    /**
     * Creates a unique version name beginning with the specified prefix.
     * Has a maximum length of 37 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     * Conflicts with `versionName`.
     */
    versionNamePrefix?: pulumi.Input<string>;
    /**
     * ID or ARN of a KMS Key used to encrypt storage volumes during job processing.
     */
    volumeKmsKeyId?: pulumi.Input<string>;
    /**
     * Configuration parameters for VPC to contain Entity Recognizer resources.
     * See the `vpcConfig` Configuration Block section below.
     */
    vpcConfig?: pulumi.Input<inputs.comprehend.EntityRecognizerVpcConfig>;
}

/**
 * The set of arguments for constructing a EntityRecognizer resource.
 */
export interface EntityRecognizerArgs {
    /**
     * The ARN for an IAM Role which allows Comprehend to read the training and testing data.
     */
    dataAccessRoleArn: pulumi.Input<string>;
    /**
     * Configuration for the training and testing data.
     * See the `inputDataConfig` Configuration Block section below.
     */
    inputDataConfig: pulumi.Input<inputs.comprehend.EntityRecognizerInputDataConfig>;
    /**
     * Two-letter language code for the language.
     * One of `en`, `es`, `fr`, `it`, `de`, or `pt`.
     */
    languageCode: pulumi.Input<string>;
    /**
     * The ID or ARN of a KMS Key used to encrypt trained Entity Recognizers.
     */
    modelKmsKeyId?: pulumi.Input<string>;
    /**
     * Name for the Entity Recognizer.
     * Has a maximum length of 63 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     */
    name?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider [`defaultTags` Configuration Block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    versionName?: pulumi.Input<string>;
    /**
     * Creates a unique version name beginning with the specified prefix.
     * Has a maximum length of 37 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     * Conflicts with `versionName`.
     */
    versionNamePrefix?: pulumi.Input<string>;
    /**
     * ID or ARN of a KMS Key used to encrypt storage volumes during job processing.
     */
    volumeKmsKeyId?: pulumi.Input<string>;
    /**
     * Configuration parameters for VPC to contain Entity Recognizer resources.
     * See the `vpcConfig` Configuration Block section below.
     */
    vpcConfig?: pulumi.Input<inputs.comprehend.EntityRecognizerVpcConfig>;
}