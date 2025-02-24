# DataSensitivitiesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSensitivitiesSummary**](DataSensitivitiesApi.md#getSensitivitiesSummary) | **GET** /api/v1/dspm/sensitivities/summary | Get the summary of sensitivities |
| [**getSensitivity**](DataSensitivitiesApi.md#getSensitivity) | **GET** /api/v1/dspm/sensitivities/{sensitivityId} | Get sensitivity details by providing its ID |
| [**listSensitivities**](DataSensitivitiesApi.md#listSensitivities) | **GET** /api/v1/dspm/sensitivities | List sensitivities |


<a id="getSensitivitiesSummary"></a>
# **getSensitivitiesSummary**
> SensitivitiesSummary getSensitivitiesSummary(filter)

Get the summary of sensitivities

Get a summarised information about all sensitivities classified by Guardium DSPM.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataSensitivitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataSensitivitiesApi apiInstance = new DataSensitivitiesApi(defaultClient);
    ListSensitivitiesFilterParameter filter = new ListSensitivitiesFilterParameter(); // ListSensitivitiesFilterParameter | 
    try {
      SensitivitiesSummary result = apiInstance.getSensitivitiesSummary(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataSensitivitiesApi#getSensitivitiesSummary");
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
| **filter** | [**ListSensitivitiesFilterParameter**](.md)|  | [optional] |

### Return type

[**SensitivitiesSummary**](SensitivitiesSummary.md)

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

<a id="getSensitivity"></a>
# **getSensitivity**
> Sensitivity getSensitivity(sensitivityId)

Get sensitivity details by providing its ID

Get details of a sensitivity by providing its ID.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataSensitivitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataSensitivitiesApi apiInstance = new DataSensitivitiesApi(defaultClient);
    String sensitivityId = "sensitivityId_example"; // String | 
    try {
      Sensitivity result = apiInstance.getSensitivity(sensitivityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataSensitivitiesApi#getSensitivity");
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
| **sensitivityId** | **String**|  | |

### Return type

[**Sensitivity**](Sensitivity.md)

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

<a id="listSensitivities"></a>
# **listSensitivities**
> ListSensitivities200Response listSensitivities(filter, sort, pageSize, nextToken)

List sensitivities

Get a list of all the sensitivities based on an applied filter.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.DataSensitivitiesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    DataSensitivitiesApi apiInstance = new DataSensitivitiesApi(defaultClient);
    ListSensitivitiesFilterParameter filter = new ListSensitivitiesFilterParameter(); // ListSensitivitiesFilterParameter | 
    LastSeenSortSchema sort = new LastSeenSortSchema(); // LastSeenSortSchema | 
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      ListSensitivities200Response result = apiInstance.listSensitivities(filter, sort, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataSensitivitiesApi#listSensitivities");
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
| **filter** | [**ListSensitivitiesFilterParameter**](.md)|  | [optional] |
| **sort** | [**LastSeenSortSchema**](.md)|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **nextToken** | **String**|  | [optional] |

### Return type

[**ListSensitivities200Response**](ListSensitivities200Response.md)

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

