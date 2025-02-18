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
from ibm_gdsc_sdk_software.models.healthcollectorv3_mu_details_obj import Healthcollectorv3MUDetailsObj
from ibm_gdsc_sdk_software.models.healthcollectorv3_stap_object import Healthcollectorv3StapObject
from typing import Optional, Set
from typing_extensions import Self

class Healthcollectorv3ManagedUnitObject(BaseModel):
    """
    ManagedUnitObject gets information about managed units.
    """ # noqa: E501
    aggregation_health_status: Optional[StrictInt] = Field(default=None, description="Aggregation health status.")
    connectivity: Optional[StrictInt] = Field(default=None, description="Connectivity status.")
    details: Optional[Healthcollectorv3MUDetailsObj] = None
    exports_to: Optional[List[StrictStr]] = Field(default=None, description="Aggregator the collector exports data to.")
    imports_from: Optional[List[StrictStr]] = Field(default=None, description="Collectors the aggregator imports data from.")
    os_version: Optional[StrictStr] = Field(default=None, description="Operating system version.")
    overall_stap_status_for_mu: Optional[StrictInt] = Field(default=None, description="Overall status of S-TAPs for the system.")
    overall_status: Optional[StrictInt] = Field(default=None, description="Overall system status.")
    patch: Optional[StrictStr] = Field(default=None, description="Patch number.")
    staps: Optional[List[Healthcollectorv3StapObject]] = Field(default=None, description="Details of S-TAPs for the system.")
    type: Optional[StrictStr] = Field(default=None, description="Unit type.")
    unit_hostname: Optional[StrictStr] = Field(default=None, description="Name of the Guardium Data Protection system.")
    unit_ip: Optional[StrictStr] = Field(default=None, description="IP address.")
    unit_utilization_health_status: Optional[StrictInt] = Field(default=None, description="Unit utilization status.")
    version: Optional[StrictStr] = Field(default=None, description="Guardium Data Protection version.")
    __properties: ClassVar[List[str]] = ["aggregation_health_status", "connectivity", "details", "exports_to", "imports_from", "os_version", "overall_stap_status_for_mu", "overall_status", "patch", "staps", "type", "unit_hostname", "unit_ip", "unit_utilization_health_status", "version"]

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
        """Create an instance of Healthcollectorv3ManagedUnitObject from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in staps (list)
        _items = []
        if self.staps:
            for _item in self.staps:
                if _item:
                    _items.append(_item.to_dict())
            _dict['staps'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Healthcollectorv3ManagedUnitObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "aggregation_health_status": obj.get("aggregation_health_status"),
            "connectivity": obj.get("connectivity"),
            "details": Healthcollectorv3MUDetailsObj.from_dict(obj["details"]) if obj.get("details") is not None else None,
            "exports_to": obj.get("exports_to"),
            "imports_from": obj.get("imports_from"),
            "os_version": obj.get("os_version"),
            "overall_stap_status_for_mu": obj.get("overall_stap_status_for_mu"),
            "overall_status": obj.get("overall_status"),
            "patch": obj.get("patch"),
            "staps": [Healthcollectorv3StapObject.from_dict(_item) for _item in obj["staps"]] if obj.get("staps") is not None else None,
            "type": obj.get("type"),
            "unit_hostname": obj.get("unit_hostname"),
            "unit_ip": obj.get("unit_ip"),
            "unit_utilization_health_status": obj.get("unit_utilization_health_status"),
            "version": obj.get("version")
        })
        return _obj


