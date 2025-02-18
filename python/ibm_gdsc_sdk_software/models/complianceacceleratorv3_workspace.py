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

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_audit_config import Complianceacceleratorv3AuditConfig
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_dashboard_object import Complianceacceleratorv3DashboardObject
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_group import Complianceacceleratorv3Group
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_reports import Complianceacceleratorv3Reports
from typing import Optional, Set
from typing_extensions import Self

class Complianceacceleratorv3Workspace(BaseModel):
    """
    Complianceacceleratorv3Workspace
    """ # noqa: E501
    audit_info: Optional[Complianceacceleratorv3AuditConfig] = None
    dashboards: Optional[List[Complianceacceleratorv3DashboardObject]] = None
    groups: Optional[Dict[str, Complianceacceleratorv3Group]] = Field(default=None, description="Groups for the policies and reports.")
    reports_map: Optional[Dict[str, Complianceacceleratorv3Reports]] = Field(default=None, description="List of reports with basic info.")
    __properties: ClassVar[List[str]] = ["audit_info", "dashboards", "groups", "reports_map"]

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
        """Create an instance of Complianceacceleratorv3Workspace from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of audit_info
        if self.audit_info:
            _dict['audit_info'] = self.audit_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in dashboards (list)
        _items = []
        if self.dashboards:
            for _item in self.dashboards:
                if _item:
                    _items.append(_item.to_dict())
            _dict['dashboards'] = _items
        # override the default output from pydantic by calling `to_dict()` of each value in groups (dict)
        _field_dict = {}
        if self.groups:
            for _key in self.groups:
                if self.groups[_key]:
                    _field_dict[_key] = self.groups[_key].to_dict()
            _dict['groups'] = _field_dict
        # override the default output from pydantic by calling `to_dict()` of each value in reports_map (dict)
        _field_dict = {}
        if self.reports_map:
            for _key in self.reports_map:
                if self.reports_map[_key]:
                    _field_dict[_key] = self.reports_map[_key].to_dict()
            _dict['reports_map'] = _field_dict
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Complianceacceleratorv3Workspace from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "audit_info": Complianceacceleratorv3AuditConfig.from_dict(obj["audit_info"]) if obj.get("audit_info") is not None else None,
            "dashboards": [Complianceacceleratorv3DashboardObject.from_dict(_item) for _item in obj["dashboards"]] if obj.get("dashboards") is not None else None,
            "groups": dict(
                (_k, Complianceacceleratorv3Group.from_dict(_v))
                for _k, _v in obj["groups"].items()
            )
            if obj.get("groups") is not None
            else None,
            "reports_map": dict(
                (_k, Complianceacceleratorv3Reports.from_dict(_v))
                for _k, _v in obj["reports_map"].items()
            )
            if obj.get("reports_map") is not None
            else None
        })
        return _obj


