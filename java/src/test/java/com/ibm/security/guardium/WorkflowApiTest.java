/*
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ibm.security.guardium;

import com.ibm.security.ApiException;
import com.ibm.security.guardium.RuntimeError;
import com.ibm.security.guardium.Workflowv3CaseListResponse;
import com.ibm.security.guardium.Workflowv3CreateCaseRequest;
import com.ibm.security.guardium.Workflowv3CreateCaseResponse;
import com.ibm.security.guardium.Workflowv3CreateProductEntityResponse;
import com.ibm.security.guardium.Workflowv3CreateTaskRequest;
import com.ibm.security.guardium.Workflowv3CreateTaskResponse;
import com.ibm.security.guardium.Workflowv3DeleteProductEntityResponse;
import com.ibm.security.guardium.Workflowv3GetCasesCountRequest;
import com.ibm.security.guardium.Workflowv3GetCasesCountResponse;
import com.ibm.security.guardium.Workflowv3GetFilenameResponse;
import com.ibm.security.guardium.Workflowv3GetJobsCountRequest;
import com.ibm.security.guardium.Workflowv3GetJobsCountResponse;
import com.ibm.security.guardium.Workflowv3GetProductEntitiesResponse;
import com.ibm.security.guardium.Workflowv3GetReportResultResponse;
import com.ibm.security.guardium.Workflowv3GetTasksCountRequest;
import com.ibm.security.guardium.Workflowv3GetTasksCountResponse;
import com.ibm.security.guardium.Workflowv3ProductEntity;
import com.ibm.security.guardium.Workflowv3SearchCasesRequest;
import com.ibm.security.guardium.Workflowv3SearchReportsResponse;
import com.ibm.security.guardium.Workflowv3SearchTasksRequest;
import com.ibm.security.guardium.Workflowv3TaskListResponse;
import com.ibm.security.guardium.Workflowv3UpdateCasesRequest;
import com.ibm.security.guardium.Workflowv3UpdateCasesResponse;
import com.ibm.security.guardium.Workflowv3UpdateProductEntityRequest;
import com.ibm.security.guardium.Workflowv3UpdateProductEntityResponse;
import com.ibm.security.guardium.Workflowv3UpdateTasksRequest;
import com.ibm.security.guardium.Workflowv3UpdateTasksResponse;
import com.ibm.security.guardium.Workflowv3WorkflowEvent;
import com.ibm.security.guardium.Workflowv3WorkflowEventResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowApi
 */
@Disabled
public class WorkflowApiTest {

    private final WorkflowApi api = new WorkflowApi();

