// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.GetCostCategoryRuleRuleAndCostCategory;
import com.pulumi.aws.costexplorer.outputs.GetCostCategoryRuleRuleAndDimension;
import com.pulumi.aws.costexplorer.outputs.GetCostCategoryRuleRuleAndTag;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCostCategoryRuleRuleAnd {
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    private List<GetCostCategoryRuleRuleAndCostCategory> costCategories;
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    private List<GetCostCategoryRuleRuleAndDimension> dimensions;
    /**
     * @return Resource tags.
     * 
     */
    private List<GetCostCategoryRuleRuleAndTag> tags;

    private GetCostCategoryRuleRuleAnd() {}
    /**
     * @return Configuration block for the filter that&#39;s based on `CostCategory` values. See below.
     * 
     */
    public List<GetCostCategoryRuleRuleAndCostCategory> costCategories() {
        return this.costCategories;
    }
    /**
     * @return Configuration block for the specific `Dimension` to use for `Expression`. See below.
     * 
     */
    public List<GetCostCategoryRuleRuleAndDimension> dimensions() {
        return this.dimensions;
    }
    /**
     * @return Resource tags.
     * 
     */
    public List<GetCostCategoryRuleRuleAndTag> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostCategoryRuleRuleAnd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetCostCategoryRuleRuleAndCostCategory> costCategories;
        private List<GetCostCategoryRuleRuleAndDimension> dimensions;
        private List<GetCostCategoryRuleRuleAndTag> tags;
        public Builder() {}
        public Builder(GetCostCategoryRuleRuleAnd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.costCategories = defaults.costCategories;
    	      this.dimensions = defaults.dimensions;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder costCategories(List<GetCostCategoryRuleRuleAndCostCategory> costCategories) {
            this.costCategories = Objects.requireNonNull(costCategories);
            return this;
        }
        public Builder costCategories(GetCostCategoryRuleRuleAndCostCategory... costCategories) {
            return costCategories(List.of(costCategories));
        }
        @CustomType.Setter
        public Builder dimensions(List<GetCostCategoryRuleRuleAndDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(GetCostCategoryRuleRuleAndDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        @CustomType.Setter
        public Builder tags(List<GetCostCategoryRuleRuleAndTag> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(GetCostCategoryRuleRuleAndTag... tags) {
            return tags(List.of(tags));
        }
        public GetCostCategoryRuleRuleAnd build() {
            final var o = new GetCostCategoryRuleRuleAnd();
            o.costCategories = costCategories;
            o.dimensions = dimensions;
            o.tags = tags;
            return o;
        }
    }
}
