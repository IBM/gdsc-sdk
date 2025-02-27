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
from ibm_gdsc_sdk_saas.models.schedulerv3_recipient_type import Schedulerv3RecipientType
from typing import Optional, Set
from typing_extensions import Self

class Schedulerv3Recipient(BaseModel):
    """
    Recipient includes the receiver data for this job.
    """ # noqa: E501
    integration_id: Optional[StrictStr] = Field(default=None, description="Optional: The integration unique id (configuration object id).")
    label: Optional[StrictStr] = None
    template_id: Optional[StrictStr] = Field(default=None, description="Optional: Id of the template to use when sending e-mail.")
    type: Optional[Schedulerv3RecipientType] = None
    value: Optional[StrictStr] = Field(default=None, description="Who to assign as the report result reviewer.")
    __properties: ClassVar[List[str]] = ["integration_id", "label", "template_id", "type", "value"]

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
        """Create an instance of Schedulerv3Recipient from a JSON string"""
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
        """Create an instance of Schedulerv3Recipient from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "integration_id": obj.get("integration_id"),
            "label": obj.get("label"),
            "template_id": obj.get("template_id"),
            "type": obj.get("type"),
            "value": obj.get("value")
        })
        return _obj


