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
from ibm_gdsc_sdk_software.models.reportsv3_date_range import Reportsv3DateRange
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3InReportAdditionalParameter(BaseModel):
    """
    InReportAdditionalParameter that holds dateRange information of subquery reports.
    """ # noqa: E501
    date_range: Optional[Reportsv3DateRange] = None
    header_name: Optional[StrictStr] = Field(default=None, description="Header Name of subquery.")
    report_id: Optional[StrictStr] = Field(default=None, description="Report ID of subquery.")
    table_name: Optional[StrictStr] = Field(default=None, description="Table Name of subquery.")
    __properties: ClassVar[List[str]] = ["date_range", "header_name", "report_id", "table_name"]

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
        """Create an instance of Reportsv3InReportAdditionalParameter from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Reportsv3InReportAdditionalParameter from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "date_range": Reportsv3DateRange.from_dict(obj["date_range"]) if obj.get("date_range") is not None else None,
            "header_name": obj.get("header_name"),
            "report_id": obj.get("report_id"),
            "table_name": obj.get("table_name")
        })
        return _obj


