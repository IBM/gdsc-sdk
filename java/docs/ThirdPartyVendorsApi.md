# ThirdPartyVendorsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLinkedVendor**](ThirdPartyVendorsApi.md#getLinkedVendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/cloudAccounts | Get additional details of a specific third party vendor |
| [**getSingleLinkedVendor**](ThirdPartyVendorsApi.md#getSingleLinkedVendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId} | Get the third party vendors list |
| [**listLinkedVendorDataStores**](ThirdPartyVendorsApi.md#listLinkedVendorDataStores) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/dataStores | Get the data stores associated with a third party vendor |
| [**listLinkedVendors**](ThirdPartyVendorsApi.md#listLinkedVendors) | **GET** /api/v1/dspm/linkedVendors | Get the summary of a third party vendor |
| [**listTrustedAssets**](ThirdPartyVendorsApi.md#listTrustedAssets) | **GET** /api/v1/dspm/linkedVendors/trustedAssets | Get a list of all the actual trusted assets |


<a id="getLinkedVendor"></a>
# **getLinkedVendor**
> List&lt;VendorSummary&gt; getLinkedVendor(vendorId)

Get additional details of a specific third party vendor

Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.ThirdPartyVendorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ThirdPartyVendorsApi apiInstance = new ThirdPartyVendorsApi(defaultClient);
    String vendorId = "123456789101"; // String | The third party vendor's account ID
    try {
      List<VendorSummary> result = apiInstance.getLinkedVendor(vendorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyVendorsApi#getLinkedVendor");
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
| **vendorId** | **String**| The third party vendor&#39;s account ID | |

### Return type

[**List&lt;VendorSummary&gt;**](VendorSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **503** | Service Unavailable |  -  |

<a id="getSingleLinkedVendor"></a>
# **getSingleLinkedVendor**
> LinkedVendor getSingleLinkedVendor(vendorId)

Get the third party vendors list

Get details about a third party vendor.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.ThirdPartyVendorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ThirdPartyVendorsApi apiInstance = new ThirdPartyVendorsApi(defaultClient);
    String vendorId = "123456789101"; // String | vendor id
    try {
      LinkedVendor result = apiInstance.getSingleLinkedVendor(vendorId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyVendorsApi#getSingleLinkedVendor");
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
| **vendorId** | **String**| vendor id | |

### Return type

[**LinkedVendor**](LinkedVendor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="listLinkedVendorDataStores"></a>
# **listLinkedVendorDataStores**
> ListLinkedVendorDataStores200Response listLinkedVendorDataStores(vendorId, filter, sort, pageSize, nextToken)

Get the data stores associated with a third party vendor

Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.ThirdPartyVendorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ThirdPartyVendorsApi apiInstance = new ThirdPartyVendorsApi(defaultClient);
    String vendorId = "123456789101"; // String | The third party vendor's account ID
    ListVendorDataStoresFilterParameter filter = new ListVendorDataStoresFilterParameter(); // ListVendorDataStoresFilterParameter | 
    ListLinkedVendorDataStoresSortParameter sort = new ListLinkedVendorDataStoresSortParameter(); // ListLinkedVendorDataStoresSortParameter | 
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | 
    String nextToken = "nextToken_example"; // String | 
    try {
      ListLinkedVendorDataStores200Response result = apiInstance.listLinkedVendorDataStores(vendorId, filter, sort, pageSize, nextToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyVendorsApi#listLinkedVendorDataStores");
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
| **vendorId** | **String**| The third party vendor&#39;s account ID | |
| **filter** | [**ListVendorDataStoresFilterParameter**](.md)|  | [optional] |
| **sort** | [**ListLinkedVendorDataStoresSortParameter**](.md)|  | [optional] |
| **pageSize** | **BigDecimal**|  | [optional] |
| **nextToken** | **String**|  | [optional] |

### Return type

[**ListLinkedVendorDataStores200Response**](ListLinkedVendorDataStores200Response.md)

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

<a id="listLinkedVendors"></a>
# **listLinkedVendors**
> List&lt;LinkedVendor&gt; listLinkedVendors()

Get the summary of a third party vendor

Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium DSPM only).

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.ThirdPartyVendorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ThirdPartyVendorsApi apiInstance = new ThirdPartyVendorsApi(defaultClient);
    try {
      List<LinkedVendor> result = apiInstance.listLinkedVendors();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyVendorsApi#listLinkedVendors");
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

[**List&lt;LinkedVendor&gt;**](LinkedVendor.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="listTrustedAssets"></a>
# **listTrustedAssets**
> List&lt;Trustee&gt; listTrustedAssets(filter)

Get a list of all the actual trusted assets

Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium DSPM.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.ThirdPartyVendorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    ThirdPartyVendorsApi apiInstance = new ThirdPartyVendorsApi(defaultClient);
    ListTrusteesFilterParameter filter = new ListTrusteesFilterParameter(); // ListTrusteesFilterParameter | 
    try {
      List<Trustee> result = apiInstance.listTrustedAssets(filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ThirdPartyVendorsApi#listTrustedAssets");
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
| **filter** | [**ListTrusteesFilterParameter**](.md)|  | [optional] |

### Return type

[**List&lt;Trustee&gt;**](Trustee.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

