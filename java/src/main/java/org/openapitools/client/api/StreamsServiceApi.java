/*
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.RuntimeError;
import org.openapitools.client.model.Streamsv3CheckAWSCredentialsRequest;
import org.openapitools.client.model.Streamsv3CheckAWSCredentialsResponse;
import org.openapitools.client.model.Streamsv3CheckAzureEventHubRequest;
import org.openapitools.client.model.Streamsv3CheckAzureEventHubResponse;
import org.openapitools.client.model.Streamsv3CheckAzureStorageStringRequest;
import org.openapitools.client.model.Streamsv3CheckAzureStorageStringResponse;
import org.openapitools.client.model.Streamsv3GetAWSRegionsResponse;
import org.openapitools.client.model.Streamsv3ListAWSStreamsRequest;
import org.openapitools.client.model.Streamsv3ListAWSStreamsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamsServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StreamsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StreamsServiceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for streamsServiceCheckAWSCredentials
     * @param streamsv3CheckAWSCredentialsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamsServiceCheckAWSCredentialsCall(Streamsv3CheckAWSCredentialsRequest streamsv3CheckAWSCredentialsRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = streamsv3CheckAWSCredentialsRequest;

        // create path and map variables
        String localVarPath = "/api/v3/streams/credentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call streamsServiceCheckAWSCredentialsValidateBeforeCall(Streamsv3CheckAWSCredentialsRequest streamsv3CheckAWSCredentialsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'streamsv3CheckAWSCredentialsRequest' is set
        if (streamsv3CheckAWSCredentialsRequest == null) {
            throw new ApiException("Missing the required parameter 'streamsv3CheckAWSCredentialsRequest' when calling streamsServiceCheckAWSCredentials(Async)");
        }

        return streamsServiceCheckAWSCredentialsCall(streamsv3CheckAWSCredentialsRequest, _callback);

    }

    /**
     * Summary: Check AWS credentials Description: Service to verify AWS credentials.
     * 
     * @param streamsv3CheckAWSCredentialsRequest  (required)
     * @return Streamsv3CheckAWSCredentialsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Streamsv3CheckAWSCredentialsResponse streamsServiceCheckAWSCredentials(Streamsv3CheckAWSCredentialsRequest streamsv3CheckAWSCredentialsRequest) throws ApiException {
        ApiResponse<Streamsv3CheckAWSCredentialsResponse> localVarResp = streamsServiceCheckAWSCredentialsWithHttpInfo(streamsv3CheckAWSCredentialsRequest);
        return localVarResp.getData();
    }

    /**
     * Summary: Check AWS credentials Description: Service to verify AWS credentials.
     * 
     * @param streamsv3CheckAWSCredentialsRequest  (required)
     * @return ApiResponse&lt;Streamsv3CheckAWSCredentialsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Streamsv3CheckAWSCredentialsResponse> streamsServiceCheckAWSCredentialsWithHttpInfo(Streamsv3CheckAWSCredentialsRequest streamsv3CheckAWSCredentialsRequest) throws ApiException {
        okhttp3.Call localVarCall = streamsServiceCheckAWSCredentialsValidateBeforeCall(streamsv3CheckAWSCredentialsRequest, null);
        Type localVarReturnType = new TypeToken<Streamsv3CheckAWSCredentialsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Summary: Check AWS credentials Description: Service to verify AWS credentials. (asynchronously)
     * 
     * @param streamsv3CheckAWSCredentialsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamsServiceCheckAWSCredentialsAsync(Streamsv3CheckAWSCredentialsRequest streamsv3CheckAWSCredentialsRequest, final ApiCallback<Streamsv3CheckAWSCredentialsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = streamsServiceCheckAWSCredentialsValidateBeforeCall(streamsv3CheckAWSCredentialsRequest, _callback);
        Type localVarReturnType = new TypeToken<Streamsv3CheckAWSCredentialsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for streamsServiceCheckAzureEventHub
     * @param streamsv3CheckAzureEventHubRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamsServiceCheckAzureEventHubCall(Streamsv3CheckAzureEventHubRequest streamsv3CheckAzureEventHubRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = streamsv3CheckAzureEventHubRequest;

        // create path and map variables
        String localVarPath = "/api/v3/streams/azure_eventhub";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call streamsServiceCheckAzureEventHubValidateBeforeCall(Streamsv3CheckAzureEventHubRequest streamsv3CheckAzureEventHubRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'streamsv3CheckAzureEventHubRequest' is set
        if (streamsv3CheckAzureEventHubRequest == null) {
            throw new ApiException("Missing the required parameter 'streamsv3CheckAzureEventHubRequest' when calling streamsServiceCheckAzureEventHub(Async)");
        }

        return streamsServiceCheckAzureEventHubCall(streamsv3CheckAzureEventHubRequest, _callback);

    }

    /**
     * Summary: Check Azure event hub Description: Service to check Azure event hub.
     * 
     * @param streamsv3CheckAzureEventHubRequest  (required)
     * @return Streamsv3CheckAzureEventHubResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Streamsv3CheckAzureEventHubResponse streamsServiceCheckAzureEventHub(Streamsv3CheckAzureEventHubRequest streamsv3CheckAzureEventHubRequest) throws ApiException {
        ApiResponse<Streamsv3CheckAzureEventHubResponse> localVarResp = streamsServiceCheckAzureEventHubWithHttpInfo(streamsv3CheckAzureEventHubRequest);
        return localVarResp.getData();
    }

    /**
     * Summary: Check Azure event hub Description: Service to check Azure event hub.
     * 
     * @param streamsv3CheckAzureEventHubRequest  (required)
     * @return ApiResponse&lt;Streamsv3CheckAzureEventHubResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Streamsv3CheckAzureEventHubResponse> streamsServiceCheckAzureEventHubWithHttpInfo(Streamsv3CheckAzureEventHubRequest streamsv3CheckAzureEventHubRequest) throws ApiException {
        okhttp3.Call localVarCall = streamsServiceCheckAzureEventHubValidateBeforeCall(streamsv3CheckAzureEventHubRequest, null);
        Type localVarReturnType = new TypeToken<Streamsv3CheckAzureEventHubResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Summary: Check Azure event hub Description: Service to check Azure event hub. (asynchronously)
     * 
     * @param streamsv3CheckAzureEventHubRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamsServiceCheckAzureEventHubAsync(Streamsv3CheckAzureEventHubRequest streamsv3CheckAzureEventHubRequest, final ApiCallback<Streamsv3CheckAzureEventHubResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = streamsServiceCheckAzureEventHubValidateBeforeCall(streamsv3CheckAzureEventHubRequest, _callback);
        Type localVarReturnType = new TypeToken<Streamsv3CheckAzureEventHubResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for streamsServiceCheckAzureStorageString
     * @param streamsv3CheckAzureStorageStringRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamsServiceCheckAzureStorageStringCall(Streamsv3CheckAzureStorageStringRequest streamsv3CheckAzureStorageStringRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = streamsv3CheckAzureStorageStringRequest;

        // create path and map variables
        String localVarPath = "/api/v3/streams/azure_storage";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call streamsServiceCheckAzureStorageStringValidateBeforeCall(Streamsv3CheckAzureStorageStringRequest streamsv3CheckAzureStorageStringRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'streamsv3CheckAzureStorageStringRequest' is set
        if (streamsv3CheckAzureStorageStringRequest == null) {
            throw new ApiException("Missing the required parameter 'streamsv3CheckAzureStorageStringRequest' when calling streamsServiceCheckAzureStorageString(Async)");
        }

        return streamsServiceCheckAzureStorageStringCall(streamsv3CheckAzureStorageStringRequest, _callback);

    }

    /**
     * Summary: Check Azure storage string Description: Service to verify Azure storage connection.
     * 
     * @param streamsv3CheckAzureStorageStringRequest  (required)
     * @return Streamsv3CheckAzureStorageStringResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Streamsv3CheckAzureStorageStringResponse streamsServiceCheckAzureStorageString(Streamsv3CheckAzureStorageStringRequest streamsv3CheckAzureStorageStringRequest) throws ApiException {
        ApiResponse<Streamsv3CheckAzureStorageStringResponse> localVarResp = streamsServiceCheckAzureStorageStringWithHttpInfo(streamsv3CheckAzureStorageStringRequest);
        return localVarResp.getData();
    }

    /**
     * Summary: Check Azure storage string Description: Service to verify Azure storage connection.
     * 
     * @param streamsv3CheckAzureStorageStringRequest  (required)
     * @return ApiResponse&lt;Streamsv3CheckAzureStorageStringResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Streamsv3CheckAzureStorageStringResponse> streamsServiceCheckAzureStorageStringWithHttpInfo(Streamsv3CheckAzureStorageStringRequest streamsv3CheckAzureStorageStringRequest) throws ApiException {
        okhttp3.Call localVarCall = streamsServiceCheckAzureStorageStringValidateBeforeCall(streamsv3CheckAzureStorageStringRequest, null);
        Type localVarReturnType = new TypeToken<Streamsv3CheckAzureStorageStringResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Summary: Check Azure storage string Description: Service to verify Azure storage connection. (asynchronously)
     * 
     * @param streamsv3CheckAzureStorageStringRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamsServiceCheckAzureStorageStringAsync(Streamsv3CheckAzureStorageStringRequest streamsv3CheckAzureStorageStringRequest, final ApiCallback<Streamsv3CheckAzureStorageStringResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = streamsServiceCheckAzureStorageStringValidateBeforeCall(streamsv3CheckAzureStorageStringRequest, _callback);
        Type localVarReturnType = new TypeToken<Streamsv3CheckAzureStorageStringResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for streamsServiceGetAWSRegions
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamsServiceGetAWSRegionsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v3/streams/regions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call streamsServiceGetAWSRegionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return streamsServiceGetAWSRegionsCall(_callback);

    }

    /**
     * Summary: Get AWS regions Description: Service to get AWS regions.
     * 
     * @return Streamsv3GetAWSRegionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Streamsv3GetAWSRegionsResponse streamsServiceGetAWSRegions() throws ApiException {
        ApiResponse<Streamsv3GetAWSRegionsResponse> localVarResp = streamsServiceGetAWSRegionsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Summary: Get AWS regions Description: Service to get AWS regions.
     * 
     * @return ApiResponse&lt;Streamsv3GetAWSRegionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Streamsv3GetAWSRegionsResponse> streamsServiceGetAWSRegionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = streamsServiceGetAWSRegionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Streamsv3GetAWSRegionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Summary: Get AWS regions Description: Service to get AWS regions. (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamsServiceGetAWSRegionsAsync(final ApiCallback<Streamsv3GetAWSRegionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = streamsServiceGetAWSRegionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Streamsv3GetAWSRegionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for streamsServiceListAWSStreams
     * @param streamsv3ListAWSStreamsRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamsServiceListAWSStreamsCall(Streamsv3ListAWSStreamsRequest streamsv3ListAWSStreamsRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = streamsv3ListAWSStreamsRequest;

        // create path and map variables
        String localVarPath = "/api/v3/streams";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call streamsServiceListAWSStreamsValidateBeforeCall(Streamsv3ListAWSStreamsRequest streamsv3ListAWSStreamsRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'streamsv3ListAWSStreamsRequest' is set
        if (streamsv3ListAWSStreamsRequest == null) {
            throw new ApiException("Missing the required parameter 'streamsv3ListAWSStreamsRequest' when calling streamsServiceListAWSStreams(Async)");
        }

        return streamsServiceListAWSStreamsCall(streamsv3ListAWSStreamsRequest, _callback);

    }

    /**
     * Summary: List AWS streams Description: Service to list AWS Kinesis streams.
     * 
     * @param streamsv3ListAWSStreamsRequest  (required)
     * @return Streamsv3ListAWSStreamsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Streamsv3ListAWSStreamsResponse streamsServiceListAWSStreams(Streamsv3ListAWSStreamsRequest streamsv3ListAWSStreamsRequest) throws ApiException {
        ApiResponse<Streamsv3ListAWSStreamsResponse> localVarResp = streamsServiceListAWSStreamsWithHttpInfo(streamsv3ListAWSStreamsRequest);
        return localVarResp.getData();
    }

    /**
     * Summary: List AWS streams Description: Service to list AWS Kinesis streams.
     * 
     * @param streamsv3ListAWSStreamsRequest  (required)
     * @return ApiResponse&lt;Streamsv3ListAWSStreamsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Streamsv3ListAWSStreamsResponse> streamsServiceListAWSStreamsWithHttpInfo(Streamsv3ListAWSStreamsRequest streamsv3ListAWSStreamsRequest) throws ApiException {
        okhttp3.Call localVarCall = streamsServiceListAWSStreamsValidateBeforeCall(streamsv3ListAWSStreamsRequest, null);
        Type localVarReturnType = new TypeToken<Streamsv3ListAWSStreamsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Summary: List AWS streams Description: Service to list AWS Kinesis streams. (asynchronously)
     * 
     * @param streamsv3ListAWSStreamsRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call streamsServiceListAWSStreamsAsync(Streamsv3ListAWSStreamsRequest streamsv3ListAWSStreamsRequest, final ApiCallback<Streamsv3ListAWSStreamsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = streamsServiceListAWSStreamsValidateBeforeCall(streamsv3ListAWSStreamsRequest, _callback);
        Type localVarReturnType = new TypeToken<Streamsv3ListAWSStreamsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
