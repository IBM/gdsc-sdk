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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.riskanalyticsenginev3_lead_generator_config_param_value import Riskanalyticsenginev3LeadGeneratorConfigParamValue
from typing import Optional, Set
from typing_extensions import Self

class Riskanalyticsenginev3LeadGeneratorConfig(BaseModel):
    """
    LeadGeneratorConfig holds the configuration of a lead generator.
    """ # noqa: E501
    is_active: Optional[StrictBool] = Field(default=None, description="Is the lead generator set to active or inactive.")
    lead_generator_name: Optional[StrictStr] = Field(default=None, description="Name of the lead generator.")
    lead_generator_params: Optional[List[Riskanalyticsenginev3LeadGeneratorConfigParamValue]] = Field(default=None, description="The parameters to update for this lead generator.")
    __properties: ClassVar[List[str]] = ["is_active", "lead_generator_name", "lead_generator_params"]

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
        """Create an instance of Riskanalyticsenginev3LeadGeneratorConfig from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in lead_generator_params (list)
        _items = []
        if self.lead_generator_params:
            for _item in self.lead_generator_params:
                if _item:
                    _items.append(_item.to_dict())
            _dict['lead_generator_params'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Riskanalyticsenginev3LeadGeneratorConfig from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "is_active": obj.get("is_active"),
            "lead_generator_name": obj.get("lead_generator_name"),
            "lead_generator_params": [Riskanalyticsenginev3LeadGeneratorConfigParamValue.from_dict(_item) for _item in obj["lead_generator_params"]] if obj.get("lead_generator_params") is not None else None
        })
        return _obj


