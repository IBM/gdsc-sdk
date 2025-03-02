# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_database_connection_string_request import Guardiumconnectorv3DatabaseConnectionStringRequest

class TestGuardiumconnectorv3DatabaseConnectionStringRequest(unittest.TestCase):
    """Guardiumconnectorv3DatabaseConnectionStringRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Guardiumconnectorv3DatabaseConnectionStringRequest:
        """Test Guardiumconnectorv3DatabaseConnectionStringRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Guardiumconnectorv3DatabaseConnectionStringRequest`
        """
        model = Guardiumconnectorv3DatabaseConnectionStringRequest()
        if include_optional:
            return Guardiumconnectorv3DatabaseConnectionStringRequest(
                dbhost = '',
                dbname = '',
                password = '',
                port = '',
                user = ''
            )
        else:
            return Guardiumconnectorv3DatabaseConnectionStringRequest(
        )
        """

    def testGuardiumconnectorv3DatabaseConnectionStringRequest(self):
        """Test Guardiumconnectorv3DatabaseConnectionStringRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
