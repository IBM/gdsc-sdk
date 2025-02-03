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

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List
from guardiumsdkpython.models.cloud_account_details import CloudAccountDetails
from guardiumsdkpython.models.cloud_service_provider import CloudServiceProvider
from guardiumsdkpython.models.sensitivity_summary import SensitivitySummary
from typing import Optional, Set
from typing_extensions import Self

class VendorSummary(BaseModel):
    """
    VendorSummary
    """ # noqa: E501
    customer_account_details: CloudAccountDetails = Field(alias="customerAccountDetails")
    sensitivities_summary: List[SensitivitySummary] = Field(alias="sensitivitiesSummary")
    cloud_provider: CloudServiceProvider = Field(alias="cloudProvider")
    __properties: ClassVar[List[str]] = ["customerAccountDetails", "sensitivitiesSummary", "cloudProvider"]

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
        """Create an instance of VendorSummary from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of customer_account_details
        if self.customer_account_details:
            _dict['customerAccountDetails'] = self.customer_account_details.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in sensitivities_summary (list)
        _items = []
        if self.sensitivities_summary:
            for _item in self.sensitivities_summary:
                if _item:
                    _items.append(_item.to_dict())
            _dict['sensitivitiesSummary'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of VendorSummary from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "customerAccountDetails": CloudAccountDetails.from_dict(obj["customerAccountDetails"]) if obj.get("customerAccountDetails") is not None else None,
            "sensitivitiesSummary": [SensitivitySummary.from_dict(_item) for _item in obj["sensitivitiesSummary"]] if obj.get("sensitivitiesSummary") is not None else None,
            "cloudProvider": obj.get("cloudProvider")
        })
        return _obj


