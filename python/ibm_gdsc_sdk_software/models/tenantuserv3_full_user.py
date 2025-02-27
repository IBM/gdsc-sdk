# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.tenantuserv3_user_state import Tenantuserv3UserState
from typing import Optional, Set
from typing_extensions import Self

class Tenantuserv3FullUser(BaseModel):
    """
    Tenantuserv3FullUser
    """ # noqa: E501
    activation_date: Optional[datetime] = Field(default=None, description="Datetime of last access.")
    directory_id: Optional[StrictStr] = Field(default=None, description="Which directory did this user come from?.")
    disabled: Optional[StrictBool] = Field(default=None, description="Disabled.")
    display_name: Optional[StrictStr] = Field(default=None, description="LDAP cn.")
    distinguished_name: Optional[StrictStr] = Field(default=None, description="LDAP dn=  (needed to import user from LDAP into TenantUser).")
    email: Optional[StrictStr] = Field(default=None, description="The email address of the user for communication.")
    external_id: Optional[StrictStr] = Field(default=None, description="External id of this user. E.g. ISV id.")
    metadata: Optional[Dict[str, StrictStr]] = Field(default=None, description="Metadata will contain all preferences   --> this will contain all user-specific settings, including session time out.")
    privileges: Optional[Dict[str, StrictBool]] = Field(default=None, description="Cumulative privileges base on all roles.")
    roles: Optional[List[StrictStr]] = Field(default=None, description="Roles.")
    state: Optional[Tenantuserv3UserState] = None
    tenant_id: Optional[StrictStr] = Field(default=None, description="Tenant this user belongs to.")
    uid: Optional[StrictStr] = Field(default=None, description="Email.")
    user_id: Optional[StrictStr] = Field(default=None, description="Unique id for user.")
    __properties: ClassVar[List[str]] = ["activation_date", "directory_id", "disabled", "display_name", "distinguished_name", "email", "external_id", "metadata", "privileges", "roles", "state", "tenant_id", "uid", "user_id"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of Tenantuserv3FullUser from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Tenantuserv3FullUser from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "activation_date": obj.get("activation_date"),
            "directory_id": obj.get("directory_id"),
            "disabled": obj.get("disabled"),
            "display_name": obj.get("display_name"),
            "distinguished_name": obj.get("distinguished_name"),
            "email": obj.get("email"),
            "external_id": obj.get("external_id"),
            "metadata": obj.get("metadata"),
            "privileges": obj.get("privileges"),
            "roles": obj.get("roles"),
            "state": obj.get("state"),
            "tenant_id": obj.get("tenant_id"),
            "uid": obj.get("uid"),
            "user_id": obj.get("user_id")
        })
        return _obj


