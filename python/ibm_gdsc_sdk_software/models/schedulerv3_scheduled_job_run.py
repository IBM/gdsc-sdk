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
from pydantic import BaseModel, ConfigDict, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.schedulerv3_execution_status import Schedulerv3ExecutionStatus
from ibm_gdsc_sdk_software.models.schedulerv3_task_type import Schedulerv3TaskType
from typing import Optional, Set
from typing_extensions import Self

class Schedulerv3ScheduledJobRun(BaseModel):
    """
    Schedulerv3ScheduledJobRun
    """ # noqa: E501
    collection_id: Optional[StrictStr] = None
    end_time: Optional[datetime] = None
    job_id: Optional[StrictStr] = None
    previous_job_id: Optional[StrictStr] = None
    query_from: Optional[StrictStr] = None
    query_to: Optional[StrictStr] = None
    queue_time: Optional[datetime] = None
    run_detail: Optional[StrictStr] = None
    schedule_id: Optional[StrictStr] = None
    start_time: Optional[datetime] = None
    status: Optional[Schedulerv3ExecutionStatus] = None
    task_id: Optional[StrictStr] = None
    task_name: Optional[StrictStr] = None
    task_type: Optional[Schedulerv3TaskType] = None
    __properties: ClassVar[List[str]] = ["collection_id", "end_time", "job_id", "previous_job_id", "query_from", "query_to", "queue_time", "run_detail", "schedule_id", "start_time", "status", "task_id", "task_name", "task_type"]

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
        """Create an instance of Schedulerv3ScheduledJobRun from a JSON string"""
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
        """Create an instance of Schedulerv3ScheduledJobRun from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "collection_id": obj.get("collection_id"),
            "end_time": obj.get("end_time"),
            "job_id": obj.get("job_id"),
            "previous_job_id": obj.get("previous_job_id"),
            "query_from": obj.get("query_from"),
            "query_to": obj.get("query_to"),
            "queue_time": obj.get("queue_time"),
            "run_detail": obj.get("run_detail"),
            "schedule_id": obj.get("schedule_id"),
            "start_time": obj.get("start_time"),
            "status": obj.get("status"),
            "task_id": obj.get("task_id"),
            "task_name": obj.get("task_name"),
            "task_type": obj.get("task_type")
        })
        return _obj


