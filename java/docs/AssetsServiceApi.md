# AssetsServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**assetsServiceAssetIngestion**](AssetsServiceApi.md#assetsServiceAssetIngestion) | **POST** /api/v3/assets/ingestion | AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets. |
| [**assetsServiceAssetIngestionManualTrigger**](AssetsServiceApi.md#assetsServiceAssetIngestionManualTrigger) | **POST** /api/v3/assets/ingestion/trigger | AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases. |
| [**assetsServiceClonePolicy**](AssetsServiceApi.md#assetsServiceClonePolicy) | **POST** /api/v3/assets/policies/{policy_id}/clone | ClonePolicy - Clone a policy. |
| [**assetsServiceCreateUpdatePolicy**](AssetsServiceApi.md#assetsServiceCreateUpdatePolicy) | **POST** /api/v3/assets/policies | CreateUpdatePolicy - Create/update new Policy. |
| [**assetsServiceDeleteFilterTemplateForAssets**](AssetsServiceApi.md#assetsServiceDeleteFilterTemplateForAssets) | **DELETE** /api/v3/assets/filters/template/{template_id} | DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets. |
| [**assetsServiceDeletePolicies**](AssetsServiceApi.md#assetsServiceDeletePolicies) | **DELETE** /api/v3/assets/policies | DeletePolicies - Delete Policy returns response code and message. |
| [**assetsServiceFetchAssetChangeLog**](AssetsServiceApi.md#assetsServiceFetchAssetChangeLog) | **POST** /api/v3/assets/logs | FetchAssetChangeLog - Fetch the logs for any actions performed on assets. |
| [**assetsServiceFetchAssetDashboard**](AssetsServiceApi.md#assetsServiceFetchAssetDashboard) | **GET** /api/v3/assets/dashboard/{widget_type} | FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets. |
| [**assetsServiceFetchAssetList**](AssetsServiceApi.md#assetsServiceFetchAssetList) | **POST** /api/v3/assets | FetchAssetList - Asset Fetch Api . |
| [**assetsServiceFetchAssetsForMergeSplit**](AssetsServiceApi.md#assetsServiceFetchAssetsForMergeSplit) | **GET** /api/v3/assets/configuration | FetchAssetsForMergeSplit : Fetch assets for Merge and Split. |
| [**assetsServiceFindAssetName**](AssetsServiceApi.md#assetsServiceFindAssetName) | **GET** /api/v3/assets/name | FindAssetName - Checks if the given Asset Name has already been assigned to an asset. |
| [**assetsServiceGetAssetOverview**](AssetsServiceApi.md#assetsServiceGetAssetOverview) | **GET** /api/v3/assets/overview | GetAssetOverview - Get asset overview widgets data for a particular asset. |
| [**assetsServiceGetAssetTopology**](AssetsServiceApi.md#assetsServiceGetAssetTopology) | **POST** /api/v3/assets/topology | GetAssetTopology- Get list of topology for a parent asset. |
| [**assetsServiceGetFilterTemplateForAssets**](AssetsServiceApi.md#assetsServiceGetFilterTemplateForAssets) | **GET** /api/v3/assets/filters/templates | GetFilterTemplateForAssets - Get list of filters query templates for manage assets. |
| [**assetsServiceGetFiltersForAssets**](AssetsServiceApi.md#assetsServiceGetFiltersForAssets) | **GET** /api/v3/assets/filters | GetFiltersForAssets - Get a list of filters category and sub category with all data. |
| [**assetsServiceListPolicy**](AssetsServiceApi.md#assetsServiceListPolicy) | **GET** /api/v3/assets/policies | ListPolicy - List all policies. |
| [**assetsServiceListRule**](AssetsServiceApi.md#assetsServiceListRule) | **GET** /api/v3/assets/policies/{policy_id}/rules | ListRule - List all rules for a policy. |
| [**assetsServiceListTagDomains**](AssetsServiceApi.md#assetsServiceListTagDomains) | **GET** /api/v3/assets/tags/categories | ListTagDomains - Get Tag categories by request parameters . |
| [**assetsServiceListTags**](AssetsServiceApi.md#assetsServiceListTags) | **GET** /api/v3/assets/tags | ListTags - Get Tags for Manage Tags listing screen . |
| [**assetsServiceMergeOrSplitAssets**](AssetsServiceApi.md#assetsServiceMergeOrSplitAssets) | **POST** /api/v3/assets/configuration | MergeOrSplitAssets - Merge or split the selected assets. |
| [**assetsServiceSaveAssignedTags**](AssetsServiceApi.md#assetsServiceSaveAssignedTags) | **POST** /api/v3/assets/tags/assign | SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table. |
| [**assetsServiceSaveTagConceptData**](AssetsServiceApi.md#assetsServiceSaveTagConceptData) | **POST** /api/v3/assets/tags | SaveTagConceptData - creates a custom tag |
| [**assetsServiceSaveTagDomainData**](AssetsServiceApi.md#assetsServiceSaveTagDomainData) | **POST** /api/v3/assets/tags/categories | SaveTagDomainData - creates a custom category to be assigned to a tag |
| [**assetsServiceSaveUpdateFilterTemplateForAssets**](AssetsServiceApi.md#assetsServiceSaveUpdateFilterTemplateForAssets) | **POST** /api/v3/assets/filters/templates | SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list. |
| [**assetsServiceSetBannerState**](AssetsServiceApi.md#assetsServiceSetBannerState) | **PUT** /api/v3/assets/banner | SetBannerState - Set banner state for asset inventory page. |
| [**assetsServiceUpdateAssetName**](AssetsServiceApi.md#assetsServiceUpdateAssetName) | **PUT** /api/v3/assets/name | UpdateAssetName - Udates the name of the asset as given by the user. |
| [**assetsServiceUpdatePolicy**](AssetsServiceApi.md#assetsServiceUpdatePolicy) | **PUT** /api/v3/assets/policies | UpdatePolicy - Update existing Policy status. |


<a id="assetsServiceAssetIngestion"></a>
# **assetsServiceAssetIngestion**
> Assetsv3AssetIngestionResponse assetsServiceAssetIngestion(assetsv3AssetIngestionRequest)

AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3AssetIngestionRequest assetsv3AssetIngestionRequest = new Assetsv3AssetIngestionRequest(); // Assetsv3AssetIngestionRequest | 
    try {
      Assetsv3AssetIngestionResponse result = apiInstance.assetsServiceAssetIngestion(assetsv3AssetIngestionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceAssetIngestion");
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
| **assetsv3AssetIngestionRequest** | [**Assetsv3AssetIngestionRequest**](Assetsv3AssetIngestionRequest.md)|  | |

### Return type

[**Assetsv3AssetIngestionResponse**](Assetsv3AssetIngestionResponse.md)

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

<a id="assetsServiceAssetIngestionManualTrigger"></a>
# **assetsServiceAssetIngestionManualTrigger**
> Assetsv3AssetIngestionResponse assetsServiceAssetIngestionManualTrigger(body)

AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Object body = null; // Object | 
    try {
      Assetsv3AssetIngestionResponse result = apiInstance.assetsServiceAssetIngestionManualTrigger(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceAssetIngestionManualTrigger");
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
| **body** | **Object**|  | |

### Return type

[**Assetsv3AssetIngestionResponse**](Assetsv3AssetIngestionResponse.md)

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

<a id="assetsServiceClonePolicy"></a>
# **assetsServiceClonePolicy**
> Object assetsServiceClonePolicy(policyId, assetsv3ClonePolicyRequest)

ClonePolicy - Clone a policy.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    String policyId = "policyId_example"; // String | Policy id that needs to be cloned.
    Assetsv3ClonePolicyRequest assetsv3ClonePolicyRequest = new Assetsv3ClonePolicyRequest(); // Assetsv3ClonePolicyRequest | 
    try {
      Object result = apiInstance.assetsServiceClonePolicy(policyId, assetsv3ClonePolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceClonePolicy");
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
| **policyId** | **String**| Policy id that needs to be cloned. | |
| **assetsv3ClonePolicyRequest** | [**Assetsv3ClonePolicyRequest**](Assetsv3ClonePolicyRequest.md)|  | |

### Return type

**Object**

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

<a id="assetsServiceCreateUpdatePolicy"></a>
# **assetsServiceCreateUpdatePolicy**
> Assetsv3CreateUpdatePolicyResponse assetsServiceCreateUpdatePolicy(assetsv3CreateUpdatePolicyRequest)

CreateUpdatePolicy - Create/update new Policy.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3CreateUpdatePolicyRequest assetsv3CreateUpdatePolicyRequest = new Assetsv3CreateUpdatePolicyRequest(); // Assetsv3CreateUpdatePolicyRequest | 
    try {
      Assetsv3CreateUpdatePolicyResponse result = apiInstance.assetsServiceCreateUpdatePolicy(assetsv3CreateUpdatePolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceCreateUpdatePolicy");
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
| **assetsv3CreateUpdatePolicyRequest** | [**Assetsv3CreateUpdatePolicyRequest**](Assetsv3CreateUpdatePolicyRequest.md)|  | |

### Return type

[**Assetsv3CreateUpdatePolicyResponse**](Assetsv3CreateUpdatePolicyResponse.md)

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

<a id="assetsServiceDeleteFilterTemplateForAssets"></a>
# **assetsServiceDeleteFilterTemplateForAssets**
> Object assetsServiceDeleteFilterTemplateForAssets(templateId, assetsv3AssetFilterTemplateRequest)

DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    String templateId = "templateId_example"; // String | template id to be deleted
    Assetsv3AssetFilterTemplateRequest assetsv3AssetFilterTemplateRequest = new Assetsv3AssetFilterTemplateRequest(); // Assetsv3AssetFilterTemplateRequest | 
    try {
      Object result = apiInstance.assetsServiceDeleteFilterTemplateForAssets(templateId, assetsv3AssetFilterTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceDeleteFilterTemplateForAssets");
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
| **templateId** | **String**| template id to be deleted | |
| **assetsv3AssetFilterTemplateRequest** | [**Assetsv3AssetFilterTemplateRequest**](Assetsv3AssetFilterTemplateRequest.md)|  | |

### Return type

**Object**

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

<a id="assetsServiceDeletePolicies"></a>
# **assetsServiceDeletePolicies**
> Object assetsServiceDeletePolicies(policyIds)

DeletePolicies - Delete Policy returns response code and message.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    List<String> policyIds = Arrays.asList(); // List<String> | Policy ids.
    try {
      Object result = apiInstance.assetsServiceDeletePolicies(policyIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceDeletePolicies");
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
| **policyIds** | [**List&lt;String&gt;**](String.md)| Policy ids. | [optional] |

### Return type

**Object**

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

<a id="assetsServiceFetchAssetChangeLog"></a>
# **assetsServiceFetchAssetChangeLog**
> Assetsv3FetchAssetChangeLogResponse assetsServiceFetchAssetChangeLog(assetsv3FetchAssetChangeLogRequest)

FetchAssetChangeLog - Fetch the logs for any actions performed on assets.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3FetchAssetChangeLogRequest assetsv3FetchAssetChangeLogRequest = new Assetsv3FetchAssetChangeLogRequest(); // Assetsv3FetchAssetChangeLogRequest | 
    try {
      Assetsv3FetchAssetChangeLogResponse result = apiInstance.assetsServiceFetchAssetChangeLog(assetsv3FetchAssetChangeLogRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceFetchAssetChangeLog");
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
| **assetsv3FetchAssetChangeLogRequest** | [**Assetsv3FetchAssetChangeLogRequest**](Assetsv3FetchAssetChangeLogRequest.md)|  | |

### Return type

[**Assetsv3FetchAssetChangeLogResponse**](Assetsv3FetchAssetChangeLogResponse.md)

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

<a id="assetsServiceFetchAssetDashboard"></a>
# **assetsServiceFetchAssetDashboard**
> Assetsv3FetchAssetDashboardResponse assetsServiceFetchAssetDashboard(widgetType, dateRangeStart, dateRangeEnd, dateRangeType, dateRangeKey, dateRangeError, dateRangeStartNumber, dateRangeStartUnit, dateRangeEndNumber, dateRangeEndUnit, timelineValueSelected, tagId)

FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    String widgetType = "widgetType_example"; // String | ID of the Dashboard Widget
    String dateRangeStart = "dateRangeStart_example"; // String | start of date range for ui widget.
    String dateRangeEnd = "dateRangeEnd_example"; // String | end of date range for ui widget.
    String dateRangeType = "dateRangeType_example"; // String | type of date range for ui widget.
    String dateRangeKey = "dateRangeKey_example"; // String | key for ui widget.
    String dateRangeError = "dateRangeError_example"; // String | error for ui widget.
    Integer dateRangeStartNumber = 56; // Integer | start_number for ui widget.
    String dateRangeStartUnit = "dateRangeStartUnit_example"; // String | start of date range for ui widget.
    Integer dateRangeEndNumber = 56; // Integer | start of date range for ui widget.
    String dateRangeEndUnit = "dateRangeEndUnit_example"; // String | start of date range for ui widget.
    String timelineValueSelected = "timelineValueSelected_example"; // String | Name of the timeline value selected from drop down.
    String tagId = "tagId_example"; // String | Tag ID.
    try {
      Assetsv3FetchAssetDashboardResponse result = apiInstance.assetsServiceFetchAssetDashboard(widgetType, dateRangeStart, dateRangeEnd, dateRangeType, dateRangeKey, dateRangeError, dateRangeStartNumber, dateRangeStartUnit, dateRangeEndNumber, dateRangeEndUnit, timelineValueSelected, tagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceFetchAssetDashboard");
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
| **widgetType** | **String**| ID of the Dashboard Widget | |
| **dateRangeStart** | **String**| start of date range for ui widget. | [optional] |
| **dateRangeEnd** | **String**| end of date range for ui widget. | [optional] |
| **dateRangeType** | **String**| type of date range for ui widget. | [optional] |
| **dateRangeKey** | **String**| key for ui widget. | [optional] |
| **dateRangeError** | **String**| error for ui widget. | [optional] |
| **dateRangeStartNumber** | **Integer**| start_number for ui widget. | [optional] |
| **dateRangeStartUnit** | **String**| start of date range for ui widget. | [optional] |
| **dateRangeEndNumber** | **Integer**| start of date range for ui widget. | [optional] |
| **dateRangeEndUnit** | **String**| start of date range for ui widget. | [optional] |
| **timelineValueSelected** | **String**| Name of the timeline value selected from drop down. | [optional] |
| **tagId** | **String**| Tag ID. | [optional] |

### Return type

[**Assetsv3FetchAssetDashboardResponse**](Assetsv3FetchAssetDashboardResponse.md)

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

<a id="assetsServiceFetchAssetList"></a>
# **assetsServiceFetchAssetList**
> Assetsv3FetchAssetListResponse assetsServiceFetchAssetList(assetsv3FetchAssetListRequest)

FetchAssetList - Asset Fetch Api .

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3FetchAssetListRequest assetsv3FetchAssetListRequest = new Assetsv3FetchAssetListRequest(); // Assetsv3FetchAssetListRequest | 
    try {
      Assetsv3FetchAssetListResponse result = apiInstance.assetsServiceFetchAssetList(assetsv3FetchAssetListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceFetchAssetList");
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
| **assetsv3FetchAssetListRequest** | [**Assetsv3FetchAssetListRequest**](Assetsv3FetchAssetListRequest.md)|  | |

### Return type

[**Assetsv3FetchAssetListResponse**](Assetsv3FetchAssetListResponse.md)

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

<a id="assetsServiceFetchAssetsForMergeSplit"></a>
# **assetsServiceFetchAssetsForMergeSplit**
> Assetsv3FetchAssetsForMergeSplitResponse assetsServiceFetchAssetsForMergeSplit(assetId, pageNumber, pageSize, action, searchKey)

FetchAssetsForMergeSplit : Fetch assets for Merge and Split.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    String assetId = "assetId_example"; // String | Asset grouper Id.
    Integer pageNumber = 56; // Integer | Page number.
    Integer pageSize = 56; // Integer | Page size.
    String action = "action_example"; // String | Action : merge or split.
    String searchKey = "searchKey_example"; // String | Search from the list based on asset name, database name, ip or host.
    try {
      Assetsv3FetchAssetsForMergeSplitResponse result = apiInstance.assetsServiceFetchAssetsForMergeSplit(assetId, pageNumber, pageSize, action, searchKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceFetchAssetsForMergeSplit");
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
| **assetId** | **String**| Asset grouper Id. | [optional] |
| **pageNumber** | **Integer**| Page number. | [optional] |
| **pageSize** | **Integer**| Page size. | [optional] |
| **action** | **String**| Action : merge or split. | [optional] |
| **searchKey** | **String**| Search from the list based on asset name, database name, ip or host. | [optional] |

### Return type

[**Assetsv3FetchAssetsForMergeSplitResponse**](Assetsv3FetchAssetsForMergeSplitResponse.md)

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

<a id="assetsServiceFindAssetName"></a>
# **assetsServiceFindAssetName**
> Assetsv3FindAssetNameResponse assetsServiceFindAssetName(assetName)

FindAssetName - Checks if the given Asset Name has already been assigned to an asset.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    String assetName = "assetName_example"; // String | Name of asset.
    try {
      Assetsv3FindAssetNameResponse result = apiInstance.assetsServiceFindAssetName(assetName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceFindAssetName");
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
| **assetName** | **String**| Name of asset. | [optional] |

### Return type

[**Assetsv3FindAssetNameResponse**](Assetsv3FindAssetNameResponse.md)

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

<a id="assetsServiceGetAssetOverview"></a>
# **assetsServiceGetAssetOverview**
> Assetsv3AssetOverviewResponse assetsServiceGetAssetOverview(assetId, pageNumber, size, widget, ip, host, database, assetEntityType)

GetAssetOverview - Get asset overview widgets data for a particular asset.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    String assetId = "assetId_example"; // String | Asset grouper Id.
    Integer pageNumber = 56; // Integer | Page number.
    Integer size = 56; // Integer | Page size.
    String widget = "ALL"; // String | Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets.
    String ip = "ip_example"; // String | Asset IP.
    String host = "host_example"; // String | Asset Host.
    String database = "database_example"; // String | Database Name.
    String assetEntityType = "assetEntityType_example"; // String | asset ntity type.
    try {
      Assetsv3AssetOverviewResponse result = apiInstance.assetsServiceGetAssetOverview(assetId, pageNumber, size, widget, ip, host, database, assetEntityType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceGetAssetOverview");
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
| **assetId** | **String**| Asset grouper Id. | [optional] |
| **pageNumber** | **Integer**| Page number. | [optional] |
| **size** | **Integer**| Page size. | [optional] |
| **widget** | **String**| Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets. | [optional] [default to ALL] [enum: ALL, CLASSIFICATION, TAG, RESOURCE] |
| **ip** | **String**| Asset IP. | [optional] |
| **host** | **String**| Asset Host. | [optional] |
| **database** | **String**| Database Name. | [optional] |
| **assetEntityType** | **String**| asset ntity type. | [optional] |

### Return type

[**Assetsv3AssetOverviewResponse**](Assetsv3AssetOverviewResponse.md)

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

<a id="assetsServiceGetAssetTopology"></a>
# **assetsServiceGetAssetTopology**
> Assetsv3GetAssetTopologyResponse assetsServiceGetAssetTopology(assetsv3GetAssetTopologyRequest)

GetAssetTopology- Get list of topology for a parent asset.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3GetAssetTopologyRequest assetsv3GetAssetTopologyRequest = new Assetsv3GetAssetTopologyRequest(); // Assetsv3GetAssetTopologyRequest | 
    try {
      Assetsv3GetAssetTopologyResponse result = apiInstance.assetsServiceGetAssetTopology(assetsv3GetAssetTopologyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceGetAssetTopology");
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
| **assetsv3GetAssetTopologyRequest** | [**Assetsv3GetAssetTopologyRequest**](Assetsv3GetAssetTopologyRequest.md)|  | |

### Return type

[**Assetsv3GetAssetTopologyResponse**](Assetsv3GetAssetTopologyResponse.md)

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

<a id="assetsServiceGetFilterTemplateForAssets"></a>
# **assetsServiceGetFilterTemplateForAssets**
> Assetsv3GetFilterTemplateResponse assetsServiceGetFilterTemplateForAssets(templateId)

GetFilterTemplateForAssets - Get list of filters query templates for manage assets.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    String templateId = "templateId_example"; // String | template id to be deleted.
    try {
      Assetsv3GetFilterTemplateResponse result = apiInstance.assetsServiceGetFilterTemplateForAssets(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceGetFilterTemplateForAssets");
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
| **templateId** | **String**| template id to be deleted. | [optional] |

### Return type

[**Assetsv3GetFilterTemplateResponse**](Assetsv3GetFilterTemplateResponse.md)

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

<a id="assetsServiceGetFiltersForAssets"></a>
# **assetsServiceGetFiltersForAssets**
> Assetsv3GetFiltersDataResponse assetsServiceGetFiltersForAssets()

GetFiltersForAssets - Get a list of filters category and sub category with all data.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    try {
      Assetsv3GetFiltersDataResponse result = apiInstance.assetsServiceGetFiltersForAssets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceGetFiltersForAssets");
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

[**Assetsv3GetFiltersDataResponse**](Assetsv3GetFiltersDataResponse.md)

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

<a id="assetsServiceListPolicy"></a>
# **assetsServiceListPolicy**
> Assetsv3ListPolicyResponse assetsServiceListPolicy()

ListPolicy - List all policies.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    try {
      Assetsv3ListPolicyResponse result = apiInstance.assetsServiceListPolicy();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceListPolicy");
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

[**Assetsv3ListPolicyResponse**](Assetsv3ListPolicyResponse.md)

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

<a id="assetsServiceListRule"></a>
# **assetsServiceListRule**
> Assetsv3ListRuleResponse assetsServiceListRule(policyId)

ListRule - List all rules for a policy.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    String policyId = "policyId_example"; // String | Policy ID
    try {
      Assetsv3ListRuleResponse result = apiInstance.assetsServiceListRule(policyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceListRule");
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
| **policyId** | **String**| Policy ID | |

### Return type

[**Assetsv3ListRuleResponse**](Assetsv3ListRuleResponse.md)

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

<a id="assetsServiceListTagDomains"></a>
# **assetsServiceListTagDomains**
> Assetsv3ListTagDomainsResponse assetsServiceListTagDomains(domGrouper, purpose, needTag)

ListTagDomains - Get Tag categories by request parameters .

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    String domGrouper = "domGrouper_example"; // String | Optional: dom_grouper required if we want to fetch domains based on the group.
    String purpose = "purpose_example"; // String | Optional: purpose required if we want to fetch domains based on the purpose.
    Boolean needTag = true; // Boolean | Optional: If we need Tag  based on the Domains.
    try {
      Assetsv3ListTagDomainsResponse result = apiInstance.assetsServiceListTagDomains(domGrouper, purpose, needTag);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceListTagDomains");
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
| **domGrouper** | **String**| Optional: dom_grouper required if we want to fetch domains based on the group. | [optional] |
| **purpose** | **String**| Optional: purpose required if we want to fetch domains based on the purpose. | [optional] |
| **needTag** | **Boolean**| Optional: If we need Tag  based on the Domains. | [optional] |

### Return type

[**Assetsv3ListTagDomainsResponse**](Assetsv3ListTagDomainsResponse.md)

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

<a id="assetsServiceListTags"></a>
# **assetsServiceListTags**
> Assetsv3ListTagsResponse assetsServiceListTags(assetId)

ListTags - Get Tags for Manage Tags listing screen .

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    List<String> assetId = Arrays.asList(); // List<String> | asset id - Asset ID.
    try {
      Assetsv3ListTagsResponse result = apiInstance.assetsServiceListTags(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceListTags");
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
| **assetId** | [**List&lt;String&gt;**](String.md)| asset id - Asset ID. | [optional] |

### Return type

[**Assetsv3ListTagsResponse**](Assetsv3ListTagsResponse.md)

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

<a id="assetsServiceMergeOrSplitAssets"></a>
# **assetsServiceMergeOrSplitAssets**
> Object assetsServiceMergeOrSplitAssets(assetsv3MergeOrSplitAssetsRequest)

MergeOrSplitAssets - Merge or split the selected assets.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3MergeOrSplitAssetsRequest assetsv3MergeOrSplitAssetsRequest = new Assetsv3MergeOrSplitAssetsRequest(); // Assetsv3MergeOrSplitAssetsRequest | 
    try {
      Object result = apiInstance.assetsServiceMergeOrSplitAssets(assetsv3MergeOrSplitAssetsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceMergeOrSplitAssets");
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
| **assetsv3MergeOrSplitAssetsRequest** | [**Assetsv3MergeOrSplitAssetsRequest**](Assetsv3MergeOrSplitAssetsRequest.md)|  | |

### Return type

**Object**

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

<a id="assetsServiceSaveAssignedTags"></a>
# **assetsServiceSaveAssignedTags**
> Object assetsServiceSaveAssignedTags(assetsv3SaveAssignedTagsRequest)

SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3SaveAssignedTagsRequest assetsv3SaveAssignedTagsRequest = new Assetsv3SaveAssignedTagsRequest(); // Assetsv3SaveAssignedTagsRequest | 
    try {
      Object result = apiInstance.assetsServiceSaveAssignedTags(assetsv3SaveAssignedTagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceSaveAssignedTags");
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
| **assetsv3SaveAssignedTagsRequest** | [**Assetsv3SaveAssignedTagsRequest**](Assetsv3SaveAssignedTagsRequest.md)|  | |

### Return type

**Object**

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

<a id="assetsServiceSaveTagConceptData"></a>
# **assetsServiceSaveTagConceptData**
> Object assetsServiceSaveTagConceptData(assetsv3SaveTagConceptDataRequest)

SaveTagConceptData - creates a custom tag

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3SaveTagConceptDataRequest assetsv3SaveTagConceptDataRequest = new Assetsv3SaveTagConceptDataRequest(); // Assetsv3SaveTagConceptDataRequest | 
    try {
      Object result = apiInstance.assetsServiceSaveTagConceptData(assetsv3SaveTagConceptDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceSaveTagConceptData");
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
| **assetsv3SaveTagConceptDataRequest** | [**Assetsv3SaveTagConceptDataRequest**](Assetsv3SaveTagConceptDataRequest.md)|  | |

### Return type

**Object**

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

<a id="assetsServiceSaveTagDomainData"></a>
# **assetsServiceSaveTagDomainData**
> Object assetsServiceSaveTagDomainData(assetsv3SaveTagDomainDataRequest)

SaveTagDomainData - creates a custom category to be assigned to a tag

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3SaveTagDomainDataRequest assetsv3SaveTagDomainDataRequest = new Assetsv3SaveTagDomainDataRequest(); // Assetsv3SaveTagDomainDataRequest | 
    try {
      Object result = apiInstance.assetsServiceSaveTagDomainData(assetsv3SaveTagDomainDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceSaveTagDomainData");
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
| **assetsv3SaveTagDomainDataRequest** | [**Assetsv3SaveTagDomainDataRequest**](Assetsv3SaveTagDomainDataRequest.md)|  | |

### Return type

**Object**

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

<a id="assetsServiceSaveUpdateFilterTemplateForAssets"></a>
# **assetsServiceSaveUpdateFilterTemplateForAssets**
> Assetsv3SaveUpdateFilterTemplateResponse assetsServiceSaveUpdateFilterTemplateForAssets(assetsv3SaveUpdateFilterTemplateRequest)

SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3SaveUpdateFilterTemplateRequest assetsv3SaveUpdateFilterTemplateRequest = new Assetsv3SaveUpdateFilterTemplateRequest(); // Assetsv3SaveUpdateFilterTemplateRequest | 
    try {
      Assetsv3SaveUpdateFilterTemplateResponse result = apiInstance.assetsServiceSaveUpdateFilterTemplateForAssets(assetsv3SaveUpdateFilterTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceSaveUpdateFilterTemplateForAssets");
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
| **assetsv3SaveUpdateFilterTemplateRequest** | [**Assetsv3SaveUpdateFilterTemplateRequest**](Assetsv3SaveUpdateFilterTemplateRequest.md)|  | |

### Return type

[**Assetsv3SaveUpdateFilterTemplateResponse**](Assetsv3SaveUpdateFilterTemplateResponse.md)

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

<a id="assetsServiceSetBannerState"></a>
# **assetsServiceSetBannerState**
> Object assetsServiceSetBannerState(assetsv3SetBannerStateRequest)

SetBannerState - Set banner state for asset inventory page.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3SetBannerStateRequest assetsv3SetBannerStateRequest = new Assetsv3SetBannerStateRequest(); // Assetsv3SetBannerStateRequest | 
    try {
      Object result = apiInstance.assetsServiceSetBannerState(assetsv3SetBannerStateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceSetBannerState");
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
| **assetsv3SetBannerStateRequest** | [**Assetsv3SetBannerStateRequest**](Assetsv3SetBannerStateRequest.md)|  | |

### Return type

**Object**

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

<a id="assetsServiceUpdateAssetName"></a>
# **assetsServiceUpdateAssetName**
> Object assetsServiceUpdateAssetName(assetsv3UpdateAssetNameRequest)

UpdateAssetName - Udates the name of the asset as given by the user.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3UpdateAssetNameRequest assetsv3UpdateAssetNameRequest = new Assetsv3UpdateAssetNameRequest(); // Assetsv3UpdateAssetNameRequest | 
    try {
      Object result = apiInstance.assetsServiceUpdateAssetName(assetsv3UpdateAssetNameRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceUpdateAssetName");
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
| **assetsv3UpdateAssetNameRequest** | [**Assetsv3UpdateAssetNameRequest**](Assetsv3UpdateAssetNameRequest.md)|  | |

### Return type

**Object**

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

<a id="assetsServiceUpdatePolicy"></a>
# **assetsServiceUpdatePolicy**
> Object assetsServiceUpdatePolicy(assetsv3UpdatePolicyRequest)

UpdatePolicy - Update existing Policy status.

### Example
```java
// Import classes:
import com.ibm.gdsc.ApiClient;
import com.ibm.gdsc.ApiException;
import com.ibm.gdsc.Configuration;
import com.ibm.gdsc.auth.*;
import com.ibm.gdsc.models.*;
import com.ibm.gdsc.sdk.AssetsServiceApi;

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

    AssetsServiceApi apiInstance = new AssetsServiceApi(defaultClient);
    Assetsv3UpdatePolicyRequest assetsv3UpdatePolicyRequest = new Assetsv3UpdatePolicyRequest(); // Assetsv3UpdatePolicyRequest | 
    try {
      Object result = apiInstance.assetsServiceUpdatePolicy(assetsv3UpdatePolicyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetsServiceApi#assetsServiceUpdatePolicy");
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
| **assetsv3UpdatePolicyRequest** | [**Assetsv3UpdatePolicyRequest**](Assetsv3UpdatePolicyRequest.md)|  | |

### Return type

**Object**

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

