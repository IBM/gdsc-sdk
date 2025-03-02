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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.policybuilderv3_control_flow import Policybuilderv3ControlFlow
from ibm_gdsc_sdk_software.models.policybuilderv3_import_issue import Policybuilderv3ImportIssue
from ibm_gdsc_sdk_software.models.policybuilderv3_import_state import Policybuilderv3ImportState
from ibm_gdsc_sdk_software.models.policybuilderv3_rule import Policybuilderv3Rule
from ibm_gdsc_sdk_software.models.policybuilderv3_status_response_base import Policybuilderv3StatusResponseBase
from typing import Optional, Set
from typing_extensions import Self

class Policybuilderv3GetPolicyDetailsResponse(BaseModel):
    """
    Policy details response message.
    """ # noqa: E501
    activation_status: Optional[StrictInt] = Field(default=None, description="activation_status identifier: 1001 -> install with no issues, 1002-> installed with issues, 1003 -> not installed.")
    control_flow: Optional[Policybuilderv3ControlFlow] = None
    installed_flag: Optional[StrictBool] = Field(default=None, description="Flag to indicate whether policy is installed or not.")
    policy_import_issue: Optional[Policybuilderv3ImportIssue] = None
    policy_import_state: Optional[Policybuilderv3ImportState] = None
    policy_name: Optional[StrictStr] = None
    rules: Optional[List[Policybuilderv3Rule]] = Field(default=None, description="Rules contained by the policy.")
    status: Optional[Policybuilderv3StatusResponseBase] = None
    __properties: ClassVar[List[str]] = ["activation_status", "control_flow", "installed_flag", "policy_import_issue", "policy_import_state", "policy_name", "rules", "status"]

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
        """Create an instance of Policybuilderv3GetPolicyDetailsResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in rules (list)
        _items = []
        if self.rules:
            for _item in self.rules:
                if _item:
                    _items.append(_item.to_dict())
            _dict['rules'] = _items
        # override the default output from pydantic by calling `to_dict()` of status
        if self.status:
            _dict['status'] = self.status.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Policybuilderv3GetPolicyDetailsResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "activation_status": obj.get("activation_status"),
            "control_flow": obj.get("control_flow"),
            "installed_flag": obj.get("installed_flag"),
            "policy_import_issue": obj.get("policy_import_issue"),
            "policy_import_state": obj.get("policy_import_state"),
            "policy_name": obj.get("policy_name"),
            "rules": [Policybuilderv3Rule.from_dict(_item) for _item in obj["rules"]] if obj.get("rules") is not None else None,
            "status": Policybuilderv3StatusResponseBase.from_dict(obj["status"]) if obj.get("status") is not None else None
        })
        return _obj


