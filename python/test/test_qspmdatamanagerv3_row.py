# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.qspmdatamanagerv3_row import Qspmdatamanagerv3Row

class TestQspmdatamanagerv3Row(unittest.TestCase):
    """Qspmdatamanagerv3Row unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Qspmdatamanagerv3Row:
        """Test Qspmdatamanagerv3Row
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Qspmdatamanagerv3Row`
        """
        model = Qspmdatamanagerv3Row()
        if include_optional:
            return Qspmdatamanagerv3Row(
                columns = {
                    'key' : ''
                    }
            )
        else:
            return Qspmdatamanagerv3Row(
        )
        """

    def testQspmdatamanagerv3Row(self):
        """Test Qspmdatamanagerv3Row"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
