// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Databootstrapperv3LoadDataRequest } from '../models/Databootstrapperv3LoadDataRequest';
import { Databootstrapperv3LoadDataResponse } from '../models/Databootstrapperv3LoadDataResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class DatabootstrapperServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Load data Description: Load data for a tenant.
     * @param databootstrapperv3LoadDataRequest 
     */
    public async databootstrapperServiceLoadData(databootstrapperv3LoadDataRequest: Databootstrapperv3LoadDataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'databootstrapperv3LoadDataRequest' is not null or undefined
        if (databootstrapperv3LoadDataRequest === null || databootstrapperv3LoadDataRequest === undefined) {
            throw new RequiredError("DatabootstrapperServiceApi", "databootstrapperServiceLoadData", "databootstrapperv3LoadDataRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/databootstrapper/data';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(databootstrapperv3LoadDataRequest, "Databootstrapperv3LoadDataRequest", ""),
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

export class DatabootstrapperServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to databootstrapperServiceLoadData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async databootstrapperServiceLoadDataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Databootstrapperv3LoadDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Databootstrapperv3LoadDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Databootstrapperv3LoadDataResponse", ""
            ) as Databootstrapperv3LoadDataResponse;
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
            const body: Databootstrapperv3LoadDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Databootstrapperv3LoadDataResponse", ""
            ) as Databootstrapperv3LoadDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
