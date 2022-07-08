// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSelectionResult {
    /**
     * @return The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
     * 
     */
    private final String iamRoleArn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The display name of a resource selection document.
     * 
     */
    private final String name;
    private final String planId;
    /**
     * @return An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
     * 
     */
    private final List<String> resources;
    private final String selectionId;

    @CustomType.Constructor
    private GetSelectionResult(
        @CustomType.Parameter("iamRoleArn") String iamRoleArn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("planId") String planId,
        @CustomType.Parameter("resources") List<String> resources,
        @CustomType.Parameter("selectionId") String selectionId) {
        this.iamRoleArn = iamRoleArn;
        this.id = id;
        this.name = name;
        this.planId = planId;
        this.resources = resources;
        this.selectionId = selectionId;
    }

    /**
     * @return The ARN of the IAM role that AWS Backup uses to authenticate when restoring and backing up the target resource. See the [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/access-control.html#managed-policies) for additional information about using AWS managed policies or creating custom policies attached to the IAM role.
     * 
     */
    public String iamRoleArn() {
        return this.iamRoleArn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The display name of a resource selection document.
     * 
     */
    public String name() {
        return this.name;
    }
    public String planId() {
        return this.planId;
    }
    /**
     * @return An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
     * 
     */
    public List<String> resources() {
        return this.resources;
    }
    public String selectionId() {
        return this.selectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSelectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String iamRoleArn;
        private String id;
        private String name;
        private String planId;
        private List<String> resources;
        private String selectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSelectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.planId = defaults.planId;
    	      this.resources = defaults.resources;
    	      this.selectionId = defaults.selectionId;
        }

        public Builder iamRoleArn(String iamRoleArn) {
            this.iamRoleArn = Objects.requireNonNull(iamRoleArn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder planId(String planId) {
            this.planId = Objects.requireNonNull(planId);
            return this;
        }
        public Builder resources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder selectionId(String selectionId) {
            this.selectionId = Objects.requireNonNull(selectionId);
            return this;
        }        public GetSelectionResult build() {
            return new GetSelectionResult(iamRoleArn, id, name, planId, resources, selectionId);
        }
    }
}