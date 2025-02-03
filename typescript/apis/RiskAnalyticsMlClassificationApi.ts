// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse } from '../models/Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class RiskAnalyticsMlClassificationApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.
     */
    public async riskAnalyticsMlClassificationResetModelToDefaults(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/classification/ml/models/reset';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
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

}

export class RiskAnalyticsMlClassificationApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsMlClassificationResetModelToDefaults
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsMlClassificationResetModelToDefaultsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse", ""
            ) as Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse;
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
            const body: Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse", ""
            ) as Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
