// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.RealtimeLogConfigEndpointKinesisStreamConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RealtimeLogConfigEndpoint {
    /**
     * @return The Amazon Kinesis data stream configuration.
     * 
     */
    private final RealtimeLogConfigEndpointKinesisStreamConfig kinesisStreamConfig;
    /**
     * @return The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    private final String streamType;

    @CustomType.Constructor
    private RealtimeLogConfigEndpoint(
        @CustomType.Parameter("kinesisStreamConfig") RealtimeLogConfigEndpointKinesisStreamConfig kinesisStreamConfig,
        @CustomType.Parameter("streamType") String streamType) {
        this.kinesisStreamConfig = kinesisStreamConfig;
        this.streamType = streamType;
    }

    /**
     * @return The Amazon Kinesis data stream configuration.
     * 
     */
    public RealtimeLogConfigEndpointKinesisStreamConfig kinesisStreamConfig() {
        return this.kinesisStreamConfig;
    }
    /**
     * @return The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    public String streamType() {
        return this.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeLogConfigEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RealtimeLogConfigEndpointKinesisStreamConfig kinesisStreamConfig;
        private String streamType;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeLogConfigEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisStreamConfig = defaults.kinesisStreamConfig;
    	      this.streamType = defaults.streamType;
        }

        public Builder kinesisStreamConfig(RealtimeLogConfigEndpointKinesisStreamConfig kinesisStreamConfig) {
            this.kinesisStreamConfig = Objects.requireNonNull(kinesisStreamConfig);
            return this;
        }
        public Builder streamType(String streamType) {
            this.streamType = Objects.requireNonNull(streamType);
            return this;
        }        public RealtimeLogConfigEndpoint build() {
            return new RealtimeLogConfigEndpoint(kinesisStreamConfig, streamType);
        }
    }
}