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
from typing import Optional, Set
from typing_extensions import Self

class Guardiumconnectorv3ConfigureAggregatorExportRequest(BaseModel):
    """
    ConfigureAggExportRequest definition.
    """ # noqa: E501
    central_manager_id: Optional[StrictStr] = Field(default=None, description="Central Manager ID.")
    datamart_end_date_aggregator: Optional[StrictStr] = Field(default=None, description="End date for aggregator datamart export.")
    datamart_start_date_aggregator: Optional[StrictStr] = Field(default=None, description="Start date for aggregator datamart export.")
    managed_units: Optional[List[StrictStr]] = Field(default=None, description="List of managed units to which apply the dm export start/end dates.")
    skip_historical_datamarts: Optional[StrictBool] = Field(default=None, description="Flag to either skip or include historical datamarts as part of configure streaming API.")
    update_central_manager: Optional[StrictBool] = Field(default=None, description="Flag to update the cm record with date ranges.")
    __properties: ClassVar[List[str]] = ["central_manager_id", "datamart_end_date_aggregator", "datamart_start_date_aggregator", "managed_units", "skip_historical_datamarts", "update_central_manager"]

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
        """Create an instance of Guardiumconnectorv3ConfigureAggregatorExportRequest from a JSON string"""
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
        """Create an instance of Guardiumconnectorv3ConfigureAggregatorExportRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "central_manager_id": obj.get("central_manager_id"),
            "datamart_end_date_aggregator": obj.get("datamart_end_date_aggregator"),
            "datamart_start_date_aggregator": obj.get("datamart_start_date_aggregator"),
            "managed_units": obj.get("managed_units"),
            "skip_historical_datamarts": obj.get("skip_historical_datamarts"),
            "update_central_manager": obj.get("update_central_manager")
        })
        return _obj


