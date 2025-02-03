# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.groupbuilderv3_group_member import Groupbuilderv3GroupMember
from ibm_gdsc_sdk_software.models.groupbuilderv3_ldap_config import Groupbuilderv3LdapConfig
from ibm_gdsc_sdk_software.models.groupbuilderv3_nested_group_member import Groupbuilderv3NestedGroupMember
from typing import Optional, Set
from typing_extensions import Self

class Groupbuilderv3Group(BaseModel):
    """
    Group imports groups from a Guradium Data Protection central manager to Guardium Insights.
    """ # noqa: E501
    access_level: Optional[StrictInt] = Field(default=None, description="Group access level.")
    description: Optional[StrictStr] = Field(default=None, description="Group description.")
    flattened_member_count: Optional[StrictInt] = Field(default=None, description="Flattened member count for nested groups.")
    group_id: Optional[StrictInt] = Field(default=None, description="Group ID.")
    group_type_id: Optional[StrictInt] = Field(default=None, description="Group type ID.")
    last_sync_date: Optional[datetime] = Field(default=None, description="Last synchronization date.")
    ldap_config: Optional[Groupbuilderv3LdapConfig] = None
    member_count: Optional[StrictInt] = Field(default=None, description="Group members count.")
    members: Optional[List[Groupbuilderv3GroupMember]] = Field(default=None, description="Array of members.")
    name: Optional[StrictStr] = Field(default=None, description="Group name.")
    nested: Optional[StrictBool] = Field(default=None, description="Nested (hierarchical).")
    nested_group_members: Optional[List[Groupbuilderv3NestedGroupMember]] = Field(default=None, description="Array of nested (hierarchical) members.")
    next_sync_date: Optional[datetime] = Field(default=None, description="Next synchronization date.")
    sync_inactive_code: Optional[StrictInt] = Field(default=None, description="Synchronization inactive code.")
    sync_source: Optional[StrictStr] = Field(default=None, description="Name of Guardium Data Protection central manager synchronized to the group.")
    synced: Optional[StrictBool] = Field(default=None, description="Synchronized.")
    tuple_count: Optional[StrictInt] = Field(default=None, description="Group tuples count.")
    tuple_params: Optional[List[StrictStr]] = Field(default=None, description="Tuple parameters.")
    __properties: ClassVar[List[str]] = ["access_level", "description", "flattened_member_count", "group_id", "group_type_id", "last_sync_date", "ldap_config", "member_count", "members", "name", "nested", "nested_group_members", "next_sync_date", "sync_inactive_code", "sync_source", "synced", "tuple_count", "tuple_params"]

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
        """Create an instance of Groupbuilderv3Group from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of ldap_config
        if self.ldap_config:
            _dict['ldap_config'] = self.ldap_config.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in members (list)
        _items = []
        if self.members:
            for _item in self.members:
                if _item:
                    _items.append(_item.to_dict())
            _dict['members'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in nested_group_members (list)
        _items = []
        if self.nested_group_members:
            for _item in self.nested_group_members:
                if _item:
                    _items.append(_item.to_dict())
            _dict['nested_group_members'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Groupbuilderv3Group from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "access_level": obj.get("access_level"),
            "description": obj.get("description"),
            "flattened_member_count": obj.get("flattened_member_count"),
            "group_id": obj.get("group_id"),
            "group_type_id": obj.get("group_type_id"),
            "last_sync_date": obj.get("last_sync_date"),
            "ldap_config": Groupbuilderv3LdapConfig.from_dict(obj["ldap_config"]) if obj.get("ldap_config") is not None else None,
            "member_count": obj.get("member_count"),
            "members": [Groupbuilderv3GroupMember.from_dict(_item) for _item in obj["members"]] if obj.get("members") is not None else None,
            "name": obj.get("name"),
            "nested": obj.get("nested"),
            "nested_group_members": [Groupbuilderv3NestedGroupMember.from_dict(_item) for _item in obj["nested_group_members"]] if obj.get("nested_group_members") is not None else None,
            "next_sync_date": obj.get("next_sync_date"),
            "sync_inactive_code": obj.get("sync_inactive_code"),
            "sync_source": obj.get("sync_source"),
            "synced": obj.get("synced"),
            "tuple_count": obj.get("tuple_count"),
            "tuple_params": obj.get("tuple_params")
        })
        return _obj


