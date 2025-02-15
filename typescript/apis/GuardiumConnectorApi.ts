// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Guardiumconnectorv3AddCMRequest } from '../models/Guardiumconnectorv3AddCMRequest';
import { Guardiumconnectorv3AddCMResponse } from '../models/Guardiumconnectorv3AddCMResponse';
import { Guardiumconnectorv3AddDatamartsRequest } from '../models/Guardiumconnectorv3AddDatamartsRequest';
import { Guardiumconnectorv3AddDatamartsResponse } from '../models/Guardiumconnectorv3AddDatamartsResponse';
import { Guardiumconnectorv3AddDmExclusionRequest } from '../models/Guardiumconnectorv3AddDmExclusionRequest';
import { Guardiumconnectorv3AddDmExclusionResponse } from '../models/Guardiumconnectorv3AddDmExclusionResponse';
import { Guardiumconnectorv3AddTaskRequest } from '../models/Guardiumconnectorv3AddTaskRequest';
import { Guardiumconnectorv3AddTaskResponse } from '../models/Guardiumconnectorv3AddTaskResponse';
import { Guardiumconnectorv3BlockUserRequest } from '../models/Guardiumconnectorv3BlockUserRequest';
import { Guardiumconnectorv3BlockUserResponse } from '../models/Guardiumconnectorv3BlockUserResponse';
import { Guardiumconnectorv3ConfigureAggregatorExportRequest } from '../models/Guardiumconnectorv3ConfigureAggregatorExportRequest';
import { Guardiumconnectorv3ConfigureAggregatorExportResponse } from '../models/Guardiumconnectorv3ConfigureAggregatorExportResponse';
import { Guardiumconnectorv3ConfigureCollectorExportRequest } from '../models/Guardiumconnectorv3ConfigureCollectorExportRequest';
import { Guardiumconnectorv3ConfigureCollectorExportResponse } from '../models/Guardiumconnectorv3ConfigureCollectorExportResponse';
import { Guardiumconnectorv3ConfigureStreamingRequest } from '../models/Guardiumconnectorv3ConfigureStreamingRequest';
import { Guardiumconnectorv3ConfigureStreamingResponse } from '../models/Guardiumconnectorv3ConfigureStreamingResponse';
import { Guardiumconnectorv3DatabaseConnectionStringRequest } from '../models/Guardiumconnectorv3DatabaseConnectionStringRequest';
import { Guardiumconnectorv3DatabaseResultResponse } from '../models/Guardiumconnectorv3DatabaseResultResponse';
import { Guardiumconnectorv3DatamartVersionRequest } from '../models/Guardiumconnectorv3DatamartVersionRequest';
import { Guardiumconnectorv3DatamartVersionResponse } from '../models/Guardiumconnectorv3DatamartVersionResponse';
import { Guardiumconnectorv3DeleteCMResponse } from '../models/Guardiumconnectorv3DeleteCMResponse';
import { Guardiumconnectorv3DeleteDmExclusionResponse } from '../models/Guardiumconnectorv3DeleteDmExclusionResponse';
import { Guardiumconnectorv3DeleteTaskResponse } from '../models/Guardiumconnectorv3DeleteTaskResponse';
import { Guardiumconnectorv3DeleteTasksResponse } from '../models/Guardiumconnectorv3DeleteTasksResponse';
import { Guardiumconnectorv3GetAggregatorsConfigResponse } from '../models/Guardiumconnectorv3GetAggregatorsConfigResponse';
import { Guardiumconnectorv3GetCMsConfigResponse } from '../models/Guardiumconnectorv3GetCMsConfigResponse';
import { Guardiumconnectorv3GetCMsResponse } from '../models/Guardiumconnectorv3GetCMsResponse';
import { Guardiumconnectorv3GetCollectorsConfigResponse } from '../models/Guardiumconnectorv3GetCollectorsConfigResponse';
import { Guardiumconnectorv3GetDatamartsResponse } from '../models/Guardiumconnectorv3GetDatamartsResponse';
import { Guardiumconnectorv3GetDmExclusionResponse } from '../models/Guardiumconnectorv3GetDmExclusionResponse';
import { Guardiumconnectorv3GetHealthInfoResponse } from '../models/Guardiumconnectorv3GetHealthInfoResponse';
import { Guardiumconnectorv3GetLatestDMExtractionProfileResponse } from '../models/Guardiumconnectorv3GetLatestDMExtractionProfileResponse';
import { Guardiumconnectorv3GetPolicyInfoResponse } from '../models/Guardiumconnectorv3GetPolicyInfoResponse';
import { Guardiumconnectorv3GetPolicySummariesResponse } from '../models/Guardiumconnectorv3GetPolicySummariesResponse';
import { Guardiumconnectorv3GetStreamingStatusResponse } from '../models/Guardiumconnectorv3GetStreamingStatusResponse';
import { Guardiumconnectorv3GetSyncDMsResponse } from '../models/Guardiumconnectorv3GetSyncDMsResponse';
import { Guardiumconnectorv3GetTaskTypesResponse } from '../models/Guardiumconnectorv3GetTaskTypesResponse';
import { Guardiumconnectorv3GetTasksResponse } from '../models/Guardiumconnectorv3GetTasksResponse';
import { Guardiumconnectorv3RunGDPReportRequest } from '../models/Guardiumconnectorv3RunGDPReportRequest';
import { Guardiumconnectorv3RunGDPReportResponse } from '../models/Guardiumconnectorv3RunGDPReportResponse';
import { Guardiumconnectorv3SetupCMRequest } from '../models/Guardiumconnectorv3SetupCMRequest';
import { Guardiumconnectorv3SetupCMResponse } from '../models/Guardiumconnectorv3SetupCMResponse';
import { Guardiumconnectorv3SetupDatamartsRequest } from '../models/Guardiumconnectorv3SetupDatamartsRequest';
import { Guardiumconnectorv3SetupDatamartsResponse } from '../models/Guardiumconnectorv3SetupDatamartsResponse';
import { Guardiumconnectorv3TaskErrorRequest } from '../models/Guardiumconnectorv3TaskErrorRequest';
import { Guardiumconnectorv3TaskErrorResponse } from '../models/Guardiumconnectorv3TaskErrorResponse';
import { Guardiumconnectorv3UpdateDmExclusionRequest } from '../models/Guardiumconnectorv3UpdateDmExclusionRequest';
import { Guardiumconnectorv3UpdateDmExclusionResponse } from '../models/Guardiumconnectorv3UpdateDmExclusionResponse';
import { Guardiumconnectorv3UpdateStreamingRequest } from '../models/Guardiumconnectorv3UpdateStreamingRequest';
import { Guardiumconnectorv3UpdateStreamingResponse } from '../models/Guardiumconnectorv3UpdateStreamingResponse';
import { Guardiumconnectorv3UpdateTaskRequest } from '../models/Guardiumconnectorv3UpdateTaskRequest';
import { Guardiumconnectorv3UpdateTaskResponse } from '../models/Guardiumconnectorv3UpdateTaskResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class GuardiumConnectorApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Add CM Description: Add a Central Manager to the tenant database.
     * @param guardiumconnectorv3AddCMRequest 
     */
    public async guardiumConnectorAddCM(guardiumconnectorv3AddCMRequest: Guardiumconnectorv3AddCMRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'guardiumconnectorv3AddCMRequest' is not null or undefined
        if (guardiumconnectorv3AddCMRequest === null || guardiumconnectorv3AddCMRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorAddCM", "guardiumconnectorv3AddCMRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3AddCMRequest, "Guardiumconnectorv3AddCMRequest", ""),
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
     * Description: stores datamarts details from GDP
     * @param centralManagerId central manager
     * @param guardiumconnectorv3AddDatamartsRequest 
     */
    public async guardiumConnectorAddDatamarts(centralManagerId: string, guardiumconnectorv3AddDatamartsRequest: Guardiumconnectorv3AddDatamartsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorAddDatamarts", "centralManagerId");
        }


        // verify required parameter 'guardiumconnectorv3AddDatamartsRequest' is not null or undefined
        if (guardiumconnectorv3AddDatamartsRequest === null || guardiumconnectorv3AddDatamartsRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorAddDatamarts", "guardiumconnectorv3AddDatamartsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/datamarts'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3AddDatamartsRequest, "Guardiumconnectorv3AddDatamartsRequest", ""),
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
     * Summary: Add DM exclusion Description: Add datamart to exclusion list.
     * @param guardiumconnectorv3AddDmExclusionRequest 
     */
    public async guardiumConnectorAddDmExclusion(guardiumconnectorv3AddDmExclusionRequest: Guardiumconnectorv3AddDmExclusionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'guardiumconnectorv3AddDmExclusionRequest' is not null or undefined
        if (guardiumconnectorv3AddDmExclusionRequest === null || guardiumconnectorv3AddDmExclusionRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorAddDmExclusion", "guardiumconnectorv3AddDmExclusionRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/datamarts/exclusion_list';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3AddDmExclusionRequest, "Guardiumconnectorv3AddDmExclusionRequest", ""),
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
     * Summary: Add task Description: Add a task to be executed on GDP.
     * @param centralManagerId ID of central manager.
     * @param guardiumconnectorv3AddTaskRequest 
     */
    public async guardiumConnectorAddTask(centralManagerId: string, guardiumconnectorv3AddTaskRequest: Guardiumconnectorv3AddTaskRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorAddTask", "centralManagerId");
        }


        // verify required parameter 'guardiumconnectorv3AddTaskRequest' is not null or undefined
        if (guardiumconnectorv3AddTaskRequest === null || guardiumconnectorv3AddTaskRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorAddTask", "guardiumconnectorv3AddTaskRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/tasks'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3AddTaskRequest, "Guardiumconnectorv3AddTaskRequest", ""),
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
     * Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
     * @param guardiumconnectorv3BlockUserRequest 
     */
    public async guardiumConnectorBlockUser(guardiumconnectorv3BlockUserRequest: Guardiumconnectorv3BlockUserRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'guardiumconnectorv3BlockUserRequest' is not null or undefined
        if (guardiumconnectorv3BlockUserRequest === null || guardiumconnectorv3BlockUserRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorBlockUser", "guardiumconnectorv3BlockUserRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/block_user';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3BlockUserRequest, "Guardiumconnectorv3BlockUserRequest", ""),
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
     * Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3ConfigureAggregatorExportRequest 
     */
    public async guardiumConnectorConfigureAggregatorExport(centralManagerId: string, guardiumconnectorv3ConfigureAggregatorExportRequest: Guardiumconnectorv3ConfigureAggregatorExportRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorConfigureAggregatorExport", "centralManagerId");
        }


        // verify required parameter 'guardiumconnectorv3ConfigureAggregatorExportRequest' is not null or undefined
        if (guardiumconnectorv3ConfigureAggregatorExportRequest === null || guardiumconnectorv3ConfigureAggregatorExportRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorConfigureAggregatorExport", "guardiumconnectorv3ConfigureAggregatorExportRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/aggregator_config_export'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3ConfigureAggregatorExportRequest, "Guardiumconnectorv3ConfigureAggregatorExportRequest", ""),
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
     * Summary: Configure collector export Description: Schedule export historical data for collectors.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3ConfigureCollectorExportRequest 
     */
    public async guardiumConnectorConfigureCollectorExport(centralManagerId: string, guardiumconnectorv3ConfigureCollectorExportRequest: Guardiumconnectorv3ConfigureCollectorExportRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorConfigureCollectorExport", "centralManagerId");
        }


        // verify required parameter 'guardiumconnectorv3ConfigureCollectorExportRequest' is not null or undefined
        if (guardiumconnectorv3ConfigureCollectorExportRequest === null || guardiumconnectorv3ConfigureCollectorExportRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorConfigureCollectorExport", "guardiumconnectorv3ConfigureCollectorExportRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/collector_config_export'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3ConfigureCollectorExportRequest, "Guardiumconnectorv3ConfigureCollectorExportRequest", ""),
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
     * Summary: Configure streaming Description: Enable or disable streaming.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3ConfigureStreamingRequest 
     */
    public async guardiumConnectorConfigureStreaming(centralManagerId: string, guardiumconnectorv3ConfigureStreamingRequest: Guardiumconnectorv3ConfigureStreamingRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorConfigureStreaming", "centralManagerId");
        }


        // verify required parameter 'guardiumconnectorv3ConfigureStreamingRequest' is not null or undefined
        if (guardiumconnectorv3ConfigureStreamingRequest === null || guardiumconnectorv3ConfigureStreamingRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorConfigureStreaming", "guardiumconnectorv3ConfigureStreamingRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/streaming'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3ConfigureStreamingRequest, "Guardiumconnectorv3ConfigureStreamingRequest", ""),
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
     * Description: validates if central manager has datamart support for event model
     * @param centralManagerId Central manager
     * @param guardiumconnectorv3DatamartVersionRequest 
     */
    public async guardiumConnectorDatamartVersionCheck(centralManagerId: string, guardiumconnectorv3DatamartVersionRequest: Guardiumconnectorv3DatamartVersionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorDatamartVersionCheck", "centralManagerId");
        }


        // verify required parameter 'guardiumconnectorv3DatamartVersionRequest' is not null or undefined
        if (guardiumconnectorv3DatamartVersionRequest === null || guardiumconnectorv3DatamartVersionRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorDatamartVersionCheck", "guardiumconnectorv3DatamartVersionRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/datamart_version'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3DatamartVersionRequest, "Guardiumconnectorv3DatamartVersionRequest", ""),
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
     * Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
     * @param centralManagerId Central Manager ID.
     * @param force Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM).
     */
    public async guardiumConnectorDeleteCM(centralManagerId: string, force?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorDeleteCM", "centralManagerId");
        }



        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (force !== undefined) {
            requestContext.setQueryParam("force", ObjectSerializer.serialize(force, "number", "int32"));
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
     * Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
     * @param datamart Datamart name.
     */
    public async guardiumConnectorDeleteDmExclusion(datamart?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/datamarts/exclusion_list';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (datamart !== undefined) {
            requestContext.setQueryParam("datamart", ObjectSerializer.serialize(datamart, "string", ""));
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
     * Summary: Delete task Description: Delete a task by central manager id and task id.
     * @param centralManagerId ID of central manager.
     * @param taskId ID of task being deleted.
     */
    public async guardiumConnectorDeleteTask(centralManagerId: string, taskId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorDeleteTask", "centralManagerId");
        }


        // verify required parameter 'taskId' is not null or undefined
        if (taskId === null || taskId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorDeleteTask", "taskId");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/tasks/{task_id}'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)))
            .replace('{' + 'task_id' + '}', encodeURIComponent(String(taskId)));

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
     * Summary: Delete tasks Description: Delete a central manager\'s tasks by central manager id.
     * @param centralManagerId ID of central manager.
     */
    public async guardiumConnectorDeleteTasks(centralManagerId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorDeleteTasks", "centralManagerId");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/tasks'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

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
     * Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
     * @param centralManagerId Central Manager ID.
     */
    public async guardiumConnectorGetAggregatorsConfig(centralManagerId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorGetAggregatorsConfig", "centralManagerId");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/aggregators_config'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

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
     * Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
     * @param runAdditionalChecks Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager.
     */
    public async guardiumConnectorGetCMs(runAdditionalChecks?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/central_managers';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (runAdditionalChecks !== undefined) {
            requestContext.setQueryParam("run_additional_checks", ObjectSerializer.serialize(runAdditionalChecks, "boolean", ""));
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
     * Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
     */
    public async guardiumConnectorGetCMsConfig(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/central_managers_config';

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
     * Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
     * @param centralManagerId Central Manager ID.
     */
    public async guardiumConnectorGetCollectorsConfig(centralManagerId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorGetCollectorsConfig", "centralManagerId");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/collectors_config'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

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
     * Description: returns full list of supported datamarts including type (historical or non-historical)
     * @param centralManagerId central manager hostname
     */
    public async guardiumConnectorGetDatamarts(centralManagerId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorGetDatamarts", "centralManagerId");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/datamarts'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

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
     * Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
     */
    public async guardiumConnectorGetDmExclusion(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/datamarts/exclusion_list';

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
     * Summary: Get guardium policy definition Description: returns the policy definition on the cm
     * @param centralManagerId Central manager hostname
     * @param policyName Policy name.
     */
    public async guardiumConnectorGetGdpPolicyInfo(centralManagerId: string, policyName?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorGetGdpPolicyInfo", "centralManagerId");
        }



        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/policies/info'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (policyName !== undefined) {
            requestContext.setQueryParam("policy_name", ObjectSerializer.serialize(policyName, "string", ""));
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
     * Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
     * @param centralManagerId Central manager hostname
     */
    public async guardiumConnectorGetGdpPolicySummaries(centralManagerId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorGetGdpPolicySummaries", "centralManagerId");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/policies/summaries'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

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
     * Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.
     * @param centralManagerId Central Manager ID.
     * @param useFallback Flag indicating if the older gdp api is to be called in case it doesn\&#39;t support new api.
     */
    public async guardiumConnectorGetHealthInfo(centralManagerId: string, useFallback?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorGetHealthInfo", "centralManagerId");
        }



        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/health_info'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (useFallback !== undefined) {
            requestContext.setQueryParam("use_fallback", ObjectSerializer.serialize(useFallback, "boolean", ""));
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
     * Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium.
     * @param centralManagerId Central Manager ID.
     */
    public async guardiumConnectorGetLatestDMExtractionProfile(centralManagerId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorGetLatestDMExtractionProfile", "centralManagerId");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/datamart_extraction_profile'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

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
     * Summary: Get streaming status Description: Return the streaming configuration.
     * @param centralManagerId Central Manager ID.
     */
    public async guardiumConnectorGetStreamingStatus(centralManagerId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorGetStreamingStatus", "centralManagerId");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/streaming'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

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
     * Summary: Get sync DMs Description: Return the list of tasks from a central manager.
     * @param centralManagerId ID of central manager.
     */
    public async guardiumConnectorGetSyncDMs(centralManagerId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorGetSyncDMs", "centralManagerId");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/sync'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

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
     * Summary: Get task types Description: Return the list of supported task types.
     */
    public async guardiumConnectorGetTaskTypes(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/central_managers/task_types';

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
     * Summary: Get tasks Description: Return the list of tasks from a central manager.
     * @param centralManagerId ID of central manager.
     * @param taskId ID of task.
     * @param taskType Type of task.
     * @param keyObject Key object.
     */
    public async guardiumConnectorGetTasks(centralManagerId: string, taskId?: string, taskType?: string, keyObject?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorGetTasks", "centralManagerId");
        }





        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/tasks'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (taskId !== undefined) {
            requestContext.setQueryParam("task_id", ObjectSerializer.serialize(taskId, "string", ""));
        }

        // Query Params
        if (taskType !== undefined) {
            requestContext.setQueryParam("task_type", ObjectSerializer.serialize(taskType, "string", ""));
        }

        // Query Params
        if (keyObject !== undefined) {
            requestContext.setQueryParam("key_object", ObjectSerializer.serialize(keyObject, "string", ""));
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
     * Summary: Run GDP report Description: Run GDP report.
     * @param centralManagerId Central Manager ID.
     * @param guardiumconnectorv3RunGDPReportRequest 
     */
    public async guardiumConnectorRunGDPReport(centralManagerId: string, guardiumconnectorv3RunGDPReportRequest: Guardiumconnectorv3RunGDPReportRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorRunGDPReport", "centralManagerId");
        }


        // verify required parameter 'guardiumconnectorv3RunGDPReportRequest' is not null or undefined
        if (guardiumconnectorv3RunGDPReportRequest === null || guardiumconnectorv3RunGDPReportRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorRunGDPReport", "guardiumconnectorv3RunGDPReportRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/run_report'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3RunGDPReportRequest, "Guardiumconnectorv3RunGDPReportRequest", ""),
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
     * Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium.
     * @param guardiumconnectorv3SetupCMRequest 
     */
    public async guardiumConnectorSetupCM(guardiumconnectorv3SetupCMRequest: Guardiumconnectorv3SetupCMRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'guardiumconnectorv3SetupCMRequest' is not null or undefined
        if (guardiumconnectorv3SetupCMRequest === null || guardiumconnectorv3SetupCMRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorSetupCM", "guardiumconnectorv3SetupCMRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/setup';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3SetupCMRequest, "Guardiumconnectorv3SetupCMRequest", ""),
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
     * Description: setup custom datamart execution mode
     * @param centralManagerId central manager
     * @param guardiumconnectorv3SetupDatamartsRequest 
     */
    public async guardiumConnectorSetupDatamarts(centralManagerId: string, guardiumconnectorv3SetupDatamartsRequest: Guardiumconnectorv3SetupDatamartsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorSetupDatamarts", "centralManagerId");
        }


        // verify required parameter 'guardiumconnectorv3SetupDatamartsRequest' is not null or undefined
        if (guardiumconnectorv3SetupDatamartsRequest === null || guardiumconnectorv3SetupDatamartsRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorSetupDatamarts", "guardiumconnectorv3SetupDatamartsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/datamarts/setup'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3SetupDatamartsRequest, "Guardiumconnectorv3SetupDatamartsRequest", ""),
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
     * Summary: Task error Description: Log error messages from GDP task execution.
     * @param centralManagerId ID of central manager.
     * @param guardiumconnectorv3TaskErrorRequest 
     */
    public async guardiumConnectorTaskError(centralManagerId: string, guardiumconnectorv3TaskErrorRequest: Guardiumconnectorv3TaskErrorRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorTaskError", "centralManagerId");
        }


        // verify required parameter 'guardiumconnectorv3TaskErrorRequest' is not null or undefined
        if (guardiumconnectorv3TaskErrorRequest === null || guardiumconnectorv3TaskErrorRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorTaskError", "guardiumconnectorv3TaskErrorRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/tasks/error'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3TaskErrorRequest, "Guardiumconnectorv3TaskErrorRequest", ""),
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
     * Summary: Test database connection Description: Return database connection results.
     * @param guardiumconnectorv3DatabaseConnectionStringRequest 
     */
    public async guardiumConnectorTestDatabaseConnection(guardiumconnectorv3DatabaseConnectionStringRequest: Guardiumconnectorv3DatabaseConnectionStringRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'guardiumconnectorv3DatabaseConnectionStringRequest' is not null or undefined
        if (guardiumconnectorv3DatabaseConnectionStringRequest === null || guardiumconnectorv3DatabaseConnectionStringRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorTestDatabaseConnection", "guardiumconnectorv3DatabaseConnectionStringRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/test_database';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3DatabaseConnectionStringRequest, "Guardiumconnectorv3DatabaseConnectionStringRequest", ""),
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
     * Summary: Update DM exclusion Description: Update the atamart exclusion list.
     * @param guardiumconnectorv3UpdateDmExclusionRequest 
     */
    public async guardiumConnectorUpdateDmExclusion(guardiumconnectorv3UpdateDmExclusionRequest: Guardiumconnectorv3UpdateDmExclusionRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'guardiumconnectorv3UpdateDmExclusionRequest' is not null or undefined
        if (guardiumconnectorv3UpdateDmExclusionRequest === null || guardiumconnectorv3UpdateDmExclusionRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorUpdateDmExclusion", "guardiumconnectorv3UpdateDmExclusionRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/datamarts/exclusion_list';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3UpdateDmExclusionRequest, "Guardiumconnectorv3UpdateDmExclusionRequest", ""),
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
     * Summary: Update streaming Description: Update streaming status into GI.
     * @param centralManagerId ID of central manager.
     * @param guardiumconnectorv3UpdateStreamingRequest 
     */
    public async guardiumConnectorUpdateStreaming(centralManagerId: string, guardiumconnectorv3UpdateStreamingRequest: Guardiumconnectorv3UpdateStreamingRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorUpdateStreaming", "centralManagerId");
        }


        // verify required parameter 'guardiumconnectorv3UpdateStreamingRequest' is not null or undefined
        if (guardiumconnectorv3UpdateStreamingRequest === null || guardiumconnectorv3UpdateStreamingRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorUpdateStreaming", "guardiumconnectorv3UpdateStreamingRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/streaming'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3UpdateStreamingRequest, "Guardiumconnectorv3UpdateStreamingRequest", ""),
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
     * Summary: Update task Description: Update a task that gets executed on GDP.
     * @param centralManagerId ID of central manager.
     * @param taskId ID of task being updated.
     * @param guardiumconnectorv3UpdateTaskRequest 
     */
    public async guardiumConnectorUpdateTask(centralManagerId: string, taskId: string, guardiumconnectorv3UpdateTaskRequest: Guardiumconnectorv3UpdateTaskRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'centralManagerId' is not null or undefined
        if (centralManagerId === null || centralManagerId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorUpdateTask", "centralManagerId");
        }


        // verify required parameter 'taskId' is not null or undefined
        if (taskId === null || taskId === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorUpdateTask", "taskId");
        }


        // verify required parameter 'guardiumconnectorv3UpdateTaskRequest' is not null or undefined
        if (guardiumconnectorv3UpdateTaskRequest === null || guardiumconnectorv3UpdateTaskRequest === undefined) {
            throw new RequiredError("GuardiumConnectorApi", "guardiumConnectorUpdateTask", "guardiumconnectorv3UpdateTaskRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/central_managers/{central_manager_id}/tasks/{task_id}'
            .replace('{' + 'central_manager_id' + '}', encodeURIComponent(String(centralManagerId)))
            .replace('{' + 'task_id' + '}', encodeURIComponent(String(taskId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(guardiumconnectorv3UpdateTaskRequest, "Guardiumconnectorv3UpdateTaskRequest", ""),
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

export class GuardiumConnectorApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorAddCM
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorAddCMWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3AddCMResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3AddCMResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3AddCMResponse", ""
            ) as Guardiumconnectorv3AddCMResponse;
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
            const body: Guardiumconnectorv3AddCMResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3AddCMResponse", ""
            ) as Guardiumconnectorv3AddCMResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorAddDatamarts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorAddDatamartsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3AddDatamartsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3AddDatamartsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3AddDatamartsResponse", ""
            ) as Guardiumconnectorv3AddDatamartsResponse;
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
            const body: Guardiumconnectorv3AddDatamartsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3AddDatamartsResponse", ""
            ) as Guardiumconnectorv3AddDatamartsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorAddDmExclusion
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorAddDmExclusionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3AddDmExclusionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3AddDmExclusionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3AddDmExclusionResponse", ""
            ) as Guardiumconnectorv3AddDmExclusionResponse;
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
            const body: Guardiumconnectorv3AddDmExclusionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3AddDmExclusionResponse", ""
            ) as Guardiumconnectorv3AddDmExclusionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorAddTask
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorAddTaskWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3AddTaskResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3AddTaskResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3AddTaskResponse", ""
            ) as Guardiumconnectorv3AddTaskResponse;
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
            const body: Guardiumconnectorv3AddTaskResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3AddTaskResponse", ""
            ) as Guardiumconnectorv3AddTaskResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorBlockUser
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorBlockUserWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3BlockUserResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3BlockUserResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3BlockUserResponse", ""
            ) as Guardiumconnectorv3BlockUserResponse;
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
            const body: Guardiumconnectorv3BlockUserResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3BlockUserResponse", ""
            ) as Guardiumconnectorv3BlockUserResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorConfigureAggregatorExport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorConfigureAggregatorExportWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3ConfigureAggregatorExportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3ConfigureAggregatorExportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3ConfigureAggregatorExportResponse", ""
            ) as Guardiumconnectorv3ConfigureAggregatorExportResponse;
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
            const body: Guardiumconnectorv3ConfigureAggregatorExportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3ConfigureAggregatorExportResponse", ""
            ) as Guardiumconnectorv3ConfigureAggregatorExportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorConfigureCollectorExport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorConfigureCollectorExportWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3ConfigureCollectorExportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3ConfigureCollectorExportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3ConfigureCollectorExportResponse", ""
            ) as Guardiumconnectorv3ConfigureCollectorExportResponse;
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
            const body: Guardiumconnectorv3ConfigureCollectorExportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3ConfigureCollectorExportResponse", ""
            ) as Guardiumconnectorv3ConfigureCollectorExportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorConfigureStreaming
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorConfigureStreamingWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3ConfigureStreamingResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3ConfigureStreamingResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3ConfigureStreamingResponse", ""
            ) as Guardiumconnectorv3ConfigureStreamingResponse;
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
            const body: Guardiumconnectorv3ConfigureStreamingResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3ConfigureStreamingResponse", ""
            ) as Guardiumconnectorv3ConfigureStreamingResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorDatamartVersionCheck
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorDatamartVersionCheckWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3DatamartVersionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3DatamartVersionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DatamartVersionResponse", ""
            ) as Guardiumconnectorv3DatamartVersionResponse;
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
            const body: Guardiumconnectorv3DatamartVersionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DatamartVersionResponse", ""
            ) as Guardiumconnectorv3DatamartVersionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorDeleteCM
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorDeleteCMWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3DeleteCMResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3DeleteCMResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DeleteCMResponse", ""
            ) as Guardiumconnectorv3DeleteCMResponse;
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
            const body: Guardiumconnectorv3DeleteCMResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DeleteCMResponse", ""
            ) as Guardiumconnectorv3DeleteCMResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorDeleteDmExclusion
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorDeleteDmExclusionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3DeleteDmExclusionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3DeleteDmExclusionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DeleteDmExclusionResponse", ""
            ) as Guardiumconnectorv3DeleteDmExclusionResponse;
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
            const body: Guardiumconnectorv3DeleteDmExclusionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DeleteDmExclusionResponse", ""
            ) as Guardiumconnectorv3DeleteDmExclusionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorDeleteTask
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorDeleteTaskWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3DeleteTaskResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3DeleteTaskResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DeleteTaskResponse", ""
            ) as Guardiumconnectorv3DeleteTaskResponse;
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
            const body: Guardiumconnectorv3DeleteTaskResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DeleteTaskResponse", ""
            ) as Guardiumconnectorv3DeleteTaskResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorDeleteTasks
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorDeleteTasksWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3DeleteTasksResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3DeleteTasksResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DeleteTasksResponse", ""
            ) as Guardiumconnectorv3DeleteTasksResponse;
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
            const body: Guardiumconnectorv3DeleteTasksResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DeleteTasksResponse", ""
            ) as Guardiumconnectorv3DeleteTasksResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetAggregatorsConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetAggregatorsConfigWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetAggregatorsConfigResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetAggregatorsConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetAggregatorsConfigResponse", ""
            ) as Guardiumconnectorv3GetAggregatorsConfigResponse;
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
            const body: Guardiumconnectorv3GetAggregatorsConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetAggregatorsConfigResponse", ""
            ) as Guardiumconnectorv3GetAggregatorsConfigResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetCMs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetCMsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetCMsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetCMsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetCMsResponse", ""
            ) as Guardiumconnectorv3GetCMsResponse;
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
            const body: Guardiumconnectorv3GetCMsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetCMsResponse", ""
            ) as Guardiumconnectorv3GetCMsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetCMsConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetCMsConfigWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetCMsConfigResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetCMsConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetCMsConfigResponse", ""
            ) as Guardiumconnectorv3GetCMsConfigResponse;
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
            const body: Guardiumconnectorv3GetCMsConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetCMsConfigResponse", ""
            ) as Guardiumconnectorv3GetCMsConfigResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetCollectorsConfig
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetCollectorsConfigWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetCollectorsConfigResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetCollectorsConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetCollectorsConfigResponse", ""
            ) as Guardiumconnectorv3GetCollectorsConfigResponse;
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
            const body: Guardiumconnectorv3GetCollectorsConfigResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetCollectorsConfigResponse", ""
            ) as Guardiumconnectorv3GetCollectorsConfigResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetDatamarts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetDatamartsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetDatamartsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetDatamartsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetDatamartsResponse", ""
            ) as Guardiumconnectorv3GetDatamartsResponse;
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
            const body: Guardiumconnectorv3GetDatamartsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetDatamartsResponse", ""
            ) as Guardiumconnectorv3GetDatamartsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetDmExclusion
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetDmExclusionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetDmExclusionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetDmExclusionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetDmExclusionResponse", ""
            ) as Guardiumconnectorv3GetDmExclusionResponse;
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
            const body: Guardiumconnectorv3GetDmExclusionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetDmExclusionResponse", ""
            ) as Guardiumconnectorv3GetDmExclusionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetGdpPolicyInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetGdpPolicyInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetPolicyInfoResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetPolicyInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetPolicyInfoResponse", ""
            ) as Guardiumconnectorv3GetPolicyInfoResponse;
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
            const body: Guardiumconnectorv3GetPolicyInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetPolicyInfoResponse", ""
            ) as Guardiumconnectorv3GetPolicyInfoResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetGdpPolicySummaries
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetGdpPolicySummariesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetPolicySummariesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetPolicySummariesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetPolicySummariesResponse", ""
            ) as Guardiumconnectorv3GetPolicySummariesResponse;
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
            const body: Guardiumconnectorv3GetPolicySummariesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetPolicySummariesResponse", ""
            ) as Guardiumconnectorv3GetPolicySummariesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetHealthInfo
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetHealthInfoWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetHealthInfoResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetHealthInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetHealthInfoResponse", ""
            ) as Guardiumconnectorv3GetHealthInfoResponse;
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
            const body: Guardiumconnectorv3GetHealthInfoResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetHealthInfoResponse", ""
            ) as Guardiumconnectorv3GetHealthInfoResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetLatestDMExtractionProfile
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetLatestDMExtractionProfileWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetLatestDMExtractionProfileResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetLatestDMExtractionProfileResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetLatestDMExtractionProfileResponse", ""
            ) as Guardiumconnectorv3GetLatestDMExtractionProfileResponse;
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
            const body: Guardiumconnectorv3GetLatestDMExtractionProfileResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetLatestDMExtractionProfileResponse", ""
            ) as Guardiumconnectorv3GetLatestDMExtractionProfileResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetStreamingStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetStreamingStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetStreamingStatusResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetStreamingStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetStreamingStatusResponse", ""
            ) as Guardiumconnectorv3GetStreamingStatusResponse;
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
            const body: Guardiumconnectorv3GetStreamingStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetStreamingStatusResponse", ""
            ) as Guardiumconnectorv3GetStreamingStatusResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetSyncDMs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetSyncDMsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetSyncDMsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetSyncDMsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetSyncDMsResponse", ""
            ) as Guardiumconnectorv3GetSyncDMsResponse;
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
            const body: Guardiumconnectorv3GetSyncDMsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetSyncDMsResponse", ""
            ) as Guardiumconnectorv3GetSyncDMsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetTaskTypes
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetTaskTypesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetTaskTypesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetTaskTypesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetTaskTypesResponse", ""
            ) as Guardiumconnectorv3GetTaskTypesResponse;
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
            const body: Guardiumconnectorv3GetTaskTypesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetTaskTypesResponse", ""
            ) as Guardiumconnectorv3GetTaskTypesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorGetTasks
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorGetTasksWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3GetTasksResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3GetTasksResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetTasksResponse", ""
            ) as Guardiumconnectorv3GetTasksResponse;
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
            const body: Guardiumconnectorv3GetTasksResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3GetTasksResponse", ""
            ) as Guardiumconnectorv3GetTasksResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorRunGDPReport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorRunGDPReportWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3RunGDPReportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3RunGDPReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3RunGDPReportResponse", ""
            ) as Guardiumconnectorv3RunGDPReportResponse;
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
            const body: Guardiumconnectorv3RunGDPReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3RunGDPReportResponse", ""
            ) as Guardiumconnectorv3RunGDPReportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorSetupCM
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorSetupCMWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3SetupCMResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3SetupCMResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3SetupCMResponse", ""
            ) as Guardiumconnectorv3SetupCMResponse;
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
            const body: Guardiumconnectorv3SetupCMResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3SetupCMResponse", ""
            ) as Guardiumconnectorv3SetupCMResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorSetupDatamarts
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorSetupDatamartsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3SetupDatamartsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3SetupDatamartsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3SetupDatamartsResponse", ""
            ) as Guardiumconnectorv3SetupDatamartsResponse;
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
            const body: Guardiumconnectorv3SetupDatamartsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3SetupDatamartsResponse", ""
            ) as Guardiumconnectorv3SetupDatamartsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorTaskError
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorTaskErrorWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3TaskErrorResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3TaskErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3TaskErrorResponse", ""
            ) as Guardiumconnectorv3TaskErrorResponse;
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
            const body: Guardiumconnectorv3TaskErrorResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3TaskErrorResponse", ""
            ) as Guardiumconnectorv3TaskErrorResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorTestDatabaseConnection
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorTestDatabaseConnectionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3DatabaseResultResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3DatabaseResultResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DatabaseResultResponse", ""
            ) as Guardiumconnectorv3DatabaseResultResponse;
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
            const body: Guardiumconnectorv3DatabaseResultResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3DatabaseResultResponse", ""
            ) as Guardiumconnectorv3DatabaseResultResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorUpdateDmExclusion
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorUpdateDmExclusionWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3UpdateDmExclusionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3UpdateDmExclusionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3UpdateDmExclusionResponse", ""
            ) as Guardiumconnectorv3UpdateDmExclusionResponse;
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
            const body: Guardiumconnectorv3UpdateDmExclusionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3UpdateDmExclusionResponse", ""
            ) as Guardiumconnectorv3UpdateDmExclusionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorUpdateStreaming
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorUpdateStreamingWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3UpdateStreamingResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3UpdateStreamingResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3UpdateStreamingResponse", ""
            ) as Guardiumconnectorv3UpdateStreamingResponse;
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
            const body: Guardiumconnectorv3UpdateStreamingResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3UpdateStreamingResponse", ""
            ) as Guardiumconnectorv3UpdateStreamingResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to guardiumConnectorUpdateTask
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async guardiumConnectorUpdateTaskWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Guardiumconnectorv3UpdateTaskResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Guardiumconnectorv3UpdateTaskResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3UpdateTaskResponse", ""
            ) as Guardiumconnectorv3UpdateTaskResponse;
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
            const body: Guardiumconnectorv3UpdateTaskResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Guardiumconnectorv3UpdateTaskResponse", ""
            ) as Guardiumconnectorv3UpdateTaskResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
