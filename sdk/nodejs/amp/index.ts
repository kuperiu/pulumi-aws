// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./alertManagerDefinition";
export * from "./getWorkspace";
export * from "./ruleGroupNamespace";
export * from "./workspace";

// Import resources to register:
import { AlertManagerDefinition } from "./alertManagerDefinition";
import { RuleGroupNamespace } from "./ruleGroupNamespace";
import { Workspace } from "./workspace";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:amp/alertManagerDefinition:AlertManagerDefinition":
                return new AlertManagerDefinition(name, <any>undefined, { urn })
            case "aws:amp/ruleGroupNamespace:RuleGroupNamespace":
                return new RuleGroupNamespace(name, <any>undefined, { urn })
            case "aws:amp/workspace:Workspace":
                return new Workspace(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "amp/alertManagerDefinition", _module)
pulumi.runtime.registerResourceModule("aws", "amp/ruleGroupNamespace", _module)
pulumi.runtime.registerResourceModule("aws", "amp/workspace", _module)
