// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.IntentConclusionStatementArgs;
import com.pulumi.aws.lex.inputs.IntentConfirmationPromptArgs;
import com.pulumi.aws.lex.inputs.IntentDialogCodeHookArgs;
import com.pulumi.aws.lex.inputs.IntentFollowUpPromptArgs;
import com.pulumi.aws.lex.inputs.IntentFulfillmentActivityArgs;
import com.pulumi.aws.lex.inputs.IntentRejectionStatementArgs;
import com.pulumi.aws.lex.inputs.IntentSlotArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntentState extends com.pulumi.resources.ResourceArgs {

    public static final IntentState Empty = new IntentState();

    /**
     * The ARN of the Lex intent.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The ARN of the Lex intent.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Checksum identifying the version of the intent that was created. The checksum is not
     * included as an argument because the resource will add it automatically when updating the intent.
     * 
     */
    @Import(name="checksum")
    private @Nullable Output<String> checksum;

    /**
     * @return Checksum identifying the version of the intent that was created. The checksum is not
     * included as an argument because the resource will add it automatically when updating the intent.
     * 
     */
    public Optional<Output<String>> checksum() {
        return Optional.ofNullable(this.checksum);
    }

    /**
     * The statement that you want Amazon Lex to convey to the user
     * after the intent is successfully fulfilled by the Lambda function. This element is relevant only if
     * you provide a Lambda function in the `fulfillment_activity`. If you return the intent to the client
     * application, you can&#39;t specify this element. The `follow_up_prompt` and `conclusion_statement` are
     * mutually exclusive. You can specify only one. Attributes are documented under statement.
     * 
     */
    @Import(name="conclusionStatement")
    private @Nullable Output<IntentConclusionStatementArgs> conclusionStatement;

    /**
     * @return The statement that you want Amazon Lex to convey to the user
     * after the intent is successfully fulfilled by the Lambda function. This element is relevant only if
     * you provide a Lambda function in the `fulfillment_activity`. If you return the intent to the client
     * application, you can&#39;t specify this element. The `follow_up_prompt` and `conclusion_statement` are
     * mutually exclusive. You can specify only one. Attributes are documented under statement.
     * 
     */
    public Optional<Output<IntentConclusionStatementArgs>> conclusionStatement() {
        return Optional.ofNullable(this.conclusionStatement);
    }

    /**
     * Prompts the user to confirm the intent. This question should
     * have a yes or no answer. You you must provide both the `rejection_statement` and `confirmation_prompt`,
     * or neither. Attributes are documented under prompt.
     * 
     */
    @Import(name="confirmationPrompt")
    private @Nullable Output<IntentConfirmationPromptArgs> confirmationPrompt;

    /**
     * @return Prompts the user to confirm the intent. This question should
     * have a yes or no answer. You you must provide both the `rejection_statement` and `confirmation_prompt`,
     * or neither. Attributes are documented under prompt.
     * 
     */
    public Optional<Output<IntentConfirmationPromptArgs>> confirmationPrompt() {
        return Optional.ofNullable(this.confirmationPrompt);
    }

    /**
     * Determines if a new slot type version is created when the initial
     * resource is created and on each update. Defaults to `false`.
     * 
     */
    @Import(name="createVersion")
    private @Nullable Output<Boolean> createVersion;

    /**
     * @return Determines if a new slot type version is created when the initial
     * resource is created and on each update. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> createVersion() {
        return Optional.ofNullable(this.createVersion);
    }

    /**
     * The date when the intent version was created.
     * 
     */
    @Import(name="createdDate")
    private @Nullable Output<String> createdDate;

    /**
     * @return The date when the intent version was created.
     * 
     */
    public Optional<Output<String>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    /**
     * A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies a Lambda function to invoke for each user input. You can
     * invoke this Lambda function to personalize user interaction. Attributes are documented under code_hook.
     * 
     */
    @Import(name="dialogCodeHook")
    private @Nullable Output<IntentDialogCodeHookArgs> dialogCodeHook;

    /**
     * @return Specifies a Lambda function to invoke for each user input. You can
     * invoke this Lambda function to personalize user interaction. Attributes are documented under code_hook.
     * 
     */
    public Optional<Output<IntentDialogCodeHookArgs>> dialogCodeHook() {
        return Optional.ofNullable(this.dialogCodeHook);
    }

    /**
     * Amazon Lex uses this prompt to solicit additional activity after
     * fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the
     * user to order a drink. The `follow_up_prompt` field and the `conclusion_statement` field are mutually
     * exclusive. You can specify only one. Attributes are documented under follow_up_prompt.
     * 
     */
    @Import(name="followUpPrompt")
    private @Nullable Output<IntentFollowUpPromptArgs> followUpPrompt;

    /**
     * @return Amazon Lex uses this prompt to solicit additional activity after
     * fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the
     * user to order a drink. The `follow_up_prompt` field and the `conclusion_statement` field are mutually
     * exclusive. You can specify only one. Attributes are documented under follow_up_prompt.
     * 
     */
    public Optional<Output<IntentFollowUpPromptArgs>> followUpPrompt() {
        return Optional.ofNullable(this.followUpPrompt);
    }

    /**
     * Describes how the intent is fulfilled. For example, after a
     * user provides all of the information for a pizza order, `fulfillment_activity` defines how the bot
     * places an order with a local pizza store. Attributes are documented under fulfillment_activity.
     * 
     */
    @Import(name="fulfillmentActivity")
    private @Nullable Output<IntentFulfillmentActivityArgs> fulfillmentActivity;

    /**
     * @return Describes how the intent is fulfilled. For example, after a
     * user provides all of the information for a pizza order, `fulfillment_activity` defines how the bot
     * places an order with a local pizza store. Attributes are documented under fulfillment_activity.
     * 
     */
    public Optional<Output<IntentFulfillmentActivityArgs>> fulfillmentActivity() {
        return Optional.ofNullable(this.fulfillmentActivity);
    }

    /**
     * The date when the $LATEST version of this intent was updated.
     * 
     */
    @Import(name="lastUpdatedDate")
    private @Nullable Output<String> lastUpdatedDate;

    /**
     * @return The date when the $LATEST version of this intent was updated.
     * 
     */
    public Optional<Output<String>> lastUpdatedDate() {
        return Optional.ofNullable(this.lastUpdatedDate);
    }

    /**
     * The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A unique identifier for the built-in intent to base this
     * intent on. To find the signature for an intent, see
     * [Standard Built-in Intents](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents)
     * in the Alexa Skills Kit.
     * 
     */
    @Import(name="parentIntentSignature")
    private @Nullable Output<String> parentIntentSignature;

    /**
     * @return A unique identifier for the built-in intent to base this
     * intent on. To find the signature for an intent, see
     * [Standard Built-in Intents](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents)
     * in the Alexa Skills Kit.
     * 
     */
    public Optional<Output<String>> parentIntentSignature() {
        return Optional.ofNullable(this.parentIntentSignature);
    }

    /**
     * If the user answers &#34;no&#34; to the question defined in the prompt field,
     * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
     * documented below under statement.
     * 
     */
    @Import(name="rejectionStatement")
    private @Nullable Output<IntentRejectionStatementArgs> rejectionStatement;

    /**
     * @return If the user answers &#34;no&#34; to the question defined in the prompt field,
     * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
     * documented below under statement.
     * 
     */
    public Optional<Output<IntentRejectionStatementArgs>> rejectionStatement() {
        return Optional.ofNullable(this.rejectionStatement);
    }

    /**
     * If you know a specific pattern with which users might respond to
     * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
     * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
     * 
     */
    @Import(name="sampleUtterances")
    private @Nullable Output<List<String>> sampleUtterances;

    /**
     * @return If you know a specific pattern with which users might respond to
     * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
     * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
     * 
     */
    public Optional<Output<List<String>>> sampleUtterances() {
        return Optional.ofNullable(this.sampleUtterances);
    }

    /**
     * An list of intent slots. At runtime, Amazon Lex elicits required slot values
     * from the user using prompts defined in the slots. Attributes are documented under slot.
     * 
     */
    @Import(name="slots")
    private @Nullable Output<List<IntentSlotArgs>> slots;

    /**
     * @return An list of intent slots. At runtime, Amazon Lex elicits required slot values
     * from the user using prompts defined in the slots. Attributes are documented under slot.
     * 
     */
    public Optional<Output<List<IntentSlotArgs>>> slots() {
        return Optional.ofNullable(this.slots);
    }

    /**
     * The version of the bot.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the bot.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private IntentState() {}

    private IntentState(IntentState $) {
        this.arn = $.arn;
        this.checksum = $.checksum;
        this.conclusionStatement = $.conclusionStatement;
        this.confirmationPrompt = $.confirmationPrompt;
        this.createVersion = $.createVersion;
        this.createdDate = $.createdDate;
        this.description = $.description;
        this.dialogCodeHook = $.dialogCodeHook;
        this.followUpPrompt = $.followUpPrompt;
        this.fulfillmentActivity = $.fulfillmentActivity;
        this.lastUpdatedDate = $.lastUpdatedDate;
        this.name = $.name;
        this.parentIntentSignature = $.parentIntentSignature;
        this.rejectionStatement = $.rejectionStatement;
        this.sampleUtterances = $.sampleUtterances;
        this.slots = $.slots;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentState $;

        public Builder() {
            $ = new IntentState();
        }

        public Builder(IntentState defaults) {
            $ = new IntentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The ARN of the Lex intent.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The ARN of the Lex intent.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param checksum Checksum identifying the version of the intent that was created. The checksum is not
         * included as an argument because the resource will add it automatically when updating the intent.
         * 
         * @return builder
         * 
         */
        public Builder checksum(@Nullable Output<String> checksum) {
            $.checksum = checksum;
            return this;
        }

        /**
         * @param checksum Checksum identifying the version of the intent that was created. The checksum is not
         * included as an argument because the resource will add it automatically when updating the intent.
         * 
         * @return builder
         * 
         */
        public Builder checksum(String checksum) {
            return checksum(Output.of(checksum));
        }

        /**
         * @param conclusionStatement The statement that you want Amazon Lex to convey to the user
         * after the intent is successfully fulfilled by the Lambda function. This element is relevant only if
         * you provide a Lambda function in the `fulfillment_activity`. If you return the intent to the client
         * application, you can&#39;t specify this element. The `follow_up_prompt` and `conclusion_statement` are
         * mutually exclusive. You can specify only one. Attributes are documented under statement.
         * 
         * @return builder
         * 
         */
        public Builder conclusionStatement(@Nullable Output<IntentConclusionStatementArgs> conclusionStatement) {
            $.conclusionStatement = conclusionStatement;
            return this;
        }

        /**
         * @param conclusionStatement The statement that you want Amazon Lex to convey to the user
         * after the intent is successfully fulfilled by the Lambda function. This element is relevant only if
         * you provide a Lambda function in the `fulfillment_activity`. If you return the intent to the client
         * application, you can&#39;t specify this element. The `follow_up_prompt` and `conclusion_statement` are
         * mutually exclusive. You can specify only one. Attributes are documented under statement.
         * 
         * @return builder
         * 
         */
        public Builder conclusionStatement(IntentConclusionStatementArgs conclusionStatement) {
            return conclusionStatement(Output.of(conclusionStatement));
        }

        /**
         * @param confirmationPrompt Prompts the user to confirm the intent. This question should
         * have a yes or no answer. You you must provide both the `rejection_statement` and `confirmation_prompt`,
         * or neither. Attributes are documented under prompt.
         * 
         * @return builder
         * 
         */
        public Builder confirmationPrompt(@Nullable Output<IntentConfirmationPromptArgs> confirmationPrompt) {
            $.confirmationPrompt = confirmationPrompt;
            return this;
        }

        /**
         * @param confirmationPrompt Prompts the user to confirm the intent. This question should
         * have a yes or no answer. You you must provide both the `rejection_statement` and `confirmation_prompt`,
         * or neither. Attributes are documented under prompt.
         * 
         * @return builder
         * 
         */
        public Builder confirmationPrompt(IntentConfirmationPromptArgs confirmationPrompt) {
            return confirmationPrompt(Output.of(confirmationPrompt));
        }

        /**
         * @param createVersion Determines if a new slot type version is created when the initial
         * resource is created and on each update. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder createVersion(@Nullable Output<Boolean> createVersion) {
            $.createVersion = createVersion;
            return this;
        }

        /**
         * @param createVersion Determines if a new slot type version is created when the initial
         * resource is created and on each update. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder createVersion(Boolean createVersion) {
            return createVersion(Output.of(createVersion));
        }

        /**
         * @param createdDate The date when the intent version was created.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(@Nullable Output<String> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        /**
         * @param createdDate The date when the intent version was created.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(String createdDate) {
            return createdDate(Output.of(createdDate));
        }

        /**
         * @param description A description of the bot. Must be less than or equal to 200 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the bot. Must be less than or equal to 200 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dialogCodeHook Specifies a Lambda function to invoke for each user input. You can
         * invoke this Lambda function to personalize user interaction. Attributes are documented under code_hook.
         * 
         * @return builder
         * 
         */
        public Builder dialogCodeHook(@Nullable Output<IntentDialogCodeHookArgs> dialogCodeHook) {
            $.dialogCodeHook = dialogCodeHook;
            return this;
        }

        /**
         * @param dialogCodeHook Specifies a Lambda function to invoke for each user input. You can
         * invoke this Lambda function to personalize user interaction. Attributes are documented under code_hook.
         * 
         * @return builder
         * 
         */
        public Builder dialogCodeHook(IntentDialogCodeHookArgs dialogCodeHook) {
            return dialogCodeHook(Output.of(dialogCodeHook));
        }

        /**
         * @param followUpPrompt Amazon Lex uses this prompt to solicit additional activity after
         * fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the
         * user to order a drink. The `follow_up_prompt` field and the `conclusion_statement` field are mutually
         * exclusive. You can specify only one. Attributes are documented under follow_up_prompt.
         * 
         * @return builder
         * 
         */
        public Builder followUpPrompt(@Nullable Output<IntentFollowUpPromptArgs> followUpPrompt) {
            $.followUpPrompt = followUpPrompt;
            return this;
        }

        /**
         * @param followUpPrompt Amazon Lex uses this prompt to solicit additional activity after
         * fulfilling an intent. For example, after the OrderPizza intent is fulfilled, you might prompt the
         * user to order a drink. The `follow_up_prompt` field and the `conclusion_statement` field are mutually
         * exclusive. You can specify only one. Attributes are documented under follow_up_prompt.
         * 
         * @return builder
         * 
         */
        public Builder followUpPrompt(IntentFollowUpPromptArgs followUpPrompt) {
            return followUpPrompt(Output.of(followUpPrompt));
        }

        /**
         * @param fulfillmentActivity Describes how the intent is fulfilled. For example, after a
         * user provides all of the information for a pizza order, `fulfillment_activity` defines how the bot
         * places an order with a local pizza store. Attributes are documented under fulfillment_activity.
         * 
         * @return builder
         * 
         */
        public Builder fulfillmentActivity(@Nullable Output<IntentFulfillmentActivityArgs> fulfillmentActivity) {
            $.fulfillmentActivity = fulfillmentActivity;
            return this;
        }

        /**
         * @param fulfillmentActivity Describes how the intent is fulfilled. For example, after a
         * user provides all of the information for a pizza order, `fulfillment_activity` defines how the bot
         * places an order with a local pizza store. Attributes are documented under fulfillment_activity.
         * 
         * @return builder
         * 
         */
        public Builder fulfillmentActivity(IntentFulfillmentActivityArgs fulfillmentActivity) {
            return fulfillmentActivity(Output.of(fulfillmentActivity));
        }

        /**
         * @param lastUpdatedDate The date when the $LATEST version of this intent was updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedDate(@Nullable Output<String> lastUpdatedDate) {
            $.lastUpdatedDate = lastUpdatedDate;
            return this;
        }

        /**
         * @param lastUpdatedDate The date when the $LATEST version of this intent was updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdatedDate(String lastUpdatedDate) {
            return lastUpdatedDate(Output.of(lastUpdatedDate));
        }

        /**
         * @param name The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentIntentSignature A unique identifier for the built-in intent to base this
         * intent on. To find the signature for an intent, see
         * [Standard Built-in Intents](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents)
         * in the Alexa Skills Kit.
         * 
         * @return builder
         * 
         */
        public Builder parentIntentSignature(@Nullable Output<String> parentIntentSignature) {
            $.parentIntentSignature = parentIntentSignature;
            return this;
        }

        /**
         * @param parentIntentSignature A unique identifier for the built-in intent to base this
         * intent on. To find the signature for an intent, see
         * [Standard Built-in Intents](https://developer.amazon.com/public/solutions/alexa/alexa-skills-kit/docs/built-in-intent-ref/standard-intents)
         * in the Alexa Skills Kit.
         * 
         * @return builder
         * 
         */
        public Builder parentIntentSignature(String parentIntentSignature) {
            return parentIntentSignature(Output.of(parentIntentSignature));
        }

        /**
         * @param rejectionStatement If the user answers &#34;no&#34; to the question defined in the prompt field,
         * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
         * documented below under statement.
         * 
         * @return builder
         * 
         */
        public Builder rejectionStatement(@Nullable Output<IntentRejectionStatementArgs> rejectionStatement) {
            $.rejectionStatement = rejectionStatement;
            return this;
        }

        /**
         * @param rejectionStatement If the user answers &#34;no&#34; to the question defined in the prompt field,
         * Amazon Lex responds with this statement to acknowledge that the intent was canceled. Attributes are
         * documented below under statement.
         * 
         * @return builder
         * 
         */
        public Builder rejectionStatement(IntentRejectionStatementArgs rejectionStatement) {
            return rejectionStatement(Output.of(rejectionStatement));
        }

        /**
         * @param sampleUtterances If you know a specific pattern with which users might respond to
         * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
         * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder sampleUtterances(@Nullable Output<List<String>> sampleUtterances) {
            $.sampleUtterances = sampleUtterances;
            return this;
        }

        /**
         * @param sampleUtterances If you know a specific pattern with which users might respond to
         * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
         * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder sampleUtterances(List<String> sampleUtterances) {
            return sampleUtterances(Output.of(sampleUtterances));
        }

        /**
         * @param sampleUtterances If you know a specific pattern with which users might respond to
         * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
         * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder sampleUtterances(String... sampleUtterances) {
            return sampleUtterances(List.of(sampleUtterances));
        }

        /**
         * @param slots An list of intent slots. At runtime, Amazon Lex elicits required slot values
         * from the user using prompts defined in the slots. Attributes are documented under slot.
         * 
         * @return builder
         * 
         */
        public Builder slots(@Nullable Output<List<IntentSlotArgs>> slots) {
            $.slots = slots;
            return this;
        }

        /**
         * @param slots An list of intent slots. At runtime, Amazon Lex elicits required slot values
         * from the user using prompts defined in the slots. Attributes are documented under slot.
         * 
         * @return builder
         * 
         */
        public Builder slots(List<IntentSlotArgs> slots) {
            return slots(Output.of(slots));
        }

        /**
         * @param slots An list of intent slots. At runtime, Amazon Lex elicits required slot values
         * from the user using prompts defined in the slots. Attributes are documented under slot.
         * 
         * @return builder
         * 
         */
        public Builder slots(IntentSlotArgs... slots) {
            return slots(List.of(slots));
        }

        /**
         * @param version The version of the bot.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the bot.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public IntentState build() {
            return $;
        }
    }

}