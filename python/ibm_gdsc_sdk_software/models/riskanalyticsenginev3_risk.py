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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.riskanalyticsenginev3_classification_details import Riskanalyticsenginev3ClassificationDetails
from ibm_gdsc_sdk_software.models.riskanalyticsenginev3_feature_set import Riskanalyticsenginev3FeatureSet
from ibm_gdsc_sdk_software.models.riskanalyticsenginev3_lead import Riskanalyticsenginev3Lead
from ibm_gdsc_sdk_software.models.riskanalyticsenginev3_pivot import Riskanalyticsenginev3Pivot
from ibm_gdsc_sdk_software.models.riskanalyticsenginev3_severity_level import Riskanalyticsenginev3SeverityLevel
from typing import Optional, Set
from typing_extensions import Self

class Riskanalyticsenginev3Risk(BaseModel):
    """
    Riskanalyticsenginev3Risk
    """ # noqa: E501
    classification_details: Optional[Riskanalyticsenginev3ClassificationDetails] = None
    creation_time: Optional[datetime] = Field(default=None, description="The risk creation time in format YYYY-MM-DDTHH:mm:ss.sssZ.")
    end_time: Optional[datetime] = Field(default=None, description="The leads end time in format YYYY-MM-DDTHH:mm:ss.sssZ.")
    feature_sets: Optional[List[Riskanalyticsenginev3FeatureSet]] = Field(default=None, description="The risk features (scores).")
    id: Optional[StrictStr] = Field(default=None, description="The risk id.")
    is_emerging: Optional[StrictBool] = None
    leads: Optional[List[Riskanalyticsenginev3Lead]] = Field(default=None, description="The risk leads.")
    pivot: Optional[Riskanalyticsenginev3Pivot] = None
    score: Optional[StrictInt] = Field(default=None, description="The risk score.")
    severity_level: Optional[Riskanalyticsenginev3SeverityLevel] = None
    start_time: Optional[datetime] = Field(default=None, description="The leads start time in format YYYY-MM-DDTHH:mm:ss.sssZ.")
    __properties: ClassVar[List[str]] = ["classification_details", "creation_time", "end_time", "feature_sets", "id", "is_emerging", "leads", "pivot", "score", "severity_level", "start_time"]

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
        """Create an instance of Riskanalyticsenginev3Risk from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of classification_details
        if self.classification_details:
            _dict['classification_details'] = self.classification_details.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in feature_sets (list)
        _items = []
        if self.feature_sets:
            for _item in self.feature_sets:
                if _item:
                    _items.append(_item.to_dict())
            _dict['feature_sets'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in leads (list)
        _items = []
        if self.leads:
            for _item in self.leads:
                if _item:
                    _items.append(_item.to_dict())
            _dict['leads'] = _items
        # override the default output from pydantic by calling `to_dict()` of pivot
        if self.pivot:
            _dict['pivot'] = self.pivot.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Riskanalyticsenginev3Risk from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "classification_details": Riskanalyticsenginev3ClassificationDetails.from_dict(obj["classification_details"]) if obj.get("classification_details") is not None else None,
            "creation_time": obj.get("creation_time"),
            "end_time": obj.get("end_time"),
            "feature_sets": [Riskanalyticsenginev3FeatureSet.from_dict(_item) for _item in obj["feature_sets"]] if obj.get("feature_sets") is not None else None,
            "id": obj.get("id"),
            "is_emerging": obj.get("is_emerging"),
            "leads": [Riskanalyticsenginev3Lead.from_dict(_item) for _item in obj["leads"]] if obj.get("leads") is not None else None,
            "pivot": Riskanalyticsenginev3Pivot.from_dict(obj["pivot"]) if obj.get("pivot") is not None else None,
            "score": obj.get("score"),
            "severity_level": obj.get("severity_level"),
            "start_time": obj.get("start_time")
        })
        return _obj


