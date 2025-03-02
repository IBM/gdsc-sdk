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
from ibm_gdsc_sdk_saas.models.connectionsv3_plugin_record import Connectionsv3PluginRecord
from typing import Optional, Set
from typing_extensions import Self

class Connectionsv3CreatePluginRequest(BaseModel):
    """
    Connectionsv3CreatePluginRequest
    """ # noqa: E501
    datasource_type: Optional[StrictStr] = None
    developer_name: Optional[StrictStr] = None
    document_link: Optional[StrictStr] = None
    logfile: Optional[StrictStr] = None
    name: Optional[StrictStr] = None
    readme: Optional[StrictStr] = None
    records: Optional[List[Connectionsv3PluginRecord]] = None
    supported_inputs: Optional[List[StrictStr]] = None
    version: Optional[StrictStr] = None
    version_tested: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["datasource_type", "developer_name", "document_link", "logfile", "name", "readme", "records", "supported_inputs", "version", "version_tested"]

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
        """Create an instance of Connectionsv3CreatePluginRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in records (list)
        _items = []
        if self.records:
            for _item in self.records:
                if _item:
                    _items.append(_item.to_dict())
            _dict['records'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Connectionsv3CreatePluginRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "datasource_type": obj.get("datasource_type"),
            "developer_name": obj.get("developer_name"),
            "document_link": obj.get("document_link"),
            "logfile": obj.get("logfile"),
            "name": obj.get("name"),
            "readme": obj.get("readme"),
            "records": [Connectionsv3PluginRecord.from_dict(_item) for _item in obj["records"]] if obj.get("records") is not None else None,
            "supported_inputs": obj.get("supported_inputs"),
            "version": obj.get("version"),
            "version_tested": obj.get("version_tested")
        })
        return _obj


