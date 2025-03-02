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

from pydantic import BaseModel, ConfigDict, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.qsdataloaderv3_q_sfile_validator_external_param_request import Qsdataloaderv3QSfileValidatorExternalParamRequest
from typing import Optional, Set
from typing_extensions import Self

class Qsdataloaderv3QSfileValidatorRequest(BaseModel):
    """
    Qsdataloaderv3QSfileValidatorRequest
    """ # noqa: E501
    external_param: Optional[Qsdataloaderv3QSfileValidatorExternalParamRequest] = None
    org_id: Optional[StrictStr] = None
    plugin_id: Optional[StrictStr] = None
    run_for_all_scans: Optional[StrictBool] = None
    scan_desc: Optional[StrictStr] = None
    scan_id: Optional[StrictStr] = None
    user_email: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["external_param", "org_id", "plugin_id", "run_for_all_scans", "scan_desc", "scan_id", "user_email"]

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
        """Create an instance of Qsdataloaderv3QSfileValidatorRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of external_param
        if self.external_param:
            _dict['external_param'] = self.external_param.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Qsdataloaderv3QSfileValidatorRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "external_param": Qsdataloaderv3QSfileValidatorExternalParamRequest.from_dict(obj["external_param"]) if obj.get("external_param") is not None else None,
            "org_id": obj.get("org_id"),
            "plugin_id": obj.get("plugin_id"),
            "run_for_all_scans": obj.get("run_for_all_scans"),
            "scan_desc": obj.get("scan_desc"),
            "scan_id": obj.get("scan_id"),
            "user_email": obj.get("user_email")
        })
        return _obj


