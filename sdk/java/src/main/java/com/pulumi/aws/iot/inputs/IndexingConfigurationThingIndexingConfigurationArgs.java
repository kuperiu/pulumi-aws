// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationCustomFieldArgs;
import com.pulumi.aws.iot.inputs.IndexingConfigurationThingIndexingConfigurationManagedFieldArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndexingConfigurationThingIndexingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final IndexingConfigurationThingIndexingConfigurationArgs Empty = new IndexingConfigurationThingIndexingConfigurationArgs();

    /**
     * Contains custom field names and their data type. See below.
     * 
     */
    @Import(name="customFields")
    private @Nullable Output<List<IndexingConfigurationThingIndexingConfigurationCustomFieldArgs>> customFields;

    /**
     * @return Contains custom field names and their data type. See below.
     * 
     */
    public Optional<Output<List<IndexingConfigurationThingIndexingConfigurationCustomFieldArgs>>> customFields() {
        return Optional.ofNullable(this.customFields);
    }

    /**
     * Device Defender indexing mode. Valid values: `VIOLATIONS`, `OFF`. Default: `OFF`.
     * 
     */
    @Import(name="deviceDefenderIndexingMode")
    private @Nullable Output<String> deviceDefenderIndexingMode;

    /**
     * @return Device Defender indexing mode. Valid values: `VIOLATIONS`, `OFF`. Default: `OFF`.
     * 
     */
    public Optional<Output<String>> deviceDefenderIndexingMode() {
        return Optional.ofNullable(this.deviceDefenderIndexingMode);
    }

    /**
     * Contains fields that are indexed and whose types are already known by the Fleet Indexing service. See below.
     * 
     */
    @Import(name="managedFields")
    private @Nullable Output<List<IndexingConfigurationThingIndexingConfigurationManagedFieldArgs>> managedFields;

    /**
     * @return Contains fields that are indexed and whose types are already known by the Fleet Indexing service. See below.
     * 
     */
    public Optional<Output<List<IndexingConfigurationThingIndexingConfigurationManagedFieldArgs>>> managedFields() {
        return Optional.ofNullable(this.managedFields);
    }

    /**
     * [Named shadow](https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html) indexing mode. Valid values: `ON`, `OFF`. Default: `OFF`.
     * 
     */
    @Import(name="namedShadowIndexingMode")
    private @Nullable Output<String> namedShadowIndexingMode;

    /**
     * @return [Named shadow](https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html) indexing mode. Valid values: `ON`, `OFF`. Default: `OFF`.
     * 
     */
    public Optional<Output<String>> namedShadowIndexingMode() {
        return Optional.ofNullable(this.namedShadowIndexingMode);
    }

    /**
     * Thing connectivity indexing mode. Valid values: `STATUS`, `OFF`. Default: `OFF`.
     * 
     */
    @Import(name="thingConnectivityIndexingMode")
    private @Nullable Output<String> thingConnectivityIndexingMode;

    /**
     * @return Thing connectivity indexing mode. Valid values: `STATUS`, `OFF`. Default: `OFF`.
     * 
     */
    public Optional<Output<String>> thingConnectivityIndexingMode() {
        return Optional.ofNullable(this.thingConnectivityIndexingMode);
    }

    /**
     * Thing indexing mode. Valid values: `REGISTRY`, `REGISTRY_AND_SHADOW`, `OFF`.
     * 
     */
    @Import(name="thingIndexingMode", required=true)
    private Output<String> thingIndexingMode;

    /**
     * @return Thing indexing mode. Valid values: `REGISTRY`, `REGISTRY_AND_SHADOW`, `OFF`.
     * 
     */
    public Output<String> thingIndexingMode() {
        return this.thingIndexingMode;
    }

    private IndexingConfigurationThingIndexingConfigurationArgs() {}

    private IndexingConfigurationThingIndexingConfigurationArgs(IndexingConfigurationThingIndexingConfigurationArgs $) {
        this.customFields = $.customFields;
        this.deviceDefenderIndexingMode = $.deviceDefenderIndexingMode;
        this.managedFields = $.managedFields;
        this.namedShadowIndexingMode = $.namedShadowIndexingMode;
        this.thingConnectivityIndexingMode = $.thingConnectivityIndexingMode;
        this.thingIndexingMode = $.thingIndexingMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndexingConfigurationThingIndexingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndexingConfigurationThingIndexingConfigurationArgs $;

        public Builder() {
            $ = new IndexingConfigurationThingIndexingConfigurationArgs();
        }

        public Builder(IndexingConfigurationThingIndexingConfigurationArgs defaults) {
            $ = new IndexingConfigurationThingIndexingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customFields Contains custom field names and their data type. See below.
         * 
         * @return builder
         * 
         */
        public Builder customFields(@Nullable Output<List<IndexingConfigurationThingIndexingConfigurationCustomFieldArgs>> customFields) {
            $.customFields = customFields;
            return this;
        }

        /**
         * @param customFields Contains custom field names and their data type. See below.
         * 
         * @return builder
         * 
         */
        public Builder customFields(List<IndexingConfigurationThingIndexingConfigurationCustomFieldArgs> customFields) {
            return customFields(Output.of(customFields));
        }

        /**
         * @param customFields Contains custom field names and their data type. See below.
         * 
         * @return builder
         * 
         */
        public Builder customFields(IndexingConfigurationThingIndexingConfigurationCustomFieldArgs... customFields) {
            return customFields(List.of(customFields));
        }

        /**
         * @param deviceDefenderIndexingMode Device Defender indexing mode. Valid values: `VIOLATIONS`, `OFF`. Default: `OFF`.
         * 
         * @return builder
         * 
         */
        public Builder deviceDefenderIndexingMode(@Nullable Output<String> deviceDefenderIndexingMode) {
            $.deviceDefenderIndexingMode = deviceDefenderIndexingMode;
            return this;
        }

        /**
         * @param deviceDefenderIndexingMode Device Defender indexing mode. Valid values: `VIOLATIONS`, `OFF`. Default: `OFF`.
         * 
         * @return builder
         * 
         */
        public Builder deviceDefenderIndexingMode(String deviceDefenderIndexingMode) {
            return deviceDefenderIndexingMode(Output.of(deviceDefenderIndexingMode));
        }

        /**
         * @param managedFields Contains fields that are indexed and whose types are already known by the Fleet Indexing service. See below.
         * 
         * @return builder
         * 
         */
        public Builder managedFields(@Nullable Output<List<IndexingConfigurationThingIndexingConfigurationManagedFieldArgs>> managedFields) {
            $.managedFields = managedFields;
            return this;
        }

        /**
         * @param managedFields Contains fields that are indexed and whose types are already known by the Fleet Indexing service. See below.
         * 
         * @return builder
         * 
         */
        public Builder managedFields(List<IndexingConfigurationThingIndexingConfigurationManagedFieldArgs> managedFields) {
            return managedFields(Output.of(managedFields));
        }

        /**
         * @param managedFields Contains fields that are indexed and whose types are already known by the Fleet Indexing service. See below.
         * 
         * @return builder
         * 
         */
        public Builder managedFields(IndexingConfigurationThingIndexingConfigurationManagedFieldArgs... managedFields) {
            return managedFields(List.of(managedFields));
        }

        /**
         * @param namedShadowIndexingMode [Named shadow](https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html) indexing mode. Valid values: `ON`, `OFF`. Default: `OFF`.
         * 
         * @return builder
         * 
         */
        public Builder namedShadowIndexingMode(@Nullable Output<String> namedShadowIndexingMode) {
            $.namedShadowIndexingMode = namedShadowIndexingMode;
            return this;
        }

        /**
         * @param namedShadowIndexingMode [Named shadow](https://docs.aws.amazon.com/iot/latest/developerguide/iot-device-shadows.html) indexing mode. Valid values: `ON`, `OFF`. Default: `OFF`.
         * 
         * @return builder
         * 
         */
        public Builder namedShadowIndexingMode(String namedShadowIndexingMode) {
            return namedShadowIndexingMode(Output.of(namedShadowIndexingMode));
        }

        /**
         * @param thingConnectivityIndexingMode Thing connectivity indexing mode. Valid values: `STATUS`, `OFF`. Default: `OFF`.
         * 
         * @return builder
         * 
         */
        public Builder thingConnectivityIndexingMode(@Nullable Output<String> thingConnectivityIndexingMode) {
            $.thingConnectivityIndexingMode = thingConnectivityIndexingMode;
            return this;
        }

        /**
         * @param thingConnectivityIndexingMode Thing connectivity indexing mode. Valid values: `STATUS`, `OFF`. Default: `OFF`.
         * 
         * @return builder
         * 
         */
        public Builder thingConnectivityIndexingMode(String thingConnectivityIndexingMode) {
            return thingConnectivityIndexingMode(Output.of(thingConnectivityIndexingMode));
        }

        /**
         * @param thingIndexingMode Thing indexing mode. Valid values: `REGISTRY`, `REGISTRY_AND_SHADOW`, `OFF`.
         * 
         * @return builder
         * 
         */
        public Builder thingIndexingMode(Output<String> thingIndexingMode) {
            $.thingIndexingMode = thingIndexingMode;
            return this;
        }

        /**
         * @param thingIndexingMode Thing indexing mode. Valid values: `REGISTRY`, `REGISTRY_AND_SHADOW`, `OFF`.
         * 
         * @return builder
         * 
         */
        public Builder thingIndexingMode(String thingIndexingMode) {
            return thingIndexingMode(Output.of(thingIndexingMode));
        }

        public IndexingConfigurationThingIndexingConfigurationArgs build() {
            $.thingIndexingMode = Objects.requireNonNull($.thingIndexingMode, "expected parameter 'thingIndexingMode' to be non-null");
            return $;
        }
    }

}