// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator;

import com.pulumi.aws.globalaccelerator.inputs.EndpointGroupEndpointConfigurationArgs;
import com.pulumi.aws.globalaccelerator.inputs.EndpointGroupPortOverrideArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointGroupArgs Empty = new EndpointGroupArgs();

    /**
     * The list of endpoint objects. Fields documented below.
     * 
     */
    @Import(name="endpointConfigurations")
    private @Nullable Output<List<EndpointGroupEndpointConfigurationArgs>> endpointConfigurations;

    /**
     * @return The list of endpoint objects. Fields documented below.
     * 
     */
    public Optional<Output<List<EndpointGroupEndpointConfigurationArgs>>> endpointConfigurations() {
        return Optional.ofNullable(this.endpointConfigurations);
    }

    /**
     * The name of the AWS Region where the endpoint group is located.
     * 
     */
    @Import(name="endpointGroupRegion")
    private @Nullable Output<String> endpointGroupRegion;

    /**
     * @return The name of the AWS Region where the endpoint group is located.
     * 
     */
    public Optional<Output<String>> endpointGroupRegion() {
        return Optional.ofNullable(this.endpointGroupRegion);
    }

    /**
     * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     * 
     */
    @Import(name="healthCheckIntervalSeconds")
    private @Nullable Output<Integer> healthCheckIntervalSeconds;

    /**
     * @return The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     * 
     */
    public Optional<Output<Integer>> healthCheckIntervalSeconds() {
        return Optional.ofNullable(this.healthCheckIntervalSeconds);
    }

    /**
     * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (`/`). the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="healthCheckPath")
    private @Nullable Output<String> healthCheckPath;

    /**
     * @return If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (`/`). the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Optional<Output<String>> healthCheckPath() {
        return Optional.ofNullable(this.healthCheckPath);
    }

    /**
     * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
     * the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Import(name="healthCheckPort")
    private @Nullable Output<Integer> healthCheckPort;

    /**
     * @return The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
     * the provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Optional<Output<Integer>> healthCheckPort() {
        return Optional.ofNullable(this.healthCheckPort);
    }

    /**
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
     * 
     */
    @Import(name="healthCheckProtocol")
    private @Nullable Output<String> healthCheckProtocol;

    /**
     * @return The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
     * 
     */
    public Optional<Output<String>> healthCheckProtocol() {
        return Optional.ofNullable(this.healthCheckProtocol);
    }

    /**
     * The Amazon Resource Name (ARN) of the listener.
     * 
     */
    @Import(name="listenerArn", required=true)
    private Output<String> listenerArn;

    /**
     * @return The Amazon Resource Name (ARN) of the listener.
     * 
     */
    public Output<String> listenerArn() {
        return this.listenerArn;
    }

    /**
     * Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
     * 
     */
    @Import(name="portOverrides")
    private @Nullable Output<List<EndpointGroupPortOverrideArgs>> portOverrides;

    /**
     * @return Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
     * 
     */
    public Optional<Output<List<EndpointGroupPortOverrideArgs>>> portOverrides() {
        return Optional.ofNullable(this.portOverrides);
    }

    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
     * 
     */
    @Import(name="thresholdCount")
    private @Nullable Output<Integer> thresholdCount;

    /**
     * @return The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
     * 
     */
    public Optional<Output<Integer>> thresholdCount() {
        return Optional.ofNullable(this.thresholdCount);
    }

    /**
     * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
     * 
     */
    @Import(name="trafficDialPercentage")
    private @Nullable Output<Double> trafficDialPercentage;

    /**
     * @return The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
     * 
     */
    public Optional<Output<Double>> trafficDialPercentage() {
        return Optional.ofNullable(this.trafficDialPercentage);
    }

    private EndpointGroupArgs() {}

    private EndpointGroupArgs(EndpointGroupArgs $) {
        this.endpointConfigurations = $.endpointConfigurations;
        this.endpointGroupRegion = $.endpointGroupRegion;
        this.healthCheckIntervalSeconds = $.healthCheckIntervalSeconds;
        this.healthCheckPath = $.healthCheckPath;
        this.healthCheckPort = $.healthCheckPort;
        this.healthCheckProtocol = $.healthCheckProtocol;
        this.listenerArn = $.listenerArn;
        this.portOverrides = $.portOverrides;
        this.thresholdCount = $.thresholdCount;
        this.trafficDialPercentage = $.trafficDialPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointGroupArgs $;

        public Builder() {
            $ = new EndpointGroupArgs();
        }

        public Builder(EndpointGroupArgs defaults) {
            $ = new EndpointGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointConfigurations The list of endpoint objects. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder endpointConfigurations(@Nullable Output<List<EndpointGroupEndpointConfigurationArgs>> endpointConfigurations) {
            $.endpointConfigurations = endpointConfigurations;
            return this;
        }

        /**
         * @param endpointConfigurations The list of endpoint objects. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder endpointConfigurations(List<EndpointGroupEndpointConfigurationArgs> endpointConfigurations) {
            return endpointConfigurations(Output.of(endpointConfigurations));
        }

        /**
         * @param endpointConfigurations The list of endpoint objects. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder endpointConfigurations(EndpointGroupEndpointConfigurationArgs... endpointConfigurations) {
            return endpointConfigurations(List.of(endpointConfigurations));
        }

        /**
         * @param endpointGroupRegion The name of the AWS Region where the endpoint group is located.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupRegion(@Nullable Output<String> endpointGroupRegion) {
            $.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * @param endpointGroupRegion The name of the AWS Region where the endpoint group is located.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            return endpointGroupRegion(Output.of(endpointGroupRegion));
        }

        /**
         * @param healthCheckIntervalSeconds The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckIntervalSeconds(@Nullable Output<Integer> healthCheckIntervalSeconds) {
            $.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }

        /**
         * @param healthCheckIntervalSeconds The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
            return healthCheckIntervalSeconds(Output.of(healthCheckIntervalSeconds));
        }

        /**
         * @param healthCheckPath If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (`/`). the provider will only perform drift detection of its value when present in a configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPath(@Nullable Output<String> healthCheckPath) {
            $.healthCheckPath = healthCheckPath;
            return this;
        }

        /**
         * @param healthCheckPath If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The default value is slash (`/`). the provider will only perform drift detection of its value when present in a configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPath(String healthCheckPath) {
            return healthCheckPath(Output.of(healthCheckPath));
        }

        /**
         * @param healthCheckPort The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
         * the provider will only perform drift detection of its value when present in a configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPort(@Nullable Output<Integer> healthCheckPort) {
            $.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * @param healthCheckPort The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default port is the listener port that this endpoint group is associated with. If listener port is a list of ports, Global Accelerator uses the first port in the list.
         * the provider will only perform drift detection of its value when present in a configuration.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            return healthCheckPort(Output.of(healthCheckPort));
        }

        /**
         * @param healthCheckProtocol The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckProtocol(@Nullable Output<String> healthCheckProtocol) {
            $.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        /**
         * @param healthCheckProtocol The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group. The default value is TCP.
         * 
         * @return builder
         * 
         */
        public Builder healthCheckProtocol(String healthCheckProtocol) {
            return healthCheckProtocol(Output.of(healthCheckProtocol));
        }

        /**
         * @param listenerArn The Amazon Resource Name (ARN) of the listener.
         * 
         * @return builder
         * 
         */
        public Builder listenerArn(Output<String> listenerArn) {
            $.listenerArn = listenerArn;
            return this;
        }

        /**
         * @param listenerArn The Amazon Resource Name (ARN) of the listener.
         * 
         * @return builder
         * 
         */
        public Builder listenerArn(String listenerArn) {
            return listenerArn(Output.of(listenerArn));
        }

        /**
         * @param portOverrides Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder portOverrides(@Nullable Output<List<EndpointGroupPortOverrideArgs>> portOverrides) {
            $.portOverrides = portOverrides;
            return this;
        }

        /**
         * @param portOverrides Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder portOverrides(List<EndpointGroupPortOverrideArgs> portOverrides) {
            return portOverrides(Output.of(portOverrides));
        }

        /**
         * @param portOverrides Override specific listener ports used to route traffic to endpoints that are part of this endpoint group. Fields documented below.
         * 
         * @return builder
         * 
         */
        public Builder portOverrides(EndpointGroupPortOverrideArgs... portOverrides) {
            return portOverrides(List.of(portOverrides));
        }

        /**
         * @param thresholdCount The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
         * 
         * @return builder
         * 
         */
        public Builder thresholdCount(@Nullable Output<Integer> thresholdCount) {
            $.thresholdCount = thresholdCount;
            return this;
        }

        /**
         * @param thresholdCount The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. The default value is 3.
         * 
         * @return builder
         * 
         */
        public Builder thresholdCount(Integer thresholdCount) {
            return thresholdCount(Output.of(thresholdCount));
        }

        /**
         * @param trafficDialPercentage The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
         * 
         * @return builder
         * 
         */
        public Builder trafficDialPercentage(@Nullable Output<Double> trafficDialPercentage) {
            $.trafficDialPercentage = trafficDialPercentage;
            return this;
        }

        /**
         * @param trafficDialPercentage The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups for this listener. The default value is 100.
         * 
         * @return builder
         * 
         */
        public Builder trafficDialPercentage(Double trafficDialPercentage) {
            return trafficDialPercentage(Output.of(trafficDialPercentage));
        }

        public EndpointGroupArgs build() {
            $.listenerArn = Objects.requireNonNull($.listenerArn, "expected parameter 'listenerArn' to be non-null");
            return $;
        }
    }

}