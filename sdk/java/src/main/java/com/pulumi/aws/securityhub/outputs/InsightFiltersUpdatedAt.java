// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.aws.securityhub.outputs.InsightFiltersUpdatedAtDateRange;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InsightFiltersUpdatedAt {
    /**
     * @return A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    private final @Nullable InsightFiltersUpdatedAtDateRange dateRange;
    /**
     * @return An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    private final @Nullable String end;
    /**
     * @return A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    private final @Nullable String start;

    @CustomType.Constructor
    private InsightFiltersUpdatedAt(
        @CustomType.Parameter("dateRange") @Nullable InsightFiltersUpdatedAtDateRange dateRange,
        @CustomType.Parameter("end") @Nullable String end,
        @CustomType.Parameter("start") @Nullable String start) {
        this.dateRange = dateRange;
        this.end = end;
        this.start = start;
    }

    /**
     * @return A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    public Optional<InsightFiltersUpdatedAtDateRange> dateRange() {
        return Optional.ofNullable(this.dateRange);
    }
    /**
     * @return An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    public Optional<String> end() {
        return Optional.ofNullable(this.end);
    }
    /**
     * @return A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    public Optional<String> start() {
        return Optional.ofNullable(this.start);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersUpdatedAt defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InsightFiltersUpdatedAtDateRange dateRange;
        private @Nullable String end;
        private @Nullable String start;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersUpdatedAt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateRange = defaults.dateRange;
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder dateRange(@Nullable InsightFiltersUpdatedAtDateRange dateRange) {
            this.dateRange = dateRange;
            return this;
        }
        public Builder end(@Nullable String end) {
            this.end = end;
            return this;
        }
        public Builder start(@Nullable String start) {
            this.start = start;
            return this;
        }        public InsightFiltersUpdatedAt build() {
            return new InsightFiltersUpdatedAt(dateRange, end, start);
        }
    }
}