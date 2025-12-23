// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Auditv3GetActivityRecordsResponse } from '../models/Auditv3GetActivityRecordsResponse';
import { Auditv3PutActivityRecordRequest } from '../models/Auditv3PutActivityRecordRequest';
import { Auditv3PutActivityRecordResponse } from '../models/Auditv3PutActivityRecordResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class AuditServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * @deprecated
     *
     * Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \"op1, op2, op3\".
     * @param startTime Return records starting at this time (&gt;&#x3D;).
     * @param endTime Return records ending before this time (&lt;).
     * @param uid Return records with this service/collection id.
     * @param actionTaken Return records matching this operation (CRUD or other action).
     * @param context Return records for this service/collection.
     * @param changesMade Return records created only for this reason.
     * @param performedBy Return records originating with the specified user id.
     * @param contextDescription Return records with this label.
     * @param query Return records based on the query.
     * @param offset The amount to offset the rows by for pagination.
     * @param limit The max amount of rows to return for pagination.
     * @param filter Return eligable filters if this is true.
     */
    public async auditServiceGetActivityRecords(startTime?: Date, endTime?: Date, uid?: string, actionTaken?: string, context?: string, changesMade?: string, performedBy?: string, contextDescription?: string, query?: string, offset?: number, limit?: number, filter?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;













        // Path Params
        const localVarPath = '/api/v3/activity';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startTime !== undefined) {
            requestContext.setQueryParam("start_time", ObjectSerializer.serialize(startTime, "Date", "date-time"));
        }

        // Query Params
        if (endTime !== undefined) {
            requestContext.setQueryParam("end_time", ObjectSerializer.serialize(endTime, "Date", "date-time"));
        }

        // Query Params
        if (uid !== undefined) {
            requestContext.setQueryParam("uid", ObjectSerializer.serialize(uid, "string", ""));
        }

        // Query Params
        if (actionTaken !== undefined) {
            requestContext.setQueryParam("action_taken", ObjectSerializer.serialize(actionTaken, "string", ""));
        }

        // Query Params
        if (context !== undefined) {
            requestContext.setQueryParam("context", ObjectSerializer.serialize(context, "string", ""));
        }

        // Query Params
        if (changesMade !== undefined) {
            requestContext.setQueryParam("changes_made", ObjectSerializer.serialize(changesMade, "string", ""));
        }

        // Query Params
        if (performedBy !== undefined) {
            requestContext.setQueryParam("performed_by", ObjectSerializer.serialize(performedBy, "string", ""));
        }

        // Query Params
        if (contextDescription !== undefined) {
            requestContext.setQueryParam("context_description", ObjectSerializer.serialize(contextDescription, "string", ""));
        }

        // Query Params
        if (query !== undefined) {
            requestContext.setQueryParam("query", ObjectSerializer.serialize(query, "string", ""));
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
        if (filter !== undefined) {
            requestContext.setQueryParam("filter", ObjectSerializer.serialize(filter, "boolean", ""));
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
     * Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.
     * @param auditv3PutActivityRecordRequest 
     */
    public async auditServicePutDownloadActivityRecord(auditv3PutActivityRecordRequest: Auditv3PutActivityRecordRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'auditv3PutActivityRecordRequest' is not null or undefined
        if (auditv3PutActivityRecordRequest === null || auditv3PutActivityRecordRequest === undefined) {
            throw new RequiredError("AuditServiceApi", "auditServicePutDownloadActivityRecord", "auditv3PutActivityRecordRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/activity';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(auditv3PutActivityRecordRequest, "Auditv3PutActivityRecordRequest", ""),
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

export class AuditServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to auditServiceGetActivityRecords
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async auditServiceGetActivityRecordsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Auditv3GetActivityRecordsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Auditv3GetActivityRecordsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Auditv3GetActivityRecordsResponse", ""
            ) as Auditv3GetActivityRecordsResponse;
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
            const body: Auditv3GetActivityRecordsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Auditv3GetActivityRecordsResponse", ""
            ) as Auditv3GetActivityRecordsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to auditServicePutDownloadActivityRecord
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async auditServicePutDownloadActivityRecordWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Auditv3PutActivityRecordResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Auditv3PutActivityRecordResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Auditv3PutActivityRecordResponse", ""
            ) as Auditv3PutActivityRecordResponse;
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
            const body: Auditv3PutActivityRecordResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Auditv3PutActivityRecordResponse", ""
            ) as Auditv3PutActivityRecordResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
