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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.healthcollectorv3_inspection_engine_details import Healthcollectorv3InspectionEngineDetails
from ibm_gdsc_sdk_software.models.healthcollectorv3_stap_details_object import Healthcollectorv3StapDetailsObject
from typing import Optional, Set
from typing_extensions import Self

class Healthcollectorv3StapObject(BaseModel):
    """
    StapObject gets information about monitoring agents.
    """ # noqa: E501
    collector_hostname: Optional[StrictStr] = Field(default=None, description="Host name of Guardium Data Protection system.")
    connectivity: Optional[StrictInt] = Field(default=None, description="Connectivity status.")
    details: Optional[Healthcollectorv3StapDetailsObject] = None
    ie_count: Optional[StrictInt] = Field(default=None, description="Count of inspection engines.")
    ie_details: Optional[List[Healthcollectorv3InspectionEngineDetails]] = Field(default=None, description="Details about inspection engines.")
    ktap: Optional[StrictInt] = Field(default=None, description="K-TAP status.")
    name: Optional[StrictStr] = Field(default=None, description="Name of the S-TAP.")
    os_type: Optional[StrictStr] = Field(default=None, description="Operating system.")
    overall_ie_status: Optional[StrictInt] = Field(default=None, description="Overall status of inspection engines.")
    revision: Optional[StrictStr] = Field(default=None, description="Revision.")
    stap_ip: Optional[StrictStr] = Field(default=None, description="IP address.")
    status: Optional[StrictInt] = Field(default=None, description="Overall status.")
    traffic: Optional[StrictInt] = Field(default=None, description="Traffic status.")
    __properties: ClassVar[List[str]] = ["collector_hostname", "connectivity", "details", "ie_count", "ie_details", "ktap", "name", "os_type", "overall_ie_status", "revision", "stap_ip", "status", "traffic"]

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
        """Create an instance of Healthcollectorv3StapObject from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of details
        if self.details:
            _dict['details'] = self.details.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in ie_details (list)
        _items = []
        if self.ie_details:
            for _item in self.ie_details:
                if _item:
                    _items.append(_item.to_dict())
            _dict['ie_details'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Healthcollectorv3StapObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "collector_hostname": obj.get("collector_hostname"),
            "connectivity": obj.get("connectivity"),
            "details": Healthcollectorv3StapDetailsObject.from_dict(obj["details"]) if obj.get("details") is not None else None,
            "ie_count": obj.get("ie_count"),
            "ie_details": [Healthcollectorv3InspectionEngineDetails.from_dict(_item) for _item in obj["ie_details"]] if obj.get("ie_details") is not None else None,
            "ktap": obj.get("ktap"),
            "name": obj.get("name"),
            "os_type": obj.get("os_type"),
            "overall_ie_status": obj.get("overall_ie_status"),
            "revision": obj.get("revision"),
            "stap_ip": obj.get("stap_ip"),
            "status": obj.get("status"),
            "traffic": obj.get("traffic")
        })
        return _obj


