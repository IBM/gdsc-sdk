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

from pydantic import BaseModel, ConfigDict, Field, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
from guardiumsdkpython.models.outliersenginev3_analysis_statistics_message import Outliersenginev3AnalysisStatisticsMessage
from guardiumsdkpython.models.outliersenginev3_outliers_stats import Outliersenginev3OutliersStats
from guardiumsdkpython.models.outliersenginev3_queue_statistics_message import Outliersenginev3QueueStatisticsMessage
from guardiumsdkpython.models.outliersenginev3_sources_stats import Outliersenginev3SourcesStats
from guardiumsdkpython.models.rpc_status import RpcStatus
from typing import Optional, Set
from typing_extensions import Self

class Outliersenginev3StatisticsResponse(BaseModel):
    """
    StatisticsResponse is the message for the result from getStatistics.
    """ # noqa: E501
    analysis_statistics: Optional[Outliersenginev3AnalysisStatisticsMessage] = None
    number_of_clusters: Optional[StrictInt] = Field(default=None, description="Number of clusters.")
    number_of_completed_periods: Optional[StrictInt] = Field(default=None, description="Number of completed periods.")
    number_of_outliers_details: Optional[StrictInt] = Field(default=None, description="Number of outliers in details table.")
    number_of_outliers_summary: Optional[StrictInt] = Field(default=None, description="Number of outliers in summary table.")
    number_of_sources: Optional[StrictInt] = Field(default=None, description="Number of sources.")
    number_of_uncompleted_periods: Optional[StrictInt] = Field(default=None, description="Number of uncompleted periods.")
    outliers_stats: Optional[Outliersenginev3OutliersStats] = None
    queue_statistics: Optional[Outliersenginev3QueueStatisticsMessage] = None
    sources_stats: Optional[Outliersenginev3SourcesStats] = None
    status: Optional[RpcStatus] = None
    __properties: ClassVar[List[str]] = ["analysis_statistics", "number_of_clusters", "number_of_completed_periods", "number_of_outliers_details", "number_of_outliers_summary", "number_of_sources", "number_of_uncompleted_periods", "outliers_stats", "queue_statistics", "sources_stats", "status"]

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
        """Create an instance of Outliersenginev3StatisticsResponse from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of analysis_statistics
        if self.analysis_statistics:
            _dict['analysis_statistics'] = self.analysis_statistics.to_dict()
        # override the default output from pydantic by calling `to_dict()` of outliers_stats
        if self.outliers_stats:
            _dict['outliers_stats'] = self.outliers_stats.to_dict()
        # override the default output from pydantic by calling `to_dict()` of queue_statistics
        if self.queue_statistics:
            _dict['queue_statistics'] = self.queue_statistics.to_dict()
        # override the default output from pydantic by calling `to_dict()` of sources_stats
        if self.sources_stats:
            _dict['sources_stats'] = self.sources_stats.to_dict()
        # override the default output from pydantic by calling `to_dict()` of status
        if self.status:
            _dict['status'] = self.status.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Outliersenginev3StatisticsResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "analysis_statistics": Outliersenginev3AnalysisStatisticsMessage.from_dict(obj["analysis_statistics"]) if obj.get("analysis_statistics") is not None else None,
            "number_of_clusters": obj.get("number_of_clusters"),
            "number_of_completed_periods": obj.get("number_of_completed_periods"),
            "number_of_outliers_details": obj.get("number_of_outliers_details"),
            "number_of_outliers_summary": obj.get("number_of_outliers_summary"),
            "number_of_sources": obj.get("number_of_sources"),
            "number_of_uncompleted_periods": obj.get("number_of_uncompleted_periods"),
            "outliers_stats": Outliersenginev3OutliersStats.from_dict(obj["outliers_stats"]) if obj.get("outliers_stats") is not None else None,
            "queue_statistics": Outliersenginev3QueueStatisticsMessage.from_dict(obj["queue_statistics"]) if obj.get("queue_statistics") is not None else None,
            "sources_stats": Outliersenginev3SourcesStats.from_dict(obj["sources_stats"]) if obj.get("sources_stats") is not None else None,
            "status": RpcStatus.from_dict(obj["status"]) if obj.get("status") is not None else None
        })
        return _obj


