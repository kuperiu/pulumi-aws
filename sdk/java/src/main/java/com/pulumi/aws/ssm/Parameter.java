// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ssm.ParameterArgs;
import com.pulumi.aws.ssm.inputs.ParameterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an SSM Parameter resource.
 * 
 * ## Example Usage
 * 
 * To store a basic string parameter:
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
 *         var foo = new Parameter(&#34;foo&#34;, ParameterArgs.builder()        
 *             .type(&#34;String&#34;)
 *             .value(&#34;bar&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * To store an encrypted string using the default SSM KMS key:
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
 *         var default_ = new Instance(&#34;default&#34;, InstanceArgs.builder()        
 *             .allocatedStorage(10)
 *             .storageType(&#34;gp2&#34;)
 *             .engine(&#34;mysql&#34;)
 *             .engineVersion(&#34;5.7.16&#34;)
 *             .instanceClass(&#34;db.t2.micro&#34;)
 *             .name(&#34;mydb&#34;)
 *             .username(&#34;foo&#34;)
 *             .password(var_.database_master_password())
 *             .dbSubnetGroupName(&#34;my_database_subnet_group&#34;)
 *             .parameterGroupName(&#34;default.mysql5.7&#34;)
 *             .build());
 * 
 *         var secret = new Parameter(&#34;secret&#34;, ParameterArgs.builder()        
 *             .description(&#34;The parameter description&#34;)
 *             .type(&#34;SecureString&#34;)
 *             .value(var_.database_master_password())
 *             .tags(Map.of(&#34;environment&#34;, &#34;production&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SSM Parameters can be imported using the `parameter store name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssm/parameter:Parameter my_param /my_path/my_paramname
 * ```
 * 
 */
@ResourceType(type="aws:ssm/parameter:Parameter")
public class Parameter extends com.pulumi.resources.CustomResource {
    /**
     * A regular expression used to validate the parameter value.
     * 
     */
    @Export(name="allowedPattern", type=String.class, parameters={})
    private Output</* @Nullable */ String> allowedPattern;

    /**
     * @return A regular expression used to validate the parameter value.
     * 
     */
    public Output<Optional<String>> allowedPattern() {
        return Codegen.optional(this.allowedPattern);
    }
    /**
     * The ARN of the parameter.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the parameter.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The data_type of the parameter. Valid values: text and aws:ec2:image for AMI format, see the [Native parameter support for Amazon Machine Image IDs
     * ](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html)
     * 
     */
    @Export(name="dataType", type=String.class, parameters={})
    private Output<String> dataType;

    /**
     * @return The data_type of the parameter. Valid values: text and aws:ec2:image for AMI format, see the [Native parameter support for Amazon Machine Image IDs
     * ](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html)
     * 
     */
    public Output<String> dataType() {
        return this.dataType;
    }
    /**
     * The description of the parameter.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the parameter.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The KMS key id or arn for encrypting a SecureString.
     * 
     */
    @Export(name="keyId", type=String.class, parameters={})
    private Output<String> keyId;

    /**
     * @return The KMS key id or arn for encrypting a SecureString.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }
    /**
     * The name of the parameter. If the name contains a path (e.g., any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the parameter. If the name contains a path (e.g., any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
     * 
     */
    @Export(name="overwrite", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> overwrite;

    /**
     * @return Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
     * 
     */
    public Output<Optional<Boolean>> overwrite() {
        return Codegen.optional(this.overwrite);
    }
    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The parameter tier to assign to the parameter.
     * If not specified, will use the default parameter tier for the region.
     * Valid tiers are `Standard`, `Advanced`, and `Intelligent-Tiering`.
     * Downgrading an `Advanced` tier parameter to `Standard` will recreate the resource.
     * For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return The parameter tier to assign to the parameter.
     * If not specified, will use the default parameter tier for the region.
     * Valid tiers are `Standard`, `Advanced`, and `Intelligent-Tiering`.
     * Downgrading an `Advanced` tier parameter to `Standard` will recreate the resource.
     * For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }
    /**
     * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The value of the parameter.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return The value of the parameter.
     * 
     */
    public Output<String> value() {
        return this.value;
    }
    /**
     * The version of the parameter.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return The version of the parameter.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Parameter(String name) {
        this(name, ParameterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Parameter(String name, ParameterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Parameter(String name, ParameterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/parameter:Parameter", name, args == null ? ParameterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Parameter(String name, Output<String> id, @Nullable ParameterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/parameter:Parameter", name, state, makeResourceOptions(options, id));
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
    public static Parameter get(String name, Output<String> id, @Nullable ParameterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Parameter(name, id, state, options);
    }
}