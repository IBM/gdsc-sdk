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

from pydantic import BaseModel, ConfigDict, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from guardiumsdkpython.models.assetsv3_filter_sub_catagory_child import Assetsv3FilterSubCatagoryChild
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3FilterSubCatagory(BaseModel):
    """
    Assetsv3FilterSubCatagory
    """ # noqa: E501
    selected_children_list: Optional[List[Assetsv3FilterSubCatagoryChild]] = None
    sub_catagory_id: Optional[StrictStr] = None
    sub_category_value: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["selected_children_list", "sub_catagory_id", "sub_category_value"]

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
        """Create an instance of Assetsv3FilterSubCatagory from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in selected_children_list (list)
        _items = []
        if self.selected_children_list:
            for _item in self.selected_children_list:
                if _item:
                    _items.append(_item.to_dict())
            _dict['selected_children_list'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Assetsv3FilterSubCatagory from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "selected_children_list": [Assetsv3FilterSubCatagoryChild.from_dict(_item) for _item in obj["selected_children_list"]] if obj.get("selected_children_list") is not None else None,
            "sub_catagory_id": obj.get("sub_catagory_id"),
            "sub_category_value": obj.get("sub_category_value")
        })
        return _obj


