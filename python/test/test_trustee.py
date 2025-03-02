# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.trustee import Trustee

class TestTrustee(unittest.TestCase):
    """Trustee unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Trustee:
        """Test Trustee
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Trustee`
        """
        model = Trustee()
        if include_optional:
            return Trustee(
                asset_id = '123456789101',
                name = '123456789101',
                asset_type = '',
                link = '',
                permissions = [
                    'READ'
                    ],
                cloud_account_details = ibm_gdsc_sdk_saas.models.cloud_account_details.CloudAccountDetails(
                    cloud_account_id = '123456789101', 
                    cloud_account_name = 'corplex', 
                    service_provider = 'aws', )
            )
        else:
            return Trustee(
                asset_id = '123456789101',
                name = '123456789101',
                asset_type = '',
                link = '',
                cloud_account_details = ibm_gdsc_sdk_saas.models.cloud_account_details.CloudAccountDetails(
                    cloud_account_id = '123456789101', 
                    cloud_account_name = 'corplex', 
                    service_provider = 'aws', ),
        )
        """

    def testTrustee(self):
        """Test Trustee"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
