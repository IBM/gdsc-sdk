# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.dashboardsv3_time_range import Dashboardsv3TimeRange
from ibm_gdsc_sdk_software.models.reportsv3_report_tag import Reportsv3ReportTag
from typing import Optional, Set
from typing_extensions import Self

class Dashboardsv3ReportParameters(BaseModel):
    """
    ReportParameters - distinguishing features of a report card.
    """ # noqa: E501
    end: Optional[StrictStr] = Field(default=None, description="End.")
    id: Optional[StrictStr] = Field(default=None, description="Parameters id.")
    local_time_filter: Optional[Dashboardsv3TimeRange] = None
    menu_item: Optional[StrictStr] = Field(default=None, description="Menu Item.")
    override: Optional[StrictBool] = Field(default=None, description="Use local parameters instead of global.")
    range: Optional[StrictStr] = Field(default=None, description="Time range - Time range is no longer used.")
    regulation: Optional[StrictStr] = Field(default=None, description="Regulation for isDataSecurity.")
    start: Optional[StrictStr] = Field(default=None, description="Start.")
    tags: Optional[List[Reportsv3ReportTag]] = Field(default=None, description="Report tags.")
    title: Optional[StrictStr] = Field(default=None, description="Optional title of card.")
    __properties: ClassVar[List[str]] = ["end", "id", "local_time_filter", "menu_item", "override", "range", "regulation", "start", "tags", "title"]

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
        """Create an instance of Dashboardsv3ReportParameters from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of local_time_filter
        if self.local_time_filter:
            _dict['local_time_filter'] = self.local_time_filter.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in tags (list)
        _items = []
        if self.tags:
            for _item in self.tags:
                if _item:
                    _items.append(_item.to_dict())
            _dict['tags'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Dashboardsv3ReportParameters from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "end": obj.get("end"),
            "id": obj.get("id"),
            "local_time_filter": Dashboardsv3TimeRange.from_dict(obj["local_time_filter"]) if obj.get("local_time_filter") is not None else None,
            "menu_item": obj.get("menu_item"),
            "override": obj.get("override"),
            "range": obj.get("range"),
            "regulation": obj.get("regulation"),
            "start": obj.get("start"),
            "tags": [Reportsv3ReportTag.from_dict(_item) for _item in obj["tags"]] if obj.get("tags") is not None else None,
            "title": obj.get("title")
        })
        return _obj


