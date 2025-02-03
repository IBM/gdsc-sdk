// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Qspmpluginmanagerv3PluginRQ } from '../models/Qspmpluginmanagerv3PluginRQ';
import { Qspmpluginmanagerv3PluginRS } from '../models/Qspmpluginmanagerv3PluginRS';
import { Qspmpluginmanagerv3PolicyPluginRQ } from '../models/Qspmpluginmanagerv3PolicyPluginRQ';
import { Qspmpluginmanagerv3PolicyPluginRS } from '../models/Qspmpluginmanagerv3PolicyPluginRS';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class QSPluginManagerApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public async qSPluginManagerInvokeAppProv(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pluginId' is not null or undefined
        if (pluginId === null || pluginId === undefined) {
            throw new RequiredError("QSPluginManagerApi", "qSPluginManagerInvokeAppProv", "pluginId");
        }


        // verify required parameter 'qspmpluginmanagerv3PluginRQ' is not null or undefined
        if (qspmpluginmanagerv3PluginRQ === null || qspmpluginmanagerv3PluginRQ === undefined) {
            throw new RequiredError("QSPluginManagerApi", "qSPluginManagerInvokeAppProv", "qspmpluginmanagerv3PluginRQ");
        }


        // Path Params
        const localVarPath = '/api/v3/plugins/{plugin_id}/application'
            .replace('{' + 'plugin_id' + '}', encodeURIComponent(String(pluginId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmpluginmanagerv3PluginRQ, "Qspmpluginmanagerv3PluginRQ", ""),
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
     * Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public async qSPluginManagerInvokeExplorerV1(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pluginId' is not null or undefined
        if (pluginId === null || pluginId === undefined) {
            throw new RequiredError("QSPluginManagerApi", "qSPluginManagerInvokeExplorerV1", "pluginId");
        }


        // verify required parameter 'qspmpluginmanagerv3PluginRQ' is not null or undefined
        if (qspmpluginmanagerv3PluginRQ === null || qspmpluginmanagerv3PluginRQ === undefined) {
            throw new RequiredError("QSPluginManagerApi", "qSPluginManagerInvokeExplorerV1", "qspmpluginmanagerv3PluginRQ");
        }


        // Path Params
        const localVarPath = '/api/v3/plugins/{plugin_id}/explorer'
            .replace('{' + 'plugin_id' + '}', encodeURIComponent(String(pluginId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmpluginmanagerv3PluginRQ, "Qspmpluginmanagerv3PluginRQ", ""),
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
     * Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public async qSPluginManagerInvokeExplorerV2(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pluginId' is not null or undefined
        if (pluginId === null || pluginId === undefined) {
            throw new RequiredError("QSPluginManagerApi", "qSPluginManagerInvokeExplorerV2", "pluginId");
        }


        // verify required parameter 'qspmpluginmanagerv3PluginRQ' is not null or undefined
        if (qspmpluginmanagerv3PluginRQ === null || qspmpluginmanagerv3PluginRQ === undefined) {
            throw new RequiredError("QSPluginManagerApi", "qSPluginManagerInvokeExplorerV2", "qspmpluginmanagerv3PluginRQ");
        }


        // Path Params
        const localVarPath = '/api/v3/plugins/{plugin_id}/explorer/analytics'
            .replace('{' + 'plugin_id' + '}', encodeURIComponent(String(pluginId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmpluginmanagerv3PluginRQ, "Qspmpluginmanagerv3PluginRQ", ""),
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
     * Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PluginRQ 
     */
    public async qSPluginManagerInvokePlugin(pluginId: string, qspmpluginmanagerv3PluginRQ: Qspmpluginmanagerv3PluginRQ, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pluginId' is not null or undefined
        if (pluginId === null || pluginId === undefined) {
            throw new RequiredError("QSPluginManagerApi", "qSPluginManagerInvokePlugin", "pluginId");
        }


        // verify required parameter 'qspmpluginmanagerv3PluginRQ' is not null or undefined
        if (qspmpluginmanagerv3PluginRQ === null || qspmpluginmanagerv3PluginRQ === undefined) {
            throw new RequiredError("QSPluginManagerApi", "qSPluginManagerInvokePlugin", "qspmpluginmanagerv3PluginRQ");
        }


        // Path Params
        const localVarPath = '/api/v3/plugins/{plugin_id}/network'
            .replace('{' + 'plugin_id' + '}', encodeURIComponent(String(pluginId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmpluginmanagerv3PluginRQ, "Qspmpluginmanagerv3PluginRQ", ""),
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
     * Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload
     * @param pluginId Unique identifier for the plugin
     * @param qspmpluginmanagerv3PolicyPluginRQ 
     */
    public async qSPluginManagerInvokePolicy(pluginId: string, qspmpluginmanagerv3PolicyPluginRQ: Qspmpluginmanagerv3PolicyPluginRQ, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pluginId' is not null or undefined
        if (pluginId === null || pluginId === undefined) {
            throw new RequiredError("QSPluginManagerApi", "qSPluginManagerInvokePolicy", "pluginId");
        }


        // verify required parameter 'qspmpluginmanagerv3PolicyPluginRQ' is not null or undefined
        if (qspmpluginmanagerv3PolicyPluginRQ === null || qspmpluginmanagerv3PolicyPluginRQ === undefined) {
            throw new RequiredError("QSPluginManagerApi", "qSPluginManagerInvokePolicy", "qspmpluginmanagerv3PolicyPluginRQ");
        }


        // Path Params
        const localVarPath = '/api/v3/plugins/{plugin_id}/policy'
            .replace('{' + 'plugin_id' + '}', encodeURIComponent(String(pluginId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmpluginmanagerv3PolicyPluginRQ, "Qspmpluginmanagerv3PolicyPluginRQ", ""),
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

export class QSPluginManagerApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPluginManagerInvokeAppProv
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPluginManagerInvokeAppProvWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpluginmanagerv3PluginRS = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpluginmanagerv3PluginRS", ""
            ) as Qspmpluginmanagerv3PluginRS;
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
            const body: Qspmpluginmanagerv3PluginRS = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpluginmanagerv3PluginRS", ""
            ) as Qspmpluginmanagerv3PluginRS;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPluginManagerInvokeExplorerV1
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPluginManagerInvokeExplorerV1WithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpluginmanagerv3PluginRS = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpluginmanagerv3PluginRS", ""
            ) as Qspmpluginmanagerv3PluginRS;
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
            const body: Qspmpluginmanagerv3PluginRS = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpluginmanagerv3PluginRS", ""
            ) as Qspmpluginmanagerv3PluginRS;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPluginManagerInvokeExplorerV2
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPluginManagerInvokeExplorerV2WithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpluginmanagerv3PluginRS = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpluginmanagerv3PluginRS", ""
            ) as Qspmpluginmanagerv3PluginRS;
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
            const body: Qspmpluginmanagerv3PluginRS = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpluginmanagerv3PluginRS", ""
            ) as Qspmpluginmanagerv3PluginRS;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPluginManagerInvokePlugin
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPluginManagerInvokePluginWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpluginmanagerv3PluginRS >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpluginmanagerv3PluginRS = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpluginmanagerv3PluginRS", ""
            ) as Qspmpluginmanagerv3PluginRS;
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
            const body: Qspmpluginmanagerv3PluginRS = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpluginmanagerv3PluginRS", ""
            ) as Qspmpluginmanagerv3PluginRS;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSPluginManagerInvokePolicy
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSPluginManagerInvokePolicyWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmpluginmanagerv3PolicyPluginRS >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmpluginmanagerv3PolicyPluginRS = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpluginmanagerv3PolicyPluginRS", ""
            ) as Qspmpluginmanagerv3PolicyPluginRS;
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
            const body: Qspmpluginmanagerv3PolicyPluginRS = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmpluginmanagerv3PolicyPluginRS", ""
            ) as Qspmpluginmanagerv3PolicyPluginRS;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
