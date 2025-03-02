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

from pydantic import BaseModel, ConfigDict, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.outliersenginev3_attribute_statistics import Outliersenginev3AttributeStatistics
from ibm_gdsc_sdk_saas.models.outliersenginev3_source_attribute_type import Outliersenginev3SourceAttributeType
from typing import Optional, Set
from typing_extensions import Self

class Outliersenginev3SourceAttributesStatistics(BaseModel):
    """
    Outliersenginev3SourceAttributesStatistics
    """ # noqa: E501
    statistics: Optional[List[Outliersenginev3AttributeStatistics]] = None
    total_number_of_attributes: Optional[StrictInt] = None
    type: Optional[Outliersenginev3SourceAttributeType] = None
    __properties: ClassVar[List[str]] = ["statistics", "total_number_of_attributes", "type"]

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
        """Create an instance of Outliersenginev3SourceAttributesStatistics from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in statistics (list)
        _items = []
        if self.statistics:
            for _item in self.statistics:
                if _item:
                    _items.append(_item.to_dict())
            _dict['statistics'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Outliersenginev3SourceAttributesStatistics from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "statistics": [Outliersenginev3AttributeStatistics.from_dict(_item) for _item in obj["statistics"]] if obj.get("statistics") is not None else None,
            "total_number_of_attributes": obj.get("total_number_of_attributes"),
            "type": obj.get("type")
        })
        return _obj


