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
from guardiumsdkpython.models.assetsv3_connection_edge import Assetsv3ConnectionEdge
from guardiumsdkpython.models.assetsv3_custom_property import Assetsv3CustomProperty
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3HostVertex(BaseModel):
    """
    Assetsv3HostVertex
    """ # noqa: E501
    city: Optional[StrictStr] = None
    country: Optional[StrictStr] = None
    data_center: Optional[StrictStr] = None
    description: Optional[StrictStr] = None
    dns: Optional[StrictStr] = None
    extended_properties: Optional[List[Assetsv3CustomProperty]] = None
    host_ip: Optional[List[Assetsv3ConnectionEdge]] = None
    host_name: Optional[StrictStr] = None
    host_port: Optional[List[Assetsv3ConnectionEdge]] = None
    region: Optional[StrictStr] = None
    resolution_key: Optional[StrictStr] = None
    state: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["city", "country", "data_center", "description", "dns", "extended_properties", "host_ip", "host_name", "host_port", "region", "resolution_key", "state"]

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
        """Create an instance of Assetsv3HostVertex from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in extended_properties (list)
        _items = []
        if self.extended_properties:
            for _item in self.extended_properties:
                if _item:
                    _items.append(_item.to_dict())
            _dict['extended_properties'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in host_ip (list)
        _items = []
        if self.host_ip:
            for _item in self.host_ip:
                if _item:
                    _items.append(_item.to_dict())
            _dict['host_ip'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in host_port (list)
        _items = []
        if self.host_port:
            for _item in self.host_port:
                if _item:
                    _items.append(_item.to_dict())
            _dict['host_port'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Assetsv3HostVertex from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "city": obj.get("city"),
            "country": obj.get("country"),
            "data_center": obj.get("data_center"),
            "description": obj.get("description"),
            "dns": obj.get("dns"),
            "extended_properties": [Assetsv3CustomProperty.from_dict(_item) for _item in obj["extended_properties"]] if obj.get("extended_properties") is not None else None,
            "host_ip": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["host_ip"]] if obj.get("host_ip") is not None else None,
            "host_name": obj.get("host_name"),
            "host_port": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["host_port"]] if obj.get("host_port") is not None else None,
            "region": obj.get("region"),
            "resolution_key": obj.get("resolution_key"),
            "state": obj.get("state")
        })
        return _obj


