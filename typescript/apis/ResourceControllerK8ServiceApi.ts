// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Resourcecontrollerk8v3App } from '../models/Resourcecontrollerk8v3App';
import { Resourcecontrollerk8v3Controller } from '../models/Resourcecontrollerk8v3Controller';
import { Resourcecontrollerk8v3ControllerCommand } from '../models/Resourcecontrollerk8v3ControllerCommand';
import { Resourcecontrollerk8v3ControllerHeartbeat } from '../models/Resourcecontrollerk8v3ControllerHeartbeat';
import { Resourcecontrollerk8v3ControllerStatus } from '../models/Resourcecontrollerk8v3ControllerStatus';
import { Resourcecontrollerk8v3CreateControllerRequest } from '../models/Resourcecontrollerk8v3CreateControllerRequest';
import { Resourcecontrollerk8v3CreateHeartBeatExResponse } from '../models/Resourcecontrollerk8v3CreateHeartBeatExResponse';
import { Resourcecontrollerk8v3CreateHeartBeatRequest } from '../models/Resourcecontrollerk8v3CreateHeartBeatRequest';
import { Resourcecontrollerk8v3CreateHeartBeatResponse } from '../models/Resourcecontrollerk8v3CreateHeartBeatResponse';
import { Resourcecontrollerk8v3CreateKeypairRequest } from '../models/Resourcecontrollerk8v3CreateKeypairRequest';
import { Resourcecontrollerk8v3CreateKeypairResponse } from '../models/Resourcecontrollerk8v3CreateKeypairResponse';
import { Resourcecontrollerk8v3DeleteControllerRequest } from '../models/Resourcecontrollerk8v3DeleteControllerRequest';
import { Resourcecontrollerk8v3DeleteControllerResponse } from '../models/Resourcecontrollerk8v3DeleteControllerResponse';
import { Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost } from '../models/Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost';
import { Resourcecontrollerk8v3DeleteEdgeTenantResponse } from '../models/Resourcecontrollerk8v3DeleteEdgeTenantResponse';
import { Resourcecontrollerk8v3DeleteJobRequest } from '../models/Resourcecontrollerk8v3DeleteJobRequest';
import { Resourcecontrollerk8v3DeleteJobResponse } from '../models/Resourcecontrollerk8v3DeleteJobResponse';
import { Resourcecontrollerk8v3DownloadControllerLogsRequest } from '../models/Resourcecontrollerk8v3DownloadControllerLogsRequest';
import { Resourcecontrollerk8v3DownloadControllerLogsResponse } from '../models/Resourcecontrollerk8v3DownloadControllerLogsResponse';
import { Resourcecontrollerk8v3EdgeResourceResponse } from '../models/Resourcecontrollerk8v3EdgeResourceResponse';
import { Resourcecontrollerk8v3EdgeTenantRequest } from '../models/Resourcecontrollerk8v3EdgeTenantRequest';
import { Resourcecontrollerk8v3GetControllerAppsResponse } from '../models/Resourcecontrollerk8v3GetControllerAppsResponse';
import { Resourcecontrollerk8v3GetControllerCommandsResponse } from '../models/Resourcecontrollerk8v3GetControllerCommandsResponse';
import { Resourcecontrollerk8v3GetControllerJobsResponse } from '../models/Resourcecontrollerk8v3GetControllerJobsResponse';
import { Resourcecontrollerk8v3GetControllersResponse } from '../models/Resourcecontrollerk8v3GetControllersResponse';
import { Resourcecontrollerk8v3GetControllersWithStatusResponse } from '../models/Resourcecontrollerk8v3GetControllersWithStatusResponse';
import { Resourcecontrollerk8v3GetJobExecutionsResponse } from '../models/Resourcecontrollerk8v3GetJobExecutionsResponse';
import { Resourcecontrollerk8v3GetTenantAppsResponse } from '../models/Resourcecontrollerk8v3GetTenantAppsResponse';
import { Resourcecontrollerk8v3GetTenantJobsResponse } from '../models/Resourcecontrollerk8v3GetTenantJobsResponse';
import { Resourcecontrollerk8v3Job } from '../models/Resourcecontrollerk8v3Job';
import { Resourcecontrollerk8v3JobExecution } from '../models/Resourcecontrollerk8v3JobExecution';
import { Resourcecontrollerk8v3JobStatusDTO } from '../models/Resourcecontrollerk8v3JobStatusDTO';
import { Resourcecontrollerk8v3QueryControllerLogsRequest } from '../models/Resourcecontrollerk8v3QueryControllerLogsRequest';
import { Resourcecontrollerk8v3QueryControllerLogsResponse } from '../models/Resourcecontrollerk8v3QueryControllerLogsResponse';
import { Resourcecontrollerk8v3UpdateJobExecutionRequest } from '../models/Resourcecontrollerk8v3UpdateJobExecutionRequest';
import { Resourcecontrollerk8v3UpdateJobStatusRequest } from '../models/Resourcecontrollerk8v3UpdateJobStatusRequest';
import { Resourcecontrollerk8v3Version } from '../models/Resourcecontrollerk8v3Version';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class ResourceControllerK8ServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * CreateController - Add a new controller.
     * @param resourcecontrollerk8v3CreateControllerRequest 
     */
    public async resourceControllerK8ServiceCreateController(resourcecontrollerk8v3CreateControllerRequest: Resourcecontrollerk8v3CreateControllerRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'resourcecontrollerk8v3CreateControllerRequest' is not null or undefined
        if (resourcecontrollerk8v3CreateControllerRequest === null || resourcecontrollerk8v3CreateControllerRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceCreateController", "resourcecontrollerk8v3CreateControllerRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3CreateControllerRequest, "Resourcecontrollerk8v3CreateControllerRequest", ""),
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
     * CreateHeartBeat - Create a heartbeat for the controller.
     * @param controllerId The ID of the controller to invoke a heartbeat on.
     * @param resourcecontrollerk8v3CreateHeartBeatRequest 
     */
    public async resourceControllerK8ServiceCreateHeartBeat(controllerId: string, resourcecontrollerk8v3CreateHeartBeatRequest: Resourcecontrollerk8v3CreateHeartBeatRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'controllerId' is not null or undefined
        if (controllerId === null || controllerId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceCreateHeartBeat", "controllerId");
        }


        // verify required parameter 'resourcecontrollerk8v3CreateHeartBeatRequest' is not null or undefined
        if (resourcecontrollerk8v3CreateHeartBeatRequest === null || resourcecontrollerk8v3CreateHeartBeatRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceCreateHeartBeat", "resourcecontrollerk8v3CreateHeartBeatRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{controller_id}/heartbeat'
            .replace('{' + 'controller_id' + '}', encodeURIComponent(String(controllerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3CreateHeartBeatRequest, "Resourcecontrollerk8v3CreateHeartBeatRequest", ""),
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
     * CreateHeartBeatEx - Create a heartbeat for the controller with extended information.
     * @param controllerId Optional: controller id
     * @param resourcecontrollerk8v3ControllerHeartbeat 
     */
    public async resourceControllerK8ServiceCreateHeartBeatEx(controllerId: string, resourcecontrollerk8v3ControllerHeartbeat: Resourcecontrollerk8v3ControllerHeartbeat, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'controllerId' is not null or undefined
        if (controllerId === null || controllerId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceCreateHeartBeatEx", "controllerId");
        }


        // verify required parameter 'resourcecontrollerk8v3ControllerHeartbeat' is not null or undefined
        if (resourcecontrollerk8v3ControllerHeartbeat === null || resourcecontrollerk8v3ControllerHeartbeat === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceCreateHeartBeatEx", "resourcecontrollerk8v3ControllerHeartbeat");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{controller_id}/heartbeat_ex'
            .replace('{' + 'controller_id' + '}', encodeURIComponent(String(controllerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3ControllerHeartbeat, "Resourcecontrollerk8v3ControllerHeartbeat", ""),
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
     * //////////////////////////////////////////////////////////////// Interface to the controllers and apps api in the App-Manager microservice CreateJob - Create a job definition. Files and secrets contained within will also be created.
     * @param resourcecontrollerk8v3Job 
     */
    public async resourceControllerK8ServiceCreateJob(resourcecontrollerk8v3Job: Resourcecontrollerk8v3Job, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'resourcecontrollerk8v3Job' is not null or undefined
        if (resourcecontrollerk8v3Job === null || resourcecontrollerk8v3Job === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceCreateJob", "resourcecontrollerk8v3Job");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/jobs';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3Job, "Resourcecontrollerk8v3Job", ""),
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
     * CreateJobExecution - Create a job execution.
     * @param resourcecontrollerk8v3JobExecution 
     */
    public async resourceControllerK8ServiceCreateJobExecution(resourcecontrollerk8v3JobExecution: Resourcecontrollerk8v3JobExecution, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'resourcecontrollerk8v3JobExecution' is not null or undefined
        if (resourcecontrollerk8v3JobExecution === null || resourcecontrollerk8v3JobExecution === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceCreateJobExecution", "resourcecontrollerk8v3JobExecution");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/job_executions';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3JobExecution, "Resourcecontrollerk8v3JobExecution", ""),
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
     * CreateKeypair - Create a new keypair for the controller.
     * @param controllerId The ID of the controller to get app tests for.
     * @param resourcecontrollerk8v3CreateKeypairRequest 
     */
    public async resourceControllerK8ServiceCreateKeypair(controllerId: string, resourcecontrollerk8v3CreateKeypairRequest: Resourcecontrollerk8v3CreateKeypairRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'controllerId' is not null or undefined
        if (controllerId === null || controllerId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceCreateKeypair", "controllerId");
        }


        // verify required parameter 'resourcecontrollerk8v3CreateKeypairRequest' is not null or undefined
        if (resourcecontrollerk8v3CreateKeypairRequest === null || resourcecontrollerk8v3CreateKeypairRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceCreateKeypair", "resourcecontrollerk8v3CreateKeypairRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{controller_id}/keypair'
            .replace('{' + 'controller_id' + '}', encodeURIComponent(String(controllerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3CreateKeypairRequest, "Resourcecontrollerk8v3CreateKeypairRequest", ""),
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
     * DeleteController - Delete a controller.
     * @param controllerId The ID of the controller to get the status.
     * @param resourcecontrollerk8v3DeleteControllerRequest 
     */
    public async resourceControllerK8ServiceDeleteController(controllerId: string, resourcecontrollerk8v3DeleteControllerRequest: Resourcecontrollerk8v3DeleteControllerRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'controllerId' is not null or undefined
        if (controllerId === null || controllerId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceDeleteController", "controllerId");
        }


        // verify required parameter 'resourcecontrollerk8v3DeleteControllerRequest' is not null or undefined
        if (resourcecontrollerk8v3DeleteControllerRequest === null || resourcecontrollerk8v3DeleteControllerRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceDeleteController", "resourcecontrollerk8v3DeleteControllerRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{controller_id}'
            .replace('{' + 'controller_id' + '}', encodeURIComponent(String(controllerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3DeleteControllerRequest, "Resourcecontrollerk8v3DeleteControllerRequest", ""),
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
     * DeleteEdgeTenant - deletes an edge tenant providing edge tenant id
     * @param tenantId ID of the tenant to delete
     * @param resourcecontrollerk8v3DeleteEdgeTenantRequestApphost 
     */
    public async resourceControllerK8ServiceDeleteEdgeTenant(tenantId: string, resourcecontrollerk8v3DeleteEdgeTenantRequestApphost: Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantId' is not null or undefined
        if (tenantId === null || tenantId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceDeleteEdgeTenant", "tenantId");
        }


        // verify required parameter 'resourcecontrollerk8v3DeleteEdgeTenantRequestApphost' is not null or undefined
        if (resourcecontrollerk8v3DeleteEdgeTenantRequestApphost === null || resourcecontrollerk8v3DeleteEdgeTenantRequestApphost === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceDeleteEdgeTenant", "resourcecontrollerk8v3DeleteEdgeTenantRequestApphost");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/tenants/{tenant_id}'
            .replace('{' + 'tenant_id' + '}', encodeURIComponent(String(tenantId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3DeleteEdgeTenantRequestApphost, "Resourcecontrollerk8v3DeleteEdgeTenantRequestApphost", ""),
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
     * DeleteEdgeTenantRequest to deletes gi and tnt CR on edge
     * @param tenantId Tenant ID for the redge request.
     * @param edgeId ID of the edge system.
     * @param edgeName Edge gateway ID.
     */
    public async resourceControllerK8ServiceDeleteEdgeTenantRequest(tenantId?: string, edgeId?: string, edgeName?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;




        // Path Params
        const localVarPath = '/api/v3/edges';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (tenantId !== undefined) {
            requestContext.setQueryParam("tenant_id", ObjectSerializer.serialize(tenantId, "string", ""));
        }

        // Query Params
        if (edgeId !== undefined) {
            requestContext.setQueryParam("edge_id", ObjectSerializer.serialize(edgeId, "string", ""));
        }

        // Query Params
        if (edgeName !== undefined) {
            requestContext.setQueryParam("edge_name", ObjectSerializer.serialize(edgeName, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
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
     * DeleteJob - Delete a job.
     * @param jobId ID of the job that needs to be deleted.
     * @param resourcecontrollerk8v3DeleteJobRequest 
     */
    public async resourceControllerK8ServiceDeleteJob(jobId: string, resourcecontrollerk8v3DeleteJobRequest: Resourcecontrollerk8v3DeleteJobRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jobId' is not null or undefined
        if (jobId === null || jobId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceDeleteJob", "jobId");
        }


        // verify required parameter 'resourcecontrollerk8v3DeleteJobRequest' is not null or undefined
        if (resourcecontrollerk8v3DeleteJobRequest === null || resourcecontrollerk8v3DeleteJobRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceDeleteJob", "resourcecontrollerk8v3DeleteJobRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/jobs/{job_id}'
            .replace('{' + 'job_id' + '}', encodeURIComponent(String(jobId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3DeleteJobRequest, "Resourcecontrollerk8v3DeleteJobRequest", ""),
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
     * DownloadControllerLogs - Download the controller logs for a running controller.
     * @param controllerId The ID of the controller to download logs for.
     * @param resourcecontrollerk8v3DownloadControllerLogsRequest 
     */
    public async resourceControllerK8ServiceDownloadControllerLogs(controllerId: string, resourcecontrollerk8v3DownloadControllerLogsRequest: Resourcecontrollerk8v3DownloadControllerLogsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'controllerId' is not null or undefined
        if (controllerId === null || controllerId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceDownloadControllerLogs", "controllerId");
        }


        // verify required parameter 'resourcecontrollerk8v3DownloadControllerLogsRequest' is not null or undefined
        if (resourcecontrollerk8v3DownloadControllerLogsRequest === null || resourcecontrollerk8v3DownloadControllerLogsRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceDownloadControllerLogs", "resourcecontrollerk8v3DownloadControllerLogsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{controller_id}/logs'
            .replace('{' + 'controller_id' + '}', encodeURIComponent(String(controllerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3DownloadControllerLogsRequest, "Resourcecontrollerk8v3DownloadControllerLogsRequest", ""),
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
     * GetControllerApps - Get the apps for the given controller.
     * @param controllerId The ID of the controller to get apps for.
     * @param modifiedSince Only get the apps if any were modified since the given date.
     */
    public async resourceControllerK8ServiceGetControllerApps(controllerId: string, modifiedSince?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'controllerId' is not null or undefined
        if (controllerId === null || controllerId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetControllerApps", "controllerId");
        }



        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{controller_id}/apps'
            .replace('{' + 'controller_id' + '}', encodeURIComponent(String(controllerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (modifiedSince !== undefined) {
            requestContext.setQueryParam("modified_since", ObjectSerializer.serialize(modifiedSince, "string", "int64"));
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
     * GetControllerCommands - Get the commands for the controller to execute.
     * @param controllerId The ID of the controller to get commands for.
     */
    public async resourceControllerK8ServiceGetControllerCommands(controllerId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'controllerId' is not null or undefined
        if (controllerId === null || controllerId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetControllerCommands", "controllerId");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{controller_id}/commands'
            .replace('{' + 'controller_id' + '}', encodeURIComponent(String(controllerId)));

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
     * GetControllerJobs - Get the jobs for the controller to execute.
     * @param controllerId The ID of the controller to get jobs for.
     * @param modifiedSince Optional: Only get the jobs if any were modified since the given date.
     */
    public async resourceControllerK8ServiceGetControllerJobs(controllerId: string, modifiedSince?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'controllerId' is not null or undefined
        if (controllerId === null || controllerId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetControllerJobs", "controllerId");
        }



        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{controller_id}/jobs'
            .replace('{' + 'controller_id' + '}', encodeURIComponent(String(controllerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (modifiedSince !== undefined) {
            requestContext.setQueryParam("modified_since", ObjectSerializer.serialize(modifiedSince, "string", "int64"));
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
     * GetControllerStatus - Get the status for the given controller.
     * @param controllerId The ID of the controller to get the status.
     */
    public async resourceControllerK8ServiceGetControllerStatus(controllerId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'controllerId' is not null or undefined
        if (controllerId === null || controllerId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetControllerStatus", "controllerId");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{controller_id}/status'
            .replace('{' + 'controller_id' + '}', encodeURIComponent(String(controllerId)));

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
     * GetControllers - Get the controllers for the given tenant.
     * @param tenantId The ID of the tenant to get controllers for.
     * @param wantLocal Used to indicate the caller wants the local controller.
     */
    public async resourceControllerK8ServiceGetControllers(tenantId: string, wantLocal?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantId' is not null or undefined
        if (tenantId === null || tenantId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetControllers", "tenantId");
        }



        // Path Params
        const localVarPath = '/api/v3/edge_manager/tenants/{tenant_id}/controllers'
            .replace('{' + 'tenant_id' + '}', encodeURIComponent(String(tenantId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (wantLocal !== undefined) {
            requestContext.setQueryParam("want_local", ObjectSerializer.serialize(wantLocal, "boolean", ""));
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
     * GetControllersWithStatus - Get the controllers for the given tenant with computed status.
     * @param tenantId The ID of the tenant to get controllers for.
     * @param wantLocal Used to indicate the caller wants the local controller.
     * @param controllerId \&quot;ALL\&quot;: for getting all controllers; &lt;controller_id&gt;: for getting single controller.
     */
    public async resourceControllerK8ServiceGetControllersWithStatus(tenantId: string, wantLocal?: boolean, controllerId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantId' is not null or undefined
        if (tenantId === null || tenantId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetControllersWithStatus", "tenantId");
        }




        // Path Params
        const localVarPath = '/api/v3/edge_manager/tenants/{tenant_id}/controller_status'
            .replace('{' + 'tenant_id' + '}', encodeURIComponent(String(tenantId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (wantLocal !== undefined) {
            requestContext.setQueryParam("want_local", ObjectSerializer.serialize(wantLocal, "boolean", ""));
        }

        // Query Params
        if (controllerId !== undefined) {
            requestContext.setQueryParam("controller_id", ObjectSerializer.serialize(controllerId, "string", ""));
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
     * GetJob - Get the job.
     * @param jobId The ID of the job to get.
     * @param wantSecretValues Optional: True to return secret values, false otherwise.
     */
    public async resourceControllerK8ServiceGetJob(jobId: string, wantSecretValues?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jobId' is not null or undefined
        if (jobId === null || jobId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetJob", "jobId");
        }



        // Path Params
        const localVarPath = '/api/v3/edge_manager/jobs/{job_id}'
            .replace('{' + 'job_id' + '}', encodeURIComponent(String(jobId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (wantSecretValues !== undefined) {
            requestContext.setQueryParam("want_secret_values", ObjectSerializer.serialize(wantSecretValues, "boolean", ""));
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
     * GetJobExecution - Get a job execution.
     * @param jobexeId The ID of the job execution to get.
     */
    public async resourceControllerK8ServiceGetJobExecution(jobexeId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jobexeId' is not null or undefined
        if (jobexeId === null || jobexeId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetJobExecution", "jobexeId");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/job_executions/{jobexe_id}'
            .replace('{' + 'jobexe_id' + '}', encodeURIComponent(String(jobexeId)));

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
     * GetJobExecutions - Get the job executions.
     * @param jobId The ID of the job to get status.
     */
    public async resourceControllerK8ServiceGetJobExecutions(jobId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jobId' is not null or undefined
        if (jobId === null || jobId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetJobExecutions", "jobId");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/jobs/{job_id}/executions'
            .replace('{' + 'job_id' + '}', encodeURIComponent(String(jobId)));

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
     * GetJobStatus - Get the job\'s status.
     * @param jobId The ID of the job to get status.
     */
    public async resourceControllerK8ServiceGetJobStatus(jobId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jobId' is not null or undefined
        if (jobId === null || jobId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetJobStatus", "jobId");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/jobs/{job_id}/status'
            .replace('{' + 'job_id' + '}', encodeURIComponent(String(jobId)));

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
     * GetTenantApp - Get a specific app for the given tenant.
     * @param tenantId The ID of the tenant to get apps for.
     * @param appName The name of the app to get.
     * @param returnLevel Optional: specify a return level for the data. This will control the amount of data returned.
     */
    public async resourceControllerK8ServiceGetTenantApp(tenantId: string, appName: string, returnLevel?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantId' is not null or undefined
        if (tenantId === null || tenantId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetTenantApp", "tenantId");
        }


        // verify required parameter 'appName' is not null or undefined
        if (appName === null || appName === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetTenantApp", "appName");
        }



        // Path Params
        const localVarPath = '/api/v3/edge_manager/tenants/{tenant_id}/apps/{app_name}'
            .replace('{' + 'tenant_id' + '}', encodeURIComponent(String(tenantId)))
            .replace('{' + 'app_name' + '}', encodeURIComponent(String(appName)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (returnLevel !== undefined) {
            requestContext.setQueryParam("return_level", ObjectSerializer.serialize(returnLevel, "string", ""));
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
     * GetTenantApps - Get the apps for the given tenant.
     * @param tenantId The ID of the tenant to get apps for.
     * @param returnLevel Optional: specify a return level for the data. This will control the amount of data returned.
     */
    public async resourceControllerK8ServiceGetTenantApps(tenantId: string, returnLevel?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantId' is not null or undefined
        if (tenantId === null || tenantId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetTenantApps", "tenantId");
        }



        // Path Params
        const localVarPath = '/api/v3/edge_manager/tenants/{tenant_id}/apps'
            .replace('{' + 'tenant_id' + '}', encodeURIComponent(String(tenantId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (returnLevel !== undefined) {
            requestContext.setQueryParam("return_level", ObjectSerializer.serialize(returnLevel, "string", ""));
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
     * GetTenantJobs - Get jobs for the given tenant.
     * @param tenantId The ID of the tenant to get jobs for.
     */
    public async resourceControllerK8ServiceGetTenantJobs(tenantId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantId' is not null or undefined
        if (tenantId === null || tenantId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceGetTenantJobs", "tenantId");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/tenants/{tenant_id}/jobs'
            .replace('{' + 'tenant_id' + '}', encodeURIComponent(String(tenantId)));

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
     * GetVersion - Get the system version information for the service.
     */
    public async resourceControllerK8ServiceGetVersion(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/edge_manager/system/version';

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
     * InstallEdgeTenantRequest to Create gi and tnt CRs on edge
     * @param resourcecontrollerk8v3EdgeTenantRequest 
     */
    public async resourceControllerK8ServiceInstallEdgeTenantRequest(resourcecontrollerk8v3EdgeTenantRequest: Resourcecontrollerk8v3EdgeTenantRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'resourcecontrollerk8v3EdgeTenantRequest' is not null or undefined
        if (resourcecontrollerk8v3EdgeTenantRequest === null || resourcecontrollerk8v3EdgeTenantRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceInstallEdgeTenantRequest", "resourcecontrollerk8v3EdgeTenantRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edges';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3EdgeTenantRequest, "Resourcecontrollerk8v3EdgeTenantRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
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
     * QueryControllerLogs - Query for the controller logs for a running controller.
     * @param controllerId The ID of the controller to get logs for.
     * @param resourcecontrollerk8v3QueryControllerLogsRequest 
     */
    public async resourceControllerK8ServiceQueryControllerLogs(controllerId: string, resourcecontrollerk8v3QueryControllerLogsRequest: Resourcecontrollerk8v3QueryControllerLogsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'controllerId' is not null or undefined
        if (controllerId === null || controllerId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceQueryControllerLogs", "controllerId");
        }


        // verify required parameter 'resourcecontrollerk8v3QueryControllerLogsRequest' is not null or undefined
        if (resourcecontrollerk8v3QueryControllerLogsRequest === null || resourcecontrollerk8v3QueryControllerLogsRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceQueryControllerLogs", "resourcecontrollerk8v3QueryControllerLogsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{controller_id}/logs/query'
            .replace('{' + 'controller_id' + '}', encodeURIComponent(String(controllerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3QueryControllerLogsRequest, "Resourcecontrollerk8v3QueryControllerLogsRequest", ""),
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
     * UpdateCommand - Update the command.
     * @param id The ID of the command.
     * @param resourcecontrollerk8v3ControllerCommand 
     */
    public async resourceControllerK8ServiceUpdateCommand(id: string, resourcecontrollerk8v3ControllerCommand: Resourcecontrollerk8v3ControllerCommand, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateCommand", "id");
        }


        // verify required parameter 'resourcecontrollerk8v3ControllerCommand' is not null or undefined
        if (resourcecontrollerk8v3ControllerCommand === null || resourcecontrollerk8v3ControllerCommand === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateCommand", "resourcecontrollerk8v3ControllerCommand");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/commands/{id}'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3ControllerCommand, "Resourcecontrollerk8v3ControllerCommand", ""),
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
     * UpdateController - Update an existing controller.
     * @param id Optional: The internal ID of the controller.
     * @param resourcecontrollerk8v3Controller 
     */
    public async resourceControllerK8ServiceUpdateController(id: string, resourcecontrollerk8v3Controller: Resourcecontrollerk8v3Controller, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateController", "id");
        }


        // verify required parameter 'resourcecontrollerk8v3Controller' is not null or undefined
        if (resourcecontrollerk8v3Controller === null || resourcecontrollerk8v3Controller === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateController", "resourcecontrollerk8v3Controller");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{id}'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3Controller, "Resourcecontrollerk8v3Controller", ""),
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
     * UpdateControllerStatus - Updates the status for the given controller.
     * @param id The internal ID of the controller.
     * @param resourcecontrollerk8v3ControllerStatus 
     */
    public async resourceControllerK8ServiceUpdateControllerStatus(id: string, resourcecontrollerk8v3ControllerStatus: Resourcecontrollerk8v3ControllerStatus, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateControllerStatus", "id");
        }


        // verify required parameter 'resourcecontrollerk8v3ControllerStatus' is not null or undefined
        if (resourcecontrollerk8v3ControllerStatus === null || resourcecontrollerk8v3ControllerStatus === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateControllerStatus", "resourcecontrollerk8v3ControllerStatus");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/controllers/{id}/status'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3ControllerStatus, "Resourcecontrollerk8v3ControllerStatus", ""),
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
     * UpdateEdgeTenantRequest to update gi and tnt CRs on edge
     * @param edgeId ID of the edge system
     * @param resourcecontrollerk8v3EdgeTenantRequest 
     */
    public async resourceControllerK8ServiceUpdateEdgeTenantRequest(edgeId: string, resourcecontrollerk8v3EdgeTenantRequest: Resourcecontrollerk8v3EdgeTenantRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'edgeId' is not null or undefined
        if (edgeId === null || edgeId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateEdgeTenantRequest", "edgeId");
        }


        // verify required parameter 'resourcecontrollerk8v3EdgeTenantRequest' is not null or undefined
        if (resourcecontrollerk8v3EdgeTenantRequest === null || resourcecontrollerk8v3EdgeTenantRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateEdgeTenantRequest", "resourcecontrollerk8v3EdgeTenantRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edges/{edge_id}'
            .replace('{' + 'edge_id' + '}', encodeURIComponent(String(edgeId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3EdgeTenantRequest, "Resourcecontrollerk8v3EdgeTenantRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
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
     * UpdateJob - Update a job.
     * @param id The ID of the job.
     * @param resourcecontrollerk8v3Job 
     */
    public async resourceControllerK8ServiceUpdateJob(id: string, resourcecontrollerk8v3Job: Resourcecontrollerk8v3Job, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateJob", "id");
        }


        // verify required parameter 'resourcecontrollerk8v3Job' is not null or undefined
        if (resourcecontrollerk8v3Job === null || resourcecontrollerk8v3Job === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateJob", "resourcecontrollerk8v3Job");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/jobs/{id}'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3Job, "Resourcecontrollerk8v3Job", ""),
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
     * UpdateJobExecution - Update a job execution.
     * @param id The ID of the job execution to update.
     * @param resourcecontrollerk8v3UpdateJobExecutionRequest 
     */
    public async resourceControllerK8ServiceUpdateJobExecution(id: string, resourcecontrollerk8v3UpdateJobExecutionRequest: Resourcecontrollerk8v3UpdateJobExecutionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'id' is not null or undefined
        if (id === null || id === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateJobExecution", "id");
        }


        // verify required parameter 'resourcecontrollerk8v3UpdateJobExecutionRequest' is not null or undefined
        if (resourcecontrollerk8v3UpdateJobExecutionRequest === null || resourcecontrollerk8v3UpdateJobExecutionRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateJobExecution", "resourcecontrollerk8v3UpdateJobExecutionRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/job_executions/{id}'
            .replace('{' + 'id' + '}', encodeURIComponent(String(id)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3UpdateJobExecutionRequest, "Resourcecontrollerk8v3UpdateJobExecutionRequest", ""),
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
     * UpdateJobStatus - Updates the status for the given Job.
     * @param jobId The ID of the job to get status.
     * @param resourcecontrollerk8v3UpdateJobStatusRequest 
     */
    public async resourceControllerK8ServiceUpdateJobStatus(jobId: string, resourcecontrollerk8v3UpdateJobStatusRequest: Resourcecontrollerk8v3UpdateJobStatusRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'jobId' is not null or undefined
        if (jobId === null || jobId === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateJobStatus", "jobId");
        }


        // verify required parameter 'resourcecontrollerk8v3UpdateJobStatusRequest' is not null or undefined
        if (resourcecontrollerk8v3UpdateJobStatusRequest === null || resourcecontrollerk8v3UpdateJobStatusRequest === undefined) {
            throw new RequiredError("ResourceControllerK8ServiceApi", "resourceControllerK8ServiceUpdateJobStatus", "resourcecontrollerk8v3UpdateJobStatusRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/edge_manager/jobs/{job_id}/status'
            .replace('{' + 'job_id' + '}', encodeURIComponent(String(jobId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(resourcecontrollerk8v3UpdateJobStatusRequest, "Resourcecontrollerk8v3UpdateJobStatusRequest", ""),
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

export class ResourceControllerK8ServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceCreateController
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceCreateControllerWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3Controller >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3Controller = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Controller", ""
            ) as Resourcecontrollerk8v3Controller;
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
            const body: Resourcecontrollerk8v3Controller = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Controller", ""
            ) as Resourcecontrollerk8v3Controller;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceCreateHeartBeat
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceCreateHeartBeatWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3CreateHeartBeatResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3CreateHeartBeatResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3CreateHeartBeatResponse", ""
            ) as Resourcecontrollerk8v3CreateHeartBeatResponse;
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
            const body: Resourcecontrollerk8v3CreateHeartBeatResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3CreateHeartBeatResponse", ""
            ) as Resourcecontrollerk8v3CreateHeartBeatResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceCreateHeartBeatEx
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceCreateHeartBeatExWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3CreateHeartBeatExResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3CreateHeartBeatExResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3CreateHeartBeatExResponse", ""
            ) as Resourcecontrollerk8v3CreateHeartBeatExResponse;
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
            const body: Resourcecontrollerk8v3CreateHeartBeatExResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3CreateHeartBeatExResponse", ""
            ) as Resourcecontrollerk8v3CreateHeartBeatExResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceCreateJob
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceCreateJobWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3Job >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3Job = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Job", ""
            ) as Resourcecontrollerk8v3Job;
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
            const body: Resourcecontrollerk8v3Job = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Job", ""
            ) as Resourcecontrollerk8v3Job;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceCreateJobExecution
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceCreateJobExecutionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3JobExecution >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3JobExecution = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3JobExecution", ""
            ) as Resourcecontrollerk8v3JobExecution;
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
            const body: Resourcecontrollerk8v3JobExecution = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3JobExecution", ""
            ) as Resourcecontrollerk8v3JobExecution;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceCreateKeypair
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceCreateKeypairWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3CreateKeypairResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3CreateKeypairResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3CreateKeypairResponse", ""
            ) as Resourcecontrollerk8v3CreateKeypairResponse;
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
            const body: Resourcecontrollerk8v3CreateKeypairResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3CreateKeypairResponse", ""
            ) as Resourcecontrollerk8v3CreateKeypairResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceDeleteController
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceDeleteControllerWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3DeleteControllerResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3DeleteControllerResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3DeleteControllerResponse", ""
            ) as Resourcecontrollerk8v3DeleteControllerResponse;
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
            const body: Resourcecontrollerk8v3DeleteControllerResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3DeleteControllerResponse", ""
            ) as Resourcecontrollerk8v3DeleteControllerResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceDeleteEdgeTenant
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceDeleteEdgeTenantWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3DeleteEdgeTenantResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3DeleteEdgeTenantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3DeleteEdgeTenantResponse", ""
            ) as Resourcecontrollerk8v3DeleteEdgeTenantResponse;
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
            const body: Resourcecontrollerk8v3DeleteEdgeTenantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3DeleteEdgeTenantResponse", ""
            ) as Resourcecontrollerk8v3DeleteEdgeTenantResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceDeleteEdgeTenantRequest
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceDeleteEdgeTenantRequestWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3EdgeResourceResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3EdgeResourceResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3EdgeResourceResponse", ""
            ) as Resourcecontrollerk8v3EdgeResourceResponse;
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
            const body: Resourcecontrollerk8v3EdgeResourceResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3EdgeResourceResponse", ""
            ) as Resourcecontrollerk8v3EdgeResourceResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceDeleteJob
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceDeleteJobWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3DeleteJobResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3DeleteJobResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3DeleteJobResponse", ""
            ) as Resourcecontrollerk8v3DeleteJobResponse;
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
            const body: Resourcecontrollerk8v3DeleteJobResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3DeleteJobResponse", ""
            ) as Resourcecontrollerk8v3DeleteJobResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceDownloadControllerLogs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceDownloadControllerLogsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3DownloadControllerLogsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3DownloadControllerLogsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3DownloadControllerLogsResponse", ""
            ) as Resourcecontrollerk8v3DownloadControllerLogsResponse;
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
            const body: Resourcecontrollerk8v3DownloadControllerLogsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3DownloadControllerLogsResponse", ""
            ) as Resourcecontrollerk8v3DownloadControllerLogsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetControllerApps
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetControllerAppsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3GetControllerAppsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3GetControllerAppsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetControllerAppsResponse", ""
            ) as Resourcecontrollerk8v3GetControllerAppsResponse;
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
            const body: Resourcecontrollerk8v3GetControllerAppsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetControllerAppsResponse", ""
            ) as Resourcecontrollerk8v3GetControllerAppsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetControllerCommands
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetControllerCommandsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3GetControllerCommandsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3GetControllerCommandsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetControllerCommandsResponse", ""
            ) as Resourcecontrollerk8v3GetControllerCommandsResponse;
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
            const body: Resourcecontrollerk8v3GetControllerCommandsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetControllerCommandsResponse", ""
            ) as Resourcecontrollerk8v3GetControllerCommandsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetControllerJobs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetControllerJobsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3GetControllerJobsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3GetControllerJobsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetControllerJobsResponse", ""
            ) as Resourcecontrollerk8v3GetControllerJobsResponse;
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
            const body: Resourcecontrollerk8v3GetControllerJobsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetControllerJobsResponse", ""
            ) as Resourcecontrollerk8v3GetControllerJobsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetControllerStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetControllerStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3ControllerStatus >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3ControllerStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3ControllerStatus", ""
            ) as Resourcecontrollerk8v3ControllerStatus;
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
            const body: Resourcecontrollerk8v3ControllerStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3ControllerStatus", ""
            ) as Resourcecontrollerk8v3ControllerStatus;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetControllers
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetControllersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3GetControllersResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3GetControllersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetControllersResponse", ""
            ) as Resourcecontrollerk8v3GetControllersResponse;
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
            const body: Resourcecontrollerk8v3GetControllersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetControllersResponse", ""
            ) as Resourcecontrollerk8v3GetControllersResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetControllersWithStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetControllersWithStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3GetControllersWithStatusResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3GetControllersWithStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetControllersWithStatusResponse", ""
            ) as Resourcecontrollerk8v3GetControllersWithStatusResponse;
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
            const body: Resourcecontrollerk8v3GetControllersWithStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetControllersWithStatusResponse", ""
            ) as Resourcecontrollerk8v3GetControllersWithStatusResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetJob
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetJobWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3Job >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3Job = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Job", ""
            ) as Resourcecontrollerk8v3Job;
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
            const body: Resourcecontrollerk8v3Job = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Job", ""
            ) as Resourcecontrollerk8v3Job;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetJobExecution
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetJobExecutionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3JobExecution >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3JobExecution = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3JobExecution", ""
            ) as Resourcecontrollerk8v3JobExecution;
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
            const body: Resourcecontrollerk8v3JobExecution = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3JobExecution", ""
            ) as Resourcecontrollerk8v3JobExecution;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetJobExecutions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetJobExecutionsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3GetJobExecutionsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3GetJobExecutionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetJobExecutionsResponse", ""
            ) as Resourcecontrollerk8v3GetJobExecutionsResponse;
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
            const body: Resourcecontrollerk8v3GetJobExecutionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetJobExecutionsResponse", ""
            ) as Resourcecontrollerk8v3GetJobExecutionsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetJobStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetJobStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3JobStatusDTO >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3JobStatusDTO = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3JobStatusDTO", ""
            ) as Resourcecontrollerk8v3JobStatusDTO;
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
            const body: Resourcecontrollerk8v3JobStatusDTO = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3JobStatusDTO", ""
            ) as Resourcecontrollerk8v3JobStatusDTO;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetTenantApp
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetTenantAppWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3App >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3App = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3App", ""
            ) as Resourcecontrollerk8v3App;
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
            const body: Resourcecontrollerk8v3App = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3App", ""
            ) as Resourcecontrollerk8v3App;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetTenantApps
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetTenantAppsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3GetTenantAppsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3GetTenantAppsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetTenantAppsResponse", ""
            ) as Resourcecontrollerk8v3GetTenantAppsResponse;
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
            const body: Resourcecontrollerk8v3GetTenantAppsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetTenantAppsResponse", ""
            ) as Resourcecontrollerk8v3GetTenantAppsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetTenantJobs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetTenantJobsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3GetTenantJobsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3GetTenantJobsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetTenantJobsResponse", ""
            ) as Resourcecontrollerk8v3GetTenantJobsResponse;
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
            const body: Resourcecontrollerk8v3GetTenantJobsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3GetTenantJobsResponse", ""
            ) as Resourcecontrollerk8v3GetTenantJobsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceGetVersion
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceGetVersionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3Version >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3Version = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Version", ""
            ) as Resourcecontrollerk8v3Version;
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
            const body: Resourcecontrollerk8v3Version = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Version", ""
            ) as Resourcecontrollerk8v3Version;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceInstallEdgeTenantRequest
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceInstallEdgeTenantRequestWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3EdgeResourceResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3EdgeResourceResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3EdgeResourceResponse", ""
            ) as Resourcecontrollerk8v3EdgeResourceResponse;
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
            const body: Resourcecontrollerk8v3EdgeResourceResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3EdgeResourceResponse", ""
            ) as Resourcecontrollerk8v3EdgeResourceResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceQueryControllerLogs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceQueryControllerLogsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3QueryControllerLogsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3QueryControllerLogsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3QueryControllerLogsResponse", ""
            ) as Resourcecontrollerk8v3QueryControllerLogsResponse;
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
            const body: Resourcecontrollerk8v3QueryControllerLogsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3QueryControllerLogsResponse", ""
            ) as Resourcecontrollerk8v3QueryControllerLogsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceUpdateCommand
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceUpdateCommandWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3ControllerCommand >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3ControllerCommand = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3ControllerCommand", ""
            ) as Resourcecontrollerk8v3ControllerCommand;
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
            const body: Resourcecontrollerk8v3ControllerCommand = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3ControllerCommand", ""
            ) as Resourcecontrollerk8v3ControllerCommand;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceUpdateController
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceUpdateControllerWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3Controller >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3Controller = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Controller", ""
            ) as Resourcecontrollerk8v3Controller;
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
            const body: Resourcecontrollerk8v3Controller = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Controller", ""
            ) as Resourcecontrollerk8v3Controller;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceUpdateControllerStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceUpdateControllerStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3ControllerStatus >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3ControllerStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3ControllerStatus", ""
            ) as Resourcecontrollerk8v3ControllerStatus;
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
            const body: Resourcecontrollerk8v3ControllerStatus = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3ControllerStatus", ""
            ) as Resourcecontrollerk8v3ControllerStatus;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceUpdateEdgeTenantRequest
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceUpdateEdgeTenantRequestWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3EdgeResourceResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3EdgeResourceResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3EdgeResourceResponse", ""
            ) as Resourcecontrollerk8v3EdgeResourceResponse;
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
            const body: Resourcecontrollerk8v3EdgeResourceResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3EdgeResourceResponse", ""
            ) as Resourcecontrollerk8v3EdgeResourceResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceUpdateJob
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceUpdateJobWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3Job >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3Job = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Job", ""
            ) as Resourcecontrollerk8v3Job;
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
            const body: Resourcecontrollerk8v3Job = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3Job", ""
            ) as Resourcecontrollerk8v3Job;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceUpdateJobExecution
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceUpdateJobExecutionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3JobExecution >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3JobExecution = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3JobExecution", ""
            ) as Resourcecontrollerk8v3JobExecution;
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
            const body: Resourcecontrollerk8v3JobExecution = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3JobExecution", ""
            ) as Resourcecontrollerk8v3JobExecution;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to resourceControllerK8ServiceUpdateJobStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async resourceControllerK8ServiceUpdateJobStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Resourcecontrollerk8v3JobStatusDTO >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Resourcecontrollerk8v3JobStatusDTO = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3JobStatusDTO", ""
            ) as Resourcecontrollerk8v3JobStatusDTO;
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
            const body: Resourcecontrollerk8v3JobStatusDTO = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Resourcecontrollerk8v3JobStatusDTO", ""
            ) as Resourcecontrollerk8v3JobStatusDTO;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
