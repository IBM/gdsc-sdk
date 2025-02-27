# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_update_ticket_status_request import Qspmpolicymanagerv3UpdateTicketStatusRequest

class TestQspmpolicymanagerv3UpdateTicketStatusRequest(unittest.TestCase):
    """Qspmpolicymanagerv3UpdateTicketStatusRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Qspmpolicymanagerv3UpdateTicketStatusRequest:
        """Test Qspmpolicymanagerv3UpdateTicketStatusRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Qspmpolicymanagerv3UpdateTicketStatusRequest`
        """
        model = Qspmpolicymanagerv3UpdateTicketStatusRequest()
        if include_optional:
            return Qspmpolicymanagerv3UpdateTicketStatusRequest(
                policy_dataset_id = '',
                policy_type = ''
            )
        else:
            return Qspmpolicymanagerv3UpdateTicketStatusRequest(
        )
        """

    def testQspmpolicymanagerv3UpdateTicketStatusRequest(self):
        """Test Qspmpolicymanagerv3UpdateTicketStatusRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
