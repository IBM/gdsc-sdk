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
from ibm_gdsc_sdk_saas.models.protobuf_field_mask import ProtobufFieldMask
from ibm_gdsc_sdk_saas.models.reportsv3_chart_type import Reportsv3ChartType
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3PartialChartUpdateRequest(BaseModel):
    """
    PartialChartUpdateRequest is the argument type used to update a chart  with partial information.
    """ # noqa: E501
    chart_id: Optional[StrictStr] = Field(default=None, description="Unique chart ID.")
    chart_title: Optional[StrictStr] = Field(default=None, description="The chart title.")
    chart_type: Optional[Reportsv3ChartType] = None
    update_mask: Optional[ProtobufFieldMask] = None
    __properties: ClassVar[List[str]] = ["chart_id", "chart_title", "chart_type", "update_mask"]

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
        """Create an instance of Reportsv3PartialChartUpdateRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of update_mask
        if self.update_mask:
            _dict['update_mask'] = self.update_mask.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Reportsv3PartialChartUpdateRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "chart_id": obj.get("chart_id"),
            "chart_title": obj.get("chart_title"),
            "chart_type": obj.get("chart_type"),
            "update_mask": ProtobufFieldMask.from_dict(obj["update_mask"]) if obj.get("update_mask") is not None else None
        })
        return _obj


