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
from ibm_gdsc_sdk_software.models.reportsv3_timestamp_mapping import Reportsv3TimestampMapping
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3CategoryDetail(BaseModel):
    """
    Reportsv3CategoryDetail
    """ # noqa: E501
    category_description: Optional[StrictStr] = Field(default=None, description="The category description.")
    category_name: Optional[StrictStr] = Field(default=None, description="Identifies the NLS translated string.")
    category_tables: Optional[List[StrictStr]] = None
    timestamp_mapping: Optional[List[Reportsv3TimestampMapping]] = None
    __properties: ClassVar[List[str]] = ["category_description", "category_name", "category_tables", "timestamp_mapping"]

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
        """Create an instance of Reportsv3CategoryDetail from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in timestamp_mapping (list)
        _items = []
        if self.timestamp_mapping:
            for _item in self.timestamp_mapping:
                if _item:
                    _items.append(_item.to_dict())
            _dict['timestamp_mapping'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Reportsv3CategoryDetail from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "category_description": obj.get("category_description"),
            "category_name": obj.get("category_name"),
            "category_tables": obj.get("category_tables"),
            "timestamp_mapping": [Reportsv3TimestampMapping.from_dict(_item) for _item in obj["timestamp_mapping"]] if obj.get("timestamp_mapping") is not None else None
        })
        return _obj


