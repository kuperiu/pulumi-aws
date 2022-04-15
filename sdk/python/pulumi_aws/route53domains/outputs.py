# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'RegisteredDomainAdminContact',
    'RegisteredDomainNameServer',
    'RegisteredDomainRegistrantContact',
    'RegisteredDomainTechContact',
]

@pulumi.output_type
class RegisteredDomainAdminContact(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "addressLine1":
            suggest = "address_line1"
        elif key == "addressLine2":
            suggest = "address_line2"
        elif key == "contactType":
            suggest = "contact_type"
        elif key == "countryCode":
            suggest = "country_code"
        elif key == "extraParams":
            suggest = "extra_params"
        elif key == "firstName":
            suggest = "first_name"
        elif key == "lastName":
            suggest = "last_name"
        elif key == "organizationName":
            suggest = "organization_name"
        elif key == "phoneNumber":
            suggest = "phone_number"
        elif key == "zipCode":
            suggest = "zip_code"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RegisteredDomainAdminContact. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RegisteredDomainAdminContact.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RegisteredDomainAdminContact.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 address_line1: Optional[str] = None,
                 address_line2: Optional[str] = None,
                 city: Optional[str] = None,
                 contact_type: Optional[str] = None,
                 country_code: Optional[str] = None,
                 email: Optional[str] = None,
                 extra_params: Optional[Mapping[str, str]] = None,
                 fax: Optional[str] = None,
                 first_name: Optional[str] = None,
                 last_name: Optional[str] = None,
                 organization_name: Optional[str] = None,
                 phone_number: Optional[str] = None,
                 state: Optional[str] = None,
                 zip_code: Optional[str] = None):
        """
        :param str address_line1: First line of the contact's address.
        :param str address_line2: Second line of contact's address, if any.
        :param str city: The city of the contact's address.
        :param str contact_type: Indicates whether the contact is a person, company, association, or public organization. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-ContactType) for valid values.
        :param str country_code: Code for the country of the contact's address. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-CountryCode) for valid values.
        :param str email: Email address of the contact.
        :param Mapping[str, str] extra_params: A key-value map of parameters required by certain top-level domains.
        :param str fax: Fax number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        :param str first_name: First name of contact.
        :param str last_name: Last name of contact.
        :param str organization_name: Name of the organization for contact types other than `PERSON`.
        :param str phone_number: The phone number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        :param str state: The state or province of the contact's city.
        :param str zip_code: The zip or postal code of the contact's address.
        """
        if address_line1 is not None:
            pulumi.set(__self__, "address_line1", address_line1)
        if address_line2 is not None:
            pulumi.set(__self__, "address_line2", address_line2)
        if city is not None:
            pulumi.set(__self__, "city", city)
        if contact_type is not None:
            pulumi.set(__self__, "contact_type", contact_type)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if extra_params is not None:
            pulumi.set(__self__, "extra_params", extra_params)
        if fax is not None:
            pulumi.set(__self__, "fax", fax)
        if first_name is not None:
            pulumi.set(__self__, "first_name", first_name)
        if last_name is not None:
            pulumi.set(__self__, "last_name", last_name)
        if organization_name is not None:
            pulumi.set(__self__, "organization_name", organization_name)
        if phone_number is not None:
            pulumi.set(__self__, "phone_number", phone_number)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if zip_code is not None:
            pulumi.set(__self__, "zip_code", zip_code)

    @property
    @pulumi.getter(name="addressLine1")
    def address_line1(self) -> Optional[str]:
        """
        First line of the contact's address.
        """
        return pulumi.get(self, "address_line1")

    @property
    @pulumi.getter(name="addressLine2")
    def address_line2(self) -> Optional[str]:
        """
        Second line of contact's address, if any.
        """
        return pulumi.get(self, "address_line2")

    @property
    @pulumi.getter
    def city(self) -> Optional[str]:
        """
        The city of the contact's address.
        """
        return pulumi.get(self, "city")

    @property
    @pulumi.getter(name="contactType")
    def contact_type(self) -> Optional[str]:
        """
        Indicates whether the contact is a person, company, association, or public organization. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-ContactType) for valid values.
        """
        return pulumi.get(self, "contact_type")

    @property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[str]:
        """
        Code for the country of the contact's address. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-CountryCode) for valid values.
        """
        return pulumi.get(self, "country_code")

    @property
    @pulumi.getter
    def email(self) -> Optional[str]:
        """
        Email address of the contact.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="extraParams")
    def extra_params(self) -> Optional[Mapping[str, str]]:
        """
        A key-value map of parameters required by certain top-level domains.
        """
        return pulumi.get(self, "extra_params")

    @property
    @pulumi.getter
    def fax(self) -> Optional[str]:
        """
        Fax number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        """
        return pulumi.get(self, "fax")

    @property
    @pulumi.getter(name="firstName")
    def first_name(self) -> Optional[str]:
        """
        First name of contact.
        """
        return pulumi.get(self, "first_name")

    @property
    @pulumi.getter(name="lastName")
    def last_name(self) -> Optional[str]:
        """
        Last name of contact.
        """
        return pulumi.get(self, "last_name")

    @property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> Optional[str]:
        """
        Name of the organization for contact types other than `PERSON`.
        """
        return pulumi.get(self, "organization_name")

    @property
    @pulumi.getter(name="phoneNumber")
    def phone_number(self) -> Optional[str]:
        """
        The phone number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        """
        return pulumi.get(self, "phone_number")

    @property
    @pulumi.getter
    def state(self) -> Optional[str]:
        """
        The state or province of the contact's city.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="zipCode")
    def zip_code(self) -> Optional[str]:
        """
        The zip or postal code of the contact's address.
        """
        return pulumi.get(self, "zip_code")


