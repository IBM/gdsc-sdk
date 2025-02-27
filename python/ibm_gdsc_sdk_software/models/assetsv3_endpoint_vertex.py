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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.assetsv3_connection_edge import Assetsv3ConnectionEdge
from ibm_gdsc_sdk_software.models.assetsv3_custom_property import Assetsv3CustomProperty
from ibm_gdsc_sdk_software.models.assetsv3_level import Assetsv3Level
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3EndpointVertex(BaseModel):
    """
    Assetsv3EndpointVertex
    """ # noqa: E501
    criticality: Optional[Assetsv3Level] = None
    endpoint_host: Optional[List[Assetsv3ConnectionEdge]] = None
    endpoint_ip: Optional[List[Assetsv3ConnectionEdge]] = None
    endpoint_name: Optional[StrictStr] = None
    endpoint_sub_type: Optional[StrictStr] = None
    endpoint_type: Optional[StrictStr] = None
    extended_properties: Optional[List[Assetsv3CustomProperty]] = None
    is_access_url: Optional[StrictBool] = Field(default=None, description="to check if this entry is for access url. Used as an access url for application.")
    os: Optional[StrictStr] = None
    owner: Optional[List[StrictStr]] = None
    resolution_key: Optional[StrictStr] = None
    risk_level: Optional[Assetsv3Level] = None
    __properties: ClassVar[List[str]] = ["criticality", "endpoint_host", "endpoint_ip", "endpoint_name", "endpoint_sub_type", "endpoint_type", "extended_properties", "is_access_url", "os", "owner", "resolution_key", "risk_level"]

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
        """Create an instance of Assetsv3EndpointVertex from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in endpoint_host (list)
        _items = []
        if self.endpoint_host:
            for _item in self.endpoint_host:
                if _item:
                    _items.append(_item.to_dict())
            _dict['endpoint_host'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in endpoint_ip (list)
        _items = []
        if self.endpoint_ip:
            for _item in self.endpoint_ip:
                if _item:
                    _items.append(_item.to_dict())
            _dict['endpoint_ip'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in extended_properties (list)
        _items = []
        if self.extended_properties:
            for _item in self.extended_properties:
                if _item:
                    _items.append(_item.to_dict())
            _dict['extended_properties'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Assetsv3EndpointVertex from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "criticality": obj.get("criticality"),
            "endpoint_host": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["endpoint_host"]] if obj.get("endpoint_host") is not None else None,
            "endpoint_ip": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["endpoint_ip"]] if obj.get("endpoint_ip") is not None else None,
            "endpoint_name": obj.get("endpoint_name"),
            "endpoint_sub_type": obj.get("endpoint_sub_type"),
            "endpoint_type": obj.get("endpoint_type"),
            "extended_properties": [Assetsv3CustomProperty.from_dict(_item) for _item in obj["extended_properties"]] if obj.get("extended_properties") is not None else None,
            "is_access_url": obj.get("is_access_url"),
            "os": obj.get("os"),
            "owner": obj.get("owner"),
            "resolution_key": obj.get("resolution_key"),
            "risk_level": obj.get("risk_level")
        })
        return _obj


