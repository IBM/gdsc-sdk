# TemplatesServiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**templatesServiceCreateIntegration**](TemplatesServiceApi.md#templatesServiceCreateIntegration) | **POST** /api/v3/templates/integration | Summary: Create integration Description: Create a set of new templates for a new integration. |
| [**templatesServiceCreateTemplate**](TemplatesServiceApi.md#templatesServiceCreateTemplate) | **POST** /api/v3/templates | Summary: Create template Description: Create a new template. |
| [**templatesServiceDeleteIntegration**](TemplatesServiceApi.md#templatesServiceDeleteIntegration) | **DELETE** /api/v3/templates/integrations/{integration_id} | Summary: Delete integration Description: Delete all templates associated with an integration. |
| [**templatesServiceDeleteTemplate**](TemplatesServiceApi.md#templatesServiceDeleteTemplate) | **DELETE** /api/v3/templates/{template_id} | Summary: Delete template Description: Delete a specific template. |
| [**templatesServiceGetOriginDefaultContent**](TemplatesServiceApi.md#templatesServiceGetOriginDefaultContent) | **GET** /api/v3/templates/origins/{origin}/content | Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type. |
| [**templatesServiceGetOriginFields**](TemplatesServiceApi.md#templatesServiceGetOriginFields) | **GET** /api/v3/templates/origins/{origin}/fields | Summary: Get origin fields Description: Return the fields available with a specific origin. |
| [**templatesServiceGetTemplate**](TemplatesServiceApi.md#templatesServiceGetTemplate) | **GET** /api/v3/templates/{template_id} | Summary: Get template Description: Return a specific template by id. |
| [**templatesServiceGetTemplates**](TemplatesServiceApi.md#templatesServiceGetTemplates) | **GET** /api/v3/templates | Summary: Get templates Description: Return all templates based on supplied filters. |
| [**templatesServiceGetTemplatesForEdge**](TemplatesServiceApi.md#templatesServiceGetTemplatesForEdge) | **GET** /api/v3/templates/edge | Summary: Get templates for edge Description: Return all templates based on supplied filters. |
| [**templatesServiceTestTemplate**](TemplatesServiceApi.md#templatesServiceTestTemplate) | **POST** /api/v3/templates/test | Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized. |
| [**templatesServiceTransformTemplate**](TemplatesServiceApi.md#templatesServiceTransformTemplate) | **POST** /api/v3/templates/transform | Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data. |
| [**templatesServiceTransformTemplateJSON**](TemplatesServiceApi.md#templatesServiceTransformTemplateJSON) | **POST** /api/v3/templates/transformjson | Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string. |
| [**templatesServiceUpdateTemplate**](TemplatesServiceApi.md#templatesServiceUpdateTemplate) | **PATCH** /api/v3/templates/{template_id} | Summary: Update template Description: Update a single template. |


<a id="templatesServiceCreateIntegration"></a>
# **templatesServiceCreateIntegration**
> Templatesv3CreateIntegrationResponse templatesServiceCreateIntegration(templatesv3CreateIntegrationRequest)

Summary: Create integration Description: Create a set of new templates for a new integration.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    Templatesv3CreateIntegrationRequest templatesv3CreateIntegrationRequest = new Templatesv3CreateIntegrationRequest(); // Templatesv3CreateIntegrationRequest | 
    try {
      Templatesv3CreateIntegrationResponse result = apiInstance.templatesServiceCreateIntegration(templatesv3CreateIntegrationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceCreateIntegration");
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
| **templatesv3CreateIntegrationRequest** | [**Templatesv3CreateIntegrationRequest**](Templatesv3CreateIntegrationRequest.md)|  | |

### Return type

[**Templatesv3CreateIntegrationResponse**](Templatesv3CreateIntegrationResponse.md)

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

<a id="templatesServiceCreateTemplate"></a>
# **templatesServiceCreateTemplate**
> Templatesv3CreateTemplateResponse templatesServiceCreateTemplate(templatesv3CreateTemplateRequest)

Summary: Create template Description: Create a new template.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    Templatesv3CreateTemplateRequest templatesv3CreateTemplateRequest = new Templatesv3CreateTemplateRequest(); // Templatesv3CreateTemplateRequest | 
    try {
      Templatesv3CreateTemplateResponse result = apiInstance.templatesServiceCreateTemplate(templatesv3CreateTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceCreateTemplate");
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
| **templatesv3CreateTemplateRequest** | [**Templatesv3CreateTemplateRequest**](Templatesv3CreateTemplateRequest.md)|  | |

### Return type

[**Templatesv3CreateTemplateResponse**](Templatesv3CreateTemplateResponse.md)

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

<a id="templatesServiceDeleteIntegration"></a>
# **templatesServiceDeleteIntegration**
> Templatesv3DeleteIntegrationResponse templatesServiceDeleteIntegration(integrationId)

Summary: Delete integration Description: Delete all templates associated with an integration.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    String integrationId = "integrationId_example"; // String | Delete the templates associated with the specified integration ID.
    try {
      Templatesv3DeleteIntegrationResponse result = apiInstance.templatesServiceDeleteIntegration(integrationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceDeleteIntegration");
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
| **integrationId** | **String**| Delete the templates associated with the specified integration ID. | |

### Return type

[**Templatesv3DeleteIntegrationResponse**](Templatesv3DeleteIntegrationResponse.md)

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

<a id="templatesServiceDeleteTemplate"></a>
# **templatesServiceDeleteTemplate**
> Templatesv3DeleteTemplateResponse templatesServiceDeleteTemplate(templateId)

Summary: Delete template Description: Delete a specific template.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    String templateId = "templateId_example"; // String | Delete the template with the specified unique ID.
    try {
      Templatesv3DeleteTemplateResponse result = apiInstance.templatesServiceDeleteTemplate(templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceDeleteTemplate");
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
| **templateId** | **String**| Delete the template with the specified unique ID. | |

### Return type

[**Templatesv3DeleteTemplateResponse**](Templatesv3DeleteTemplateResponse.md)

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

<a id="templatesServiceGetOriginDefaultContent"></a>
# **templatesServiceGetOriginDefaultContent**
> Templatesv3GetOriginDefaultContentResponse templatesServiceGetOriginDefaultContent(origin, integration, mimeType)

Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    String origin = "UNDEFINED_ORIGIN"; // String | Origin for the desired content.
    String integration = "UNDEFINED_INTEGRATION"; // String | Integration provides the context for the Request.
    String mimeType = "PLAIN_TEXT"; // String | MIME type for the desired content.
    try {
      Templatesv3GetOriginDefaultContentResponse result = apiInstance.templatesServiceGetOriginDefaultContent(origin, integration, mimeType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceGetOriginDefaultContent");
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
| **origin** | **String**| Origin for the desired content. | [enum: UNDEFINED_ORIGIN, GENERAL_NOTIFICATION, ANOMALY_NOTIFICATION, DATAMART_NOTIFICATION, FETCH_NOTIFICATION, POLICY_ALERT_NOTIFICATION, RECOMMENDATION_NOTIFICATION, REPORTS_NOTIFICATION, SCHEDULED_REPORT_NOTIFICATION, SCHEDULED_AUDIT_NOTIFICATION, WELCOME_NOTIFICATION, EMAIL_HEADER_AND_FOOTER, RISK_NOTIFICATION, SCHEDULED_JOB_SUMMARY, INCIDENT_NOTIFICATION, MAINTENANCE_NOTIFICATION, QSPM_RISK, POLICY_IMPORT_NOTIFICATION] |
| **integration** | **String**| Integration provides the context for the Request. | [optional] [default to UNDEFINED_INTEGRATION] [enum: UNDEFINED_INTEGRATION, SMTP, SNMP, SYSLOG, CASES, SERVICE_NOW, RESILIENT, SOAR, WEBHOOK, SLACK, TEAMS, SMS, JIRA] |
| **mimeType** | **String**| MIME type for the desired content. | [optional] [default to PLAIN_TEXT] [enum: PLAIN_TEXT, TEXT_HTML, APPLICATION_CEF] |

### Return type

[**Templatesv3GetOriginDefaultContentResponse**](Templatesv3GetOriginDefaultContentResponse.md)

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

<a id="templatesServiceGetOriginFields"></a>
# **templatesServiceGetOriginFields**
> Templatesv3GetOriginFieldsResponse templatesServiceGetOriginFields(origin)

Summary: Get origin fields Description: Return the fields available with a specific origin.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    String origin = "UNDEFINED_ORIGIN"; // String | Origin for the desired fields.
    try {
      Templatesv3GetOriginFieldsResponse result = apiInstance.templatesServiceGetOriginFields(origin);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceGetOriginFields");
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
| **origin** | **String**| Origin for the desired fields. | [enum: UNDEFINED_ORIGIN, GENERAL_NOTIFICATION, ANOMALY_NOTIFICATION, DATAMART_NOTIFICATION, FETCH_NOTIFICATION, POLICY_ALERT_NOTIFICATION, RECOMMENDATION_NOTIFICATION, REPORTS_NOTIFICATION, SCHEDULED_REPORT_NOTIFICATION, SCHEDULED_AUDIT_NOTIFICATION, WELCOME_NOTIFICATION, EMAIL_HEADER_AND_FOOTER, RISK_NOTIFICATION, SCHEDULED_JOB_SUMMARY, INCIDENT_NOTIFICATION, MAINTENANCE_NOTIFICATION, QSPM_RISK, POLICY_IMPORT_NOTIFICATION] |

### Return type

[**Templatesv3GetOriginFieldsResponse**](Templatesv3GetOriginFieldsResponse.md)

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

<a id="templatesServiceGetTemplate"></a>
# **templatesServiceGetTemplate**
> Templatesv3GetTemplateResponse templatesServiceGetTemplate(templateId, includeIntegrationName)

Summary: Get template Description: Return a specific template by id.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    String templateId = "templateId_example"; // String | The unique ID for the template to fetch.
    Boolean includeIntegrationName = true; // Boolean | Include the Integration name in the returned template.
    try {
      Templatesv3GetTemplateResponse result = apiInstance.templatesServiceGetTemplate(templateId, includeIntegrationName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceGetTemplate");
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
| **templateId** | **String**| The unique ID for the template to fetch. | |
| **includeIntegrationName** | **Boolean**| Include the Integration name in the returned template. | [optional] |

### Return type

[**Templatesv3GetTemplateResponse**](Templatesv3GetTemplateResponse.md)

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

<a id="templatesServiceGetTemplates"></a>
# **templatesServiceGetTemplates**
> Templatesv3GetTemplatesResponse templatesServiceGetTemplates(integrationId, filterIntegration, filterOrigin, filterMimeType, filterTags, filterEnabledOnly, includeIntegrationName)

Summary: Get templates Description: Return all templates based on supplied filters.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    String integrationId = "integrationId_example"; // String | Filter on templates associated with a specific integration.
    List<String> filterIntegration = Arrays.asList(); // List<String> | Filter on a set of integrations; ignored if empty.
    List<String> filterOrigin = Arrays.asList(); // List<String> | Filter on a specific set of data origins; ignored if empty.
    List<String> filterMimeType = Arrays.asList(); // List<String> | Filter on specific mime types; ignored if empty.
    List<String> filterTags = Arrays.asList(); // List<String> | Filter on specific tags; ignored if empty.
    Boolean filterEnabledOnly = true; // Boolean | Filter on all templates instead of just the enabled templates.
    Boolean includeIntegrationName = true; // Boolean | Include the Integration name in the returned templates.
    try {
      Templatesv3GetTemplatesResponse result = apiInstance.templatesServiceGetTemplates(integrationId, filterIntegration, filterOrigin, filterMimeType, filterTags, filterEnabledOnly, includeIntegrationName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceGetTemplates");
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
| **integrationId** | **String**| Filter on templates associated with a specific integration. | [optional] |
| **filterIntegration** | [**List&lt;String&gt;**](String.md)| Filter on a set of integrations; ignored if empty. | [optional] [enum: UNDEFINED_INTEGRATION, SMTP, SNMP, SYSLOG, CASES, SERVICE_NOW, RESILIENT, SOAR, WEBHOOK, SLACK, TEAMS, SMS, JIRA] |
| **filterOrigin** | [**List&lt;String&gt;**](String.md)| Filter on a specific set of data origins; ignored if empty. | [optional] [enum: UNDEFINED_ORIGIN, GENERAL_NOTIFICATION, ANOMALY_NOTIFICATION, DATAMART_NOTIFICATION, FETCH_NOTIFICATION, POLICY_ALERT_NOTIFICATION, RECOMMENDATION_NOTIFICATION, REPORTS_NOTIFICATION, SCHEDULED_REPORT_NOTIFICATION, SCHEDULED_AUDIT_NOTIFICATION, WELCOME_NOTIFICATION, EMAIL_HEADER_AND_FOOTER, RISK_NOTIFICATION, SCHEDULED_JOB_SUMMARY, INCIDENT_NOTIFICATION, MAINTENANCE_NOTIFICATION, QSPM_RISK, POLICY_IMPORT_NOTIFICATION] |
| **filterMimeType** | [**List&lt;String&gt;**](String.md)| Filter on specific mime types; ignored if empty. | [optional] [enum: PLAIN_TEXT, TEXT_HTML, APPLICATION_CEF] |
| **filterTags** | [**List&lt;String&gt;**](String.md)| Filter on specific tags; ignored if empty. | [optional] |
| **filterEnabledOnly** | **Boolean**| Filter on all templates instead of just the enabled templates. | [optional] |
| **includeIntegrationName** | **Boolean**| Include the Integration name in the returned templates. | [optional] |

### Return type

[**Templatesv3GetTemplatesResponse**](Templatesv3GetTemplatesResponse.md)

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

<a id="templatesServiceGetTemplatesForEdge"></a>
# **templatesServiceGetTemplatesForEdge**
> Templatesv3GetTemplatesForEdgeResponse templatesServiceGetTemplatesForEdge(integrationId, filterOrigin, filterEnabledOnly, includeIntegrationName, transformToGdpFormat)

Summary: Get templates for edge Description: Return all templates based on supplied filters.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    String integrationId = "integrationId_example"; // String | Templates associated with a specific integration.
    List<String> filterOrigin = Arrays.asList(); // List<String> | Filter on a specific set of data origins; ignored if empty.
    Boolean filterEnabledOnly = true; // Boolean | Filter on all templates instead of just the enabled templates.
    Boolean includeIntegrationName = true; // Boolean | Include the Integration name in the returned templates.
    Boolean transformToGdpFormat = true; // Boolean | Tranform template format to GDP style format.
    try {
      Templatesv3GetTemplatesForEdgeResponse result = apiInstance.templatesServiceGetTemplatesForEdge(integrationId, filterOrigin, filterEnabledOnly, includeIntegrationName, transformToGdpFormat);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceGetTemplatesForEdge");
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
| **integrationId** | **String**| Templates associated with a specific integration. | [optional] |
| **filterOrigin** | [**List&lt;String&gt;**](String.md)| Filter on a specific set of data origins; ignored if empty. | [optional] [enum: UNDEFINED_ORIGIN, GENERAL_NOTIFICATION, ANOMALY_NOTIFICATION, DATAMART_NOTIFICATION, FETCH_NOTIFICATION, POLICY_ALERT_NOTIFICATION, RECOMMENDATION_NOTIFICATION, REPORTS_NOTIFICATION, SCHEDULED_REPORT_NOTIFICATION, SCHEDULED_AUDIT_NOTIFICATION, WELCOME_NOTIFICATION, EMAIL_HEADER_AND_FOOTER, RISK_NOTIFICATION, SCHEDULED_JOB_SUMMARY, INCIDENT_NOTIFICATION, MAINTENANCE_NOTIFICATION, QSPM_RISK, POLICY_IMPORT_NOTIFICATION] |
| **filterEnabledOnly** | **Boolean**| Filter on all templates instead of just the enabled templates. | [optional] |
| **includeIntegrationName** | **Boolean**| Include the Integration name in the returned templates. | [optional] |
| **transformToGdpFormat** | **Boolean**| Tranform template format to GDP style format. | [optional] |

### Return type

[**Templatesv3GetTemplatesForEdgeResponse**](Templatesv3GetTemplatesForEdgeResponse.md)

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

<a id="templatesServiceTestTemplate"></a>
# **templatesServiceTestTemplate**
> Templatesv3TestTemplateResponse templatesServiceTestTemplate(templatesv3TestTemplateRequest)

Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    Templatesv3TestTemplateRequest templatesv3TestTemplateRequest = new Templatesv3TestTemplateRequest(); // Templatesv3TestTemplateRequest | 
    try {
      Templatesv3TestTemplateResponse result = apiInstance.templatesServiceTestTemplate(templatesv3TestTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceTestTemplate");
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
| **templatesv3TestTemplateRequest** | [**Templatesv3TestTemplateRequest**](Templatesv3TestTemplateRequest.md)|  | |

### Return type

[**Templatesv3TestTemplateResponse**](Templatesv3TestTemplateResponse.md)

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

<a id="templatesServiceTransformTemplate"></a>
# **templatesServiceTransformTemplate**
> Templatesv3TransformTemplateResponse templatesServiceTransformTemplate(templatesv3TransformTemplateRequest)

Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    Templatesv3TransformTemplateRequest templatesv3TransformTemplateRequest = new Templatesv3TransformTemplateRequest(); // Templatesv3TransformTemplateRequest | 
    try {
      Templatesv3TransformTemplateResponse result = apiInstance.templatesServiceTransformTemplate(templatesv3TransformTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceTransformTemplate");
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
| **templatesv3TransformTemplateRequest** | [**Templatesv3TransformTemplateRequest**](Templatesv3TransformTemplateRequest.md)|  | |

### Return type

[**Templatesv3TransformTemplateResponse**](Templatesv3TransformTemplateResponse.md)

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

<a id="templatesServiceTransformTemplateJSON"></a>
# **templatesServiceTransformTemplateJSON**
> Templatesv3TransformTemplateJSONResponse templatesServiceTransformTemplateJSON(templatesv3TransformTemplateJSONRequest)

Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    Templatesv3TransformTemplateJSONRequest templatesv3TransformTemplateJSONRequest = new Templatesv3TransformTemplateJSONRequest(); // Templatesv3TransformTemplateJSONRequest | 
    try {
      Templatesv3TransformTemplateJSONResponse result = apiInstance.templatesServiceTransformTemplateJSON(templatesv3TransformTemplateJSONRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceTransformTemplateJSON");
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
| **templatesv3TransformTemplateJSONRequest** | [**Templatesv3TransformTemplateJSONRequest**](Templatesv3TransformTemplateJSONRequest.md)|  | |

### Return type

[**Templatesv3TransformTemplateJSONResponse**](Templatesv3TransformTemplateJSONResponse.md)

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

<a id="templatesServiceUpdateTemplate"></a>
# **templatesServiceUpdateTemplate**
> Templatesv3UpdateTemplateResponse templatesServiceUpdateTemplate(templateId, templatesv3UpdateTemplateRequest)

Summary: Update template Description: Update a single template.

### Example
```java
// Import classes:
import com.ibm.security.ApiClient;
import com.ibm.security.ApiException;
import com.ibm.security.Configuration;
import com.ibm.security.auth.*;
import com.ibm.security.models.*;
import com.ibm.security.guardium.TemplatesServiceApi;

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

    TemplatesServiceApi apiInstance = new TemplatesServiceApi(defaultClient);
    String templateId = "templateId_example"; // String | The template id to update.
    Templatesv3UpdateTemplateRequest templatesv3UpdateTemplateRequest = new Templatesv3UpdateTemplateRequest(); // Templatesv3UpdateTemplateRequest | 
    try {
      Templatesv3UpdateTemplateResponse result = apiInstance.templatesServiceUpdateTemplate(templateId, templatesv3UpdateTemplateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesServiceApi#templatesServiceUpdateTemplate");
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
| **templateId** | **String**| The template id to update. | |
| **templatesv3UpdateTemplateRequest** | [**Templatesv3UpdateTemplateRequest**](Templatesv3UpdateTemplateRequest.md)|  | |

### Return type

[**Templatesv3UpdateTemplateResponse**](Templatesv3UpdateTemplateResponse.md)

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

