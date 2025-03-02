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
from ibm_gdsc_sdk_saas.models.healthcollectorv3_general_details_object import Healthcollectorv3GeneralDetailsObject
from ibm_gdsc_sdk_saas.models.healthcollectorv3_inspection_engine_details_gdp import Healthcollectorv3InspectionEngineDetailsGdp
from ibm_gdsc_sdk_saas.models.healthcollectorv3_stap_live_info_object import Healthcollectorv3StapLiveInfoObject
from typing import Optional, Set
from typing_extensions import Self

class Healthcollectorv3StapDetailsObjectGdp(BaseModel):
    """
    StapDetailsObject gets additional information about S-TAPs.
    """ # noqa: E501
    connectivity_details: Optional[Healthcollectorv3GeneralDetailsObject] = None
    general_err_messages: Optional[List[StrictStr]] = Field(default=None, description="General error messages of the S-TAP.")
    ktap_details: Optional[Healthcollectorv3GeneralDetailsObject] = None
    stap_liveliness_info: Optional[Healthcollectorv3StapLiveInfoObject] = None
    stap_ver_info_list: Optional[List[Healthcollectorv3InspectionEngineDetailsGdp]] = Field(default=None, description="Inspection engine details of the S-TAP.")
    traffic_details: Optional[Healthcollectorv3GeneralDetailsObject] = None
    __properties: ClassVar[List[str]] = ["connectivity_details", "general_err_messages", "ktap_details", "stap_liveliness_info", "stap_ver_info_list", "traffic_details"]

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
        """Create an instance of Healthcollectorv3StapDetailsObjectGdp from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of connectivity_details
        if self.connectivity_details:
            _dict['connectivity_details'] = self.connectivity_details.to_dict()
        # override the default output from pydantic by calling `to_dict()` of ktap_details
        if self.ktap_details:
            _dict['ktap_details'] = self.ktap_details.to_dict()
        # override the default output from pydantic by calling `to_dict()` of stap_liveliness_info
        if self.stap_liveliness_info:
            _dict['stap_liveliness_info'] = self.stap_liveliness_info.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in stap_ver_info_list (list)
        _items = []
        if self.stap_ver_info_list:
            for _item in self.stap_ver_info_list:
                if _item:
                    _items.append(_item.to_dict())
            _dict['stap_ver_info_list'] = _items
        # override the default output from pydantic by calling `to_dict()` of traffic_details
        if self.traffic_details:
            _dict['traffic_details'] = self.traffic_details.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Healthcollectorv3StapDetailsObjectGdp from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "connectivity_details": Healthcollectorv3GeneralDetailsObject.from_dict(obj["connectivity_details"]) if obj.get("connectivity_details") is not None else None,
            "general_err_messages": obj.get("general_err_messages"),
            "ktap_details": Healthcollectorv3GeneralDetailsObject.from_dict(obj["ktap_details"]) if obj.get("ktap_details") is not None else None,
            "stap_liveliness_info": Healthcollectorv3StapLiveInfoObject.from_dict(obj["stap_liveliness_info"]) if obj.get("stap_liveliness_info") is not None else None,
            "stap_ver_info_list": [Healthcollectorv3InspectionEngineDetailsGdp.from_dict(_item) for _item in obj["stap_ver_info_list"]] if obj.get("stap_ver_info_list") is not None else None,
            "traffic_details": Healthcollectorv3GeneralDetailsObject.from_dict(obj["traffic_details"]) if obj.get("traffic_details") is not None else None
        })
        return _obj


