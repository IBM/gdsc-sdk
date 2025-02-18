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

from pydantic import BaseModel, ConfigDict, Field, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.reportsv3_filter_headers import Reportsv3FilterHeaders
from ibm_gdsc_sdk_software.models.reportsv3_report_display_layout import Reportsv3ReportDisplayLayout
from ibm_gdsc_sdk_software.models.reportsv3_report_result import Reportsv3ReportResult
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3RunReportResponse(BaseModel):
    """
    RunReportResponse is the return type of the RunReportByID(), RunImmediateReport() and Transpose() apis.
    """ # noqa: E501
    data: Optional[List[Reportsv3ReportResult]] = Field(default=None, description="Report data.")
    facets: Optional[List[Reportsv3FilterHeaders]] = Field(default=None, description="Facets.")
    report_layout: Optional[Reportsv3ReportDisplayLayout] = None
    total_number_of_rows: Optional[StrictInt] = Field(default=None, description="Total Rows Count.")
    __properties: ClassVar[List[str]] = ["data", "facets", "report_layout", "total_number_of_rows"]

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
        """Create an instance of Reportsv3RunReportResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in data (list)
        _items = []
        if self.data:
            for _item in self.data:
                if _item:
                    _items.append(_item.to_dict())
            _dict['data'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in facets (list)
        _items = []
        if self.facets:
            for _item in self.facets:
                if _item:
                    _items.append(_item.to_dict())
            _dict['facets'] = _items
        # override the default output from pydantic by calling `to_dict()` of report_layout
        if self.report_layout:
            _dict['report_layout'] = self.report_layout.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Reportsv3RunReportResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "data": [Reportsv3ReportResult.from_dict(_item) for _item in obj["data"]] if obj.get("data") is not None else None,
            "facets": [Reportsv3FilterHeaders.from_dict(_item) for _item in obj["facets"]] if obj.get("facets") is not None else None,
            "report_layout": Reportsv3ReportDisplayLayout.from_dict(obj["report_layout"]) if obj.get("report_layout") is not None else None,
            "total_number_of_rows": obj.get("total_number_of_rows")
        })
        return _obj


