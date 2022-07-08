// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationArgs;
import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs;
import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs;
import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortArgs;
import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs();

    /**
     * Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
     * 
     */
    @Import(name="destinationPorts")
    private @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs>> destinationPorts;

    /**
     * @return Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
     * 
     */
    public Optional<Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs>>> destinationPorts() {
        return Optional.ofNullable(this.destinationPorts);
    }

    /**
     * Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
     * 
     */
    @Import(name="destinations")
    private @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationArgs>> destinations;

    /**
     * @return Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
     * 
     */
    public Optional<Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationArgs>>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    /**
     * Set of protocols to inspect for, specified using the protocol&#39;s assigned internet protocol number (IANA). If not specified, this matches with any protocol.
     * 
     */
    @Import(name="protocols")
    private @Nullable Output<List<Integer>> protocols;

    /**
     * @return Set of protocols to inspect for, specified using the protocol&#39;s assigned internet protocol number (IANA). If not specified, this matches with any protocol.
     * 
     */
    public Optional<Output<List<Integer>>> protocols() {
        return Optional.ofNullable(this.protocols);
    }

    /**
     * Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
     * 
     */
    @Import(name="sourcePorts")
    private @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortArgs>> sourcePorts;

    /**
     * @return Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
     * 
     */
    public Optional<Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortArgs>>> sourcePorts() {
        return Optional.ofNullable(this.sourcePorts);
    }

    /**
     * Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs>> sources;

    /**
     * @return Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
     * 
     */
    public Optional<Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    /**
     * Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
     * 
     */
    @Import(name="tcpFlags")
    private @Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs>> tcpFlags;

    /**
     * @return Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
     * 
     */
    public Optional<Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs>>> tcpFlags() {
        return Optional.ofNullable(this.tcpFlags);
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs() {}

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs $) {
        this.destinationPorts = $.destinationPorts;
        this.destinations = $.destinations;
        this.protocols = $.protocols;
        this.sourcePorts = $.sourcePorts;
        this.sources = $.sources;
        this.tcpFlags = $.tcpFlags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs();
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs defaults) {
            $ = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationPorts Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(@Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs>> destinationPorts) {
            $.destinationPorts = destinationPorts;
            return this;
        }

        /**
         * @param destinationPorts Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs> destinationPorts) {
            return destinationPorts(Output.of(destinationPorts));
        }

        /**
         * @param destinationPorts Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortArgs... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }

        /**
         * @param destinations Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
         * 
         * @return builder
         * 
         */
        public Builder destinations(@Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        /**
         * @param destinations Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
         * 
         * @return builder
         * 
         */
        public Builder destinations(List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        /**
         * @param destinations Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
         * 
         * @return builder
         * 
         */
        public Builder destinations(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }

        /**
         * @param protocols Set of protocols to inspect for, specified using the protocol&#39;s assigned internet protocol number (IANA). If not specified, this matches with any protocol.
         * 
         * @return builder
         * 
         */
        public Builder protocols(@Nullable Output<List<Integer>> protocols) {
            $.protocols = protocols;
            return this;
        }

        /**
         * @param protocols Set of protocols to inspect for, specified using the protocol&#39;s assigned internet protocol number (IANA). If not specified, this matches with any protocol.
         * 
         * @return builder
         * 
         */
        public Builder protocols(List<Integer> protocols) {
            return protocols(Output.of(protocols));
        }

        /**
         * @param protocols Set of protocols to inspect for, specified using the protocol&#39;s assigned internet protocol number (IANA). If not specified, this matches with any protocol.
         * 
         * @return builder
         * 
         */
        public Builder protocols(Integer... protocols) {
            return protocols(List.of(protocols));
        }

        /**
         * @param sourcePorts Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
         * 
         * @return builder
         * 
         */
        public Builder sourcePorts(@Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortArgs>> sourcePorts) {
            $.sourcePorts = sourcePorts;
            return this;
        }

        /**
         * @param sourcePorts Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
         * 
         * @return builder
         * 
         */
        public Builder sourcePorts(List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortArgs> sourcePorts) {
            return sourcePorts(Output.of(sourcePorts));
        }

        /**
         * @param sourcePorts Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
         * 
         * @return builder
         * 
         */
        public Builder sourcePorts(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortArgs... sourcePorts) {
            return sourcePorts(List.of(sourcePorts));
        }

        /**
         * @param sources Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
         * 
         * @return builder
         * 
         */
        public Builder sources(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceArgs... sources) {
            return sources(List.of(sources));
        }

        /**
         * @param tcpFlags Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
         * 
         * @return builder
         * 
         */
        public Builder tcpFlags(@Nullable Output<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs>> tcpFlags) {
            $.tcpFlags = tcpFlags;
            return this;
        }

        /**
         * @param tcpFlags Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
         * 
         * @return builder
         * 
         */
        public Builder tcpFlags(List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs> tcpFlags) {
            return tcpFlags(Output.of(tcpFlags));
        }

        /**
         * @param tcpFlags Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
         * 
         * @return builder
         * 
         */
        public Builder tcpFlags(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagArgs... tcpFlags) {
            return tcpFlags(List.of(tcpFlags));
        }

        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesArgs build() {
            return $;
        }
    }

}