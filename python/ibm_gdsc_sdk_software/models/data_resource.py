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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from ibm_gdsc_sdk_software.models.data_resource_stats import DataResourceStats
from typing import Optional, Set
from typing_extensions import Self

class DataResource(BaseModel):
    """
    DataResource
    """ # noqa: E501
    data_resource_id: StrictStr = Field(alias="dataResourceId")
    data_resource_name: StrictStr = Field(alias="dataResourceName")
    data_store_id: StrictStr = Field(alias="dataStoreId")
    data_resource_type: StrictStr = Field(alias="dataResourceType")
    data_resource_owner: Optional[StrictStr] = Field(default=None, alias="dataResourceOwner")
    size_in_bytes: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="sizeInBytes")
    size_formatted: Optional[StrictStr] = Field(default=None, alias="sizeFormatted")
    creation_time: Optional[StrictStr] = Field(default=None, alias="creationTime")
    modification_time: Optional[StrictStr] = Field(default=None, alias="modificationTime")
    is_reviewed: Optional[StrictBool] = Field(default=None, alias="isReviewed")
    link: Optional[StrictStr] = None
    stats: Optional[DataResourceStats] = None
    __properties: ClassVar[List[str]] = ["dataResourceId", "dataResourceName", "dataStoreId", "dataResourceType", "dataResourceOwner", "sizeInBytes", "sizeFormatted", "creationTime", "modificationTime", "isReviewed", "link", "stats"]

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
        """Create an instance of DataResource from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of stats
        if self.stats:
            _dict['stats'] = self.stats.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of DataResource from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "dataResourceId": obj.get("dataResourceId"),
            "dataResourceName": obj.get("dataResourceName"),
            "dataStoreId": obj.get("dataStoreId"),
            "dataResourceType": obj.get("dataResourceType"),
            "dataResourceOwner": obj.get("dataResourceOwner"),
            "sizeInBytes": obj.get("sizeInBytes"),
            "sizeFormatted": obj.get("sizeFormatted"),
            "creationTime": obj.get("creationTime"),
            "modificationTime": obj.get("modificationTime"),
            "isReviewed": obj.get("isReviewed"),
            "link": obj.get("link"),
            "stats": DataResourceStats.from_dict(obj["stats"]) if obj.get("stats") is not None else None
        })
        return _obj


