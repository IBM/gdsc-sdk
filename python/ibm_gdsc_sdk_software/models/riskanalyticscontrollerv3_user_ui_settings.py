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

from pydantic import BaseModel, ConfigDict, Field, StrictBool
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_card_settings import Riskanalyticscontrollerv3CardSettings
from typing import Optional, Set
from typing_extensions import Self

class Riskanalyticscontrollerv3UserUISettings(BaseModel):
    """
    UserUISettings an object contains settings per user to display in the UI.
    """ # noqa: E501
    card_settings: Optional[List[Riskanalyticscontrollerv3CardSettings]] = Field(default=None, description="A list of card settings for each view(box) of risks.")
    show_banner: Optional[StrictBool] = Field(default=None, description="Show_banner a flag to show additional info in the top of screen or to hide it.")
    __properties: ClassVar[List[str]] = ["card_settings", "show_banner"]

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
        """Create an instance of Riskanalyticscontrollerv3UserUISettings from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in card_settings (list)
        _items = []
        if self.card_settings:
            for _item in self.card_settings:
                if _item:
                    _items.append(_item.to_dict())
            _dict['card_settings'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Riskanalyticscontrollerv3UserUISettings from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "card_settings": [Riskanalyticscontrollerv3CardSettings.from_dict(_item) for _item in obj["card_settings"]] if obj.get("card_settings") is not None else None,
            "show_banner": obj.get("show_banner")
        })
        return _obj


