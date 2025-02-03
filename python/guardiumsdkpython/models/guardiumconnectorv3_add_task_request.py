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
from guardiumsdkpython.models.guardiumconnectorv3_task_params_object import Guardiumconnectorv3TaskParamsObject
from typing import Optional, Set
from typing_extensions import Self

class Guardiumconnectorv3AddTaskRequest(BaseModel):
    """
    Adds specified task.
    """ # noqa: E501
    central_manager_id: Optional[StrictStr] = Field(default=None, description="ID of central manager.")
    interval: Optional[StrictStr] = Field(default=None, description="Optional, overrides task default interval.")
    key_object: Optional[StrictStr] = Field(default=None, description="Key object.")
    params: Optional[List[Guardiumconnectorv3TaskParamsObject]] = Field(default=None, description="Json array.")
    task_type: Optional[StrictStr] = Field(default=None, description="Type of task being added.")
    __properties: ClassVar[List[str]] = ["central_manager_id", "interval", "key_object", "params", "task_type"]

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
        """Create an instance of Guardiumconnectorv3AddTaskRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in params (list)
        _items = []
        if self.params:
            for _item in self.params:
                if _item:
                    _items.append(_item.to_dict())
            _dict['params'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Guardiumconnectorv3AddTaskRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "central_manager_id": obj.get("central_manager_id"),
            "interval": obj.get("interval"),
            "key_object": obj.get("key_object"),
            "params": [Guardiumconnectorv3TaskParamsObject.from_dict(_item) for _item in obj["params"]] if obj.get("params") is not None else None,
            "task_type": obj.get("task_type")
        })
        return _obj


