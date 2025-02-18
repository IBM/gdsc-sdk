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


package com.ibm.gdsc.sdk;

import com.ibm.gdsc.ApiCallback;
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.ApiResponse;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.Pair;
import com.ibm.gdsc.ProgressRequestBody;
import com.ibm.gdsc.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ibm.gdsc.sdk.RuntimeError;
import com.ibm.gdsc.sdk.Snifassistv3StatusResponseBase;
import com.ibm.gdsc.sdk.Snifassistv3TestRegexRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnifAssistServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SnifAssistServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SnifAssistServiceApi(ApiClient apiClient) {
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
     * Build call for snifAssistServiceTestRegex
     * @param snifassistv3TestRegexRequest  (required)
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
    public okhttp3.Call snifAssistServiceTestRegexCall(Snifassistv3TestRegexRequest snifassistv3TestRegexRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = snifassistv3TestRegexRequest;

        // create path and map variables
        String localVarPath = "/api/v3/snif/test_regex";

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
    private okhttp3.Call snifAssistServiceTestRegexValidateBeforeCall(Snifassistv3TestRegexRequest snifassistv3TestRegexRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'snifassistv3TestRegexRequest' is set
        if (snifassistv3TestRegexRequest == null) {
            throw new ApiException("Missing the required parameter 'snifassistv3TestRegexRequest' when calling snifAssistServiceTestRegex(Async)");
        }

        return snifAssistServiceTestRegexCall(snifassistv3TestRegexRequest, _callback);

    }

    /**
     * Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.
     * 
     * @param snifassistv3TestRegexRequest  (required)
     * @return Snifassistv3StatusResponseBase
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public Snifassistv3StatusResponseBase snifAssistServiceTestRegex(Snifassistv3TestRegexRequest snifassistv3TestRegexRequest) throws ApiException {
        ApiResponse<Snifassistv3StatusResponseBase> localVarResp = snifAssistServiceTestRegexWithHttpInfo(snifassistv3TestRegexRequest);
        return localVarResp.getData();
    }

    /**
     * Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.
     * 
     * @param snifassistv3TestRegexRequest  (required)
     * @return ApiResponse&lt;Snifassistv3StatusResponseBase&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A successful response. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An unexpected error response. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Snifassistv3StatusResponseBase> snifAssistServiceTestRegexWithHttpInfo(Snifassistv3TestRegexRequest snifassistv3TestRegexRequest) throws ApiException {
        okhttp3.Call localVarCall = snifAssistServiceTestRegexValidateBeforeCall(snifassistv3TestRegexRequest, null);
        Type localVarReturnType = new TypeToken<Snifassistv3StatusResponseBase>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex. (asynchronously)
     * 
     * @param snifassistv3TestRegexRequest  (required)
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
    public okhttp3.Call snifAssistServiceTestRegexAsync(Snifassistv3TestRegexRequest snifassistv3TestRegexRequest, final ApiCallback<Snifassistv3StatusResponseBase> _callback) throws ApiException {

        okhttp3.Call localVarCall = snifAssistServiceTestRegexValidateBeforeCall(snifassistv3TestRegexRequest, _callback);
        Type localVarReturnType = new TypeToken<Snifassistv3StatusResponseBase>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
