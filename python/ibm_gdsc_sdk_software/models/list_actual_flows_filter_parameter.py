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
from ibm_gdsc_sdk_software.models.cloud_service_provider import CloudServiceProvider
from ibm_gdsc_sdk_software.models.comparator import Comparator
from typing import Optional, Set
from typing_extensions import Self

class ListActualFlowsFilterParameter(BaseModel):
    """
    ListActualFlowsFilterParameter
    """ # noqa: E501
    source_ids: Optional[List[StrictStr]] = Field(default=None, alias="sourceIds")
    source_types: Optional[List[StrictStr]] = Field(default=None, alias="sourceTypes")
    source_cloud_account_ids: Optional[List[StrictStr]] = Field(default=None, alias="sourceCloudAccountIds")
    source_cloud_regions: Optional[List[StrictStr]] = Field(default=None, alias="sourceCloudRegions")
    source_cloud_providers: Optional[List[CloudServiceProvider]] = Field(default=None, alias="sourceCloudProviders")
    destination_ids: Optional[List[StrictStr]] = Field(default=None, alias="destinationIds")
    destination_types: Optional[List[StrictStr]] = Field(default=None, alias="destinationTypes")
    destination_cloud_account_ids: Optional[List[StrictStr]] = Field(default=None, alias="destinationCloudAccountIds")
    destination_cloud_regions: Optional[List[StrictStr]] = Field(default=None, alias="destinationCloudRegions")
    destination_cloud_providers: Optional[List[CloudServiceProvider]] = Field(default=None, alias="destinationCloudProviders")
    access_types: Optional[List[AccessType]] = Field(default=None, alias="accessTypes")
    last_seen: Optional[Comparator] = Field(default=None, alias="lastSeen")
    first_seen: Optional[Comparator] = Field(default=None, alias="firstSeen")
    __properties: ClassVar[List[str]] = ["sourceIds", "sourceTypes", "sourceCloudAccountIds", "sourceCloudRegions", "sourceCloudProviders", "destinationIds", "destinationTypes", "destinationCloudAccountIds", "destinationCloudRegions", "destinationCloudProviders", "accessTypes", "lastSeen", "firstSeen"]

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
        """Create an instance of ListActualFlowsFilterParameter from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of last_seen
        if self.last_seen:
            _dict['lastSeen'] = self.last_seen.to_dict()
        # override the default output from pydantic by calling `to_dict()` of first_seen
        if self.first_seen:
            _dict['firstSeen'] = self.first_seen.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ListActualFlowsFilterParameter from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "sourceIds": obj.get("sourceIds"),
            "sourceTypes": obj.get("sourceTypes"),
            "sourceCloudAccountIds": obj.get("sourceCloudAccountIds"),
            "sourceCloudRegions": obj.get("sourceCloudRegions"),
            "sourceCloudProviders": obj.get("sourceCloudProviders"),
            "destinationIds": obj.get("destinationIds"),
            "destinationTypes": obj.get("destinationTypes"),
            "destinationCloudAccountIds": obj.get("destinationCloudAccountIds"),
            "destinationCloudRegions": obj.get("destinationCloudRegions"),
            "destinationCloudProviders": obj.get("destinationCloudProviders"),
            "accessTypes": obj.get("accessTypes"),
            "lastSeen": Comparator.from_dict(obj["lastSeen"]) if obj.get("lastSeen") is not None else None,
            "firstSeen": Comparator.from_dict(obj["firstSeen"]) if obj.get("firstSeen") is not None else None
        })
        return _obj


