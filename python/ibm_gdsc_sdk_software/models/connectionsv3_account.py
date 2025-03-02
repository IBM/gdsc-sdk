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

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Connectionsv3Account(BaseModel):
    """
    Account.
    """ # noqa: E501
    access_key: Optional[StrictStr] = Field(default=None, description="Access key for the connection account.")
    authentication_type: Optional[StrictStr] = Field(default=None, description="Authentication type of account.")
    connection_type: Optional[StrictStr] = Field(default=None, description="Connection type for the account.")
    name: Optional[StrictStr] = Field(default=None, description="Name of acccount.")
    role_arn: Optional[StrictStr] = Field(default=None, description="Optional: role of the acccount.")
    secret_access_key: Optional[StrictStr] = Field(default=None, description="Account password.")
    __properties: ClassVar[List[str]] = ["access_key", "authentication_type", "connection_type", "name", "role_arn", "secret_access_key"]

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
        """Create an instance of Connectionsv3Account from a JSON string"""
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
        """Create an instance of Connectionsv3Account from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "access_key": obj.get("access_key"),
            "authentication_type": obj.get("authentication_type"),
            "connection_type": obj.get("connection_type"),
            "name": obj.get("name"),
            "role_arn": obj.get("role_arn"),
            "secret_access_key": obj.get("secret_access_key")
        })
        return _obj


