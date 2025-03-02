# coding: utf-8

"""
    IBM Guardium Data Security Center

    Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.

    The version of the OpenAPI document: 3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ibm_gdsc_sdk_saas.api.workflow_api import WorkflowApi


class TestWorkflowApi(unittest.TestCase):
    """WorkflowApi unit test stubs"""

    def setUp(self) -> None:
        self.api = WorkflowApi()

    def tearDown(self) -> None:
        pass

    def test_workflow_create_case(self) -> None:
        """Test case for workflow_create_case

        Summary: Create case Description: Create single case.
        """
        pass

    def test_workflow_create_product_entity(self) -> None:
        """Test case for workflow_create_product_entity

        Summary: Create product entity Description: Create single product entity.
        """
        pass

    def test_workflow_create_task(self) -> None:
        """Test case for workflow_create_task

        Summary: Create task Description: Create single task within a parent case.
        """
        pass

    def test_workflow_create_workflow_event(self) -> None:
        """Test case for workflow_create_workflow_event

        Summary: Post event for processing by workflow rules Description: Find matching workflow rule and run it
        """
        pass

    def test_workflow_delete_product_entity(self) -> None:
        """Test case for workflow_delete_product_entity

        Summary: Delete a product entity Description: Delete a single product entity.
        """
        pass

    def test_workflow_get_cases(self) -> None:
        """Test case for workflow_get_cases

        Summary: Get cases Description: Return all cases requested.
        """
        pass

    def test_workflow_get_cases_count(self) -> None:
        """Test case for workflow_get_cases_count

        Summary: Get cases count Description: Get case count.
        """
        pass

    def test_workflow_get_filename(self) -> None:
        """Test case for workflow_get_filename

        Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
        """
        pass

    def test_workflow_get_jobs_count(self) -> None:
        """Test case for workflow_get_jobs_count

        Summary: Get jobs count Description: Get jobs count.
        """
        pass

    def test_workflow_get_product_entities(self) -> None:
        """Test case for workflow_get_product_entities

        Summary: Get products and their associated event entities Description: Return a list of integrated products and their associated event entities
        """
        pass

    def test_workflow_get_product_entity(self) -> None:
        """Test case for workflow_get_product_entity

        Summary: Get event entity field names, field labels, and field data types Description: Return a list of fields similar to report headers
        """
        pass

    def test_workflow_get_report_result(self) -> None:
        """Test case for workflow_get_report_result

        Summary: Get report result Description: Return a page of results.
        """
        pass

    def test_workflow_get_tasks(self) -> None:
        """Test case for workflow_get_tasks

        Summary: Get tasks Description: Return all tasks requested.
        """
        pass

    def test_workflow_get_tasks_count(self) -> None:
        """Test case for workflow_get_tasks_count

        Summary: Get cases count Description: Get case count.
        """
        pass

    def test_workflow_search_cases(self) -> None:
        """Test case for workflow_search_cases

        Summary: Search cases Description: Return a subset of cases.
        """
        pass

    def test_workflow_search_reports(self) -> None:
        """Test case for workflow_search_reports

        Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
        """
        pass

    def test_workflow_search_tasks(self) -> None:
        """Test case for workflow_search_tasks

        Summary: Search cases Description: Return a subset of cases.
        """
        pass

    def test_workflow_update_cases(self) -> None:
        """Test case for workflow_update_cases

        Summary: Update cases Description: Update multiple cases in one request.
        """
        pass

    def test_workflow_update_product_entity(self) -> None:
        """Test case for workflow_update_product_entity

        Summary: Update a product entity Description: Update a single product entity.
        """
        pass

    def test_workflow_update_tasks(self) -> None:
        """Test case for workflow_update_tasks

        Summary: Update tasks Description: Update multiple tasks for the same parent in one request.
        """
        pass


if __name__ == '__main__':
    unittest.main()
