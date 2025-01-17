// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.aws.connect.outputs.GetBotAssociationLexBot;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBotAssociationResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceId;
    private GetBotAssociationLexBot lexBot;

    private GetBotAssociationResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public GetBotAssociationLexBot lexBot() {
        return this.lexBot;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotAssociationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String instanceId;
        private GetBotAssociationLexBot lexBot;
        public Builder() {}
        public Builder(GetBotAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.lexBot = defaults.lexBot;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder lexBot(GetBotAssociationLexBot lexBot) {
            this.lexBot = Objects.requireNonNull(lexBot);
            return this;
        }
        public GetBotAssociationResult build() {
            final var o = new GetBotAssociationResult();
            o.id = id;
            o.instanceId = instanceId;
            o.lexBot = lexBot;
            return o;
        }
    }
}
