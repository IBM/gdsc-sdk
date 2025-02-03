// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Qspmdatamanagerv3AppDataResponse } from '../models/Qspmdatamanagerv3AppDataResponse';
import { Qspmdatamanagerv3InsertEntitiesRequest } from '../models/Qspmdatamanagerv3InsertEntitiesRequest';
import { Qspmdatamanagerv3MasterDataResponse } from '../models/Qspmdatamanagerv3MasterDataResponse';
import { Qspmdatamanagerv3NetlocDataResponse } from '../models/Qspmdatamanagerv3NetlocDataResponse';
import { Qspmdatamanagerv3ScanRequest } from '../models/Qspmdatamanagerv3ScanRequest';
import { Qspmdatamanagerv3ScanResponse } from '../models/Qspmdatamanagerv3ScanResponse';
import { Qspmdatamanagerv3SearchEntityDataRequest } from '../models/Qspmdatamanagerv3SearchEntityDataRequest';
import { Qspmdatamanagerv3SearchEntityDataResponse } from '../models/Qspmdatamanagerv3SearchEntityDataResponse';
import { Qspmdatamanagerv3UpdateNetLocRequest } from '../models/Qspmdatamanagerv3UpdateNetLocRequest';
import { Qspmdatamanagerv3UpdateNetLocResponse } from '../models/Qspmdatamanagerv3UpdateNetLocResponse';
import { RuntimeError } from '../models/RuntimeError';

/**
 * no description
 */
