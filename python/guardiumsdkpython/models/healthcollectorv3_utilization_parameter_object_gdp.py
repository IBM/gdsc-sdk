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

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Healthcollectorv3UtilizationParameterObjectGdp(BaseModel):
    """
    UnitUtilizationParameterObject gets information about unit utilization.
    """ # noqa: E501
    analyzer_queue_value: Optional[StrictInt] = Field(default=None, description="Analyzer queue value.")
    error_messages_code: Optional[StrictInt] = Field(default=None, description="Error message.")
    error_messages_value: Optional[StrictStr] = Field(default=None, description="Detailed error message.")
    free_buff_space_value: Optional[StrictInt] = Field(default=None, description="Free buffer space value.")
    logger_queue_value: Optional[StrictInt] = Field(default=None, description="Logger queue value.")
    mysql_disk_usage_value: Optional[StrictInt] = Field(default=None, description="MySQL Disk usage.")
    no_of_restarts_value: Optional[StrictInt] = Field(default=None, description="Number of restarts.")
    num_of_exceptions_value: Optional[StrictInt] = Field(default=None, description="Number of exceptions.")
    num_of_flat_log_requests_value: Optional[StrictInt] = Field(default=None, description="Flat log requests value.")
    num_of_policy_violations_value: Optional[StrictInt] = Field(default=None, description="Number of policy violations.")
    num_of_requests_value: Optional[StrictInt] = Field(default=None, description="Number of requests.")
    prec_mysql_mem_value: Optional[StrictInt] = Field(default=None, description="MySQL memory value.")
    snif_memory_value: Optional[StrictInt] = Field(default=None, description="Sniffer memory value.")
    sys_var_disk_usage_value: Optional[StrictInt] = Field(default=None, description="System var disk usage value.")
    system_cpu_load_value: Optional[StrictInt] = Field(default=None, description="CPU load value.")
    __properties: ClassVar[List[str]] = ["analyzer_queue_value", "error_messages_code", "error_messages_value", "free_buff_space_value", "logger_queue_value", "mysql_disk_usage_value", "no_of_restarts_value", "num_of_exceptions_value", "num_of_flat_log_requests_value", "num_of_policy_violations_value", "num_of_requests_value", "prec_mysql_mem_value", "snif_memory_value", "sys_var_disk_usage_value", "system_cpu_load_value"]

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
        """Create an instance of Healthcollectorv3UtilizationParameterObjectGdp from a JSON string"""
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
        """Create an instance of Healthcollectorv3UtilizationParameterObjectGdp from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "analyzer_queue_value": obj.get("analyzer_queue_value"),
            "error_messages_code": obj.get("error_messages_code"),
            "error_messages_value": obj.get("error_messages_value"),
            "free_buff_space_value": obj.get("free_buff_space_value"),
            "logger_queue_value": obj.get("logger_queue_value"),
            "mysql_disk_usage_value": obj.get("mysql_disk_usage_value"),
            "no_of_restarts_value": obj.get("no_of_restarts_value"),
            "num_of_exceptions_value": obj.get("num_of_exceptions_value"),
            "num_of_flat_log_requests_value": obj.get("num_of_flat_log_requests_value"),
            "num_of_policy_violations_value": obj.get("num_of_policy_violations_value"),
            "num_of_requests_value": obj.get("num_of_requests_value"),
            "prec_mysql_mem_value": obj.get("prec_mysql_mem_value"),
            "snif_memory_value": obj.get("snif_memory_value"),
            "sys_var_disk_usage_value": obj.get("sys_var_disk_usage_value"),
            "system_cpu_load_value": obj.get("system_cpu_load_value")
        })
        return _obj


