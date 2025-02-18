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
from ibm_gdsc_sdk_software.models.assetsv3_before_after import Assetsv3BeforeAfter
from ibm_gdsc_sdk_software.models.assetsv3_rule_log import Assetsv3RuleLog
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3AssetChangeLog(BaseModel):
    """
    Assetsv3AssetChangeLog
    """ # noqa: E501
    action_taken: Optional[StrictStr] = None
    activity: Optional[StrictStr] = None
    after: Optional[List[Assetsv3BeforeAfter]] = None
    before: Optional[List[Assetsv3BeforeAfter]] = None
    var_date: Optional[StrictStr] = Field(default=None, alias="date")
    performed_by: Optional[StrictStr] = None
    rule: Optional[List[Assetsv3RuleLog]] = None
    __properties: ClassVar[List[str]] = ["action_taken", "activity", "after", "before", "date", "performed_by", "rule"]

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
        """Create an instance of Assetsv3AssetChangeLog from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in after (list)
        _items = []
        if self.after:
            for _item in self.after:
                if _item:
                    _items.append(_item.to_dict())
            _dict['after'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in before (list)
        _items = []
        if self.before:
            for _item in self.before:
                if _item:
                    _items.append(_item.to_dict())
            _dict['before'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in rule (list)
        _items = []
        if self.rule:
            for _item in self.rule:
                if _item:
                    _items.append(_item.to_dict())
            _dict['rule'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Assetsv3AssetChangeLog from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "action_taken": obj.get("action_taken"),
            "activity": obj.get("activity"),
            "after": [Assetsv3BeforeAfter.from_dict(_item) for _item in obj["after"]] if obj.get("after") is not None else None,
            "before": [Assetsv3BeforeAfter.from_dict(_item) for _item in obj["before"]] if obj.get("before") is not None else None,
            "date": obj.get("date"),
            "performed_by": obj.get("performed_by"),
            "rule": [Assetsv3RuleLog.from_dict(_item) for _item in obj["rule"]] if obj.get("rule") is not None else None
        })
        return _obj


