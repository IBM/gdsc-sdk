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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Groupbuilderv3LdapConfig(BaseModel):
    """
    LdapConfig contains information about configuration for importing group members from LDAP.
    """ # noqa: E501
    attributes: Optional[List[StrictStr]] = Field(default=None, description="LDAP object attribute used to convert to member data.")
    bind_group_id: Optional[StrictInt] = Field(default=None, description="ID of the group whose members are used as bind values for parameterize filter.")
    bind_password: Optional[StrictStr] = Field(default=None, description="Password for binding to LDAP if bind ID is set for ICP LDAP definition.")
    clear_group: Optional[StrictBool] = Field(default=None, description="Flag indicating whether new data is replacing old data or is appended to it.")
    filter: Optional[StrictStr] = Field(default=None, description="LDAP search query to use to find objects.")
    filter_scope: Optional[StrictInt] = Field(default=None, description="Scope of LDAP search:  sub-tree vs immediate base DN children.")
    import_limit: Optional[StrictInt] = Field(default=None, description="Maximum number of objects to import.")
    ldap_group_name: Optional[StrictStr] = Field(default=None, description="DN name of the LDAP group to get members from.  Alternative to explicit filter.")
    ldap_id: Optional[StrictStr] = Field(default=None, description="ID of the ICP LDAP definition from which to import.")
    member_prefix: Optional[StrictStr] = Field(default=None, description="Prefix that will be added to each imported member.")
    __properties: ClassVar[List[str]] = ["attributes", "bind_group_id", "bind_password", "clear_group", "filter", "filter_scope", "import_limit", "ldap_group_name", "ldap_id", "member_prefix"]

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
        """Create an instance of Groupbuilderv3LdapConfig from a JSON string"""
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
        """Create an instance of Groupbuilderv3LdapConfig from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "attributes": obj.get("attributes"),
            "bind_group_id": obj.get("bind_group_id"),
            "bind_password": obj.get("bind_password"),
            "clear_group": obj.get("clear_group"),
            "filter": obj.get("filter"),
            "filter_scope": obj.get("filter_scope"),
            "import_limit": obj.get("import_limit"),
            "ldap_group_name": obj.get("ldap_group_name"),
            "ldap_id": obj.get("ldap_id"),
            "member_prefix": obj.get("member_prefix")
        })
        return _obj


