# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.ecosystemv3_get_dataset_detail_response import Ecosystemv3GetDatasetDetailResponse

class TestEcosystemv3GetDatasetDetailResponse(unittest.TestCase):
    """Ecosystemv3GetDatasetDetailResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Ecosystemv3GetDatasetDetailResponse:
        """Test Ecosystemv3GetDatasetDetailResponse
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Ecosystemv3GetDatasetDetailResponse`
        """
        model = Ecosystemv3GetDatasetDetailResponse()
        if include_optional:
            return Ecosystemv3GetDatasetDetailResponse(
                detail = ibm_gdsc_sdk_saas.models.ecosystemv3_dataset_detail.ecosystemv3DatasetDetail(
                    columns = [
                        ibm_gdsc_sdk_saas.models.ecosystemv3_column_definition.ecosystemv3ColumnDefinition(
                            allow_null = True, 
                            column_id = 56, 
                            column_name = '', 
                            column_size = '', 
                            column_type = 'UNDEFINED_DATA_TYPE', 
                            unique = True, )
                        ], 
                    data_count = 56, 
                    dataset_name = '', 
                    description = '', 
                    editable = True, ),
                status = ibm_gdsc_sdk_saas.models.the_`status`_type_defines_a_logical_error_model_that_is_suitable_for_different
programming_environments,_including_rest_apis_and_rpc_apis/_it_is_used_by
[g_rpc](https://github/com/grpc)/_the_error_model_is_designed_to_be:.The `Status` type defines a logical error model that is suitable for different
programming environments, including REST APIs and RPC APIs. It is used by
[gRPC](https://github.com/grpc). The error model is designed to be:(
                    code = 56, 
                    details = [
                        ibm_gdsc_sdk_saas.models.protobuf_any.protobufAny(
                            type_url = '', 
                            value = 'YQ==', )
                        ], 
                    message = '', )
            )
        else:
            return Ecosystemv3GetDatasetDetailResponse(
        )
        """

    def testEcosystemv3GetDatasetDetailResponse(self):
        """Test Ecosystemv3GetDatasetDetailResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
