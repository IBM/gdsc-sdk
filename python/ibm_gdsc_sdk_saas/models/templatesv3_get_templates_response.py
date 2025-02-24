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

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.rpc_status import RpcStatus
from ibm_gdsc_sdk_saas.models.templatesv3_template import Templatesv3Template
from typing import Optional, Set
from typing_extensions import Self

class Templatesv3GetTemplatesResponse(BaseModel):
    """
    The templates that match the specified criteria; an empty array is returned if no templates match.
    """ # noqa: E501
    status: Optional[RpcStatus] = None
    template: Optional[List[Templatesv3Template]] = Field(default=None, description="List of templates that match the specified filters.")
    __properties: ClassVar[List[str]] = ["status", "template"]

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
        """Create an instance of Templatesv3GetTemplatesResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of status
        if self.status:
            _dict['status'] = self.status.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in template (list)
        _items = []
        if self.template:
            for _item in self.template:
                if _item:
                    _items.append(_item.to_dict())
            _dict['template'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Templatesv3GetTemplatesResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "status": RpcStatus.from_dict(obj["status"]) if obj.get("status") is not None else None,
            "template": [Templatesv3Template.from_dict(_item) for _item in obj["template"]] if obj.get("template") is not None else None
        })
        return _obj


