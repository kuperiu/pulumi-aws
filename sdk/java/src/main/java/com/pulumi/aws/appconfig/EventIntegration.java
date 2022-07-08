// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appconfig.EventIntegrationArgs;
import com.pulumi.aws.appconfig.inputs.EventIntegrationState;
import com.pulumi.aws.appconfig.outputs.EventIntegrationEventFilter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon AppIntegrations Event Integration resource.
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
 *         var example = new EventIntegration(&#34;example&#34;, EventIntegrationArgs.builder()        
 *             .description(&#34;Example Description&#34;)
 *             .eventFilter(EventIntegrationEventFilterArgs.builder()
 *                 .source(&#34;aws.partner/examplepartner.com&#34;)
 *                 .build())
 *             .eventbridgeBus(&#34;default&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;Example Event Integration&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Amazon AppIntegrations Event Integrations can be imported using the `name` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appconfig/eventIntegration:EventIntegration example example-name
 * ```
 * 
 */
@ResourceType(type="aws:appconfig/eventIntegration:EventIntegration")
public class EventIntegration extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Event Integration.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Event Integration.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies the description of the Event Integration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description of the Event Integration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A block that defines the configuration information for the event filter. The Event Filter block is documented below.
     * 
     */
    @Export(name="eventFilter", type=EventIntegrationEventFilter.class, parameters={})
    private Output<EventIntegrationEventFilter> eventFilter;

    /**
     * @return A block that defines the configuration information for the event filter. The Event Filter block is documented below.
     * 
     */
    public Output<EventIntegrationEventFilter> eventFilter() {
        return this.eventFilter;
    }
    /**
     * Specifies the EventBridge bus.
     * 
     */
    @Export(name="eventbridgeBus", type=String.class, parameters={})
    private Output<String> eventbridgeBus;

    /**
     * @return Specifies the EventBridge bus.
     * 
     */
    public Output<String> eventbridgeBus() {
        return this.eventbridgeBus;
    }
    /**
     * Specifies the name of the Event Integration.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Event Integration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Tags to apply to the Event Integration. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the Event Integration. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventIntegration(String name) {
        this(name, EventIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventIntegration(String name, EventIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventIntegration(String name, EventIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/eventIntegration:EventIntegration", name, args == null ? EventIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventIntegration(String name, Output<String> id, @Nullable EventIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/eventIntegration:EventIntegration", name, state, makeResourceOptions(options, id));
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
    public static EventIntegration get(String name, Output<String> id, @Nullable EventIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventIntegration(name, id, state, options);
    }
}