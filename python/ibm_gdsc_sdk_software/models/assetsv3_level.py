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


class Assetsv3Level(str, Enum):
    """
    - LEVEL_UNKNOWN: no info about risk/criticality involved  - LEVEL_NONE: no risk/criticality involed  - LEVEL_LOW: low risk/criticality involed  - LEVEL_MEDIUM: medium risk/criticality involed  - LEVEL_HIGH: high risk/criticality involed  - LEVEL_CRITICAL: critical risk/criticality involed
    """

    """
    allowed enum values
    """
    LEVEL_UNKNOWN = 'LEVEL_UNKNOWN'
    LEVEL_NONE = 'LEVEL_NONE'
    LEVEL_LOW = 'LEVEL_LOW'
    LEVEL_MEDIUM = 'LEVEL_MEDIUM'
    LEVEL_HIGH = 'LEVEL_HIGH'
    LEVEL_CRITICAL = 'LEVEL_CRITICAL'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Assetsv3Level from a JSON string"""
        return cls(json.loads(json_str))


