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
from pydantic import BaseModel, ConfigDict, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.assetsv3_connection_edge import Assetsv3ConnectionEdge
from ibm_gdsc_sdk_saas.models.assetsv3_custom_property import Assetsv3CustomProperty
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3SubscriptionVertex(BaseModel):
    """
    Assetsv3SubscriptionVertex
    """ # noqa: E501
    duration: Optional[StrictStr] = None
    end_time: Optional[datetime] = None
    extended_properties: Optional[List[Assetsv3CustomProperty]] = None
    name: Optional[StrictStr] = None
    resolution_key: Optional[StrictStr] = None
    start_time: Optional[datetime] = None
    subscription_account: Optional[List[Assetsv3ConnectionEdge]] = None
    subscription_id: Optional[StrictStr] = None
    type: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["duration", "end_time", "extended_properties", "name", "resolution_key", "start_time", "subscription_account", "subscription_id", "type"]

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
        """Create an instance of Assetsv3SubscriptionVertex from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in subscription_account (list)
        _items = []
        if self.subscription_account:
            for _item in self.subscription_account:
                if _item:
                    _items.append(_item.to_dict())
            _dict['subscription_account'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Assetsv3SubscriptionVertex from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "duration": obj.get("duration"),
            "end_time": obj.get("end_time"),
            "extended_properties": [Assetsv3CustomProperty.from_dict(_item) for _item in obj["extended_properties"]] if obj.get("extended_properties") is not None else None,
            "name": obj.get("name"),
            "resolution_key": obj.get("resolution_key"),
            "start_time": obj.get("start_time"),
            "subscription_account": [Assetsv3ConnectionEdge.from_dict(_item) for _item in obj["subscription_account"]] if obj.get("subscription_account") is not None else None,
            "subscription_id": obj.get("subscription_id"),
            "type": obj.get("type")
        })
        return _obj


