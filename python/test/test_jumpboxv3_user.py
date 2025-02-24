# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.models.jumpboxv3_user import Jumpboxv3User

class TestJumpboxv3User(unittest.TestCase):
    """Jumpboxv3User unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Jumpboxv3User:
        """Test Jumpboxv3User
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Jumpboxv3User`
        """
        model = Jumpboxv3User()
        if include_optional:
            return Jumpboxv3User(
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
                roles = [
                    ''
                    ],
                state = 'ACTIVE',
                uid = '',
                user_id = ''
            )
        else:
            return Jumpboxv3User(
        )
        """

    def testJumpboxv3User(self):
        """Test Jumpboxv3User"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
