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
from ibm_gdsc_sdk_saas.models.assetsv3_connection_edge import Assetsv3ConnectionEdge
from ibm_gdsc_sdk_saas.models.assetsv3_custom_property import Assetsv3CustomProperty
from ibm_gdsc_sdk_saas.models.assetsv3_level import Assetsv3Level
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3DeploymentVertex(BaseModel):
    """
    Assetsv3DeploymentVertex
    """ # noqa: E501
    city: Optional[StrictStr] = None
    country: Optional[StrictStr] = None
    criticality: Optional[Assetsv3Level] = None
    data_center: Optional[StrictStr] = None
    deployment_account: Optional[List[Assetsv3ConnectionEdge]] = None
    deployment_id: Optional[StrictStr] = None
    deployment_subscription: Optional[List[Assetsv3ConnectionEdge]] = None
    dns: Optional[StrictStr] = None
    environment: Optional[StrictStr] = None
    extended_properties: Optional[List[Assetsv3CustomProperty]] = None
    name: Optional[StrictStr] = None
    region: Optional[StrictStr] = None
    resolution_key: Optional[StrictStr] = None
    risk_level: Optional[Assetsv3Level] = None
    service: Optional[StrictStr] = None
    state: Optional[StrictStr] = None
    type: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["city", "country", "criticality", "data_center", "deployment_account", "deployment_id", "deployment_subscription", "dns", "environment", "extended_properties", "name", "region", "resolution_key", "risk_level", "service", "state", "type"]

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
        """Create an instance of Assetsv3DeploymentVertex from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in deployment_account (list)
        _items = []
        if self.deployment_account:
            for _item in self.deployment_account:
                if _item:
                    _items.append(_item.to_dict())
            _dict['deployment_account'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in deployment_subscription (list)
        _items = []
        if self.deployment_subscription:
            for _item in self.deployment_subscription:
                if _item:
                    _items.append(_item.to_dict())
            _dict['deployment_subscription'] = _items
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
        """Create an instance of Assetsv3DeploymentVertex from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "city": obj.get("city"),
            "country": obj.get("country"),
            "criticality": obj.get("criticality"),
            "data_center": obj.get("data_center"),
            "deployment_account": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["deployment_account"]] if obj.get("deployment_account") is not None else None,
            "deployment_id": obj.get("deployment_id"),
            "deployment_subscription": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["deployment_subscription"]] if obj.get("deployment_subscription") is not None else None,
            "dns": obj.get("dns"),
            "environment": obj.get("environment"),
            "extended_properties": [Assetsv3CustomProperty.from_dict(_item) for _item in obj["extended_properties"]] if obj.get("extended_properties") is not None else None,
            "name": obj.get("name"),
            "region": obj.get("region"),
            "resolution_key": obj.get("resolution_key"),
            "risk_level": obj.get("risk_level"),
            "service": obj.get("service"),
            "state": obj.get("state"),
            "type": obj.get("type")
        })
        return _obj


