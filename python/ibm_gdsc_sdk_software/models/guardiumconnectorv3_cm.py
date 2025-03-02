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
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_attribute import Guardiumconnectorv3Attribute
from typing import Optional, Set
from typing_extensions import Self

class Guardiumconnectorv3CM(BaseModel):
    """
    Central Manager definition.
    """ # noqa: E501
    attributes: Optional[List[Guardiumconnectorv3Attribute]] = Field(default=None, description="Central Manager attributes.")
    central_manager_id: Optional[StrictStr] = Field(default=None, description="Central Manager hostname or ip.")
    cm_date_param_available: Optional[StrictStr] = Field(default=None, description="Flag check if CM can handle setting start end date for aggregator dm export.")
    datamart_end_date_aggregator: Optional[StrictStr] = Field(default=None, description="Initial start date for streaming historical datamart from GDP aggregator.")
    datamart_start_date_aggregator: Optional[StrictStr] = Field(default=None, description="Initial start date for streaming historical datamart from GDP aggregator.")
    datamart_start_date_collector: Optional[StrictStr] = Field(default=None, description="Initial start date for streaming historical datamart from GDP.")
    max_supported_dm_version: Optional[StrictStr] = None
    mode: Optional[StrictStr] = Field(default=None, description="Flag to determine if GI supports push or pull mode.")
    name: Optional[StrictStr] = Field(default=None, description="Central Manager name.")
    port: Optional[StrictStr] = Field(default=None, description="Port used to communicate with the Central Manager.")
    status: Optional[StrictStr] = Field(default=None, description="Central Manager status.")
    support_custom_dm_type_setup: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["attributes", "central_manager_id", "cm_date_param_available", "datamart_end_date_aggregator", "datamart_start_date_aggregator", "datamart_start_date_collector", "max_supported_dm_version", "mode", "name", "port", "status", "support_custom_dm_type_setup"]

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
        """Create an instance of Guardiumconnectorv3CM from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in attributes (list)
        _items = []
        if self.attributes:
            for _item in self.attributes:
                if _item:
                    _items.append(_item.to_dict())
            _dict['attributes'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Guardiumconnectorv3CM from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "attributes": [Guardiumconnectorv3Attribute.from_dict(_item) for _item in obj["attributes"]] if obj.get("attributes") is not None else None,
            "central_manager_id": obj.get("central_manager_id"),
            "cm_date_param_available": obj.get("cm_date_param_available"),
            "datamart_end_date_aggregator": obj.get("datamart_end_date_aggregator"),
            "datamart_start_date_aggregator": obj.get("datamart_start_date_aggregator"),
            "datamart_start_date_collector": obj.get("datamart_start_date_collector"),
            "max_supported_dm_version": obj.get("max_supported_dm_version"),
            "mode": obj.get("mode"),
            "name": obj.get("name"),
            "port": obj.get("port"),
            "status": obj.get("status"),
            "support_custom_dm_type_setup": obj.get("support_custom_dm_type_setup")
        })
        return _obj


