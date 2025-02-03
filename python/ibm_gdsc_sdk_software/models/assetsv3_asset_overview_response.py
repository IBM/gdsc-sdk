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

from pydantic import BaseModel, ConfigDict, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.assetsv3_asset_classification import Assetsv3AssetClassification
from ibm_gdsc_sdk_software.models.assetsv3_asset_control import Assetsv3AssetControl
from ibm_gdsc_sdk_software.models.assetsv3_asset_endpoint import Assetsv3AssetEndpoint
from ibm_gdsc_sdk_software.models.assetsv3_asset_information import Assetsv3AssetInformation
from ibm_gdsc_sdk_software.models.assetsv3_asset_resources_info import Assetsv3AssetResourcesInfo
from ibm_gdsc_sdk_software.models.assetsv3_asset_risk_events import Assetsv3AssetRiskEvents
from ibm_gdsc_sdk_software.models.assetsv3_asset_subscription import Assetsv3AssetSubscription
from ibm_gdsc_sdk_software.models.assetsv3_asset_tags import Assetsv3AssetTags
from ibm_gdsc_sdk_software.models.assetsv3_asset_va import Assetsv3AssetVa
from ibm_gdsc_sdk_software.models.assetsv3_extended_prop import Assetsv3ExtendedProp
from ibm_gdsc_sdk_software.models.assetsv3_model_application import Assetsv3ModelApplication
from ibm_gdsc_sdk_software.models.assetsv3_model_data import Assetsv3ModelData
from ibm_gdsc_sdk_software.models.assetsv3_overview_parameter import Assetsv3OverviewParameter
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3AssetOverviewResponse(BaseModel):
    """
    Assetsv3AssetOverviewResponse
    """ # noqa: E501
    asset_classification: Optional[Assetsv3AssetClassification] = None
    asset_control: Optional[Assetsv3AssetControl] = None
    asset_endpoints: Optional[List[Assetsv3AssetEndpoint]] = None
    asset_information: Optional[Assetsv3AssetInformation] = None
    asset_resource: Optional[Assetsv3AssetResourcesInfo] = None
    asset_risk_events: Optional[Assetsv3AssetRiskEvents] = None
    asset_subscriptions: Optional[List[Assetsv3AssetSubscription]] = None
    asset_tags: Optional[List[Assetsv3AssetTags]] = None
    asset_va: Optional[Assetsv3AssetVa] = None
    dropdown_flag: Optional[StrictInt] = None
    entity_type: Optional[StrictStr] = None
    extended_properties: Optional[List[Assetsv3ExtendedProp]] = None
    model_application: Optional[List[Assetsv3ModelApplication]] = None
    model_data: Optional[List[Assetsv3ModelData]] = None
    overview_parameters: Optional[List[Assetsv3OverviewParameter]] = None
    __properties: ClassVar[List[str]] = ["asset_classification", "asset_control", "asset_endpoints", "asset_information", "asset_resource", "asset_risk_events", "asset_subscriptions", "asset_tags", "asset_va", "dropdown_flag", "entity_type", "extended_properties", "model_application", "model_data", "overview_parameters"]

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
        """Create an instance of Assetsv3AssetOverviewResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of asset_classification
        if self.asset_classification:
            _dict['asset_classification'] = self.asset_classification.to_dict()
        # override the default output from pydantic by calling `to_dict()` of asset_control
        if self.asset_control:
            _dict['asset_control'] = self.asset_control.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in asset_endpoints (list)
        _items = []
        if self.asset_endpoints:
            for _item in self.asset_endpoints:
                if _item:
                    _items.append(_item.to_dict())
            _dict['asset_endpoints'] = _items
        # override the default output from pydantic by calling `to_dict()` of asset_information
        if self.asset_information:
            _dict['asset_information'] = self.asset_information.to_dict()
        # override the default output from pydantic by calling `to_dict()` of asset_resource
        if self.asset_resource:
            _dict['asset_resource'] = self.asset_resource.to_dict()
        # override the default output from pydantic by calling `to_dict()` of asset_risk_events
        if self.asset_risk_events:
            _dict['asset_risk_events'] = self.asset_risk_events.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in asset_subscriptions (list)
        _items = []
        if self.asset_subscriptions:
            for _item in self.asset_subscriptions:
                if _item:
                    _items.append(_item.to_dict())
            _dict['asset_subscriptions'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in asset_tags (list)
        _items = []
        if self.asset_tags:
            for _item in self.asset_tags:
                if _item:
                    _items.append(_item.to_dict())
            _dict['asset_tags'] = _items
        # override the default output from pydantic by calling `to_dict()` of asset_va
        if self.asset_va:
            _dict['asset_va'] = self.asset_va.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in extended_properties (list)
        _items = []
        if self.extended_properties:
            for _item in self.extended_properties:
                if _item:
                    _items.append(_item.to_dict())
            _dict['extended_properties'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in model_application (list)
        _items = []
        if self.model_application:
            for _item in self.model_application:
                if _item:
                    _items.append(_item.to_dict())
            _dict['model_application'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in model_data (list)
        _items = []
        if self.model_data:
            for _item in self.model_data:
                if _item:
                    _items.append(_item.to_dict())
            _dict['model_data'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in overview_parameters (list)
        _items = []
        if self.overview_parameters:
            for _item in self.overview_parameters:
                if _item:
                    _items.append(_item.to_dict())
            _dict['overview_parameters'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Assetsv3AssetOverviewResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "asset_classification": Assetsv3AssetClassification.from_dict(obj["asset_classification"]) if obj.get("asset_classification") is not None else None,
            "asset_control": Assetsv3AssetControl.from_dict(obj["asset_control"]) if obj.get("asset_control") is not None else None,
            "asset_endpoints": [Assetsv3AssetEndpoint.from_dict(_item) for _item in obj["asset_endpoints"]] if obj.get("asset_endpoints") is not None else None,
            "asset_information": Assetsv3AssetInformation.from_dict(obj["asset_information"]) if obj.get("asset_information") is not None else None,
            "asset_resource": Assetsv3AssetResourcesInfo.from_dict(obj["asset_resource"]) if obj.get("asset_resource") is not None else None,
            "asset_risk_events": Assetsv3AssetRiskEvents.from_dict(obj["asset_risk_events"]) if obj.get("asset_risk_events") is not None else None,
            "asset_subscriptions": [Assetsv3AssetSubscription.from_dict(_item) for _item in obj["asset_subscriptions"]] if obj.get("asset_subscriptions") is not None else None,
            "asset_tags": [Assetsv3AssetTags.from_dict(_item) for _item in obj["asset_tags"]] if obj.get("asset_tags") is not None else None,
            "asset_va": Assetsv3AssetVa.from_dict(obj["asset_va"]) if obj.get("asset_va") is not None else None,
            "dropdown_flag": obj.get("dropdown_flag"),
            "entity_type": obj.get("entity_type"),
            "extended_properties": [Assetsv3ExtendedProp.from_dict(_item) for _item in obj["extended_properties"]] if obj.get("extended_properties") is not None else None,
            "model_application": [Assetsv3ModelApplication.from_dict(_item) for _item in obj["model_application"]] if obj.get("model_application") is not None else None,
            "model_data": [Assetsv3ModelData.from_dict(_item) for _item in obj["model_data"]] if obj.get("model_data") is not None else None,
            "overview_parameters": [Assetsv3OverviewParameter.from_dict(_item) for _item in obj["overview_parameters"]] if obj.get("overview_parameters") is not None else None
        })
        return _obj


