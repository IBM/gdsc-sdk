# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_fetch_object_store_file_response import Qspmpolicymanagerv3FetchObjectStoreFileResponse

class TestQspmpolicymanagerv3FetchObjectStoreFileResponse(unittest.TestCase):
    """Qspmpolicymanagerv3FetchObjectStoreFileResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Qspmpolicymanagerv3FetchObjectStoreFileResponse:
        """Test Qspmpolicymanagerv3FetchObjectStoreFileResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Qspmpolicymanagerv3FetchObjectStoreFileResponse`
        """
        model = Qspmpolicymanagerv3FetchObjectStoreFileResponse()
        if include_optional:
            return Qspmpolicymanagerv3FetchObjectStoreFileResponse(
                bucket_name = '',
                file_name = ibm_gdsc_sdk_saas.models.nested_message_for_file_names.Nested message for file names(
                    explorer_files_name = [
                        ''
                        ], 
                    non_explorer_files_name = [
                        ''
                        ], ),
                folder_name = ''
            )
        else:
            return Qspmpolicymanagerv3FetchObjectStoreFileResponse(
        )
        """

    def testQspmpolicymanagerv3FetchObjectStoreFileResponse(self):
        """Test Qspmpolicymanagerv3FetchObjectStoreFileResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
