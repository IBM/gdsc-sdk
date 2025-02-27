// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { RuntimeError } from '../models/RuntimeError';
import { Workflowv3CaseListResponse } from '../models/Workflowv3CaseListResponse';
import { Workflowv3CreateCaseRequest } from '../models/Workflowv3CreateCaseRequest';
import { Workflowv3CreateCaseResponse } from '../models/Workflowv3CreateCaseResponse';
import { Workflowv3CreateProductEntityResponse } from '../models/Workflowv3CreateProductEntityResponse';
import { Workflowv3CreateTaskRequest } from '../models/Workflowv3CreateTaskRequest';
import { Workflowv3CreateTaskResponse } from '../models/Workflowv3CreateTaskResponse';
import { Workflowv3DeleteProductEntityResponse } from '../models/Workflowv3DeleteProductEntityResponse';
import { Workflowv3GetCasesCountRequest } from '../models/Workflowv3GetCasesCountRequest';
import { Workflowv3GetCasesCountResponse } from '../models/Workflowv3GetCasesCountResponse';
import { Workflowv3GetFilenameResponse } from '../models/Workflowv3GetFilenameResponse';
import { Workflowv3GetJobsCountRequest } from '../models/Workflowv3GetJobsCountRequest';
import { Workflowv3GetJobsCountResponse } from '../models/Workflowv3GetJobsCountResponse';
import { Workflowv3GetProductEntitiesResponse } from '../models/Workflowv3GetProductEntitiesResponse';
import { Workflowv3GetReportResultResponse } from '../models/Workflowv3GetReportResultResponse';
import { Workflowv3GetTasksCountRequest } from '../models/Workflowv3GetTasksCountRequest';
import { Workflowv3GetTasksCountResponse } from '../models/Workflowv3GetTasksCountResponse';
import { Workflowv3ProductEntity } from '../models/Workflowv3ProductEntity';
import { Workflowv3SearchCasesRequest } from '../models/Workflowv3SearchCasesRequest';
import { Workflowv3SearchReportsResponse } from '../models/Workflowv3SearchReportsResponse';
import { Workflowv3SearchTasksRequest } from '../models/Workflowv3SearchTasksRequest';
import { Workflowv3TaskListResponse } from '../models/Workflowv3TaskListResponse';
import { Workflowv3UpdateCasesRequest } from '../models/Workflowv3UpdateCasesRequest';
import { Workflowv3UpdateCasesResponse } from '../models/Workflowv3UpdateCasesResponse';
import { Workflowv3UpdateProductEntityRequest } from '../models/Workflowv3UpdateProductEntityRequest';
import { Workflowv3UpdateProductEntityResponse } from '../models/Workflowv3UpdateProductEntityResponse';
import { Workflowv3UpdateTasksRequest } from '../models/Workflowv3UpdateTasksRequest';
import { Workflowv3UpdateTasksResponse } from '../models/Workflowv3UpdateTasksResponse';
import { Workflowv3WorkflowEvent } from '../models/Workflowv3WorkflowEvent';
import { Workflowv3WorkflowEventResponse } from '../models/Workflowv3WorkflowEventResponse';

/**
 * no description
 */
