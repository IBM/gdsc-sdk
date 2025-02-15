# ReportsServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reportsServiceCreateCategory**](ReportsServiceApi.md#reportsServiceCreateCategory) | **POST** /api/v3/reports/categories | Summary: Create a category Description: Create a report category |
| [**reportsServiceCreateChart**](ReportsServiceApi.md#reportsServiceCreateChart) | **POST** /api/v3/charts | Summary: Create chart Description: Create custom chart based on provided properties. |
| [**reportsServiceCreateChartTemplatev2**](ReportsServiceApi.md#reportsServiceCreateChartTemplatev2) | **POST** /api/v3/flex-charts/templates | Summary: Create chart template v2 Description: Create custom VEGA chart template. |
| [**reportsServiceCreateChartv2**](ReportsServiceApi.md#reportsServiceCreateChartv2) | **POST** /api/v3/flex-charts | Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties. |
| [**reportsServiceCreateFieldsByCategory**](ReportsServiceApi.md#reportsServiceCreateFieldsByCategory) | **POST** /api/v3/reports/fields | Summary - Create fields by category Description: Cteate category fields based on provided properties. |
| [**reportsServiceCreateJoin**](ReportsServiceApi.md#reportsServiceCreateJoin) | **POST** /api/v3/reports/categories/joins | Summary: Create a join Description: Create a custom report join |
| [**reportsServiceCreateReport**](ReportsServiceApi.md#reportsServiceCreateReport) | **POST** /api/v3/reports | Summary: Create report Description: Create custom report based on provided properties. |
| [**reportsServiceCreateVariant**](ReportsServiceApi.md#reportsServiceCreateVariant) | **POST** /api/v3/reports/variants | Summary: Create a variant Description: Create a variant for reports |
| [**reportsServiceDeleteCategory**](ReportsServiceApi.md#reportsServiceDeleteCategory) | **DELETE** /api/v3/reports/categories | Summary: Delete a category Description: Delete a report category |
| [**reportsServiceDeleteChart**](ReportsServiceApi.md#reportsServiceDeleteChart) | **DELETE** /api/v3/charts/{chart_id} | Summary: Delete chart Description: Delete a custom chart. |
| [**reportsServiceDeleteChartTemplatev2**](ReportsServiceApi.md#reportsServiceDeleteChartTemplatev2) | **DELETE** /api/v3/flex-charts/templates/{template_id} | Summary: Delete chart template v2 Description: Delete a custom VEGA chart template. |
| [**reportsServiceDeleteChartv2**](ReportsServiceApi.md#reportsServiceDeleteChartv2) | **DELETE** /api/v3/flex-charts/{chart_id} | Summary: Delete chart v2 Description: Delete a custom VEGA chart. |
| [**reportsServiceDeleteFieldsByCategory**](ReportsServiceApi.md#reportsServiceDeleteFieldsByCategory) | **DELETE** /api/v3/reports/fields | Summary - Delete fields by category Description: Delete category fields based on provided properties. |
| [**reportsServiceDeleteJoin**](ReportsServiceApi.md#reportsServiceDeleteJoin) | **DELETE** /api/v3/reports/categories/joins/{join_id} | Summary: Delete a join Description: Delete a custom join |
| [**reportsServiceDeleteReport**](ReportsServiceApi.md#reportsServiceDeleteReport) | **DELETE** /api/v3/reports/{report_id} | Summary: Delete report Description: Delete a custom report. |
| [**reportsServiceDeleteVariant**](ReportsServiceApi.md#reportsServiceDeleteVariant) | **DELETE** /api/v3/reports/variants/{variant_id} | Summary: Delete a variant Description: Delete a variant |
| [**reportsServiceGetCategories**](ReportsServiceApi.md#reportsServiceGetCategories) | **GET** /api/v3/reports/categories | Summary:  Get all available report categories. Description: Get all category related fields or all possible fields. |
| [**reportsServiceGetChartSettings**](ReportsServiceApi.md#reportsServiceGetChartSettings) | **GET** /api/v3/charts | Summary: Get chart settings Description: Get a custom chart based on provided report id. |
| [**reportsServiceGetChartSettingsv2**](ReportsServiceApi.md#reportsServiceGetChartSettingsv2) | **GET** /api/v3/flex-charts | Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id. |
| [**reportsServiceGetChartTemplatesv2**](ReportsServiceApi.md#reportsServiceGetChartTemplatesv2) | **GET** /api/v3/flex-charts/templates | Summary: Get chart template v2 Description: Get all custom VEGA chart templates. |
| [**reportsServiceGetFieldsByCategories**](ReportsServiceApi.md#reportsServiceGetFieldsByCategories) | **GET** /api/v3/reports/fields/categories | Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories. |
| [**reportsServiceGetFieldsByCategory**](ReportsServiceApi.md#reportsServiceGetFieldsByCategory) | **GET** /api/v3/reports/fields | Summary: Get fields by category Description: Get all category related fields or all possible fields. |
| [**reportsServiceGetJoins**](ReportsServiceApi.md#reportsServiceGetJoins) | **GET** /api/v3/reports/categories/joins | Summary: Get all joins Description: Get all custom joins. |
| [**reportsServiceGetQueryByReportDefinition**](ReportsServiceApi.md#reportsServiceGetQueryByReportDefinition) | **POST** /api/v3/reports/query/definition | Summary: Get query by report definition Description: Get query by report definition. |
| [**reportsServiceGetQueryByReportID**](ReportsServiceApi.md#reportsServiceGetQueryByReportID) | **POST** /api/v3/reports/query/id | Summary: Get query by report ID Description: Get query by report ID. |
| [**reportsServiceGetReportDefinition**](ReportsServiceApi.md#reportsServiceGetReportDefinition) | **GET** /api/v3/reports/{report_id}/definition | Summary: Get report definition Description: Get report definition. |
| [**reportsServiceGetReportGroups**](ReportsServiceApi.md#reportsServiceGetReportGroups) | **GET** /api/v3/reports_groups | Summary: Get report groups Description: Get reports used by the provided groups. |
| [**reportsServiceGetReportSynopsis**](ReportsServiceApi.md#reportsServiceGetReportSynopsis) | **GET** /api/v3/reports/{report_id}/synopsis | Summary: Get report synopsis Description: Return BriefReport. |
| [**reportsServiceGetReportTimestampHeader**](ReportsServiceApi.md#reportsServiceGetReportTimestampHeader) | **GET** /api/v3/reports/headers/timestamp/default | Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity. |
| [**reportsServiceGetReports**](ReportsServiceApi.md#reportsServiceGetReports) | **GET** /api/v3/reports | Summary: Get reports Description: Get reports list. |
| [**reportsServiceGetReportsForJoin**](ReportsServiceApi.md#reportsServiceGetReportsForJoin) | **GET** /api/v3/reports/categories/joins/{join_id}/reports | Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join |
| [**reportsServiceGetReportsTags**](ReportsServiceApi.md#reportsServiceGetReportsTags) | **GET** /api/v3/reports/tags | Summary: Get reports tags Description: Get all report distinct tags. |
| [**reportsServiceGetVariant**](ReportsServiceApi.md#reportsServiceGetVariant) | **GET** /api/v3/reports/variants/{variant_id} | Summary: Get a variant Description: Get a given variant |
| [**reportsServiceGetVariants**](ReportsServiceApi.md#reportsServiceGetVariants) | **GET** /api/v3/reports/variants | Summary: Get all variants Description: Get all variants in reports |
| [**reportsServicePartialChartUpdate**](ReportsServiceApi.md#reportsServicePartialChartUpdate) | **PATCH** /api/v3/charts/{chart_id} | Summary: Partial chart update Description: Update a custom chart with partial information. |
| [**reportsServicePartialReportUpdate**](ReportsServiceApi.md#reportsServicePartialReportUpdate) | **PATCH** /api/v3/reports/{report_id} | Summary: Partial report update Description: Update a custom report with partial information. |
| [**reportsServiceRunVariantOperation**](ReportsServiceApi.md#reportsServiceRunVariantOperation) | **POST** /api/v3/reports/variants/run | Summary: Run a variant Description: Run the operations in a variant |
| [**reportsServiceTranspose**](ReportsServiceApi.md#reportsServiceTranspose) | **POST** /api/v3/reports/transpose | Summary: Transpose Description: Return the corresponding full sql data. |
| [**reportsServiceUpdateChart**](ReportsServiceApi.md#reportsServiceUpdateChart) | **PUT** /api/v3/charts/{chart_id} | Summary: Update chart Description: Update a custom chart. |
| [**reportsServiceUpdateChartv2**](ReportsServiceApi.md#reportsServiceUpdateChartv2) | **PUT** /api/v3/flex-charts/{chart_id} | Summary: Update chart v2 Description: Update a custom VEGA chart. |
| [**reportsServiceUpdateJoin**](ReportsServiceApi.md#reportsServiceUpdateJoin) | **PUT** /api/v3/reports/categories/joins/{join_id} | Summary: Update a join Description: Update a custom join |
| [**reportsServiceUpdateReport**](ReportsServiceApi.md#reportsServiceUpdateReport) | **PUT** /api/v3/reports/{report_id} | Summary: Update report Description: Update a custom report. |
| [**reportsServiceUpdateVariantOverride**](ReportsServiceApi.md#reportsServiceUpdateVariantOverride) | **PUT** /api/v3/reports/variants/{variant_id} | Summary: Update a variant Description: Update a variant with a custom override |


<a id="reportsServiceCreateCategory"></a>
# **reportsServiceCreateCategory**
> Reportsv3CreateCategoryResponse reportsServiceCreateCategory(reportsv3CreateCategoryRequest)

Summary: Create a category Description: Create a report category

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3CreateCategoryRequest reportsv3CreateCategoryRequest = new Reportsv3CreateCategoryRequest(); // Reportsv3CreateCategoryRequest | 
    try {
      Reportsv3CreateCategoryResponse result = apiInstance.reportsServiceCreateCategory(reportsv3CreateCategoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceCreateCategory");
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
| **reportsv3CreateCategoryRequest** | [**Reportsv3CreateCategoryRequest**](Reportsv3CreateCategoryRequest.md)|  | |

### Return type

[**Reportsv3CreateCategoryResponse**](Reportsv3CreateCategoryResponse.md)

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

<a id="reportsServiceCreateChart"></a>
# **reportsServiceCreateChart**
> Reportsv3CreateChartResponse reportsServiceCreateChart(reportsv3CreateChartRequest)

Summary: Create chart Description: Create custom chart based on provided properties.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3CreateChartRequest reportsv3CreateChartRequest = new Reportsv3CreateChartRequest(); // Reportsv3CreateChartRequest | 
    try {
      Reportsv3CreateChartResponse result = apiInstance.reportsServiceCreateChart(reportsv3CreateChartRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceCreateChart");
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
| **reportsv3CreateChartRequest** | [**Reportsv3CreateChartRequest**](Reportsv3CreateChartRequest.md)|  | |

### Return type

[**Reportsv3CreateChartResponse**](Reportsv3CreateChartResponse.md)

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

<a id="reportsServiceCreateChartTemplatev2"></a>
# **reportsServiceCreateChartTemplatev2**
> Reportsv3CreateChartTemplatev2Response reportsServiceCreateChartTemplatev2(reportsv3CreateChartTemplatev2Request)

Summary: Create chart template v2 Description: Create custom VEGA chart template.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3CreateChartTemplatev2Request reportsv3CreateChartTemplatev2Request = new Reportsv3CreateChartTemplatev2Request(); // Reportsv3CreateChartTemplatev2Request | 
    try {
      Reportsv3CreateChartTemplatev2Response result = apiInstance.reportsServiceCreateChartTemplatev2(reportsv3CreateChartTemplatev2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceCreateChartTemplatev2");
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
| **reportsv3CreateChartTemplatev2Request** | [**Reportsv3CreateChartTemplatev2Request**](Reportsv3CreateChartTemplatev2Request.md)|  | |

### Return type

[**Reportsv3CreateChartTemplatev2Response**](Reportsv3CreateChartTemplatev2Response.md)

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

<a id="reportsServiceCreateChartv2"></a>
# **reportsServiceCreateChartv2**
> Reportsv3CreateChartv2Response reportsServiceCreateChartv2(reportsv3CreateChartv2Request)

Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3CreateChartv2Request reportsv3CreateChartv2Request = new Reportsv3CreateChartv2Request(); // Reportsv3CreateChartv2Request | 
    try {
      Reportsv3CreateChartv2Response result = apiInstance.reportsServiceCreateChartv2(reportsv3CreateChartv2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceCreateChartv2");
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
| **reportsv3CreateChartv2Request** | [**Reportsv3CreateChartv2Request**](Reportsv3CreateChartv2Request.md)|  | |

### Return type

[**Reportsv3CreateChartv2Response**](Reportsv3CreateChartv2Response.md)

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

<a id="reportsServiceCreateFieldsByCategory"></a>
# **reportsServiceCreateFieldsByCategory**
> Reportsv3CreateFieldsByCategoryResponse reportsServiceCreateFieldsByCategory(reportsv3CreateFieldsByCategoryRequest)

Summary - Create fields by category Description: Cteate category fields based on provided properties.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3CreateFieldsByCategoryRequest reportsv3CreateFieldsByCategoryRequest = new Reportsv3CreateFieldsByCategoryRequest(); // Reportsv3CreateFieldsByCategoryRequest | 
    try {
      Reportsv3CreateFieldsByCategoryResponse result = apiInstance.reportsServiceCreateFieldsByCategory(reportsv3CreateFieldsByCategoryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceCreateFieldsByCategory");
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
| **reportsv3CreateFieldsByCategoryRequest** | [**Reportsv3CreateFieldsByCategoryRequest**](Reportsv3CreateFieldsByCategoryRequest.md)|  | |

### Return type

[**Reportsv3CreateFieldsByCategoryResponse**](Reportsv3CreateFieldsByCategoryResponse.md)

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

<a id="reportsServiceCreateJoin"></a>
# **reportsServiceCreateJoin**
> Reportsv3CreateJoinResponse reportsServiceCreateJoin(reportsv3CreateJoinRequest)

Summary: Create a join Description: Create a custom report join

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3CreateJoinRequest reportsv3CreateJoinRequest = new Reportsv3CreateJoinRequest(); // Reportsv3CreateJoinRequest | 
    try {
      Reportsv3CreateJoinResponse result = apiInstance.reportsServiceCreateJoin(reportsv3CreateJoinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceCreateJoin");
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
| **reportsv3CreateJoinRequest** | [**Reportsv3CreateJoinRequest**](Reportsv3CreateJoinRequest.md)|  | |

### Return type

[**Reportsv3CreateJoinResponse**](Reportsv3CreateJoinResponse.md)

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

<a id="reportsServiceCreateReport"></a>
# **reportsServiceCreateReport**
> Reportsv3CreateReportResponse reportsServiceCreateReport(reportsv3CreateReportRequest)

Summary: Create report Description: Create custom report based on provided properties.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3CreateReportRequest reportsv3CreateReportRequest = new Reportsv3CreateReportRequest(); // Reportsv3CreateReportRequest | 
    try {
      Reportsv3CreateReportResponse result = apiInstance.reportsServiceCreateReport(reportsv3CreateReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceCreateReport");
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
| **reportsv3CreateReportRequest** | [**Reportsv3CreateReportRequest**](Reportsv3CreateReportRequest.md)|  | |

### Return type

[**Reportsv3CreateReportResponse**](Reportsv3CreateReportResponse.md)

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

<a id="reportsServiceCreateVariant"></a>
# **reportsServiceCreateVariant**
> Reportsv3CreateVariantResponse reportsServiceCreateVariant(reportsv3CreateVariantRequest)

Summary: Create a variant Description: Create a variant for reports

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3CreateVariantRequest reportsv3CreateVariantRequest = new Reportsv3CreateVariantRequest(); // Reportsv3CreateVariantRequest | 
    try {
      Reportsv3CreateVariantResponse result = apiInstance.reportsServiceCreateVariant(reportsv3CreateVariantRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceCreateVariant");
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
| **reportsv3CreateVariantRequest** | [**Reportsv3CreateVariantRequest**](Reportsv3CreateVariantRequest.md)|  | |

### Return type

[**Reportsv3CreateVariantResponse**](Reportsv3CreateVariantResponse.md)

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

<a id="reportsServiceDeleteCategory"></a>
# **reportsServiceDeleteCategory**
> Reportsv3DeleteCategoryResponse reportsServiceDeleteCategory(categoryId, tableName)

Summary: Delete a category Description: Delete a report category

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String categoryId = "categoryId_example"; // String | category id.
    String tableName = "tableName_example"; // String | table name.
    try {
      Reportsv3DeleteCategoryResponse result = apiInstance.reportsServiceDeleteCategory(categoryId, tableName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceDeleteCategory");
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
| **categoryId** | **String**| category id. | [optional] |
| **tableName** | **String**| table name. | [optional] |

### Return type

[**Reportsv3DeleteCategoryResponse**](Reportsv3DeleteCategoryResponse.md)

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

<a id="reportsServiceDeleteChart"></a>
# **reportsServiceDeleteChart**
> Reportsv3DeleteChartResponse reportsServiceDeleteChart(chartId)

Summary: Delete chart Description: Delete a custom chart.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String chartId = "chartId_example"; // String | The id of the chart to be deleted.
    try {
      Reportsv3DeleteChartResponse result = apiInstance.reportsServiceDeleteChart(chartId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceDeleteChart");
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
| **chartId** | **String**| The id of the chart to be deleted. | |

### Return type

[**Reportsv3DeleteChartResponse**](Reportsv3DeleteChartResponse.md)

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

<a id="reportsServiceDeleteChartTemplatev2"></a>
# **reportsServiceDeleteChartTemplatev2**
> Reportsv3DeleteChartTemplatev2Response reportsServiceDeleteChartTemplatev2(templateId)

Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String templateId = "templateId_example"; // String | Unique template ID.
    try {
      Reportsv3DeleteChartTemplatev2Response result = apiInstance.reportsServiceDeleteChartTemplatev2(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceDeleteChartTemplatev2");
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
| **templateId** | **String**| Unique template ID. | |

### Return type

[**Reportsv3DeleteChartTemplatev2Response**](Reportsv3DeleteChartTemplatev2Response.md)

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

<a id="reportsServiceDeleteChartv2"></a>
# **reportsServiceDeleteChartv2**
> Reportsv3DeleteChartv2Response reportsServiceDeleteChartv2(chartId)

Summary: Delete chart v2 Description: Delete a custom VEGA chart.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String chartId = "chartId_example"; // String | The ID of the chart for deletion.
    try {
      Reportsv3DeleteChartv2Response result = apiInstance.reportsServiceDeleteChartv2(chartId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceDeleteChartv2");
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
| **chartId** | **String**| The ID of the chart for deletion. | |

### Return type

[**Reportsv3DeleteChartv2Response**](Reportsv3DeleteChartv2Response.md)

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

<a id="reportsServiceDeleteFieldsByCategory"></a>
# **reportsServiceDeleteFieldsByCategory**
> Reportsv3DeleteFieldsByCategoryResponse reportsServiceDeleteFieldsByCategory(headerIds, tableName)

Summary - Delete fields by category Description: Delete category fields based on provided properties.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    List<String> headerIds = Arrays.asList(); // List<String> | Header ids.
    String tableName = "tableName_example"; // String | table name.
    try {
      Reportsv3DeleteFieldsByCategoryResponse result = apiInstance.reportsServiceDeleteFieldsByCategory(headerIds, tableName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceDeleteFieldsByCategory");
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
| **headerIds** | [**List&lt;String&gt;**](String.md)| Header ids. | [optional] |
| **tableName** | **String**| table name. | [optional] |

### Return type

[**Reportsv3DeleteFieldsByCategoryResponse**](Reportsv3DeleteFieldsByCategoryResponse.md)

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

<a id="reportsServiceDeleteJoin"></a>
# **reportsServiceDeleteJoin**
> Reportsv3DeleteJoinResponse reportsServiceDeleteJoin(joinId)

Summary: Delete a join Description: Delete a custom join

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String joinId = "joinId_example"; // String | The id of the join to be deleted.
    try {
      Reportsv3DeleteJoinResponse result = apiInstance.reportsServiceDeleteJoin(joinId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceDeleteJoin");
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
| **joinId** | **String**| The id of the join to be deleted. | |

### Return type

[**Reportsv3DeleteJoinResponse**](Reportsv3DeleteJoinResponse.md)

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

<a id="reportsServiceDeleteReport"></a>
# **reportsServiceDeleteReport**
> Reportsv3DeleteReportResponse reportsServiceDeleteReport(reportId)

Summary: Delete report Description: Delete a custom report.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String reportId = "reportId_example"; // String | The id of the Report to be deleted.
    try {
      Reportsv3DeleteReportResponse result = apiInstance.reportsServiceDeleteReport(reportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceDeleteReport");
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
| **reportId** | **String**| The id of the Report to be deleted. | |

### Return type

[**Reportsv3DeleteReportResponse**](Reportsv3DeleteReportResponse.md)

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

<a id="reportsServiceDeleteVariant"></a>
# **reportsServiceDeleteVariant**
> Reportsv3DeleteVariantResponse reportsServiceDeleteVariant(variantId)

Summary: Delete a variant Description: Delete a variant

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String variantId = "variantId_example"; // String | The id of the variant to delete
    try {
      Reportsv3DeleteVariantResponse result = apiInstance.reportsServiceDeleteVariant(variantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceDeleteVariant");
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
| **variantId** | **String**| The id of the variant to delete | |

### Return type

[**Reportsv3DeleteVariantResponse**](Reportsv3DeleteVariantResponse.md)

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

<a id="reportsServiceGetCategories"></a>
# **reportsServiceGetCategories**
> Reportsv3GetCategoriesResponse reportsServiceGetCategories(reportId)

Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String reportId = "reportId_example"; // String | Report ID.
    try {
      Reportsv3GetCategoriesResponse result = apiInstance.reportsServiceGetCategories(reportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetCategories");
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
| **reportId** | **String**| Report ID. | [optional] |

### Return type

[**Reportsv3GetCategoriesResponse**](Reportsv3GetCategoriesResponse.md)

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

<a id="reportsServiceGetChartSettings"></a>
# **reportsServiceGetChartSettings**
> Reportsv3GetChartSettingsResponse reportsServiceGetChartSettings(chartId, reportId)

Summary: Get chart settings Description: Get a custom chart based on provided report id.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String chartId = "chartId_example"; // String | Unique Chart ID.
    String reportId = "reportId_example"; // String | Unique Report ID.
    try {
      Reportsv3GetChartSettingsResponse result = apiInstance.reportsServiceGetChartSettings(chartId, reportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetChartSettings");
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
| **chartId** | **String**| Unique Chart ID. | [optional] |
| **reportId** | **String**| Unique Report ID. | [optional] |

### Return type

[**Reportsv3GetChartSettingsResponse**](Reportsv3GetChartSettingsResponse.md)

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

<a id="reportsServiceGetChartSettingsv2"></a>
# **reportsServiceGetChartSettingsv2**
> Reportsv3GetChartSettingsv2Response reportsServiceGetChartSettingsv2(chartId, reportId)

Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String chartId = "chartId_example"; // String | Unique Chart ID.
    String reportId = "reportId_example"; // String | Unique Report ID.
    try {
      Reportsv3GetChartSettingsv2Response result = apiInstance.reportsServiceGetChartSettingsv2(chartId, reportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetChartSettingsv2");
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
| **chartId** | **String**| Unique Chart ID. | [optional] |
| **reportId** | **String**| Unique Report ID. | [optional] |

### Return type

[**Reportsv3GetChartSettingsv2Response**](Reportsv3GetChartSettingsv2Response.md)

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

<a id="reportsServiceGetChartTemplatesv2"></a>
# **reportsServiceGetChartTemplatesv2**
> Reportsv3GetChartTemplatesv2Response reportsServiceGetChartTemplatesv2()

Summary: Get chart template v2 Description: Get all custom VEGA chart templates.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    try {
      Reportsv3GetChartTemplatesv2Response result = apiInstance.reportsServiceGetChartTemplatesv2();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetChartTemplatesv2");
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

[**Reportsv3GetChartTemplatesv2Response**](Reportsv3GetChartTemplatesv2Response.md)

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

<a id="reportsServiceGetFieldsByCategories"></a>
# **reportsServiceGetFieldsByCategories**
> Reportsv3GetFieldsByCategoriesResponse reportsServiceGetFieldsByCategories(categoryIds)

Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    List<String> categoryIds = Arrays.asList(); // List<String> | Category IDs.
    try {
      Reportsv3GetFieldsByCategoriesResponse result = apiInstance.reportsServiceGetFieldsByCategories(categoryIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetFieldsByCategories");
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
| **categoryIds** | [**List&lt;String&gt;**](String.md)| Category IDs. | [optional] |

### Return type

[**Reportsv3GetFieldsByCategoriesResponse**](Reportsv3GetFieldsByCategoriesResponse.md)

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

<a id="reportsServiceGetFieldsByCategory"></a>
# **reportsServiceGetFieldsByCategory**
> Reportsv3GetFieldsByCategoryResponse reportsServiceGetFieldsByCategory(categoryId, reportId, tableName)

Summary: Get fields by category Description: Get all category related fields or all possible fields.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String categoryId = "categoryId_example"; // String | Category ID.
    String reportId = "reportId_example"; // String | Report ID.
    String tableName = "tableName_example"; // String | optional table name parameter.
    try {
      Reportsv3GetFieldsByCategoryResponse result = apiInstance.reportsServiceGetFieldsByCategory(categoryId, reportId, tableName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetFieldsByCategory");
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
| **categoryId** | **String**| Category ID. | [optional] |
| **reportId** | **String**| Report ID. | [optional] |
| **tableName** | **String**| optional table name parameter. | [optional] |

### Return type

[**Reportsv3GetFieldsByCategoryResponse**](Reportsv3GetFieldsByCategoryResponse.md)

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

<a id="reportsServiceGetJoins"></a>
# **reportsServiceGetJoins**
> Reportsv3GetJoinsResponse reportsServiceGetJoins(categoryId)

Summary: Get all joins Description: Get all custom joins.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String categoryId = "categoryId_example"; // String | Category ID (Optional).
    try {
      Reportsv3GetJoinsResponse result = apiInstance.reportsServiceGetJoins(categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetJoins");
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
| **categoryId** | **String**| Category ID (Optional). | [optional] |

### Return type

[**Reportsv3GetJoinsResponse**](Reportsv3GetJoinsResponse.md)

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

<a id="reportsServiceGetQueryByReportDefinition"></a>
# **reportsServiceGetQueryByReportDefinition**
> Reportsv3GetReportQueryResponse reportsServiceGetQueryByReportDefinition(reportsv3GetQueryByReportDefinitionRequest)

Summary: Get query by report definition Description: Get query by report definition.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3GetQueryByReportDefinitionRequest reportsv3GetQueryByReportDefinitionRequest = new Reportsv3GetQueryByReportDefinitionRequest(); // Reportsv3GetQueryByReportDefinitionRequest | 
    try {
      Reportsv3GetReportQueryResponse result = apiInstance.reportsServiceGetQueryByReportDefinition(reportsv3GetQueryByReportDefinitionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetQueryByReportDefinition");
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
| **reportsv3GetQueryByReportDefinitionRequest** | [**Reportsv3GetQueryByReportDefinitionRequest**](Reportsv3GetQueryByReportDefinitionRequest.md)|  | |

### Return type

[**Reportsv3GetReportQueryResponse**](Reportsv3GetReportQueryResponse.md)

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

<a id="reportsServiceGetQueryByReportID"></a>
# **reportsServiceGetQueryByReportID**
> Reportsv3GetReportQueryResponse reportsServiceGetQueryByReportID(reportsv3GetQueryByReportIDRequest)

Summary: Get query by report ID Description: Get query by report ID.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3GetQueryByReportIDRequest reportsv3GetQueryByReportIDRequest = new Reportsv3GetQueryByReportIDRequest(); // Reportsv3GetQueryByReportIDRequest | 
    try {
      Reportsv3GetReportQueryResponse result = apiInstance.reportsServiceGetQueryByReportID(reportsv3GetQueryByReportIDRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetQueryByReportID");
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
| **reportsv3GetQueryByReportIDRequest** | [**Reportsv3GetQueryByReportIDRequest**](Reportsv3GetQueryByReportIDRequest.md)|  | |

### Return type

[**Reportsv3GetReportQueryResponse**](Reportsv3GetReportQueryResponse.md)

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

<a id="reportsServiceGetReportDefinition"></a>
# **reportsServiceGetReportDefinition**
> Reportsv3GetReportDefinitionResponse reportsServiceGetReportDefinition(reportId)

Summary: Get report definition Description: Get report definition.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String reportId = "reportId_example"; // String | Unique Report ID.
    try {
      Reportsv3GetReportDefinitionResponse result = apiInstance.reportsServiceGetReportDefinition(reportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetReportDefinition");
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
| **reportId** | **String**| Unique Report ID. | |

### Return type

[**Reportsv3GetReportDefinitionResponse**](Reportsv3GetReportDefinitionResponse.md)

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

<a id="reportsServiceGetReportGroups"></a>
# **reportsServiceGetReportGroups**
> Reportsv3GetReportGroupsResponse reportsServiceGetReportGroups(groups)

Summary: Get report groups Description: Get reports used by the provided groups.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    List<String> groups = Arrays.asList(); // List<String> | List of group IDs that should be checked for usage in each report.
    try {
      Reportsv3GetReportGroupsResponse result = apiInstance.reportsServiceGetReportGroups(groups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetReportGroups");
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
| **groups** | [**List&lt;String&gt;**](String.md)| List of group IDs that should be checked for usage in each report. | [optional] |

### Return type

[**Reportsv3GetReportGroupsResponse**](Reportsv3GetReportGroupsResponse.md)

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

<a id="reportsServiceGetReportSynopsis"></a>
# **reportsServiceGetReportSynopsis**
> Reportsv3GetReportSynopsisResponse reportsServiceGetReportSynopsis(reportId)

Summary: Get report synopsis Description: Return BriefReport.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String reportId = "reportId_example"; // String | Unique Report ID.
    try {
      Reportsv3GetReportSynopsisResponse result = apiInstance.reportsServiceGetReportSynopsis(reportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetReportSynopsis");
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
| **reportId** | **String**| Unique Report ID. | |

### Return type

[**Reportsv3GetReportSynopsisResponse**](Reportsv3GetReportSynopsisResponse.md)

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

<a id="reportsServiceGetReportTimestampHeader"></a>
# **reportsServiceGetReportTimestampHeader**
> Reportsv3GetReportTimestampHeaderResponse reportsServiceGetReportTimestampHeader(categoryId, tableNames)

Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String categoryId = "categoryId_example"; // String | Category ID parameter.
    List<String> tableNames = Arrays.asList(); // List<String> | List of all header tables.
    try {
      Reportsv3GetReportTimestampHeaderResponse result = apiInstance.reportsServiceGetReportTimestampHeader(categoryId, tableNames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetReportTimestampHeader");
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
| **categoryId** | **String**| Category ID parameter. | [optional] |
| **tableNames** | [**List&lt;String&gt;**](String.md)| List of all header tables. | [optional] |

### Return type

[**Reportsv3GetReportTimestampHeaderResponse**](Reportsv3GetReportTimestampHeaderResponse.md)

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

<a id="reportsServiceGetReports"></a>
# **reportsServiceGetReports**
> Reportsv3GetReportsResponse reportsServiceGetReports(categoryId, tableName)

Summary: Get reports Description: Get reports list.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String categoryId = "categoryId_example"; // String | Optional Category ID parameter.
    String tableName = "tableName_example"; // String | Optional table name parameter.
    try {
      Reportsv3GetReportsResponse result = apiInstance.reportsServiceGetReports(categoryId, tableName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetReports");
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
| **categoryId** | **String**| Optional Category ID parameter. | [optional] |
| **tableName** | **String**| Optional table name parameter. | [optional] |

### Return type

[**Reportsv3GetReportsResponse**](Reportsv3GetReportsResponse.md)

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

<a id="reportsServiceGetReportsForJoin"></a>
# **reportsServiceGetReportsForJoin**
> Reportsv3GetReportsForJoinResponse reportsServiceGetReportsForJoin(joinId)

Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String joinId = "joinId_example"; // String | 
    try {
      Reportsv3GetReportsForJoinResponse result = apiInstance.reportsServiceGetReportsForJoin(joinId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetReportsForJoin");
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
| **joinId** | **String**|  | |

### Return type

[**Reportsv3GetReportsForJoinResponse**](Reportsv3GetReportsForJoinResponse.md)

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

<a id="reportsServiceGetReportsTags"></a>
# **reportsServiceGetReportsTags**
> Reportsv3GetReportsTagsResponse reportsServiceGetReportsTags()

Summary: Get reports tags Description: Get all report distinct tags.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    try {
      Reportsv3GetReportsTagsResponse result = apiInstance.reportsServiceGetReportsTags();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetReportsTags");
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

[**Reportsv3GetReportsTagsResponse**](Reportsv3GetReportsTagsResponse.md)

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

<a id="reportsServiceGetVariant"></a>
# **reportsServiceGetVariant**
> Reportsv3GetVariantResponse reportsServiceGetVariant(variantId)

Summary: Get a variant Description: Get a given variant

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String variantId = "variantId_example"; // String | The variant id
    try {
      Reportsv3GetVariantResponse result = apiInstance.reportsServiceGetVariant(variantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetVariant");
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
| **variantId** | **String**| The variant id | |

### Return type

[**Reportsv3GetVariantResponse**](Reportsv3GetVariantResponse.md)

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

<a id="reportsServiceGetVariants"></a>
# **reportsServiceGetVariants**
> Reportsv3GetVariantsResponse reportsServiceGetVariants()

Summary: Get all variants Description: Get all variants in reports

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    try {
      Reportsv3GetVariantsResponse result = apiInstance.reportsServiceGetVariants();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceGetVariants");
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

[**Reportsv3GetVariantsResponse**](Reportsv3GetVariantsResponse.md)

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

<a id="reportsServicePartialChartUpdate"></a>
# **reportsServicePartialChartUpdate**
> Reportsv3PartialChartUpdateResponse reportsServicePartialChartUpdate(chartId, reportsv3PartialChartUpdateRequest)

Summary: Partial chart update Description: Update a custom chart with partial information.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String chartId = "chartId_example"; // String | Unique chart ID.
    Reportsv3PartialChartUpdateRequest reportsv3PartialChartUpdateRequest = new Reportsv3PartialChartUpdateRequest(); // Reportsv3PartialChartUpdateRequest | 
    try {
      Reportsv3PartialChartUpdateResponse result = apiInstance.reportsServicePartialChartUpdate(chartId, reportsv3PartialChartUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServicePartialChartUpdate");
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
| **chartId** | **String**| Unique chart ID. | |
| **reportsv3PartialChartUpdateRequest** | [**Reportsv3PartialChartUpdateRequest**](Reportsv3PartialChartUpdateRequest.md)|  | |

### Return type

[**Reportsv3PartialChartUpdateResponse**](Reportsv3PartialChartUpdateResponse.md)

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

<a id="reportsServicePartialReportUpdate"></a>
# **reportsServicePartialReportUpdate**
> Reportsv3PartialReportUpdateResponse reportsServicePartialReportUpdate(reportId, reportsv3PartialReportUpdateRequest)

Summary: Partial report update Description: Update a custom report with partial information.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String reportId = "reportId_example"; // String | Unique Report ID.
    Reportsv3PartialReportUpdateRequest reportsv3PartialReportUpdateRequest = new Reportsv3PartialReportUpdateRequest(); // Reportsv3PartialReportUpdateRequest | 
    try {
      Reportsv3PartialReportUpdateResponse result = apiInstance.reportsServicePartialReportUpdate(reportId, reportsv3PartialReportUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServicePartialReportUpdate");
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
| **reportId** | **String**| Unique Report ID. | |
| **reportsv3PartialReportUpdateRequest** | [**Reportsv3PartialReportUpdateRequest**](Reportsv3PartialReportUpdateRequest.md)|  | |

### Return type

[**Reportsv3PartialReportUpdateResponse**](Reportsv3PartialReportUpdateResponse.md)

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

<a id="reportsServiceRunVariantOperation"></a>
# **reportsServiceRunVariantOperation**
> Reportsv3RunVariantOperationResponse reportsServiceRunVariantOperation(reportsv3RunVariantOperationRequest)

Summary: Run a variant Description: Run the operations in a variant

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3RunVariantOperationRequest reportsv3RunVariantOperationRequest = new Reportsv3RunVariantOperationRequest(); // Reportsv3RunVariantOperationRequest | 
    try {
      Reportsv3RunVariantOperationResponse result = apiInstance.reportsServiceRunVariantOperation(reportsv3RunVariantOperationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceRunVariantOperation");
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
| **reportsv3RunVariantOperationRequest** | [**Reportsv3RunVariantOperationRequest**](Reportsv3RunVariantOperationRequest.md)|  | |

### Return type

[**Reportsv3RunVariantOperationResponse**](Reportsv3RunVariantOperationResponse.md)

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

<a id="reportsServiceTranspose"></a>
# **reportsServiceTranspose**
> Reportsv3RunReportResponse reportsServiceTranspose(reportsv3TransposeRequest)

Summary: Transpose Description: Return the corresponding full sql data.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    Reportsv3TransposeRequest reportsv3TransposeRequest = new Reportsv3TransposeRequest(); // Reportsv3TransposeRequest | 
    try {
      Reportsv3RunReportResponse result = apiInstance.reportsServiceTranspose(reportsv3TransposeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceTranspose");
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
| **reportsv3TransposeRequest** | [**Reportsv3TransposeRequest**](Reportsv3TransposeRequest.md)|  | |

### Return type

[**Reportsv3RunReportResponse**](Reportsv3RunReportResponse.md)

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

<a id="reportsServiceUpdateChart"></a>
# **reportsServiceUpdateChart**
> Reportsv3UpdateChartResponse reportsServiceUpdateChart(chartId, reportsv3UpdateChartRequest)

Summary: Update chart Description: Update a custom chart.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String chartId = "chartId_example"; // String | Unique chart ID.
    Reportsv3UpdateChartRequest reportsv3UpdateChartRequest = new Reportsv3UpdateChartRequest(); // Reportsv3UpdateChartRequest | 
    try {
      Reportsv3UpdateChartResponse result = apiInstance.reportsServiceUpdateChart(chartId, reportsv3UpdateChartRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceUpdateChart");
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
| **chartId** | **String**| Unique chart ID. | |
| **reportsv3UpdateChartRequest** | [**Reportsv3UpdateChartRequest**](Reportsv3UpdateChartRequest.md)|  | |

### Return type

[**Reportsv3UpdateChartResponse**](Reportsv3UpdateChartResponse.md)

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

<a id="reportsServiceUpdateChartv2"></a>
# **reportsServiceUpdateChartv2**
> Reportsv3UpdateChartv2Response reportsServiceUpdateChartv2(chartId, reportsv3UpdateChartv2Request)

Summary: Update chart v2 Description: Update a custom VEGA chart.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String chartId = "chartId_example"; // String | Unique chart ID.
    Reportsv3UpdateChartv2Request reportsv3UpdateChartv2Request = new Reportsv3UpdateChartv2Request(); // Reportsv3UpdateChartv2Request | 
    try {
      Reportsv3UpdateChartv2Response result = apiInstance.reportsServiceUpdateChartv2(chartId, reportsv3UpdateChartv2Request);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceUpdateChartv2");
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
| **chartId** | **String**| Unique chart ID. | |
| **reportsv3UpdateChartv2Request** | [**Reportsv3UpdateChartv2Request**](Reportsv3UpdateChartv2Request.md)|  | |

### Return type

[**Reportsv3UpdateChartv2Response**](Reportsv3UpdateChartv2Response.md)

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

<a id="reportsServiceUpdateJoin"></a>
# **reportsServiceUpdateJoin**
> Reportsv3UpdateJoinResponse reportsServiceUpdateJoin(joinId, reportsv3UpdateJoinRequest)

Summary: Update a join Description: Update a custom join

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String joinId = "joinId_example"; // String | Unique join ID.
    Reportsv3UpdateJoinRequest reportsv3UpdateJoinRequest = new Reportsv3UpdateJoinRequest(); // Reportsv3UpdateJoinRequest | 
    try {
      Reportsv3UpdateJoinResponse result = apiInstance.reportsServiceUpdateJoin(joinId, reportsv3UpdateJoinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceUpdateJoin");
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
| **joinId** | **String**| Unique join ID. | |
| **reportsv3UpdateJoinRequest** | [**Reportsv3UpdateJoinRequest**](Reportsv3UpdateJoinRequest.md)|  | |

### Return type

[**Reportsv3UpdateJoinResponse**](Reportsv3UpdateJoinResponse.md)

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

<a id="reportsServiceUpdateReport"></a>
# **reportsServiceUpdateReport**
> Reportsv3UpdateReportResponse reportsServiceUpdateReport(reportId, reportsv3UpdateReportRequest)

Summary: Update report Description: Update a custom report.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String reportId = "reportId_example"; // String | Unique Report ID.
    Reportsv3UpdateReportRequest reportsv3UpdateReportRequest = new Reportsv3UpdateReportRequest(); // Reportsv3UpdateReportRequest | 
    try {
      Reportsv3UpdateReportResponse result = apiInstance.reportsServiceUpdateReport(reportId, reportsv3UpdateReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceUpdateReport");
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
| **reportId** | **String**| Unique Report ID. | |
| **reportsv3UpdateReportRequest** | [**Reportsv3UpdateReportRequest**](Reportsv3UpdateReportRequest.md)|  | |

### Return type

[**Reportsv3UpdateReportResponse**](Reportsv3UpdateReportResponse.md)

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

<a id="reportsServiceUpdateVariantOverride"></a>
# **reportsServiceUpdateVariantOverride**
> Reportsv3UpdateVariantOverrideResponse reportsServiceUpdateVariantOverride(variantId, reportsv3UpdateVariantOverrideRequest)

Summary: Update a variant Description: Update a variant with a custom override

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.ReportsServiceApi;

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

    ReportsServiceApi apiInstance = new ReportsServiceApi(defaultClient);
    String variantId = "variantId_example"; // String | The variant id
    Reportsv3UpdateVariantOverrideRequest reportsv3UpdateVariantOverrideRequest = new Reportsv3UpdateVariantOverrideRequest(); // Reportsv3UpdateVariantOverrideRequest | 
    try {
      Reportsv3UpdateVariantOverrideResponse result = apiInstance.reportsServiceUpdateVariantOverride(variantId, reportsv3UpdateVariantOverrideRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsServiceApi#reportsServiceUpdateVariantOverride");
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
| **variantId** | **String**| The variant id | |
| **reportsv3UpdateVariantOverrideRequest** | [**Reportsv3UpdateVariantOverrideRequest**](Reportsv3UpdateVariantOverrideRequest.md)|  | |

### Return type

[**Reportsv3UpdateVariantOverrideResponse**](Reportsv3UpdateVariantOverrideResponse.md)

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

