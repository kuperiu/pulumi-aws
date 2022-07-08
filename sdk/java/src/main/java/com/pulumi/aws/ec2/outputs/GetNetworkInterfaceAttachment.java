// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkInterfaceAttachment {
    private final String attachmentId;
    private final Integer deviceIndex;
    private final String instanceId;
    private final String instanceOwnerId;

    @CustomType.Constructor
    private GetNetworkInterfaceAttachment(
        @CustomType.Parameter("attachmentId") String attachmentId,
        @CustomType.Parameter("deviceIndex") Integer deviceIndex,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("instanceOwnerId") String instanceOwnerId) {
        this.attachmentId = attachmentId;
        this.deviceIndex = deviceIndex;
        this.instanceId = instanceId;
        this.instanceOwnerId = instanceOwnerId;
    }

    public String attachmentId() {
        return this.attachmentId;
    }
    public Integer deviceIndex() {
        return this.deviceIndex;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public String instanceOwnerId() {
        return this.instanceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfaceAttachment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attachmentId;
        private Integer deviceIndex;
        private String instanceId;
        private String instanceOwnerId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfaceAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentId = defaults.attachmentId;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceOwnerId = defaults.instanceOwnerId;
        }

        public Builder attachmentId(String attachmentId) {
            this.attachmentId = Objects.requireNonNull(attachmentId);
            return this;
        }
        public Builder deviceIndex(Integer deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceOwnerId(String instanceOwnerId) {
            this.instanceOwnerId = Objects.requireNonNull(instanceOwnerId);
            return this;
        }        public GetNetworkInterfaceAttachment build() {
            return new GetNetworkInterfaceAttachment(attachmentId, deviceIndex, instanceId, instanceOwnerId);
        }
    }
}