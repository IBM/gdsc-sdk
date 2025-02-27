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


package com.ibm.security.guardium;

import com.ibm.security.ApiCallback;
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.ApiResponse;
import com.ibm.security.Configuration;
import com.ibm.security.Pair;
import com.ibm.security.ProgressRequestBody;
import com.ibm.security.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ibm.security.guardium.Edgeschedulerv3GetEdgeQueryStatusResponse;
import com.ibm.security.guardium.Edgeschedulerv3ScheduleEdgeQueryRequest;
import com.ibm.security.guardium.Edgeschedulerv3ScheduleEdgeQueryResponse;
import com.ibm.security.guardium.RuntimeError;
import com.ibm.security.guardium.StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EdgeSchedulerServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EdgeSchedulerServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EdgeSchedulerServiceApi(ApiClient apiClient) {
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
     * Build call for edgeSchedulerServiceGetEdgeQueryStatus
     * @param edgeId the id of the edge (required)
     * @param edgeResultReportId the id of the UC report being queried for. (optional)
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
    public okhttp3.Call edgeSchedulerServiceGetEdgeQueryStatusCall(String edgeId, String edgeResultReportId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v3/edges/{edge_id}/query/status"
            .replace("{" + "edge_id" + "}", localVarApiClient.escapeString(edgeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (edgeResultReportId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("edge_result_report_id", edgeResultReportId));
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

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call edgeSchedulerServiceGetEdgeQueryStatusValidateBeforeCall(String edgeId, String edgeResultReportId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeId' is set
        if (edgeId == null) {
            throw new ApiException("Missing the required parameter 'edgeId' when calling edgeSchedulerServiceGetEdgeQueryStatus(Async)");
        }

        return edgeSchedulerServiceGetEdgeQueryStatusCall(edgeId, edgeResultReportId, _callback);

    }

    /**
     * Summary: Get edge query status Description: Get the status of a queued edge query
     * 
     * @param edgeId the id of the edge (required)
     * @param edgeResultReportId the id of the UC report being queried for. (optional)
     * @return Edgeschedulerv3GetEdgeQueryStatusResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Edgeschedulerv3GetEdgeQueryStatusResponse edgeSchedulerServiceGetEdgeQueryStatus(String edgeId, String edgeResultReportId) throws ApiException {
        ApiResponse<Edgeschedulerv3GetEdgeQueryStatusResponse> localVarResp = edgeSchedulerServiceGetEdgeQueryStatusWithHttpInfo(edgeId, edgeResultReportId);
        return localVarResp.getData();
    }

    /**
     * Summary: Get edge query status Description: Get the status of a queued edge query
     * 
     * @param edgeId the id of the edge (required)
     * @param edgeResultReportId the id of the UC report being queried for. (optional)
     * @return ApiResponse&lt;Edgeschedulerv3GetEdgeQueryStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Edgeschedulerv3GetEdgeQueryStatusResponse> edgeSchedulerServiceGetEdgeQueryStatusWithHttpInfo(String edgeId, String edgeResultReportId) throws ApiException {
        okhttp3.Call localVarCall = edgeSchedulerServiceGetEdgeQueryStatusValidateBeforeCall(edgeId, edgeResultReportId, null);
        Type localVarReturnType = new TypeToken<Edgeschedulerv3GetEdgeQueryStatusResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Summary: Get edge query status Description: Get the status of a queued edge query (asynchronously)
     * 
     * @param edgeId the id of the edge (required)
     * @param edgeResultReportId the id of the UC report being queried for. (optional)
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
    public okhttp3.Call edgeSchedulerServiceGetEdgeQueryStatusAsync(String edgeId, String edgeResultReportId, final ApiCallback<Edgeschedulerv3GetEdgeQueryStatusResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeSchedulerServiceGetEdgeQueryStatusValidateBeforeCall(edgeId, edgeResultReportId, _callback);
        Type localVarReturnType = new TypeToken<Edgeschedulerv3GetEdgeQueryStatusResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery
     * @param clientId edge client id to monitor edge query requests for. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response.(streaming responses) </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeSchedulerServiceMonitoringPendingRequestForEdgeQueryCall(String clientId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v3/edges/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clientId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("client_id", clientId));
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

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call edgeSchedulerServiceMonitoringPendingRequestForEdgeQueryValidateBeforeCall(String clientId, final ApiCallback _callback) throws ApiException {
        return edgeSchedulerServiceMonitoringPendingRequestForEdgeQueryCall(clientId, _callback);

    }

    /**
     * Summary: Monitor for a pending edge query request Description: monitor edge query pending request
     * 
     * @param clientId edge client id to monitor edge query requests for. (optional)
     * @return StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response.(streaming responses) </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse edgeSchedulerServiceMonitoringPendingRequestForEdgeQuery(String clientId) throws ApiException {
        ApiResponse<StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse> localVarResp = edgeSchedulerServiceMonitoringPendingRequestForEdgeQueryWithHttpInfo(clientId);
        return localVarResp.getData();
    }

    /**
     * Summary: Monitor for a pending edge query request Description: monitor edge query pending request
     * 
     * @param clientId edge client id to monitor edge query requests for. (optional)
     * @return ApiResponse&lt;StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response.(streaming responses) </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse> edgeSchedulerServiceMonitoringPendingRequestForEdgeQueryWithHttpInfo(String clientId) throws ApiException {
        okhttp3.Call localVarCall = edgeSchedulerServiceMonitoringPendingRequestForEdgeQueryValidateBeforeCall(clientId, null);
        Type localVarReturnType = new TypeToken<StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Summary: Monitor for a pending edge query request Description: monitor edge query pending request (asynchronously)
     * 
     * @param clientId edge client id to monitor edge query requests for. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response.(streaming responses) </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call edgeSchedulerServiceMonitoringPendingRequestForEdgeQueryAsync(String clientId, final ApiCallback<StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeSchedulerServiceMonitoringPendingRequestForEdgeQueryValidateBeforeCall(clientId, _callback);
        Type localVarReturnType = new TypeToken<StreamResultOfEdgeschedulerv3MonitoringPendingRequestForEdgeQueryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for edgeSchedulerServiceScheduleEdgeQuery
     * @param edgeId the id of the edge (required)
     * @param edgeschedulerv3ScheduleEdgeQueryRequest  (required)
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
    public okhttp3.Call edgeSchedulerServiceScheduleEdgeQueryCall(String edgeId, Edgeschedulerv3ScheduleEdgeQueryRequest edgeschedulerv3ScheduleEdgeQueryRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = edgeschedulerv3ScheduleEdgeQueryRequest;

        // create path and map variables
        String localVarPath = "/api/v3/edges/{edge_id}/query/schedule"
            .replace("{" + "edge_id" + "}", localVarApiClient.escapeString(edgeId.toString()));

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
    private okhttp3.Call edgeSchedulerServiceScheduleEdgeQueryValidateBeforeCall(String edgeId, Edgeschedulerv3ScheduleEdgeQueryRequest edgeschedulerv3ScheduleEdgeQueryRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'edgeId' is set
        if (edgeId == null) {
            throw new ApiException("Missing the required parameter 'edgeId' when calling edgeSchedulerServiceScheduleEdgeQuery(Async)");
        }

        // verify the required parameter 'edgeschedulerv3ScheduleEdgeQueryRequest' is set
        if (edgeschedulerv3ScheduleEdgeQueryRequest == null) {
            throw new ApiException("Missing the required parameter 'edgeschedulerv3ScheduleEdgeQueryRequest' when calling edgeSchedulerServiceScheduleEdgeQuery(Async)");
        }

        return edgeSchedulerServiceScheduleEdgeQueryCall(edgeId, edgeschedulerv3ScheduleEdgeQueryRequest, _callback);

    }

    /**
     * Summary: Schedule an edge query  Description: Schedule an edge query via data warehouse queue
     * 
     * @param edgeId the id of the edge (required)
     * @param edgeschedulerv3ScheduleEdgeQueryRequest  (required)
     * @return Edgeschedulerv3ScheduleEdgeQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Edgeschedulerv3ScheduleEdgeQueryResponse edgeSchedulerServiceScheduleEdgeQuery(String edgeId, Edgeschedulerv3ScheduleEdgeQueryRequest edgeschedulerv3ScheduleEdgeQueryRequest) throws ApiException {
        ApiResponse<Edgeschedulerv3ScheduleEdgeQueryResponse> localVarResp = edgeSchedulerServiceScheduleEdgeQueryWithHttpInfo(edgeId, edgeschedulerv3ScheduleEdgeQueryRequest);
        return localVarResp.getData();
    }

    /**
     * Summary: Schedule an edge query  Description: Schedule an edge query via data warehouse queue
     * 
     * @param edgeId the id of the edge (required)
     * @param edgeschedulerv3ScheduleEdgeQueryRequest  (required)
     * @return ApiResponse&lt;Edgeschedulerv3ScheduleEdgeQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Edgeschedulerv3ScheduleEdgeQueryResponse> edgeSchedulerServiceScheduleEdgeQueryWithHttpInfo(String edgeId, Edgeschedulerv3ScheduleEdgeQueryRequest edgeschedulerv3ScheduleEdgeQueryRequest) throws ApiException {
        okhttp3.Call localVarCall = edgeSchedulerServiceScheduleEdgeQueryValidateBeforeCall(edgeId, edgeschedulerv3ScheduleEdgeQueryRequest, null);
        Type localVarReturnType = new TypeToken<Edgeschedulerv3ScheduleEdgeQueryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Summary: Schedule an edge query  Description: Schedule an edge query via data warehouse queue (asynchronously)
     * 
     * @param edgeId the id of the edge (required)
     * @param edgeschedulerv3ScheduleEdgeQueryRequest  (required)
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
    public okhttp3.Call edgeSchedulerServiceScheduleEdgeQueryAsync(String edgeId, Edgeschedulerv3ScheduleEdgeQueryRequest edgeschedulerv3ScheduleEdgeQueryRequest, final ApiCallback<Edgeschedulerv3ScheduleEdgeQueryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = edgeSchedulerServiceScheduleEdgeQueryValidateBeforeCall(edgeId, edgeschedulerv3ScheduleEdgeQueryRequest, _callback);
        Type localVarReturnType = new TypeToken<Edgeschedulerv3ScheduleEdgeQueryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
