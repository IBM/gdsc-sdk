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

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Union
from ibm_gdsc_sdk_saas.models.access_type import AccessType
from ibm_gdsc_sdk_saas.models.cloud_account_details import CloudAccountDetails
from typing import Optional, Set
from typing_extensions import Self

class PermissionsConfigurations(BaseModel):
    """
    PermissionsConfigurations
    """ # noqa: E501
    permissions_configurations_id: StrictStr = Field(alias="permissionsConfigurationsId")
    permissions_configurations_name: StrictStr = Field(alias="permissionsConfigurationsName")
    permissions_configurations_url: StrictStr = Field(alias="permissionsConfigurationsUrl")
    permissions_configurations_type: StrictStr = Field(alias="permissionsConfigurationsType")
    assigned_via_id: StrictStr = Field(alias="assignedViaId")
    assigned_via_name: StrictStr = Field(alias="assignedViaName")
    assigned_via_url: StrictStr = Field(alias="assignedViaUrl")
    assigned_via_type: StrictStr = Field(alias="assignedViaType")
    assigned_to: Union[StrictFloat, StrictInt] = Field(alias="assignedTo")
    cloud_account_details: CloudAccountDetails = Field(alias="cloudAccountDetails")
    permissions: List[AccessType]
    __properties: ClassVar[List[str]] = ["permissionsConfigurationsId", "permissionsConfigurationsName", "permissionsConfigurationsUrl", "permissionsConfigurationsType", "assignedViaId", "assignedViaName", "assignedViaUrl", "assignedViaType", "assignedTo", "cloudAccountDetails", "permissions"]

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
        """Create an instance of PermissionsConfigurations from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of cloud_account_details
        if self.cloud_account_details:
            _dict['cloudAccountDetails'] = self.cloud_account_details.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PermissionsConfigurations from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "permissionsConfigurationsId": obj.get("permissionsConfigurationsId"),
            "permissionsConfigurationsName": obj.get("permissionsConfigurationsName"),
            "permissionsConfigurationsUrl": obj.get("permissionsConfigurationsUrl"),
            "permissionsConfigurationsType": obj.get("permissionsConfigurationsType"),
            "assignedViaId": obj.get("assignedViaId"),
            "assignedViaName": obj.get("assignedViaName"),
            "assignedViaUrl": obj.get("assignedViaUrl"),
            "assignedViaType": obj.get("assignedViaType"),
            "assignedTo": obj.get("assignedTo"),
            "cloudAccountDetails": CloudAccountDetails.from_dict(obj["cloudAccountDetails"]) if obj.get("cloudAccountDetails") is not None else None,
            "permissions": obj.get("permissions")
        })
        return _obj


