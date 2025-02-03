# CloudAccountsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAnalyzedRegion**](CloudAccountsApi.md#addAnalyzedRegion) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions | Add a new region for data classification |
| [**addCloudAccounts**](CloudAccountsApi.md#addCloudAccounts) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders | Add cloud account connections to Guardium Insights SaaS DSPM |
| [**generateAtlassianConfluenceAuthUrl**](CloudAccountsApi.md#generateAtlassianConfluenceAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-confluence/generateAuthUrl | Generate a Confluence authentication URL |
| [**generateAtlassianJiraAuthUrl**](CloudAccountsApi.md#generateAtlassianJiraAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-jira/generateAuthUrl | Generate a JIRA authentication URL |
| [**generateAzureAuthUrl**](CloudAccountsApi.md#generateAzureAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/azure/generateAuthUrl | Generate azure authorization url |
| [**generateOffice365AuthUrl**](CloudAccountsApi.md#generateOffice365AuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/office365/generateAuthUrl | Generate a Microsoft 365 consent URL |
| [**generateSalesforceAuthUrl**](CloudAccountsApi.md#generateSalesforceAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/salesforce/generateAuthUrl | Generate a Salesforce consent URL |
| [**generateSlackAuthUrl**](CloudAccountsApi.md#generateSlackAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/slack/generateAuthUrl | Generate a Slack authentication URL |
| [**getAnalyzedRegionStatus**](CloudAccountsApi.md#getAnalyzedRegionStatus) | **GET** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions/status | Get the status of analyzer installation for a region |
| [**getAzureAdminConsentStatus**](CloudAccountsApi.md#getAzureAdminConsentStatus) | **GET** /api/v1/dspm/cloudAccounts/azure/getAdminConsentStatus | Get Azure admin consent status |
| [**getCloudAccountInstallationStatus**](CloudAccountsApi.md#getCloudAccountInstallationStatus) | **GET** /api/v1/dspm/cloudAccounts/{cloudProvider}/{cloudAccountId}/installationStatus | Get the installation status of a cloud account |
| [**getCompliances**](CloudAccountsApi.md#getCompliances) | **GET** /api/v1/dspm/cloudAccounts/compliances | Get a list of selected compliances |
| [**listLinkedAccounts**](CloudAccountsApi.md#listLinkedAccounts) | **GET** /api/v1/dspm/cloudAccounts/linkedAccounts | List cloud accounts connected to Guardium Insights SaaS DSPM |
| [**removeAccounts**](CloudAccountsApi.md#removeAccounts) | **DELETE** /api/v1/dspm/cloudAccounts/removeAccounts | Post cloud account ID connections to be removed |
| [**removeAccountsInstructions**](CloudAccountsApi.md#removeAccountsInstructions) | **GET** /api/v1/dspm/cloudAccounts/removeAccountsInstructions | Post cloud account IDs and get instructions to remove the accounts |
| [**retrieveServiceAccountId**](CloudAccountsApi.md#retrieveServiceAccountId) | **GET** /api/v1/dspm/cloudAccounts/saasApps/google/retrieveServiceAccountId | Get Google Workspace authentication |
| [**setCompliances**](CloudAccountsApi.md#setCompliances) | **POST** /api/v1/dspm/cloudAccounts/compliances | Set a list of selected compliances |
| [**submitGoogleWorkspaceAdminEmail**](CloudAccountsApi.md#submitGoogleWorkspaceAdminEmail) | **POST** /api/v1/dspm/cloudAccounts/saasApps/google/submitAdminEmail | Submit email for service account authorization |
| [**submitOffice365TenantInfo**](CloudAccountsApi.md#submitOffice365TenantInfo) | **POST** /api/v1/dspm/cloudAccounts/saasApps/office365/submitTenantInfo | Submit Microsoft 365 customer information |
| [**submitSalesforceAuthCode**](CloudAccountsApi.md#submitSalesforceAuthCode) | **POST** /api/v1/dspm/cloudAccounts/saasApps/salesforce/submitAuthCodeInfo | Submit Salesforce customer information |
| [**submitSlackAuthCode**](CloudAccountsApi.md#submitSlackAuthCode) | **POST** /api/v1/dspm/cloudAccounts/saasApps/slack/submitAuthCode | Submit a Slack authentication code |


<a id="addAnalyzedRegion"></a>
# **addAnalyzedRegion**
> AddAnalyzedRegion200Response addAnalyzedRegion(addAnalyzedRegionRequest)

Add a new region for data classification

Install a new analyzer in the specified region to enable data classification in that region.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    AddAnalyzedRegionRequest addAnalyzedRegionRequest = new AddAnalyzedRegionRequest(); // AddAnalyzedRegionRequest | 
    try {
      AddAnalyzedRegion200Response result = apiInstance.addAnalyzedRegion(addAnalyzedRegionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#addAnalyzedRegion");
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
| **addAnalyzedRegionRequest** | [**AddAnalyzedRegionRequest**](AddAnalyzedRegionRequest.md)|  | |

### Return type

[**AddAnalyzedRegion200Response**](AddAnalyzedRegion200Response.md)

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

<a id="addCloudAccounts"></a>
# **addCloudAccounts**
> AddCloudAccounts200Response addCloudAccounts(addCloudAccountsRequest)

Add cloud account connections to Guardium Insights SaaS DSPM

You can add a single or multiple cloud account connections from the same cloud provider.&lt;BR&gt;Adding these cloud account connections will trigger Guardium Insights SaaS DSPM for data store discovery.&lt;BR&gt;To enable data classification, run the &#39;Add a new region for data classification&#39; API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    AddCloudAccountsRequest addCloudAccountsRequest = new AddCloudAccountsRequest(); // AddCloudAccountsRequest | 
    try {
      AddCloudAccounts200Response result = apiInstance.addCloudAccounts(addCloudAccountsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#addCloudAccounts");
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
| **addCloudAccountsRequest** | [**AddCloudAccountsRequest**](AddCloudAccountsRequest.md)|  | |

### Return type

[**AddCloudAccounts200Response**](AddCloudAccounts200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="generateAtlassianConfluenceAuthUrl"></a>
# **generateAtlassianConfluenceAuthUrl**
> AuthUrl generateAtlassianConfluenceAuthUrl()

Generate a Confluence authentication URL

Generate an Atlassian authentication URL for Confluence integration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    try {
      AuthUrl result = apiInstance.generateAtlassianConfluenceAuthUrl();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#generateAtlassianConfluenceAuthUrl");
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

[**AuthUrl**](AuthUrl.md)

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

<a id="generateAtlassianJiraAuthUrl"></a>
# **generateAtlassianJiraAuthUrl**
> AuthUrl generateAtlassianJiraAuthUrl()

Generate a JIRA authentication URL

Generate an Atlassian authentication URL for JIRA integration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    try {
      AuthUrl result = apiInstance.generateAtlassianJiraAuthUrl();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#generateAtlassianJiraAuthUrl");
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

[**AuthUrl**](AuthUrl.md)

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

<a id="generateAzureAuthUrl"></a>
# **generateAzureAuthUrl**
> AuthUrl generateAzureAuthUrl(tenantId)

Generate azure authorization url

Generate azure authorization url.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    String tenantId = "tenantId_example"; // String | Tenant Id of the new Azure account, GUID format.
    try {
      AuthUrl result = apiInstance.generateAzureAuthUrl(tenantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#generateAzureAuthUrl");
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
| **tenantId** | **String**| Tenant Id of the new Azure account, GUID format. | [optional] |

### Return type

[**AuthUrl**](AuthUrl.md)

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

<a id="generateOffice365AuthUrl"></a>
# **generateOffice365AuthUrl**
> AuthUrl generateOffice365AuthUrl()

Generate a Microsoft 365 consent URL

Generate an administrator consent URL for Microsoft 365 integration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    try {
      AuthUrl result = apiInstance.generateOffice365AuthUrl();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#generateOffice365AuthUrl");
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

[**AuthUrl**](AuthUrl.md)

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

<a id="generateSalesforceAuthUrl"></a>
# **generateSalesforceAuthUrl**
> AuthUrl generateSalesforceAuthUrl()

Generate a Salesforce consent URL

Generate an administrator consent URL for Salesforce integration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    try {
      AuthUrl result = apiInstance.generateSalesforceAuthUrl();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#generateSalesforceAuthUrl");
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

[**AuthUrl**](AuthUrl.md)

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

<a id="generateSlackAuthUrl"></a>
# **generateSlackAuthUrl**
> AuthUrl generateSlackAuthUrl()

Generate a Slack authentication URL

Generate a Slack authentication URL.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    try {
      AuthUrl result = apiInstance.generateSlackAuthUrl();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#generateSlackAuthUrl");
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

[**AuthUrl**](AuthUrl.md)

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

<a id="getAnalyzedRegionStatus"></a>
# **getAnalyzedRegionStatus**
> GetAnalyzedRegionStatus200Response getAnalyzedRegionStatus(cloudProvider, region)

Get the status of analyzer installation for a region

Get the installation status of Guardium Insights SaaS DSPM for a region.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    CloudServiceProvider cloudProvider = CloudServiceProvider.fromValue("aws"); // CloudServiceProvider | The cloud provider for the cloud account
    String region = "europe-west1"; // String | The region code
    try {
      GetAnalyzedRegionStatus200Response result = apiInstance.getAnalyzedRegionStatus(cloudProvider, region);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#getAnalyzedRegionStatus");
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
| **cloudProvider** | [**CloudServiceProvider**](.md)| The cloud provider for the cloud account | [enum: aws, gcp, azure] |
| **region** | **String**| The region code | |

### Return type

[**GetAnalyzedRegionStatus200Response**](GetAnalyzedRegionStatus200Response.md)

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

<a id="getAzureAdminConsentStatus"></a>
# **getAzureAdminConsentStatus**
> Boolean getAzureAdminConsentStatus()

Get Azure admin consent status

Get Azure admin consent status.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    try {
      Boolean result = apiInstance.getAzureAdminConsentStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#getAzureAdminConsentStatus");
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

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | true if the customer has granted admin permissions, false otherwise |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="getCloudAccountInstallationStatus"></a>
# **getCloudAccountInstallationStatus**
> CloudAccountInstallationStatus getCloudAccountInstallationStatus(cloudProvider, cloudAccountId)

Get the installation status of a cloud account

Get the installation status of a cloud account.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    CloudServiceProvider cloudProvider = CloudServiceProvider.fromValue("aws"); // CloudServiceProvider | The cloud provider of the cloud account
    String cloudAccountId = "12345678910"; // String | The cloud account identifier
    try {
      CloudAccountInstallationStatus result = apiInstance.getCloudAccountInstallationStatus(cloudProvider, cloudAccountId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#getCloudAccountInstallationStatus");
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
| **cloudProvider** | [**CloudServiceProvider**](.md)| The cloud provider of the cloud account | [enum: aws, gcp, azure] |
| **cloudAccountId** | **String**| The cloud account identifier | |

### Return type

[**CloudAccountInstallationStatus**](CloudAccountInstallationStatus.md)

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

<a id="getCompliances"></a>
# **getCompliances**
> List&lt;Compliance&gt; getCompliances()

Get a list of selected compliances

List the compliance frameworks selected.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    try {
      List<Compliance> result = apiInstance.getCompliances();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#getCompliances");
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

[**List&lt;Compliance&gt;**](Compliance.md)

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

<a id="listLinkedAccounts"></a>
# **listLinkedAccounts**
> List&lt;LinkedAccounts&gt; listLinkedAccounts()

List cloud accounts connected to Guardium Insights SaaS DSPM

Get a list of all the connected cloud accounts monitored by Guardium Insights SaaS DSPM.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    try {
      List<LinkedAccounts> result = apiInstance.listLinkedAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#listLinkedAccounts");
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

[**List&lt;LinkedAccounts&gt;**](LinkedAccounts.md)

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

<a id="removeAccounts"></a>
# **removeAccounts**
> removeAccounts(accountIds, serviceProvider)

Post cloud account ID connections to be removed

Post cloud account ID connections to be removed from Guardium Insights SaaS DSPM.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    List<String> accountIds = Arrays.asList(); // List<String> | 
    ServiceProvider serviceProvider = ServiceProvider.fromValue("aws"); // ServiceProvider | 
    try {
      apiInstance.removeAccounts(accountIds, serviceProvider);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#removeAccounts");
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
| **accountIds** | [**List&lt;String&gt;**](String.md)|  | |
| **serviceProvider** | [**ServiceProvider**](.md)|  | [enum: aws, gcp, azure, google-workspace, slack, office365, atlassian-jira, atlassian-confluence, salesforce] |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **404** | Not Found |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="removeAccountsInstructions"></a>
# **removeAccountsInstructions**
> RemoveAccountsInstructions200Response removeAccountsInstructions(accountIds, serviceProvider)

Post cloud account IDs and get instructions to remove the accounts

Post cloud accounts IDs and get instructions to remove the accounts from the cloud service provider.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    List<String> accountIds = Arrays.asList(); // List<String> | 
    ServiceProvider serviceProvider = ServiceProvider.fromValue("aws"); // ServiceProvider | 
    try {
      RemoveAccountsInstructions200Response result = apiInstance.removeAccountsInstructions(accountIds, serviceProvider);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#removeAccountsInstructions");
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
| **accountIds** | [**List&lt;String&gt;**](String.md)|  | |
| **serviceProvider** | [**ServiceProvider**](.md)|  | [enum: aws, gcp, azure, google-workspace, slack, office365, atlassian-jira, atlassian-confluence, salesforce] |

### Return type

[**RemoveAccountsInstructions200Response**](RemoveAccountsInstructions200Response.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | string |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **404** | Not Found |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

<a id="retrieveServiceAccountId"></a>
# **retrieveServiceAccountId**
> ServiceAccountClientId retrieveServiceAccountId()

Get Google Workspace authentication

Retrieve a service account ID to use it for Google Workspace authentication.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    try {
      ServiceAccountClientId result = apiInstance.retrieveServiceAccountId();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#retrieveServiceAccountId");
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

[**ServiceAccountClientId**](ServiceAccountClientId.md)

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

<a id="setCompliances"></a>
# **setCompliances**
> Object setCompliances(compliance)

Set a list of selected compliances

Select one or more compliance frameworks.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    List<Compliance> compliance = Arrays.asList(); // List<Compliance> | 
    try {
      Object result = apiInstance.setCompliances(compliance);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#setCompliances");
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
| **compliance** | [**List&lt;Compliance&gt;**](Compliance.md)|  | |

### Return type

**Object**

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

<a id="submitGoogleWorkspaceAdminEmail"></a>
# **submitGoogleWorkspaceAdminEmail**
> ServiceAccountInstallationStatus submitGoogleWorkspaceAdminEmail(submitAdminEmailParams)

Submit email for service account authorization

Submit admin email for service account authorization and return service-account authorization status.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    SubmitAdminEmailParams submitAdminEmailParams = new SubmitAdminEmailParams(); // SubmitAdminEmailParams | 
    try {
      ServiceAccountInstallationStatus result = apiInstance.submitGoogleWorkspaceAdminEmail(submitAdminEmailParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#submitGoogleWorkspaceAdminEmail");
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
| **submitAdminEmailParams** | [**SubmitAdminEmailParams**](SubmitAdminEmailParams.md)|  | |

### Return type

[**ServiceAccountInstallationStatus**](ServiceAccountInstallationStatus.md)

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

<a id="submitOffice365TenantInfo"></a>
# **submitOffice365TenantInfo**
> Office365TenantInfo submitOffice365TenantInfo(tenantInfo)

Submit Microsoft 365 customer information

Submit customer information for Microsoft 365 integration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    TenantInfo tenantInfo = new TenantInfo(); // TenantInfo | 
    try {
      Office365TenantInfo result = apiInstance.submitOffice365TenantInfo(tenantInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#submitOffice365TenantInfo");
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
| **tenantInfo** | [**TenantInfo**](TenantInfo.md)|  | |

### Return type

[**Office365TenantInfo**](Office365TenantInfo.md)

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

<a id="submitSalesforceAuthCode"></a>
# **submitSalesforceAuthCode**
> submitSalesforceAuthCode(authCode)

Submit Salesforce customer information

Submit customer information for Salesforce integration.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    AuthCode authCode = new AuthCode(); // AuthCode | 
    try {
      apiInstance.submitSalesforceAuthCode(authCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#submitSalesforceAuthCode");
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
| **authCode** | [**AuthCode**](AuthCode.md)|  | |

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
| **403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
| **503** | Service Unavailable |  -  |

<a id="submitSlackAuthCode"></a>
# **submitSlackAuthCode**
> Object submitSlackAuthCode(submitAuthCode)

Submit a Slack authentication code

Submit a Slack authentication code.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CloudAccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: ApiKeyAuth
    ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
    ApiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKeyAuth.setApiKeyPrefix("Token");

    CloudAccountsApi apiInstance = new CloudAccountsApi(defaultClient);
    SubmitAuthCode submitAuthCode = new SubmitAuthCode(); // SubmitAuthCode | 
    try {
      Object result = apiInstance.submitSlackAuthCode(submitAuthCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudAccountsApi#submitSlackAuthCode");
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
| **submitAuthCode** | [**SubmitAuthCode**](SubmitAuthCode.md)|  | |

### Return type

**Object**

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

