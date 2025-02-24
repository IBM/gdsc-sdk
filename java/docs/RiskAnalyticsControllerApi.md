# RiskAnalyticsControllerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**riskAnalyticsControllerEnableDisableRiskEventFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerEnableDisableRiskEventFeedback) | **PUT** /api/v3/risk_feedback/status | Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process. |
| [**riskAnalyticsControllerEnableDisableRiskEventProcess**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerEnableDisableRiskEventProcess) | **PUT** /api/v3/risk_process/status | Summary: Enable disable risk event process Description: Enable or disable the risk event process. |
| [**riskAnalyticsControllerGetAllClassificationsList**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetAllClassificationsList) | **GET** /api/v3/risk_events/classifications | Summary: Get all classifications Description: Get all possible classifications for a risk event. |
| [**riskAnalyticsControllerGetRiskEventClassificationsList**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventClassificationsList) | **GET** /api/v3/risk_events/{risk_id}/feedback | Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id; classification that did not matched will be with class_value 0. |
| [**riskAnalyticsControllerGetRiskEventDataForSummarization**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventDataForSummarization) | **GET** /api/v3/risk_events/{risk_id}/summarization/data | Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data |
| [**riskAnalyticsControllerGetRiskEventDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventDetails) | **GET** /api/v3/risk_events/{risk_id}/details | Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations. |
| [**riskAnalyticsControllerGetRiskEventProcessStatus**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventProcessStatus) | **GET** /api/v3/risk_process/status | Summary: Get risk event process status Description: Get the risk event process status. |
| [**riskAnalyticsControllerGetRiskEventRow**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventRow) | **GET** /api/v3/risk_events | Summary: Get risk event row Description: Return a list of risk events. |
| [**riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails) | **PUT** /api/v3/risk_events/{risk_id}/va | Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user |
| [**riskAnalyticsControllerGetRiskFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskFeedback) | **GET** /api/v3/risk_events/feedback | Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP. |
| [**riskAnalyticsControllerGetRiskObservationDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskObservationDetails) | **GET** /api/v3/risk_events/observations | Summary: Get risk observation details Description: Return details of a single risk observation. |
| [**riskAnalyticsControllerGetUserUISettings**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetUserUISettings) | **GET** /api/v3/risk_events/user_ui_settings | Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI. |
| [**riskAnalyticsControllerRiskEventTuning**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerRiskEventTuning) | **PUT** /api/v3/risk_events/tuning | Summary: Risk event tuning Description: Perform tuning risk event actions. |
| [**riskAnalyticsControllerSetRiskEventStatus**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerSetRiskEventStatus) | **PUT** /api/v3/risk_events/status | Summary: Set risk event status Description: Update the risk status and justification. |
| [**riskAnalyticsControllerSetUserUISettings**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerSetUserUISettings) | **PUT** /api/v3/risk_events/user_ui_settings | Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to GDSC. Using this API to change a user settings may prevent the user from using the Risk Event function within GDSC. |
| [**riskAnalyticsControllerUpdateRiskFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerUpdateRiskFeedback) | **PUT** /api/v3/risk_events/feedback | Summary: Update risk feedback Description: Provide feedback for one or more risk events |


