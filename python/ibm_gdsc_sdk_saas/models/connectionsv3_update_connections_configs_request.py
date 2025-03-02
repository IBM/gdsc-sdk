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

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.connectionsv3_connector_type import Connectionsv3ConnectorType
from ibm_gdsc_sdk_saas.models.connectionsv3_stream_connection_config import Connectionsv3StreamConnectionConfig
from ibm_gdsc_sdk_saas.models.connectionsv3_uc_connection_config import Connectionsv3UCConnectionConfig
from typing import Optional, Set
from typing_extensions import Self

class Connectionsv3UpdateConnectionsConfigsRequest(BaseModel):
    """
    Request parameters for update connection.
    """ # noqa: E501
    stream_connection_configs: Optional[List[Connectionsv3StreamConnectionConfig]] = Field(default=None, description="Optional: list of streaming connections.")
    type: Optional[Connectionsv3ConnectorType] = None
    uc_connection_configs: Optional[List[Connectionsv3UCConnectionConfig]] = Field(default=None, description="Optional: list of UC connections.")
    __properties: ClassVar[List[str]] = ["stream_connection_configs", "type", "uc_connection_configs"]

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
        """Create an instance of Connectionsv3UpdateConnectionsConfigsRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in stream_connection_configs (list)
        _items = []
        if self.stream_connection_configs:
            for _item in self.stream_connection_configs:
                if _item:
                    _items.append(_item.to_dict())
            _dict['stream_connection_configs'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in uc_connection_configs (list)
        _items = []
        if self.uc_connection_configs:
            for _item in self.uc_connection_configs:
                if _item:
                    _items.append(_item.to_dict())
            _dict['uc_connection_configs'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Connectionsv3UpdateConnectionsConfigsRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "stream_connection_configs": [Connectionsv3StreamConnectionConfig.from_dict(_item) for _item in obj["stream_connection_configs"]] if obj.get("stream_connection_configs") is not None else None,
            "type": obj.get("type"),
            "uc_connection_configs": [Connectionsv3UCConnectionConfig.from_dict(_item) for _item in obj["uc_connection_configs"]] if obj.get("uc_connection_configs") is not None else None
        })
        return _obj


