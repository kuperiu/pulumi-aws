// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPeeringAttachmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPeeringAttachmentPlainArgs Empty = new GetPeeringAttachmentPlainArgs();

    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetPeeringAttachmentFilter> filters;

    /**
     * @return One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    public Optional<List<GetPeeringAttachmentFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Identifier of the EC2 Transit Gateway Peering Attachment.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Identifier of the EC2 Transit Gateway Peering Attachment.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the specific EC2 Transit Gateway Peering Attachment to retrieve.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A mapping of tags, each pair of which must exactly match
     * a pair on the specific EC2 Transit Gateway Peering Attachment to retrieve.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetPeeringAttachmentPlainArgs() {}

    private GetPeeringAttachmentPlainArgs(GetPeeringAttachmentPlainArgs $) {
        this.filters = $.filters;
        this.id = $.id;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPeeringAttachmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPeeringAttachmentPlainArgs $;

        public Builder() {
            $ = new GetPeeringAttachmentPlainArgs();
        }

        public Builder(GetPeeringAttachmentPlainArgs defaults) {
            $ = new GetPeeringAttachmentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetPeeringAttachmentFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetPeeringAttachmentFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id Identifier of the EC2 Transit Gateway Peering Attachment.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param tags A mapping of tags, each pair of which must exactly match
         * a pair on the specific EC2 Transit Gateway Peering Attachment to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetPeeringAttachmentPlainArgs build() {
            return $;
        }
    }

}