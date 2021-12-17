# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ThingGroupMembershipArgs', 'ThingGroupMembership']

@pulumi.input_type
class ThingGroupMembershipArgs:
    def __init__(__self__, *,
                 thing_group_name: pulumi.Input[str],
                 thing_name: pulumi.Input[str],
                 override_dynamic_group: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ThingGroupMembership resource.
        :param pulumi.Input[str] thing_group_name: The name of the group to which you are adding a thing.
        :param pulumi.Input[str] thing_name: The name of the thing to add to a group.
        :param pulumi.Input[bool] override_dynamic_group: Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
        """
        pulumi.set(__self__, "thing_group_name", thing_group_name)
        pulumi.set(__self__, "thing_name", thing_name)
        if override_dynamic_group is not None:
            pulumi.set(__self__, "override_dynamic_group", override_dynamic_group)

    @property
    @pulumi.getter(name="thingGroupName")
    def thing_group_name(self) -> pulumi.Input[str]:
        """
        The name of the group to which you are adding a thing.
        """
        return pulumi.get(self, "thing_group_name")

    @thing_group_name.setter
    def thing_group_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "thing_group_name", value)

    @property
    @pulumi.getter(name="thingName")
    def thing_name(self) -> pulumi.Input[str]:
        """
        The name of the thing to add to a group.
        """
        return pulumi.get(self, "thing_name")

    @thing_name.setter
    def thing_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "thing_name", value)

    @property
    @pulumi.getter(name="overrideDynamicGroup")
    def override_dynamic_group(self) -> Optional[pulumi.Input[bool]]:
        """
        Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
        """
        return pulumi.get(self, "override_dynamic_group")

    @override_dynamic_group.setter
    def override_dynamic_group(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "override_dynamic_group", value)


@pulumi.input_type
class _ThingGroupMembershipState:
    def __init__(__self__, *,
                 override_dynamic_group: Optional[pulumi.Input[bool]] = None,
                 thing_group_name: Optional[pulumi.Input[str]] = None,
                 thing_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ThingGroupMembership resources.
        :param pulumi.Input[bool] override_dynamic_group: Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
        :param pulumi.Input[str] thing_group_name: The name of the group to which you are adding a thing.
        :param pulumi.Input[str] thing_name: The name of the thing to add to a group.
        """
        if override_dynamic_group is not None:
            pulumi.set(__self__, "override_dynamic_group", override_dynamic_group)
        if thing_group_name is not None:
            pulumi.set(__self__, "thing_group_name", thing_group_name)
        if thing_name is not None:
            pulumi.set(__self__, "thing_name", thing_name)

    @property
    @pulumi.getter(name="overrideDynamicGroup")
    def override_dynamic_group(self) -> Optional[pulumi.Input[bool]]:
        """
        Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
        """
        return pulumi.get(self, "override_dynamic_group")

    @override_dynamic_group.setter
    def override_dynamic_group(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "override_dynamic_group", value)

    @property
    @pulumi.getter(name="thingGroupName")
    def thing_group_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the group to which you are adding a thing.
        """
        return pulumi.get(self, "thing_group_name")

    @thing_group_name.setter
    def thing_group_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "thing_group_name", value)

    @property
    @pulumi.getter(name="thingName")
    def thing_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the thing to add to a group.
        """
        return pulumi.get(self, "thing_name")

    @thing_name.setter
    def thing_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "thing_name", value)


class ThingGroupMembership(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 override_dynamic_group: Optional[pulumi.Input[bool]] = None,
                 thing_group_name: Optional[pulumi.Input[str]] = None,
                 thing_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Adds an IoT Thing to an IoT Thing Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.ThingGroupMembership("example",
            override_dynamic_group=True,
            thing_group_name="example-group",
            thing_name="example-thing")
        ```

        ## Import

        IoT Thing Group Membership can be imported using the thing group name and thing name.

        ```sh
         $ pulumi import aws:iot/thingGroupMembership:ThingGroupMembership example thing_group_name/thing_name
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] override_dynamic_group: Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
        :param pulumi.Input[str] thing_group_name: The name of the group to which you are adding a thing.
        :param pulumi.Input[str] thing_name: The name of the thing to add to a group.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ThingGroupMembershipArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Adds an IoT Thing to an IoT Thing Group.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.iot.ThingGroupMembership("example",
            override_dynamic_group=True,
            thing_group_name="example-group",
            thing_name="example-thing")
        ```

        ## Import

        IoT Thing Group Membership can be imported using the thing group name and thing name.

        ```sh
         $ pulumi import aws:iot/thingGroupMembership:ThingGroupMembership example thing_group_name/thing_name
        ```

        :param str resource_name: The name of the resource.
        :param ThingGroupMembershipArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ThingGroupMembershipArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 override_dynamic_group: Optional[pulumi.Input[bool]] = None,
                 thing_group_name: Optional[pulumi.Input[str]] = None,
                 thing_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ThingGroupMembershipArgs.__new__(ThingGroupMembershipArgs)

            __props__.__dict__["override_dynamic_group"] = override_dynamic_group
            if thing_group_name is None and not opts.urn:
                raise TypeError("Missing required property 'thing_group_name'")
            __props__.__dict__["thing_group_name"] = thing_group_name
            if thing_name is None and not opts.urn:
                raise TypeError("Missing required property 'thing_name'")
            __props__.__dict__["thing_name"] = thing_name
        super(ThingGroupMembership, __self__).__init__(
            'aws:iot/thingGroupMembership:ThingGroupMembership',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            override_dynamic_group: Optional[pulumi.Input[bool]] = None,
            thing_group_name: Optional[pulumi.Input[str]] = None,
            thing_name: Optional[pulumi.Input[str]] = None) -> 'ThingGroupMembership':
        """
        Get an existing ThingGroupMembership resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] override_dynamic_group: Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
        :param pulumi.Input[str] thing_group_name: The name of the group to which you are adding a thing.
        :param pulumi.Input[str] thing_name: The name of the thing to add to a group.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ThingGroupMembershipState.__new__(_ThingGroupMembershipState)

        __props__.__dict__["override_dynamic_group"] = override_dynamic_group
        __props__.__dict__["thing_group_name"] = thing_group_name
        __props__.__dict__["thing_name"] = thing_name
        return ThingGroupMembership(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="overrideDynamicGroup")
    def override_dynamic_group(self) -> pulumi.Output[Optional[bool]]:
        """
        Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
        """
        return pulumi.get(self, "override_dynamic_group")

    @property
    @pulumi.getter(name="thingGroupName")
    def thing_group_name(self) -> pulumi.Output[str]:
        """
        The name of the group to which you are adding a thing.
        """
        return pulumi.get(self, "thing_group_name")

    @property
    @pulumi.getter(name="thingName")
    def thing_name(self) -> pulumi.Output[str]:
        """
        The name of the thing to add to a group.
        """
        return pulumi.get(self, "thing_name")