<a id="riskAnalyticsControllerEnableDisableRiskEventFeedback"></a>
# **riskAnalyticsControllerEnableDisableRiskEventFeedback**
> Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse riskAnalyticsControllerEnableDisableRiskEventFeedback(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest)

Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest = new Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest(); // Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest | 
    try {
      Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse result = apiInstance.riskAnalyticsControllerEnableDisableRiskEventFeedback(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerEnableDisableRiskEventFeedback");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest** | [**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest**](Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest.md)|  | |

### Return type

[**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse**](Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerEnableDisableRiskEventProcess"></a>
# **riskAnalyticsControllerEnableDisableRiskEventProcess**
> Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse riskAnalyticsControllerEnableDisableRiskEventProcess(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest)

Summary: Enable disable risk event process Description: Enable or disable the risk event process.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest = new Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest(); // Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest | 
    try {
      Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse result = apiInstance.riskAnalyticsControllerEnableDisableRiskEventProcess(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerEnableDisableRiskEventProcess");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest** | [**Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest**](Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest.md)|  | |

### Return type

[**Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse**](Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerGetAllClassificationsList"></a>
# **riskAnalyticsControllerGetAllClassificationsList**
> Riskanalyticscontrollerv3GetAllClassificationsListResponse riskAnalyticsControllerGetAllClassificationsList()

Summary: Get all classifications Description: Get all possible classifications for a risk event.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    try {
      Riskanalyticscontrollerv3GetAllClassificationsListResponse result = apiInstance.riskAnalyticsControllerGetAllClassificationsList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerGetAllClassificationsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetAllClassificationsListResponse**](Riskanalyticscontrollerv3GetAllClassificationsListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerGetRiskEventClassificationsList"></a>
# **riskAnalyticsControllerGetRiskEventClassificationsList**
> Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse riskAnalyticsControllerGetRiskEventClassificationsList(riskId)

Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id; classification that did not matched will be with class_value 0.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Integer riskId = 56; // Integer | Risk id
    try {
      Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse result = apiInstance.riskAnalyticsControllerGetRiskEventClassificationsList(riskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerGetRiskEventClassificationsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **riskId** | **Integer**| Risk id | |

### Return type

[**Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse**](Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerGetRiskEventDataForSummarization"></a>
# **riskAnalyticsControllerGetRiskEventDataForSummarization**
> Riskanalyticscontrollerv3RiskEventSummarizationDataResponse riskAnalyticsControllerGetRiskEventDataForSummarization(riskId, includeIndicators, numFindingsLimit)

Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Integer riskId = 56; // Integer | Risk ID
    Boolean includeIndicators = true; // Boolean | Indicates whether to include indicators in the response or not.
    Integer numFindingsLimit = 56; // Integer | Max number of hours to get for the risk.
    try {
      Riskanalyticscontrollerv3RiskEventSummarizationDataResponse result = apiInstance.riskAnalyticsControllerGetRiskEventDataForSummarization(riskId, includeIndicators, numFindingsLimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerGetRiskEventDataForSummarization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **riskId** | **Integer**| Risk ID | |
| **includeIndicators** | **Boolean**| Indicates whether to include indicators in the response or not. | [optional] |
| **numFindingsLimit** | **Integer**| Max number of hours to get for the risk. | [optional] |

### Return type

[**Riskanalyticscontrollerv3RiskEventSummarizationDataResponse**](Riskanalyticscontrollerv3RiskEventSummarizationDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerGetRiskEventDetails"></a>
# **riskAnalyticsControllerGetRiskEventDetails**
> Riskanalyticscontrollerv3GetRiskEventDetailsResponse riskAnalyticsControllerGetRiskEventDetails(riskId)

Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Integer riskId = 56; // Integer | Risk id.
    try {
      Riskanalyticscontrollerv3GetRiskEventDetailsResponse result = apiInstance.riskAnalyticsControllerGetRiskEventDetails(riskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerGetRiskEventDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **riskId** | **Integer**| Risk id. | |

### Return type

[**Riskanalyticscontrollerv3GetRiskEventDetailsResponse**](Riskanalyticscontrollerv3GetRiskEventDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerGetRiskEventProcessStatus"></a>
# **riskAnalyticsControllerGetRiskEventProcessStatus**
> Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse riskAnalyticsControllerGetRiskEventProcessStatus()

Summary: Get risk event process status Description: Get the risk event process status.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    try {
      Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse result = apiInstance.riskAnalyticsControllerGetRiskEventProcessStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerGetRiskEventProcessStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse**](Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerGetRiskEventRow"></a>
# **riskAnalyticsControllerGetRiskEventRow**
> Riskanalyticscontrollerv3GetRiskEventRowResponse riskAnalyticsControllerGetRiskEventRow(status, dateFrom, dateTo, pivotType, pivotId, pivotDbUser, pivotDatabase, pivotServerIp, pivotOsUser, pivotDatabaseSourceField)

Summary: Get risk event row Description: Return a list of risk events.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    String status = "UNDEFINED_STATUS"; // String | Status to retrieve only the status events, blank to retrieve all.
    OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ.
    OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ.
    String pivotType = "UNDEFINED_PIVOT_TYPE"; // String | Pivot type - enum.
    String pivotId = "pivotId_example"; // String | Pivot id -  all pivot fields separated by semicolon.
    String pivotDbUser = "pivotDbUser_example"; // String | Optional db_user - if pivot is db user.
    String pivotDatabase = "pivotDatabase_example"; // String | Optional database - if pivot is db user / database.
    String pivotServerIp = "pivotServerIp_example"; // String | Optional server_ip - if pivot is db user / database.
    String pivotOsUser = "pivotOsUser_example"; // String | Optional os_user - if pivot is os user.
    String pivotDatabaseSourceField = "UNDEFINED"; // String | Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database.
    try {
      Riskanalyticscontrollerv3GetRiskEventRowResponse result = apiInstance.riskAnalyticsControllerGetRiskEventRow(status, dateFrom, dateTo, pivotType, pivotId, pivotDbUser, pivotDatabase, pivotServerIp, pivotOsUser, pivotDatabaseSourceField);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerGetRiskEventRow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **status** | **String**| Status to retrieve only the status events, blank to retrieve all. | [optional] [default to UNDEFINED_STATUS] [enum: UNDEFINED_STATUS, OPENED, CLOSED, DELEGATED, FOLLOWUP] |
| **dateFrom** | **OffsetDateTime**| The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. | [optional] |
| **dateTo** | **OffsetDateTime**| The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. | [optional] |
| **pivotType** | **String**| Pivot type - enum. | [optional] [default to UNDEFINED_PIVOT_TYPE] [enum: UNDEFINED_PIVOT_TYPE, DATABASE, DB_USER, OS_USER, GLOBAL] |
| **pivotId** | **String**| Pivot id -  all pivot fields separated by semicolon. | [optional] |
| **pivotDbUser** | **String**| Optional db_user - if pivot is db user. | [optional] |
| **pivotDatabase** | **String**| Optional database - if pivot is db user / database. | [optional] |
| **pivotServerIp** | **String**| Optional server_ip - if pivot is db user / database. | [optional] |
| **pivotOsUser** | **String**| Optional os_user - if pivot is os user. | [optional] |
| **pivotDatabaseSourceField** | **String**| Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. | [optional] [default to UNDEFINED] [enum: UNDEFINED, DATABASE_NAME, SERVICE_NAME] |

### Return type

[**Riskanalyticscontrollerv3GetRiskEventRowResponse**](Riskanalyticscontrollerv3GetRiskEventRowResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails"></a>
# **riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**
> Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(riskId)

Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Integer riskId = 56; // Integer | Risk ID
    try {
      Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse result = apiInstance.riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(riskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **riskId** | **Integer**| Risk ID | |

### Return type

[**Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse**](Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerGetRiskFeedback"></a>
# **riskAnalyticsControllerGetRiskFeedback**
> Riskanalyticscontrollerv3GetRiskFeedbackResponse riskAnalyticsControllerGetRiskFeedback()

Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    try {
      Riskanalyticscontrollerv3GetRiskFeedbackResponse result = apiInstance.riskAnalyticsControllerGetRiskFeedback();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerGetRiskFeedback");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetRiskFeedbackResponse**](Riskanalyticscontrollerv3GetRiskFeedbackResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerGetRiskObservationDetails"></a>
# **riskAnalyticsControllerGetRiskObservationDetails**
> Riskanalyticscontrollerv3GetRiskObservationDetailsResponse riskAnalyticsControllerGetRiskObservationDetails(leadFeatureId, observationType)

Summary: Get risk observation details Description: Return details of a single risk observation.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Integer leadFeatureId = 56; // Integer | Lead feature id.
    String observationType = "UNDEFINED_OBSERVATION_TYPE"; // String | Observation type.
    try {
      Riskanalyticscontrollerv3GetRiskObservationDetailsResponse result = apiInstance.riskAnalyticsControllerGetRiskObservationDetails(leadFeatureId, observationType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerGetRiskObservationDetails");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **leadFeatureId** | **Integer**| Lead feature id. | [optional] |
| **observationType** | **String**| Observation type. | [optional] [default to UNDEFINED_OBSERVATION_TYPE] [enum: UNDEFINED_OBSERVATION_TYPE, ACTIVITY, EXCEPTION, VIOLATION, OUTLIER, ANOMALY] |

### Return type

[**Riskanalyticscontrollerv3GetRiskObservationDetailsResponse**](Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerGetUserUISettings"></a>
# **riskAnalyticsControllerGetUserUISettings**
> Riskanalyticscontrollerv3GetUserUISettingsResponse riskAnalyticsControllerGetUserUISettings()

Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    try {
      Riskanalyticscontrollerv3GetUserUISettingsResponse result = apiInstance.riskAnalyticsControllerGetUserUISettings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerGetUserUISettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Riskanalyticscontrollerv3GetUserUISettingsResponse**](Riskanalyticscontrollerv3GetUserUISettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerRiskEventTuning"></a>
# **riskAnalyticsControllerRiskEventTuning**
> Riskanalyticscontrollerv3RiskEventTuningResponse riskAnalyticsControllerRiskEventTuning(riskanalyticscontrollerv3RiskEventTuningRequest)

Summary: Risk event tuning Description: Perform tuning risk event actions.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Riskanalyticscontrollerv3RiskEventTuningRequest riskanalyticscontrollerv3RiskEventTuningRequest = new Riskanalyticscontrollerv3RiskEventTuningRequest(); // Riskanalyticscontrollerv3RiskEventTuningRequest | 
    try {
      Riskanalyticscontrollerv3RiskEventTuningResponse result = apiInstance.riskAnalyticsControllerRiskEventTuning(riskanalyticscontrollerv3RiskEventTuningRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerRiskEventTuning");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **riskanalyticscontrollerv3RiskEventTuningRequest** | [**Riskanalyticscontrollerv3RiskEventTuningRequest**](Riskanalyticscontrollerv3RiskEventTuningRequest.md)|  | |

### Return type

[**Riskanalyticscontrollerv3RiskEventTuningResponse**](Riskanalyticscontrollerv3RiskEventTuningResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerSetRiskEventStatus"></a>
# **riskAnalyticsControllerSetRiskEventStatus**
> Riskanalyticscontrollerv3SetRiskEventStatusResponse riskAnalyticsControllerSetRiskEventStatus(riskanalyticscontrollerv3SetRiskEventStatusRequest)

Summary: Set risk event status Description: Update the risk status and justification.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Riskanalyticscontrollerv3SetRiskEventStatusRequest riskanalyticscontrollerv3SetRiskEventStatusRequest = new Riskanalyticscontrollerv3SetRiskEventStatusRequest(); // Riskanalyticscontrollerv3SetRiskEventStatusRequest | 
    try {
      Riskanalyticscontrollerv3SetRiskEventStatusResponse result = apiInstance.riskAnalyticsControllerSetRiskEventStatus(riskanalyticscontrollerv3SetRiskEventStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerSetRiskEventStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **riskanalyticscontrollerv3SetRiskEventStatusRequest** | [**Riskanalyticscontrollerv3SetRiskEventStatusRequest**](Riskanalyticscontrollerv3SetRiskEventStatusRequest.md)|  | |

### Return type

[**Riskanalyticscontrollerv3SetRiskEventStatusResponse**](Riskanalyticscontrollerv3SetRiskEventStatusResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerSetUserUISettings"></a>
# **riskAnalyticsControllerSetUserUISettings**
> Riskanalyticscontrollerv3SetUserUISettingsResponse riskAnalyticsControllerSetUserUISettings(riskanalyticscontrollerv3SetUserUISettingsRequest)

Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to GDSC. Using this API to change a user settings may prevent the user from using the Risk Event function within GDSC.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Riskanalyticscontrollerv3SetUserUISettingsRequest riskanalyticscontrollerv3SetUserUISettingsRequest = new Riskanalyticscontrollerv3SetUserUISettingsRequest(); // Riskanalyticscontrollerv3SetUserUISettingsRequest | 
    try {
      Riskanalyticscontrollerv3SetUserUISettingsResponse result = apiInstance.riskAnalyticsControllerSetUserUISettings(riskanalyticscontrollerv3SetUserUISettingsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerSetUserUISettings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **riskanalyticscontrollerv3SetUserUISettingsRequest** | [**Riskanalyticscontrollerv3SetUserUISettingsRequest**](Riskanalyticscontrollerv3SetUserUISettingsRequest.md)|  | |

### Return type

[**Riskanalyticscontrollerv3SetUserUISettingsResponse**](Riskanalyticscontrollerv3SetUserUISettingsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="riskAnalyticsControllerUpdateRiskFeedback"></a>
# **riskAnalyticsControllerUpdateRiskFeedback**
> Riskanalyticscontrollerv3UpdateRiskFeedbackResponse riskAnalyticsControllerUpdateRiskFeedback(riskanalyticscontrollerv3UpdateRiskFeedbackRequest)

Summary: Update risk feedback Description: Provide feedback for one or more risk events

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.RiskAnalyticsControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    RiskAnalyticsControllerApi apiInstance = new RiskAnalyticsControllerApi(defaultClient);
    Riskanalyticscontrollerv3UpdateRiskFeedbackRequest riskanalyticscontrollerv3UpdateRiskFeedbackRequest = new Riskanalyticscontrollerv3UpdateRiskFeedbackRequest(); // Riskanalyticscontrollerv3UpdateRiskFeedbackRequest | 
    try {
      Riskanalyticscontrollerv3UpdateRiskFeedbackResponse result = apiInstance.riskAnalyticsControllerUpdateRiskFeedback(riskanalyticscontrollerv3UpdateRiskFeedbackRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RiskAnalyticsControllerApi#riskAnalyticsControllerUpdateRiskFeedback");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **riskanalyticscontrollerv3UpdateRiskFeedbackRequest** | [**Riskanalyticscontrollerv3UpdateRiskFeedbackRequest**](Riskanalyticscontrollerv3UpdateRiskFeedbackRequest.md)|  | |

### Return type

[**Riskanalyticscontrollerv3UpdateRiskFeedbackResponse**](Riskanalyticscontrollerv3UpdateRiskFeedbackResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

