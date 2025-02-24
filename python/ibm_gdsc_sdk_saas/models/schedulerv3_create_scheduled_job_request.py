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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.schedulerv3_audit_type import Schedulerv3AuditType
from ibm_gdsc_sdk_saas.models.schedulerv3_notification_type import Schedulerv3NotificationType
from ibm_gdsc_sdk_saas.models.schedulerv3_recipient import Schedulerv3Recipient
from ibm_gdsc_sdk_saas.models.schedulerv3_retention import Schedulerv3Retention
from ibm_gdsc_sdk_saas.models.schedulerv3_scheduled_task import Schedulerv3ScheduledTask
from ibm_gdsc_sdk_saas.models.schedulerv3_scheduler import Schedulerv3Scheduler
from typing import Optional, Set
from typing_extensions import Self

class Schedulerv3CreateScheduledJobRequest(BaseModel):
    """
    CreateScheduledJobRequest message for Post v3/schedules api.
    """ # noqa: E501
    description: Optional[StrictStr] = Field(default=None, description="Optional: Description for the scheduledJob.")
    enabled: Optional[StrictBool] = Field(default=None, description="Optional: Enable or disable.")
    instructions: Optional[StrictStr] = Field(default=None, description="Optional: The instructions for the recipient.")
    internal_audit: Optional[Schedulerv3AuditType] = None
    name: Optional[StrictStr] = Field(default=None, description="Name of the schedule.")
    notification: Optional[Schedulerv3NotificationType] = None
    origin: Optional[StrictStr] = None
    recipient: Optional[Schedulerv3Recipient] = None
    recipients: Optional[List[Schedulerv3Recipient]] = None
    retention: Optional[Schedulerv3Retention] = None
    scheduler: Optional[Schedulerv3Scheduler] = None
    tags: Optional[List[StrictStr]] = Field(default=None, description="Optional: Tags to use.")
    tasks: Optional[List[Schedulerv3ScheduledTask]] = None
    __properties: ClassVar[List[str]] = ["description", "enabled", "instructions", "internal_audit", "name", "notification", "origin", "recipient", "recipients", "retention", "scheduler", "tags", "tasks"]

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
        """Create an instance of Schedulerv3CreateScheduledJobRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of recipient
        if self.recipient:
            _dict['recipient'] = self.recipient.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in recipients (list)
        _items = []
        if self.recipients:
            for _item in self.recipients:
                if _item:
                    _items.append(_item.to_dict())
            _dict['recipients'] = _items
        # override the default output from pydantic by calling `to_dict()` of retention
        if self.retention:
            _dict['retention'] = self.retention.to_dict()
        # override the default output from pydantic by calling `to_dict()` of scheduler
        if self.scheduler:
            _dict['scheduler'] = self.scheduler.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in tasks (list)
        _items = []
        if self.tasks:
            for _item in self.tasks:
                if _item:
                    _items.append(_item.to_dict())
            _dict['tasks'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Schedulerv3CreateScheduledJobRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "description": obj.get("description"),
            "enabled": obj.get("enabled"),
            "instructions": obj.get("instructions"),
            "internal_audit": obj.get("internal_audit"),
            "name": obj.get("name"),
            "notification": obj.get("notification"),
            "origin": obj.get("origin"),
            "recipient": Schedulerv3Recipient.from_dict(obj["recipient"]) if obj.get("recipient") is not None else None,
            "recipients": [Schedulerv3Recipient.from_dict(_item) for _item in obj["recipients"]] if obj.get("recipients") is not None else None,
            "retention": Schedulerv3Retention.from_dict(obj["retention"]) if obj.get("retention") is not None else None,
            "scheduler": Schedulerv3Scheduler.from_dict(obj["scheduler"]) if obj.get("scheduler") is not None else None,
            "tags": obj.get("tags"),
            "tasks": [Schedulerv3ScheduledTask.from_dict(_item) for _item in obj["tasks"]] if obj.get("tasks") is not None else None
        })
        return _obj


