# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.data_resources_summary import DataResourcesSummary

class TestDataResourcesSummary(unittest.TestCase):
    """DataResourcesSummary unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DataResourcesSummary:
        """Test DataResourcesSummary
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DataResourcesSummary`
        """
        model = DataResourcesSummary()
        if include_optional:
            return DataResourcesSummary(
                reviewed_resources = 0,
                total_resources = 3,
                resource_types = [
                    ibm_gdsc_sdk_software.models.data_resources_summary_resource_types_inner.DataResourcesSummary_resourceTypes_inner(
                        resource_type = 'file', 
                        count = 3, )
                    ],
                resource_owners = [
                    ibm_gdsc_sdk_software.models.data_resources_summary_resource_owners_inner.DataResourcesSummary_resourceOwners_inner(
                        resource_owner = 'owner name', 
                        count = 2, )
                    ],
                total_sensitivities = 238,
                sensitivities = [
                    ibm_gdsc_sdk_software.models.sensitivities_items_inner.SensitivitiesItems_inner(
                        sensitivity = 'EMAIL', 
                        count = 57, 
                        category = 'PERSONAL', )
                    ]
            )
        else:
            return DataResourcesSummary(
                reviewed_resources = 0,
                total_resources = 3,
                resource_types = [
                    ibm_gdsc_sdk_software.models.data_resources_summary_resource_types_inner.DataResourcesSummary_resourceTypes_inner(
                        resource_type = 'file', 
                        count = 3, )
                    ],
                sensitivities = [
                    ibm_gdsc_sdk_software.models.sensitivities_items_inner.SensitivitiesItems_inner(
                        sensitivity = 'EMAIL', 
                        count = 57, 
                        category = 'PERSONAL', )
                    ],
        )
        """

    def testDataResourcesSummary(self):
        """Test DataResourcesSummary"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
