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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.schedulerv3_configuration_item import Schedulerv3ConfigurationItem
from ibm_gdsc_sdk_saas.models.workflowv3_entity import Workflowv3Entity
from ibm_gdsc_sdk_saas.models.workflowv3_priority import Workflowv3Priority
from ibm_gdsc_sdk_saas.models.workflowv3_status import Workflowv3Status
from typing import Optional, Set
from typing_extensions import Self

class Workflowv3TaskEdit(BaseModel):
    """
    Editable fields of a task.
    """ # noqa: E501
    assignments: Optional[List[Workflowv3Entity]] = Field(default=None, description="Optional: Entities that the task is assigned to.")
    comment: Optional[StrictStr] = Field(default=None, description="Optional: Comment - this text will be added to the comments history.")
    date_due: Optional[datetime] = Field(default=None, description="Optional: Date due.")
    depends_on: Optional[List[StrictStr]] = Field(default=None, description="Optional: Task ID dependencies if sequential processing is needed.")
    description: Optional[StrictStr] = Field(default=None, description="Optional: Multiline description of the task.")
    investigation_links: Optional[List[Schedulerv3ConfigurationItem]] = None
    justification: Optional[StrictStr] = Field(default=None, description="Optional: Justification - this text will be added to the respond justification.")
    priority: Optional[Workflowv3Priority] = None
    response_template: Optional[Schedulerv3ConfigurationItem] = None
    review_action: Optional[StrictStr] = Field(default=None, description="Optional: review action - this text will be added to the respond action.")
    status: Optional[Workflowv3Status] = None
    tags: Optional[List[StrictStr]] = None
    task_id: Optional[StrictStr] = None
    title: Optional[StrictStr] = Field(default=None, description="Optional: Task title (subject).")
    __properties: ClassVar[List[str]] = ["assignments", "comment", "date_due", "depends_on", "description", "investigation_links", "justification", "priority", "response_template", "review_action", "status", "tags", "task_id", "title"]

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
        """Create an instance of Workflowv3TaskEdit from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in assignments (list)
        _items = []
        if self.assignments:
            for _item in self.assignments:
                if _item:
                    _items.append(_item.to_dict())
            _dict['assignments'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in investigation_links (list)
        _items = []
        if self.investigation_links:
            for _item in self.investigation_links:
                if _item:
                    _items.append(_item.to_dict())
            _dict['investigation_links'] = _items
        # override the default output from pydantic by calling `to_dict()` of response_template
        if self.response_template:
            _dict['response_template'] = self.response_template.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Workflowv3TaskEdit from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "assignments": [Workflowv3Entity.from_dict(_item) for _item in obj["assignments"]] if obj.get("assignments") is not None else None,
            "comment": obj.get("comment"),
            "date_due": obj.get("date_due"),
            "depends_on": obj.get("depends_on"),
            "description": obj.get("description"),
            "investigation_links": [Schedulerv3ConfigurationItem.from_dict(_item) for _item in obj["investigation_links"]] if obj.get("investigation_links") is not None else None,
            "justification": obj.get("justification"),
            "priority": obj.get("priority"),
            "response_template": Schedulerv3ConfigurationItem.from_dict(obj["response_template"]) if obj.get("response_template") is not None else None,
            "review_action": obj.get("review_action"),
            "status": obj.get("status"),
            "tags": obj.get("tags"),
            "task_id": obj.get("task_id"),
            "title": obj.get("title")
        })
        return _obj


