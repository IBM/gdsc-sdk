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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.groupbuilderv3_group import Groupbuilderv3Group
from ibm_gdsc_sdk_saas.models.groupbuilderv3_ldap_config import Groupbuilderv3LdapConfig
from typing import Optional, Set
from typing_extensions import Self

class Groupbuilderv3ImportGroupRequest(BaseModel):
    """
    GetGroupsRequest requests to import specific groups from a Guardium Data Protection central manager.
    """ # noqa: E501
    central_manager_id: Optional[StrictStr] = Field(default=None, description="Central manager host name.")
    groups: Optional[List[Groupbuilderv3Group]] = Field(default=None, description="List of groups to import from the central manager.")
    ldap_config: Optional[Groupbuilderv3LdapConfig] = None
    one_time: Optional[StrictBool] = Field(default=None, description="Import without synchronizing.")
    preview: Optional[StrictBool] = Field(default=None, description="This flag is only valid if ldap_config is specified When set, LDAP import will pull the first 10 members from LDAP based on specified  LDAP config and return to the caller without adding them to the group.")
    __properties: ClassVar[List[str]] = ["central_manager_id", "groups", "ldap_config", "one_time", "preview"]

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
        """Create an instance of Groupbuilderv3ImportGroupRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in groups (list)
        _items = []
        if self.groups:
            for _item in self.groups:
                if _item:
                    _items.append(_item.to_dict())
            _dict['groups'] = _items
        # override the default output from pydantic by calling `to_dict()` of ldap_config
        if self.ldap_config:
            _dict['ldap_config'] = self.ldap_config.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Groupbuilderv3ImportGroupRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "central_manager_id": obj.get("central_manager_id"),
            "groups": [Groupbuilderv3Group.from_dict(_item) for _item in obj["groups"]] if obj.get("groups") is not None else None,
            "ldap_config": Groupbuilderv3LdapConfig.from_dict(obj["ldap_config"]) if obj.get("ldap_config") is not None else None,
            "one_time": obj.get("one_time"),
            "preview": obj.get("preview")
        })
        return _obj


