# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.connectionsv3_generate_package_request import Connectionsv3GeneratePackageRequest

class TestConnectionsv3GeneratePackageRequest(unittest.TestCase):
    """Connectionsv3GeneratePackageRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Connectionsv3GeneratePackageRequest:
        """Test Connectionsv3GeneratePackageRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Connectionsv3GeneratePackageRequest`
        """
        model = Connectionsv3GeneratePackageRequest()
        if include_optional:
            return Connectionsv3GeneratePackageRequest(
                datasource_type = '',
                developer_name = '',
                document_link = '',
                id = '',
                logfile = '',
                name = '',
                readme = '',
                records = [
                    ibm_gdsc_sdk_saas.models.name_and_value_for_each_plugin_record.name and value for each plugin record(
                        guard_record_name = '', 
                        value = '', )
                    ],
                state = '',
                supported_inputs = [
                    ''
                    ],
                version = '',
                version_tested = ''
            )
        else:
            return Connectionsv3GeneratePackageRequest(
        )
        """

    def testConnectionsv3GeneratePackageRequest(self):
        """Test Connectionsv3GeneratePackageRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
