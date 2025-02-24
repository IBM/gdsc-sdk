# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.featureflagsv3_feature_flag_overrides import Featureflagsv3FeatureFlagOverrides

class TestFeatureflagsv3FeatureFlagOverrides(unittest.TestCase):
    """Featureflagsv3FeatureFlagOverrides unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Featureflagsv3FeatureFlagOverrides:
        """Test Featureflagsv3FeatureFlagOverrides
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Featureflagsv3FeatureFlagOverrides`
        """
        model = Featureflagsv3FeatureFlagOverrides()
        if include_optional:
            return Featureflagsv3FeatureFlagOverrides(
                flag_name = '',
                high_priority = True,
                is_enabled = True,
                value = ''
            )
        else:
            return Featureflagsv3FeatureFlagOverrides(
        )
        """

    def testFeatureflagsv3FeatureFlagOverrides(self):
        """Test Featureflagsv3FeatureFlagOverrides"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
