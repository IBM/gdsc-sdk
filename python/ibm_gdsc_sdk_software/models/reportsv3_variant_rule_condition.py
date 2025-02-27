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


class Reportsv3VariantRuleCondition(str, Enum):
    """
    Reportsv3VariantRuleCondition
    """

    """
    allowed enum values
    """
    UNDEFINED_VARIANT_ACTION_IF = 'UNDEFINED_VARIANT_ACTION_IF'
    BEGINS_WITH = 'BEGINS_WITH'
    DOES_NOT_BEGIN_WITH = 'DOES_NOT_BEGIN_WITH'
    ENDS_WITH = 'ENDS_WITH'
    DOES_NOT_END_WITH = 'DOES_NOT_END_WITH'
    CONTAINS = 'CONTAINS'
    DOES_NOT_CONTAIN = 'DOES_NOT_CONTAIN'
    MATCHES_REGEX = 'MATCHES_REGEX'
    DOES_NOT_MATCH_REGEX = 'DOES_NOT_MATCH_REGEX'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Reportsv3VariantRuleCondition from a JSON string"""
        return cls(json.loads(json_str))


