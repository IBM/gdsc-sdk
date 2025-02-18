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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Guardiumconnectorv3TaskDefinitionObject(BaseModel):
    """
    Object hold task definition info.
    """ # noqa: E501
    execution_trigger: Optional[StrictInt] = Field(default=None, description="Tells GDP when to send data.")
    interval: Optional[StrictStr] = Field(default=None, description="Task interval.")
    is_blocker_task: Optional[StrictInt] = Field(default=None, description="Is the task a blocker task.")
    task_type: Optional[StrictStr] = Field(default=None, description="Task type.")
    version: Optional[StrictStr] = Field(default=None, description="Task version.")
    __properties: ClassVar[List[str]] = ["execution_trigger", "interval", "is_blocker_task", "task_type", "version"]

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
        """Create an instance of Guardiumconnectorv3TaskDefinitionObject from a JSON string"""
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
        """Create an instance of Guardiumconnectorv3TaskDefinitionObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "execution_trigger": obj.get("execution_trigger"),
            "interval": obj.get("interval"),
            "is_blocker_task": obj.get("is_blocker_task"),
            "task_type": obj.get("task_type"),
            "version": obj.get("version")
        })
        return _obj


