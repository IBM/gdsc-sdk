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
from ibm_gdsc_sdk_software.models.snifassistv3_feedback import Snifassistv3Feedback
from typing import Optional, Set
from typing_extensions import Self

class Snifassistv3PostSnifFeedbackRequest(BaseModel):
    """
    PostSnifFeedbackRequest is the request message to post sniffer feedback for the installed policies.
    """ # noqa: E501
    edge_id: Optional[StrictStr] = Field(default=None, description="Specify edge_id if known.")
    snif_feedback: Optional[Snifassistv3Feedback] = None
    tenant_id: Optional[StrictStr] = Field(default=None, description="Specify tenant_id.")
    __properties: ClassVar[List[str]] = ["edge_id", "snif_feedback", "tenant_id"]

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
        """Create an instance of Snifassistv3PostSnifFeedbackRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of snif_feedback
        if self.snif_feedback:
            _dict['snif_feedback'] = self.snif_feedback.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Snifassistv3PostSnifFeedbackRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "edge_id": obj.get("edge_id"),
            "snif_feedback": Snifassistv3Feedback.from_dict(obj["snif_feedback"]) if obj.get("snif_feedback") is not None else None,
            "tenant_id": obj.get("tenant_id")
        })
        return _obj


