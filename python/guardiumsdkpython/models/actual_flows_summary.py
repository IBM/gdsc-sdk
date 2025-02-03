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

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt
from typing import Any, ClassVar, Dict, List, Union
from guardiumsdkpython.models.access_type_count_inner import AccessTypeCountInner
from guardiumsdkpython.models.flow_node_summary import FlowNodeSummary
from typing import Optional, Set
from typing_extensions import Self

class ActualFlowsSummary(BaseModel):
    """
    ActualFlowsSummary
    """ # noqa: E501
    flows_count: Union[StrictFloat, StrictInt] = Field(alias="flowsCount")
    sources_summary: FlowNodeSummary = Field(alias="sourcesSummary")
    destinations_summary: FlowNodeSummary = Field(alias="destinationsSummary")
    access_types_count: List[AccessTypeCountInner] = Field(alias="accessTypesCount")
    __properties: ClassVar[List[str]] = ["flowsCount", "sourcesSummary", "destinationsSummary", "accessTypesCount"]

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
        """Create an instance of ActualFlowsSummary from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of sources_summary
        if self.sources_summary:
            _dict['sourcesSummary'] = self.sources_summary.to_dict()
        # override the default output from pydantic by calling `to_dict()` of destinations_summary
        if self.destinations_summary:
            _dict['destinationsSummary'] = self.destinations_summary.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in access_types_count (list)
        _items = []
        if self.access_types_count:
            for _item in self.access_types_count:
                if _item:
                    _items.append(_item.to_dict())
            _dict['accessTypesCount'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ActualFlowsSummary from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "flowsCount": obj.get("flowsCount"),
            "sourcesSummary": FlowNodeSummary.from_dict(obj["sourcesSummary"]) if obj.get("sourcesSummary") is not None else None,
            "destinationsSummary": FlowNodeSummary.from_dict(obj["destinationsSummary"]) if obj.get("destinationsSummary") is not None else None,
            "accessTypesCount": [AccessTypeCountInner.from_dict(_item) for _item in obj["accessTypesCount"]] if obj.get("accessTypesCount") is not None else None
        })
        return _obj


