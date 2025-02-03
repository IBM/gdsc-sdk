# coding: utf-8

"""
    IBM Guardium Data Security Center

    IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class Jumpboxv3UserState(str, Enum):
    """
    The states of users.
    """

    """
    allowed enum values
    """
    ACTIVE = 'ACTIVE'
    INACTIVE = 'INACTIVE'
    INVITED = 'INVITED'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Jumpboxv3UserState from a JSON string"""
        return cls(json.loads(json_str))