@pulumi.output_type
class RegisteredDomainNameServer(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "glueIps":
            suggest = "glue_ips"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RegisteredDomainNameServer. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RegisteredDomainNameServer.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RegisteredDomainNameServer.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 name: str,
                 glue_ips: Optional[Sequence[str]] = None):
        """
        :param str name: The fully qualified host name of the name server.
        :param Sequence[str] glue_ips: Glue IP addresses of a name server. The list can contain only one IPv4 and one IPv6 address.
        """
        pulumi.set(__self__, "name", name)
        if glue_ips is not None:
            pulumi.set(__self__, "glue_ips", glue_ips)

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The fully qualified host name of the name server.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="glueIps")
    def glue_ips(self) -> Optional[Sequence[str]]:
        """
        Glue IP addresses of a name server. The list can contain only one IPv4 and one IPv6 address.
        """
        return pulumi.get(self, "glue_ips")


@pulumi.output_type
class RegisteredDomainRegistrantContact(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "addressLine1":
            suggest = "address_line1"
        elif key == "addressLine2":
            suggest = "address_line2"
        elif key == "contactType":
            suggest = "contact_type"
        elif key == "countryCode":
            suggest = "country_code"
        elif key == "extraParams":
            suggest = "extra_params"
        elif key == "firstName":
            suggest = "first_name"
        elif key == "lastName":
            suggest = "last_name"
        elif key == "organizationName":
            suggest = "organization_name"
        elif key == "phoneNumber":
            suggest = "phone_number"
        elif key == "zipCode":
            suggest = "zip_code"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RegisteredDomainRegistrantContact. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RegisteredDomainRegistrantContact.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RegisteredDomainRegistrantContact.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 address_line1: Optional[str] = None,
                 address_line2: Optional[str] = None,
                 city: Optional[str] = None,
                 contact_type: Optional[str] = None,
                 country_code: Optional[str] = None,
                 email: Optional[str] = None,
                 extra_params: Optional[Mapping[str, str]] = None,
                 fax: Optional[str] = None,
                 first_name: Optional[str] = None,
                 last_name: Optional[str] = None,
                 organization_name: Optional[str] = None,
                 phone_number: Optional[str] = None,
                 state: Optional[str] = None,
                 zip_code: Optional[str] = None):
        """
        :param str address_line1: First line of the contact's address.
        :param str address_line2: Second line of contact's address, if any.
        :param str city: The city of the contact's address.
        :param str contact_type: Indicates whether the contact is a person, company, association, or public organization. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-ContactType) for valid values.
        :param str country_code: Code for the country of the contact's address. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-CountryCode) for valid values.
        :param str email: Email address of the contact.
        :param Mapping[str, str] extra_params: A key-value map of parameters required by certain top-level domains.
        :param str fax: Fax number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        :param str first_name: First name of contact.
        :param str last_name: Last name of contact.
        :param str organization_name: Name of the organization for contact types other than `PERSON`.
        :param str phone_number: The phone number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        :param str state: The state or province of the contact's city.
        :param str zip_code: The zip or postal code of the contact's address.
        """
        if address_line1 is not None:
            pulumi.set(__self__, "address_line1", address_line1)
        if address_line2 is not None:
            pulumi.set(__self__, "address_line2", address_line2)
        if city is not None:
            pulumi.set(__self__, "city", city)
        if contact_type is not None:
            pulumi.set(__self__, "contact_type", contact_type)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if extra_params is not None:
            pulumi.set(__self__, "extra_params", extra_params)
        if fax is not None:
            pulumi.set(__self__, "fax", fax)
        if first_name is not None:
            pulumi.set(__self__, "first_name", first_name)
        if last_name is not None:
            pulumi.set(__self__, "last_name", last_name)
        if organization_name is not None:
            pulumi.set(__self__, "organization_name", organization_name)
        if phone_number is not None:
            pulumi.set(__self__, "phone_number", phone_number)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if zip_code is not None:
            pulumi.set(__self__, "zip_code", zip_code)

    @property
    @pulumi.getter(name="addressLine1")
    def address_line1(self) -> Optional[str]:
        """
        First line of the contact's address.
        """
        return pulumi.get(self, "address_line1")

    @property
    @pulumi.getter(name="addressLine2")
    def address_line2(self) -> Optional[str]:
        """
        Second line of contact's address, if any.
        """
        return pulumi.get(self, "address_line2")

    @property
    @pulumi.getter
    def city(self) -> Optional[str]:
        """
        The city of the contact's address.
        """
        return pulumi.get(self, "city")

    @property
    @pulumi.getter(name="contactType")
    def contact_type(self) -> Optional[str]:
        """
        Indicates whether the contact is a person, company, association, or public organization. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-ContactType) for valid values.
        """
        return pulumi.get(self, "contact_type")

    @property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[str]:
        """
        Code for the country of the contact's address. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-CountryCode) for valid values.
        """
        return pulumi.get(self, "country_code")

    @property
    @pulumi.getter
    def email(self) -> Optional[str]:
        """
        Email address of the contact.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="extraParams")
    def extra_params(self) -> Optional[Mapping[str, str]]:
        """
        A key-value map of parameters required by certain top-level domains.
        """
        return pulumi.get(self, "extra_params")

    @property
    @pulumi.getter
    def fax(self) -> Optional[str]:
        """
        Fax number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        """
        return pulumi.get(self, "fax")

    @property
    @pulumi.getter(name="firstName")
    def first_name(self) -> Optional[str]:
        """
        First name of contact.
        """
        return pulumi.get(self, "first_name")

    @property
    @pulumi.getter(name="lastName")
    def last_name(self) -> Optional[str]:
        """
        Last name of contact.
        """
        return pulumi.get(self, "last_name")

    @property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> Optional[str]:
        """
        Name of the organization for contact types other than `PERSON`.
        """
        return pulumi.get(self, "organization_name")

    @property
    @pulumi.getter(name="phoneNumber")
    def phone_number(self) -> Optional[str]:
        """
        The phone number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        """
        return pulumi.get(self, "phone_number")

    @property
    @pulumi.getter
    def state(self) -> Optional[str]:
        """
        The state or province of the contact's city.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="zipCode")
    def zip_code(self) -> Optional[str]:
        """
        The zip or postal code of the contact's address.
        """
        return pulumi.get(self, "zip_code")


