# QsDataLoaderApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**qSDataLoaderQSfileValidator**](QsDataLoaderApi.md#qSDataLoaderQSfileValidator) | **POST** /api/v3/data/validation | QSfileValidator - validate the files before insert happend . |
| [**qSDataLoaderUploadSyntheticDataLoader**](QsDataLoaderApi.md#qSDataLoaderUploadSyntheticDataLoader) | **POST** /api/v3/data/synthetic | UploadSyntheticDataLoader - Insert data into Db after read from .sql file . |


<a id="qSDataLoaderQSfileValidator"></a>
# **qSDataLoaderQSfileValidator**
> Qsdataloaderv3QSfileValidatorResonse qSDataLoaderQSfileValidator(qsdataloaderv3QSfileValidatorRequest)

QSfileValidator - validate the files before insert happend .

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsDataLoaderApi;

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

    QsDataLoaderApi apiInstance = new QsDataLoaderApi(defaultClient);
    Qsdataloaderv3QSfileValidatorRequest qsdataloaderv3QSfileValidatorRequest = new Qsdataloaderv3QSfileValidatorRequest(); // Qsdataloaderv3QSfileValidatorRequest | 
    try {
      Qsdataloaderv3QSfileValidatorResonse result = apiInstance.qSDataLoaderQSfileValidator(qsdataloaderv3QSfileValidatorRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataLoaderApi#qSDataLoaderQSfileValidator");
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
| **qsdataloaderv3QSfileValidatorRequest** | [**Qsdataloaderv3QSfileValidatorRequest**](Qsdataloaderv3QSfileValidatorRequest.md)|  | |

### Return type

[**Qsdataloaderv3QSfileValidatorResonse**](Qsdataloaderv3QSfileValidatorResonse.md)

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

<a id="qSDataLoaderUploadSyntheticDataLoader"></a>
# **qSDataLoaderUploadSyntheticDataLoader**
> Qsdataloaderv3QSyntheticDataLoaderResonse qSDataLoaderUploadSyntheticDataLoader(body)

UploadSyntheticDataLoader - Insert data into Db after read from .sql file .

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.QsDataLoaderApi;

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

    QsDataLoaderApi apiInstance = new QsDataLoaderApi(defaultClient);
    Object body = null; // Object | 
    try {
      Qsdataloaderv3QSyntheticDataLoaderResonse result = apiInstance.qSDataLoaderUploadSyntheticDataLoader(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QsDataLoaderApi#qSDataLoaderUploadSyntheticDataLoader");
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

[**Qsdataloaderv3QSyntheticDataLoaderResonse**](Qsdataloaderv3QSyntheticDataLoaderResonse.md)

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

