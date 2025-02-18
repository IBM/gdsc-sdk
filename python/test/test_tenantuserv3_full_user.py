# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_software.models.tenantuserv3_full_user import Tenantuserv3FullUser

class TestTenantuserv3FullUser(unittest.TestCase):
    """Tenantuserv3FullUser unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Tenantuserv3FullUser:
        """Test Tenantuserv3FullUser
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Tenantuserv3FullUser`
        """
        model = Tenantuserv3FullUser()
        if include_optional:
            return Tenantuserv3FullUser(
                activation_date = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                directory_id = '',
                disabled = True,
                display_name = '',
                distinguished_name = '',
                email = '',
                external_id = '',
                metadata = {
                    'key' : ''
                    },
                privileges = {
                    'key' : True
                    },
                roles = [
                    ''
                    ],
                state = 'ACTIVE',
                tenant_id = '',
                uid = '',
                user_id = ''
            )
        else:
            return Tenantuserv3FullUser(
        )
        """

    def testTenantuserv3FullUser(self):
        """Test Tenantuserv3FullUser"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
