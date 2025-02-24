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
from ibm_gdsc_sdk_saas.models.auditv3_activity_record import Auditv3ActivityRecord
from ibm_gdsc_sdk_saas.models.auditv3_filter_field import Auditv3FilterField
from typing import Optional, Set
from typing_extensions import Self

class Auditv3GetActivityRecordsResponse(BaseModel):
    """
    GetActivityResponse returns the requested activity log records.
    """ # noqa: E501
    filters: Optional[List[Auditv3FilterField]] = Field(default=None, description="All of the eligible filters based on the passed in parameters.")
    records: Optional[List[Auditv3ActivityRecord]] = Field(default=None, description="All of the activity log records based on the passed in parameters.")
    total_records: Optional[StrictStr] = Field(default=None, description="Total number of Activity records.")
    __properties: ClassVar[List[str]] = ["filters", "records", "total_records"]

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
        """Create an instance of Auditv3GetActivityRecordsResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in filters (list)
        _items = []
        if self.filters:
            for _item in self.filters:
                if _item:
                    _items.append(_item.to_dict())
            _dict['filters'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in records (list)
        _items = []
        if self.records:
            for _item in self.records:
                if _item:
                    _items.append(_item.to_dict())
            _dict['records'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Auditv3GetActivityRecordsResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "filters": [Auditv3FilterField.from_dict(_item) for _item in obj["filters"]] if obj.get("filters") is not None else None,
            "records": [Auditv3ActivityRecord.from_dict(_item) for _item in obj["records"]] if obj.get("records") is not None else None,
            "total_records": obj.get("total_records")
        })
        return _obj


