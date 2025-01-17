// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./byteMatchSet";
export * from "./geoMatchSet";
export * from "./getIpset";
export * from "./getRateBasedMod";
export * from "./getRule";
export * from "./getSubscribedRuleGroup";
export * from "./getWebAcl";
export * from "./ipSet";
export * from "./rateBasedRule";
export * from "./regexMatchSet";
export * from "./regexPatternSet";
export * from "./rule";
export * from "./ruleGroup";
export * from "./sizeConstraintSet";
export * from "./sqlInjectionMatchSet";
export * from "./webAcl";
export * from "./webAclAssociation";
export * from "./xssMatchSet";

// Import resources to register:
import { ByteMatchSet } from "./byteMatchSet";
import { GeoMatchSet } from "./geoMatchSet";
import { IpSet } from "./ipSet";
import { RateBasedRule } from "./rateBasedRule";
import { RegexMatchSet } from "./regexMatchSet";
import { RegexPatternSet } from "./regexPatternSet";
import { Rule } from "./rule";
import { RuleGroup } from "./ruleGroup";
import { SizeConstraintSet } from "./sizeConstraintSet";
import { SqlInjectionMatchSet } from "./sqlInjectionMatchSet";
import { WebAcl } from "./webAcl";
import { WebAclAssociation } from "./webAclAssociation";
import { XssMatchSet } from "./xssMatchSet";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:wafregional/byteMatchSet:ByteMatchSet":
                return new ByteMatchSet(name, <any>undefined, { urn })
            case "aws:wafregional/geoMatchSet:GeoMatchSet":
                return new GeoMatchSet(name, <any>undefined, { urn })
            case "aws:wafregional/ipSet:IpSet":
                return new IpSet(name, <any>undefined, { urn })
            case "aws:wafregional/rateBasedRule:RateBasedRule":
                return new RateBasedRule(name, <any>undefined, { urn })
            case "aws:wafregional/regexMatchSet:RegexMatchSet":
                return new RegexMatchSet(name, <any>undefined, { urn })
            case "aws:wafregional/regexPatternSet:RegexPatternSet":
                return new RegexPatternSet(name, <any>undefined, { urn })
            case "aws:wafregional/rule:Rule":
                return new Rule(name, <any>undefined, { urn })
            case "aws:wafregional/ruleGroup:RuleGroup":
                return new RuleGroup(name, <any>undefined, { urn })
            case "aws:wafregional/sizeConstraintSet:SizeConstraintSet":
                return new SizeConstraintSet(name, <any>undefined, { urn })
            case "aws:wafregional/sqlInjectionMatchSet:SqlInjectionMatchSet":
                return new SqlInjectionMatchSet(name, <any>undefined, { urn })
            case "aws:wafregional/webAcl:WebAcl":
                return new WebAcl(name, <any>undefined, { urn })
            case "aws:wafregional/webAclAssociation:WebAclAssociation":
                return new WebAclAssociation(name, <any>undefined, { urn })
            case "aws:wafregional/xssMatchSet:XssMatchSet":
                return new XssMatchSet(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "wafregional/byteMatchSet", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/geoMatchSet", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/ipSet", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/rateBasedRule", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/regexMatchSet", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/regexPatternSet", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/rule", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/ruleGroup", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/sizeConstraintSet", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/sqlInjectionMatchSet", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/webAcl", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/webAclAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "wafregional/xssMatchSet", _module)
