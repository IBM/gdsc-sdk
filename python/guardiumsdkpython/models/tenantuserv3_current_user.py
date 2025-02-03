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

from pydantic import BaseModel, ConfigDict
from typing import Any, ClassVar, Dict, List, Optional
from guardiumsdkpython.models.tenantuserv3_current_user_tenant import Tenantuserv3CurrentUserTenant
from guardiumsdkpython.models.tenantuserv3_full_user import Tenantuserv3FullUser
from guardiumsdkpython.models.tenantuserv3_tenant import Tenantuserv3Tenant
from typing import Optional, Set
from typing_extensions import Self

class Tenantuserv3CurrentUser(BaseModel):
    """
    CurrentUser contains a single user.
    """ # noqa: E501
    cur_user_tenant: Optional[Tenantuserv3Tenant] = None
    tenants: Optional[List[Tenantuserv3CurrentUserTenant]] = None
    user: Optional[Tenantuserv3FullUser] = None
    __properties: ClassVar[List[str]] = ["cur_user_tenant", "tenants", "user"]

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
        """Create an instance of Tenantuserv3CurrentUser from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of cur_user_tenant
        if self.cur_user_tenant:
            _dict['cur_user_tenant'] = self.cur_user_tenant.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in tenants (list)
        _items = []
        if self.tenants:
            for _item in self.tenants:
                if _item:
                    _items.append(_item.to_dict())
            _dict['tenants'] = _items
        # override the default output from pydantic by calling `to_dict()` of user
        if self.user:
            _dict['user'] = self.user.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Tenantuserv3CurrentUser from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "cur_user_tenant": Tenantuserv3Tenant.from_dict(obj["cur_user_tenant"]) if obj.get("cur_user_tenant") is not None else None,
            "tenants": [Tenantuserv3CurrentUserTenant.from_dict(_item) for _item in obj["tenants"]] if obj.get("tenants") is not None else None,
            "user": Tenantuserv3FullUser.from_dict(obj["user"]) if obj.get("user") is not None else None
        })
        return _obj


