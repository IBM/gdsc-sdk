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
from ibm_gdsc_sdk_saas.models.assetsv3_action import Assetsv3Action
from ibm_gdsc_sdk_saas.models.assetsv3_rule_parameter import Assetsv3RuleParameter
from ibm_gdsc_sdk_saas.models.assetsv3_rule_type import Assetsv3RuleType
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3Rule(BaseModel):
    """
    Base Rule object which is used in create and list APIs.
    """ # noqa: E501
    actions: Optional[List[Assetsv3Action]] = Field(default=None, description="Action object of the actions in the rules.")
    is_delete: Optional[StrictInt] = Field(default=None, description="Rule isDelete.")
    parameters: Optional[List[Assetsv3RuleParameter]] = Field(default=None, description="Parameter object which are used in the rule.")
    policy_id: Optional[StrictStr] = Field(default=None, description="Policy ID.")
    rule_id: Optional[StrictStr] = Field(default=None, description="Rule ID.")
    rule_name: Optional[StrictStr] = Field(default=None, description="Rule Name.")
    rule_type: Optional[Assetsv3RuleType] = None
    __properties: ClassVar[List[str]] = ["actions", "is_delete", "parameters", "policy_id", "rule_id", "rule_name", "rule_type"]

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
        """Create an instance of Assetsv3Rule from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in actions (list)
        _items = []
        if self.actions:
            for _item in self.actions:
                if _item:
                    _items.append(_item.to_dict())
            _dict['actions'] = _items
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
        """Create an instance of Assetsv3Rule from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "actions": [Assetsv3Action.from_dict(_item) for _item in obj["actions"]] if obj.get("actions") is not None else None,
            "is_delete": obj.get("is_delete"),
            "parameters": [Assetsv3RuleParameter.from_dict(_item) for _item in obj["parameters"]] if obj.get("parameters") is not None else None,
            "policy_id": obj.get("policy_id"),
            "rule_id": obj.get("rule_id"),
            "rule_name": obj.get("rule_name"),
            "rule_type": obj.get("rule_type")
        })
        return _obj


