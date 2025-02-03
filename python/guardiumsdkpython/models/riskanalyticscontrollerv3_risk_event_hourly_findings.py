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
from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from guardiumsdkpython.models.riskanalyticscontrollerv3_finding import Riskanalyticscontrollerv3Finding
from guardiumsdkpython.models.riskanalyticscontrollerv3_indicator import Riskanalyticscontrollerv3Indicator
from guardiumsdkpython.models.riskanalyticsenginev3_severity_level import Riskanalyticsenginev3SeverityLevel
from typing import Optional, Set
from typing_extensions import Self

class Riskanalyticscontrollerv3RiskEventHourlyFindings(BaseModel):
    """
    RiskEventHourlyFindings message represents the hourly findings of a given risk.
    """ # noqa: E501
    date_from: Optional[datetime] = Field(default=None, description="Start date of the data in format YYYY-MM-DDTHH:mm:ssZ.")
    date_to: Optional[datetime] = Field(default=None, description="End date of the data in format YYYY-MM-DDTHH:mm:ssZ.")
    findings: Optional[List[Riskanalyticscontrollerv3Finding]] = Field(default=None, description="list of all the observations of the risk.")
    hourly_category: Optional[StrictStr] = Field(default=None, description="Classification of the risk in the given hour.")
    hourly_category_description: Optional[StrictStr] = Field(default=None, description="Classification description of the risk in the given hour.")
    hourly_description: Optional[StrictStr] = Field(default=None, description="Description of the risk.")
    hourly_severity_level: Optional[Riskanalyticsenginev3SeverityLevel] = None
    indicators: Optional[List[Riskanalyticscontrollerv3Indicator]] = Field(default=None, description="list of all the indicators - Optional (depending on include_indicators).")
    __properties: ClassVar[List[str]] = ["date_from", "date_to", "findings", "hourly_category", "hourly_category_description", "hourly_description", "hourly_severity_level", "indicators"]

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
        """Create an instance of Riskanalyticscontrollerv3RiskEventHourlyFindings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in findings (list)
        _items = []
        if self.findings:
            for _item in self.findings:
                if _item:
                    _items.append(_item.to_dict())
            _dict['findings'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in indicators (list)
        _items = []
        if self.indicators:
            for _item in self.indicators:
                if _item:
                    _items.append(_item.to_dict())
            _dict['indicators'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Riskanalyticscontrollerv3RiskEventHourlyFindings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "date_from": obj.get("date_from"),
            "date_to": obj.get("date_to"),
            "findings": [Riskanalyticscontrollerv3Finding.from_dict(_item) for _item in obj["findings"]] if obj.get("findings") is not None else None,
            "hourly_category": obj.get("hourly_category"),
            "hourly_category_description": obj.get("hourly_category_description"),
            "hourly_description": obj.get("hourly_description"),
            "hourly_severity_level": obj.get("hourly_severity_level"),
            "indicators": [Riskanalyticscontrollerv3Indicator.from_dict(_item) for _item in obj["indicators"]] if obj.get("indicators") is not None else None
        })
        return _obj


