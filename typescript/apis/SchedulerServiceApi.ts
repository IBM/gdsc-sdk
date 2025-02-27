// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { RuntimeError } from '../models/RuntimeError';
import { Schedulerv3CreateScheduledJobRequest } from '../models/Schedulerv3CreateScheduledJobRequest';
import { Schedulerv3CreateScheduledJobResponse } from '../models/Schedulerv3CreateScheduledJobResponse';
import { Schedulerv3DeleteScheduledJobResponse } from '../models/Schedulerv3DeleteScheduledJobResponse';
import { Schedulerv3GetDependenciesResponse } from '../models/Schedulerv3GetDependenciesResponse';
import { Schedulerv3GetDistributionRulesResponse } from '../models/Schedulerv3GetDistributionRulesResponse';
import { Schedulerv3GetScheduledJobResponse } from '../models/Schedulerv3GetScheduledJobResponse';
import { Schedulerv3GetSchedulesByReportRequest } from '../models/Schedulerv3GetSchedulesByReportRequest';
import { Schedulerv3GetSchedulesByReportResponse } from '../models/Schedulerv3GetSchedulesByReportResponse';
import { Schedulerv3GetTagsResponse } from '../models/Schedulerv3GetTagsResponse';
import { Schedulerv3ScheduledJobSummaryResponse } from '../models/Schedulerv3ScheduledJobSummaryResponse';
import { Schedulerv3SearchScheduledJobsRequest } from '../models/Schedulerv3SearchScheduledJobsRequest';
import { Schedulerv3SearchScheduledTaskRunsRequest } from '../models/Schedulerv3SearchScheduledTaskRunsRequest';
import { Schedulerv3SearchScheduledTaskRunsResponse } from '../models/Schedulerv3SearchScheduledTaskRunsResponse';
import { Schedulerv3UpdateScheduledJobRequest } from '../models/Schedulerv3UpdateScheduledJobRequest';
import { Schedulerv3UpdateScheduledJobResponse } from '../models/Schedulerv3UpdateScheduledJobResponse';

/**
 * no description
 */
