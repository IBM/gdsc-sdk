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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.reportsv3_date_range import Reportsv3DateRange
from ibm_gdsc_sdk_saas.models.reportsv3_header_type import Reportsv3HeaderType
from ibm_gdsc_sdk_saas.models.reportsv3_operator_type import Reportsv3OperatorType
from ibm_gdsc_sdk_saas.models.reportsv3_parameter_type import Reportsv3ParameterType
from typing import Optional, Set
from typing_extensions import Self

class Reportsv3ReportFilterCondition(BaseModel):
    """
    ReportFilterCondition represents a report filter condition.
    """ # noqa: E501
    case_insensitive: Optional[StrictBool] = Field(default=None, description="Case Insensitive - Whether the condition is case insensitive or case sensitive.")
    field_nls_translation_key: Optional[StrictStr] = None
    filter_id: Optional[StrictInt] = None
    group_type_id: Optional[StrictInt] = None
    header_id: Optional[StrictStr] = None
    header_name: Optional[StrictStr] = None
    header_type: Optional[Reportsv3HeaderType] = None
    in_report_date_range: Optional[Reportsv3DateRange] = None
    in_report_field_nls_key: Optional[StrictStr] = None
    in_report_header_id: Optional[StrictStr] = None
    in_report_header_name: Optional[StrictStr] = None
    in_report_id: Optional[StrictStr] = None
    in_report_name: Optional[StrictStr] = None
    in_report_table_name: Optional[StrictStr] = None
    is_tuple: Optional[StrictBool] = None
    operator_type: Optional[Reportsv3OperatorType] = None
    parameter_type: Optional[Reportsv3ParameterType] = None
    schema_name: Optional[StrictStr] = None
    sequence: Optional[StrictInt] = None
    table_name: Optional[StrictStr] = None
    tuple_type: Optional[StrictStr] = None
    values: Optional[List[StrictStr]] = None
    __properties: ClassVar[List[str]] = ["case_insensitive", "field_nls_translation_key", "filter_id", "group_type_id", "header_id", "header_name", "header_type", "in_report_date_range", "in_report_field_nls_key", "in_report_header_id", "in_report_header_name", "in_report_id", "in_report_name", "in_report_table_name", "is_tuple", "operator_type", "parameter_type", "schema_name", "sequence", "table_name", "tuple_type", "values"]

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
        """Create an instance of Reportsv3ReportFilterCondition from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of in_report_date_range
        if self.in_report_date_range:
            _dict['in_report_date_range'] = self.in_report_date_range.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Reportsv3ReportFilterCondition from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "case_insensitive": obj.get("case_insensitive"),
            "field_nls_translation_key": obj.get("field_nls_translation_key"),
            "filter_id": obj.get("filter_id"),
            "group_type_id": obj.get("group_type_id"),
            "header_id": obj.get("header_id"),
            "header_name": obj.get("header_name"),
            "header_type": obj.get("header_type"),
            "in_report_date_range": Reportsv3DateRange.from_dict(obj["in_report_date_range"]) if obj.get("in_report_date_range") is not None else None,
            "in_report_field_nls_key": obj.get("in_report_field_nls_key"),
            "in_report_header_id": obj.get("in_report_header_id"),
            "in_report_header_name": obj.get("in_report_header_name"),
            "in_report_id": obj.get("in_report_id"),
            "in_report_name": obj.get("in_report_name"),
            "in_report_table_name": obj.get("in_report_table_name"),
            "is_tuple": obj.get("is_tuple"),
            "operator_type": obj.get("operator_type"),
            "parameter_type": obj.get("parameter_type"),
            "schema_name": obj.get("schema_name"),
            "sequence": obj.get("sequence"),
            "table_name": obj.get("table_name"),
            "tuple_type": obj.get("tuple_type"),
            "values": obj.get("values")
        })
        return _obj


