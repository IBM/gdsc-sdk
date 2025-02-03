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
from ibm_gdsc_sdk_software.models.analyzed_region import AnalyzedRegion
from ibm_gdsc_sdk_software.models.environment import Environment
from ibm_gdsc_sdk_software.models.installation_status import InstallationStatus
from ibm_gdsc_sdk_software.models.service_provider import ServiceProvider
from typing import Optional, Set
from typing_extensions import Self

class LinkedAccounts(BaseModel):
    """
    LinkedAccounts
    """ # noqa: E501
    cloud_account_id: StrictStr = Field(alias="cloudAccountId")
    cloud_account_name: StrictStr = Field(alias="cloudAccountName")
    is_main_cloud_account: StrictBool = Field(alias="isMainCloudAccount")
    installation_status: InstallationStatus = Field(alias="installationStatus")
    service_provider: ServiceProvider = Field(alias="serviceProvider")
    region_availability: Optional[Dict[str, StrictBool]] = Field(default=None, alias="regionAvailability")
    regions: List[AnalyzedRegion]
    creation_time: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="creationTime")
    environment: Optional[Environment] = None
    __properties: ClassVar[List[str]] = ["cloudAccountId", "cloudAccountName", "isMainCloudAccount", "installationStatus", "serviceProvider", "regionAvailability", "regions", "creationTime", "environment"]

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
        """Create an instance of LinkedAccounts from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of installation_status
        if self.installation_status:
            _dict['installationStatus'] = self.installation_status.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in regions (list)
        _items = []
        if self.regions:
            for _item in self.regions:
                if _item:
                    _items.append(_item.to_dict())
            _dict['regions'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of LinkedAccounts from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "cloudAccountId": obj.get("cloudAccountId"),
            "cloudAccountName": obj.get("cloudAccountName"),
            "isMainCloudAccount": obj.get("isMainCloudAccount"),
            "installationStatus": InstallationStatus.from_dict(obj["installationStatus"]) if obj.get("installationStatus") is not None else None,
            "serviceProvider": obj.get("serviceProvider"),
            "regionAvailability": obj.get("regionAvailability"),
            "regions": [AnalyzedRegion.from_dict(_item) for _item in obj["regions"]] if obj.get("regions") is not None else None,
            "creationTime": obj.get("creationTime"),
            "environment": obj.get("environment")
        })
        return _obj


