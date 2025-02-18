# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.sensitivity import Sensitivity

class TestSensitivity(unittest.TestCase):
    """Sensitivity unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Sensitivity:
        """Test Sensitivity
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Sensitivity`
        """
        model = Sensitivity()
        if include_optional:
            return Sensitivity(
                sensitivity_id = '',
                tag = '',
                query = '',
                resource_id = 'arn:aws:s3::123456789101:polar-bucket_excel_sheet.xlsx',
                quarantine_bucket_link = '',
                data_store_id = 'arn:aws:s3::123456789101:polar-bucket',
                last_seen = '',
                hash = '',
                category = ''
            )
        else:
            return Sensitivity(
                sensitivity_id = '',
                tag = '',
                query = '',
                resource_id = 'arn:aws:s3::123456789101:polar-bucket_excel_sheet.xlsx',
                quarantine_bucket_link = '',
                data_store_id = 'arn:aws:s3::123456789101:polar-bucket',
                last_seen = '',
                hash = '',
                category = '',
        )
        """

    def testSensitivity(self):
        """Test Sensitivity"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
