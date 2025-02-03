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

from pydantic import BaseModel, ConfigDict, Field, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.schedulerv3_report_array import Schedulerv3ReportArray
from ibm_gdsc_sdk_software.models.schedulerv3_scheduled_job_summary import Schedulerv3ScheduledJobSummary
from typing import Optional, Set
from typing_extensions import Self

class Schedulerv3ScheduledJobSummaryResponse(BaseModel):
    """
    ScheduledJobSummaryResponse message for Get v3/schedules or v3/schedules/search api.
    """ # noqa: E501
    record_count: Optional[StrictInt] = Field(default=None, description="Total number of the scheduled jobs.")
    report_names: Optional[List[Schedulerv3ReportArray]] = Field(default=None, description="Array of report name for each scheduledJobSummary.")
    scheduled_job: Optional[List[Schedulerv3ScheduledJobSummary]] = Field(default=None, description="The requested scheduled job data.")
    __properties: ClassVar[List[str]] = ["record_count", "report_names", "scheduled_job"]

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
        """Create an instance of Schedulerv3ScheduledJobSummaryResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in report_names (list)
        _items = []
        if self.report_names:
            for _item in self.report_names:
                if _item:
                    _items.append(_item.to_dict())
            _dict['report_names'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in scheduled_job (list)
        _items = []
        if self.scheduled_job:
            for _item in self.scheduled_job:
                if _item:
                    _items.append(_item.to_dict())
            _dict['scheduled_job'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Schedulerv3ScheduledJobSummaryResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "record_count": obj.get("record_count"),
            "report_names": [Schedulerv3ReportArray.from_dict(_item) for _item in obj["report_names"]] if obj.get("report_names") is not None else None,
            "scheduled_job": [Schedulerv3ScheduledJobSummary.from_dict(_item) for _item in obj["scheduled_job"]] if obj.get("scheduled_job") is not None else None
        })
        return _obj


