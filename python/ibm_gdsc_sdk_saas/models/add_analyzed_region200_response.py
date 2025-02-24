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
from ibm_gdsc_sdk_saas.models.analyzed_region_validation_results import AnalyzedRegionValidationResults
from typing import Optional, Set
from typing_extensions import Self

class AddAnalyzedRegion200Response(BaseModel):
    """
    AddAnalyzedRegion200Response
    """ # noqa: E501
    url: Optional[StrictStr] = None
    user_data: Optional[StrictStr] = Field(default=None, alias="userData")
    image_id: Optional[StrictStr] = Field(default=None, alias="imageId")
    subnet_id: Optional[StrictStr] = Field(default=None, alias="subnetId")
    vpc_id: Optional[StrictStr] = Field(default=None, alias="vpcId")
    availability_zone: Optional[StrictStr] = Field(default=None, alias="availabilityZone")
    installation_script: Optional[StrictStr] = Field(default=None, alias="installationScript")
    validation_results: Optional[AnalyzedRegionValidationResults] = Field(default=None, alias="validationResults")
    __properties: ClassVar[List[str]] = ["url", "userData", "imageId", "subnetId", "vpcId", "availabilityZone", "installationScript", "validationResults"]

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
        """Create an instance of AddAnalyzedRegion200Response from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of validation_results
        if self.validation_results:
            _dict['validationResults'] = self.validation_results.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AddAnalyzedRegion200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "url": obj.get("url"),
            "userData": obj.get("userData"),
            "imageId": obj.get("imageId"),
            "subnetId": obj.get("subnetId"),
            "vpcId": obj.get("vpcId"),
            "availabilityZone": obj.get("availabilityZone"),
            "installationScript": obj.get("installationScript"),
            "validationResults": AnalyzedRegionValidationResults.from_dict(obj["validationResults"]) if obj.get("validationResults") is not None else None
        })
        return _obj


