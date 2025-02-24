# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.outliersenginev3_update_working_hours_periods_request import Outliersenginev3UpdateWorkingHoursPeriodsRequest

class TestOutliersenginev3UpdateWorkingHoursPeriodsRequest(unittest.TestCase):
    """Outliersenginev3UpdateWorkingHoursPeriodsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Outliersenginev3UpdateWorkingHoursPeriodsRequest:
        """Test Outliersenginev3UpdateWorkingHoursPeriodsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Outliersenginev3UpdateWorkingHoursPeriodsRequest`
        """
        model = Outliersenginev3UpdateWorkingHoursPeriodsRequest()
        if include_optional:
            return Outliersenginev3UpdateWorkingHoursPeriodsRequest(
                period = ibm_gdsc_sdk_saas.models.outliersenginev3_working_hours_period.outliersenginev3WorkingHoursPeriod(
                    contiguous = True, 
                    datetime_code_description = '', 
                    datetime_code_id = 56, 
                    hour_from = '', 
                    hour_to = '', 
                    weekday_from = 56, 
                    weekday_to = 56, )
            )
        else:
            return Outliersenginev3UpdateWorkingHoursPeriodsRequest(
        )
        """

    def testOutliersenginev3UpdateWorkingHoursPeriodsRequest(self):
        """Test Outliersenginev3UpdateWorkingHoursPeriodsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
