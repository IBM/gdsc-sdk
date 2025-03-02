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
from ibm_gdsc_sdk_software.models.policybuilderv3_import_issue import Policybuilderv3ImportIssue
from ibm_gdsc_sdk_software.models.policybuilderv3_import_state import Policybuilderv3ImportState
from ibm_gdsc_sdk_software.models.policybuilderv3_sync_status_type import Policybuilderv3SyncStatusType
from typing import Optional, Set
from typing_extensions import Self

class Policybuilderv3GdpPolicySyncRes(BaseModel):
    """
    Policybuilderv3GdpPolicySyncRes
    """ # noqa: E501
    central_manager: Optional[StrictStr] = None
    created_policy_id: Optional[StrictStr] = None
    gdp_synced_id: Optional[StrictStr] = Field(default=None, description="Sync id of the created or updated sync policy.")
    import_name: Optional[StrictStr] = Field(default=None, description="Name for imported gdp policy.")
    last_state_change: Optional[StrictStr] = None
    policy_import_issue: Optional[Policybuilderv3ImportIssue] = None
    policy_import_state: Optional[Policybuilderv3ImportState] = None
    policy_name: Optional[StrictStr] = Field(default=None, description="Policy Name for the created or updated sync policy.")
    sync_status: Optional[Policybuilderv3SyncStatusType] = None
    __properties: ClassVar[List[str]] = ["central_manager", "created_policy_id", "gdp_synced_id", "import_name", "last_state_change", "policy_import_issue", "policy_import_state", "policy_name", "sync_status"]

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
        """Create an instance of Policybuilderv3GdpPolicySyncRes from a JSON string"""
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
        """Create an instance of Policybuilderv3GdpPolicySyncRes from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "central_manager": obj.get("central_manager"),
            "created_policy_id": obj.get("created_policy_id"),
            "gdp_synced_id": obj.get("gdp_synced_id"),
            "import_name": obj.get("import_name"),
            "last_state_change": obj.get("last_state_change"),
            "policy_import_issue": obj.get("policy_import_issue"),
            "policy_import_state": obj.get("policy_import_state"),
            "policy_name": obj.get("policy_name"),
            "sync_status": obj.get("sync_status")
        })
        return _obj


