// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.FieldLevelEncryptionProfileEncryptionEntitiesItem;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FieldLevelEncryptionProfileEncryptionEntities {
    private final @Nullable List<FieldLevelEncryptionProfileEncryptionEntitiesItem> items;

    @CustomType.Constructor
    private FieldLevelEncryptionProfileEncryptionEntities(@CustomType.Parameter("items") @Nullable List<FieldLevelEncryptionProfileEncryptionEntitiesItem> items) {
        this.items = items;
    }

    public List<FieldLevelEncryptionProfileEncryptionEntitiesItem> items() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionProfileEncryptionEntities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FieldLevelEncryptionProfileEncryptionEntitiesItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionProfileEncryptionEntities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable List<FieldLevelEncryptionProfileEncryptionEntitiesItem> items) {
            this.items = items;
            return this;
        }
        public Builder items(FieldLevelEncryptionProfileEncryptionEntitiesItem... items) {
            return items(List.of(items));
        }        public FieldLevelEncryptionProfileEncryptionEntities build() {
            return new FieldLevelEncryptionProfileEncryptionEntities(items);
        }
    }
}