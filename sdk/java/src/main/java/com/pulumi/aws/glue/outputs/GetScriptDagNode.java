// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.aws.glue.outputs.GetScriptDagNodeArg;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScriptDagNode {
    /**
     * @return Nested configuration an argument or property of a node. Defined below.
     * 
     */
    private List<GetScriptDagNodeArg> args;
    /**
     * @return A node identifier that is unique within the node&#39;s graph.
     * 
     */
    private String id;
    /**
     * @return The line number of the node.
     * 
     */
    private @Nullable Integer lineNumber;
    /**
     * @return The type of node this is.
     * 
     */
    private String nodeType;

    private GetScriptDagNode() {}
    /**
     * @return Nested configuration an argument or property of a node. Defined below.
     * 
     */
    public List<GetScriptDagNodeArg> args() {
        return this.args;
    }
    /**
     * @return A node identifier that is unique within the node&#39;s graph.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The line number of the node.
     * 
     */
    public Optional<Integer> lineNumber() {
        return Optional.ofNullable(this.lineNumber);
    }
    /**
     * @return The type of node this is.
     * 
     */
    public String nodeType() {
        return this.nodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptDagNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetScriptDagNodeArg> args;
        private String id;
        private @Nullable Integer lineNumber;
        private String nodeType;
        public Builder() {}
        public Builder(GetScriptDagNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.id = defaults.id;
    	      this.lineNumber = defaults.lineNumber;
    	      this.nodeType = defaults.nodeType;
        }

        @CustomType.Setter
        public Builder args(List<GetScriptDagNodeArg> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(GetScriptDagNodeArg... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder lineNumber(@Nullable Integer lineNumber) {
            this.lineNumber = lineNumber;
            return this;
        }
        @CustomType.Setter
        public Builder nodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }
        public GetScriptDagNode build() {
            final var o = new GetScriptDagNode();
            o.args = args;
            o.id = id;
            o.lineNumber = lineNumber;
            o.nodeType = nodeType;
            return o;
        }
    }
}
