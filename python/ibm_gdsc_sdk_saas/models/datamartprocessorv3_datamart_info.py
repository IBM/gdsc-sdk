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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from ibm_gdsc_sdk_saas.models.datamartprocessorv3_datamart_file_info import Datamartprocessorv3DatamartFileInfo
from typing import Optional, Set
from typing_extensions import Self

class Datamartprocessorv3DatamartInfo(BaseModel):
    """
    DatamartInfo is the object containing all info of a datamart.
    """ # noqa: E501
    current_ts: Optional[datetime] = Field(default=None, description="Timestamp in UTC when the entry was made.")
    data_type: Optional[StrictStr] = Field(default=None, description="Type of datamart.")
    error: Optional[StrictStr] = Field(default=None, description="Errors if any.")
    export_record_count: Optional[StrictInt] = Field(default=None, description="Total records exported from GDP.")
    export_status: Optional[StrictInt] = Field(default=None, description="Export status of datamart.")
    failure_file_count: Optional[StrictInt] = Field(default=None, description="Total failed files in a datamart.")
    files: Optional[List[Datamartprocessorv3DatamartFileInfo]] = Field(default=None, description="File info inside a datamart.")
    gdp_hostname: Optional[StrictStr] = Field(default=None, description="GDP hostname.")
    ingest_record_count: Optional[StrictInt] = Field(default=None, description="Total numbers of records ingested for this datamart.")
    ingest_status: Optional[StrictInt] = Field(default=None, description="Ingest status of datamart.")
    ingestion_id: Optional[StrictStr] = Field(default=None, description="Ingestion id.")
    period_end: Optional[datetime] = Field(default=None, description="Wnding time period of data in datamart.")
    period_start: Optional[datetime] = Field(default=None, description="Starting time period of data in datamart.")
    success_file_count: Optional[StrictInt] = Field(default=None, description="Total successful files in a datamart.")
    total_file_count: Optional[StrictInt] = Field(default=None, description="Total file count inside a datamart.")
    __properties: ClassVar[List[str]] = ["current_ts", "data_type", "error", "export_record_count", "export_status", "failure_file_count", "files", "gdp_hostname", "ingest_record_count", "ingest_status", "ingestion_id", "period_end", "period_start", "success_file_count", "total_file_count"]

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
        """Create an instance of Datamartprocessorv3DatamartInfo from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in files (list)
        _items = []
        if self.files:
            for _item in self.files:
                if _item:
                    _items.append(_item.to_dict())
            _dict['files'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Datamartprocessorv3DatamartInfo from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "current_ts": obj.get("current_ts"),
            "data_type": obj.get("data_type"),
            "error": obj.get("error"),
            "export_record_count": obj.get("export_record_count"),
            "export_status": obj.get("export_status"),
            "failure_file_count": obj.get("failure_file_count"),
            "files": [Datamartprocessorv3DatamartFileInfo.from_dict(_item) for _item in obj["files"]] if obj.get("files") is not None else None,
            "gdp_hostname": obj.get("gdp_hostname"),
            "ingest_record_count": obj.get("ingest_record_count"),
            "ingest_status": obj.get("ingest_status"),
            "ingestion_id": obj.get("ingestion_id"),
            "period_end": obj.get("period_end"),
            "period_start": obj.get("period_start"),
            "success_file_count": obj.get("success_file_count"),
            "total_file_count": obj.get("total_file_count")
        })
        return _obj


