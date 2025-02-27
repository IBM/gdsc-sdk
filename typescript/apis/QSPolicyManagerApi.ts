// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Qspmpolicymanagerv3APIResonse } from '../models/Qspmpolicymanagerv3APIResonse';
import { Qspmpolicymanagerv3CreateTicketRequest } from '../models/Qspmpolicymanagerv3CreateTicketRequest';
import { Qspmpolicymanagerv3CreateTicketResponse } from '../models/Qspmpolicymanagerv3CreateTicketResponse';
import { Qspmpolicymanagerv3FetchObjectStoreFileResponse } from '../models/Qspmpolicymanagerv3FetchObjectStoreFileResponse';
import { Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest } from '../models/Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest';
import { Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse } from '../models/Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse';
import { Qspmpolicymanagerv3StandardEmptyResponse } from '../models/Qspmpolicymanagerv3StandardEmptyResponse';
import { Qspmpolicymanagerv3UpdateConfigsRequest } from '../models/Qspmpolicymanagerv3UpdateConfigsRequest';
import { Qspmpolicymanagerv3UpdateTicketStatusRequest } from '../models/Qspmpolicymanagerv3UpdateTicketStatusRequest';
import { Qspmpolicymanagerv3UpdateTicketStatusResponse } from '../models/Qspmpolicymanagerv3UpdateTicketStatusResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class QSPolicyManagerApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * BatchStatusUpdate - trigger the batch to update the status of the Ticket .
     * @param body 
     */
    public async qSPolicyManagerBatchStatusUpdate(body: any, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new RequiredError("QSPolicyManagerApi", "qSPolicyManagerBatchStatusUpdate", "body");
        }


        // Path Params
        const localVarPath = '/api/v3/policy_manager/tickets/status';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(body, "any", ""),
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
     * ConfigUpdate - this function update Crypto Risk Factor Weight in Db2 as well as Mongodb.
     * @param qspmpolicymanagerv3UpdateConfigsRequest 
     */
    public async qSPolicyManagerConfigUpdate(qspmpolicymanagerv3UpdateConfigsRequest: Qspmpolicymanagerv3UpdateConfigsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'qspmpolicymanagerv3UpdateConfigsRequest' is not null or undefined
        if (qspmpolicymanagerv3UpdateConfigsRequest === null || qspmpolicymanagerv3UpdateConfigsRequest === undefined) {
            throw new RequiredError("QSPolicyManagerApi", "qSPolicyManagerConfigUpdate", "qspmpolicymanagerv3UpdateConfigsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policy_manager/configs';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmpolicymanagerv3UpdateConfigsRequest, "Qspmpolicymanagerv3UpdateConfigsRequest", ""),
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
     * CreateTicket - Create a new Incident .
     * @param qspmpolicymanagerv3CreateTicketRequest 
     */
    public async qSPolicyManagerCreateTicket(qspmpolicymanagerv3CreateTicketRequest: Qspmpolicymanagerv3CreateTicketRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'qspmpolicymanagerv3CreateTicketRequest' is not null or undefined
        if (qspmpolicymanagerv3CreateTicketRequest === null || qspmpolicymanagerv3CreateTicketRequest === undefined) {
            throw new RequiredError("QSPolicyManagerApi", "qSPolicyManagerCreateTicket", "qspmpolicymanagerv3CreateTicketRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policy_manager/ticket';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmpolicymanagerv3CreateTicketRequest, "Qspmpolicymanagerv3CreateTicketRequest", ""),
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
     * FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
     */
    public async qSPolicyManagerFetchFilesfromBuckets(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/policy_manager/os-files';

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
     * ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
     * @param qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest 
     */
    public async qSPolicyManagerProcessPolicyDimentionRecords(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest: Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest' is not null or undefined
        if (qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest === null || qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest === undefined) {
            throw new RequiredError("QSPolicyManagerApi", "qSPolicyManagerProcessPolicyDimentionRecords", "qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policy_manager/policy/process';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest, "Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest", ""),
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
     * UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .
     * @param qspmpolicymanagerv3UpdateTicketStatusRequest 
     */
    public async qSPolicyManagerUpdateTicketStatus(qspmpolicymanagerv3UpdateTicketStatusRequest: Qspmpolicymanagerv3UpdateTicketStatusRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'qspmpolicymanagerv3UpdateTicketStatusRequest' is not null or undefined
        if (qspmpolicymanagerv3UpdateTicketStatusRequest === null || qspmpolicymanagerv3UpdateTicketStatusRequest === undefined) {
            throw new RequiredError("QSPolicyManagerApi", "qSPolicyManagerUpdateTicketStatus", "qspmpolicymanagerv3UpdateTicketStatusRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/policy_manager/ticket/status';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmpolicymanagerv3UpdateTicketStatusRequest, "Qspmpolicymanagerv3UpdateTicketStatusRequest", ""),
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

export class QSPolicyManagerApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPolicyManagerBatchStatusUpdate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPolicyManagerBatchStatusUpdateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpolicymanagerv3StandardEmptyResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpolicymanagerv3StandardEmptyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3StandardEmptyResponse", ""
            ) as Qspmpolicymanagerv3StandardEmptyResponse;
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
            const body: Qspmpolicymanagerv3StandardEmptyResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3StandardEmptyResponse", ""
            ) as Qspmpolicymanagerv3StandardEmptyResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPolicyManagerConfigUpdate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPolicyManagerConfigUpdateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpolicymanagerv3APIResonse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpolicymanagerv3APIResonse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3APIResonse", ""
            ) as Qspmpolicymanagerv3APIResonse;
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
            const body: Qspmpolicymanagerv3APIResonse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3APIResonse", ""
            ) as Qspmpolicymanagerv3APIResonse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPolicyManagerCreateTicket
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPolicyManagerCreateTicketWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpolicymanagerv3CreateTicketResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpolicymanagerv3CreateTicketResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3CreateTicketResponse", ""
            ) as Qspmpolicymanagerv3CreateTicketResponse;
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
            const body: Qspmpolicymanagerv3CreateTicketResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3CreateTicketResponse", ""
            ) as Qspmpolicymanagerv3CreateTicketResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPolicyManagerFetchFilesfromBuckets
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPolicyManagerFetchFilesfromBucketsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpolicymanagerv3FetchObjectStoreFileResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpolicymanagerv3FetchObjectStoreFileResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3FetchObjectStoreFileResponse", ""
            ) as Qspmpolicymanagerv3FetchObjectStoreFileResponse;
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
            const body: Qspmpolicymanagerv3FetchObjectStoreFileResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3FetchObjectStoreFileResponse", ""
            ) as Qspmpolicymanagerv3FetchObjectStoreFileResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPolicyManagerProcessPolicyDimentionRecords
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPolicyManagerProcessPolicyDimentionRecordsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse", ""
            ) as Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse;
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
            const body: Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse", ""
            ) as Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPolicyManagerUpdateTicketStatus
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPolicyManagerUpdateTicketStatusWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpolicymanagerv3UpdateTicketStatusResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpolicymanagerv3UpdateTicketStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3UpdateTicketStatusResponse", ""
            ) as Qspmpolicymanagerv3UpdateTicketStatusResponse;
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
            const body: Qspmpolicymanagerv3UpdateTicketStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpolicymanagerv3UpdateTicketStatusResponse", ""
            ) as Qspmpolicymanagerv3UpdateTicketStatusResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
