# QsDataManagerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qSDataManagerGetMasterData**](QsDataManagerApi.md#qSDataManagerGetMasterData) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data. |
| [**qSDataManagerGetPluginData**](QsDataManagerApi.md#qSDataManagerGetPluginData) | **GET** /api/v3/datamanager/plugin | Summary: Plugins Details Description: Retrieves All plugins information. |
| [**qSDataManagerRegisterScan**](QsDataManagerApi.md#qSDataManagerRegisterScan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table. |
| [**qSDataManagerRetrieveScan**](QsDataManagerApi.md#qSDataManagerRetrieveScan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table. |


<a id="qSDataManagerGetMasterData"></a>
# **qSDataManagerGetMasterData**
> Qspmdatamanagerv3MasterDataResponse qSDataManagerGetMasterData()

Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsDataManagerApi;

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

<a id="qSDataManagerGetPluginData"></a>
# **qSDataManagerGetPluginData**
> Qspmdatamanagerv3PluginDataResponse qSDataManagerGetPluginData()

Summary: Plugins Details Description: Retrieves All plugins information.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsDataManagerApi;

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
      Qspmdatamanagerv3PluginDataResponse result = apiInstance.qSDataManagerGetPluginData();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataManagerApi#qSDataManagerGetPluginData");
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

[**Qspmdatamanagerv3PluginDataResponse**](Qspmdatamanagerv3PluginDataResponse.md)

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

<a id="qSDataManagerRegisterScan"></a>
# **qSDataManagerRegisterScan**
> Qspmdatamanagerv3ScanResponse qSDataManagerRegisterScan(qspmdatamanagerv3ScanRequest)

Summary: Insert ScanDetails Description: Register new data into scan dimension table.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsDataManagerApi;

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
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsDataManagerApi;

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

