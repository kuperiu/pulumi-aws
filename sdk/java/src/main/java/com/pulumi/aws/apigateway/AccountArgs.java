// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * The ARN of an IAM role for CloudWatch (to allow logging &amp; monitoring). See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console). Logging &amp; monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
     * 
     */
    @Import(name="cloudwatchRoleArn")
    private @Nullable Output<String> cloudwatchRoleArn;

    /**
     * @return The ARN of an IAM role for CloudWatch (to allow logging &amp; monitoring). See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console). Logging &amp; monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
     * 
     */
    public Optional<Output<String>> cloudwatchRoleArn() {
        return Optional.ofNullable(this.cloudwatchRoleArn);
    }

    private AccountArgs() {}

    private AccountArgs(AccountArgs $) {
        this.cloudwatchRoleArn = $.cloudwatchRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountArgs $;

        public Builder() {
            $ = new AccountArgs();
        }

        public Builder(AccountArgs defaults) {
            $ = new AccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudwatchRoleArn The ARN of an IAM role for CloudWatch (to allow logging &amp; monitoring). See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console). Logging &amp; monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchRoleArn(@Nullable Output<String> cloudwatchRoleArn) {
            $.cloudwatchRoleArn = cloudwatchRoleArn;
            return this;
        }

        /**
         * @param cloudwatchRoleArn The ARN of an IAM role for CloudWatch (to allow logging &amp; monitoring). See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console). Logging &amp; monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchRoleArn(String cloudwatchRoleArn) {
            return cloudwatchRoleArn(Output.of(cloudwatchRoleArn));
        }

        public AccountArgs build() {
            return $;
        }
    }

}