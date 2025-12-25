// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Pipelineconfigv3DeleteTenantResponse } from '../models/Pipelineconfigv3DeleteTenantResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class PipelineconfigServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Delete a tenant resource Description: Delete tenant specific resources such as data warehouse, mongo, postgres and s3.
     * @param tenantId unique tenant ID
     * @param resource resource specifies the specific resource to delete
     */
    public async pipelineconfigServiceDeleteTenantResources(tenantId: string, resource: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'tenantId' is not null or undefined
        if (tenantId === null || tenantId === undefined) {
            throw new RequiredError("PipelineconfigServiceApi", "pipelineconfigServiceDeleteTenantResources", "tenantId");
        }


        // verify required parameter 'resource' is not null or undefined
        if (resource === null || resource === undefined) {
            throw new RequiredError("PipelineconfigServiceApi", "pipelineconfigServiceDeleteTenantResources", "resource");
        }


        // Path Params
        const localVarPath = '/api/v3/resources/{tenant_id}/{resource}'
            .replace('{' + 'tenant_id' + '}', encodeURIComponent(String(tenantId)))
            .replace('{' + 'resource' + '}', encodeURIComponent(String(resource)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
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

export class PipelineconfigServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to pipelineconfigServiceDeleteTenantResources
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async pipelineconfigServiceDeleteTenantResourcesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Pipelineconfigv3DeleteTenantResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Pipelineconfigv3DeleteTenantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Pipelineconfigv3DeleteTenantResponse", ""
            ) as Pipelineconfigv3DeleteTenantResponse;
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
            const body: Pipelineconfigv3DeleteTenantResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Pipelineconfigv3DeleteTenantResponse", ""
            ) as Pipelineconfigv3DeleteTenantResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
