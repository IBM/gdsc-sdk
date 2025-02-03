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
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.reportsv3_report_filter_brackets import Reportsv3ReportFilterBrackets
from ibm_gdsc_sdk_software.models.schedulerv3_task_type import Schedulerv3TaskType
from typing import Optional, Set
from typing_extensions import Self

class Workflowv3ReportRun(BaseModel):
    """
    Information about the report run.
    """ # noqa: E501
    date_end: Optional[datetime] = Field(default=None, description="When the job finished.")
    date_start: Optional[datetime] = Field(default=None, description="When the job started.")
    detail: Optional[StrictStr] = Field(default=None, description="Job status detail.")
    query_from: Optional[StrictStr] = Field(default=None, description="Absolute value of the runtime parameter for time period (time from).")
    query_to: Optional[StrictStr] = Field(default=None, description="Absolute value of the runtime parameter for time period (time to).")
    report_filters: Optional[Reportsv3ReportFilterBrackets] = None
    report_id: Optional[StrictStr] = Field(default=None, description="Report ID.")
    report_name: Optional[StrictStr] = Field(default=None, description="Report name.")
    report_result_file_name: Optional[StrictStr] = Field(default=None, description="The report result file name.")
    run_id: Optional[StrictStr] = Field(default=None, description="The identifier of the run.")
    scheduled_job_id: Optional[StrictStr] = Field(default=None, description="The ScheduledJob identifier.")
    scheduled_job_name: Optional[StrictStr] = Field(default=None, description="The ScheduledJob name identifier.")
    scheduled_task_id: Optional[StrictStr] = Field(default=None, description="The task within the ScheduledJob.")
    scheduled_task_type: Optional[Schedulerv3TaskType] = None
    status: Optional[StrictInt] = Field(default=None, description="Job status.")
    __properties: ClassVar[List[str]] = ["date_end", "date_start", "detail", "query_from", "query_to", "report_filters", "report_id", "report_name", "report_result_file_name", "run_id", "scheduled_job_id", "scheduled_job_name", "scheduled_task_id", "scheduled_task_type", "status"]

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
        """Create an instance of Workflowv3ReportRun from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of report_filters
        if self.report_filters:
            _dict['report_filters'] = self.report_filters.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Workflowv3ReportRun from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "date_end": obj.get("date_end"),
            "date_start": obj.get("date_start"),
            "detail": obj.get("detail"),
            "query_from": obj.get("query_from"),
            "query_to": obj.get("query_to"),
            "report_filters": Reportsv3ReportFilterBrackets.from_dict(obj["report_filters"]) if obj.get("report_filters") is not None else None,
            "report_id": obj.get("report_id"),
            "report_name": obj.get("report_name"),
            "report_result_file_name": obj.get("report_result_file_name"),
            "run_id": obj.get("run_id"),
            "scheduled_job_id": obj.get("scheduled_job_id"),
            "scheduled_job_name": obj.get("scheduled_job_name"),
            "scheduled_task_id": obj.get("scheduled_task_id"),
            "scheduled_task_type": obj.get("scheduled_task_type"),
            "status": obj.get("status")
        })
        return _obj


