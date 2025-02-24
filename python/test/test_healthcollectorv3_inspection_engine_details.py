# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.healthcollectorv3_inspection_engine_details import Healthcollectorv3InspectionEngineDetails

class TestHealthcollectorv3InspectionEngineDetails(unittest.TestCase):
    """Healthcollectorv3InspectionEngineDetails unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Healthcollectorv3InspectionEngineDetails:
        """Test Healthcollectorv3InspectionEngineDetails
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Healthcollectorv3InspectionEngineDetails`
        """
        model = Healthcollectorv3InspectionEngineDetails()
        if include_optional:
            return Healthcollectorv3InspectionEngineDetails(
                ie = '',
                port = '',
                protocol = '',
                stap = '',
                status = 56,
                verification_result = '',
                verification_state = '',
                version = ''
            )
        else:
            return Healthcollectorv3InspectionEngineDetails(
        )
        """

    def testHealthcollectorv3InspectionEngineDetails(self):
        """Test Healthcollectorv3InspectionEngineDetails"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
