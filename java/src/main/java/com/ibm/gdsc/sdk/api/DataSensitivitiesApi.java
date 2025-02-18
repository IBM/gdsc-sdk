/*
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
 *
 * The version of the OpenAPI document: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ibm.gdsc.sdk.api;

import com.ibm.gdsc.sdk.ApiCallback;
import com.ibm.gdsc.sdk.ApiClient;
import com.ibm.gdsc.sdk.ApiException;
import com.ibm.gdsc.sdk.ApiResponse;
import com.ibm.gdsc.sdk.Configuration;
import com.ibm.gdsc.sdk.Pair;
import com.ibm.gdsc.sdk.ProgressRequestBody;
import com.ibm.gdsc.sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ibm.gdsc.sdk.models.Authenticate400Response;
import java.math.BigDecimal;
import com.ibm.gdsc.sdk.models.LastSeenSortSchema;
import com.ibm.gdsc.sdk.models.ListSensitivities200Response;
import com.ibm.gdsc.sdk.models.ListSensitivitiesFilterParameter;
import com.ibm.gdsc.sdk.models.SensitivitiesSummary;
import com.ibm.gdsc.sdk.models.Sensitivity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataSensitivitiesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DataSensitivitiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataSensitivitiesApi(ApiClient apiClient) {
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
     * Build call for getSensitivitiesSummary
     * @param filter  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSensitivitiesSummaryCall(ListSensitivitiesFilterParameter filter, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/dspm/sensitivities/summary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSensitivitiesSummaryValidateBeforeCall(ListSensitivitiesFilterParameter filter, final ApiCallback _callback) throws ApiException {
        return getSensitivitiesSummaryCall(filter, _callback);

    }

    /**
     * Get the summary of sensitivities
     * Get a summarised information about all sensitivities classified by Guardium Insights SaaS DSPM.
     * @param filter  (optional)
     * @return SensitivitiesSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public SensitivitiesSummary getSensitivitiesSummary(ListSensitivitiesFilterParameter filter) throws ApiException {
        ApiResponse<SensitivitiesSummary> localVarResp = getSensitivitiesSummaryWithHttpInfo(filter);
        return localVarResp.getData();
    }

    /**
     * Get the summary of sensitivities
     * Get a summarised information about all sensitivities classified by Guardium Insights SaaS DSPM.
     * @param filter  (optional)
     * @return ApiResponse&lt;SensitivitiesSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<SensitivitiesSummary> getSensitivitiesSummaryWithHttpInfo(ListSensitivitiesFilterParameter filter) throws ApiException {
        okhttp3.Call localVarCall = getSensitivitiesSummaryValidateBeforeCall(filter, null);
        Type localVarReturnType = new TypeToken<SensitivitiesSummary>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the summary of sensitivities (asynchronously)
     * Get a summarised information about all sensitivities classified by Guardium Insights SaaS DSPM.
     * @param filter  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSensitivitiesSummaryAsync(ListSensitivitiesFilterParameter filter, final ApiCallback<SensitivitiesSummary> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSensitivitiesSummaryValidateBeforeCall(filter, _callback);
        Type localVarReturnType = new TypeToken<SensitivitiesSummary>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSensitivity
     * @param sensitivityId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSensitivityCall(String sensitivityId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/dspm/sensitivities/{sensitivityId}"
            .replace("{" + "sensitivityId" + "}", localVarApiClient.escapeString(sensitivityId.toString()));

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSensitivityValidateBeforeCall(String sensitivityId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'sensitivityId' is set
        if (sensitivityId == null) {
            throw new ApiException("Missing the required parameter 'sensitivityId' when calling getSensitivity(Async)");
        }

        return getSensitivityCall(sensitivityId, _callback);

    }

    /**
     * Get sensitivity details by providing its ID
     * Get details of a sensitivity by providing its ID.
     * @param sensitivityId  (required)
     * @return Sensitivity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public Sensitivity getSensitivity(String sensitivityId) throws ApiException {
        ApiResponse<Sensitivity> localVarResp = getSensitivityWithHttpInfo(sensitivityId);
        return localVarResp.getData();
    }

    /**
     * Get sensitivity details by providing its ID
     * Get details of a sensitivity by providing its ID.
     * @param sensitivityId  (required)
     * @return ApiResponse&lt;Sensitivity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<Sensitivity> getSensitivityWithHttpInfo(String sensitivityId) throws ApiException {
        okhttp3.Call localVarCall = getSensitivityValidateBeforeCall(sensitivityId, null);
        Type localVarReturnType = new TypeToken<Sensitivity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get sensitivity details by providing its ID (asynchronously)
     * Get details of a sensitivity by providing its ID.
     * @param sensitivityId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call getSensitivityAsync(String sensitivityId, final ApiCallback<Sensitivity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSensitivityValidateBeforeCall(sensitivityId, _callback);
        Type localVarReturnType = new TypeToken<Sensitivity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listSensitivities
     * @param filter  (optional)
     * @param sort  (optional)
     * @param pageSize  (optional)
     * @param nextToken  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call listSensitivitiesCall(ListSensitivitiesFilterParameter filter, LastSeenSortSchema sort, BigDecimal pageSize, String nextToken, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/dspm/sensitivities";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (nextToken != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("nextToken", nextToken));
        }

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listSensitivitiesValidateBeforeCall(ListSensitivitiesFilterParameter filter, LastSeenSortSchema sort, BigDecimal pageSize, String nextToken, final ApiCallback _callback) throws ApiException {
        return listSensitivitiesCall(filter, sort, pageSize, nextToken, _callback);

    }

    /**
     * List sensitivities
     * Get a list of all the sensitivities based on an applied filter.
     * @param filter  (optional)
     * @param sort  (optional)
     * @param pageSize  (optional)
     * @param nextToken  (optional)
     * @return ListSensitivities200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public ListSensitivities200Response listSensitivities(ListSensitivitiesFilterParameter filter, LastSeenSortSchema sort, BigDecimal pageSize, String nextToken) throws ApiException {
        ApiResponse<ListSensitivities200Response> localVarResp = listSensitivitiesWithHttpInfo(filter, sort, pageSize, nextToken);
        return localVarResp.getData();
    }

    /**
     * List sensitivities
     * Get a list of all the sensitivities based on an applied filter.
     * @param filter  (optional)
     * @param sort  (optional)
     * @param pageSize  (optional)
     * @param nextToken  (optional)
     * @return ApiResponse&lt;ListSensitivities200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public ApiResponse<ListSensitivities200Response> listSensitivitiesWithHttpInfo(ListSensitivitiesFilterParameter filter, LastSeenSortSchema sort, BigDecimal pageSize, String nextToken) throws ApiException {
        okhttp3.Call localVarCall = listSensitivitiesValidateBeforeCall(filter, sort, pageSize, nextToken, null);
        Type localVarReturnType = new TypeToken<ListSensitivities200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List sensitivities (asynchronously)
     * Get a list of all the sensitivities based on an applied filter.
     * @param filter  (optional)
     * @param sort  (optional)
     * @param pageSize  (optional)
     * @param nextToken  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  </td></tr>
     </table>
     */
    public okhttp3.Call listSensitivitiesAsync(ListSensitivitiesFilterParameter filter, LastSeenSortSchema sort, BigDecimal pageSize, String nextToken, final ApiCallback<ListSensitivities200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = listSensitivitiesValidateBeforeCall(filter, sort, pageSize, nextToken, _callback);
        Type localVarReturnType = new TypeToken<ListSensitivities200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
