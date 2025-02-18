# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.assetsv3_model_data import Assetsv3ModelData

class TestAssetsv3ModelData(unittest.TestCase):
    """Assetsv3ModelData unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Assetsv3ModelData:
        """Test Assetsv3ModelData
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Assetsv3ModelData`
        """
        model = Assetsv3ModelData()
        if include_optional:
            return Assetsv3ModelData(
                resource_location = '',
                resource_name = '',
                resource_size = '',
                resource_type = ''
            )
        else:
            return Assetsv3ModelData(
        )
        """

    def testAssetsv3ModelData(self):
        """Test Assetsv3ModelData"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
