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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.reportsv3_date_range import Reportsv3DateRange
from ibm_gdsc_sdk_software.models.reportsv3_job_type import Reportsv3JobType
from ibm_gdsc_sdk_software.models.reportsv3_model_type import Reportsv3ModelType
from ibm_gdsc_sdk_software.models.reportsv3_report_definition import Reportsv3ReportDefinition
from ibm_gdsc_sdk_software.models.reportsv3_report_header import Reportsv3ReportHeader
from ibm_gdsc_sdk_software.models.reportsv3_sql_type import Reportsv3SqlType
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3GetQueryByReportDefinitionRequest(BaseModel):
    """
    Reportsv3GetQueryByReportDefinitionRequest
    """ # noqa: E501
    add_group_literal: Optional[StrictStr] = None
    add_job_id_literal: Optional[StrictStr] = None
    date_range: Optional[Reportsv3DateRange] = None
    default_chart_expanded: Optional[StrictBool] = Field(default=None, description="Optional: if report has chart -send  default_chart_expanded be saved in user settings collection per report and user.")
    exclude_group_id: Optional[StrictStr] = None
    facet_selected_header: Optional[Reportsv3ReportHeader] = None
    filter_for_job_id: Optional[StrictStr] = None
    job_type: Optional[Reportsv3JobType] = None
    model_types: Optional[List[Reportsv3ModelType]] = None
    report_definition: Optional[Reportsv3ReportDefinition] = None
    sql_type: Optional[Reportsv3SqlType] = None
    table_join_optimization: Optional[StrictBool] = Field(default=None, description="Optional: disable or enable the table join optimization.")
    __properties: ClassVar[List[str]] = ["add_group_literal", "add_job_id_literal", "date_range", "default_chart_expanded", "exclude_group_id", "facet_selected_header", "filter_for_job_id", "job_type", "model_types", "report_definition", "sql_type", "table_join_optimization"]

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
        """Create an instance of Reportsv3GetQueryByReportDefinitionRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of facet_selected_header
        if self.facet_selected_header:
            _dict['facet_selected_header'] = self.facet_selected_header.to_dict()
        # override the default output from pydantic by calling `to_dict()` of report_definition
        if self.report_definition:
            _dict['report_definition'] = self.report_definition.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Reportsv3GetQueryByReportDefinitionRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "add_group_literal": obj.get("add_group_literal"),
            "add_job_id_literal": obj.get("add_job_id_literal"),
            "date_range": Reportsv3DateRange.from_dict(obj["date_range"]) if obj.get("date_range") is not None else None,
            "default_chart_expanded": obj.get("default_chart_expanded"),
            "exclude_group_id": obj.get("exclude_group_id"),
            "facet_selected_header": Reportsv3ReportHeader.from_dict(obj["facet_selected_header"]) if obj.get("facet_selected_header") is not None else None,
            "filter_for_job_id": obj.get("filter_for_job_id"),
            "job_type": obj.get("job_type"),
            "model_types": obj.get("model_types"),
            "report_definition": Reportsv3ReportDefinition.from_dict(obj["report_definition"]) if obj.get("report_definition") is not None else None,
            "sql_type": obj.get("sql_type"),
            "table_join_optimization": obj.get("table_join_optimization")
        })
        return _obj


