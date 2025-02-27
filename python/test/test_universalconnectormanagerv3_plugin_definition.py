# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_plugin_definition import Universalconnectormanagerv3PluginDefinition

class TestUniversalconnectormanagerv3PluginDefinition(unittest.TestCase):
    """Universalconnectormanagerv3PluginDefinition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Universalconnectormanagerv3PluginDefinition:
        """Test Universalconnectormanagerv3PluginDefinition
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Universalconnectormanagerv3PluginDefinition`
        """
        model = Universalconnectormanagerv3PluginDefinition()
        if include_optional:
            return Universalconnectormanagerv3PluginDefinition(
                plugin_jdbc_driver_required = True,
                plugin_alias = '',
                plugin_configuration_notes = '',
                plugin_description = '',
                plugin_developer = '',
                plugin_documentation_path = '',
                plugin_license = '',
                plugin_name = '',
                plugin_pipeline_type = '',
                plugin_type = '',
                plugin_version = '',
                supported_input_plugins = [
                    ''
                    ],
                supported_datasources = [
                    ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_datasource_type.universalconnectormanagerv3DatasourceType(
                        supported_versions = [
                            ''
                            ], 
                        type = '', )
                    ],
                upload_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                upload_user = ''
            )
        else:
            return Universalconnectormanagerv3PluginDefinition(
        )
        """

    def testUniversalconnectormanagerv3PluginDefinition(self):
        """Test Universalconnectormanagerv3PluginDefinition"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
