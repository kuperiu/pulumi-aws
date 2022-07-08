// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InvitationAccepterState extends com.pulumi.resources.ResourceArgs {

    public static final InvitationAccepterState Empty = new InvitationAccepterState();

    /**
     * The AWS account ID for the account that sent the invitation.
     * 
     */
    @Import(name="administratorAccountId")
    private @Nullable Output<String> administratorAccountId;

    /**
     * @return The AWS account ID for the account that sent the invitation.
     * 
     */
    public Optional<Output<String>> administratorAccountId() {
        return Optional.ofNullable(this.administratorAccountId);
    }

    /**
     * The unique identifier for the invitation.
     * 
     */
    @Import(name="invitationId")
    private @Nullable Output<String> invitationId;

    /**
     * @return The unique identifier for the invitation.
     * 
     */
    public Optional<Output<String>> invitationId() {
        return Optional.ofNullable(this.invitationId);
    }

    private InvitationAccepterState() {}

    private InvitationAccepterState(InvitationAccepterState $) {
        this.administratorAccountId = $.administratorAccountId;
        this.invitationId = $.invitationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InvitationAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InvitationAccepterState $;

        public Builder() {
            $ = new InvitationAccepterState();
        }

        public Builder(InvitationAccepterState defaults) {
            $ = new InvitationAccepterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param administratorAccountId The AWS account ID for the account that sent the invitation.
         * 
         * @return builder
         * 
         */
        public Builder administratorAccountId(@Nullable Output<String> administratorAccountId) {
            $.administratorAccountId = administratorAccountId;
            return this;
        }

        /**
         * @param administratorAccountId The AWS account ID for the account that sent the invitation.
         * 
         * @return builder
         * 
         */
        public Builder administratorAccountId(String administratorAccountId) {
            return administratorAccountId(Output.of(administratorAccountId));
        }

        /**
         * @param invitationId The unique identifier for the invitation.
         * 
         * @return builder
         * 
         */
        public Builder invitationId(@Nullable Output<String> invitationId) {
            $.invitationId = invitationId;
            return this;
        }

        /**
         * @param invitationId The unique identifier for the invitation.
         * 
         * @return builder
         * 
         */
        public Builder invitationId(String invitationId) {
            return invitationId(Output.of(invitationId));
        }

        public InvitationAccepterState build() {
            return $;
        }
    }

}