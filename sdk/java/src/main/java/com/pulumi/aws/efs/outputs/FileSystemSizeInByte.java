// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FileSystemSizeInByte {
    /**
     * @return The latest known metered size (in bytes) of data stored in the file system.
     * 
     */
    private final @Nullable Integer value;
    /**
     * @return The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     * 
     */
    private final @Nullable Integer valueInIa;
    /**
     * @return The latest known metered size (in bytes) of data stored in the Standard storage class.
     * 
     */
    private final @Nullable Integer valueInStandard;

    @CustomType.Constructor
    private FileSystemSizeInByte(
        @CustomType.Parameter("value") @Nullable Integer value,
        @CustomType.Parameter("valueInIa") @Nullable Integer valueInIa,
        @CustomType.Parameter("valueInStandard") @Nullable Integer valueInStandard) {
        this.value = value;
        this.valueInIa = valueInIa;
        this.valueInStandard = valueInStandard;
    }

    /**
     * @return The latest known metered size (in bytes) of data stored in the file system.
     * 
     */
    public Optional<Integer> value() {
        return Optional.ofNullable(this.value);
    }
    /**
     * @return The latest known metered size (in bytes) of data stored in the Infrequent Access storage class.
     * 
     */
    public Optional<Integer> valueInIa() {
        return Optional.ofNullable(this.valueInIa);
    }
    /**
     * @return The latest known metered size (in bytes) of data stored in the Standard storage class.
     * 
     */
    public Optional<Integer> valueInStandard() {
        return Optional.ofNullable(this.valueInStandard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemSizeInByte defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer value;
        private @Nullable Integer valueInIa;
        private @Nullable Integer valueInStandard;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemSizeInByte defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
    	      this.valueInIa = defaults.valueInIa;
    	      this.valueInStandard = defaults.valueInStandard;
        }

        public Builder value(@Nullable Integer value) {
            this.value = value;
            return this;
        }
        public Builder valueInIa(@Nullable Integer valueInIa) {
            this.valueInIa = valueInIa;
            return this;
        }
        public Builder valueInStandard(@Nullable Integer valueInStandard) {
            this.valueInStandard = valueInStandard;
            return this;
        }        public FileSystemSizeInByte build() {
            return new FileSystemSizeInByte(value, valueInIa, valueInStandard);
        }
    }
}