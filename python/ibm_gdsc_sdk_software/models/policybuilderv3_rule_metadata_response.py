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
from ibm_gdsc_sdk_software.models.policybuilderv3_action_metadata import Policybuilderv3ActionMetadata
from ibm_gdsc_sdk_software.models.policybuilderv3_rule_parameter_metadata import Policybuilderv3RuleParameterMetadata
from ibm_gdsc_sdk_software.models.policybuilderv3_status_response_base import Policybuilderv3StatusResponseBase
from typing import Optional, Set
from typing_extensions import Self

class Policybuilderv3RuleMetadataResponse(BaseModel):
    """
    Rule Metadata Response message.
    """ # noqa: E501
    action_metadata: Optional[List[Policybuilderv3ActionMetadata]] = Field(default=None, description="Actions metadata object.")
    parameter_metadata: Optional[List[Policybuilderv3RuleParameterMetadata]] = Field(default=None, description="Rule Parameters Metadata object.")
    status: Optional[Policybuilderv3StatusResponseBase] = None
    tags: Optional[List[StrictStr]] = Field(default=None, description="List of existing tags.")
    __properties: ClassVar[List[str]] = ["action_metadata", "parameter_metadata", "status", "tags"]

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
        """Create an instance of Policybuilderv3RuleMetadataResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in action_metadata (list)
        _items = []
        if self.action_metadata:
            for _item in self.action_metadata:
                if _item:
                    _items.append(_item.to_dict())
            _dict['action_metadata'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in parameter_metadata (list)
        _items = []
        if self.parameter_metadata:
            for _item in self.parameter_metadata:
                if _item:
                    _items.append(_item.to_dict())
            _dict['parameter_metadata'] = _items
        # override the default output from pydantic by calling `to_dict()` of status
        if self.status:
            _dict['status'] = self.status.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Policybuilderv3RuleMetadataResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "action_metadata": [Policybuilderv3ActionMetadata.from_dict(_item) for _item in obj["action_metadata"]] if obj.get("action_metadata") is not None else None,
            "parameter_metadata": [Policybuilderv3RuleParameterMetadata.from_dict(_item) for _item in obj["parameter_metadata"]] if obj.get("parameter_metadata") is not None else None,
            "status": Policybuilderv3StatusResponseBase.from_dict(obj["status"]) if obj.get("status") is not None else None,
            "tags": obj.get("tags")
        })
        return _obj


