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
from ibm_gdsc_sdk_software.models.reportsv3_chart_type import Reportsv3ChartType
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3ChartSettings(BaseModel):
    """
    ChartSettings encapsulates all data necessary for a chart object.
    """ # noqa: E501
    chart_id: Optional[StrictStr] = Field(default=None, description="The chart id.")
    chart_title: Optional[StrictStr] = Field(default=None, description="The chart title.")
    chart_type: Optional[Reportsv3ChartType] = None
    creation_time: Optional[datetime] = Field(default=None, description="The chart's cration time in format YYYY-MM-DDTHH:mm:ss.sssZ.")
    creator_user_id: Optional[StrictStr] = Field(default=None, description="An identifier for the creator of the chart.")
    dataset_header_id: Optional[StrictStr] = Field(default=None, description="Header id for the dataset values.")
    dataset_max_values: Optional[StrictInt] = Field(default=None, description="Chart dataset max values.")
    default_chart_expanded: Optional[StrictBool] = Field(default=None, description="The default_chart_expanded is a flag taken from the user settings collection per report and user.")
    is_default_chart: Optional[StrictBool] = Field(default=None, description="If true - this chart will be shown with the report.")
    is_predefined: Optional[StrictBool] = Field(default=None, description="If a chart is predefined.")
    refresh_rate: Optional[StrictInt] = Field(default=None, description="Chart refresh rate.")
    report_id: Optional[StrictStr] = Field(default=None, description="The report id that the chart connected to.")
    xaxis_header_id: Optional[StrictStr] = Field(default=None, description="Header id for the x-axis values.")
    xaxis_max_values: Optional[StrictInt] = Field(default=None, description="Chart xaxis max values.")
    yaxis_header_id: Optional[StrictStr] = Field(default=None, description="Header id for the y-axis values.")
    __properties: ClassVar[List[str]] = ["chart_id", "chart_title", "chart_type", "creation_time", "creator_user_id", "dataset_header_id", "dataset_max_values", "default_chart_expanded", "is_default_chart", "is_predefined", "refresh_rate", "report_id", "xaxis_header_id", "xaxis_max_values", "yaxis_header_id"]

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
        """Create an instance of Reportsv3ChartSettings from a JSON string"""
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
        """Create an instance of Reportsv3ChartSettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "chart_id": obj.get("chart_id"),
            "chart_title": obj.get("chart_title"),
            "chart_type": obj.get("chart_type"),
            "creation_time": obj.get("creation_time"),
            "creator_user_id": obj.get("creator_user_id"),
            "dataset_header_id": obj.get("dataset_header_id"),
            "dataset_max_values": obj.get("dataset_max_values"),
            "default_chart_expanded": obj.get("default_chart_expanded"),
            "is_default_chart": obj.get("is_default_chart"),
            "is_predefined": obj.get("is_predefined"),
            "refresh_rate": obj.get("refresh_rate"),
            "report_id": obj.get("report_id"),
            "xaxis_header_id": obj.get("xaxis_header_id"),
            "xaxis_max_values": obj.get("xaxis_max_values"),
            "yaxis_header_id": obj.get("yaxis_header_id")
        })
        return _obj


