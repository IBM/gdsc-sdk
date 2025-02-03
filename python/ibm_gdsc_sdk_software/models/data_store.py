# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

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
from ibm_gdsc_sdk_software.models.classification_status import ClassificationStatus
from ibm_gdsc_sdk_software.models.cloud_account_details import CloudAccountDetails
from ibm_gdsc_sdk_software.models.data_store_encryption_status import DataStoreEncryptionStatus
from ibm_gdsc_sdk_software.models.data_store_source import DataStoreSource
from ibm_gdsc_sdk_software.models.data_store_stats import DataStoreStats
from ibm_gdsc_sdk_software.models.string_key_value import StringKeyValue
from typing import Optional, Set
from typing_extensions import Self

class DataStore(BaseModel):
    """
    DataStore
    """ # noqa: E501
    data_store_id: StrictStr = Field(alias="dataStoreId")
    data_store_type: StrictStr = Field(alias="dataStoreType")
    data_store_name: StrictStr = Field(alias="dataStoreName")
    cloud_account_details: CloudAccountDetails = Field(alias="cloudAccountDetails")
    cloud_region: Optional[StrictStr] = Field(default=None, alias="cloudRegion")
    country: Optional[StrictStr] = None
    classification_status: Optional[ClassificationStatus] = Field(default=None, alias="classificationStatus")
    encryption_status: Optional[DataStoreEncryptionStatus] = Field(default=None, alias="encryptionStatus")
    custom_data: Optional[List[StringKeyValue]] = Field(default=None, alias="customData")
    label: Optional[StrictStr] = None
    data_custodian: Optional[StrictStr] = Field(default=None, alias="dataCustodian")
    cloud_tags: Optional[List[StringKeyValue]] = Field(default=None, alias="cloudTags")
    is_backed_up: Optional[StrictBool] = Field(default=None, alias="isBackedUp")
    managed: Optional[StrictBool] = None
    vpc_id: Optional[StrictStr] = Field(default=None, alias="vpcId")
    stats: Optional[DataStoreStats] = None
    source: Optional[DataStoreSource] = None
    data_store_url: Optional[StrictStr] = Field(default=None, alias="dataStoreUrl")
    classification_error_message: Optional[StrictStr] = Field(default=None, alias="classificationErrorMessage")
    last_classification_date: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="lastClassificationDate")
    unsupported_reason: Optional[StrictStr] = Field(default=None, alias="unsupportedReason")
    __properties: ClassVar[List[str]] = ["dataStoreId", "dataStoreType", "dataStoreName", "cloudAccountDetails", "cloudRegion", "country", "classificationStatus", "encryptionStatus", "customData", "label", "dataCustodian", "cloudTags", "isBackedUp", "managed", "vpcId", "stats", "source", "dataStoreUrl", "classificationErrorMessage", "lastClassificationDate", "unsupportedReason"]

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
        """Create an instance of DataStore from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of cloud_account_details
        if self.cloud_account_details:
            _dict['cloudAccountDetails'] = self.cloud_account_details.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in custom_data (list)
        _items = []
        if self.custom_data:
            for _item in self.custom_data:
                if _item:
                    _items.append(_item.to_dict())
            _dict['customData'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in cloud_tags (list)
        _items = []
        if self.cloud_tags:
            for _item in self.cloud_tags:
                if _item:
                    _items.append(_item.to_dict())
            _dict['cloudTags'] = _items
        # override the default output from pydantic by calling `to_dict()` of stats
        if self.stats:
            _dict['stats'] = self.stats.to_dict()
        # override the default output from pydantic by calling `to_dict()` of source
        if self.source:
            _dict['source'] = self.source.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of DataStore from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "dataStoreId": obj.get("dataStoreId"),
            "dataStoreType": obj.get("dataStoreType"),
            "dataStoreName": obj.get("dataStoreName"),
            "cloudAccountDetails": CloudAccountDetails.from_dict(obj["cloudAccountDetails"]) if obj.get("cloudAccountDetails") is not None else None,
            "cloudRegion": obj.get("cloudRegion"),
            "country": obj.get("country"),
            "classificationStatus": obj.get("classificationStatus"),
            "encryptionStatus": obj.get("encryptionStatus"),
            "customData": [StringKeyValue.from_dict(_item) for _item in obj["customData"]] if obj.get("customData") is not None else None,
            "label": obj.get("label"),
            "dataCustodian": obj.get("dataCustodian"),
            "cloudTags": [StringKeyValue.from_dict(_item) for _item in obj["cloudTags"]] if obj.get("cloudTags") is not None else None,
            "isBackedUp": obj.get("isBackedUp"),
            "managed": obj.get("managed"),
            "vpcId": obj.get("vpcId"),
            "stats": DataStoreStats.from_dict(obj["stats"]) if obj.get("stats") is not None else None,
            "source": DataStoreSource.from_dict(obj["source"]) if obj.get("source") is not None else None,
            "dataStoreUrl": obj.get("dataStoreUrl"),
            "classificationErrorMessage": obj.get("classificationErrorMessage"),
            "lastClassificationDate": obj.get("lastClassificationDate"),
            "unsupportedReason": obj.get("unsupportedReason")
        })
        return _obj


