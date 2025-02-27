// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Dashboardsv3CreateDashboardResponse } from '../models/Dashboardsv3CreateDashboardResponse';
import { Dashboardsv3Dashboard } from '../models/Dashboardsv3Dashboard';
import { Dashboardsv3DeleteDashboardRequest } from '../models/Dashboardsv3DeleteDashboardRequest';
import { Dashboardsv3DeleteDashboardResponse } from '../models/Dashboardsv3DeleteDashboardResponse';
import { Dashboardsv3GetDashboardsResponse } from '../models/Dashboardsv3GetDashboardsResponse';
import { Dashboardsv3UpdateDashboardRequest } from '../models/Dashboardsv3UpdateDashboardRequest';
import { Dashboardsv3UpdateDashboardResponse } from '../models/Dashboardsv3UpdateDashboardResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class DashboardsServiceApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Create dashboard Description: Create a unique dashboard.
     * @param dashboardsv3Dashboard Unique dashboard.
     */
    public async dashboardsServiceCreateDashboard(dashboardsv3Dashboard: Dashboardsv3Dashboard, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'dashboardsv3Dashboard' is not null or undefined
        if (dashboardsv3Dashboard === null || dashboardsv3Dashboard === undefined) {
            throw new RequiredError("DashboardsServiceApi", "dashboardsServiceCreateDashboard", "dashboardsv3Dashboard");
        }


        // Path Params
        const localVarPath = '/api/v3/dashboards';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(dashboardsv3Dashboard, "Dashboardsv3Dashboard", ""),
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
     * Summary: Delete dashboard Description: Delete a unique dashboard.
     * @param dashboardId The id of the dashboard to be deleted.
     * @param dashboardsv3DeleteDashboardRequest 
     */
    public async dashboardsServiceDeleteDashboard(dashboardId: string, dashboardsv3DeleteDashboardRequest: Dashboardsv3DeleteDashboardRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'dashboardId' is not null or undefined
        if (dashboardId === null || dashboardId === undefined) {
            throw new RequiredError("DashboardsServiceApi", "dashboardsServiceDeleteDashboard", "dashboardId");
        }


        // verify required parameter 'dashboardsv3DeleteDashboardRequest' is not null or undefined
        if (dashboardsv3DeleteDashboardRequest === null || dashboardsv3DeleteDashboardRequest === undefined) {
            throw new RequiredError("DashboardsServiceApi", "dashboardsServiceDeleteDashboard", "dashboardsv3DeleteDashboardRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/dashboards/{dashboard_id}'
            .replace('{' + 'dashboard_id' + '}', encodeURIComponent(String(dashboardId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(dashboardsv3DeleteDashboardRequest, "Dashboardsv3DeleteDashboardRequest", ""),
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
     * Summary: Get dashboards Description: Get a list of dashboards with all data.
     */
    public async dashboardsServiceGetDashboards(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/dashboards';

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
     * Summary: Update dashboard Description: Update a dashboard.
     * @param dashboardId The id of the dashboard that was updated.
     * @param dashboardsv3UpdateDashboardRequest 
     */
    public async dashboardsServiceUpdateDashboard(dashboardId: string, dashboardsv3UpdateDashboardRequest: Dashboardsv3UpdateDashboardRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'dashboardId' is not null or undefined
        if (dashboardId === null || dashboardId === undefined) {
            throw new RequiredError("DashboardsServiceApi", "dashboardsServiceUpdateDashboard", "dashboardId");
        }


        // verify required parameter 'dashboardsv3UpdateDashboardRequest' is not null or undefined
        if (dashboardsv3UpdateDashboardRequest === null || dashboardsv3UpdateDashboardRequest === undefined) {
            throw new RequiredError("DashboardsServiceApi", "dashboardsServiceUpdateDashboard", "dashboardsv3UpdateDashboardRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/dashboards/{dashboard_id}'
            .replace('{' + 'dashboard_id' + '}', encodeURIComponent(String(dashboardId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(dashboardsv3UpdateDashboardRequest, "Dashboardsv3UpdateDashboardRequest", ""),
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

export class DashboardsServiceApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dashboardsServiceCreateDashboard
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async dashboardsServiceCreateDashboardWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Dashboardsv3CreateDashboardResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Dashboardsv3CreateDashboardResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Dashboardsv3CreateDashboardResponse", ""
            ) as Dashboardsv3CreateDashboardResponse;
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
            const body: Dashboardsv3CreateDashboardResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Dashboardsv3CreateDashboardResponse", ""
            ) as Dashboardsv3CreateDashboardResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dashboardsServiceDeleteDashboard
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async dashboardsServiceDeleteDashboardWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Dashboardsv3DeleteDashboardResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Dashboardsv3DeleteDashboardResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Dashboardsv3DeleteDashboardResponse", ""
            ) as Dashboardsv3DeleteDashboardResponse;
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
            const body: Dashboardsv3DeleteDashboardResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Dashboardsv3DeleteDashboardResponse", ""
            ) as Dashboardsv3DeleteDashboardResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dashboardsServiceGetDashboards
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async dashboardsServiceGetDashboardsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Dashboardsv3GetDashboardsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Dashboardsv3GetDashboardsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Dashboardsv3GetDashboardsResponse", ""
            ) as Dashboardsv3GetDashboardsResponse;
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
            const body: Dashboardsv3GetDashboardsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Dashboardsv3GetDashboardsResponse", ""
            ) as Dashboardsv3GetDashboardsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to dashboardsServiceUpdateDashboard
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async dashboardsServiceUpdateDashboardWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Dashboardsv3UpdateDashboardResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Dashboardsv3UpdateDashboardResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Dashboardsv3UpdateDashboardResponse", ""
            ) as Dashboardsv3UpdateDashboardResponse;
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
            const body: Dashboardsv3UpdateDashboardResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Dashboardsv3UpdateDashboardResponse", ""
            ) as Dashboardsv3UpdateDashboardResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
