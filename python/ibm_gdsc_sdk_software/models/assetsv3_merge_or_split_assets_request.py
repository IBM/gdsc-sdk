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
from ibm_gdsc_sdk_software.models.assetsv3_asset_for_merge_split import Assetsv3AssetForMergeSplit
from typing import Optional, Set
from typing_extensions import Self

class Assetsv3MergeOrSplitAssetsRequest(BaseModel):
    """
    Assetsv3MergeOrSplitAssetsRequest
    """ # noqa: E501
    action: Optional[StrictStr] = None
    destination_assets: Optional[List[Assetsv3AssetForMergeSplit]] = Field(default=None, description="Assets selected by user to merge with source asset or split from source asset.")
    source_asset: Optional[Assetsv3AssetForMergeSplit] = None
    __properties: ClassVar[List[str]] = ["action", "destination_assets", "source_asset"]

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
        """Create an instance of Assetsv3MergeOrSplitAssetsRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in destination_assets (list)
        _items = []
        if self.destination_assets:
            for _item in self.destination_assets:
                if _item:
                    _items.append(_item.to_dict())
            _dict['destination_assets'] = _items
        # override the default output from pydantic by calling `to_dict()` of source_asset
        if self.source_asset:
            _dict['source_asset'] = self.source_asset.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Assetsv3MergeOrSplitAssetsRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "action": obj.get("action"),
            "destination_assets": [Assetsv3AssetForMergeSplit.from_dict(_item) for _item in obj["destination_assets"]] if obj.get("destination_assets") is not None else None,
            "source_asset": Assetsv3AssetForMergeSplit.from_dict(obj["source_asset"]) if obj.get("source_asset") is not None else None
        })
        return _obj


