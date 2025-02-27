# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.data_resource import DataResource

class TestDataResource(unittest.TestCase):
    """DataResource unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DataResource:
        """Test DataResource
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DataResource`
        """
        model = DataResource()
        if include_optional:
            return DataResource(
                data_resource_id = 'arn:aws:s3::12345678910:polar-security-corplex.xlsx',
                data_resource_name = 'polar-security-corplex.xlsx',
                data_store_id = 'arn:aws:s3::123456781234:polar-security-corplex',
                data_resource_type = 's3',
                data_resource_owner = 'Resource owner name',
                size_in_bytes = 3456,
                size_formatted = '3.4 MB',
                creation_time = '',
                modification_time = '',
                is_reviewed = True,
                link = '/polar-security-corplex.xlsx',
                stats = ibm_gdsc_sdk_saas.models.data_resource_stats.DataResourceStats(
                    sensitivities_count = 57, 
                    sensitivities_summary = [
                        ibm_gdsc_sdk_saas.models.sensitivity_summary.SensitivitySummary(
                            tag = 'BUSINESS_EMAIL_ADDRESS', 
                            count = 230, 
                            category = 'Personal', )
                        ], )
            )
        else:
            return DataResource(
                data_resource_id = 'arn:aws:s3::12345678910:polar-security-corplex.xlsx',
                data_resource_name = 'polar-security-corplex.xlsx',
                data_store_id = 'arn:aws:s3::123456781234:polar-security-corplex',
                data_resource_type = 's3',
        )
        """

    def testDataResource(self):
        """Test DataResource"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
