// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class AnalyticsConfigurationStorageClassAnalysisArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnalyticsConfigurationStorageClassAnalysisArgs Empty = new AnalyticsConfigurationStorageClassAnalysisArgs();

    /**
     * Data export configuration (documented below).
     * 
     */
    @Import(name="dataExport", required=true)
    private Output<AnalyticsConfigurationStorageClassAnalysisDataExportArgs> dataExport;

    /**
     * @return Data export configuration (documented below).
     * 
     */
    public Output<AnalyticsConfigurationStorageClassAnalysisDataExportArgs> dataExport() {
        return this.dataExport;
    }

    private AnalyticsConfigurationStorageClassAnalysisArgs() {}

    private AnalyticsConfigurationStorageClassAnalysisArgs(AnalyticsConfigurationStorageClassAnalysisArgs $) {
        this.dataExport = $.dataExport;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnalyticsConfigurationStorageClassAnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnalyticsConfigurationStorageClassAnalysisArgs $;

        public Builder() {
            $ = new AnalyticsConfigurationStorageClassAnalysisArgs();
        }

        public Builder(AnalyticsConfigurationStorageClassAnalysisArgs defaults) {
            $ = new AnalyticsConfigurationStorageClassAnalysisArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataExport Data export configuration (documented below).
         * 
         * @return builder
         * 
         */
        public Builder dataExport(Output<AnalyticsConfigurationStorageClassAnalysisDataExportArgs> dataExport) {
            $.dataExport = dataExport;
            return this;
        }

        /**
         * @param dataExport Data export configuration (documented below).
         * 
         * @return builder
         * 
         */
        public Builder dataExport(AnalyticsConfigurationStorageClassAnalysisDataExportArgs dataExport) {
            return dataExport(Output.of(dataExport));
        }

        public AnalyticsConfigurationStorageClassAnalysisArgs build() {
            $.dataExport = Objects.requireNonNull($.dataExport, "expected parameter 'dataExport' to be non-null");
            return $;
        }
    }

}