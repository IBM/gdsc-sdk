# DashboardsServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**dashboardsServiceCreateDashboard**](DashboardsServiceApi.md#dashboardsServiceCreateDashboard) | **POST** /api/v3/dashboards | Summary: Create dashboard Description: Create a unique dashboard. |
| [**dashboardsServiceDeleteDashboard**](DashboardsServiceApi.md#dashboardsServiceDeleteDashboard) | **DELETE** /api/v3/dashboards/{dashboard_id} | Summary: Delete dashboard Description: Delete a unique dashboard. |
| [**dashboardsServiceGetDashboards**](DashboardsServiceApi.md#dashboardsServiceGetDashboards) | **GET** /api/v3/dashboards | Summary: Get dashboards Description: Get a list of dashboards with all data. |
| [**dashboardsServiceUpdateDashboard**](DashboardsServiceApi.md#dashboardsServiceUpdateDashboard) | **PUT** /api/v3/dashboards/{dashboard_id} | Summary: Update dashboard Description: Update a dashboard. |


<a id="dashboardsServiceCreateDashboard"></a>
# **dashboardsServiceCreateDashboard**
> Dashboardsv3CreateDashboardResponse dashboardsServiceCreateDashboard(dashboardsv3Dashboard)

Summary: Create dashboard Description: Create a unique dashboard.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DashboardsServiceApi;

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

    DashboardsServiceApi apiInstance = new DashboardsServiceApi(defaultClient);
    Dashboardsv3Dashboard dashboardsv3Dashboard = new Dashboardsv3Dashboard(); // Dashboardsv3Dashboard | Unique dashboard.
    try {
      Dashboardsv3CreateDashboardResponse result = apiInstance.dashboardsServiceCreateDashboard(dashboardsv3Dashboard);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsServiceApi#dashboardsServiceCreateDashboard");
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
| **dashboardsv3Dashboard** | [**Dashboardsv3Dashboard**](Dashboardsv3Dashboard.md)| Unique dashboard. | |

### Return type

[**Dashboardsv3CreateDashboardResponse**](Dashboardsv3CreateDashboardResponse.md)

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

<a id="dashboardsServiceDeleteDashboard"></a>
# **dashboardsServiceDeleteDashboard**
> Dashboardsv3DeleteDashboardResponse dashboardsServiceDeleteDashboard(dashboardId, dashboardsv3DeleteDashboardRequest)

Summary: Delete dashboard Description: Delete a unique dashboard.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DashboardsServiceApi;

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

    DashboardsServiceApi apiInstance = new DashboardsServiceApi(defaultClient);
    String dashboardId = "dashboardId_example"; // String | The id of the dashboard to be deleted.
    Dashboardsv3DeleteDashboardRequest dashboardsv3DeleteDashboardRequest = new Dashboardsv3DeleteDashboardRequest(); // Dashboardsv3DeleteDashboardRequest | 
    try {
      Dashboardsv3DeleteDashboardResponse result = apiInstance.dashboardsServiceDeleteDashboard(dashboardId, dashboardsv3DeleteDashboardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsServiceApi#dashboardsServiceDeleteDashboard");
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
| **dashboardId** | **String**| The id of the dashboard to be deleted. | |
| **dashboardsv3DeleteDashboardRequest** | [**Dashboardsv3DeleteDashboardRequest**](Dashboardsv3DeleteDashboardRequest.md)|  | |

### Return type

[**Dashboardsv3DeleteDashboardResponse**](Dashboardsv3DeleteDashboardResponse.md)

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

<a id="dashboardsServiceGetDashboards"></a>
# **dashboardsServiceGetDashboards**
> Dashboardsv3GetDashboardsResponse dashboardsServiceGetDashboards()

Summary: Get dashboards Description: Get a list of dashboards with all data.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DashboardsServiceApi;

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

    DashboardsServiceApi apiInstance = new DashboardsServiceApi(defaultClient);
    try {
      Dashboardsv3GetDashboardsResponse result = apiInstance.dashboardsServiceGetDashboards();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsServiceApi#dashboardsServiceGetDashboards");
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

[**Dashboardsv3GetDashboardsResponse**](Dashboardsv3GetDashboardsResponse.md)

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

<a id="dashboardsServiceUpdateDashboard"></a>
# **dashboardsServiceUpdateDashboard**
> Dashboardsv3UpdateDashboardResponse dashboardsServiceUpdateDashboard(dashboardId, dashboardsv3UpdateDashboardRequest)

Summary: Update dashboard Description: Update a dashboard.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DashboardsServiceApi;

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

    DashboardsServiceApi apiInstance = new DashboardsServiceApi(defaultClient);
    String dashboardId = "dashboardId_example"; // String | The id of the dashboard that was updated.
    Dashboardsv3UpdateDashboardRequest dashboardsv3UpdateDashboardRequest = new Dashboardsv3UpdateDashboardRequest(); // Dashboardsv3UpdateDashboardRequest | 
    try {
      Dashboardsv3UpdateDashboardResponse result = apiInstance.dashboardsServiceUpdateDashboard(dashboardId, dashboardsv3UpdateDashboardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsServiceApi#dashboardsServiceUpdateDashboard");
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
| **dashboardId** | **String**| The id of the dashboard that was updated. | |
| **dashboardsv3UpdateDashboardRequest** | [**Dashboardsv3UpdateDashboardRequest**](Dashboardsv3UpdateDashboardRequest.md)|  | |

### Return type

[**Dashboardsv3UpdateDashboardResponse**](Dashboardsv3UpdateDashboardResponse.md)

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

