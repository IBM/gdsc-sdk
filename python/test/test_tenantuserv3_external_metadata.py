# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.tenantuserv3_external_metadata import Tenantuserv3ExternalMetadata

class TestTenantuserv3ExternalMetadata(unittest.TestCase):
    """Tenantuserv3ExternalMetadata unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Tenantuserv3ExternalMetadata:
        """Test Tenantuserv3ExternalMetadata
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Tenantuserv3ExternalMetadata`
        """
        model = Tenantuserv3ExternalMetadata()
        if include_optional:
            return Tenantuserv3ExternalMetadata(
                add_ons = {
                    'key' : ibm_gdsc_sdk_software.models.tenantuserv3_prometheus.tenantuserv3Prometheus(
                        unit = '', 
                        value = '', )
                    },
                crn = '',
                expiration_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                instance_id = '',
                part_number = '',
                plan_id = '',
                service_id = '',
                subscription_id = ''
            )
        else:
            return Tenantuserv3ExternalMetadata(
        )
        """

    def testTenantuserv3ExternalMetadata(self):
        """Test Tenantuserv3ExternalMetadata"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
