// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Qsdataloaderv3QSfileValidatorRequest } from '../models/Qsdataloaderv3QSfileValidatorRequest';
import { Qsdataloaderv3QSfileValidatorResonse } from '../models/Qsdataloaderv3QSfileValidatorResonse';
import { Qsdataloaderv3QSyntheticDataLoaderResonse } from '../models/Qsdataloaderv3QSyntheticDataLoaderResonse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class QSDataLoaderApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * QSfileValidator - validate the files before insert happend .
     * @param qsdataloaderv3QSfileValidatorRequest 
     */
    public async qSDataLoaderQSfileValidator(qsdataloaderv3QSfileValidatorRequest: Qsdataloaderv3QSfileValidatorRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'qsdataloaderv3QSfileValidatorRequest' is not null or undefined
        if (qsdataloaderv3QSfileValidatorRequest === null || qsdataloaderv3QSfileValidatorRequest === undefined) {
            throw new RequiredError("QSDataLoaderApi", "qSDataLoaderQSfileValidator", "qsdataloaderv3QSfileValidatorRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/data/validation';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qsdataloaderv3QSfileValidatorRequest, "Qsdataloaderv3QSfileValidatorRequest", ""),
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
     * UploadSyntheticDataLoader - Insert data into Db after read from .sql file .
     * @param body 
     */
    public async qSDataLoaderUploadSyntheticDataLoader(body: any, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'body' is not null or undefined
        if (body === null || body === undefined) {
            throw new RequiredError("QSDataLoaderApi", "qSDataLoaderUploadSyntheticDataLoader", "body");
        }


        // Path Params
        const localVarPath = '/api/v3/data/synthetic';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
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
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class QSDataLoaderApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSDataLoaderQSfileValidator
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSDataLoaderQSfileValidatorWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qsdataloaderv3QSfileValidatorResonse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qsdataloaderv3QSfileValidatorResonse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qsdataloaderv3QSfileValidatorResonse", ""
            ) as Qsdataloaderv3QSfileValidatorResonse;
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
            const body: Qsdataloaderv3QSfileValidatorResonse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qsdataloaderv3QSfileValidatorResonse", ""
            ) as Qsdataloaderv3QSfileValidatorResonse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSDataLoaderUploadSyntheticDataLoader
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSDataLoaderUploadSyntheticDataLoaderWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qsdataloaderv3QSyntheticDataLoaderResonse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qsdataloaderv3QSyntheticDataLoaderResonse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qsdataloaderv3QSyntheticDataLoaderResonse", ""
            ) as Qsdataloaderv3QSyntheticDataLoaderResonse;
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
            const body: Qsdataloaderv3QSyntheticDataLoaderResonse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qsdataloaderv3QSyntheticDataLoaderResonse", ""
            ) as Qsdataloaderv3QSyntheticDataLoaderResonse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