    /**
     * Summary: Create case Description: Create single case.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowCreateCaseTest() throws ApiException {
        Workflowv3CreateCaseRequest workflowv3CreateCaseRequest = null;
        Workflowv3CreateCaseResponse response = api.workflowCreateCase(workflowv3CreateCaseRequest);
        // TODO: test validations
    }

    /**
     * Summary: Create product entity Description: Create single product entity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowCreateProductEntityTest() throws ApiException {
        Workflowv3ProductEntity workflowv3ProductEntity = null;
        Workflowv3CreateProductEntityResponse response = api.workflowCreateProductEntity(workflowv3ProductEntity);
        // TODO: test validations
    }

    /**
     * Summary: Create task Description: Create single task within a parent case.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowCreateTaskTest() throws ApiException {
        String caseId = null;
        Workflowv3CreateTaskRequest workflowv3CreateTaskRequest = null;
        Workflowv3CreateTaskResponse response = api.workflowCreateTask(caseId, workflowv3CreateTaskRequest);
        // TODO: test validations
    }

    /**
     * Summary: Post event for processing by workflow rules Description: Find matching workflow rule and run it
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowCreateWorkflowEventTest() throws ApiException {
        Workflowv3WorkflowEvent workflowv3WorkflowEvent = null;
        Workflowv3WorkflowEventResponse response = api.workflowCreateWorkflowEvent(workflowv3WorkflowEvent);
        // TODO: test validations
    }

    /**
     * Summary: Delete a product entity Description: Delete a single product entity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowDeleteProductEntityTest() throws ApiException {
        String entityId = null;
        Workflowv3DeleteProductEntityResponse response = api.workflowDeleteProductEntity(entityId);
        // TODO: test validations
    }

    /**
     * Summary: Get cases Description: Return all cases requested.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowGetCasesTest() throws ApiException {
        String caseId = null;
        String sortBy = null;
        Integer offset = null;
        Integer limit = null;
        Workflowv3CaseListResponse response = api.workflowGetCases(caseId, sortBy, offset, limit);
        // TODO: test validations
    }

    /**
     * Summary: Get cases count Description: Get case count.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowGetCasesCountTest() throws ApiException {
        Workflowv3GetCasesCountRequest workflowv3GetCasesCountRequest = null;
        Workflowv3GetCasesCountResponse response = api.workflowGetCasesCount(workflowv3GetCasesCountRequest);
        // TODO: test validations
    }

    /**
     * Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowGetFilenameTest() throws ApiException {
        String caseId = null;
        String taskId = null;
        Workflowv3GetFilenameResponse response = api.workflowGetFilename(caseId, taskId);
        // TODO: test validations
    }

    /**
     * Summary: Get jobs count Description: Get jobs count.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowGetJobsCountTest() throws ApiException {
        String caseId = null;
        Workflowv3GetJobsCountRequest workflowv3GetJobsCountRequest = null;
        Workflowv3GetJobsCountResponse response = api.workflowGetJobsCount(caseId, workflowv3GetJobsCountRequest);
        // TODO: test validations
    }

    /**
     * Summary: Get products and their associated event entities Description: Return a list of integrated products and their associated event entities
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowGetProductEntitiesTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        Workflowv3GetProductEntitiesResponse response = api.workflowGetProductEntities(offset, limit);
        // TODO: test validations
    }

    /**
     * Summary: Get event entity field names, field labels, and field data types Description: Return a list of fields similar to report headers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowGetProductEntityTest() throws ApiException {
        String entityId = null;
        Workflowv3ProductEntity response = api.workflowGetProductEntity(entityId);
        // TODO: test validations
    }

    /**
     * Summary: Get report result Description: Return a page of results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowGetReportResultTest() throws ApiException {
        String caseId = null;
        String taskId = null;
        Integer offset = null;
        Integer limit = null;
        Workflowv3GetReportResultResponse response = api.workflowGetReportResult(caseId, taskId, offset, limit);
        // TODO: test validations
    }

    /**
     * Summary: Get tasks Description: Return all tasks requested.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowGetTasksTest() throws ApiException {
        String caseId = null;
        String taskId = null;
        Workflowv3TaskListResponse response = api.workflowGetTasks(caseId, taskId);
        // TODO: test validations
    }

    /**
     * Summary: Get cases count Description: Get case count.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowGetTasksCountTest() throws ApiException {
        String caseId = null;
        Workflowv3GetTasksCountRequest workflowv3GetTasksCountRequest = null;
        Workflowv3GetTasksCountResponse response = api.workflowGetTasksCount(caseId, workflowv3GetTasksCountRequest);
        // TODO: test validations
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowSearchCasesTest() throws ApiException {
        Workflowv3SearchCasesRequest workflowv3SearchCasesRequest = null;
        Workflowv3CaseListResponse response = api.workflowSearchCases(workflowv3SearchCasesRequest);
        // TODO: test validations
    }

    /**
     * Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowSearchReportsTest() throws ApiException {
        Workflowv3SearchCasesRequest workflowv3SearchCasesRequest = null;
        Workflowv3SearchReportsResponse response = api.workflowSearchReports(workflowv3SearchCasesRequest);
        // TODO: test validations
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowSearchTasksTest() throws ApiException {
        String caseId = null;
        Workflowv3SearchTasksRequest workflowv3SearchTasksRequest = null;
        Workflowv3TaskListResponse response = api.workflowSearchTasks(caseId, workflowv3SearchTasksRequest);
        // TODO: test validations
    }

    /**
     * Summary: Update cases Description: Update multiple cases in one request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowUpdateCasesTest() throws ApiException {
        Workflowv3UpdateCasesRequest workflowv3UpdateCasesRequest = null;
        Workflowv3UpdateCasesResponse response = api.workflowUpdateCases(workflowv3UpdateCasesRequest);
        // TODO: test validations
    }

    /**
     * Summary: Update a product entity Description: Update a single product entity.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowUpdateProductEntityTest() throws ApiException {
        String entityId = null;
        Workflowv3UpdateProductEntityRequest workflowv3UpdateProductEntityRequest = null;
        Workflowv3UpdateProductEntityResponse response = api.workflowUpdateProductEntity(entityId, workflowv3UpdateProductEntityRequest);
        // TODO: test validations
    }

    /**
     * Summary: Update tasks Description: Update multiple tasks for the same parent in one request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void workflowUpdateTasksTest() throws ApiException {
        String caseId = null;
        Workflowv3UpdateTasksRequest workflowv3UpdateTasksRequest = null;
        Workflowv3UpdateTasksResponse response = api.workflowUpdateTasks(caseId, workflowv3UpdateTasksRequest);
        // TODO: test validations
    }

}
