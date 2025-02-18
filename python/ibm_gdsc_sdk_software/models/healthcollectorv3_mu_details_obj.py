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
from ibm_gdsc_sdk_software.models.healthcollectorv3_aggregation_details_object import Healthcollectorv3AggregationDetailsObject
from ibm_gdsc_sdk_software.models.healthcollectorv3_general_details_object import Healthcollectorv3GeneralDetailsObject
from ibm_gdsc_sdk_software.models.healthcollectorv3_utilization_parameter_object import Healthcollectorv3UtilizationParameterObject
from typing import Optional, Set
from typing_extensions import Self

class Healthcollectorv3MUDetailsObj(BaseModel):
    """
    MUDetailObj gets additional information about managed units.
    """ # noqa: E501
    aggregation_details_list: Optional[List[Healthcollectorv3AggregationDetailsObject]] = Field(default=None, description="Aggregation details.")
    connectivity_details: Optional[Healthcollectorv3GeneralDetailsObject] = None
    general_err_messages: Optional[List[StrictStr]] = Field(default=None, description="Additional messages and details about managed units.")
    utilization_parameters_values: Optional[Healthcollectorv3UtilizationParameterObject] = None
    __properties: ClassVar[List[str]] = ["aggregation_details_list", "connectivity_details", "general_err_messages", "utilization_parameters_values"]

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
        """Create an instance of Healthcollectorv3MUDetailsObj from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in aggregation_details_list (list)
        _items = []
        if self.aggregation_details_list:
            for _item in self.aggregation_details_list:
                if _item:
                    _items.append(_item.to_dict())
            _dict['aggregation_details_list'] = _items
        # override the default output from pydantic by calling `to_dict()` of connectivity_details
        if self.connectivity_details:
            _dict['connectivity_details'] = self.connectivity_details.to_dict()
        # override the default output from pydantic by calling `to_dict()` of utilization_parameters_values
        if self.utilization_parameters_values:
            _dict['utilization_parameters_values'] = self.utilization_parameters_values.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Healthcollectorv3MUDetailsObj from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "aggregation_details_list": [Healthcollectorv3AggregationDetailsObject.from_dict(_item) for _item in obj["aggregation_details_list"]] if obj.get("aggregation_details_list") is not None else None,
            "connectivity_details": Healthcollectorv3GeneralDetailsObject.from_dict(obj["connectivity_details"]) if obj.get("connectivity_details") is not None else None,
            "general_err_messages": obj.get("general_err_messages"),
            "utilization_parameters_values": Healthcollectorv3UtilizationParameterObject.from_dict(obj["utilization_parameters_values"]) if obj.get("utilization_parameters_values") is not None else None
        })
        return _obj


