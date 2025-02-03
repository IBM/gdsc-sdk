# QsDataManagerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qSDataManagerGetAppDataForProvisionId**](QsDataManagerApi.md#qSDataManagerGetAppDataForProvisionId) | **GET** /api/v3/datamanager/application/{provision_id}/data | Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id. |
| [**qSDataManagerGetMasterData**](QsDataManagerApi.md#qSDataManagerGetMasterData) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data. |
| [**qSDataManagerGetNetLocDimDataForScanId**](QsDataManagerApi.md#qSDataManagerGetNetLocDimDataForScanId) | **GET** /api/v3/datamanager/network/{scan_id}/data | Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid. |
| [**qSDataManagerInsertAllEntities**](QsDataManagerApi.md#qSDataManagerInsertAllEntities) | **POST** /api/v3/datamanager/all/entities | Summary: Insert Data Description: Insert All Dimension and Fact tables data. |
| [**qSDataManagerRegisterScan**](QsDataManagerApi.md#qSDataManagerRegisterScan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table. |
| [**qSDataManagerRetrieveScan**](QsDataManagerApi.md#qSDataManagerRetrieveScan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table. |
| [**qSDataManagerSearchEntityData**](QsDataManagerApi.md#qSDataManagerSearchEntityData) | **POST** /api/v3/datamanager/entity/search | Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters |
| [**qSDataManagerUpdateNetLocation**](QsDataManagerApi.md#qSDataManagerUpdateNetLocation) | **PUT** /api/v3/datamanager/network | Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid. |


<a id="qSDataManagerGetAppDataForProvisionId"></a>
# **qSDataManagerGetAppDataForProvisionId**
> Qspmdatamanagerv3AppDataResponse qSDataManagerGetAppDataForProvisionId(provisionId)

Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QsDataManagerApi;

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

    QsDataManagerApi apiInstance = new QsDataManagerApi(defaultClient);
    String provisionId = "provisionId_example"; // String | Identifier for the provision request
    try {
      Qspmdatamanagerv3AppDataResponse result = apiInstance.qSDataManagerGetAppDataForProvisionId(provisionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataManagerApi#qSDataManagerGetAppDataForProvisionId");
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
| **provisionId** | **String**| Identifier for the provision request | |

### Return type

[**Qspmdatamanagerv3AppDataResponse**](Qspmdatamanagerv3AppDataResponse.md)

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

<a id="qSDataManagerGetMasterData"></a>
# **qSDataManagerGetMasterData**
> Qspmdatamanagerv3MasterDataResponse qSDataManagerGetMasterData()

Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QsDataManagerApi;

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

    QsDataManagerApi apiInstance = new QsDataManagerApi(defaultClient);
    try {
      Qspmdatamanagerv3MasterDataResponse result = apiInstance.qSDataManagerGetMasterData();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataManagerApi#qSDataManagerGetMasterData");
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

[**Qspmdatamanagerv3MasterDataResponse**](Qspmdatamanagerv3MasterDataResponse.md)

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

<a id="qSDataManagerGetNetLocDimDataForScanId"></a>
# **qSDataManagerGetNetLocDimDataForScanId**
> Qspmdatamanagerv3NetlocDataResponse qSDataManagerGetNetLocDimDataForScanId(scanId)

Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QsDataManagerApi;

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

    QsDataManagerApi apiInstance = new QsDataManagerApi(defaultClient);
    String scanId = "scanId_example"; // String | Identifier for the scan to retrieve netloc data for
    try {
      Qspmdatamanagerv3NetlocDataResponse result = apiInstance.qSDataManagerGetNetLocDimDataForScanId(scanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataManagerApi#qSDataManagerGetNetLocDimDataForScanId");
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
| **scanId** | **String**| Identifier for the scan to retrieve netloc data for | |

### Return type

[**Qspmdatamanagerv3NetlocDataResponse**](Qspmdatamanagerv3NetlocDataResponse.md)

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

<a id="qSDataManagerInsertAllEntities"></a>
# **qSDataManagerInsertAllEntities**
> Object qSDataManagerInsertAllEntities(qspmdatamanagerv3InsertEntitiesRequest)

Summary: Insert Data Description: Insert All Dimension and Fact tables data.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QsDataManagerApi;

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

    QsDataManagerApi apiInstance = new QsDataManagerApi(defaultClient);
    Qspmdatamanagerv3InsertEntitiesRequest qspmdatamanagerv3InsertEntitiesRequest = new Qspmdatamanagerv3InsertEntitiesRequest(); // Qspmdatamanagerv3InsertEntitiesRequest | 
    try {
      Object result = apiInstance.qSDataManagerInsertAllEntities(qspmdatamanagerv3InsertEntitiesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataManagerApi#qSDataManagerInsertAllEntities");
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
| **qspmdatamanagerv3InsertEntitiesRequest** | [**Qspmdatamanagerv3InsertEntitiesRequest**](Qspmdatamanagerv3InsertEntitiesRequest.md)|  | |

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

<a id="qSDataManagerRegisterScan"></a>
# **qSDataManagerRegisterScan**
> Qspmdatamanagerv3ScanResponse qSDataManagerRegisterScan(qspmdatamanagerv3ScanRequest)

Summary: Insert ScanDetails Description: Register new data into scan dimension table.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QsDataManagerApi;

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

    QsDataManagerApi apiInstance = new QsDataManagerApi(defaultClient);
    Qspmdatamanagerv3ScanRequest qspmdatamanagerv3ScanRequest = new Qspmdatamanagerv3ScanRequest(); // Qspmdatamanagerv3ScanRequest | 
    try {
      Qspmdatamanagerv3ScanResponse result = apiInstance.qSDataManagerRegisterScan(qspmdatamanagerv3ScanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataManagerApi#qSDataManagerRegisterScan");
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
| **qspmdatamanagerv3ScanRequest** | [**Qspmdatamanagerv3ScanRequest**](Qspmdatamanagerv3ScanRequest.md)|  | |

### Return type

[**Qspmdatamanagerv3ScanResponse**](Qspmdatamanagerv3ScanResponse.md)

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

<a id="qSDataManagerRetrieveScan"></a>
# **qSDataManagerRetrieveScan**
> Qspmdatamanagerv3ScanResponse qSDataManagerRetrieveScan(scanId)

Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QsDataManagerApi;

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

    QsDataManagerApi apiInstance = new QsDataManagerApi(defaultClient);
    String scanId = "scanId_example"; // String | 
    try {
      Qspmdatamanagerv3ScanResponse result = apiInstance.qSDataManagerRetrieveScan(scanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataManagerApi#qSDataManagerRetrieveScan");
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
| **scanId** | **String**|  | |

### Return type

[**Qspmdatamanagerv3ScanResponse**](Qspmdatamanagerv3ScanResponse.md)

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

<a id="qSDataManagerSearchEntityData"></a>
# **qSDataManagerSearchEntityData**
> Qspmdatamanagerv3SearchEntityDataResponse qSDataManagerSearchEntityData(qspmdatamanagerv3SearchEntityDataRequest)

Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QsDataManagerApi;

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

    QsDataManagerApi apiInstance = new QsDataManagerApi(defaultClient);
    Qspmdatamanagerv3SearchEntityDataRequest qspmdatamanagerv3SearchEntityDataRequest = new Qspmdatamanagerv3SearchEntityDataRequest(); // Qspmdatamanagerv3SearchEntityDataRequest | 
    try {
      Qspmdatamanagerv3SearchEntityDataResponse result = apiInstance.qSDataManagerSearchEntityData(qspmdatamanagerv3SearchEntityDataRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataManagerApi#qSDataManagerSearchEntityData");
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
| **qspmdatamanagerv3SearchEntityDataRequest** | [**Qspmdatamanagerv3SearchEntityDataRequest**](Qspmdatamanagerv3SearchEntityDataRequest.md)|  | |

### Return type

[**Qspmdatamanagerv3SearchEntityDataResponse**](Qspmdatamanagerv3SearchEntityDataResponse.md)

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

<a id="qSDataManagerUpdateNetLocation"></a>
# **qSDataManagerUpdateNetLocation**
> Qspmdatamanagerv3UpdateNetLocResponse qSDataManagerUpdateNetLocation(qspmdatamanagerv3UpdateNetLocRequest)

Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.QsDataManagerApi;

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

    QsDataManagerApi apiInstance = new QsDataManagerApi(defaultClient);
    Qspmdatamanagerv3UpdateNetLocRequest qspmdatamanagerv3UpdateNetLocRequest = new Qspmdatamanagerv3UpdateNetLocRequest(); // Qspmdatamanagerv3UpdateNetLocRequest | 
    try {
      Qspmdatamanagerv3UpdateNetLocResponse result = apiInstance.qSDataManagerUpdateNetLocation(qspmdatamanagerv3UpdateNetLocRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataManagerApi#qSDataManagerUpdateNetLocation");
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
| **qspmdatamanagerv3UpdateNetLocRequest** | [**Qspmdatamanagerv3UpdateNetLocRequest**](Qspmdatamanagerv3UpdateNetLocRequest.md)|  | |

### Return type

[**Qspmdatamanagerv3UpdateNetLocResponse**](Qspmdatamanagerv3UpdateNetLocResponse.md)

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

