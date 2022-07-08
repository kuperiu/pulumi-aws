// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sfn;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sfn.StateMachineArgs;
import com.pulumi.aws.sfn.inputs.StateMachineState;
import com.pulumi.aws.sfn.outputs.StateMachineLoggingConfiguration;
import com.pulumi.aws.sfn.outputs.StateMachineTracingConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Step Function State Machine resource
 * 
 * ## Example Usage
 * ### Basic (Standard Workflow)
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
 *         var sfnStateMachine = new StateMachine(&#34;sfnStateMachine&#34;, StateMachineArgs.builder()        
 *             .roleArn(aws_iam_role.iam_for_sfn().arn())
 *             .definition(&#34;&#34;&#34;
 * {
 *   &#34;Comment&#34;: &#34;A Hello World example of the Amazon States Language using an AWS Lambda Function&#34;,
 *   &#34;StartAt&#34;: &#34;HelloWorld&#34;,
 *   &#34;States&#34;: {
 *     &#34;HelloWorld&#34;: {
 *       &#34;Type&#34;: &#34;Task&#34;,
 *       &#34;Resource&#34;: &#34;%s&#34;,
 *       &#34;End&#34;: true
 *     }
 *   }
 * }
 * &#34;, aws_lambda_function.lambda().arn()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Basic (Express Workflow)
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
 *         var sfnStateMachine = new StateMachine(&#34;sfnStateMachine&#34;, StateMachineArgs.builder()        
 *             .roleArn(aws_iam_role.iam_for_sfn().arn())
 *             .type(&#34;EXPRESS&#34;)
 *             .definition(&#34;&#34;&#34;
 * {
 *   &#34;Comment&#34;: &#34;A Hello World example of the Amazon States Language using an AWS Lambda Function&#34;,
 *   &#34;StartAt&#34;: &#34;HelloWorld&#34;,
 *   &#34;States&#34;: {
 *     &#34;HelloWorld&#34;: {
 *       &#34;Type&#34;: &#34;Task&#34;,
 *       &#34;Resource&#34;: &#34;%s&#34;,
 *       &#34;End&#34;: true
 *     }
 *   }
 * }
 * &#34;, aws_lambda_function.lambda().arn()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Logging
 * 
 * &gt; *NOTE:* See the [AWS Step Functions Developer Guide](https://docs.aws.amazon.com/step-functions/latest/dg/welcome.html) for more information about enabling Step Function logging.
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
 *         var sfnStateMachine = new StateMachine(&#34;sfnStateMachine&#34;, StateMachineArgs.builder()        
 *             .roleArn(aws_iam_role.iam_for_sfn().arn())
 *             .definition(&#34;&#34;&#34;
 * {
 *   &#34;Comment&#34;: &#34;A Hello World example of the Amazon States Language using an AWS Lambda Function&#34;,
 *   &#34;StartAt&#34;: &#34;HelloWorld&#34;,
 *   &#34;States&#34;: {
 *     &#34;HelloWorld&#34;: {
 *       &#34;Type&#34;: &#34;Task&#34;,
 *       &#34;Resource&#34;: &#34;%s&#34;,
 *       &#34;End&#34;: true
 *     }
 *   }
 * }
 * &#34;, aws_lambda_function.lambda().arn()))
 *             .loggingConfiguration(StateMachineLoggingConfigurationArgs.builder()
 *                 .logDestination(String.format(&#34;%s:*&#34;, aws_cloudwatch_log_group.log_group_for_sfn().arn()))
 *                 .includeExecutionData(true)
 *                 .level(&#34;ERROR&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * State Machines can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sfn/stateMachine:StateMachine foo arn:aws:states:eu-west-1:123456789098:stateMachine:bar
 * ```
 * 
 */
@ResourceType(type="aws:sfn/stateMachine:StateMachine")
public class StateMachine extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the state machine.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the state machine.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The date the state machine was created.
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The date the state machine was created.
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
     * 
     */
    @Export(name="definition", type=String.class, parameters={})
    private Output<String> definition;

    /**
     * @return The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
     * 
     */
    public Output<String> definition() {
        return this.definition;
    }
    /**
     * Defines what execution history events are logged and where they are logged. The `logging_configuration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
     * 
     */
    @Export(name="loggingConfiguration", type=StateMachineLoggingConfiguration.class, parameters={})
    private Output<StateMachineLoggingConfiguration> loggingConfiguration;

    /**
     * @return Defines what execution history events are logged and where they are logged. The `logging_configuration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
     * 
     */
    public Output<StateMachineLoggingConfiguration> loggingConfiguration() {
        return this.loggingConfiguration;
    }
    /**
     * The name of the state machine. To enable logging with CloudWatch Logs, the name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the state machine. To enable logging with CloudWatch Logs, the name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * The current status of the state machine. Either `ACTIVE` or `DELETING`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The current status of the state machine. Either `ACTIVE` or `DELETING`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Selects whether AWS X-Ray tracing is enabled.
     * 
     */
    @Export(name="tracingConfiguration", type=StateMachineTracingConfiguration.class, parameters={})
    private Output<StateMachineTracingConfiguration> tracingConfiguration;

    /**
     * @return Selects whether AWS X-Ray tracing is enabled.
     * 
     */
    public Output<StateMachineTracingConfiguration> tracingConfiguration() {
        return this.tracingConfiguration;
    }
    /**
     * Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StateMachine(String name) {
        this(name, StateMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StateMachine(String name, StateMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StateMachine(String name, StateMachineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sfn/stateMachine:StateMachine", name, args == null ? StateMachineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StateMachine(String name, Output<String> id, @Nullable StateMachineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sfn/stateMachine:StateMachine", name, state, makeResourceOptions(options, id));
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
    public static StateMachine get(String name, Output<String> id, @Nullable StateMachineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StateMachine(name, id, state, options);
    }
}