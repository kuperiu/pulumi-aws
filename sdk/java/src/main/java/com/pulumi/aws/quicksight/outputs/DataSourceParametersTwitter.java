// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataSourceParametersTwitter {
    /**
     * @return The maximum number of rows to query.
     * 
     */
    private final Integer maxRows;
    /**
     * @return The Twitter query to retrieve the data.
     * 
     */
    private final String query;

    @CustomType.Constructor
    private DataSourceParametersTwitter(
        @CustomType.Parameter("maxRows") Integer maxRows,
        @CustomType.Parameter("query") String query) {
        this.maxRows = maxRows;
        this.query = query;
    }

    /**
     * @return The maximum number of rows to query.
     * 
     */
    public Integer maxRows() {
        return this.maxRows;
    }
    /**
     * @return The Twitter query to retrieve the data.
     * 
     */
    public String query() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersTwitter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRows;
        private String query;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersTwitter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRows = defaults.maxRows;
    	      this.query = defaults.query;
        }

        public Builder maxRows(Integer maxRows) {
            this.maxRows = Objects.requireNonNull(maxRows);
            return this;
        }
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }        public DataSourceParametersTwitter build() {
            return new DataSourceParametersTwitter(maxRows, query);
        }
    }
}