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
from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_connectivity_state import Universalconnectormanagerv3ConnectivityState
from typing import Optional, Set
from typing_extensions import Self

class Universalconnectormanagerv3ConnectionStatus(BaseModel):
    """
    An object that describes the Connectivity status of this connection.
    """ # noqa: E501
    status: Optional[Universalconnectormanagerv3ConnectivityState] = None
    status_text: Optional[StrictStr] = Field(default=None, description="If status is not OK, details what's wrong (non-localized).")
    timestamp: Optional[datetime] = Field(default=None, description="Datetime of status.")
    timestamp_last_ok: Optional[datetime] = Field(default=None, description="Datetime of previous OK status.")
    __properties: ClassVar[List[str]] = ["status", "status_text", "timestamp", "timestamp_last_ok"]

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
        """Create an instance of Universalconnectormanagerv3ConnectionStatus from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Universalconnectormanagerv3ConnectionStatus from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "status": obj.get("status"),
            "status_text": obj.get("status_text"),
            "timestamp": obj.get("timestamp"),
            "timestamp_last_ok": obj.get("timestamp_last_ok")
        })
        return _obj


