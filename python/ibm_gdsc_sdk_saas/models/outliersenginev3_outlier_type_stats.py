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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Outliersenginev3OutlierTypeStats(BaseModel):
    """
    Describes an outlier type: What characterizes it, and how many were found during a period of time.
    """ # noqa: E501
    count: Optional[StrictInt] = Field(default=None, description="The number outliers found with the same characterization.")
    type_diff_messages: Optional[StrictBool] = None
    type_fails: Optional[StrictBool] = Field(default=None, description="Outlier is characterized by a high rate of exceptions, or error types.")
    type_new_messages: Optional[StrictBool] = Field(default=None, description="Outlier is characterized by high volume of new activity.")
    type_ongoing: Optional[StrictBool] = Field(default=None, description="Outlier is characterized by an ongoing activity below the thresholds, in recent hours.")
    type_volume: Optional[StrictBool] = Field(default=None, description="Outlier is characterized by high volume of activity, in general.")
    type_vulnerable_objects: Optional[StrictBool] = Field(default=None, description="Outlier is characterized by a high activity rate on vulnerable object groups.")
    __properties: ClassVar[List[str]] = ["count", "type_diff_messages", "type_fails", "type_new_messages", "type_ongoing", "type_volume", "type_vulnerable_objects"]

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
        """Create an instance of Outliersenginev3OutlierTypeStats from a JSON string"""
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
        """Create an instance of Outliersenginev3OutlierTypeStats from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "count": obj.get("count"),
            "type_diff_messages": obj.get("type_diff_messages"),
            "type_fails": obj.get("type_fails"),
            "type_new_messages": obj.get("type_new_messages"),
            "type_ongoing": obj.get("type_ongoing"),
            "type_volume": obj.get("type_volume"),
            "type_vulnerable_objects": obj.get("type_vulnerable_objects")
        })
        return _obj


