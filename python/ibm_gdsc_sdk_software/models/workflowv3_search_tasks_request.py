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
from ibm_gdsc_sdk_software.models.reportsv3_order_by import Reportsv3OrderBy
from ibm_gdsc_sdk_software.models.workflowv3_filter import Workflowv3Filter
from typing import Optional, Set
from typing_extensions import Self

class Workflowv3SearchTasksRequest(BaseModel):
    """
    Request cases by filtering on specific values.
    """ # noqa: E501
    case_id: Optional[StrictStr] = None
    filter: Optional[Workflowv3Filter] = None
    limit: Optional[StrictInt] = Field(default=None, description="Optional: The max amount of cases to return for pagination.")
    offset: Optional[StrictInt] = Field(default=None, description="Optional: The amount to offset the cases for pagination.")
    sort_field: Optional[StrictStr] = None
    sort_order: Optional[Reportsv3OrderBy] = None
    task_id: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["case_id", "filter", "limit", "offset", "sort_field", "sort_order", "task_id"]

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
        """Create an instance of Workflowv3SearchTasksRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of filter
        if self.filter:
            _dict['filter'] = self.filter.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Workflowv3SearchTasksRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "case_id": obj.get("case_id"),
            "filter": Workflowv3Filter.from_dict(obj["filter"]) if obj.get("filter") is not None else None,
            "limit": obj.get("limit"),
            "offset": obj.get("offset"),
            "sort_field": obj.get("sort_field"),
            "sort_order": obj.get("sort_order"),
            "task_id": obj.get("task_id")
        })
        return _obj


