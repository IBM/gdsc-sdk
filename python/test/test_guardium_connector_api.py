# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.api.guardium_connector_api import GuardiumConnectorApi


class TestGuardiumConnectorApi(unittest.TestCase):
    """GuardiumConnectorApi unit test stubs"""

    def setUp(self) -> None:
        self.api = GuardiumConnectorApi()

    def tearDown(self) -> None:
        pass

    def test_guardium_connector_add_cm(self) -> None:
        """Test case for guardium_connector_add_cm

        Summary: Add CM Description: Add a Central Manager to the tenant database.
        """
        pass

    def test_guardium_connector_add_datamarts(self) -> None:
        """Test case for guardium_connector_add_datamarts

        Description: stores datamarts details from GDP. (This API is called from GDP only)
        """
        pass

    def test_guardium_connector_add_dm_exclusion(self) -> None:
        """Test case for guardium_connector_add_dm_exclusion

        Summary: Add DM exclusion Description: Add datamart to exclusion list.
        """
        pass

    def test_guardium_connector_add_task(self) -> None:
        """Test case for guardium_connector_add_task

        Summary: Add task Description: Add a task to be executed on GDP. (This API is called from GDP only)
        """
        pass

    def test_guardium_connector_block_user(self) -> None:
        """Test case for guardium_connector_block_user

        Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
        """
        pass

    def test_guardium_connector_configure_aggregator_export(self) -> None:
        """Test case for guardium_connector_configure_aggregator_export

        Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
        """
        pass

    def test_guardium_connector_configure_collector_export(self) -> None:
        """Test case for guardium_connector_configure_collector_export

        Summary: Configure collector export Description: Schedule export historical data for collectors.
        """
        pass

    def test_guardium_connector_configure_streaming(self) -> None:
        """Test case for guardium_connector_configure_streaming

        Summary: Configure streaming Description: Enable or disable streaming.
        """
        pass

    def test_guardium_connector_datamart_version_check(self) -> None:
        """Test case for guardium_connector_datamart_version_check

        Description: validates if central manager has v5 datamart support. (This API is called from GDP only)
        """
        pass

    def test_guardium_connector_delete_cm(self) -> None:
        """Test case for guardium_connector_delete_cm

        Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
        """
        pass

    def test_guardium_connector_delete_dm_exclusion(self) -> None:
        """Test case for guardium_connector_delete_dm_exclusion

        Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
        """
        pass

    def test_guardium_connector_delete_task(self) -> None:
        """Test case for guardium_connector_delete_task

        Summary: Delete task Description: Delete a task by central manager id and task id. (This API is called from GDP only)
        """
        pass

    def test_guardium_connector_delete_tasks(self) -> None:
        """Test case for guardium_connector_delete_tasks

        Summary: Delete tasks Description: Delete a central manager's tasks by central manager id. (This API is called from GDP only)
        """
        pass

    def test_guardium_connector_get_aggregators_config(self) -> None:
        """Test case for guardium_connector_get_aggregators_config

        Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
        """
        pass

    def test_guardium_connector_get_cms(self) -> None:
        """Test case for guardium_connector_get_cms

        Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
        """
        pass

    def test_guardium_connector_get_cms_config(self) -> None:
        """Test case for guardium_connector_get_cms_config

        Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
        """
        pass

    def test_guardium_connector_get_collectors_config(self) -> None:
        """Test case for guardium_connector_get_collectors_config

        Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
        """
        pass

    def test_guardium_connector_get_datamarts(self) -> None:
        """Test case for guardium_connector_get_datamarts

        Description: returns full list of supported datamarts including type (historical or non-historical)
        """
        pass

    def test_guardium_connector_get_dm_exclusion(self) -> None:
        """Test case for guardium_connector_get_dm_exclusion

        Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
        """
        pass

    def test_guardium_connector_get_gdp_policy_info(self) -> None:
        """Test case for guardium_connector_get_gdp_policy_info

        Summary: Get guardium policy definition Description: returns the policy definition on the cm
        """
        pass

    def test_guardium_connector_get_gdp_policy_summaries(self) -> None:
        """Test case for guardium_connector_get_gdp_policy_summaries

        Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
        """
        pass

    def test_guardium_connector_get_health_info(self) -> None:
        """Test case for guardium_connector_get_health_info

        Summary: Get health info Description: Get health information from Guardium Data Protection central mamangers. (This API is for CMs registered in legacy pull mode. Supported on-premises only)
        """
        pass

    def test_guardium_connector_get_latest_dm_extraction_profile(self) -> None:
        """Test case for guardium_connector_get_latest_dm_extraction_profile

        Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for GDSC.
        """
        pass

    def test_guardium_connector_get_streaming_status(self) -> None:
        """Test case for guardium_connector_get_streaming_status

        Summary: Get streaming status Description: Return the streaming configuration.
        """
        pass

    def test_guardium_connector_get_sync_dms(self) -> None:
        """Test case for guardium_connector_get_sync_dms

        Summary: Get sync DMs Description: Return the list of tasks from a central manager. (This API is called from GDP only)
        """
        pass

    def test_guardium_connector_get_task_types(self) -> None:
        """Test case for guardium_connector_get_task_types

        Summary: Get task types Description: Return the list of supported task types.
        """
        pass

    def test_guardium_connector_get_tasks(self) -> None:
        """Test case for guardium_connector_get_tasks

        Summary: Get tasks Description: Return the list of tasks from a central manager. (This API is called from GDP only)
        """
        pass

    def test_guardium_connector_run_gdp_report(self) -> None:
        """Test case for guardium_connector_run_gdp_report

        Summary: Run GDP report Description: Run GDP report. (This API is for CMs registered in legacy pull mode. Supported on-premises only)
        """
        pass

    def test_guardium_connector_setup_cm(self) -> None:
        """Test case for guardium_connector_setup_cm

        Summary: Setup CM Description: Set up the registration between a GDP Central manager and GDSC. (This API is called from GDP only)
        """
        pass

    def test_guardium_connector_setup_datamarts(self) -> None:
        """Test case for guardium_connector_setup_datamarts

        Description: setup custom datamart execution mode
        """
        pass

    def test_guardium_connector_task_error(self) -> None:
        """Test case for guardium_connector_task_error

        Summary: Task error Description: Log error messages from GDP task execution. (This API is called from GDP only)
        """
        pass

    def test_guardium_connector_test_database_connection(self) -> None:
        """Test case for guardium_connector_test_database_connection

        Summary: Test database connection Description: Return database connection results.
        """
        pass

    def test_guardium_connector_update_dm_exclusion(self) -> None:
        """Test case for guardium_connector_update_dm_exclusion

        Summary: Update DM exclusion Description: Update the atamart exclusion list.
        """
        pass

    def test_guardium_connector_update_streaming(self) -> None:
        """Test case for guardium_connector_update_streaming

        Summary: Update streaming Description: Update streaming status into GI. (This API is called from GDP only)
        """
        pass

    def test_guardium_connector_update_task(self) -> None:
        """Test case for guardium_connector_update_task

        Summary: Update task Description: Update a task that gets executed on GDP. (This API is called from GDP only)
        """
        pass


if __name__ == '__main__':
    unittest.main()
