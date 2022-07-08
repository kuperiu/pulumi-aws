// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iot.LoggingOptionsArgs;
import com.pulumi.aws.iot.inputs.LoggingOptionsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage [default logging options](https://docs.aws.amazon.com/iot/latest/developerguide/configure-logging.html#configure-logging-console).
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
 *         var example = new LoggingOptions(&#34;example&#34;, LoggingOptionsArgs.builder()        
 *             .defaultLogLevel(&#34;WARN&#34;)
 *             .roleArn(aws_iam_role.example().arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:iot/loggingOptions:LoggingOptions")
public class LoggingOptions extends com.pulumi.resources.CustomResource {
    /**
     * The default logging level. Valid Values: `&#34;DEBUG&#34;`, `&#34;INFO&#34;`, `&#34;ERROR&#34;`, `&#34;WARN&#34;`, `&#34;DISABLED&#34;`.
     * 
     */
    @Export(name="defaultLogLevel", type=String.class, parameters={})
    private Output<String> defaultLogLevel;

    /**
     * @return The default logging level. Valid Values: `&#34;DEBUG&#34;`, `&#34;INFO&#34;`, `&#34;ERROR&#34;`, `&#34;WARN&#34;`, `&#34;DISABLED&#34;`.
     * 
     */
    public Output<String> defaultLogLevel() {
        return this.defaultLogLevel;
    }
    /**
     * If `true` all logs are disabled. The default is `false`.
     * 
     */
    @Export(name="disableAllLogs", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableAllLogs;

    /**
     * @return If `true` all logs are disabled. The default is `false`.
     * 
     */
    public Output<Optional<Boolean>> disableAllLogs() {
        return Codegen.optional(this.disableAllLogs);
    }
    /**
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoggingOptions(String name) {
        this(name, LoggingOptionsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoggingOptions(String name, LoggingOptionsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoggingOptions(String name, LoggingOptionsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/loggingOptions:LoggingOptions", name, args == null ? LoggingOptionsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoggingOptions(String name, Output<String> id, @Nullable LoggingOptionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/loggingOptions:LoggingOptions", name, state, makeResourceOptions(options, id));
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
    public static LoggingOptions get(String name, Output<String> id, @Nullable LoggingOptionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoggingOptions(name, id, state, options);
    }
}