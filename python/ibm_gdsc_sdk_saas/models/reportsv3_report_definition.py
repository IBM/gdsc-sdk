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
from ibm_gdsc_sdk_saas.models.reportsv3_date_range import Reportsv3DateRange
from ibm_gdsc_sdk_saas.models.reportsv3_report_filter_brackets import Reportsv3ReportFilterBrackets
from ibm_gdsc_sdk_saas.models.reportsv3_report_header import Reportsv3ReportHeader
from ibm_gdsc_sdk_saas.models.reportsv3_report_tag import Reportsv3ReportTag
from ibm_gdsc_sdk_saas.models.reportsv3_run_time_parameter import Reportsv3RunTimeParameter
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3ReportDefinition(BaseModel):
    """
    ReportDefinition encapsulates all data necessary for a report object.
    """ # noqa: E501
    category_id: Optional[StrictStr] = Field(default=None, description="Unique category ID.")
    creation_time: Optional[datetime] = Field(default=None, description="The report's cration time in format YYYY-MM-DDTHH:mm:ss.sssZ.")
    creator_user_id: Optional[StrictStr] = Field(default=None, description="An identifier for the creator of the report.")
    date_range: Optional[Reportsv3DateRange] = None
    default_timestamp_header_id: Optional[StrictStr] = Field(default=None, description="The default timestamp header id.")
    is_auditable: Optional[StrictBool] = Field(default=None, description="If a report is auditable.")
    is_hidden: Optional[StrictBool] = Field(default=None, description="The is hidden true when report should be showed to the user.")
    is_pinned: Optional[StrictBool] = Field(default=None, description="Is pinned report.")
    is_predefined: Optional[StrictBool] = Field(default=None, description="If a report is predefined.")
    refresh_rate: Optional[StrictInt] = Field(default=None, description="Report refresh rate.")
    report_description: Optional[StrictStr] = Field(default=None, description="Report description.")
    report_filters: Optional[Reportsv3ReportFilterBrackets] = None
    report_headers: Optional[List[Reportsv3ReportHeader]] = Field(default=None, description="Selected headers for the report.")
    report_id: Optional[StrictStr] = Field(default=None, description="The report ID.")
    report_name: Optional[StrictStr] = Field(default=None, description="Report name.")
    report_tags: Optional[List[Reportsv3ReportTag]] = Field(default=None, description="Report tags.")
    runtime_parameters: Optional[List[Reportsv3RunTimeParameter]] = Field(default=None, description="Report runtime parameters.")
    selected_timestamp_header_id: Optional[StrictStr] = Field(default=None, description="The selected timestamp header id- in case the user override the default.")
    should_add_count: Optional[StrictBool] = Field(default=None, description="Add \"count\" statement or not.")
    should_add_distinct: Optional[StrictBool] = Field(default=None, description="Add \"distinct\" statement or not.")
    sql_last_version: Optional[StrictStr] = Field(default=None, description="SQL Last Version -  Last version of GI when the query was generated.")
    table_join_optimization: Optional[StrictStr] = Field(default=None, description="optional : table join optimization - optimized the join operation to enhance the performance. the value can be empty, false or true. if the value is empty then the global setting will be used.")
    use_pipeline_queries: Optional[StrictStr] = Field(default=None, description="Optional: disable or enable the pipeline queries the value can be empty, false or true. if the value is empty then the global setting will be used.")
    __properties: ClassVar[List[str]] = ["category_id", "creation_time", "creator_user_id", "date_range", "default_timestamp_header_id", "is_auditable", "is_hidden", "is_pinned", "is_predefined", "refresh_rate", "report_description", "report_filters", "report_headers", "report_id", "report_name", "report_tags", "runtime_parameters", "selected_timestamp_header_id", "should_add_count", "should_add_distinct", "sql_last_version", "table_join_optimization", "use_pipeline_queries"]

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
        """Create an instance of Reportsv3ReportDefinition from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of date_range
        if self.date_range:
            _dict['date_range'] = self.date_range.to_dict()
        # override the default output from pydantic by calling `to_dict()` of report_filters
        if self.report_filters:
            _dict['report_filters'] = self.report_filters.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in report_headers (list)
        _items = []
        if self.report_headers:
            for _item in self.report_headers:
                if _item:
                    _items.append(_item.to_dict())
            _dict['report_headers'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in report_tags (list)
        _items = []
        if self.report_tags:
            for _item in self.report_tags:
                if _item:
                    _items.append(_item.to_dict())
            _dict['report_tags'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in runtime_parameters (list)
        _items = []
        if self.runtime_parameters:
            for _item in self.runtime_parameters:
                if _item:
                    _items.append(_item.to_dict())
            _dict['runtime_parameters'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Reportsv3ReportDefinition from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "category_id": obj.get("category_id"),
            "creation_time": obj.get("creation_time"),
            "creator_user_id": obj.get("creator_user_id"),
            "date_range": Reportsv3DateRange.from_dict(obj["date_range"]) if obj.get("date_range") is not None else None,
            "default_timestamp_header_id": obj.get("default_timestamp_header_id"),
            "is_auditable": obj.get("is_auditable"),
            "is_hidden": obj.get("is_hidden"),
            "is_pinned": obj.get("is_pinned"),
            "is_predefined": obj.get("is_predefined"),
            "refresh_rate": obj.get("refresh_rate"),
            "report_description": obj.get("report_description"),
            "report_filters": Reportsv3ReportFilterBrackets.from_dict(obj["report_filters"]) if obj.get("report_filters") is not None else None,
            "report_headers": [Reportsv3ReportHeader.from_dict(_item) for _item in obj["report_headers"]] if obj.get("report_headers") is not None else None,
            "report_id": obj.get("report_id"),
            "report_name": obj.get("report_name"),
            "report_tags": [Reportsv3ReportTag.from_dict(_item) for _item in obj["report_tags"]] if obj.get("report_tags") is not None else None,
            "runtime_parameters": [Reportsv3RunTimeParameter.from_dict(_item) for _item in obj["runtime_parameters"]] if obj.get("runtime_parameters") is not None else None,
            "selected_timestamp_header_id": obj.get("selected_timestamp_header_id"),
            "should_add_count": obj.get("should_add_count"),
            "should_add_distinct": obj.get("should_add_distinct"),
            "sql_last_version": obj.get("sql_last_version"),
            "table_join_optimization": obj.get("table_join_optimization"),
            "use_pipeline_queries": obj.get("use_pipeline_queries")
        })
        return _obj


