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
from ibm_gdsc_sdk_software.models.policybuilderv3_action_parameter_metadata import Policybuilderv3ActionParameterMetadata
from ibm_gdsc_sdk_software.models.policybuilderv3_action_type import Policybuilderv3ActionType
from ibm_gdsc_sdk_software.models.policybuilderv3_rule_type import Policybuilderv3RuleType
from typing import Optional, Set
from typing_extensions import Self

class Policybuilderv3ActionMetadata(BaseModel):
    """
    Action metadata object.
    """ # noqa: E501
    action_name: Optional[StrictStr] = Field(default=None, description="Name of the action.")
    label: Optional[StrictStr] = Field(default=None, description="Ui label for the action.")
    parameters: Optional[List[Policybuilderv3ActionParameterMetadata]] = Field(default=None, description="Action parameters.")
    rule_type: Optional[List[Policybuilderv3RuleType]] = Field(default=None, description="Rule type for the action.")
    type: Optional[Policybuilderv3ActionType] = None
    __properties: ClassVar[List[str]] = ["action_name", "label", "parameters", "rule_type", "type"]

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
        """Create an instance of Policybuilderv3ActionMetadata from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in parameters (list)
        _items = []
        if self.parameters:
            for _item in self.parameters:
                if _item:
                    _items.append(_item.to_dict())
            _dict['parameters'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Policybuilderv3ActionMetadata from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "action_name": obj.get("action_name"),
            "label": obj.get("label"),
            "parameters": [Policybuilderv3ActionParameterMetadata.from_dict(_item) for _item in obj["parameters"]] if obj.get("parameters") is not None else None,
            "rule_type": obj.get("rule_type"),
            "type": obj.get("type")
        })
        return _obj


