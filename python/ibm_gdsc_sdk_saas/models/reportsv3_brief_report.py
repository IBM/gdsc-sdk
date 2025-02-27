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
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.reportsv3_display_header import Reportsv3DisplayHeader
from ibm_gdsc_sdk_saas.models.reportsv3_report_tag import Reportsv3ReportTag
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3BriefReport(BaseModel):
    """
    BriefReport - a small-scale representation of a report.
    """ # noqa: E501
    access_level: Optional[StrictInt] = Field(default=None, description="Calculated access-level.")
    category_id: Optional[StrictStr] = Field(default=None, description="The report's category ID.")
    creator_user_id: Optional[StrictStr] = Field(default=None, description="Author.")
    creator_user_name: Optional[StrictStr] = Field(default=None, description="Author name.")
    group_ids_used_in_filter: Optional[List[StrictStr]] = None
    headers: Optional[List[Reportsv3DisplayHeader]] = Field(default=None, description="The report's brief headers.")
    is_pinned: Optional[StrictBool] = Field(default=None, description="Flag to determine weather the report is pinned or not.")
    last_run_time: Optional[datetime] = Field(default=None, description="The report's last run time in format YYYY-MM-DDTHH:mm:ss.sssZ.")
    report_description: Optional[StrictStr] = Field(default=None, description="The report description.")
    report_id: Optional[StrictStr] = Field(default=None, description="The report ID.")
    report_name: Optional[StrictStr] = Field(default=None, description="The report name.")
    report_tags: Optional[List[Reportsv3ReportTag]] = Field(default=None, description="The report tags.")
    table_name: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["access_level", "category_id", "creator_user_id", "creator_user_name", "group_ids_used_in_filter", "headers", "is_pinned", "last_run_time", "report_description", "report_id", "report_name", "report_tags", "table_name"]

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
        """Create an instance of Reportsv3BriefReport from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in headers (list)
        _items = []
        if self.headers:
            for _item in self.headers:
                if _item:
                    _items.append(_item.to_dict())
            _dict['headers'] = _items
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
        """Create an instance of Reportsv3BriefReport from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "access_level": obj.get("access_level"),
            "category_id": obj.get("category_id"),
            "creator_user_id": obj.get("creator_user_id"),
            "creator_user_name": obj.get("creator_user_name"),
            "group_ids_used_in_filter": obj.get("group_ids_used_in_filter"),
            "headers": [Reportsv3DisplayHeader.from_dict(_item) for _item in obj["headers"]] if obj.get("headers") is not None else None,
            "is_pinned": obj.get("is_pinned"),
            "last_run_time": obj.get("last_run_time"),
            "report_description": obj.get("report_description"),
            "report_id": obj.get("report_id"),
            "report_name": obj.get("report_name"),
            "report_tags": [Reportsv3ReportTag.from_dict(_item) for _item in obj["report_tags"]] if obj.get("report_tags") is not None else None,
            "table_name": obj.get("table_name")
        })
        return _obj


