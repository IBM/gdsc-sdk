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

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from ibm_gdsc_sdk_software.models.compliance import Compliance
from ibm_gdsc_sdk_software.models.vulnerability_affected_data_store_filter_options import VulnerabilityAffectedDataStoreFilterOptions
from ibm_gdsc_sdk_software.models.vulnerability_criticality import VulnerabilityCriticality
from ibm_gdsc_sdk_software.models.vulnerability_status_type import VulnerabilityStatusType
from ibm_gdsc_sdk_software.models.vulnerability_status_type_family import VulnerabilityStatusTypeFamily
from ibm_gdsc_sdk_software.models.vulnerability_threat_category import VulnerabilityThreatCategory
from ibm_gdsc_sdk_software.models.vulnerability_type import VulnerabilityType
from typing import Optional, Set
from typing_extensions import Self

class VulnerabilitiesByDataStoreFilterOptions(BaseModel):
    """
    VulnerabilitiesByDataStoreFilterOptions
    """ # noqa: E501
    vulnerability_types: Optional[List[VulnerabilityType]] = Field(default=None, alias="vulnerabilityTypes")
    criticalities: Optional[List[VulnerabilityCriticality]] = None
    threats: Optional[List[StrictStr]] = None
    compliance: Optional[List[Compliance]] = None
    threat_categories: Optional[List[VulnerabilityThreatCategory]] = Field(default=None, alias="threatCategories")
    affected_data_store: Optional[VulnerabilityAffectedDataStoreFilterOptions] = Field(default=None, alias="affectedDataStore")
    status_types: Optional[List[VulnerabilityStatusType]] = Field(default=None, alias="statusTypes")
    status_type_families: Optional[List[VulnerabilityStatusTypeFamily]] = Field(default=None, alias="statusTypeFamilies")
    discovered_since: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="as epoch timestamp", alias="discoveredSince")
    sensitive_tags: Optional[List[StrictStr]] = Field(default=None, alias="sensitiveTags")
    compliances: Optional[List[Compliance]] = None
    __properties: ClassVar[List[str]] = ["vulnerabilityTypes", "criticalities", "threats", "compliance", "threatCategories", "affectedDataStore", "statusTypes", "statusTypeFamilies", "discoveredSince", "sensitiveTags", "compliances"]

    @field_validator('threats')
    def threats_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        for i in value:
            if i not in set(['Data Leakage', 'Ransomware', 'Compliance Violation', 'Malware', 'External Sharing']):
                raise ValueError("each list item must be one of ('Data Leakage', 'Ransomware', 'Compliance Violation', 'Malware', 'External Sharing')")
        return value

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
        """Create an instance of VulnerabilitiesByDataStoreFilterOptions from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of affected_data_store
        if self.affected_data_store:
            _dict['affectedDataStore'] = self.affected_data_store.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of VulnerabilitiesByDataStoreFilterOptions from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "vulnerabilityTypes": obj.get("vulnerabilityTypes"),
            "criticalities": obj.get("criticalities"),
            "threats": obj.get("threats"),
            "compliance": obj.get("compliance"),
            "threatCategories": obj.get("threatCategories"),
            "affectedDataStore": VulnerabilityAffectedDataStoreFilterOptions.from_dict(obj["affectedDataStore"]) if obj.get("affectedDataStore") is not None else None,
            "statusTypes": obj.get("statusTypes"),
            "statusTypeFamilies": obj.get("statusTypeFamilies"),
            "discoveredSince": obj.get("discoveredSince"),
            "sensitiveTags": obj.get("sensitiveTags"),
            "compliances": obj.get("compliances")
        })
        return _obj


