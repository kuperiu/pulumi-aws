// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.datapipeline.PipelineDefinitionArgs;
import com.pulumi.aws.datapipeline.inputs.PipelineDefinitionState;
import com.pulumi.aws.datapipeline.outputs.PipelineDefinitionParameterObject;
import com.pulumi.aws.datapipeline.outputs.PipelineDefinitionParameterValue;
import com.pulumi.aws.datapipeline.outputs.PipelineDefinitionPipelineObject;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DataPipeline Pipeline Definition resource.
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
 *         var default_ = new Pipeline(&#34;default&#34;);
 * 
 *         var example = new PipelineDefinition(&#34;example&#34;, PipelineDefinitionArgs.builder()        
 *             .pipelineId(default_.id())
 *             .pipelineObjects(            
 *                 PipelineDefinitionPipelineObjectArgs.builder()
 *                     .id(&#34;Default&#34;)
 *                     .name(&#34;Default&#34;)
 *                     .fields(PipelineDefinitionPipelineObjectFieldArgs.builder()
 *                         .key(&#34;workerGroup&#34;)
 *                         .stringValue(&#34;workerGroup&#34;)
 *                         .build())
 *                     .build(),
 *                 PipelineDefinitionPipelineObjectArgs.builder()
 *                     .id(&#34;Schedule&#34;)
 *                     .name(&#34;Schedule&#34;)
 *                     .fields(                    
 *                         PipelineDefinitionPipelineObjectFieldArgs.builder()
 *                             .key(&#34;startDateTime&#34;)
 *                             .stringValue(&#34;2012-12-12T00:00:00&#34;)
 *                             .build(),
 *                         PipelineDefinitionPipelineObjectFieldArgs.builder()
 *                             .key(&#34;type&#34;)
 *                             .stringValue(&#34;Schedule&#34;)
 *                             .build(),
 *                         PipelineDefinitionPipelineObjectFieldArgs.builder()
 *                             .key(&#34;period&#34;)
 *                             .stringValue(&#34;1 hour&#34;)
 *                             .build(),
 *                         PipelineDefinitionPipelineObjectFieldArgs.builder()
 *                             .key(&#34;endDateTime&#34;)
 *                             .stringValue(&#34;2012-12-21T18:00:00&#34;)
 *                             .build())
 *                     .build(),
 *                 PipelineDefinitionPipelineObjectArgs.builder()
 *                     .id(&#34;SayHello&#34;)
 *                     .name(&#34;SayHello&#34;)
 *                     .fields(                    
 *                         PipelineDefinitionPipelineObjectFieldArgs.builder()
 *                             .key(&#34;type&#34;)
 *                             .stringValue(&#34;ShellCommandActivity&#34;)
 *                             .build(),
 *                         PipelineDefinitionPipelineObjectFieldArgs.builder()
 *                             .key(&#34;command&#34;)
 *                             .stringValue(&#34;echo hello&#34;)
 *                             .build(),
 *                         PipelineDefinitionPipelineObjectFieldArgs.builder()
 *                             .key(&#34;parent&#34;)
 *                             .stringValue(&#34;Default&#34;)
 *                             .build(),
 *                         PipelineDefinitionPipelineObjectFieldArgs.builder()
 *                             .key(&#34;schedule&#34;)
 *                             .stringValue(&#34;Schedule&#34;)
 *                             .build())
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_datapipeline_pipeline_definition` can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:datapipeline/pipelineDefinition:PipelineDefinition example df-1234567890
 * ```
 * 
 */
@ResourceType(type="aws:datapipeline/pipelineDefinition:PipelineDefinition")
public class PipelineDefinition extends com.pulumi.resources.CustomResource {
    /**
     * Configuration block for the parameter objects used in the pipeline definition. See below
     * 
     */
    @Export(name="parameterObjects", type=List.class, parameters={PipelineDefinitionParameterObject.class})
    private Output</* @Nullable */ List<PipelineDefinitionParameterObject>> parameterObjects;

    /**
     * @return Configuration block for the parameter objects used in the pipeline definition. See below
     * 
     */
    public Output<Optional<List<PipelineDefinitionParameterObject>>> parameterObjects() {
        return Codegen.optional(this.parameterObjects);
    }
    /**
     * Configuration block for the parameter values used in the pipeline definition. See below
     * 
     */
    @Export(name="parameterValues", type=List.class, parameters={PipelineDefinitionParameterValue.class})
    private Output</* @Nullable */ List<PipelineDefinitionParameterValue>> parameterValues;

    /**
     * @return Configuration block for the parameter values used in the pipeline definition. See below
     * 
     */
    public Output<Optional<List<PipelineDefinitionParameterValue>>> parameterValues() {
        return Codegen.optional(this.parameterValues);
    }
    /**
     * ID of the pipeline.
     * 
     */
    @Export(name="pipelineId", type=String.class, parameters={})
    private Output<String> pipelineId;

    /**
     * @return ID of the pipeline.
     * 
     */
    public Output<String> pipelineId() {
        return this.pipelineId;
    }
    /**
     * Configuration block for the objects that define the pipeline. See below
     * 
     */
    @Export(name="pipelineObjects", type=List.class, parameters={PipelineDefinitionPipelineObject.class})
    private Output<List<PipelineDefinitionPipelineObject>> pipelineObjects;

    /**
     * @return Configuration block for the objects that define the pipeline. See below
     * 
     */
    public Output<List<PipelineDefinitionPipelineObject>> pipelineObjects() {
        return this.pipelineObjects;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PipelineDefinition(String name) {
        this(name, PipelineDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PipelineDefinition(String name, PipelineDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PipelineDefinition(String name, PipelineDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datapipeline/pipelineDefinition:PipelineDefinition", name, args == null ? PipelineDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PipelineDefinition(String name, Output<String> id, @Nullable PipelineDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datapipeline/pipelineDefinition:PipelineDefinition", name, state, makeResourceOptions(options, id));
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
    public static PipelineDefinition get(String name, Output<String> id, @Nullable PipelineDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PipelineDefinition(name, id, state, options);
    }
}