@pulumi.output_type
class RegisteredDomainTechContact(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "addressLine1":
            suggest = "address_line1"
        elif key == "addressLine2":
            suggest = "address_line2"
        elif key == "contactType":
            suggest = "contact_type"
        elif key == "countryCode":
            suggest = "country_code"
        elif key == "extraParams":
            suggest = "extra_params"
        elif key == "firstName":
            suggest = "first_name"
        elif key == "lastName":
            suggest = "last_name"
        elif key == "organizationName":
            suggest = "organization_name"
        elif key == "phoneNumber":
            suggest = "phone_number"
        elif key == "zipCode":
            suggest = "zip_code"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in RegisteredDomainTechContact. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        RegisteredDomainTechContact.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        RegisteredDomainTechContact.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 address_line1: Optional[str] = None,
                 address_line2: Optional[str] = None,
                 city: Optional[str] = None,
                 contact_type: Optional[str] = None,
                 country_code: Optional[str] = None,
                 email: Optional[str] = None,
                 extra_params: Optional[Mapping[str, str]] = None,
                 fax: Optional[str] = None,
                 first_name: Optional[str] = None,
                 last_name: Optional[str] = None,
                 organization_name: Optional[str] = None,
                 phone_number: Optional[str] = None,
                 state: Optional[str] = None,
                 zip_code: Optional[str] = None):
        """
        :param str address_line1: First line of the contact's address.
        :param str address_line2: Second line of contact's address, if any.
        :param str city: The city of the contact's address.
        :param str contact_type: Indicates whether the contact is a person, company, association, or public organization. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-ContactType) for valid values.
        :param str country_code: Code for the country of the contact's address. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-CountryCode) for valid values.
        :param str email: Email address of the contact.
        :param Mapping[str, str] extra_params: A key-value map of parameters required by certain top-level domains.
        :param str fax: Fax number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        :param str first_name: First name of contact.
        :param str last_name: Last name of contact.
        :param str organization_name: Name of the organization for contact types other than `PERSON`.
        :param str phone_number: The phone number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        :param str state: The state or province of the contact's city.
        :param str zip_code: The zip or postal code of the contact's address.
        """
        if address_line1 is not None:
            pulumi.set(__self__, "address_line1", address_line1)
        if address_line2 is not None:
            pulumi.set(__self__, "address_line2", address_line2)
        if city is not None:
            pulumi.set(__self__, "city", city)
        if contact_type is not None:
            pulumi.set(__self__, "contact_type", contact_type)
        if country_code is not None:
            pulumi.set(__self__, "country_code", country_code)
        if email is not None:
            pulumi.set(__self__, "email", email)
        if extra_params is not None:
            pulumi.set(__self__, "extra_params", extra_params)
        if fax is not None:
            pulumi.set(__self__, "fax", fax)
        if first_name is not None:
            pulumi.set(__self__, "first_name", first_name)
        if last_name is not None:
            pulumi.set(__self__, "last_name", last_name)
        if organization_name is not None:
            pulumi.set(__self__, "organization_name", organization_name)
        if phone_number is not None:
            pulumi.set(__self__, "phone_number", phone_number)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if zip_code is not None:
            pulumi.set(__self__, "zip_code", zip_code)

    @property
    @pulumi.getter(name="addressLine1")
    def address_line1(self) -> Optional[str]:
        """
        First line of the contact's address.
        """
        return pulumi.get(self, "address_line1")

    @property
    @pulumi.getter(name="addressLine2")
    def address_line2(self) -> Optional[str]:
        """
        Second line of contact's address, if any.
        """
        return pulumi.get(self, "address_line2")

    @property
    @pulumi.getter
    def city(self) -> Optional[str]:
        """
        The city of the contact's address.
        """
        return pulumi.get(self, "city")

    @property
    @pulumi.getter(name="contactType")
    def contact_type(self) -> Optional[str]:
        """
        Indicates whether the contact is a person, company, association, or public organization. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-ContactType) for valid values.
        """
        return pulumi.get(self, "contact_type")

    @property
    @pulumi.getter(name="countryCode")
    def country_code(self) -> Optional[str]:
        """
        Code for the country of the contact's address. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-CountryCode) for valid values.
        """
        return pulumi.get(self, "country_code")

    @property
    @pulumi.getter
    def email(self) -> Optional[str]:
        """
        Email address of the contact.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="extraParams")
    def extra_params(self) -> Optional[Mapping[str, str]]:
        """
        A key-value map of parameters required by certain top-level domains.
        """
        return pulumi.get(self, "extra_params")

    @property
    @pulumi.getter
    def fax(self) -> Optional[str]:
        """
        Fax number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        """
        return pulumi.get(self, "fax")

    @property
    @pulumi.getter(name="firstName")
    def first_name(self) -> Optional[str]:
        """
        First name of contact.
        """
        return pulumi.get(self, "first_name")

    @property
    @pulumi.getter(name="lastName")
    def last_name(self) -> Optional[str]:
        """
        Last name of contact.
        """
        return pulumi.get(self, "last_name")

    @property
    @pulumi.getter(name="organizationName")
    def organization_name(self) -> Optional[str]:
        """
        Name of the organization for contact types other than `PERSON`.
        """
        return pulumi.get(self, "organization_name")

    @property
    @pulumi.getter(name="phoneNumber")
    def phone_number(self) -> Optional[str]:
        """
        The phone number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        """
        return pulumi.get(self, "phone_number")

    @property
    @pulumi.getter
    def state(self) -> Optional[str]:
        """
        The state or province of the contact's city.
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="zipCode")
    def zip_code(self) -> Optional[str]:
        """
        The zip or postal code of the contact's address.
        """
        return pulumi.get(self, "zip_code")

