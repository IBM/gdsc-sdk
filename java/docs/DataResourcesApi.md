# DataResourcesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDataResource**](DataResourcesApi.md#getDataResource) | **GET** /api/v1/dspm/dataResources/{dataResourceId} | Get a specific data resource by its ID |
| [**getDataResourcesSummary**](DataResourcesApi.md#getDataResourcesSummary) | **GET** /api/v1/dspm/dataResources/summary | Data resources summary |
| [**listDataResources**](DataResourcesApi.md#listDataResources) | **GET** /api/v1/dspm/dataResources | List data resources that match a given filter |
| [**listDataResourcesNames**](DataResourcesApi.md#listDataResourcesNames) | **GET** /api/v1/dspm/dataResources/names | List names of data resources |
| [**removeResource**](DataResourcesApi.md#removeResource) | **DELETE** /api/v1/dspm/dataResources/{dataResourceId}/removeResource | Remove resource from Guardium Insights SaaS DSPM |
| [**updateResourceReviewStatus**](DataResourcesApi.md#updateResourceReviewStatus) | **PUT** /api/v1/dspm/dataResources/{dataResourceId}/reviewed | Set review status of a data resource |


<a id="getDataResource"></a>
# **getDataResource**
> DataResource getDataResource(dataResourceId)

Get a specific data resource by its ID

Get additional details on a specific data resource by providing its ID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataResourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataResourcesApi apiInstance = new DataResourcesApi(defaultClient);
    String dataResourceId = "arn:aws:s3::12345678910:polar-security-corplex.xlsx"; // String | Data resource ID
    try {
      DataResource result = apiInstance.getDataResource(dataResourceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataResourcesApi#getDataResource");
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
| **dataResourceId** | **String**| Data resource ID | |

### Return type

[**DataResource**](DataResource.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getDataResourcesSummary"></a>
# **getDataResourcesSummary**
> DataResourcesSummary getDataResourcesSummary(dataStoreId, filter)

Data resources summary

Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataResourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataResourcesApi apiInstance = new DataResourcesApi(defaultClient);
    String dataStoreId = "arn:aws:s3::123456789101:mys3-prod"; // String | Data store id
    ListDataResourcesFilterParameter filter = new ListDataResourcesFilterParameter(); // ListDataResourcesFilterParameter | 
    try {
      DataResourcesSummary result = apiInstance.getDataResourcesSummary(dataStoreId, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataResourcesApi#getDataResourcesSummary");
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
| **dataStoreId** | **String**| Data store id | [optional] |
| **filter** | [**ListDataResourcesFilterParameter**](.md)|  | [optional] |

### Return type

[**DataResourcesSummary**](DataResourcesSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="listDataResources"></a>
# **listDataResources**
> ListDataResources200Response listDataResources(dataStoreId, filter, sort, pageSize, nextToken)

List data resources that match a given filter

Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.&lt;BR&gt;&lt;B&gt;Note:&lt;/B&gt; Filter needs to be HTML encoded.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataResourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataResourcesApi apiInstance = new DataResourcesApi(defaultClient);
    String dataStoreId = "arn:aws:s3::123456789101:mys3-prod"; // String | 
    ListDataResourcesFilterParameter filter = new ListDataResourcesFilterParameter(); // ListDataResourcesFilterParameter | 
    ListDataResourcesSortParameter sort = new ListDataResourcesSortParameter(); // ListDataResourcesSortParameter | 
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      ListDataResources200Response result = apiInstance.listDataResources(dataStoreId, filter, sort, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataResourcesApi#listDataResources");
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
| **dataStoreId** | **String**|  | [optional] |
| **filter** | [**ListDataResourcesFilterParameter**](.md)|  | [optional] |
| **sort** | [**ListDataResourcesSortParameter**](.md)|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **nextToken** | **String**|  | [optional] |

### Return type

[**ListDataResources200Response**](ListDataResources200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="listDataResourcesNames"></a>
# **listDataResourcesNames**
> List&lt;String&gt; listDataResourcesNames(prefix, dataStoreId)

List names of data resources

List and filter data resources by their names

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataResourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataResourcesApi apiInstance = new DataResourcesApi(defaultClient);
    String prefix = "check"; // String | Prefix of data resource name
    String dataStoreId = "arn:aws:s3::123456789101:mys3-prod"; // String | 
    try {
      List<String> result = apiInstance.listDataResourcesNames(prefix, dataStoreId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataResourcesApi#listDataResourcesNames");
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
| **prefix** | **String**| Prefix of data resource name | |
| **dataStoreId** | **String**|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="removeResource"></a>
# **removeResource**
> RemoveResource200Response removeResource(dataResourceId, dataStoreId)

Remove resource from Guardium Insights SaaS DSPM

Removes a resource, with all its sensitivities, from Guardium Insights SaaS DSPM dashboard. This action does not remove the resource from the resource&#39;s source environment.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataResourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataResourcesApi apiInstance = new DataResourcesApi(defaultClient);
    String dataResourceId = "arn:aws:s3::12345678910:polar-security-corplex.xlsx"; // String | Data resource ID
    String dataStoreId = "arn:aws:s3::123456789101:mys3-prod"; // String | Data store ID
    try {
      RemoveResource200Response result = apiInstance.removeResource(dataResourceId, dataStoreId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataResourcesApi#removeResource");
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
| **dataResourceId** | **String**| Data resource ID | |
| **dataStoreId** | **String**| Data store ID | |

### Return type

[**RemoveResource200Response**](RemoveResource200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateResourceReviewStatus"></a>
# **updateResourceReviewStatus**
> UpdateResourceReviewStatus200Response updateResourceReviewStatus(dataResourceId, updateResourceReviewBody)

Set review status of a data resource

Set the review status of a specific data resource in a specific data store.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DataResourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataResourcesApi apiInstance = new DataResourcesApi(defaultClient);
    String dataResourceId = "dataResourceId_example"; // String | Data resource id
    UpdateResourceReviewBody updateResourceReviewBody = new UpdateResourceReviewBody(); // UpdateResourceReviewBody | 
    try {
      UpdateResourceReviewStatus200Response result = apiInstance.updateResourceReviewStatus(dataResourceId, updateResourceReviewBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataResourcesApi#updateResourceReviewStatus");
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
| **dataResourceId** | **String**| Data resource id | |
| **updateResourceReviewBody** | [**UpdateResourceReviewBody**](UpdateResourceReviewBody.md)|  | |

### Return type

[**UpdateResourceReviewStatus200Response**](UpdateResourceReviewStatus200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |

