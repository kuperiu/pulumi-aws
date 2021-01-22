// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package waf

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi-aws/sdk/v3/go/aws"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "aws:waf/byteMatchSet:ByteMatchSet":
		r, err = NewByteMatchSet(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/geoMatchSet:GeoMatchSet":
		r, err = NewGeoMatchSet(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/ipSet:IpSet":
		r, err = NewIpSet(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/rateBasedRule:RateBasedRule":
		r, err = NewRateBasedRule(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/regexMatchSet:RegexMatchSet":
		r, err = NewRegexMatchSet(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/regexPatternSet:RegexPatternSet":
		r, err = NewRegexPatternSet(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/rule:Rule":
		r, err = NewRule(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/ruleGroup:RuleGroup":
		r, err = NewRuleGroup(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/sizeConstraintSet:SizeConstraintSet":
		r, err = NewSizeConstraintSet(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/sqlInjectionMatchSet:SqlInjectionMatchSet":
		r, err = NewSqlInjectionMatchSet(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/webAcl:WebAcl":
		r, err = NewWebAcl(ctx, name, nil, pulumi.URN_(urn))
	case "aws:waf/xssMatchSet:XssMatchSet":
		r, err = NewXssMatchSet(ctx, name, nil, pulumi.URN_(urn))
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	return
}

func init() {
	version, err := aws.PkgVersion()
	if err != nil {
		fmt.Println("failed to determine package version. defaulting to v1: %v", err)
	}
	pulumi.RegisterResourceModule(
		"aws",
		"waf/byteMatchSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/geoMatchSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/ipSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/rateBasedRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/regexMatchSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/regexPatternSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/rule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/ruleGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/sizeConstraintSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/sqlInjectionMatchSet",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/webAcl",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"aws",
		"waf/xssMatchSet",
		&module{version},
	)
}