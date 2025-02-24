// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Riskanalyticsdataprocessorv3GetRiskContextResponse } from '../models/Riskanalyticsdataprocessorv3GetRiskContextResponse';
import { Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse } from '../models/Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class RiskAnalyticsDataProcessorApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
     * @param riskId Risk id.
     * @param timezone Timezone in IANA format.
     */
    public async riskAnalyticsDataProcessorGetRiskContext(riskId: number, timezone?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskId' is not null or undefined
        if (riskId === null || riskId === undefined) {
            throw new RequiredError("RiskAnalyticsDataProcessorApi", "riskAnalyticsDataProcessorGetRiskContext", "riskId");
        }



        // Path Params
        const localVarPath = '/api/v3/risk_events/{risk_id}/context'
            .replace('{' + 'risk_id' + '}', encodeURIComponent(String(riskId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (timezone !== undefined) {
            requestContext.setQueryParam("timezone", ObjectSerializer.serialize(timezone, "string", ""));
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
     * Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.
     * @param riskId Risk id.
     */
    public async riskAnalyticsDataProcessorGetRiskPredefinedQuestions(riskId: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'riskId' is not null or undefined
        if (riskId === null || riskId === undefined) {
            throw new RequiredError("RiskAnalyticsDataProcessorApi", "riskAnalyticsDataProcessorGetRiskPredefinedQuestions", "riskId");
        }


        // Path Params
        const localVarPath = '/api/v3/risk_events/{risk_id}/questions'
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

}

export class RiskAnalyticsDataProcessorApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsDataProcessorGetRiskContext
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsDataProcessorGetRiskContextWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticsdataprocessorv3GetRiskContextResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticsdataprocessorv3GetRiskContextResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticsdataprocessorv3GetRiskContextResponse", ""
            ) as Riskanalyticsdataprocessorv3GetRiskContextResponse;
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
            const body: Riskanalyticsdataprocessorv3GetRiskContextResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticsdataprocessorv3GetRiskContextResponse", ""
            ) as Riskanalyticsdataprocessorv3GetRiskContextResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to riskAnalyticsDataProcessorGetRiskPredefinedQuestions
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async riskAnalyticsDataProcessorGetRiskPredefinedQuestionsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse", ""
            ) as Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse;
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
            const body: Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse", ""
            ) as Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
