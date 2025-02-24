# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_datasource_type import Universalconnectormanagerv3DatasourceType

class TestUniversalconnectormanagerv3DatasourceType(unittest.TestCase):
    """Universalconnectormanagerv3DatasourceType unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Universalconnectormanagerv3DatasourceType:
        """Test Universalconnectormanagerv3DatasourceType
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Universalconnectormanagerv3DatasourceType`
        """
        model = Universalconnectormanagerv3DatasourceType()
        if include_optional:
            return Universalconnectormanagerv3DatasourceType(
                supported_versions = [
                    ''
                    ],
                type = ''
            )
        else:
            return Universalconnectormanagerv3DatasourceType(
        )
        """

    def testUniversalconnectormanagerv3DatasourceType(self):
        """Test Universalconnectormanagerv3DatasourceType"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
