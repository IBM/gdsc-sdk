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

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Resourcecontrollerk8v3JobExecution(BaseModel):
    """
    JobExecution contains the information about a job execution.
    """ # noqa: E501
    details: Optional[StrictStr] = Field(default=None, description="Optional: The details of the job execution.")
    ended: Optional[StrictStr] = Field(default=None, description="Optional: The date this execution ended.")
    id: Optional[StrictStr] = Field(default=None, description="The ID of the job execution.")
    job_id: Optional[StrictStr] = Field(default=None, description="The ID of the job the execution is for.")
    modified: Optional[StrictStr] = Field(default=None, description="Optional: The date this job execution was modified (ms since epoch).")
    name: Optional[StrictStr] = Field(default=None, description="The name of the job execution.")
    started: Optional[StrictStr] = Field(default=None, description="The date this execution started.")
    status: Optional[StrictStr] = Field(default=None, description="The status of the execution.")
    __properties: ClassVar[List[str]] = ["details", "ended", "id", "job_id", "modified", "name", "started", "status"]

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
        """Create an instance of Resourcecontrollerk8v3JobExecution from a JSON string"""
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
        """Create an instance of Resourcecontrollerk8v3JobExecution from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "details": obj.get("details"),
            "ended": obj.get("ended"),
            "id": obj.get("id"),
            "job_id": obj.get("job_id"),
            "modified": obj.get("modified"),
            "name": obj.get("name"),
            "started": obj.get("started"),
            "status": obj.get("status")
        })
        return _obj


