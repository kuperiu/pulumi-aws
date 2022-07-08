// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ses.ReceiptRuleSetArgs;
import com.pulumi.aws.ses.inputs.ReceiptRuleSetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SES receipt rule set resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var main = new ReceiptRuleSet(&#34;main&#34;, ReceiptRuleSetArgs.builder()        
 *             .ruleSetName(&#34;primary-rules&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SES receipt rule sets can be imported using the rule set name.
 * 
 * ```sh
 *  $ pulumi import aws:ses/receiptRuleSet:ReceiptRuleSet my_rule_set my_rule_set_name
 * ```
 * 
 */
@ResourceType(type="aws:ses/receiptRuleSet:ReceiptRuleSet")
public class ReceiptRuleSet extends com.pulumi.resources.CustomResource {
    /**
     * SES receipt rule set ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return SES receipt rule set ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Name of the rule set.
     * 
     */
    @Export(name="ruleSetName", type=String.class, parameters={})
    private Output<String> ruleSetName;

    /**
     * @return Name of the rule set.
     * 
     */
    public Output<String> ruleSetName() {
        return this.ruleSetName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReceiptRuleSet(String name) {
        this(name, ReceiptRuleSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReceiptRuleSet(String name, ReceiptRuleSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReceiptRuleSet(String name, ReceiptRuleSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptRuleSet:ReceiptRuleSet", name, args == null ? ReceiptRuleSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReceiptRuleSet(String name, Output<String> id, @Nullable ReceiptRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptRuleSet:ReceiptRuleSet", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ReceiptRuleSet get(String name, Output<String> id, @Nullable ReceiptRuleSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReceiptRuleSet(name, id, state, options);
    }
}