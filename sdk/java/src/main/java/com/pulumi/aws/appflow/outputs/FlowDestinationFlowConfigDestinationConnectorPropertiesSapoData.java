// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.aws.appflow.outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig;
import com.pulumi.aws.appflow.outputs.FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowDestinationFlowConfigDestinationConnectorPropertiesSapoData {
    /**
     * @return The settings that determine how Amazon AppFlow handles an error when placing data in the destination. See Error Handling Config for more details.
     * 
     */
    private final @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig errorHandlingConfig;
    /**
     * @return The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or delete.
     * 
     */
    private final @Nullable List<String> idFieldNames;
    /**
     * @return The object path specified in the SAPOData flow source.
     * 
     */
    private final String objectPath;
    /**
     * @return Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data. See Success Response Handling Config for more details.
     * 
     */
    private final @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig successResponseHandlingConfig;
    /**
     * @return This specifies the type of write operation to be performed in Zendesk. When the value is `UPSERT`, then `id_field_names` is required. Valid values are `INSERT`, `UPSERT`, `UPDATE`, and `DELETE`.
     * 
     */
    private final @Nullable String writeOperationType;

    @CustomType.Constructor
    private FlowDestinationFlowConfigDestinationConnectorPropertiesSapoData(
        @CustomType.Parameter("errorHandlingConfig") @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig errorHandlingConfig,
        @CustomType.Parameter("idFieldNames") @Nullable List<String> idFieldNames,
        @CustomType.Parameter("objectPath") String objectPath,
        @CustomType.Parameter("successResponseHandlingConfig") @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig successResponseHandlingConfig,
        @CustomType.Parameter("writeOperationType") @Nullable String writeOperationType) {
        this.errorHandlingConfig = errorHandlingConfig;
        this.idFieldNames = idFieldNames;
        this.objectPath = objectPath;
        this.successResponseHandlingConfig = successResponseHandlingConfig;
        this.writeOperationType = writeOperationType;
    }

    /**
     * @return The settings that determine how Amazon AppFlow handles an error when placing data in the destination. See Error Handling Config for more details.
     * 
     */
    public Optional<FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig> errorHandlingConfig() {
        return Optional.ofNullable(this.errorHandlingConfig);
    }
    /**
     * @return The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or delete.
     * 
     */
    public List<String> idFieldNames() {
        return this.idFieldNames == null ? List.of() : this.idFieldNames;
    }
    /**
     * @return The object path specified in the SAPOData flow source.
     * 
     */
    public String objectPath() {
        return this.objectPath;
    }
    /**
     * @return Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data. See Success Response Handling Config for more details.
     * 
     */
    public Optional<FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig> successResponseHandlingConfig() {
        return Optional.ofNullable(this.successResponseHandlingConfig);
    }
    /**
     * @return This specifies the type of write operation to be performed in Zendesk. When the value is `UPSERT`, then `id_field_names` is required. Valid values are `INSERT`, `UPSERT`, `UPDATE`, and `DELETE`.
     * 
     */
    public Optional<String> writeOperationType() {
        return Optional.ofNullable(this.writeOperationType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDestinationFlowConfigDestinationConnectorPropertiesSapoData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig errorHandlingConfig;
        private @Nullable List<String> idFieldNames;
        private String objectPath;
        private @Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig successResponseHandlingConfig;
        private @Nullable String writeOperationType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDestinationFlowConfigDestinationConnectorPropertiesSapoData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorHandlingConfig = defaults.errorHandlingConfig;
    	      this.idFieldNames = defaults.idFieldNames;
    	      this.objectPath = defaults.objectPath;
    	      this.successResponseHandlingConfig = defaults.successResponseHandlingConfig;
    	      this.writeOperationType = defaults.writeOperationType;
        }

        public Builder errorHandlingConfig(@Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataErrorHandlingConfig errorHandlingConfig) {
            this.errorHandlingConfig = errorHandlingConfig;
            return this;
        }
        public Builder idFieldNames(@Nullable List<String> idFieldNames) {
            this.idFieldNames = idFieldNames;
            return this;
        }
        public Builder idFieldNames(String... idFieldNames) {
            return idFieldNames(List.of(idFieldNames));
        }
        public Builder objectPath(String objectPath) {
            this.objectPath = Objects.requireNonNull(objectPath);
            return this;
        }
        public Builder successResponseHandlingConfig(@Nullable FlowDestinationFlowConfigDestinationConnectorPropertiesSapoDataSuccessResponseHandlingConfig successResponseHandlingConfig) {
            this.successResponseHandlingConfig = successResponseHandlingConfig;
            return this;
        }
        public Builder writeOperationType(@Nullable String writeOperationType) {
            this.writeOperationType = writeOperationType;
            return this;
        }        public FlowDestinationFlowConfigDestinationConnectorPropertiesSapoData build() {
            return new FlowDestinationFlowConfigDestinationConnectorPropertiesSapoData(errorHandlingConfig, idFieldNames, objectPath, successResponseHandlingConfig, writeOperationType);
        }
    }
}