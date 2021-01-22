// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an EC2 host resource. This allows hosts to be created, updated,
 * and deleted.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.ec2.DedicatedHost("test", {
 *     autoPlacement: "on",
 *     availabilityZone: "us-west-1a",
 *     hostRecovery: "on",
 *     instanceType: "c5.18xlarge",
 * });
 * const testData = test.id.apply(id => aws.ec2.getDedicatedHost({
 *     hostId: id,
 * }, { async: true }));
 * ```
 *
 * ## Import
 *
 * hosts can be imported using the `host_id`, e.g.
 *
 * ```sh
 *  $ pulumi import aws:ec2/dedicatedHost:DedicatedHost host_id h-0385a99d0e4b20cbb
 * ```
 */
export class DedicatedHost extends pulumi.CustomResource {
    /**
     * Get an existing DedicatedHost resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DedicatedHostState, opts?: pulumi.CustomResourceOptions): DedicatedHost {
        return new DedicatedHost(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ec2/dedicatedHost:DedicatedHost';

    /**
     * Returns true if the given object is an instance of DedicatedHost.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DedicatedHost {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DedicatedHost.__pulumiType;
    }

    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID.
     */
    public readonly autoPlacement!: pulumi.Output<string>;
    /**
     * The AZ to start the host in.
     */
    public readonly availabilityZone!: pulumi.Output<string>;
    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default.
     */
    public readonly hostRecovery!: pulumi.Output<string>;
    /**
     * Specifies the instance family for which to configure your Dedicated Host. Mutually exclusive with `instanceType`.
     */
    public readonly instanceFamily!: pulumi.Output<string | undefined>;
    /**
     * Specifies the instance type for which to configure your Dedicated Host. When you specify the instance type, that is the only instance type that you can launch onto that host. Mutually exclusive with `instanceFamily`.
     */
    public readonly instanceType!: pulumi.Output<string | undefined>;
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;

    /**
     * Create a DedicatedHost resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DedicatedHostArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DedicatedHostArgs | DedicatedHostState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as DedicatedHostState | undefined;
            inputs["autoPlacement"] = state ? state.autoPlacement : undefined;
            inputs["availabilityZone"] = state ? state.availabilityZone : undefined;
            inputs["hostRecovery"] = state ? state.hostRecovery : undefined;
            inputs["instanceFamily"] = state ? state.instanceFamily : undefined;
            inputs["instanceType"] = state ? state.instanceType : undefined;
            inputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as DedicatedHostArgs | undefined;
            if ((!args || args.availabilityZone === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'availabilityZone'");
            }
            inputs["autoPlacement"] = args ? args.autoPlacement : undefined;
            inputs["availabilityZone"] = args ? args.availabilityZone : undefined;
            inputs["hostRecovery"] = args ? args.hostRecovery : undefined;
            inputs["instanceFamily"] = args ? args.instanceFamily : undefined;
            inputs["instanceType"] = args ? args.instanceType : undefined;
            inputs["tags"] = args ? args.tags : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(DedicatedHost.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DedicatedHost resources.
 */
export interface DedicatedHostState {
    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID.
     */
    readonly autoPlacement?: pulumi.Input<string>;
    /**
     * The AZ to start the host in.
     */
    readonly availabilityZone?: pulumi.Input<string>;
    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default.
     */
    readonly hostRecovery?: pulumi.Input<string>;
    /**
     * Specifies the instance family for which to configure your Dedicated Host. Mutually exclusive with `instanceType`.
     */
    readonly instanceFamily?: pulumi.Input<string>;
    /**
     * Specifies the instance type for which to configure your Dedicated Host. When you specify the instance type, that is the only instance type that you can launch onto that host. Mutually exclusive with `instanceFamily`.
     */
    readonly instanceType?: pulumi.Input<string>;
    readonly tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a DedicatedHost resource.
 */
export interface DedicatedHostArgs {
    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID.
     */
    readonly autoPlacement?: pulumi.Input<string>;
    /**
     * The AZ to start the host in.
     */
    readonly availabilityZone: pulumi.Input<string>;
    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default.
     */
    readonly hostRecovery?: pulumi.Input<string>;
    /**
     * Specifies the instance family for which to configure your Dedicated Host. Mutually exclusive with `instanceType`.
     */
    readonly instanceFamily?: pulumi.Input<string>;
    /**
     * Specifies the instance type for which to configure your Dedicated Host. When you specify the instance type, that is the only instance type that you can launch onto that host. Mutually exclusive with `instanceFamily`.
     */
    readonly instanceType?: pulumi.Input<string>;
    readonly tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}