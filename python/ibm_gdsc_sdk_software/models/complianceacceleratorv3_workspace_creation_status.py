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


class Complianceacceleratorv3WorkspaceCreationStatus(str, Enum):
    """
    Enum indicating workspace creation status.   - RCP_CREATE: reports -> charts -> dashboards creation
    """

    """
    allowed enum values
    """
    NO_ACTION = 'NO_ACTION'
    STARTING = 'STARTING'
    GROUPS_CREATE = 'GROUPS_CREATE'
    GROUPS_EDIT = 'GROUPS_EDIT'
    POLICY_CREATE = 'POLICY_CREATE'
    RCP_CREATE = 'RCP_CREATE'
    POLICY_INSTALL = 'POLICY_INSTALL'
    SYSLOG_CREATE = 'SYSLOG_CREATE'
    POLICY_UPDATE = 'POLICY_UPDATE'
    AUDIT_CREATE = 'AUDIT_CREATE'
    STORING_COMPLIANCE_INFO = 'STORING_COMPLIANCE_INFO'
    WS_DASHBOARD_CREATE = 'WS_DASHBOARD_CREATE'
    DONE = 'DONE'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Complianceacceleratorv3WorkspaceCreationStatus from a JSON string"""
        return cls(json.loads(json_str))


