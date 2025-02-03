# EcosystemServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ecosystemServiceCreateDataset**](EcosystemServiceApi.md#ecosystemServiceCreateDataset) | **POST** /api/v3/integrations/datasets | Summary: Create dataset Description: Save a definition in the database. |
| [**ecosystemServiceDataInsert**](EcosystemServiceApi.md#ecosystemServiceDataInsert) | **POST** /api/v3/integrations/datasets/{dataset_name} | Summary: Data insert Description: Process Data received from webhook API and insert. |
| [**ecosystemServiceDeleteDatasets**](EcosystemServiceApi.md#ecosystemServiceDeleteDatasets) | **DELETE** /api/v3/integrations/datasets | Summary: Delete datasets Description: Delete an array of datasets. |
| [**ecosystemServiceGetDatasetData**](EcosystemServiceApi.md#ecosystemServiceGetDatasetData) | **GET** /api/v3/integrations/datasets/{dataset_name}/data | Summary: Get dataset data Description: Return data report for a given dataset. |
| [**ecosystemServiceGetDatasetDetail**](EcosystemServiceApi.md#ecosystemServiceGetDatasetDetail) | **GET** /api/v3/integrations/datasets/{dataset_name}/details | Summary: Get dataset detail Description: Return detail on a dataset definition. |
| [**ecosystemServiceGetDatasets**](EcosystemServiceApi.md#ecosystemServiceGetDatasets) | **GET** /api/v3/integrations/datasets | Summary: Get datasets Description: Return dataset list that matches the specified filter. |
| [**ecosystemServiceGetPurgableRows**](EcosystemServiceApi.md#ecosystemServiceGetPurgableRows) | **POST** /api/v3/integrations/purge | Summary: Get purgable rows Description: Check the number of rows that can be purged. |
| [**ecosystemServicePurgeData**](EcosystemServiceApi.md#ecosystemServicePurgeData) | **DELETE** /api/v3/integrations/datasets/data | Summary: Purge data Description: Purge data. |


<a id="ecosystemServiceCreateDataset"></a>
# **ecosystemServiceCreateDataset**
> Ecosystemv3CreateDatasetResponse ecosystemServiceCreateDataset(ecosystemv3CreateDatasetRequest)

Summary: Create dataset Description: Save a definition in the database.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EcosystemServiceApi;

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

    EcosystemServiceApi apiInstance = new EcosystemServiceApi(defaultClient);
    Ecosystemv3CreateDatasetRequest ecosystemv3CreateDatasetRequest = new Ecosystemv3CreateDatasetRequest(); // Ecosystemv3CreateDatasetRequest | 
    try {
      Ecosystemv3CreateDatasetResponse result = apiInstance.ecosystemServiceCreateDataset(ecosystemv3CreateDatasetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemServiceApi#ecosystemServiceCreateDataset");
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
| **ecosystemv3CreateDatasetRequest** | [**Ecosystemv3CreateDatasetRequest**](Ecosystemv3CreateDatasetRequest.md)|  | |

### Return type

[**Ecosystemv3CreateDatasetResponse**](Ecosystemv3CreateDatasetResponse.md)

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

<a id="ecosystemServiceDataInsert"></a>
# **ecosystemServiceDataInsert**
> Ecosystemv3DataInsertResponse ecosystemServiceDataInsert(datasetName, ecosystemv3DataInsertRequest)

Summary: Data insert Description: Process Data received from webhook API and insert.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EcosystemServiceApi;

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

    EcosystemServiceApi apiInstance = new EcosystemServiceApi(defaultClient);
    String datasetName = "datasetName_example"; // String | Data set target name.
    Ecosystemv3DataInsertRequest ecosystemv3DataInsertRequest = new Ecosystemv3DataInsertRequest(); // Ecosystemv3DataInsertRequest | 
    try {
      Ecosystemv3DataInsertResponse result = apiInstance.ecosystemServiceDataInsert(datasetName, ecosystemv3DataInsertRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemServiceApi#ecosystemServiceDataInsert");
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
| **datasetName** | **String**| Data set target name. | |
| **ecosystemv3DataInsertRequest** | [**Ecosystemv3DataInsertRequest**](Ecosystemv3DataInsertRequest.md)|  | |

### Return type

[**Ecosystemv3DataInsertResponse**](Ecosystemv3DataInsertResponse.md)

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

<a id="ecosystemServiceDeleteDatasets"></a>
# **ecosystemServiceDeleteDatasets**
> Ecosystemv3DeleteDatasetsResponse ecosystemServiceDeleteDatasets(datasetNames)

Summary: Delete datasets Description: Delete an array of datasets.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EcosystemServiceApi;

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

    EcosystemServiceApi apiInstance = new EcosystemServiceApi(defaultClient);
    List<String> datasetNames = Arrays.asList(); // List<String> | Name of the dataset, required field.
    try {
      Ecosystemv3DeleteDatasetsResponse result = apiInstance.ecosystemServiceDeleteDatasets(datasetNames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemServiceApi#ecosystemServiceDeleteDatasets");
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
| **datasetNames** | [**List&lt;String&gt;**](String.md)| Name of the dataset, required field. | [optional] |

### Return type

[**Ecosystemv3DeleteDatasetsResponse**](Ecosystemv3DeleteDatasetsResponse.md)

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

<a id="ecosystemServiceGetDatasetData"></a>
# **ecosystemServiceGetDatasetData**
> Ecosystemv3GetDatasetDataResponse ecosystemServiceGetDatasetData(datasetName, offset, limit, returnHeader, field, value, sortField, sortOrder)

Summary: Get dataset data Description: Return data report for a given dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EcosystemServiceApi;

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

    EcosystemServiceApi apiInstance = new EcosystemServiceApi(defaultClient);
    String datasetName = "datasetName_example"; // String | Name of the dataset.
    Long offset = 56L; // Long | The amount to offset the rows by for pagination.
    Long limit = 56L; // Long | The max amount of rows to return for pagination.
    Boolean returnHeader = true; // Boolean | If needs to return header information. It is for pagination. The first page needs header, the rest doesn't need.
    String field = "field_example"; // String | Search field.
    String value = "value_example"; // String | Search value.
    String sortField = "sortField_example"; // String | Field to sort.
    String sortOrder = "NONE"; // String | Sort order.
    try {
      Ecosystemv3GetDatasetDataResponse result = apiInstance.ecosystemServiceGetDatasetData(datasetName, offset, limit, returnHeader, field, value, sortField, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemServiceApi#ecosystemServiceGetDatasetData");
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
| **datasetName** | **String**| Name of the dataset. | |
| **offset** | **Long**| The amount to offset the rows by for pagination. | [optional] |
| **limit** | **Long**| The max amount of rows to return for pagination. | [optional] |
| **returnHeader** | **Boolean**| If needs to return header information. It is for pagination. The first page needs header, the rest doesn&#39;t need. | [optional] |
| **field** | **String**| Search field. | [optional] |
| **value** | **String**| Search value. | [optional] |
| **sortField** | **String**| Field to sort. | [optional] |
| **sortOrder** | **String**| Sort order. | [optional] [default to NONE] [enum: NONE, ASC, DESC] |

### Return type

[**Ecosystemv3GetDatasetDataResponse**](Ecosystemv3GetDatasetDataResponse.md)

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

<a id="ecosystemServiceGetDatasetDetail"></a>
# **ecosystemServiceGetDatasetDetail**
> Ecosystemv3GetDatasetDetailResponse ecosystemServiceGetDatasetDetail(datasetName)

Summary: Get dataset detail Description: Return detail on a dataset definition.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EcosystemServiceApi;

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

    EcosystemServiceApi apiInstance = new EcosystemServiceApi(defaultClient);
    String datasetName = "datasetName_example"; // String | Name of the dataset.
    try {
      Ecosystemv3GetDatasetDetailResponse result = apiInstance.ecosystemServiceGetDatasetDetail(datasetName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemServiceApi#ecosystemServiceGetDatasetDetail");
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
| **datasetName** | **String**| Name of the dataset. | |

### Return type

[**Ecosystemv3GetDatasetDetailResponse**](Ecosystemv3GetDatasetDetailResponse.md)

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

<a id="ecosystemServiceGetDatasets"></a>
# **ecosystemServiceGetDatasets**
> Ecosystemv3GetDatasetsResponse ecosystemServiceGetDatasets(filterStartTime, filterEndTime, filterDatasetNames, offset, limit, includeFilterCounts)

Summary: Get datasets Description: Return dataset list that matches the specified filter.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EcosystemServiceApi;

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

    EcosystemServiceApi apiInstance = new EcosystemServiceApi(defaultClient);
    OffsetDateTime filterStartTime = OffsetDateTime.now(); // OffsetDateTime | Return datasets created at this time or later (>=).
    OffsetDateTime filterEndTime = OffsetDateTime.now(); // OffsetDateTime | Return datasets created before this time (<).
    List<String> filterDatasetNames = Arrays.asList(); // List<String> | The state filter groups commonly paired states. Only returns records that include the specified names.
    Long offset = 56L; // Long | The amount to offset the rows by for pagination.
    Long limit = 56L; // Long | The max amount of rows to return for pagination.
    Boolean includeFilterCounts = true; // Boolean | Computing the filter counts is relatively expensive, only compute when needed.
    try {
      Ecosystemv3GetDatasetsResponse result = apiInstance.ecosystemServiceGetDatasets(filterStartTime, filterEndTime, filterDatasetNames, offset, limit, includeFilterCounts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemServiceApi#ecosystemServiceGetDatasets");
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
| **filterStartTime** | **OffsetDateTime**| Return datasets created at this time or later (&gt;&#x3D;). | [optional] |
| **filterEndTime** | **OffsetDateTime**| Return datasets created before this time (&lt;). | [optional] |
| **filterDatasetNames** | [**List&lt;String&gt;**](String.md)| The state filter groups commonly paired states. Only returns records that include the specified names. | [optional] |
| **offset** | **Long**| The amount to offset the rows by for pagination. | [optional] |
| **limit** | **Long**| The max amount of rows to return for pagination. | [optional] |
| **includeFilterCounts** | **Boolean**| Computing the filter counts is relatively expensive, only compute when needed. | [optional] |

### Return type

[**Ecosystemv3GetDatasetsResponse**](Ecosystemv3GetDatasetsResponse.md)

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

<a id="ecosystemServiceGetPurgableRows"></a>
# **ecosystemServiceGetPurgableRows**
> Ecosystemv3GetPurgableRowsResponse ecosystemServiceGetPurgableRows(ecosystemv3GetPurgableRowsRequest)

Summary: Get purgable rows Description: Check the number of rows that can be purged.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EcosystemServiceApi;

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

    EcosystemServiceApi apiInstance = new EcosystemServiceApi(defaultClient);
    Ecosystemv3GetPurgableRowsRequest ecosystemv3GetPurgableRowsRequest = new Ecosystemv3GetPurgableRowsRequest(); // Ecosystemv3GetPurgableRowsRequest | 
    try {
      Ecosystemv3GetPurgableRowsResponse result = apiInstance.ecosystemServiceGetPurgableRows(ecosystemv3GetPurgableRowsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemServiceApi#ecosystemServiceGetPurgableRows");
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
| **ecosystemv3GetPurgableRowsRequest** | [**Ecosystemv3GetPurgableRowsRequest**](Ecosystemv3GetPurgableRowsRequest.md)|  | |

### Return type

[**Ecosystemv3GetPurgableRowsResponse**](Ecosystemv3GetPurgableRowsResponse.md)

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

<a id="ecosystemServicePurgeData"></a>
# **ecosystemServicePurgeData**
> Ecosystemv3PurgeDataResponse ecosystemServicePurgeData(datasetNames)

Summary: Purge data Description: Purge data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EcosystemServiceApi;

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

    EcosystemServiceApi apiInstance = new EcosystemServiceApi(defaultClient);
    List<String> datasetNames = Arrays.asList(); // List<String> | Name of the datasets, required field.
    try {
      Ecosystemv3PurgeDataResponse result = apiInstance.ecosystemServicePurgeData(datasetNames);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcosystemServiceApi#ecosystemServicePurgeData");
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
| **datasetNames** | [**List&lt;String&gt;**](String.md)| Name of the datasets, required field. | [optional] |

### Return type

[**Ecosystemv3PurgeDataResponse**](Ecosystemv3PurgeDataResponse.md)

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

