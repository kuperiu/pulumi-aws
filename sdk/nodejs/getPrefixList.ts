// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";

/**
 * `aws_prefix_list` provides details about a specific prefix list (PL)
 * in the current region.
 * 
 * This can be used both to validate a prefix list given in a variable
 * and to obtain the CIDR blocks (IP address ranges) for the associated
 * AWS service. The latter may be useful e.g. for adding network ACL
 * rules.
 */
export function getPrefixList(args?: GetPrefixListArgs): Promise<GetPrefixListResult> {
    args = args || {};
    return pulumi.runtime.invoke("aws:index/getPrefixList:getPrefixList", {
        "name": args.name,
        "prefixListId": args.prefixListId,
    });
}

/**
 * A collection of arguments for invoking getPrefixList.
 */
export interface GetPrefixListArgs {
    /**
     * The name of the prefix list to select.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The ID of the prefix list to select.
     */
    readonly prefixListId?: pulumi.Input<string>;
}

/**
 * A collection of values returned by getPrefixList.
 */
export interface GetPrefixListResult {
    /**
     * The list of CIDR blocks for the AWS service associated
     * with the prefix list.
     */
    readonly cidrBlocks: string[];
    /**
     * The name of the selected prefix list.
     */
    readonly name: string;
}