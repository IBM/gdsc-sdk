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
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_group import Complianceacceleratorv3Group
from ibm_gdsc_sdk_software.models.complianceacceleratorv3_report_status import Complianceacceleratorv3ReportStatus
from ibm_gdsc_sdk_software.models.reportsv3_report_tag import Reportsv3ReportTag
from typing import Optional, Set
from typing_extensions import Self

class Complianceacceleratorv3Report(BaseModel):
    """
    Report object.
    """ # noqa: E501
    description: Optional[StrictStr] = Field(default=None, description="Report description.")
    groups_needed: Optional[List[Complianceacceleratorv3Group]] = None
    groups_present: Optional[List[Complianceacceleratorv3Group]] = Field(default=None, description="Groups present in the reports.")
    report_id: Optional[StrictStr] = Field(default=None, description="Id of the reports.")
    report_tags: Optional[List[Reportsv3ReportTag]] = Field(default=None, description="The report tags.")
    status: Optional[Complianceacceleratorv3ReportStatus] = None
    title: Optional[StrictStr] = Field(default=None, description="Title of the report.")
    __properties: ClassVar[List[str]] = ["description", "groups_needed", "groups_present", "report_id", "report_tags", "status", "title"]

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
        """Create an instance of Complianceacceleratorv3Report from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in groups_needed (list)
        _items = []
        if self.groups_needed:
            for _item in self.groups_needed:
                if _item:
                    _items.append(_item.to_dict())
            _dict['groups_needed'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in groups_present (list)
        _items = []
        if self.groups_present:
            for _item in self.groups_present:
                if _item:
                    _items.append(_item.to_dict())
            _dict['groups_present'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in report_tags (list)
        _items = []
        if self.report_tags:
            for _item in self.report_tags:
                if _item:
                    _items.append(_item.to_dict())
            _dict['report_tags'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Complianceacceleratorv3Report from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "description": obj.get("description"),
            "groups_needed": [Complianceacceleratorv3Group.from_dict(_item) for _item in obj["groups_needed"]] if obj.get("groups_needed") is not None else None,
            "groups_present": [Complianceacceleratorv3Group.from_dict(_item) for _item in obj["groups_present"]] if obj.get("groups_present") is not None else None,
            "report_id": obj.get("report_id"),
            "report_tags": [Reportsv3ReportTag.from_dict(_item) for _item in obj["report_tags"]] if obj.get("report_tags") is not None else None,
            "status": obj.get("status"),
            "title": obj.get("title")
        })
        return _obj


