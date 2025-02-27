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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.assetsv3_connection_edge import Assetsv3ConnectionEdge
from ibm_gdsc_sdk_saas.models.assetsv3_custom_property import Assetsv3CustomProperty
from ibm_gdsc_sdk_saas.models.assetsv3_level import Assetsv3Level
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3ModelVertex(BaseModel):
    """
    Assetsv3ModelVertex
    """ # noqa: E501
    criticality: Optional[Assetsv3Level] = None
    extended_properties: Optional[List[Assetsv3CustomProperty]] = None
    has_training_data: Optional[StrictBool] = None
    last_trained: Optional[datetime] = None
    model_application: Optional[List[Assetsv3ConnectionEdge]] = None
    model_deployment: Optional[List[Assetsv3ConnectionEdge]] = None
    model_id: Optional[StrictStr] = None
    model_name: Optional[StrictStr] = None
    model_resources: Optional[List[Assetsv3ConnectionEdge]] = None
    model_sub_type: Optional[StrictStr] = None
    model_type: Optional[StrictStr] = None
    publisher: Optional[StrictStr] = None
    resolution_key: Optional[StrictStr] = None
    risk_level: Optional[Assetsv3Level] = None
    version: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["criticality", "extended_properties", "has_training_data", "last_trained", "model_application", "model_deployment", "model_id", "model_name", "model_resources", "model_sub_type", "model_type", "publisher", "resolution_key", "risk_level", "version"]

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
        """Create an instance of Assetsv3ModelVertex from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in model_application (list)
        _items = []
        if self.model_application:
            for _item in self.model_application:
                if _item:
                    _items.append(_item.to_dict())
            _dict['model_application'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in model_deployment (list)
        _items = []
        if self.model_deployment:
            for _item in self.model_deployment:
                if _item:
                    _items.append(_item.to_dict())
            _dict['model_deployment'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in model_resources (list)
        _items = []
        if self.model_resources:
            for _item in self.model_resources:
                if _item:
                    _items.append(_item.to_dict())
            _dict['model_resources'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Assetsv3ModelVertex from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "criticality": obj.get("criticality"),
            "extended_properties": [Assetsv3CustomProperty.from_dict(_item) for _item in obj["extended_properties"]] if obj.get("extended_properties") is not None else None,
            "has_training_data": obj.get("has_training_data"),
            "last_trained": obj.get("last_trained"),
            "model_application": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["model_application"]] if obj.get("model_application") is not None else None,
            "model_deployment": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["model_deployment"]] if obj.get("model_deployment") is not None else None,
            "model_id": obj.get("model_id"),
            "model_name": obj.get("model_name"),
            "model_resources": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["model_resources"]] if obj.get("model_resources") is not None else None,
            "model_sub_type": obj.get("model_sub_type"),
            "model_type": obj.get("model_type"),
            "publisher": obj.get("publisher"),
            "resolution_key": obj.get("resolution_key"),
            "risk_level": obj.get("risk_level"),
            "version": obj.get("version")
        })
        return _obj


