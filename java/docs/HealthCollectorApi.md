# HealthCollectorApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**healthCollectorGetDataWarehouseUsage**](HealthCollectorApi.md#healthCollectorGetDataWarehouseUsage) | **GET** /api/v3/metrics/warehouse/{type} | Summary: Get data warehouse usage info Description: Get information from data warehouse related to usage |
| [**healthCollectorGetGDPHealthInfo**](HealthCollectorApi.md#healthCollectorGetGDPHealthInfo) | **GET** /api/v3/health | Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service. |
| [**healthCollectorGetHistoricalHealthInfo**](HealthCollectorApi.md#healthCollectorGetHistoricalHealthInfo) | **GET** /api/v3/health/history | Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service. |
| [**healthCollectorGetObjectStorageUsage**](HealthCollectorApi.md#healthCollectorGetObjectStorageUsage) | **GET** /api/v3/metrics/object_storage/{type} | Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage |
| [**healthCollectorGetPVCUsage**](HealthCollectorApi.md#healthCollectorGetPVCUsage) | **GET** /api/v3/metrics/pvc/{type} | Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster |
| [**healthCollectorGetPodRestarts**](HealthCollectorApi.md#healthCollectorGetPodRestarts) | **GET** /api/v3/metrics/pods/{type} | Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP |
| [**healthCollectorGetStreamsIngestion**](HealthCollectorApi.md#healthCollectorGetStreamsIngestion) | **GET** /api/v3/metrics/streams/{type} | Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume |
| [**healthCollectorGetTopGDPCollectors**](HealthCollectorApi.md#healthCollectorGetTopGDPCollectors) | **GET** /api/v3/metrics/collectors/{type} | Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors |
| [**healthCollectorStoreHealthInfo**](HealthCollectorApi.md#healthCollectorStoreHealthInfo) | **POST** /api/v3/health/central_managers/{central_manager_id}/health_info | Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only) |


<a id="healthCollectorGetDataWarehouseUsage"></a>
# **healthCollectorGetDataWarehouseUsage**
> Healthcollectorv3GetDataWarehouseUsageResponse healthCollectorGetDataWarehouseUsage(type, startTime, endTime)

Summary: Get data warehouse usage info Description: Get information from data warehouse related to usage

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.HealthCollectorApi;

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

    HealthCollectorApi apiInstance = new HealthCollectorApi(defaultClient);
    String type = "type_example"; // String | The type of metric to retrieve
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | The start time from which the data needs to be calculated.
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | The end time from which the data needs to be calculated.
    try {
      Healthcollectorv3GetDataWarehouseUsageResponse result = apiInstance.healthCollectorGetDataWarehouseUsage(type, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCollectorApi#healthCollectorGetDataWarehouseUsage");
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
| **type** | **String**| The type of metric to retrieve | |
| **startTime** | **OffsetDateTime**| The start time from which the data needs to be calculated. | [optional] |
| **endTime** | **OffsetDateTime**| The end time from which the data needs to be calculated. | [optional] |

### Return type

[**Healthcollectorv3GetDataWarehouseUsageResponse**](Healthcollectorv3GetDataWarehouseUsageResponse.md)

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

<a id="healthCollectorGetGDPHealthInfo"></a>
# **healthCollectorGetGDPHealthInfo**
> Healthcollectorv3GetGDPHealthInfoResponse healthCollectorGetGDPHealthInfo()

Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.HealthCollectorApi;

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

    HealthCollectorApi apiInstance = new HealthCollectorApi(defaultClient);
    try {
      Healthcollectorv3GetGDPHealthInfoResponse result = apiInstance.healthCollectorGetGDPHealthInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCollectorApi#healthCollectorGetGDPHealthInfo");
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

[**Healthcollectorv3GetGDPHealthInfoResponse**](Healthcollectorv3GetGDPHealthInfoResponse.md)

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

<a id="healthCollectorGetHistoricalHealthInfo"></a>
# **healthCollectorGetHistoricalHealthInfo**
> Healthcollectorv3GetHistoricalHealthInfoResponse healthCollectorGetHistoricalHealthInfo(unit, cmId, startTime, endTime)

Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.HealthCollectorApi;

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

    HealthCollectorApi apiInstance = new HealthCollectorApi(defaultClient);
    String unit = "UNKNOWN_UNIT"; // String | Type of unit for which data needs to be retrieved.
    String cmId = "cmId_example"; // String | Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved.
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | The start time from which the data needs to be calculated.
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | The end time from which the data needs to be calculated.
    try {
      Healthcollectorv3GetHistoricalHealthInfoResponse result = apiInstance.healthCollectorGetHistoricalHealthInfo(unit, cmId, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCollectorApi#healthCollectorGetHistoricalHealthInfo");
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
| **unit** | **String**| Type of unit for which data needs to be retrieved. | [optional] [default to UNKNOWN_UNIT] [enum: UNKNOWN_UNIT, STAP] |
| **cmId** | **String**| Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. | [optional] |
| **startTime** | **OffsetDateTime**| The start time from which the data needs to be calculated. | [optional] |
| **endTime** | **OffsetDateTime**| The end time from which the data needs to be calculated. | [optional] |

### Return type

[**Healthcollectorv3GetHistoricalHealthInfoResponse**](Healthcollectorv3GetHistoricalHealthInfoResponse.md)

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

<a id="healthCollectorGetObjectStorageUsage"></a>
# **healthCollectorGetObjectStorageUsage**
> Healthcollectorv3GetObjectStorageUsageResponse healthCollectorGetObjectStorageUsage(type, startTime, endTime)

Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.HealthCollectorApi;

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

    HealthCollectorApi apiInstance = new HealthCollectorApi(defaultClient);
    String type = "type_example"; // String | The type of metric to retrieve
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | The start time from which the data needs to be calculated.
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | The end time from which the data needs to be calculated.
    try {
      Healthcollectorv3GetObjectStorageUsageResponse result = apiInstance.healthCollectorGetObjectStorageUsage(type, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCollectorApi#healthCollectorGetObjectStorageUsage");
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
| **type** | **String**| The type of metric to retrieve | |
| **startTime** | **OffsetDateTime**| The start time from which the data needs to be calculated. | [optional] |
| **endTime** | **OffsetDateTime**| The end time from which the data needs to be calculated. | [optional] |

### Return type

[**Healthcollectorv3GetObjectStorageUsageResponse**](Healthcollectorv3GetObjectStorageUsageResponse.md)

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

<a id="healthCollectorGetPVCUsage"></a>
# **healthCollectorGetPVCUsage**
> Healthcollectorv3GetPVCUsageResponse healthCollectorGetPVCUsage(type, startTime, endTime)

Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.HealthCollectorApi;

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

    HealthCollectorApi apiInstance = new HealthCollectorApi(defaultClient);
    String type = "type_example"; // String | The type of metric to retrieve
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | The start time from which the data needs to be calculated.
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | The end time from which the data needs to be calculated.
    try {
      Healthcollectorv3GetPVCUsageResponse result = apiInstance.healthCollectorGetPVCUsage(type, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCollectorApi#healthCollectorGetPVCUsage");
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
| **type** | **String**| The type of metric to retrieve | |
| **startTime** | **OffsetDateTime**| The start time from which the data needs to be calculated. | [optional] |
| **endTime** | **OffsetDateTime**| The end time from which the data needs to be calculated. | [optional] |

### Return type

[**Healthcollectorv3GetPVCUsageResponse**](Healthcollectorv3GetPVCUsageResponse.md)

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

<a id="healthCollectorGetPodRestarts"></a>
# **healthCollectorGetPodRestarts**
> Healthcollectorv3GetPodRestartsResponse healthCollectorGetPodRestarts(type, startTime, endTime)

Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.HealthCollectorApi;

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

    HealthCollectorApi apiInstance = new HealthCollectorApi(defaultClient);
    String type = "type_example"; // String | The type of metric to retrieve
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | The start time from which the data needs to be calculated.
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | The end time from which the data needs to be calculated.
    try {
      Healthcollectorv3GetPodRestartsResponse result = apiInstance.healthCollectorGetPodRestarts(type, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCollectorApi#healthCollectorGetPodRestarts");
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
| **type** | **String**| The type of metric to retrieve | |
| **startTime** | **OffsetDateTime**| The start time from which the data needs to be calculated. | [optional] |
| **endTime** | **OffsetDateTime**| The end time from which the data needs to be calculated. | [optional] |

### Return type

[**Healthcollectorv3GetPodRestartsResponse**](Healthcollectorv3GetPodRestartsResponse.md)

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

<a id="healthCollectorGetStreamsIngestion"></a>
# **healthCollectorGetStreamsIngestion**
> Healthcollectorv3GetStreamsIngestionResponse healthCollectorGetStreamsIngestion(type, startTime, endTime)

Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.HealthCollectorApi;

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

    HealthCollectorApi apiInstance = new HealthCollectorApi(defaultClient);
    String type = "type_example"; // String | The type of metric to retrieve
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | The start time from which the data needs to be calculated.
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | The end time from which the data needs to be calculated.
    try {
      Healthcollectorv3GetStreamsIngestionResponse result = apiInstance.healthCollectorGetStreamsIngestion(type, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCollectorApi#healthCollectorGetStreamsIngestion");
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
| **type** | **String**| The type of metric to retrieve | |
| **startTime** | **OffsetDateTime**| The start time from which the data needs to be calculated. | [optional] |
| **endTime** | **OffsetDateTime**| The end time from which the data needs to be calculated. | [optional] |

### Return type

[**Healthcollectorv3GetStreamsIngestionResponse**](Healthcollectorv3GetStreamsIngestionResponse.md)

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

<a id="healthCollectorGetTopGDPCollectors"></a>
# **healthCollectorGetTopGDPCollectors**
> Healthcollectorv3GetTopGDPCollectorsResponse healthCollectorGetTopGDPCollectors(type, startTime, endTime)

Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.HealthCollectorApi;

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

    HealthCollectorApi apiInstance = new HealthCollectorApi(defaultClient);
    String type = "type_example"; // String | The type of metric to retrieve
    OffsetDateTime startTime = OffsetDateTime.now(); // OffsetDateTime | The start time from which the data needs to be calculated.
    OffsetDateTime endTime = OffsetDateTime.now(); // OffsetDateTime | The end time from which the data needs to be calculated.
    try {
      Healthcollectorv3GetTopGDPCollectorsResponse result = apiInstance.healthCollectorGetTopGDPCollectors(type, startTime, endTime);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCollectorApi#healthCollectorGetTopGDPCollectors");
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
| **type** | **String**| The type of metric to retrieve | |
| **startTime** | **OffsetDateTime**| The start time from which the data needs to be calculated. | [optional] |
| **endTime** | **OffsetDateTime**| The end time from which the data needs to be calculated. | [optional] |

### Return type

[**Healthcollectorv3GetTopGDPCollectorsResponse**](Healthcollectorv3GetTopGDPCollectorsResponse.md)

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

<a id="healthCollectorStoreHealthInfo"></a>
# **healthCollectorStoreHealthInfo**
> Healthcollectorv3StoreHealthInfoResponse healthCollectorStoreHealthInfo(centralManagerId, healthcollectorv3StoreHealthInfoRequest)

Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.HealthCollectorApi;

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

    HealthCollectorApi apiInstance = new HealthCollectorApi(defaultClient);
    String centralManagerId = "centralManagerId_example"; // String | ID of central manager.
    Healthcollectorv3StoreHealthInfoRequest healthcollectorv3StoreHealthInfoRequest = new Healthcollectorv3StoreHealthInfoRequest(); // Healthcollectorv3StoreHealthInfoRequest | 
    try {
      Healthcollectorv3StoreHealthInfoResponse result = apiInstance.healthCollectorStoreHealthInfo(centralManagerId, healthcollectorv3StoreHealthInfoRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthCollectorApi#healthCollectorStoreHealthInfo");
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
| **centralManagerId** | **String**| ID of central manager. | |
| **healthcollectorv3StoreHealthInfoRequest** | [**Healthcollectorv3StoreHealthInfoRequest**](Healthcollectorv3StoreHealthInfoRequest.md)|  | |

### Return type

[**Healthcollectorv3StoreHealthInfoResponse**](Healthcollectorv3StoreHealthInfoResponse.md)

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

