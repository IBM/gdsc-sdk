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
from typing import Optional, Set
from typing_extensions import Self

class Auditv3ActivityRecord(BaseModel):
    """
    An activity log record indicates who, what, when, where, and why something happened.  For the purposes of this service: who   = The unique user ID for the user that performed the operation. what  = The operation performed (CRUD operation or other action taken). when  = The time the operation, request, or event occurred. where = The context in which the operation was performed. why   = Details about the operation being performed. which = The unique service record id for the service that recorded the event. actor = When available track the actor that performed the activity.
    """ # noqa: E501
    action_taken: Optional[StrictStr] = Field(default=None, description="The operation peformed (CRUD or other operation) (what).")
    changes_made: Optional[StrictStr] = Field(default=None, description="Further info about the request (why).")
    context: Optional[StrictStr] = Field(default=None, description="The entity (collection name) upon which the operation was performed (where).")
    context_description: Optional[StrictStr] = Field(default=None, description="Contains a brief description of the Activity record.")
    creation_time: Optional[datetime] = Field(default=None, description="The time the Activity record was created (when).")
    performed_by: Optional[StrictStr] = Field(default=None, description="UserID if the request originated from an external context (who).")
    uid: Optional[StrictStr] = Field(default=None, description="The record ID that the operation was performed upon (which).")
    __properties: ClassVar[List[str]] = ["action_taken", "changes_made", "context", "context_description", "creation_time", "performed_by", "uid"]

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
        """Create an instance of Auditv3ActivityRecord from a JSON string"""
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
        """Create an instance of Auditv3ActivityRecord from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "action_taken": obj.get("action_taken"),
            "changes_made": obj.get("changes_made"),
            "context": obj.get("context"),
            "context_description": obj.get("context_description"),
            "creation_time": obj.get("creation_time"),
            "performed_by": obj.get("performed_by"),
            "uid": obj.get("uid")
        })
        return _obj


