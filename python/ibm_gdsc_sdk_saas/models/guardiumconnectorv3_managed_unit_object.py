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
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_mu_details_obj import Guardiumconnectorv3MUDetailsObj
from typing import Optional, Set
from typing_extensions import Self

class Guardiumconnectorv3ManagedUnitObject(BaseModel):
    """
    Information about managed units.
    """ # noqa: E501
    agg_health_status: Optional[StrictInt] = Field(default=None, description="Aggregation health status.")
    connectivity: Optional[StrictInt] = Field(default=None, description="Connectivity status.")
    details: Optional[Guardiumconnectorv3MUDetailsObj] = None
    exports_to: Optional[List[StrictStr]] = Field(default=None, description="Aggregator the Managed Unit exports data to.")
    id: Optional[StrictInt] = Field(default=None, description="ID.")
    imports_from: Optional[List[StrictStr]] = Field(default=None, description="Managed Units the aggregator imports data from.")
    mus_staps_health_status: Optional[StrictInt] = Field(default=None, description="Monitoring agent health status.")
    os_version: Optional[StrictStr] = Field(default=None, description="Operating system version.")
    patch: Optional[StrictStr] = Field(default=None, description="Patch number.")
    status: Optional[StrictInt] = Field(default=None, description="Overall status.")
    type: Optional[StrictStr] = Field(default=None, description="Unit type.")
    unit_hostname: Optional[StrictStr] = Field(default=None, description="Name of the Guardium Data Protection system.")
    unit_ip: Optional[StrictStr] = Field(default=None, description="IP address.")
    unit_utilization_health_status: Optional[StrictInt] = Field(default=None, description="Unit utilization status.")
    version: Optional[StrictStr] = Field(default=None, description="Guardium Data Protection version.")
    __properties: ClassVar[List[str]] = ["agg_health_status", "connectivity", "details", "exports_to", "id", "imports_from", "mus_staps_health_status", "os_version", "patch", "status", "type", "unit_hostname", "unit_ip", "unit_utilization_health_status", "version"]

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
        """Create an instance of Guardiumconnectorv3ManagedUnitObject from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Guardiumconnectorv3ManagedUnitObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "agg_health_status": obj.get("agg_health_status"),
            "connectivity": obj.get("connectivity"),
            "details": Guardiumconnectorv3MUDetailsObj.from_dict(obj["details"]) if obj.get("details") is not None else None,
            "exports_to": obj.get("exports_to"),
            "id": obj.get("id"),
            "imports_from": obj.get("imports_from"),
            "mus_staps_health_status": obj.get("mus_staps_health_status"),
            "os_version": obj.get("os_version"),
            "patch": obj.get("patch"),
            "status": obj.get("status"),
            "type": obj.get("type"),
            "unit_hostname": obj.get("unit_hostname"),
            "unit_ip": obj.get("unit_ip"),
            "unit_utilization_health_status": obj.get("unit_utilization_health_status"),
            "version": obj.get("version")
        })
        return _obj


