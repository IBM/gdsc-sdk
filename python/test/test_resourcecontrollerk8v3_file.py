# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_file import Resourcecontrollerk8v3File

class TestResourcecontrollerk8v3File(unittest.TestCase):
    """Resourcecontrollerk8v3File unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Resourcecontrollerk8v3File:
        """Test Resourcecontrollerk8v3File
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Resourcecontrollerk8v3File`
        """
        model = Resourcecontrollerk8v3File()
        if include_optional:
            return Resourcecontrollerk8v3File(
                content = '',
                created = '',
                description = ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_text_content.resourcecontrollerk8v3TextContent(
                    content = '', 
                    format = '', ),
                id = '',
                modified = '',
                name = '',
                path = '',
                type = ''
            )
        else:
            return Resourcecontrollerk8v3File(
        )
        """

    def testResourcecontrollerk8v3File(self):
        """Test Resourcecontrollerk8v3File"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
