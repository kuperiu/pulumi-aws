// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget {
    /**
     * @return The ID of the Capacity Reservation in which to run the instance.
     * 
     */
    private final @Nullable String capacityReservationId;
    /**
     * @return The ARN of the Capacity Reservation resource group in which to run the instance.
     * 
     */
    private final @Nullable String capacityReservationResourceGroupArn;

    @CustomType.Constructor
    private LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget(
        @CustomType.Parameter("capacityReservationId") @Nullable String capacityReservationId,
        @CustomType.Parameter("capacityReservationResourceGroupArn") @Nullable String capacityReservationResourceGroupArn) {
        this.capacityReservationId = capacityReservationId;
        this.capacityReservationResourceGroupArn = capacityReservationResourceGroupArn;
    }

    /**
     * @return The ID of the Capacity Reservation in which to run the instance.
     * 
     */
    public Optional<String> capacityReservationId() {
        return Optional.ofNullable(this.capacityReservationId);
    }
    /**
     * @return The ARN of the Capacity Reservation resource group in which to run the instance.
     * 
     */
    public Optional<String> capacityReservationResourceGroupArn() {
        return Optional.ofNullable(this.capacityReservationResourceGroupArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String capacityReservationId;
        private @Nullable String capacityReservationResourceGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityReservationId = defaults.capacityReservationId;
    	      this.capacityReservationResourceGroupArn = defaults.capacityReservationResourceGroupArn;
        }

        public Builder capacityReservationId(@Nullable String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }
        public Builder capacityReservationResourceGroupArn(@Nullable String capacityReservationResourceGroupArn) {
            this.capacityReservationResourceGroupArn = capacityReservationResourceGroupArn;
            return this;
        }        public LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget build() {
            return new LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget(capacityReservationId, capacityReservationResourceGroupArn);
        }
    }
}