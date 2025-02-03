// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest } from '../models/Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest';
import { Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse } from '../models/Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse';
import { Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest } from '../models/Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest';
import { Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse } from '../models/Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse';
import { Riskanalyticscontrollerv3GetAllClassificationsListResponse } from '../models/Riskanalyticscontrollerv3GetAllClassificationsListResponse';
import { Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse } from '../models/Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse';
import { Riskanalyticscontrollerv3GetRiskEventDetailsResponse } from '../models/Riskanalyticscontrollerv3GetRiskEventDetailsResponse';
import { Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse } from '../models/Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse';
import { Riskanalyticscontrollerv3GetRiskEventRowResponse } from '../models/Riskanalyticscontrollerv3GetRiskEventRowResponse';
import { Riskanalyticscontrollerv3GetRiskFeedbackResponse } from '../models/Riskanalyticscontrollerv3GetRiskFeedbackResponse';
import { Riskanalyticscontrollerv3GetRiskObservationDetailsResponse } from '../models/Riskanalyticscontrollerv3GetRiskObservationDetailsResponse';
import { Riskanalyticscontrollerv3GetUserUISettingsResponse } from '../models/Riskanalyticscontrollerv3GetUserUISettingsResponse';
import { Riskanalyticscontrollerv3RiskEventSummarizationDataResponse } from '../models/Riskanalyticscontrollerv3RiskEventSummarizationDataResponse';
import { Riskanalyticscontrollerv3RiskEventTuningRequest } from '../models/Riskanalyticscontrollerv3RiskEventTuningRequest';
import { Riskanalyticscontrollerv3RiskEventTuningResponse } from '../models/Riskanalyticscontrollerv3RiskEventTuningResponse';
import { Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse } from '../models/Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse';
import { Riskanalyticscontrollerv3SetRiskEventStatusRequest } from '../models/Riskanalyticscontrollerv3SetRiskEventStatusRequest';
import { Riskanalyticscontrollerv3SetRiskEventStatusResponse } from '../models/Riskanalyticscontrollerv3SetRiskEventStatusResponse';
import { Riskanalyticscontrollerv3SetUserUISettingsRequest } from '../models/Riskanalyticscontrollerv3SetUserUISettingsRequest';
import { Riskanalyticscontrollerv3SetUserUISettingsResponse } from '../models/Riskanalyticscontrollerv3SetUserUISettingsResponse';
import { Riskanalyticscontrollerv3UpdateRiskFeedbackRequest } from '../models/Riskanalyticscontrollerv3UpdateRiskFeedbackRequest';
import { Riskanalyticscontrollerv3UpdateRiskFeedbackResponse } from '../models/Riskanalyticscontrollerv3UpdateRiskFeedbackResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class RiskAnalyticsControllerApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
     * @param riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest 
     */
    public async riskAnalyticsControllerEnableDisableRiskEventFeedback(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest: Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest' is not null or undefined
        if (riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest === null || riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest === undefined) {
            throw new RequiredError("RiskAnalyticsControllerApi", "riskAnalyticsControllerEnableDisableRiskEventFeedback", "riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/risk_feedback/status';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest, "Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest", ""),
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
     * Summary: Enable disable risk event process Description: Enable or disable the risk event process.
     * @param riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest 
     */
    public async riskAnalyticsControllerEnableDisableRiskEventProcess(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest: Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest' is not null or undefined
        if (riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest === null || riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest === undefined) {
            throw new RequiredError("RiskAnalyticsControllerApi", "riskAnalyticsControllerEnableDisableRiskEventProcess", "riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/risk_process/status';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest, "Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest", ""),
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
     * Summary: Get all classifications Description: Get all possible classifications for a risk event.
     */
    public async riskAnalyticsControllerGetAllClassificationsList(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/risk_events/classifications';

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
     * Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
     * @param riskId Risk id
     */
    public async riskAnalyticsControllerGetRiskEventClassificationsList(riskId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskId' is not null or undefined
        if (riskId === null || riskId === undefined) {
            throw new RequiredError("RiskAnalyticsControllerApi", "riskAnalyticsControllerGetRiskEventClassificationsList", "riskId");
        }


        // Path Params
        const localVarPath = '/api/v3/risk_events/feedback/{risk_id}'
            .replace('{' + 'risk_id' + '}', encodeURIComponent(String(riskId)));

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
     * Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
     * @param riskId Risk ID
     * @param includeIndicators Indicates whether to include indicators in the response or not.
     * @param numFindingsLimit Max number of hours to get for the risk.
     */
    public async riskAnalyticsControllerGetRiskEventDataForSummarization(riskId: number, includeIndicators?: boolean, numFindingsLimit?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskId' is not null or undefined
        if (riskId === null || riskId === undefined) {
            throw new RequiredError("RiskAnalyticsControllerApi", "riskAnalyticsControllerGetRiskEventDataForSummarization", "riskId");
        }




        // Path Params
        const localVarPath = '/api/v3/risk_events/summarization/data/{risk_id}'
            .replace('{' + 'risk_id' + '}', encodeURIComponent(String(riskId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (includeIndicators !== undefined) {
            requestContext.setQueryParam("include_indicators", ObjectSerializer.serialize(includeIndicators, "boolean", ""));
        }

        // Query Params
        if (numFindingsLimit !== undefined) {
            requestContext.setQueryParam("num_findings_limit", ObjectSerializer.serialize(numFindingsLimit, "number", "int32"));
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
     * Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
     * @param riskId Risk id.
     */
    public async riskAnalyticsControllerGetRiskEventDetails(riskId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskId' is not null or undefined
        if (riskId === null || riskId === undefined) {
            throw new RequiredError("RiskAnalyticsControllerApi", "riskAnalyticsControllerGetRiskEventDetails", "riskId");
        }


        // Path Params
        const localVarPath = '/api/v3/risk_events/details/{risk_id}'
            .replace('{' + 'risk_id' + '}', encodeURIComponent(String(riskId)));

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
     * Summary: Get risk event process status Description: Get the risk event process status.
     */
    public async riskAnalyticsControllerGetRiskEventProcessStatus(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/risk_process/status';

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
     * Summary: Get risk event row Description: Return a list of risk events.
     * @param status Status to retrieve only the status events, blank to retrieve all.
     * @param dateFrom The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ.
     * @param dateTo The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ.
     * @param pivotType Pivot type - enum.
     * @param pivotId Pivot id -  all pivot fields separated by semicolon.
     * @param pivotDbUser Optional db_user - if pivot is db user.
     * @param pivotDatabase Optional database - if pivot is db user / database.
     * @param pivotServerIp Optional server_ip - if pivot is db user / database.
     * @param pivotOsUser Optional os_user - if pivot is os user.
     * @param pivotDatabaseSourceField Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database.
     */
    public async riskAnalyticsControllerGetRiskEventRow(status?: 'UNDEFINED_STATUS' | 'OPENED' | 'CLOSED' | 'DELEGATED' | 'FOLLOWUP', dateFrom?: Date, dateTo?: Date, pivotType?: 'UNDEFINED_PIVOT_TYPE' | 'DATABASE' | 'DB_USER' | 'OS_USER' | 'GLOBAL', pivotId?: string, pivotDbUser?: string, pivotDatabase?: string, pivotServerIp?: string, pivotOsUser?: string, pivotDatabaseSourceField?: 'UNDEFINED' | 'DATABASE_NAME' | 'SERVICE_NAME', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;











        // Path Params
        const localVarPath = '/api/v3/risk_events';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (status !== undefined) {
            requestContext.setQueryParam("status", ObjectSerializer.serialize(status, "'UNDEFINED_STATUS' | 'OPENED' | 'CLOSED' | 'DELEGATED' | 'FOLLOWUP'", ""));
        }

        // Query Params
        if (dateFrom !== undefined) {
            requestContext.setQueryParam("date_from", ObjectSerializer.serialize(dateFrom, "Date", "date-time"));
        }

        // Query Params
        if (dateTo !== undefined) {
            requestContext.setQueryParam("date_to", ObjectSerializer.serialize(dateTo, "Date", "date-time"));
        }

        // Query Params
        if (pivotType !== undefined) {
            requestContext.setQueryParam("pivot.type", ObjectSerializer.serialize(pivotType, "'UNDEFINED_PIVOT_TYPE' | 'DATABASE' | 'DB_USER' | 'OS_USER' | 'GLOBAL'", ""));
        }

        // Query Params
        if (pivotId !== undefined) {
            requestContext.setQueryParam("pivot.id", ObjectSerializer.serialize(pivotId, "string", ""));
        }

        // Query Params
        if (pivotDbUser !== undefined) {
            requestContext.setQueryParam("pivot.db_user", ObjectSerializer.serialize(pivotDbUser, "string", ""));
        }

        // Query Params
        if (pivotDatabase !== undefined) {
            requestContext.setQueryParam("pivot.database", ObjectSerializer.serialize(pivotDatabase, "string", ""));
        }

        // Query Params
        if (pivotServerIp !== undefined) {
            requestContext.setQueryParam("pivot.server_ip", ObjectSerializer.serialize(pivotServerIp, "string", ""));
        }

        // Query Params
        if (pivotOsUser !== undefined) {
            requestContext.setQueryParam("pivot.os_user", ObjectSerializer.serialize(pivotOsUser, "string", ""));
        }

        // Query Params
        if (pivotDatabaseSourceField !== undefined) {
            requestContext.setQueryParam("pivot.database_source_field", ObjectSerializer.serialize(pivotDatabaseSourceField, "'UNDEFINED' | 'DATABASE_NAME' | 'SERVICE_NAME'", ""));
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
     * Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
     * @param riskId Risk ID
     */
    public async riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(riskId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskId' is not null or undefined
        if (riskId === null || riskId === undefined) {
            throw new RequiredError("RiskAnalyticsControllerApi", "riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails", "riskId");
        }


        // Path Params
        const localVarPath = '/api/v3/risk_events/va/{risk_id}'
            .replace('{' + 'risk_id' + '}', encodeURIComponent(String(riskId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
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
     * Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
     */
    public async riskAnalyticsControllerGetRiskFeedback(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/risk_events/feedback';

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
     * Summary: Get risk observation details Description: Return details of a single risk observation.
     * @param leadFeatureId Lead feature id.
     * @param observationType Observation type.
     */
    public async riskAnalyticsControllerGetRiskObservationDetails(leadFeatureId?: number, observationType?: 'UNDEFINED_OBSERVATION_TYPE' | 'ACTIVITY' | 'EXCEPTION' | 'VIOLATION' | 'OUTLIER' | 'ANOMALY', _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/risk_events/observations';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (leadFeatureId !== undefined) {
            requestContext.setQueryParam("lead_feature_id", ObjectSerializer.serialize(leadFeatureId, "number", "int32"));
        }

        // Query Params
        if (observationType !== undefined) {
            requestContext.setQueryParam("observation_type", ObjectSerializer.serialize(observationType, "'UNDEFINED_OBSERVATION_TYPE' | 'ACTIVITY' | 'EXCEPTION' | 'VIOLATION' | 'OUTLIER' | 'ANOMALY'", ""));
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
     * Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
     */
    public async riskAnalyticsControllerGetUserUISettings(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/risk_events/user_ui_settings';

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
     * Summary: Risk event tuning Description: Perform tuning risk event actions.
     * @param riskanalyticscontrollerv3RiskEventTuningRequest 
     */
    public async riskAnalyticsControllerRiskEventTuning(riskanalyticscontrollerv3RiskEventTuningRequest: Riskanalyticscontrollerv3RiskEventTuningRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskanalyticscontrollerv3RiskEventTuningRequest' is not null or undefined
        if (riskanalyticscontrollerv3RiskEventTuningRequest === null || riskanalyticscontrollerv3RiskEventTuningRequest === undefined) {
            throw new RequiredError("RiskAnalyticsControllerApi", "riskAnalyticsControllerRiskEventTuning", "riskanalyticscontrollerv3RiskEventTuningRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/risk_events/tuning';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(riskanalyticscontrollerv3RiskEventTuningRequest, "Riskanalyticscontrollerv3RiskEventTuningRequest", ""),
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
     * Summary: Set risk event status Description: Update the risk status and justification.
     * @param riskanalyticscontrollerv3SetRiskEventStatusRequest 
     */
    public async riskAnalyticsControllerSetRiskEventStatus(riskanalyticscontrollerv3SetRiskEventStatusRequest: Riskanalyticscontrollerv3SetRiskEventStatusRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskanalyticscontrollerv3SetRiskEventStatusRequest' is not null or undefined
        if (riskanalyticscontrollerv3SetRiskEventStatusRequest === null || riskanalyticscontrollerv3SetRiskEventStatusRequest === undefined) {
            throw new RequiredError("RiskAnalyticsControllerApi", "riskAnalyticsControllerSetRiskEventStatus", "riskanalyticscontrollerv3SetRiskEventStatusRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/risk_events/status';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(riskanalyticscontrollerv3SetRiskEventStatusRequest, "Riskanalyticscontrollerv3SetRiskEventStatusRequest", ""),
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
     * Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium Insights. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium Insights.
     * @param riskanalyticscontrollerv3SetUserUISettingsRequest 
     */
    public async riskAnalyticsControllerSetUserUISettings(riskanalyticscontrollerv3SetUserUISettingsRequest: Riskanalyticscontrollerv3SetUserUISettingsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskanalyticscontrollerv3SetUserUISettingsRequest' is not null or undefined
        if (riskanalyticscontrollerv3SetUserUISettingsRequest === null || riskanalyticscontrollerv3SetUserUISettingsRequest === undefined) {
            throw new RequiredError("RiskAnalyticsControllerApi", "riskAnalyticsControllerSetUserUISettings", "riskanalyticscontrollerv3SetUserUISettingsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/risk_events/user_ui_settings';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(riskanalyticscontrollerv3SetUserUISettingsRequest, "Riskanalyticscontrollerv3SetUserUISettingsRequest", ""),
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
     * Summary: Update risk feedback Description: Provide feedback for one or more risk events
     * @param riskanalyticscontrollerv3UpdateRiskFeedbackRequest 
     */
    public async riskAnalyticsControllerUpdateRiskFeedback(riskanalyticscontrollerv3UpdateRiskFeedbackRequest: Riskanalyticscontrollerv3UpdateRiskFeedbackRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskanalyticscontrollerv3UpdateRiskFeedbackRequest' is not null or undefined
        if (riskanalyticscontrollerv3UpdateRiskFeedbackRequest === null || riskanalyticscontrollerv3UpdateRiskFeedbackRequest === undefined) {
            throw new RequiredError("RiskAnalyticsControllerApi", "riskAnalyticsControllerUpdateRiskFeedback", "riskanalyticscontrollerv3UpdateRiskFeedbackRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/risk_events/feedback';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(riskanalyticscontrollerv3UpdateRiskFeedbackRequest, "Riskanalyticscontrollerv3UpdateRiskFeedbackRequest", ""),
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

export class RiskAnalyticsControllerApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerEnableDisableRiskEventFeedback
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerEnableDisableRiskEventFeedbackWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse", ""
            ) as Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse;
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
            const body: Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse", ""
            ) as Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerEnableDisableRiskEventProcess
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerEnableDisableRiskEventProcessWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse", ""
            ) as Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse;
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
            const body: Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse", ""
            ) as Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerGetAllClassificationsList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerGetAllClassificationsListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3GetAllClassificationsListResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3GetAllClassificationsListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetAllClassificationsListResponse", ""
            ) as Riskanalyticscontrollerv3GetAllClassificationsListResponse;
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
            const body: Riskanalyticscontrollerv3GetAllClassificationsListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetAllClassificationsListResponse", ""
            ) as Riskanalyticscontrollerv3GetAllClassificationsListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerGetRiskEventClassificationsList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerGetRiskEventClassificationsListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse;
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
            const body: Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerGetRiskEventDataForSummarization
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerGetRiskEventDataForSummarizationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3RiskEventSummarizationDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3RiskEventSummarizationDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3RiskEventSummarizationDataResponse", ""
            ) as Riskanalyticscontrollerv3RiskEventSummarizationDataResponse;
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
            const body: Riskanalyticscontrollerv3RiskEventSummarizationDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3RiskEventSummarizationDataResponse", ""
            ) as Riskanalyticscontrollerv3RiskEventSummarizationDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerGetRiskEventDetails
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerGetRiskEventDetailsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventDetailsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3GetRiskEventDetailsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskEventDetailsResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskEventDetailsResponse;
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
            const body: Riskanalyticscontrollerv3GetRiskEventDetailsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskEventDetailsResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskEventDetailsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerGetRiskEventProcessStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerGetRiskEventProcessStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse;
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
            const body: Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerGetRiskEventRow
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerGetRiskEventRowWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskEventRowResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3GetRiskEventRowResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskEventRowResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskEventRowResponse;
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
            const body: Riskanalyticscontrollerv3GetRiskEventRowResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskEventRowResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskEventRowResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse", ""
            ) as Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse;
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
            const body: Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse", ""
            ) as Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerGetRiskFeedback
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerGetRiskFeedbackWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskFeedbackResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3GetRiskFeedbackResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskFeedbackResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskFeedbackResponse;
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
            const body: Riskanalyticscontrollerv3GetRiskFeedbackResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskFeedbackResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskFeedbackResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerGetRiskObservationDetails
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerGetRiskObservationDetailsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3GetRiskObservationDetailsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3GetRiskObservationDetailsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskObservationDetailsResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskObservationDetailsResponse;
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
            const body: Riskanalyticscontrollerv3GetRiskObservationDetailsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetRiskObservationDetailsResponse", ""
            ) as Riskanalyticscontrollerv3GetRiskObservationDetailsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerGetUserUISettings
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerGetUserUISettingsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3GetUserUISettingsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3GetUserUISettingsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetUserUISettingsResponse", ""
            ) as Riskanalyticscontrollerv3GetUserUISettingsResponse;
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
            const body: Riskanalyticscontrollerv3GetUserUISettingsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3GetUserUISettingsResponse", ""
            ) as Riskanalyticscontrollerv3GetUserUISettingsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerRiskEventTuning
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerRiskEventTuningWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3RiskEventTuningResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3RiskEventTuningResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3RiskEventTuningResponse", ""
            ) as Riskanalyticscontrollerv3RiskEventTuningResponse;
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
            const body: Riskanalyticscontrollerv3RiskEventTuningResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3RiskEventTuningResponse", ""
            ) as Riskanalyticscontrollerv3RiskEventTuningResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerSetRiskEventStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerSetRiskEventStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3SetRiskEventStatusResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3SetRiskEventStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3SetRiskEventStatusResponse", ""
            ) as Riskanalyticscontrollerv3SetRiskEventStatusResponse;
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
            const body: Riskanalyticscontrollerv3SetRiskEventStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3SetRiskEventStatusResponse", ""
            ) as Riskanalyticscontrollerv3SetRiskEventStatusResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerSetUserUISettings
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerSetUserUISettingsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3SetUserUISettingsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3SetUserUISettingsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3SetUserUISettingsResponse", ""
            ) as Riskanalyticscontrollerv3SetUserUISettingsResponse;
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
            const body: Riskanalyticscontrollerv3SetUserUISettingsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3SetUserUISettingsResponse", ""
            ) as Riskanalyticscontrollerv3SetUserUISettingsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsControllerUpdateRiskFeedback
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsControllerUpdateRiskFeedbackWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticscontrollerv3UpdateRiskFeedbackResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticscontrollerv3UpdateRiskFeedbackResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3UpdateRiskFeedbackResponse", ""
            ) as Riskanalyticscontrollerv3UpdateRiskFeedbackResponse;
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
            const body: Riskanalyticscontrollerv3UpdateRiskFeedbackResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticscontrollerv3UpdateRiskFeedbackResponse", ""
            ) as Riskanalyticscontrollerv3UpdateRiskFeedbackResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
