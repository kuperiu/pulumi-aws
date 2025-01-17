// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetIndexDocumentMetadataConfigurationUpdateSearch {
    /**
     * @return Determines whether the field is returned in the query response. The default is `true`.
     * 
     */
    private Boolean displayable;
    /**
     * @return Indicates that the field can be used to create search facets, a count of results for each value in the field. The default is `false`.
     * 
     */
    private Boolean facetable;
    /**
     * @return Determines whether the field is used in the search. If the Searchable field is true, you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is `true` for `string` fields and `false` for `number` and `date` fields.
     * 
     */
    private Boolean searchable;
    /**
     * @return Determines whether the field can be used to sort the results of a query. If you specify sorting on a field that does not have Sortable set to true, Amazon Kendra returns an exception. The default is `false`.
     * 
     */
    private Boolean sortable;

    private GetIndexDocumentMetadataConfigurationUpdateSearch() {}
    /**
     * @return Determines whether the field is returned in the query response. The default is `true`.
     * 
     */
    public Boolean displayable() {
        return this.displayable;
    }
    /**
     * @return Indicates that the field can be used to create search facets, a count of results for each value in the field. The default is `false`.
     * 
     */
    public Boolean facetable() {
        return this.facetable;
    }
    /**
     * @return Determines whether the field is used in the search. If the Searchable field is true, you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is `true` for `string` fields and `false` for `number` and `date` fields.
     * 
     */
    public Boolean searchable() {
        return this.searchable;
    }
    /**
     * @return Determines whether the field can be used to sort the results of a query. If you specify sorting on a field that does not have Sortable set to true, Amazon Kendra returns an exception. The default is `false`.
     * 
     */
    public Boolean sortable() {
        return this.sortable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexDocumentMetadataConfigurationUpdateSearch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean displayable;
        private Boolean facetable;
        private Boolean searchable;
        private Boolean sortable;
        public Builder() {}
        public Builder(GetIndexDocumentMetadataConfigurationUpdateSearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayable = defaults.displayable;
    	      this.facetable = defaults.facetable;
    	      this.searchable = defaults.searchable;
    	      this.sortable = defaults.sortable;
        }

        @CustomType.Setter
        public Builder displayable(Boolean displayable) {
            this.displayable = Objects.requireNonNull(displayable);
            return this;
        }
        @CustomType.Setter
        public Builder facetable(Boolean facetable) {
            this.facetable = Objects.requireNonNull(facetable);
            return this;
        }
        @CustomType.Setter
        public Builder searchable(Boolean searchable) {
            this.searchable = Objects.requireNonNull(searchable);
            return this;
        }
        @CustomType.Setter
        public Builder sortable(Boolean sortable) {
            this.sortable = Objects.requireNonNull(sortable);
            return this;
        }
        public GetIndexDocumentMetadataConfigurationUpdateSearch build() {
            final var o = new GetIndexDocumentMetadataConfigurationUpdateSearch();
            o.displayable = displayable;
            o.facetable = facetable;
            o.searchable = searchable;
            o.sortable = sortable;
            return o;
        }
    }
}
