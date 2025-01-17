// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.outputs;

import com.pulumi.aws.imagebuilder.outputs.GetImageRecipeComponentParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetImageRecipeComponent {
    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Component.
     * 
     */
    private String componentArn;
    /**
     * @return Set of parameters that are used to configure the component.
     * 
     */
    private List<GetImageRecipeComponentParameter> parameters;

    private GetImageRecipeComponent() {}
    /**
     * @return Amazon Resource Name (ARN) of the Image Builder Component.
     * 
     */
    public String componentArn() {
        return this.componentArn;
    }
    /**
     * @return Set of parameters that are used to configure the component.
     * 
     */
    public List<GetImageRecipeComponentParameter> parameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageRecipeComponent defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String componentArn;
        private List<GetImageRecipeComponentParameter> parameters;
        public Builder() {}
        public Builder(GetImageRecipeComponent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder componentArn(String componentArn) {
            this.componentArn = Objects.requireNonNull(componentArn);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(List<GetImageRecipeComponentParameter> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GetImageRecipeComponentParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public GetImageRecipeComponent build() {
            final var o = new GetImageRecipeComponent();
            o.componentArn = componentArn;
            o.parameters = parameters;
            return o;
        }
    }
}
