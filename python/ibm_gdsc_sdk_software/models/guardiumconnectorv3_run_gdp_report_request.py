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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_gdp_report_parameter import Guardiumconnectorv3GDPReportParameter
from ibm_gdsc_sdk_software.models.run_gdp_report_request_sort_order import RunGDPReportRequestSortOrder
from typing import Optional, Set
from typing_extensions import Self

class Guardiumconnectorv3RunGDPReportRequest(BaseModel):
    """
    Runs specified report.
    """ # noqa: E501
    central_manager_id: Optional[StrictStr] = Field(default=None, description="Central Manager ID.")
    max_fetch_size: Optional[StrictInt] = Field(default=None, description="Maximum number of rows to retrieve if not specified will retrieve the maximum number of rows allowed by GDP for CSV export can't be larger than the configured maximum number of rows for CSV export on specified central manager.")
    report_name: Optional[StrictStr] = Field(default=None, description="Name of the report.")
    report_parameters: Optional[List[Guardiumconnectorv3GDPReportParameter]] = Field(default=None, description="Report parameters.")
    sort_column: Optional[StrictStr] = Field(default=None, description="Column to sort on if not specified returns rows in default sort order of the report.")
    sort_order: Optional[RunGDPReportRequestSortOrder] = None
    start_from: Optional[StrictInt] = Field(default=None, description="Result row index to retrieve from if not specified returns results from the beginning.")
    __properties: ClassVar[List[str]] = ["central_manager_id", "max_fetch_size", "report_name", "report_parameters", "sort_column", "sort_order", "start_from"]

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
        """Create an instance of Guardiumconnectorv3RunGDPReportRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in report_parameters (list)
        _items = []
        if self.report_parameters:
            for _item in self.report_parameters:
                if _item:
                    _items.append(_item.to_dict())
            _dict['report_parameters'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Guardiumconnectorv3RunGDPReportRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "central_manager_id": obj.get("central_manager_id"),
            "max_fetch_size": obj.get("max_fetch_size"),
            "report_name": obj.get("report_name"),
            "report_parameters": [Guardiumconnectorv3GDPReportParameter.from_dict(_item) for _item in obj["report_parameters"]] if obj.get("report_parameters") is not None else None,
            "sort_column": obj.get("sort_column"),
            "sort_order": obj.get("sort_order"),
            "start_from": obj.get("start_from")
        })
        return _obj


