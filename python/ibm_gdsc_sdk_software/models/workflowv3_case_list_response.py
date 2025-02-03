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

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.googlerpc_status import GooglerpcStatus
from ibm_gdsc_sdk_software.models.workflowv3_case import Workflowv3Case
from ibm_gdsc_sdk_software.models.workflowv3_filter import Workflowv3Filter
from typing import Optional, Set
from typing_extensions import Self

class Workflowv3CaseListResponse(BaseModel):
    """
    Returns just cases with associated tasks.
    """ # noqa: E501
    cases: Optional[List[Workflowv3Case]] = Field(default=None, description="Filtered list of cases.")
    filter: Optional[Workflowv3Filter] = None
    status: Optional[GooglerpcStatus] = None
    __properties: ClassVar[List[str]] = ["cases", "filter", "status"]

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
        """Create an instance of Workflowv3CaseListResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in cases (list)
        _items = []
        if self.cases:
            for _item in self.cases:
                if _item:
                    _items.append(_item.to_dict())
            _dict['cases'] = _items
        # override the default output from pydantic by calling `to_dict()` of filter
        if self.filter:
            _dict['filter'] = self.filter.to_dict()
        # override the default output from pydantic by calling `to_dict()` of status
        if self.status:
            _dict['status'] = self.status.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Workflowv3CaseListResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "cases": [Workflowv3Case.from_dict(_item) for _item in obj["cases"]] if obj.get("cases") is not None else None,
            "filter": Workflowv3Filter.from_dict(obj["filter"]) if obj.get("filter") is not None else None,
            "status": GooglerpcStatus.from_dict(obj["status"]) if obj.get("status") is not None else None
        })
        return _obj


