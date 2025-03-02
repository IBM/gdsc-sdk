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

from pydantic import BaseModel, ConfigDict
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_event import Riskanalyticscontrollerv3RiskEvent
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_event_former_hours import Riskanalyticscontrollerv3RiskEventFormerHours
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_event_hourly_findings import Riskanalyticscontrollerv3RiskEventHourlyFindings
from typing import Optional, Set
from typing_extensions import Self

class Riskanalyticscontrollerv3RiskEventSummarizationDataResponse(BaseModel):
    """
    RiskEventSummarizationDataResponse message for the GetRiskEventDataForSummarization api.
    """ # noqa: E501
    former_hours: Optional[Riskanalyticscontrollerv3RiskEventFormerHours] = None
    hourly_findings: Optional[List[Riskanalyticscontrollerv3RiskEventHourlyFindings]] = None
    risk_event: Optional[Riskanalyticscontrollerv3RiskEvent] = None
    __properties: ClassVar[List[str]] = ["former_hours", "hourly_findings", "risk_event"]

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
        """Create an instance of Riskanalyticscontrollerv3RiskEventSummarizationDataResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of former_hours
        if self.former_hours:
            _dict['former_hours'] = self.former_hours.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in hourly_findings (list)
        _items = []
        if self.hourly_findings:
            for _item in self.hourly_findings:
                if _item:
                    _items.append(_item.to_dict())
            _dict['hourly_findings'] = _items
        # override the default output from pydantic by calling `to_dict()` of risk_event
        if self.risk_event:
            _dict['risk_event'] = self.risk_event.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Riskanalyticscontrollerv3RiskEventSummarizationDataResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "former_hours": Riskanalyticscontrollerv3RiskEventFormerHours.from_dict(obj["former_hours"]) if obj.get("former_hours") is not None else None,
            "hourly_findings": [Riskanalyticscontrollerv3RiskEventHourlyFindings.from_dict(_item) for _item in obj["hourly_findings"]] if obj.get("hourly_findings") is not None else None,
            "risk_event": Riskanalyticscontrollerv3RiskEvent.from_dict(obj["risk_event"]) if obj.get("risk_event") is not None else None
        })
        return _obj