export class QSDataManagerApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.
     * @param provisionId Identifier for the provision request
     */
    public async qSDataManagerGetAppDataForProvisionId(provisionId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'provisionId' is not null or undefined
        if (provisionId === null || provisionId === undefined) {
            throw new RequiredError("QSDataManagerApi", "qSDataManagerGetAppDataForProvisionId", "provisionId");
        }


        // Path Params
        const localVarPath = '/api/v3/datamanager/application/{provision_id}/data'
            .replace('{' + 'provision_id' + '}', encodeURIComponent(String(provisionId)));

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
     * Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
     */
    public async qSDataManagerGetMasterData(_options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // Path Params
        const localVarPath = '/api/v3/datamanager/master-data';

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
     * Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.
     * @param scanId Identifier for the scan to retrieve netloc data for
     */
    public async qSDataManagerGetNetLocDimDataForScanId(scanId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'scanId' is not null or undefined
        if (scanId === null || scanId === undefined) {
            throw new RequiredError("QSDataManagerApi", "qSDataManagerGetNetLocDimDataForScanId", "scanId");
        }


        // Path Params
        const localVarPath = '/api/v3/datamanager/network/{scan_id}/data'
            .replace('{' + 'scan_id' + '}', encodeURIComponent(String(scanId)));

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
     * Summary: Insert Data Description: Insert All Dimension and Fact tables data.
     * @param qspmdatamanagerv3InsertEntitiesRequest 
     */
    public async qSDataManagerInsertAllEntities(qspmdatamanagerv3InsertEntitiesRequest: Qspmdatamanagerv3InsertEntitiesRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'qspmdatamanagerv3InsertEntitiesRequest' is not null or undefined
        if (qspmdatamanagerv3InsertEntitiesRequest === null || qspmdatamanagerv3InsertEntitiesRequest === undefined) {
            throw new RequiredError("QSDataManagerApi", "qSDataManagerInsertAllEntities", "qspmdatamanagerv3InsertEntitiesRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/datamanager/all/entities';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmdatamanagerv3InsertEntitiesRequest, "Qspmdatamanagerv3InsertEntitiesRequest", ""),
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
     * Summary: Insert ScanDetails Description: Register new data into scan dimension table.
     * @param qspmdatamanagerv3ScanRequest 
     */
    public async qSDataManagerRegisterScan(qspmdatamanagerv3ScanRequest: Qspmdatamanagerv3ScanRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'qspmdatamanagerv3ScanRequest' is not null or undefined
        if (qspmdatamanagerv3ScanRequest === null || qspmdatamanagerv3ScanRequest === undefined) {
            throw new RequiredError("QSDataManagerApi", "qSDataManagerRegisterScan", "qspmdatamanagerv3ScanRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/datamanager/scan';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmdatamanagerv3ScanRequest, "Qspmdatamanagerv3ScanRequest", ""),
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
     * Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
     * @param scanId 
     */
    public async qSDataManagerRetrieveScan(scanId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'scanId' is not null or undefined
        if (scanId === null || scanId === undefined) {
            throw new RequiredError("QSDataManagerApi", "qSDataManagerRetrieveScan", "scanId");
        }


        // Path Params
        const localVarPath = '/api/v3/datamanager/scan/{scan_id}/data'
            .replace('{' + 'scan_id' + '}', encodeURIComponent(String(scanId)));

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
     * Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters
     * @param qspmdatamanagerv3SearchEntityDataRequest 
     */
    public async qSDataManagerSearchEntityData(qspmdatamanagerv3SearchEntityDataRequest: Qspmdatamanagerv3SearchEntityDataRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'qspmdatamanagerv3SearchEntityDataRequest' is not null or undefined
        if (qspmdatamanagerv3SearchEntityDataRequest === null || qspmdatamanagerv3SearchEntityDataRequest === undefined) {
            throw new RequiredError("QSDataManagerApi", "qSDataManagerSearchEntityData", "qspmdatamanagerv3SearchEntityDataRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/datamanager/entity/search';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmdatamanagerv3SearchEntityDataRequest, "Qspmdatamanagerv3SearchEntityDataRequest", ""),
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
     * Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.
     * @param qspmdatamanagerv3UpdateNetLocRequest 
     */
    public async qSDataManagerUpdateNetLocation(qspmdatamanagerv3UpdateNetLocRequest: Qspmdatamanagerv3UpdateNetLocRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'qspmdatamanagerv3UpdateNetLocRequest' is not null or undefined
        if (qspmdatamanagerv3UpdateNetLocRequest === null || qspmdatamanagerv3UpdateNetLocRequest === undefined) {
            throw new RequiredError("QSDataManagerApi", "qSDataManagerUpdateNetLocation", "qspmdatamanagerv3UpdateNetLocRequest");
        }


        // Path Params
        const localVarPath = '/api/v3/datamanager/network';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PUT);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(qspmdatamanagerv3UpdateNetLocRequest, "Qspmdatamanagerv3UpdateNetLocRequest", ""),
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

export class QSDataManagerApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSDataManagerGetAppDataForProvisionId
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSDataManagerGetAppDataForProvisionIdWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmdatamanagerv3AppDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmdatamanagerv3AppDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3AppDataResponse", ""
            ) as Qspmdatamanagerv3AppDataResponse;
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
            const body: Qspmdatamanagerv3AppDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3AppDataResponse", ""
            ) as Qspmdatamanagerv3AppDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSDataManagerGetMasterData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSDataManagerGetMasterDataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmdatamanagerv3MasterDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmdatamanagerv3MasterDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3MasterDataResponse", ""
            ) as Qspmdatamanagerv3MasterDataResponse;
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
            const body: Qspmdatamanagerv3MasterDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3MasterDataResponse", ""
            ) as Qspmdatamanagerv3MasterDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSDataManagerGetNetLocDimDataForScanId
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSDataManagerGetNetLocDimDataForScanIdWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmdatamanagerv3NetlocDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmdatamanagerv3NetlocDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3NetlocDataResponse", ""
            ) as Qspmdatamanagerv3NetlocDataResponse;
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
            const body: Qspmdatamanagerv3NetlocDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3NetlocDataResponse", ""
            ) as Qspmdatamanagerv3NetlocDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSDataManagerInsertAllEntities
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSDataManagerInsertAllEntitiesWithHttpInfo(response: ResponseContext): Promise<HttpInfo<any >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
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
            const body: any = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "any", ""
            ) as any;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSDataManagerRegisterScan
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSDataManagerRegisterScanWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmdatamanagerv3ScanResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmdatamanagerv3ScanResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3ScanResponse", ""
            ) as Qspmdatamanagerv3ScanResponse;
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
            const body: Qspmdatamanagerv3ScanResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3ScanResponse", ""
            ) as Qspmdatamanagerv3ScanResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSDataManagerRetrieveScan
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSDataManagerRetrieveScanWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmdatamanagerv3ScanResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmdatamanagerv3ScanResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3ScanResponse", ""
            ) as Qspmdatamanagerv3ScanResponse;
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
            const body: Qspmdatamanagerv3ScanResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3ScanResponse", ""
            ) as Qspmdatamanagerv3ScanResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSDataManagerSearchEntityData
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSDataManagerSearchEntityDataWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmdatamanagerv3SearchEntityDataResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmdatamanagerv3SearchEntityDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3SearchEntityDataResponse", ""
            ) as Qspmdatamanagerv3SearchEntityDataResponse;
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
            const body: Qspmdatamanagerv3SearchEntityDataResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3SearchEntityDataResponse", ""
            ) as Qspmdatamanagerv3SearchEntityDataResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to qSDataManagerUpdateNetLocation
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async qSDataManagerUpdateNetLocationWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Qspmdatamanagerv3UpdateNetLocResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Qspmdatamanagerv3UpdateNetLocResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3UpdateNetLocResponse", ""
            ) as Qspmdatamanagerv3UpdateNetLocResponse;
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
            const body: Qspmdatamanagerv3UpdateNetLocResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Qspmdatamanagerv3UpdateNetLocResponse", ""
            ) as Qspmdatamanagerv3UpdateNetLocResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
