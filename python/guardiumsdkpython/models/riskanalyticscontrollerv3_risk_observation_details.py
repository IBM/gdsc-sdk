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
from guardiumsdkpython.models.riskanalyticscontrollerv3_emerging_risk_details import Riskanalyticscontrollerv3EmergingRiskDetails
from guardiumsdkpython.models.riskanalyticscontrollerv3_observation_report_filter import Riskanalyticscontrollerv3ObservationReportFilter
from guardiumsdkpython.models.riskanalyticsenginev3_feature import Riskanalyticsenginev3Feature
from typing import Optional, Set
from typing_extensions import Self

class Riskanalyticscontrollerv3RiskObservationDetails(BaseModel):
    """
    Risk observation details.
    """ # noqa: E501
    classification: Optional[StrictStr] = None
    date_from: Optional[datetime] = Field(default=None, description="Start date in format YYYY-MM-DDTHH:mm:ssZ.")
    date_to: Optional[datetime] = Field(default=None, description="End updated date in format YYYY-MM-DDTHH:mm:ssZ.")
    description: Optional[StrictStr] = None
    emerging_risk_details: Optional[Riskanalyticscontrollerv3EmergingRiskDetails] = None
    features: Optional[List[Riskanalyticsenginev3Feature]] = Field(default=None, description="Features list based on the requested lead_feature_id.")
    report_filters: Optional[List[Riskanalyticscontrollerv3ObservationReportFilter]] = Field(default=None, description="List of headers and values for filtering the report based on pivot information.")
    report_id: Optional[StrictStr] = Field(default=None, description="Report id based on the requested ObservationType.")
    __properties: ClassVar[List[str]] = ["classification", "date_from", "date_to", "description", "emerging_risk_details", "features", "report_filters", "report_id"]

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
        """Create an instance of Riskanalyticscontrollerv3RiskObservationDetails from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of emerging_risk_details
        if self.emerging_risk_details:
            _dict['emerging_risk_details'] = self.emerging_risk_details.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in features (list)
        _items = []
        if self.features:
            for _item in self.features:
                if _item:
                    _items.append(_item.to_dict())
            _dict['features'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in report_filters (list)
        _items = []
        if self.report_filters:
            for _item in self.report_filters:
                if _item:
                    _items.append(_item.to_dict())
            _dict['report_filters'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Riskanalyticscontrollerv3RiskObservationDetails from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "classification": obj.get("classification"),
            "date_from": obj.get("date_from"),
            "date_to": obj.get("date_to"),
            "description": obj.get("description"),
            "emerging_risk_details": Riskanalyticscontrollerv3EmergingRiskDetails.from_dict(obj["emerging_risk_details"]) if obj.get("emerging_risk_details") is not None else None,
            "features": [Riskanalyticsenginev3Feature.from_dict(_item) for _item in obj["features"]] if obj.get("features") is not None else None,
            "report_filters": [Riskanalyticscontrollerv3ObservationReportFilter.from_dict(_item) for _item in obj["report_filters"]] if obj.get("report_filters") is not None else None,
            "report_id": obj.get("report_id")
        })
        return _obj


