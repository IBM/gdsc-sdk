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
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_method_type import Riskanalyticsenginev3MethodType
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_severity_level import Riskanalyticsenginev3SeverityLevel
from typing import Optional, Set
from typing_extensions import Self

class Riskanalyticsenginev3Feature(BaseModel):
    """
    Feature is a pair of key and value.
    """ # noqa: E501
    feature_nls: Optional[StrictStr] = Field(default=None, description="NLS Feature key //upper case.")
    is_observation: Optional[StrictBool] = Field(default=None, description="Is observation flag to let the score service update it if need it.")
    is_zero: Optional[StrictBool] = Field(default=None, description="If value is zero - there is no value or original value so this flag will be true.")
    key: Optional[StrictStr] = Field(default=None, description="Feature key.")
    method_type: Optional[Riskanalyticsenginev3MethodType] = None
    original_value: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Feature value before normalization.")
    score: Optional[StrictInt] = Field(default=None, description="The feature score that was defined by riskApp.")
    sequence: Optional[StrictInt] = Field(default=None, description="Sequence.")
    severity_level: Optional[Riskanalyticsenginev3SeverityLevel] = None
    value: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Feature value.")
    __properties: ClassVar[List[str]] = ["feature_nls", "is_observation", "is_zero", "key", "method_type", "original_value", "score", "sequence", "severity_level", "value"]

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
        """Create an instance of Riskanalyticsenginev3Feature from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Riskanalyticsenginev3Feature from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "feature_nls": obj.get("feature_nls"),
            "is_observation": obj.get("is_observation"),
            "is_zero": obj.get("is_zero"),
            "key": obj.get("key"),
            "method_type": obj.get("method_type"),
            "original_value": obj.get("original_value"),
            "score": obj.get("score"),
            "sequence": obj.get("sequence"),
            "severity_level": obj.get("severity_level"),
            "value": obj.get("value")
        })
        return _obj


