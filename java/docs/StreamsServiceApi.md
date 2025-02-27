# StreamsServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**streamsServiceCheckAWSCredentials**](StreamsServiceApi.md#streamsServiceCheckAWSCredentials) | **POST** /api/v3/streams/credentials | Summary: Check AWS credentials Description: Service to verify AWS credentials. |
| [**streamsServiceCheckAzureEventHub**](StreamsServiceApi.md#streamsServiceCheckAzureEventHub) | **POST** /api/v3/streams/azure_eventhub | Summary: Check Azure event hub Description: Service to check Azure event hub. |
| [**streamsServiceCheckAzureStorageString**](StreamsServiceApi.md#streamsServiceCheckAzureStorageString) | **POST** /api/v3/streams/azure_storage | Summary: Check Azure storage string Description: Service to verify Azure storage connection. |
| [**streamsServiceGetAWSRegions**](StreamsServiceApi.md#streamsServiceGetAWSRegions) | **GET** /api/v3/streams/regions | Summary: Get AWS regions Description: Service to get AWS regions. |
| [**streamsServiceListAWSStreams**](StreamsServiceApi.md#streamsServiceListAWSStreams) | **POST** /api/v3/streams | Summary: List AWS streams Description: Service to list AWS Kinesis streams. |


<a id="streamsServiceCheckAWSCredentials"></a>
# **streamsServiceCheckAWSCredentials**
> Streamsv3CheckAWSCredentialsResponse streamsServiceCheckAWSCredentials(streamsv3CheckAWSCredentialsRequest)

Summary: Check AWS credentials Description: Service to verify AWS credentials.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.StreamsServiceApi;

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

    StreamsServiceApi apiInstance = new StreamsServiceApi(defaultClient);
    Streamsv3CheckAWSCredentialsRequest streamsv3CheckAWSCredentialsRequest = new Streamsv3CheckAWSCredentialsRequest(); // Streamsv3CheckAWSCredentialsRequest | 
    try {
      Streamsv3CheckAWSCredentialsResponse result = apiInstance.streamsServiceCheckAWSCredentials(streamsv3CheckAWSCredentialsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsServiceApi#streamsServiceCheckAWSCredentials");
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
| **streamsv3CheckAWSCredentialsRequest** | [**Streamsv3CheckAWSCredentialsRequest**](Streamsv3CheckAWSCredentialsRequest.md)|  | |

### Return type

[**Streamsv3CheckAWSCredentialsResponse**](Streamsv3CheckAWSCredentialsResponse.md)

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

<a id="streamsServiceCheckAzureEventHub"></a>
# **streamsServiceCheckAzureEventHub**
> Streamsv3CheckAzureEventHubResponse streamsServiceCheckAzureEventHub(streamsv3CheckAzureEventHubRequest)

Summary: Check Azure event hub Description: Service to check Azure event hub.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.StreamsServiceApi;

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

    StreamsServiceApi apiInstance = new StreamsServiceApi(defaultClient);
    Streamsv3CheckAzureEventHubRequest streamsv3CheckAzureEventHubRequest = new Streamsv3CheckAzureEventHubRequest(); // Streamsv3CheckAzureEventHubRequest | 
    try {
      Streamsv3CheckAzureEventHubResponse result = apiInstance.streamsServiceCheckAzureEventHub(streamsv3CheckAzureEventHubRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsServiceApi#streamsServiceCheckAzureEventHub");
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
| **streamsv3CheckAzureEventHubRequest** | [**Streamsv3CheckAzureEventHubRequest**](Streamsv3CheckAzureEventHubRequest.md)|  | |

### Return type

[**Streamsv3CheckAzureEventHubResponse**](Streamsv3CheckAzureEventHubResponse.md)

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

<a id="streamsServiceCheckAzureStorageString"></a>
# **streamsServiceCheckAzureStorageString**
> Streamsv3CheckAzureStorageStringResponse streamsServiceCheckAzureStorageString(streamsv3CheckAzureStorageStringRequest)

Summary: Check Azure storage string Description: Service to verify Azure storage connection.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.StreamsServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    StreamsServiceApi apiInstance = new StreamsServiceApi(defaultClient);
    Streamsv3CheckAzureStorageStringRequest streamsv3CheckAzureStorageStringRequest = new Streamsv3CheckAzureStorageStringRequest(); // Streamsv3CheckAzureStorageStringRequest | 
    try {
      Streamsv3CheckAzureStorageStringResponse result = apiInstance.streamsServiceCheckAzureStorageString(streamsv3CheckAzureStorageStringRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsServiceApi#streamsServiceCheckAzureStorageString");
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
| **streamsv3CheckAzureStorageStringRequest** | [**Streamsv3CheckAzureStorageStringRequest**](Streamsv3CheckAzureStorageStringRequest.md)|  | |

### Return type

[**Streamsv3CheckAzureStorageStringResponse**](Streamsv3CheckAzureStorageStringResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="streamsServiceGetAWSRegions"></a>
# **streamsServiceGetAWSRegions**
> Streamsv3GetAWSRegionsResponse streamsServiceGetAWSRegions()

Summary: Get AWS regions Description: Service to get AWS regions.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.StreamsServiceApi;

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

    StreamsServiceApi apiInstance = new StreamsServiceApi(defaultClient);
    try {
      Streamsv3GetAWSRegionsResponse result = apiInstance.streamsServiceGetAWSRegions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsServiceApi#streamsServiceGetAWSRegions");
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

[**Streamsv3GetAWSRegionsResponse**](Streamsv3GetAWSRegionsResponse.md)

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

<a id="streamsServiceListAWSStreams"></a>
# **streamsServiceListAWSStreams**
> Streamsv3ListAWSStreamsResponse streamsServiceListAWSStreams(streamsv3ListAWSStreamsRequest)

Summary: List AWS streams Description: Service to list AWS Kinesis streams.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.StreamsServiceApi;

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

    StreamsServiceApi apiInstance = new StreamsServiceApi(defaultClient);
    Streamsv3ListAWSStreamsRequest streamsv3ListAWSStreamsRequest = new Streamsv3ListAWSStreamsRequest(); // Streamsv3ListAWSStreamsRequest | 
    try {
      Streamsv3ListAWSStreamsResponse result = apiInstance.streamsServiceListAWSStreams(streamsv3ListAWSStreamsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StreamsServiceApi#streamsServiceListAWSStreams");
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
| **streamsv3ListAWSStreamsRequest** | [**Streamsv3ListAWSStreamsRequest**](Streamsv3ListAWSStreamsRequest.md)|  | |

### Return type

[**Streamsv3ListAWSStreamsResponse**](Streamsv3ListAWSStreamsResponse.md)

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