export class WorkflowApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Create case Description: Create single case.
     * @param workflowv3CreateCaseRequest 
     */
    public async workflowCreateCase(workflowv3CreateCaseRequest: Workflowv3CreateCaseRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'workflowv3CreateCaseRequest' is not null or undefined
        if (workflowv3CreateCaseRequest === null || workflowv3CreateCaseRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowCreateCase", "workflowv3CreateCaseRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/cases';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3CreateCaseRequest, "Workflowv3CreateCaseRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Create product entity Description: Create single product entity.
     * @param workflowv3ProductEntity 
     */
    public async workflowCreateProductEntity(workflowv3ProductEntity: Workflowv3ProductEntity, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'workflowv3ProductEntity' is not null or undefined
        if (workflowv3ProductEntity === null || workflowv3ProductEntity === undefined) {
            throw new RequiredError("WorkflowApi", "workflowCreateProductEntity", "workflowv3ProductEntity");
        }


        // Path Params
        const localVarPath = '/api/v3/workflow/productentities';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3ProductEntity, "Workflowv3ProductEntity", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Create task Description: Create single task within a parent case.
     * @param caseId Create tasks with common parent.
     * @param workflowv3CreateTaskRequest 
     */
    public async workflowCreateTask(caseId: string, workflowv3CreateTaskRequest: Workflowv3CreateTaskRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'caseId' is not null or undefined
        if (caseId === null || caseId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowCreateTask", "caseId");
        }


        // verify required parameter 'workflowv3CreateTaskRequest' is not null or undefined
        if (workflowv3CreateTaskRequest === null || workflowv3CreateTaskRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowCreateTask", "workflowv3CreateTaskRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/cases/{case_id}/tasks'
            .replace('{' + 'case_id' + '}', encodeURIComponent(String(caseId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3CreateTaskRequest, "Workflowv3CreateTaskRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Post event for processing by workflow rules Description: Find matching workflow rule and run it
     * @param workflowv3WorkflowEvent 
     */
    public async workflowCreateWorkflowEvent(workflowv3WorkflowEvent: Workflowv3WorkflowEvent, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'workflowv3WorkflowEvent' is not null or undefined
        if (workflowv3WorkflowEvent === null || workflowv3WorkflowEvent === undefined) {
            throw new RequiredError("WorkflowApi", "workflowCreateWorkflowEvent", "workflowv3WorkflowEvent");
        }


        // Path Params
        const localVarPath = '/api/v3/workflow/event';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3WorkflowEvent, "Workflowv3WorkflowEvent", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Delete a product entity Description: Delete a single product entity.
     * @param entityId Unique id for the product entity
     */
    public async workflowDeleteProductEntity(entityId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'entityId' is not null or undefined
        if (entityId === null || entityId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowDeleteProductEntity", "entityId");
        }


        // Path Params
        const localVarPath = '/api/v3/workflow/productentities/{entity_id}'
            .replace('{' + 'entity_id' + '}', encodeURIComponent(String(entityId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get cases Description: Return all cases requested.
     * @param caseId Optional case_id to get a response of an array of one member.
     * @param sortBy Optional field to sort by | first character determines ascending (&gt;) or descending (&lt;).
     * @param offset Optional starting point for the page of data.
     * @param limit Optional page size.
     */
    public async workflowGetCases(caseId?: string, sortBy?: string, offset?: number, limit?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;





        // Path Params
        const localVarPath = '/api/v3/cases';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (caseId !== undefined) {
            requestContext.setQueryParam("case_id", ObjectSerializer.serialize(caseId, "string", ""));
        }

        // Query Params
        if (sortBy !== undefined) {
            requestContext.setQueryParam("sort_by", ObjectSerializer.serialize(sortBy, "string", ""));
        }

        // Query Params
        if (offset !== undefined) {
            requestContext.setQueryParam("offset", ObjectSerializer.serialize(offset, "number", "int32"));
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", "int32"));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get cases count Description: Get case count.
     * @param workflowv3GetCasesCountRequest 
     */
    public async workflowGetCasesCount(workflowv3GetCasesCountRequest: Workflowv3GetCasesCountRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'workflowv3GetCasesCountRequest' is not null or undefined
        if (workflowv3GetCasesCountRequest === null || workflowv3GetCasesCountRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetCasesCount", "workflowv3GetCasesCountRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/cases/count';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3GetCasesCountRequest, "Workflowv3GetCasesCountRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
     * @param caseId Can be \&quot;*\&quot; if JWT token contains the case_id.
     * @param taskId Can be \&quot;*\&quot; if JWT token contains the task_id.
     */
    public async workflowGetFilename(caseId: string, taskId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'caseId' is not null or undefined
        if (caseId === null || caseId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetFilename", "caseId");
        }


        // verify required parameter 'taskId' is not null or undefined
        if (taskId === null || taskId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetFilename", "taskId");
        }


        // Path Params
        const localVarPath = '/api/v3/cases/{case_id}/tasks/{task_id}/filename'
            .replace('{' + 'case_id' + '}', encodeURIComponent(String(caseId)))
            .replace('{' + 'task_id' + '}', encodeURIComponent(String(taskId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get jobs count Description: Get jobs count.
     * @param caseId Case ID - can be * for all
     * @param workflowv3GetJobsCountRequest 
     */
    public async workflowGetJobsCount(caseId: string, workflowv3GetJobsCountRequest: Workflowv3GetJobsCountRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'caseId' is not null or undefined
        if (caseId === null || caseId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetJobsCount", "caseId");
        }


        // verify required parameter 'workflowv3GetJobsCountRequest' is not null or undefined
        if (workflowv3GetJobsCountRequest === null || workflowv3GetJobsCountRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetJobsCount", "workflowv3GetJobsCountRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/cases/{case_id}/jobs/count'
            .replace('{' + 'case_id' + '}', encodeURIComponent(String(caseId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3GetJobsCountRequest, "Workflowv3GetJobsCountRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get products and their associated event entities Description: Return a list of integrated products and their associated event entities
     * @param offset Optional starting point for the page of data.
     * @param limit Optional page size.
     */
    public async workflowGetProductEntities(offset?: number, limit?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/workflow/productentities';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (offset !== undefined) {
            requestContext.setQueryParam("offset", ObjectSerializer.serialize(offset, "number", "int32"));
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", "int32"));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get event entity field names, field labels, and field data types Description: Return a list of fields similar to report headers
     * @param entityId Unique id for the product entity
     */
    public async workflowGetProductEntity(entityId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'entityId' is not null or undefined
        if (entityId === null || entityId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetProductEntity", "entityId");
        }


        // Path Params
        const localVarPath = '/api/v3/workflow/productentities/{entity_id}'
            .replace('{' + 'entity_id' + '}', encodeURIComponent(String(entityId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get report result Description: Return a page of results.
     * @param caseId ID to get the case  (read-only).
     * @param taskId ID to get the task for case(read-only).
     * @param offset Optional starting point for the page of data.
     * @param limit Optional page size.
     */
    public async workflowGetReportResult(caseId: string, taskId: string, offset?: number, limit?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'caseId' is not null or undefined
        if (caseId === null || caseId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetReportResult", "caseId");
        }


        // verify required parameter 'taskId' is not null or undefined
        if (taskId === null || taskId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetReportResult", "taskId");
        }




        // Path Params
        const localVarPath = '/api/v3/cases/{case_id}/tasks/{task_id}/result'
            .replace('{' + 'case_id' + '}', encodeURIComponent(String(caseId)))
            .replace('{' + 'task_id' + '}', encodeURIComponent(String(taskId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (offset !== undefined) {
            requestContext.setQueryParam("offset", ObjectSerializer.serialize(offset, "number", "int32"));
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", "int32"));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get tasks Description: Return all tasks requested.
     * @param caseId Mandaroty: The parent case which contains the tasks.
     * @param taskId Optional: task_id to return an array of one.
     */
    public async workflowGetTasks(caseId: string, taskId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'caseId' is not null or undefined
        if (caseId === null || caseId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetTasks", "caseId");
        }



        // Path Params
        const localVarPath = '/api/v3/cases/{case_id}/tasks'
            .replace('{' + 'case_id' + '}', encodeURIComponent(String(caseId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (taskId !== undefined) {
            requestContext.setQueryParam("task_id", ObjectSerializer.serialize(taskId, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get cases count Description: Get case count.
     * @param caseId Case ID - can be * for all
     * @param workflowv3GetTasksCountRequest 
     */
    public async workflowGetTasksCount(caseId: string, workflowv3GetTasksCountRequest: Workflowv3GetTasksCountRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'caseId' is not null or undefined
        if (caseId === null || caseId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetTasksCount", "caseId");
        }


        // verify required parameter 'workflowv3GetTasksCountRequest' is not null or undefined
        if (workflowv3GetTasksCountRequest === null || workflowv3GetTasksCountRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowGetTasksCount", "workflowv3GetTasksCountRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/cases/{case_id}/tasks/count'
            .replace('{' + 'case_id' + '}', encodeURIComponent(String(caseId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3GetTasksCountRequest, "Workflowv3GetTasksCountRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     * @param workflowv3SearchCasesRequest 
     */
    public async workflowSearchCases(workflowv3SearchCasesRequest: Workflowv3SearchCasesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'workflowv3SearchCasesRequest' is not null or undefined
        if (workflowv3SearchCasesRequest === null || workflowv3SearchCasesRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowSearchCases", "workflowv3SearchCasesRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/cases/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3SearchCasesRequest, "Workflowv3SearchCasesRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
     * @param workflowv3SearchCasesRequest 
     */
    public async workflowSearchReports(workflowv3SearchCasesRequest: Workflowv3SearchCasesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'workflowv3SearchCasesRequest' is not null or undefined
        if (workflowv3SearchCasesRequest === null || workflowv3SearchCasesRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowSearchReports", "workflowv3SearchCasesRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/cases/reports';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3SearchCasesRequest, "Workflowv3SearchCasesRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Search cases Description: Return a subset of cases.
     * @param caseId Case ID - can be * for all
     * @param workflowv3SearchTasksRequest 
     */
    public async workflowSearchTasks(caseId: string, workflowv3SearchTasksRequest: Workflowv3SearchTasksRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'caseId' is not null or undefined
        if (caseId === null || caseId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowSearchTasks", "caseId");
        }


        // verify required parameter 'workflowv3SearchTasksRequest' is not null or undefined
        if (workflowv3SearchTasksRequest === null || workflowv3SearchTasksRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowSearchTasks", "workflowv3SearchTasksRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/cases/{case_id}/tasks/search'
            .replace('{' + 'case_id' + '}', encodeURIComponent(String(caseId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3SearchTasksRequest, "Workflowv3SearchTasksRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Update cases Description: Update multiple cases in one request.
     * @param workflowv3UpdateCasesRequest 
     */
    public async workflowUpdateCases(workflowv3UpdateCasesRequest: Workflowv3UpdateCasesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'workflowv3UpdateCasesRequest' is not null or undefined
        if (workflowv3UpdateCasesRequest === null || workflowv3UpdateCasesRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowUpdateCases", "workflowv3UpdateCasesRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/cases';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3UpdateCasesRequest, "Workflowv3UpdateCasesRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Update a product entity Description: Update a single product entity.
     * @param entityId Unique Entity id, required for update.
     * @param workflowv3UpdateProductEntityRequest 
     */
    public async workflowUpdateProductEntity(entityId: string, workflowv3UpdateProductEntityRequest: Workflowv3UpdateProductEntityRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'entityId' is not null or undefined
        if (entityId === null || entityId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowUpdateProductEntity", "entityId");
        }


        // verify required parameter 'workflowv3UpdateProductEntityRequest' is not null or undefined
        if (workflowv3UpdateProductEntityRequest === null || workflowv3UpdateProductEntityRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowUpdateProductEntity", "workflowv3UpdateProductEntityRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/workflow/productentities/{entity_id}'
            .replace('{' + 'entity_id' + '}', encodeURIComponent(String(entityId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3UpdateProductEntityRequest, "Workflowv3UpdateProductEntityRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Update tasks Description: Update multiple tasks for the same parent in one request.
     * @param caseId Update tasks belonging to common parent.
     * @param workflowv3UpdateTasksRequest 
     */
    public async workflowUpdateTasks(caseId: string, workflowv3UpdateTasksRequest: Workflowv3UpdateTasksRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'caseId' is not null or undefined
        if (caseId === null || caseId === undefined) {
            throw new RequiredError("WorkflowApi", "workflowUpdateTasks", "caseId");
        }


        // verify required parameter 'workflowv3UpdateTasksRequest' is not null or undefined
        if (workflowv3UpdateTasksRequest === null || workflowv3UpdateTasksRequest === undefined) {
            throw new RequiredError("WorkflowApi", "workflowUpdateTasks", "workflowv3UpdateTasksRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/cases/{case_id}/tasks'
            .replace('{' + 'case_id' + '}', encodeURIComponent(String(caseId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(workflowv3UpdateTasksRequest, "Workflowv3UpdateTasksRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["BasicAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["ApiKeyAuth"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class WorkflowApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowCreateCase
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowCreateCaseWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3CreateCaseResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3CreateCaseResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3CreateCaseResponse", ""
            ) as Workflowv3CreateCaseResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3CreateCaseResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3CreateCaseResponse", ""
            ) as Workflowv3CreateCaseResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowCreateProductEntity
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowCreateProductEntityWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3CreateProductEntityResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3CreateProductEntityResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3CreateProductEntityResponse", ""
            ) as Workflowv3CreateProductEntityResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3CreateProductEntityResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3CreateProductEntityResponse", ""
            ) as Workflowv3CreateProductEntityResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowCreateTask
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowCreateTaskWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3CreateTaskResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3CreateTaskResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3CreateTaskResponse", ""
            ) as Workflowv3CreateTaskResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3CreateTaskResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3CreateTaskResponse", ""
            ) as Workflowv3CreateTaskResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowCreateWorkflowEvent
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowCreateWorkflowEventWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3WorkflowEventResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3WorkflowEventResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3WorkflowEventResponse", ""
            ) as Workflowv3WorkflowEventResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3WorkflowEventResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3WorkflowEventResponse", ""
            ) as Workflowv3WorkflowEventResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowDeleteProductEntity
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowDeleteProductEntityWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3DeleteProductEntityResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3DeleteProductEntityResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3DeleteProductEntityResponse", ""
            ) as Workflowv3DeleteProductEntityResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3DeleteProductEntityResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3DeleteProductEntityResponse", ""
            ) as Workflowv3DeleteProductEntityResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowGetCases
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowGetCasesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3CaseListResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3CaseListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3CaseListResponse", ""
            ) as Workflowv3CaseListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3CaseListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3CaseListResponse", ""
            ) as Workflowv3CaseListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowGetCasesCount
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowGetCasesCountWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3GetCasesCountResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3GetCasesCountResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetCasesCountResponse", ""
            ) as Workflowv3GetCasesCountResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3GetCasesCountResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetCasesCountResponse", ""
            ) as Workflowv3GetCasesCountResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowGetFilename
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowGetFilenameWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3GetFilenameResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3GetFilenameResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetFilenameResponse", ""
            ) as Workflowv3GetFilenameResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3GetFilenameResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetFilenameResponse", ""
            ) as Workflowv3GetFilenameResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowGetJobsCount
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowGetJobsCountWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3GetJobsCountResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3GetJobsCountResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetJobsCountResponse", ""
            ) as Workflowv3GetJobsCountResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3GetJobsCountResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetJobsCountResponse", ""
            ) as Workflowv3GetJobsCountResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowGetProductEntities
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowGetProductEntitiesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3GetProductEntitiesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3GetProductEntitiesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetProductEntitiesResponse", ""
            ) as Workflowv3GetProductEntitiesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3GetProductEntitiesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetProductEntitiesResponse", ""
            ) as Workflowv3GetProductEntitiesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowGetProductEntity
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowGetProductEntityWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3ProductEntity >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3ProductEntity = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3ProductEntity", ""
            ) as Workflowv3ProductEntity;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3ProductEntity = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3ProductEntity", ""
            ) as Workflowv3ProductEntity;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowGetReportResult
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowGetReportResultWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3GetReportResultResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3GetReportResultResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetReportResultResponse", ""
            ) as Workflowv3GetReportResultResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3GetReportResultResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetReportResultResponse", ""
            ) as Workflowv3GetReportResultResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowGetTasks
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowGetTasksWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3TaskListResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3TaskListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3TaskListResponse", ""
            ) as Workflowv3TaskListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3TaskListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3TaskListResponse", ""
            ) as Workflowv3TaskListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowGetTasksCount
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowGetTasksCountWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3GetTasksCountResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3GetTasksCountResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetTasksCountResponse", ""
            ) as Workflowv3GetTasksCountResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3GetTasksCountResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3GetTasksCountResponse", ""
            ) as Workflowv3GetTasksCountResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowSearchCases
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowSearchCasesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3CaseListResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3CaseListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3CaseListResponse", ""
            ) as Workflowv3CaseListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3CaseListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3CaseListResponse", ""
            ) as Workflowv3CaseListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowSearchReports
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowSearchReportsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3SearchReportsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3SearchReportsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3SearchReportsResponse", ""
            ) as Workflowv3SearchReportsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3SearchReportsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3SearchReportsResponse", ""
            ) as Workflowv3SearchReportsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowSearchTasks
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowSearchTasksWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3TaskListResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3TaskListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3TaskListResponse", ""
            ) as Workflowv3TaskListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3TaskListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3TaskListResponse", ""
            ) as Workflowv3TaskListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowUpdateCases
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowUpdateCasesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3UpdateCasesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3UpdateCasesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3UpdateCasesResponse", ""
            ) as Workflowv3UpdateCasesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3UpdateCasesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3UpdateCasesResponse", ""
            ) as Workflowv3UpdateCasesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowUpdateProductEntity
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowUpdateProductEntityWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3UpdateProductEntityResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3UpdateProductEntityResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3UpdateProductEntityResponse", ""
            ) as Workflowv3UpdateProductEntityResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3UpdateProductEntityResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3UpdateProductEntityResponse", ""
            ) as Workflowv3UpdateProductEntityResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to workflowUpdateTasks
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async workflowUpdateTasksWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Workflowv3UpdateTasksResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Workflowv3UpdateTasksResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3UpdateTasksResponse", ""
            ) as Workflowv3UpdateTasksResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: RuntimeError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "RuntimeError", ""
            ) as RuntimeError;
            throw new ApiException<RuntimeError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: Workflowv3UpdateTasksResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Workflowv3UpdateTasksResponse", ""
            ) as Workflowv3UpdateTasksResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
