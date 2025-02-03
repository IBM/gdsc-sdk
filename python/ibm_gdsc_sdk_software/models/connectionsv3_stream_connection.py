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

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_software.models.connectionsv3_status import Connectionsv3Status
from typing import Optional, Set
from typing_extensions import Self

class Connectionsv3StreamConnection(BaseModel):
    """
    Structure for AWS/Azure Connection.
    """ # noqa: E501
    account_id: Optional[StrictStr] = Field(default=None, description="Account id.")
    account_name: Optional[StrictStr] = Field(default=None, description="Account name.")
    cluster_resource_id: Optional[StrictStr] = Field(default=None, description="Cluster resource ID.")
    consumer_group_name: Optional[StrictStr] = Field(default=None, description="Consumer group name.")
    db_dns_endpoint: Optional[StrictStr] = Field(default=None, description="Database DNS endpoint OR Database host.")
    db_name: Optional[StrictStr] = Field(default=None, description="Database name.")
    db_type: Optional[StrictStr] = Field(default=None, description="Database type.")
    name: Optional[StrictStr] = Field(default=None, description="Event Hub name || Stream name.")
    namespace: Optional[StrictStr] = Field(default=None, description="Optional: Namespace provided if the coonnection type is Azure.")
    password: Optional[StrictStr] = Field(default=None, description="Database credential password.")
    port: Optional[StrictStr] = Field(default=None, description="Port.")
    provider: Optional[StrictStr] = Field(default=None, description="Optional: the provider provided if the coonnection type is Azure.")
    region: Optional[StrictStr] = Field(default=None, description="Optional: the region provided if the coonnection type is AWS.")
    start_monitor: Optional[StrictStr] = Field(default=None, description="Connection Monitoring.")
    status: Optional[Connectionsv3Status] = None
    status_text: Optional[StrictStr] = Field(default=None, description="If status is not OK, details what's wrong (non-localized).")
    status_timestamp: Optional[StrictStr] = Field(default=None, description="The time stamp of status.")
    storage_connection_string: Optional[StrictStr] = Field(default=None, description="Optional: Storage connection string must be proovided if the coonnection type is Azure.")
    username: Optional[StrictStr] = Field(default=None, description="Database credential username.")
    __properties: ClassVar[List[str]] = ["account_id", "account_name", "cluster_resource_id", "consumer_group_name", "db_dns_endpoint", "db_name", "db_type", "name", "namespace", "password", "port", "provider", "region", "start_monitor", "status", "status_text", "status_timestamp", "storage_connection_string", "username"]

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
        """Create an instance of Connectionsv3StreamConnection from a JSON string"""
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
        """Create an instance of Connectionsv3StreamConnection from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "account_id": obj.get("account_id"),
            "account_name": obj.get("account_name"),
            "cluster_resource_id": obj.get("cluster_resource_id"),
            "consumer_group_name": obj.get("consumer_group_name"),
            "db_dns_endpoint": obj.get("db_dns_endpoint"),
            "db_name": obj.get("db_name"),
            "db_type": obj.get("db_type"),
            "name": obj.get("name"),
            "namespace": obj.get("namespace"),
            "password": obj.get("password"),
            "port": obj.get("port"),
            "provider": obj.get("provider"),
            "region": obj.get("region"),
            "start_monitor": obj.get("start_monitor"),
            "status": obj.get("status"),
            "status_text": obj.get("status_text"),
            "status_timestamp": obj.get("status_timestamp"),
            "storage_connection_string": obj.get("storage_connection_string"),
            "username": obj.get("username")
        })
        return _obj


