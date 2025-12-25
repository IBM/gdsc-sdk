// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Notificationsv3CreateTicketRequest } from '../models/Notificationsv3CreateTicketRequest';
import { Notificationsv3CreateTicketResponse } from '../models/Notificationsv3CreateTicketResponse';
import { Notificationsv3GetFoldersRequest } from '../models/Notificationsv3GetFoldersRequest';
import { Notificationsv3GetFoldersResponse } from '../models/Notificationsv3GetFoldersResponse';
import { Notificationsv3GetNotificationFilenameResponse } from '../models/Notificationsv3GetNotificationFilenameResponse';
import { Notificationsv3GetNotificationRecordResponse } from '../models/Notificationsv3GetNotificationRecordResponse';
import { Notificationsv3GetNotificationRecordsResponse } from '../models/Notificationsv3GetNotificationRecordsResponse';
import { Notificationsv3GetTicketStatusResponse } from '../models/Notificationsv3GetTicketStatusResponse';
import { Notificationsv3PostNotificationRecordRequest } from '../models/Notificationsv3PostNotificationRecordRequest';
import { Notificationsv3PostNotificationRecordResponse } from '../models/Notificationsv3PostNotificationRecordResponse';
import { Notificationsv3SearchNotificationRecordsRequest } from '../models/Notificationsv3SearchNotificationRecordsRequest';
import { Notificationsv3SearchNotificationRecordsResponse } from '../models/Notificationsv3SearchNotificationRecordsResponse';
import { Notificationsv3TestIntegrationRequest } from '../models/Notificationsv3TestIntegrationRequest';
import { Notificationsv3TestIntegrationResponse } from '../models/Notificationsv3TestIntegrationResponse';
import { Notificationsv3UpdateNotificationRecordRequest } from '../models/Notificationsv3UpdateNotificationRecordRequest';
import { Notificationsv3UpdateNotificationRecordResponse } from '../models/Notificationsv3UpdateNotificationRecordResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class NotificationsServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Create ticket Description: Create ticket based on information passed in.
     * @param notificationsv3CreateTicketRequest 
     */
    public async notificationsServiceCreateTicket(notificationsv3CreateTicketRequest: Notificationsv3CreateTicketRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'notificationsv3CreateTicketRequest' is not null or undefined
        if (notificationsv3CreateTicketRequest === null || notificationsv3CreateTicketRequest === undefined) {
            throw new RequiredError("NotificationsServiceApi", "notificationsServiceCreateTicket", "notificationsv3CreateTicketRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/integrations/ticket';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(notificationsv3CreateTicketRequest, "Notificationsv3CreateTicketRequest", ""),
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get folders Description: Get folder for the integration connection provided.
     * @param notificationsv3GetFoldersRequest 
     */
    public async notificationsServiceGetFolders(notificationsv3GetFoldersRequest: Notificationsv3GetFoldersRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'notificationsv3GetFoldersRequest' is not null or undefined
        if (notificationsv3GetFoldersRequest === null || notificationsv3GetFoldersRequest === undefined) {
            throw new RequiredError("NotificationsServiceApi", "notificationsServiceGetFolders", "notificationsv3GetFoldersRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/integrations/folders';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(notificationsv3GetFoldersRequest, "Notificationsv3GetFoldersRequest", ""),
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
     * @param notificationId Params are located in the requests context (tenant id, user email, notification id).
     */
    public async notificationsServiceGetNotificationFilename(notificationId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;


        // Path Params
        const localVarPath = '/api/v3/notifications/filename';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (notificationId !== undefined) {
            requestContext.setQueryParam("notification_id", ObjectSerializer.serialize(notificationId, "string", ""));
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get notification record Description: Return notifications record with the specified ID.
     * @param notificationId ID for the record to return.
     */
    public async notificationsServiceGetNotificationRecord(notificationId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'notificationId' is not null or undefined
        if (notificationId === null || notificationId === undefined) {
            throw new RequiredError("NotificationsServiceApi", "notificationsServiceGetNotificationRecord", "notificationId");
        }


        // Path Params
        const localVarPath = '/api/v3/notifications/details/{notification_id}'
            .replace('{' + 'notification_id' + '}', encodeURIComponent(String(notificationId)));

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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get notification records Description: Return notifications records that match the specified filter.
     * @param filterStartTime Return records created at this time or later (&gt;&#x3D;).
     * @param filterEndTime Return records created before this time (&lt;).
     * @param filterState Only return record that include the specified state.
     * @param filterOrigins Only return record that includes the specified origins.
     * @param filterOriginData Only return record that with the specified origin_data.
     * @param filterLimit The max amount of rows to return for this single query.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param includeFilterCounts Computing the filter counts is relatively expensive, only compute when needed.
     */
    public async notificationsServiceGetNotificationRecords(filterStartTime?: Date, filterEndTime?: Date, filterState?: 'INCLUDE_ALL' | 'UNREAD_ONLY' | 'READ_ONLY' | 'COMPLETE_ONLY' | 'NOT_COMPLETE', filterOrigins?: Array<string>, filterOriginData?: string, filterLimit?: number, offset?: number, limit?: number, includeFilterCounts?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;










        // Path Params
        const localVarPath = '/api/v3/notifications';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (filterStartTime !== undefined) {
            requestContext.setQueryParam("filter.start_time", ObjectSerializer.serialize(filterStartTime, "Date", "date-time"));
        }

        // Query Params
        if (filterEndTime !== undefined) {
            requestContext.setQueryParam("filter.end_time", ObjectSerializer.serialize(filterEndTime, "Date", "date-time"));
        }

        // Query Params
        if (filterState !== undefined) {
            requestContext.setQueryParam("filter.state", ObjectSerializer.serialize(filterState, "'INCLUDE_ALL' | 'UNREAD_ONLY' | 'READ_ONLY' | 'COMPLETE_ONLY' | 'NOT_COMPLETE'", ""));
        }

        // Query Params
        if (filterOrigins !== undefined) {
            const serializedParams = ObjectSerializer.serialize(filterOrigins, "Array<string>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("filter.origins", serializedParam);
            }
        }

        // Query Params
        if (filterOriginData !== undefined) {
            requestContext.setQueryParam("filter.origin_data", ObjectSerializer.serialize(filterOriginData, "string", ""));
        }

        // Query Params
        if (filterLimit !== undefined) {
            requestContext.setQueryParam("filter.limit", ObjectSerializer.serialize(filterLimit, "number", "int64"));
        }

        // Query Params
        if (offset !== undefined) {
            requestContext.setQueryParam("offset", ObjectSerializer.serialize(offset, "number", "int64"));
        }

        // Query Params
        if (limit !== undefined) {
            requestContext.setQueryParam("limit", ObjectSerializer.serialize(limit, "number", "int64"));
        }

        // Query Params
        if (includeFilterCounts !== undefined) {
            requestContext.setQueryParam("include_filter_counts", ObjectSerializer.serialize(includeFilterCounts, "boolean", ""));
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Get ticket status Description: Get the status of the given ticket
     * @param ticketId The ID of the ticket to fetch.
     * @param integrationId The ID of the ticketing integration.
     */
    public async notificationsServiceGetTicketStatus(ticketId?: string, integrationId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;



        // Path Params
        const localVarPath = '/api/v3/integrations/ticket/status';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (ticketId !== undefined) {
            requestContext.setQueryParam("ticket_id", ObjectSerializer.serialize(ticketId, "string", ""));
        }

        // Query Params
        if (integrationId !== undefined) {
            requestContext.setQueryParam("integration_id", ObjectSerializer.serialize(integrationId, "string", ""));
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: For PostNotificationRecord notification only Description: Sends notification with recipients and returns a status
     * @param notificationsv3PostNotificationRecordRequest 
     */
    public async notificationsServicePostNotificationRecord(notificationsv3PostNotificationRecordRequest: Notificationsv3PostNotificationRecordRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'notificationsv3PostNotificationRecordRequest' is not null or undefined
        if (notificationsv3PostNotificationRecordRequest === null || notificationsv3PostNotificationRecordRequest === undefined) {
            throw new RequiredError("NotificationsServiceApi", "notificationsServicePostNotificationRecord", "notificationsv3PostNotificationRecordRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/notifications';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(notificationsv3PostNotificationRecordRequest, "Notificationsv3PostNotificationRecordRequest", ""),
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Search notification records Description: Return notification records using pipeline of filters
     * @param notificationsv3SearchNotificationRecordsRequest 
     */
    public async notificationsServiceSearchNotificationRecords(notificationsv3SearchNotificationRecordsRequest: Notificationsv3SearchNotificationRecordsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'notificationsv3SearchNotificationRecordsRequest' is not null or undefined
        if (notificationsv3SearchNotificationRecordsRequest === null || notificationsv3SearchNotificationRecordsRequest === undefined) {
            throw new RequiredError("NotificationsServiceApi", "notificationsServiceSearchNotificationRecords", "notificationsv3SearchNotificationRecordsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/notifications/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(notificationsv3SearchNotificationRecordsRequest, "Notificationsv3SearchNotificationRecordsRequest", ""),
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
     * @param notificationsv3TestIntegrationRequest 
     */
    public async notificationsServiceTestIntegration(notificationsv3TestIntegrationRequest: Notificationsv3TestIntegrationRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'notificationsv3TestIntegrationRequest' is not null or undefined
        if (notificationsv3TestIntegrationRequest === null || notificationsv3TestIntegrationRequest === undefined) {
            throw new RequiredError("NotificationsServiceApi", "notificationsServiceTestIntegration", "notificationsv3TestIntegrationRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/integrations/test';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(notificationsv3TestIntegrationRequest, "Notificationsv3TestIntegrationRequest", ""),
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.
     * @param notificationsv3UpdateNotificationRecordRequest 
     */
    public async notificationsServiceUpdateNotificationRecord(notificationsv3UpdateNotificationRecordRequest: Notificationsv3UpdateNotificationRecordRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'notificationsv3UpdateNotificationRecordRequest' is not null or undefined
        if (notificationsv3UpdateNotificationRecordRequest === null || notificationsv3UpdateNotificationRecordRequest === undefined) {
            throw new RequiredError("NotificationsServiceApi", "notificationsServiceUpdateNotificationRecord", "notificationsv3UpdateNotificationRecordRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/notifications';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(notificationsv3UpdateNotificationRecordRequest, "Notificationsv3UpdateNotificationRecordRequest", ""),
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class NotificationsServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to notificationsServiceCreateTicket
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async notificationsServiceCreateTicketWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Notificationsv3CreateTicketResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Notificationsv3CreateTicketResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3CreateTicketResponse", ""
            ) as Notificationsv3CreateTicketResponse;
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
            const body: Notificationsv3CreateTicketResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3CreateTicketResponse", ""
            ) as Notificationsv3CreateTicketResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to notificationsServiceGetFolders
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async notificationsServiceGetFoldersWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Notificationsv3GetFoldersResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Notificationsv3GetFoldersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3GetFoldersResponse", ""
            ) as Notificationsv3GetFoldersResponse;
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
            const body: Notificationsv3GetFoldersResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3GetFoldersResponse", ""
            ) as Notificationsv3GetFoldersResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to notificationsServiceGetNotificationFilename
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async notificationsServiceGetNotificationFilenameWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Notificationsv3GetNotificationFilenameResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Notificationsv3GetNotificationFilenameResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3GetNotificationFilenameResponse", ""
            ) as Notificationsv3GetNotificationFilenameResponse;
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
            const body: Notificationsv3GetNotificationFilenameResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3GetNotificationFilenameResponse", ""
            ) as Notificationsv3GetNotificationFilenameResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to notificationsServiceGetNotificationRecord
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async notificationsServiceGetNotificationRecordWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Notificationsv3GetNotificationRecordResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Notificationsv3GetNotificationRecordResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3GetNotificationRecordResponse", ""
            ) as Notificationsv3GetNotificationRecordResponse;
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
            const body: Notificationsv3GetNotificationRecordResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3GetNotificationRecordResponse", ""
            ) as Notificationsv3GetNotificationRecordResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to notificationsServiceGetNotificationRecords
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async notificationsServiceGetNotificationRecordsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Notificationsv3GetNotificationRecordsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Notificationsv3GetNotificationRecordsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3GetNotificationRecordsResponse", ""
            ) as Notificationsv3GetNotificationRecordsResponse;
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
            const body: Notificationsv3GetNotificationRecordsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3GetNotificationRecordsResponse", ""
            ) as Notificationsv3GetNotificationRecordsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to notificationsServiceGetTicketStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async notificationsServiceGetTicketStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Notificationsv3GetTicketStatusResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Notificationsv3GetTicketStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3GetTicketStatusResponse", ""
            ) as Notificationsv3GetTicketStatusResponse;
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
            const body: Notificationsv3GetTicketStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3GetTicketStatusResponse", ""
            ) as Notificationsv3GetTicketStatusResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to notificationsServicePostNotificationRecord
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async notificationsServicePostNotificationRecordWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Notificationsv3PostNotificationRecordResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Notificationsv3PostNotificationRecordResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3PostNotificationRecordResponse", ""
            ) as Notificationsv3PostNotificationRecordResponse;
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
            const body: Notificationsv3PostNotificationRecordResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3PostNotificationRecordResponse", ""
            ) as Notificationsv3PostNotificationRecordResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to notificationsServiceSearchNotificationRecords
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async notificationsServiceSearchNotificationRecordsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Notificationsv3SearchNotificationRecordsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Notificationsv3SearchNotificationRecordsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3SearchNotificationRecordsResponse", ""
            ) as Notificationsv3SearchNotificationRecordsResponse;
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
            const body: Notificationsv3SearchNotificationRecordsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3SearchNotificationRecordsResponse", ""
            ) as Notificationsv3SearchNotificationRecordsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to notificationsServiceTestIntegration
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async notificationsServiceTestIntegrationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Notificationsv3TestIntegrationResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Notificationsv3TestIntegrationResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3TestIntegrationResponse", ""
            ) as Notificationsv3TestIntegrationResponse;
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
            const body: Notificationsv3TestIntegrationResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3TestIntegrationResponse", ""
            ) as Notificationsv3TestIntegrationResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to notificationsServiceUpdateNotificationRecord
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async notificationsServiceUpdateNotificationRecordWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Notificationsv3UpdateNotificationRecordResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Notificationsv3UpdateNotificationRecordResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3UpdateNotificationRecordResponse", ""
            ) as Notificationsv3UpdateNotificationRecordResponse;
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
            const body: Notificationsv3UpdateNotificationRecordResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Notificationsv3UpdateNotificationRecordResponse", ""
            ) as Notificationsv3UpdateNotificationRecordResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