export class SchedulerServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Create scheduled job Description: Create a new scheduled job with tasks.
     * @param schedulerv3CreateScheduledJobRequest 
     */
    public async schedulerServiceCreateScheduledJob(schedulerv3CreateScheduledJobRequest: Schedulerv3CreateScheduledJobRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'schedulerv3CreateScheduledJobRequest' is not null or undefined
        if (schedulerv3CreateScheduledJobRequest === null || schedulerv3CreateScheduledJobRequest === undefined) {
            throw new RequiredError("SchedulerServiceApi", "schedulerServiceCreateScheduledJob", "schedulerv3CreateScheduledJobRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/schedules';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(schedulerv3CreateScheduledJobRequest, "Schedulerv3CreateScheduledJobRequest", ""),
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
     * Summary: Delete scheduled job Description: Delete a single scheduled job.
     * @param scheduleId Unique ID, required for delete.
     */
    public async schedulerServiceDeleteScheduledJob(scheduleId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'scheduleId' is not null or undefined
        if (scheduleId === null || scheduleId === undefined) {
            throw new RequiredError("SchedulerServiceApi", "schedulerServiceDeleteScheduledJob", "scheduleId");
        }


        // Path Params
        const localVarPath = '/api/v3/schedules/{schedule_id}'
            .replace('{' + 'schedule_id' + '}', encodeURIComponent(String(scheduleId)));

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
     * Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
     * @param configType specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc.
     */
    public async schedulerServiceGetDependencies(configType?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/schedules/dependencies';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (configType !== undefined) {
            requestContext.setQueryParam("config_type", ObjectSerializer.serialize(configType, "string", ""));
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
     * Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can\'t be edited if it is used by a scheduled job.
     */
    public async schedulerServiceGetDistributionRules(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/schedules/distribution_rules';

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
     * Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
     * @param scheduleId Used to return a single scheduledjob.
     */
    public async schedulerServiceGetScheduledJobDetails(scheduleId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'scheduleId' is not null or undefined
        if (scheduleId === null || scheduleId === undefined) {
            throw new RequiredError("SchedulerServiceApi", "schedulerServiceGetScheduledJobDetails", "scheduleId");
        }


        // Path Params
        const localVarPath = '/api/v3/schedules/{schedule_id}/details'
            .replace('{' + 'schedule_id' + '}', encodeURIComponent(String(scheduleId)));

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
     * Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
     * @param offset Optional: the amount to offset the rows by for pagination.
     * @param limit Optional: the max amount of rows to return for pagination.
     */
    public async schedulerServiceGetScheduledJobs(offset?: number, limit?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/schedules';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (offset !== undefined) {
            requestContext.setQueryParam("Offset", ObjectSerializer.serialize(offset, "number", "int64"));
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("Limit", ObjectSerializer.serialize(limit, "number", "int64"));
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
     * Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
     * @param reportId Report ID for the scheduled report.
     * @param schedulerv3GetSchedulesByReportRequest 
     */
    public async schedulerServiceGetSchedulesByReport(reportId: string, schedulerv3GetSchedulesByReportRequest: Schedulerv3GetSchedulesByReportRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'reportId' is not null or undefined
        if (reportId === null || reportId === undefined) {
            throw new RequiredError("SchedulerServiceApi", "schedulerServiceGetSchedulesByReport", "reportId");
        }


        // verify required parameter 'schedulerv3GetSchedulesByReportRequest' is not null or undefined
        if (schedulerv3GetSchedulesByReportRequest === null || schedulerv3GetSchedulesByReportRequest === undefined) {
            throw new RequiredError("SchedulerServiceApi", "schedulerServiceGetSchedulesByReport", "schedulerv3GetSchedulesByReportRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/schedules/searchByReport/{report_id}'
            .replace('{' + 'report_id' + '}', encodeURIComponent(String(reportId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(schedulerv3GetSchedulesByReportRequest, "Schedulerv3GetSchedulesByReportRequest", ""),
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
     * Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
     */
    public async schedulerServiceGetTags(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/schedules/tags';

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
     * Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
     * @param schedulerv3SearchScheduledJobsRequest 
     */
    public async schedulerServiceSearchScheduledJobs(schedulerv3SearchScheduledJobsRequest: Schedulerv3SearchScheduledJobsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'schedulerv3SearchScheduledJobsRequest' is not null or undefined
        if (schedulerv3SearchScheduledJobsRequest === null || schedulerv3SearchScheduledJobsRequest === undefined) {
            throw new RequiredError("SchedulerServiceApi", "schedulerServiceSearchScheduledJobs", "schedulerv3SearchScheduledJobsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/schedules/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(schedulerv3SearchScheduledJobsRequest, "Schedulerv3SearchScheduledJobsRequest", ""),
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
     * Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
     * @param schedulerv3SearchScheduledTaskRunsRequest 
     */
    public async schedulerServiceSearchScheduledTaskRuns(schedulerv3SearchScheduledTaskRunsRequest: Schedulerv3SearchScheduledTaskRunsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'schedulerv3SearchScheduledTaskRunsRequest' is not null or undefined
        if (schedulerv3SearchScheduledTaskRunsRequest === null || schedulerv3SearchScheduledTaskRunsRequest === undefined) {
            throw new RequiredError("SchedulerServiceApi", "schedulerServiceSearchScheduledTaskRuns", "schedulerv3SearchScheduledTaskRunsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/schedules/runs/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(schedulerv3SearchScheduledTaskRunsRequest, "Schedulerv3SearchScheduledTaskRunsRequest", ""),
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
     * Summary: Update scheduled job Description: Update a single schedule job.
     * @param scheduleId Unique ID, required for update.
     * @param schedulerv3UpdateScheduledJobRequest 
     */
    public async schedulerServiceUpdateScheduledJob(scheduleId: string, schedulerv3UpdateScheduledJobRequest: Schedulerv3UpdateScheduledJobRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'scheduleId' is not null or undefined
        if (scheduleId === null || scheduleId === undefined) {
            throw new RequiredError("SchedulerServiceApi", "schedulerServiceUpdateScheduledJob", "scheduleId");
        }


        // verify required parameter 'schedulerv3UpdateScheduledJobRequest' is not null or undefined
        if (schedulerv3UpdateScheduledJobRequest === null || schedulerv3UpdateScheduledJobRequest === undefined) {
            throw new RequiredError("SchedulerServiceApi", "schedulerServiceUpdateScheduledJob", "schedulerv3UpdateScheduledJobRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/schedules/{schedule_id}'
            .replace('{' + 'schedule_id' + '}', encodeURIComponent(String(scheduleId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(schedulerv3UpdateScheduledJobRequest, "Schedulerv3UpdateScheduledJobRequest", ""),
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

export class SchedulerServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceCreateScheduledJob
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceCreateScheduledJobWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3CreateScheduledJobResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3CreateScheduledJobResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3CreateScheduledJobResponse", ""
            ) as Schedulerv3CreateScheduledJobResponse;
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
            const body: Schedulerv3CreateScheduledJobResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3CreateScheduledJobResponse", ""
            ) as Schedulerv3CreateScheduledJobResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceDeleteScheduledJob
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceDeleteScheduledJobWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3DeleteScheduledJobResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3DeleteScheduledJobResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3DeleteScheduledJobResponse", ""
            ) as Schedulerv3DeleteScheduledJobResponse;
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
            const body: Schedulerv3DeleteScheduledJobResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3DeleteScheduledJobResponse", ""
            ) as Schedulerv3DeleteScheduledJobResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceGetDependencies
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceGetDependenciesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3GetDependenciesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3GetDependenciesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3GetDependenciesResponse", ""
            ) as Schedulerv3GetDependenciesResponse;
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
            const body: Schedulerv3GetDependenciesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3GetDependenciesResponse", ""
            ) as Schedulerv3GetDependenciesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceGetDistributionRules
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceGetDistributionRulesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3GetDistributionRulesResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3GetDistributionRulesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3GetDistributionRulesResponse", ""
            ) as Schedulerv3GetDistributionRulesResponse;
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
            const body: Schedulerv3GetDistributionRulesResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3GetDistributionRulesResponse", ""
            ) as Schedulerv3GetDistributionRulesResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceGetScheduledJobDetails
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceGetScheduledJobDetailsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3GetScheduledJobResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3GetScheduledJobResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3GetScheduledJobResponse", ""
            ) as Schedulerv3GetScheduledJobResponse;
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
            const body: Schedulerv3GetScheduledJobResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3GetScheduledJobResponse", ""
            ) as Schedulerv3GetScheduledJobResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceGetScheduledJobs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceGetScheduledJobsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3ScheduledJobSummaryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3ScheduledJobSummaryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3ScheduledJobSummaryResponse", ""
            ) as Schedulerv3ScheduledJobSummaryResponse;
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
            const body: Schedulerv3ScheduledJobSummaryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3ScheduledJobSummaryResponse", ""
            ) as Schedulerv3ScheduledJobSummaryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceGetSchedulesByReport
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceGetSchedulesByReportWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3GetSchedulesByReportResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3GetSchedulesByReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3GetSchedulesByReportResponse", ""
            ) as Schedulerv3GetSchedulesByReportResponse;
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
            const body: Schedulerv3GetSchedulesByReportResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3GetSchedulesByReportResponse", ""
            ) as Schedulerv3GetSchedulesByReportResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceGetTags
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceGetTagsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3GetTagsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3GetTagsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3GetTagsResponse", ""
            ) as Schedulerv3GetTagsResponse;
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
            const body: Schedulerv3GetTagsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3GetTagsResponse", ""
            ) as Schedulerv3GetTagsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceSearchScheduledJobs
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceSearchScheduledJobsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3ScheduledJobSummaryResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3ScheduledJobSummaryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3ScheduledJobSummaryResponse", ""
            ) as Schedulerv3ScheduledJobSummaryResponse;
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
            const body: Schedulerv3ScheduledJobSummaryResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3ScheduledJobSummaryResponse", ""
            ) as Schedulerv3ScheduledJobSummaryResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceSearchScheduledTaskRuns
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceSearchScheduledTaskRunsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3SearchScheduledTaskRunsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3SearchScheduledTaskRunsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3SearchScheduledTaskRunsResponse", ""
            ) as Schedulerv3SearchScheduledTaskRunsResponse;
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
            const body: Schedulerv3SearchScheduledTaskRunsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3SearchScheduledTaskRunsResponse", ""
            ) as Schedulerv3SearchScheduledTaskRunsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to schedulerServiceUpdateScheduledJob
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async schedulerServiceUpdateScheduledJobWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Schedulerv3UpdateScheduledJobResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Schedulerv3UpdateScheduledJobResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3UpdateScheduledJobResponse", ""
            ) as Schedulerv3UpdateScheduledJobResponse;
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
            const body: Schedulerv3UpdateScheduledJobResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Schedulerv3UpdateScheduledJobResponse", ""
            ) as Schedulerv3UpdateScheduledJobResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
