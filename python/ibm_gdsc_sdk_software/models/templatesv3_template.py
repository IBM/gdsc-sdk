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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.templatesv3_integration import Templatesv3Integration
from ibm_gdsc_sdk_software.models.templatesv3_mime_type import Templatesv3MIMEType
from ibm_gdsc_sdk_software.models.templatesv3_origin import Templatesv3Origin
from ibm_gdsc_sdk_software.models.templatesv3_simple_recipient import Templatesv3SimpleRecipient
from typing import Optional, Set
from typing_extensions import Self

class Templatesv3Template(BaseModel):
    """
    The contents of a specific template.
    """ # noqa: E501
    content: Optional[StrictStr] = Field(default=None, description="Content of the message with field substitution sequences.")
    default_recipient: Optional[Templatesv3SimpleRecipient] = None
    integration: Optional[Templatesv3Integration] = None
    integration_id: Optional[StrictStr] = Field(default=None, description="Integration ID specifies the specific integration this template is associated.")
    integration_name: Optional[StrictStr] = Field(default=None, description="Name associated with the integration; optionally added based on need and performance.")
    is_default: Optional[StrictBool] = Field(default=None, description="Specifies the default template for the associated data source.")
    is_enabled: Optional[StrictBool] = Field(default=None, description="Enabled defines the set of templates that are actively used.")
    mime_type: Optional[Templatesv3MIMEType] = None
    name: Optional[StrictStr] = Field(default=None, description="User friendly name associated with the template.")
    order: Optional[StrictInt] = Field(default=None, description="Order by most significant origin.")
    origin: Optional[Templatesv3Origin] = None
    tags: Optional[List[StrictStr]] = Field(default=None, description="User defined tags that can be used to filter templates.")
    template_id: Optional[StrictStr] = Field(default=None, description="Template unique ID.")
    title: Optional[StrictStr] = Field(default=None, description="Title is a brief summary of the data; may be empty based on integration type.")
    __properties: ClassVar[List[str]] = ["content", "default_recipient", "integration", "integration_id", "integration_name", "is_default", "is_enabled", "mime_type", "name", "order", "origin", "tags", "template_id", "title"]

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
        """Create an instance of Templatesv3Template from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of default_recipient
        if self.default_recipient:
            _dict['default_recipient'] = self.default_recipient.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Templatesv3Template from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "content": obj.get("content"),
            "default_recipient": Templatesv3SimpleRecipient.from_dict(obj["default_recipient"]) if obj.get("default_recipient") is not None else None,
            "integration": obj.get("integration"),
            "integration_id": obj.get("integration_id"),
            "integration_name": obj.get("integration_name"),
            "is_default": obj.get("is_default"),
            "is_enabled": obj.get("is_enabled"),
            "mime_type": obj.get("mime_type"),
            "name": obj.get("name"),
            "order": obj.get("order"),
            "origin": obj.get("origin"),
            "tags": obj.get("tags"),
            "template_id": obj.get("template_id"),
            "title": obj.get("title")
        })
        return _obj


