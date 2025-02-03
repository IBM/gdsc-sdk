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

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from guardiumsdkpython.models.connectionsv3_header_filter import Connectionsv3HeaderFilter
from guardiumsdkpython.models.connectionsv3_order_type import Connectionsv3OrderType
from typing import Optional, Set
from typing_extensions import Self

class Connectionsv3ConnectorSetting(BaseModel):
    """
    Connector setting.
    """ # noqa: E501
    description: Optional[StrictStr] = Field(default=None, description="The description.")
    filters: Optional[List[Connectionsv3HeaderFilter]] = Field(default=None, description="The filters associated to this setting.")
    headers: Optional[List[StrictStr]] = Field(default=None, description="The headers used when this setting is active.")
    id: Optional[StrictStr] = Field(default=None, description="The id of the setting.")
    name: Optional[StrictStr] = Field(default=None, description="The name of the Preset.")
    order: Optional[Connectionsv3OrderType] = None
    sorted_by: Optional[StrictStr] = Field(default=None, description="The header key used for sorting.", alias="sortedBy")
    __properties: ClassVar[List[str]] = ["description", "filters", "headers", "id", "name", "order", "sortedBy"]

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
        """Create an instance of Connectionsv3ConnectorSetting from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Connectionsv3ConnectorSetting from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "description": obj.get("description"),
            "filters": [Connectionsv3HeaderFilter.from_dict(_item) for _item in obj["filters"]] if obj.get("filters") is not None else None,
            "headers": obj.get("headers"),
            "id": obj.get("id"),
            "name": obj.get("name"),
            "order": obj.get("order"),
            "sortedBy": obj.get("sortedBy")
        })
        return _obj


