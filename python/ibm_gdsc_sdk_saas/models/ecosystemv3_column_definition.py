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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.ecosystemv3_data_type import Ecosystemv3DataType
from typing import Optional, Set
from typing_extensions import Self

class Ecosystemv3ColumnDefinition(BaseModel):
    """
    ColumnDefinition defines a column in database.
    """ # noqa: E501
    allow_null: Optional[StrictBool] = Field(default=None, description="If null is allowed.")
    column_id: Optional[StrictInt] = Field(default=None, description="The id of the column.")
    column_name: Optional[StrictStr] = Field(default=None, description="The name of the column.")
    column_size: Optional[StrictStr] = Field(default=None, description="Data size of the column.")
    column_type: Optional[Ecosystemv3DataType] = None
    unique: Optional[StrictBool] = Field(default=None, description="If the column is unique.")
    __properties: ClassVar[List[str]] = ["allow_null", "column_id", "column_name", "column_size", "column_type", "unique"]

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
        """Create an instance of Ecosystemv3ColumnDefinition from a JSON string"""
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
        """Create an instance of Ecosystemv3ColumnDefinition from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "allow_null": obj.get("allow_null"),
            "column_id": obj.get("column_id"),
            "column_name": obj.get("column_name"),
            "column_size": obj.get("column_size"),
            "column_type": obj.get("column_type"),
            "unique": obj.get("unique")
        })
        return _obj


