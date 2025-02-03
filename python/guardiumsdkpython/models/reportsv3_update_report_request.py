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

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from guardiumsdkpython.models.reportsv3_chart_settings import Reportsv3ChartSettings
from guardiumsdkpython.models.reportsv3_report_definition import Reportsv3ReportDefinition
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3UpdateReportRequest(BaseModel):
    """
    UpdateReportRequest is the argument type used to update a report using the UpdateReport() api.
    """ # noqa: E501
    chart_settings: Optional[Reportsv3ChartSettings] = None
    report_definition: Optional[Reportsv3ReportDefinition] = None
    report_id: Optional[StrictStr] = Field(default=None, description="Unique Report ID.")
    __properties: ClassVar[List[str]] = ["chart_settings", "report_definition", "report_id"]

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
        """Create an instance of Reportsv3UpdateReportRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of chart_settings
        if self.chart_settings:
            _dict['chart_settings'] = self.chart_settings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of report_definition
        if self.report_definition:
            _dict['report_definition'] = self.report_definition.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Reportsv3UpdateReportRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "chart_settings": Reportsv3ChartSettings.from_dict(obj["chart_settings"]) if obj.get("chart_settings") is not None else None,
            "report_definition": Reportsv3ReportDefinition.from_dict(obj["report_definition"]) if obj.get("report_definition") is not None else None,
            "report_id": obj.get("report_id")
        })
        return _obj


