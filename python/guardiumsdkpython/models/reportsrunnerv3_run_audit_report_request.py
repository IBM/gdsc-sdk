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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from guardiumsdkpython.models.reportsv3_order_by import Reportsv3OrderBy
from guardiumsdkpython.models.reportsv3_report_filter_brackets import Reportsv3ReportFilterBrackets
from typing import Optional, Set
from typing_extensions import Self

class Reportsrunnerv3RunAuditReportRequest(BaseModel):
    """
    RunAuditReportRequest is the argument of RunAuditReport API.
    """ # noqa: E501
    fetch_size: Optional[StrictInt] = Field(default=None, description="The max amount of rows to return for pagination. Required if report query uses offset and fetch_size parameters.")
    header_name: Optional[StrictStr] = Field(default=None, description="The header name.")
    job_id: Optional[StrictStr] = Field(default=None, description="Unique token identifying the export job.")
    offset: Optional[StrictInt] = Field(default=None, description="The amount to offset the rows by for pagination. Required if report query uses offset and fetch_size parameters.")
    order_by: Optional[Reportsv3OrderBy] = None
    report_filters: Optional[Reportsv3ReportFilterBrackets] = None
    report_id: Optional[StrictStr] = Field(default=None, description="The ID of the Report we wish to run (e.g. 000000000000000000000905).")
    schema_name: Optional[StrictStr] = Field(default=None, description="The schema name to organize report task temp tables.")
    table_name: Optional[StrictStr] = Field(default=None, description="The table name to save report task data(task_id).")
    without_limit: Optional[StrictBool] = Field(default=None, description="Whether or not to limit the results.")
    __properties: ClassVar[List[str]] = ["fetch_size", "header_name", "job_id", "offset", "order_by", "report_filters", "report_id", "schema_name", "table_name", "without_limit"]

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
        """Create an instance of Reportsrunnerv3RunAuditReportRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of report_filters
        if self.report_filters:
            _dict['report_filters'] = self.report_filters.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Reportsrunnerv3RunAuditReportRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "fetch_size": obj.get("fetch_size"),
            "header_name": obj.get("header_name"),
            "job_id": obj.get("job_id"),
            "offset": obj.get("offset"),
            "order_by": obj.get("order_by"),
            "report_filters": Reportsv3ReportFilterBrackets.from_dict(obj["report_filters"]) if obj.get("report_filters") is not None else None,
            "report_id": obj.get("report_id"),
            "schema_name": obj.get("schema_name"),
            "table_name": obj.get("table_name"),
            "without_limit": obj.get("without_limit")
        })
        return _obj


