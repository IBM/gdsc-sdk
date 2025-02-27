# DataStoresApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDataStore**](DataStoresApi.md#getDataStore) | **GET** /api/v1/dspm/dataStores/{dataStoreId} | Get a data store by its ID |
| [**getDataStoresSummary**](DataStoresApi.md#getDataStoresSummary) | **GET** /api/v1/dspm/dataStores/summary | Get summary of data stores |
| [**listAllDataStoresLabels**](DataStoresApi.md#listAllDataStoresLabels) | **GET** /api/v1/dspm/dataStores/labels | List labels of data stores. |
| [**listDataStores**](DataStoresApi.md#listDataStores) | **GET** /api/v1/dspm/dataStores | List data stores |
| [**listDataStoresCloudTagsKeys**](DataStoresApi.md#listDataStoresCloudTagsKeys) | **GET** /api/v1/dspm/dataStores/cloudTags/keys | List the cloud tag keys of data stores that can be filtered on the basis of prefixes. |
| [**listDataStoresCloudTagsValues**](DataStoresApi.md#listDataStoresCloudTagsValues) | **GET** /api/v1/dspm/dataStores/cloudTags/values | List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names. |
| [**listDataStoresNames**](DataStoresApi.md#listDataStoresNames) | **GET** /api/v1/dspm/dataStores/filters/name | List name of filterable data stores |
| [**rescanDataStore**](DataStoresApi.md#rescanDataStore) | **POST** /api/v1/dspm/dataStores/rescan | Post data store rescan request |
| [**setDataStoreLabel**](DataStoresApi.md#setDataStoreLabel) | **PUT** /api/v1/dspm/dataStores/{dataStoreId}/labels | Label a data store with an existing or new label |
| [**updateDatastoreCustodian**](DataStoresApi.md#updateDatastoreCustodian) | **POST** /api/v1/dspm/dataStores/custodian | Update the name of a Data store custodian |


<a id="getDataStore"></a>
# **getDataStore**
> DataStore getDataStore(dataStoreId)

Get a data store by its ID

Get details of a specific data store by its ID.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataStoresApi apiInstance = new DataStoresApi(defaultClient);
    String dataStoreId = "arn:aws:s3::123456789101:mys3-prod"; // String | ID of the data store
    try {
      DataStore result = apiInstance.getDataStore(dataStoreId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStoresApi#getDataStore");
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
| **dataStoreId** | **String**| ID of the data store | |

### Return type

[**DataStore**](DataStore.md)

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

<a id="getDataStoresSummary"></a>
# **getDataStoresSummary**
> DataStoresSummary getDataStoresSummary(filter)

Get summary of data stores

Get a summary of all the data stores, that is, name of data resources, types of data stores, and other information.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataStoresApi apiInstance = new DataStoresApi(defaultClient);
    ListDataStoresFilterParameter filter = new ListDataStoresFilterParameter(); // ListDataStoresFilterParameter | 
    try {
      DataStoresSummary result = apiInstance.getDataStoresSummary(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStoresApi#getDataStoresSummary");
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
| **filter** | [**ListDataStoresFilterParameter**](.md)|  | [optional] |

### Return type

[**DataStoresSummary**](DataStoresSummary.md)

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

<a id="listAllDataStoresLabels"></a>
# **listAllDataStoresLabels**
> List&lt;String&gt; listAllDataStoresLabels(prefix, maxResults)

List labels of data stores.

Get a list of all the labels of custom data stores.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataStoresApi apiInstance = new DataStoresApi(defaultClient);
    String prefix = "test"; // String | Prefix of data store label
    BigDecimal maxResults = new BigDecimal("10"); // BigDecimal | 
    try {
      List<String> result = apiInstance.listAllDataStoresLabels(prefix, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStoresApi#listAllDataStoresLabels");
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
| **prefix** | **String**| Prefix of data store label | [optional] |
| **maxResults** | **BigDecimal**|  | [optional] |

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

<a id="listDataStores"></a>
# **listDataStores**
> ListDataStores200Response listDataStores(filter, sort, pageSize, nextToken)

List data stores

List all data stores discovered by Guardium DSPM.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataStoresApi apiInstance = new DataStoresApi(defaultClient);
    ListDataStoresFilterParameter filter = new ListDataStoresFilterParameter(); // ListDataStoresFilterParameter | 
    ListDataStoresSortParameter sort = new ListDataStoresSortParameter(); // ListDataStoresSortParameter | 
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      ListDataStores200Response result = apiInstance.listDataStores(filter, sort, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStoresApi#listDataStores");
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
| **filter** | [**ListDataStoresFilterParameter**](.md)|  | [optional] |
| **sort** | [**ListDataStoresSortParameter**](.md)|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **nextToken** | **String**|  | [optional] |

### Return type

[**ListDataStores200Response**](ListDataStores200Response.md)

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

<a id="listDataStoresCloudTagsKeys"></a>
# **listDataStoresCloudTagsKeys**
> List&lt;String&gt; listDataStoresCloudTagsKeys(prefix, maxResults)

List the cloud tag keys of data stores that can be filtered on the basis of prefixes.

Get a list of the available cloud tag keys of data stores that can be filtered on the basis of prefixes.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataStoresApi apiInstance = new DataStoresApi(defaultClient);
    String prefix = "environment"; // String | Prefix of cloud tag key
    BigDecimal maxResults = new BigDecimal("10"); // BigDecimal | 
    try {
      List<String> result = apiInstance.listDataStoresCloudTagsKeys(prefix, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStoresApi#listDataStoresCloudTagsKeys");
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
| **prefix** | **String**| Prefix of cloud tag key | |
| **maxResults** | **BigDecimal**|  | [optional] |

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

<a id="listDataStoresCloudTagsValues"></a>
# **listDataStoresCloudTagsValues**
> List&lt;String&gt; listDataStoresCloudTagsValues(prefix, tagKey, maxResults)

List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.

Get a list of the available cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataStoresApi apiInstance = new DataStoresApi(defaultClient);
    String prefix = "comp"; // String | Prefix of cloud tag value
    String tagKey = "Production"; // String | 
    BigDecimal maxResults = new BigDecimal("10"); // BigDecimal | 
    try {
      List<String> result = apiInstance.listDataStoresCloudTagsValues(prefix, tagKey, maxResults);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStoresApi#listDataStoresCloudTagsValues");
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
| **prefix** | **String**| Prefix of cloud tag value | |
| **tagKey** | **String**|  | |
| **maxResults** | **BigDecimal**|  | [optional] |

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

<a id="listDataStoresNames"></a>
# **listDataStoresNames**
> List&lt;String&gt; listDataStoresNames(prefix)

List name of filterable data stores

Lists the data stores that can be filtered or classified.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataStoresApi apiInstance = new DataStoresApi(defaultClient);
    String prefix = "polar"; // String | Prefix of data store name
    try {
      List<String> result = apiInstance.listDataStoresNames(prefix);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStoresApi#listDataStoresNames");
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
| **prefix** | **String**| Prefix of data store name | |

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

<a id="rescanDataStore"></a>
# **rescanDataStore**
> rescanDataStore(rescanDataStoreRequest)

Post data store rescan request

Post the request for a data store rescan.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataStoresApi apiInstance = new DataStoresApi(defaultClient);
    RescanDataStoreRequest rescanDataStoreRequest = new RescanDataStoreRequest(); // RescanDataStoreRequest | 
    try {
      apiInstance.rescanDataStore(rescanDataStoreRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStoresApi#rescanDataStore");
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
| **rescanDataStoreRequest** | [**RescanDataStoreRequest**](RescanDataStoreRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="setDataStoreLabel"></a>
# **setDataStoreLabel**
> setDataStoreLabel(dataStoreId, setDataStoreLabelRequest)

Label a data store with an existing or new label

Add or update a custom label for a data store.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataStoresApi apiInstance = new DataStoresApi(defaultClient);
    String dataStoreId = "arn:aws:s3::123456789101:mys3-prod"; // String | Data store ID
    SetDataStoreLabelRequest setDataStoreLabelRequest = new SetDataStoreLabelRequest(); // SetDataStoreLabelRequest | 
    try {
      apiInstance.setDataStoreLabel(dataStoreId, setDataStoreLabelRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStoresApi#setDataStoreLabel");
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
| **dataStoreId** | **String**| Data store ID | |
| **setDataStoreLabelRequest** | [**SetDataStoreLabelRequest**](SetDataStoreLabelRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="updateDatastoreCustodian"></a>
# **updateDatastoreCustodian**
> UpdateDatastoreCustodian200Response updateDatastoreCustodian(updateCustodianBody)

Update the name of a Data store custodian

Add or update the name of a specific data store.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataStoresApi apiInstance = new DataStoresApi(defaultClient);
    UpdateCustodianBody updateCustodianBody = new UpdateCustodianBody(); // UpdateCustodianBody | 
    try {
      UpdateDatastoreCustodian200Response result = apiInstance.updateDatastoreCustodian(updateCustodianBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataStoresApi#updateDatastoreCustodian");
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
| **updateCustodianBody** | [**UpdateCustodianBody**](UpdateCustodianBody.md)|  | |

### Return type

[**UpdateDatastoreCustodian200Response**](UpdateDatastoreCustodian200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

