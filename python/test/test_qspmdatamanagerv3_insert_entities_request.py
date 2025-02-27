# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.qspmdatamanagerv3_insert_entities_request import Qspmdatamanagerv3InsertEntitiesRequest

class TestQspmdatamanagerv3InsertEntitiesRequest(unittest.TestCase):
    """Qspmdatamanagerv3InsertEntitiesRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Qspmdatamanagerv3InsertEntitiesRequest:
        """Test Qspmdatamanagerv3InsertEntitiesRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Qspmdatamanagerv3InsertEntitiesRequest`
        """
        model = Qspmdatamanagerv3InsertEntitiesRequest()
        if include_optional:
            return Qspmdatamanagerv3InsertEntitiesRequest(
                dims = [
                    None
                    ],
                facts = [
                    None
                    ],
                policysqls = [
                    ''
                    ],
                scan_id = ''
            )
        else:
            return Qspmdatamanagerv3InsertEntitiesRequest(
        )
        """

    def testQspmdatamanagerv3InsertEntitiesRequest(self):
        """Test Qspmdatamanagerv3InsertEntitiesRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
