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
from ibm_gdsc_sdk_software.models.assetsv3_extended_prop import Assetsv3ExtendedProp
from ibm_gdsc_sdk_software.models.assetsv3_health_type import Assetsv3HealthType
from ibm_gdsc_sdk_software.models.assetsv3_status_type import Assetsv3StatusType
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3Asset(BaseModel):
    """
    Assetsv3Asset
    """ # noqa: E501
    application_name: Optional[StrictStr] = None
    application_version: Optional[StrictStr] = None
    asset_subtype: Optional[StrictStr] = None
    asset_type: Optional[StrictStr] = None
    connectivity: Optional[Assetsv3HealthType] = None
    critical_va_count: Optional[StrictInt] = None
    database: Optional[StrictStr] = None
    db_id: Optional[StrictStr] = None
    deployment: Optional[StrictStr] = None
    encryption: Optional[Assetsv3StatusType] = None
    endpoint_name: Optional[StrictStr] = None
    entity_id: Optional[StrictStr] = Field(default=None, description="entity ID which was inserted/updated.")
    entity_type: Optional[StrictStr] = None
    extended_properties: Optional[List[Assetsv3ExtendedProp]] = None
    gdp_data_sources: Optional[StrictStr] = None
    grouper_id: Optional[StrictInt] = Field(default=None, description="grouper ID which was grouped assets.")
    host: Optional[StrictStr] = None
    host_id: Optional[StrictStr] = None
    host_port: Optional[StrictStr] = None
    ip: Optional[StrictStr] = None
    ip_port: Optional[StrictStr] = None
    mac_address: Optional[StrictStr] = None
    model_name: Optional[StrictStr] = None
    monitoring: Optional[Assetsv3StatusType] = None
    name: Optional[StrictStr] = None
    origin: Optional[List[StrictStr]] = None
    risk_level: Optional[StrictStr] = None
    sensitive_data: Optional[StrictInt] = None
    service: Optional[StrictStr] = None
    storage_name: Optional[StrictStr] = None
    subscription: Optional[StrictStr] = None
    tags: Optional[List[StrictStr]] = None
    total_va_count: Optional[StrictInt] = None
    traffic: Optional[Assetsv3HealthType] = None
    type: Optional[StrictStr] = None
    user_accounts: Optional[List[StrictStr]] = None
    __properties: ClassVar[List[str]] = ["application_name", "application_version", "asset_subtype", "asset_type", "connectivity", "critical_va_count", "database", "db_id", "deployment", "encryption", "endpoint_name", "entity_id", "entity_type", "extended_properties", "gdp_data_sources", "grouper_id", "host", "host_id", "host_port", "ip", "ip_port", "mac_address", "model_name", "monitoring", "name", "origin", "risk_level", "sensitive_data", "service", "storage_name", "subscription", "tags", "total_va_count", "traffic", "type", "user_accounts"]

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
        """Create an instance of Assetsv3Asset from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Assetsv3Asset from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "application_name": obj.get("application_name"),
            "application_version": obj.get("application_version"),
            "asset_subtype": obj.get("asset_subtype"),
            "asset_type": obj.get("asset_type"),
            "connectivity": obj.get("connectivity"),
            "critical_va_count": obj.get("critical_va_count"),
            "database": obj.get("database"),
            "db_id": obj.get("db_id"),
            "deployment": obj.get("deployment"),
            "encryption": obj.get("encryption"),
            "endpoint_name": obj.get("endpoint_name"),
            "entity_id": obj.get("entity_id"),
            "entity_type": obj.get("entity_type"),
            "extended_properties": [Assetsv3ExtendedProp.from_dict(_item) for _item in obj["extended_properties"]] if obj.get("extended_properties") is not None else None,
            "gdp_data_sources": obj.get("gdp_data_sources"),
            "grouper_id": obj.get("grouper_id"),
            "host": obj.get("host"),
            "host_id": obj.get("host_id"),
            "host_port": obj.get("host_port"),
            "ip": obj.get("ip"),
            "ip_port": obj.get("ip_port"),
            "mac_address": obj.get("mac_address"),
            "model_name": obj.get("model_name"),
            "monitoring": obj.get("monitoring"),
            "name": obj.get("name"),
            "origin": obj.get("origin"),
            "risk_level": obj.get("risk_level"),
            "sensitive_data": obj.get("sensitive_data"),
            "service": obj.get("service"),
            "storage_name": obj.get("storage_name"),
            "subscription": obj.get("subscription"),
            "tags": obj.get("tags"),
            "total_va_count": obj.get("total_va_count"),
            "traffic": obj.get("traffic"),
            "type": obj.get("type"),
            "user_accounts": obj.get("user_accounts")
        })
        return _obj


