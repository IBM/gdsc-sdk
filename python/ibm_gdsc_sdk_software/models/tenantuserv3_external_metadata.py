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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.tenantuserv3_prometheus import Tenantuserv3Prometheus
from typing import Optional, Set
from typing_extensions import Self

class Tenantuserv3ExternalMetadata(BaseModel):
    """
    ExternalMetadata external metadata.
    """ # noqa: E501
    add_ons: Optional[Dict[str, Tenantuserv3Prometheus]] = Field(default=None, description="Add ons.")
    crn: Optional[StrictStr] = None
    expiration_date: Optional[datetime] = None
    instance_id: Optional[StrictStr] = Field(default=None, description="Instance id.")
    part_number: Optional[StrictStr] = Field(default=None, description="Part number.")
    plan_id: Optional[StrictStr] = Field(default=None, description="Plan id.")
    service_id: Optional[StrictStr] = Field(default=None, description="Service id.")
    subscription_id: Optional[StrictStr] = Field(default=None, description="Subscription id.")
    __properties: ClassVar[List[str]] = ["add_ons", "crn", "expiration_date", "instance_id", "part_number", "plan_id", "service_id", "subscription_id"]

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
        """Create an instance of Tenantuserv3ExternalMetadata from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each value in add_ons (dict)
        _field_dict = {}
        if self.add_ons:
            for _key in self.add_ons:
                if self.add_ons[_key]:
                    _field_dict[_key] = self.add_ons[_key].to_dict()
            _dict['add_ons'] = _field_dict
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Tenantuserv3ExternalMetadata from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "add_ons": dict(
                (_k, Tenantuserv3Prometheus.from_dict(_v))
                for _k, _v in obj["add_ons"].items()
            )
            if obj.get("add_ons") is not None
            else None,
            "crn": obj.get("crn"),
            "expiration_date": obj.get("expiration_date"),
            "instance_id": obj.get("instance_id"),
            "part_number": obj.get("part_number"),
            "plan_id": obj.get("plan_id"),
            "service_id": obj.get("service_id"),
            "subscription_id": obj.get("subscription_id")
        })
        return _obj


