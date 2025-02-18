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

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt
from typing import Any, ClassVar, Dict, List, Optional, Union
from ibm_gdsc_sdk_software.models.sensitivity_summary import SensitivitySummary
from ibm_gdsc_sdk_software.models.vulnerabilities_criticality_count_inner import VulnerabilitiesCriticalityCountInner
from typing import Optional, Set
from typing_extensions import Self

class DataStoreStats(BaseModel):
    """
    DataStoreStats
    """ # noqa: E501
    resources_count: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="resourcesCount")
    app_flows_count: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="appFlowsCount")
    config_flows_count: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="configFlowsCount")
    sensitivities_count: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="sensitivitiesCount")
    user_access_count: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="number of users entitled to access the data store", alias="userAccessCount")
    sensitivities_summary: Optional[List[SensitivitySummary]] = Field(default=None, alias="sensitivitiesSummary")
    vulnerabilities_summary: Optional[List[VulnerabilitiesCriticalityCountInner]] = Field(default=None, alias="vulnerabilitiesSummary")
    __properties: ClassVar[List[str]] = ["resourcesCount", "appFlowsCount", "configFlowsCount", "sensitivitiesCount", "userAccessCount", "sensitivitiesSummary", "vulnerabilitiesSummary"]

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
        """Create an instance of DataStoreStats from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in sensitivities_summary (list)
        _items = []
        if self.sensitivities_summary:
            for _item in self.sensitivities_summary:
                if _item:
                    _items.append(_item.to_dict())
            _dict['sensitivitiesSummary'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in vulnerabilities_summary (list)
        _items = []
        if self.vulnerabilities_summary:
            for _item in self.vulnerabilities_summary:
                if _item:
                    _items.append(_item.to_dict())
            _dict['vulnerabilitiesSummary'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of DataStoreStats from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "resourcesCount": obj.get("resourcesCount"),
            "appFlowsCount": obj.get("appFlowsCount"),
            "configFlowsCount": obj.get("configFlowsCount"),
            "sensitivitiesCount": obj.get("sensitivitiesCount"),
            "userAccessCount": obj.get("userAccessCount"),
            "sensitivitiesSummary": [SensitivitySummary.from_dict(_item) for _item in obj["sensitivitiesSummary"]] if obj.get("sensitivitiesSummary") is not None else None,
            "vulnerabilitiesSummary": [VulnerabilitiesCriticalityCountInner.from_dict(_item) for _item in obj["vulnerabilitiesSummary"]] if obj.get("vulnerabilitiesSummary") is not None else None
        })
        return _obj


