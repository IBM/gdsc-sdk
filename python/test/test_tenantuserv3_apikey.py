# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.tenantuserv3_apikey import Tenantuserv3Apikey

class TestTenantuserv3Apikey(unittest.TestCase):
    """Tenantuserv3Apikey unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Tenantuserv3Apikey:
        """Test Tenantuserv3Apikey
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Tenantuserv3Apikey`
        """
        model = Tenantuserv3Apikey()
        if include_optional:
            return Tenantuserv3Apikey(
                activation_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                active = True,
                apikey = '',
                id = '',
                last_used = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                name = '',
                roles = [
                    ''
                    ],
                secret = '',
                tenant_id = '',
                user_id = ''
            )
        else:
            return Tenantuserv3Apikey(
        )
        """

    def testTenantuserv3Apikey(self):
        """Test Tenantuserv3Apikey"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
