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

from pydantic import BaseModel, ConfigDict, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.reportsv3_table_names import Reportsv3TableNames
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3CategoryVersion(BaseModel):
    """
    Reportsv3CategoryVersion
    """ # noqa: E501
    header_map: Optional[Dict[str, StrictStr]] = None
    name: Optional[StrictStr] = None
    primary: Optional[StrictBool] = None
    skip_join_only: Optional[StrictBool] = None
    table_map: Optional[Dict[str, Reportsv3TableNames]] = None
    __properties: ClassVar[List[str]] = ["header_map", "name", "primary", "skip_join_only", "table_map"]

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
        """Create an instance of Reportsv3CategoryVersion from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each value in table_map (dict)
        _field_dict = {}
        if self.table_map:
            for _key in self.table_map:
                if self.table_map[_key]:
                    _field_dict[_key] = self.table_map[_key].to_dict()
            _dict['table_map'] = _field_dict
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Reportsv3CategoryVersion from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "header_map": obj.get("header_map"),
            "name": obj.get("name"),
            "primary": obj.get("primary"),
            "skip_join_only": obj.get("skip_join_only"),
            "table_map": dict(
                (_k, Reportsv3TableNames.from_dict(_v))
                for _k, _v in obj["table_map"].items()
            )
            if obj.get("table_map") is not None
            else None
        })
        return _obj


