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

from pydantic import BaseModel, ConfigDict, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.assetsv3_connection_edge import Assetsv3ConnectionEdge
from ibm_gdsc_sdk_software.models.assetsv3_custom_property import Assetsv3CustomProperty
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3IPVertex(BaseModel):
    """
    Assetsv3IPVertex
    """ # noqa: E501
    city: Optional[StrictStr] = None
    country: Optional[StrictStr] = None
    data_center: Optional[StrictStr] = None
    description: Optional[StrictStr] = None
    dns: Optional[StrictStr] = None
    extended_properties: Optional[List[Assetsv3CustomProperty]] = None
    ip_address: Optional[StrictStr] = None
    ip_port: Optional[List[Assetsv3ConnectionEdge]] = None
    mac_address: Optional[StrictStr] = None
    region: Optional[StrictStr] = None
    resolution_key: Optional[StrictStr] = None
    state: Optional[StrictStr] = None
    version: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["city", "country", "data_center", "description", "dns", "extended_properties", "ip_address", "ip_port", "mac_address", "region", "resolution_key", "state", "version"]

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
        """Create an instance of Assetsv3IPVertex from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in ip_port (list)
        _items = []
        if self.ip_port:
            for _item in self.ip_port:
                if _item:
                    _items.append(_item.to_dict())
            _dict['ip_port'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Assetsv3IPVertex from a dict"""
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
            "ip_address": obj.get("ip_address"),
            "ip_port": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["ip_port"]] if obj.get("ip_port") is not None else None,
            "mac_address": obj.get("mac_address"),
            "region": obj.get("region"),
            "resolution_key": obj.get("resolution_key"),
            "state": obj.get("state"),
            "version": obj.get("version")
        })
        return _obj


