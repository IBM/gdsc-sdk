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
from ibm_gdsc_sdk_software.models.access_type import AccessType
from typing import Optional, Set
from typing_extensions import Self

class PotentialFlowsFilterOptions(BaseModel):
    """
    PotentialFlowsFilterOptions
    """ # noqa: E501
    ids: Optional[List[StrictStr]] = None
    types: Optional[List[StrictStr]] = None
    source_types: Optional[List[StrictStr]] = Field(default=None, alias="sourceTypes")
    cloud_accounts: Optional[List[StrictStr]] = Field(default=None, alias="cloudAccounts")
    cloud_regions: Optional[List[StrictStr]] = Field(default=None, alias="cloudRegions")
    source_ids: Optional[List[StrictStr]] = Field(default=None, alias="sourceIds")
    destination_ids: Optional[List[StrictStr]] = Field(default=None, alias="destinationIds")
    access_types: Optional[List[AccessType]] = Field(default=None, alias="accessTypes")
    __properties: ClassVar[List[str]] = ["ids", "types", "sourceTypes", "cloudAccounts", "cloudRegions", "sourceIds", "destinationIds", "accessTypes"]

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
        """Create an instance of PotentialFlowsFilterOptions from a JSON string"""
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
        """Create an instance of PotentialFlowsFilterOptions from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ids": obj.get("ids"),
            "types": obj.get("types"),
            "sourceTypes": obj.get("sourceTypes"),
            "cloudAccounts": obj.get("cloudAccounts"),
            "cloudRegions": obj.get("cloudRegions"),
            "sourceIds": obj.get("sourceIds"),
            "destinationIds": obj.get("destinationIds"),
            "accessTypes": obj.get("accessTypes")
        })
        return _obj


