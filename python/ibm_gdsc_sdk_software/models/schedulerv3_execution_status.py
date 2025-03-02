# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class Schedulerv3ExecutionStatus(str, Enum):
    """
    ExecutionStatus is the scheduled report running status.
    """

    """
    allowed enum values
    """
    UNDEFINED = 'UNDEFINED'
    WAITING = 'WAITING'
    RUNNING = 'RUNNING'
    COMPLETE = 'COMPLETE'
    EXPIRED = 'EXPIRED'
    STOPPED = 'STOPPED'
    FAILED = 'FAILED'
    POST_RUN = 'POST_RUN'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Schedulerv3ExecutionStatus from a JSON string"""
        return cls(json.loads(json_str))


