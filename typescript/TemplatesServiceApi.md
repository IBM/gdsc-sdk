# .TemplatesServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**templatesServiceCreateIntegration**](TemplatesServiceApi.md#templatesServiceCreateIntegration) | **POST** /api/v3/templates/integration | Summary: Create integration Description: Create a set of new templates for a new integration.
[**templatesServiceCreateTemplate**](TemplatesServiceApi.md#templatesServiceCreateTemplate) | **POST** /api/v3/templates | Summary: Create template Description: Create a new template.
[**templatesServiceDeleteIntegration**](TemplatesServiceApi.md#templatesServiceDeleteIntegration) | **DELETE** /api/v3/templates/integrations/{integration_id} | Summary: Delete integration Description: Delete all templates associated with an integration.
[**templatesServiceDeleteTemplate**](TemplatesServiceApi.md#templatesServiceDeleteTemplate) | **DELETE** /api/v3/templates/{template_id} | Summary: Delete template Description: Delete a specific template.
[**templatesServiceGetOriginDefaultContent**](TemplatesServiceApi.md#templatesServiceGetOriginDefaultContent) | **GET** /api/v3/templates/origins/{origin}/content | Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
[**templatesServiceGetOriginFields**](TemplatesServiceApi.md#templatesServiceGetOriginFields) | **GET** /api/v3/templates/origins/{origin}/fields | Summary: Get origin fields Description: Return the fields available with a specific origin.
[**templatesServiceGetTemplate**](TemplatesServiceApi.md#templatesServiceGetTemplate) | **GET** /api/v3/templates/{template_id} | Summary: Get template Description: Return a specific template by id.
[**templatesServiceGetTemplates**](TemplatesServiceApi.md#templatesServiceGetTemplates) | **GET** /api/v3/templates | Summary: Get templates Description: Return all templates based on supplied filters.
[**templatesServiceTestTemplate**](TemplatesServiceApi.md#templatesServiceTestTemplate) | **POST** /api/v3/templates/test | Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
[**templatesServiceTransformTemplate**](TemplatesServiceApi.md#templatesServiceTransformTemplate) | **POST** /api/v3/templates/transform | Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
[**templatesServiceTransformTemplateJSON**](TemplatesServiceApi.md#templatesServiceTransformTemplateJSON) | **POST** /api/v3/templates/transformjson | Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
[**templatesServiceUpdateTemplate**](TemplatesServiceApi.md#templatesServiceUpdateTemplate) | **PATCH** /api/v3/templates/{template_id} | Summary: Update template Description: Update a single template.


# **templatesServiceCreateIntegration**
> Templatesv3CreateIntegrationResponse templatesServiceCreateIntegration(templatesv3CreateIntegrationRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceCreateIntegrationRequest = {
  // Templatesv3CreateIntegrationRequest
  templatesv3CreateIntegrationRequest: {
    integration: "UNDEFINED_INTEGRATION",
    integrationId: "integrationId_example",
    tags: "tags_example",
  },
};

apiInstance.templatesServiceCreateIntegration(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3CreateIntegrationRequest** | **Templatesv3CreateIntegrationRequest**|  |


### Return type

**Templatesv3CreateIntegrationResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceCreateTemplate**
> Templatesv3CreateTemplateResponse templatesServiceCreateTemplate(templatesv3CreateTemplateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceCreateTemplateRequest = {
  // Templatesv3CreateTemplateRequest
  templatesv3CreateTemplateRequest: {
    template: {
      content: "content_example",
      defaultRecipient: {
        recipientType: "USER",
        value: "value_example",
      },
      integration: "UNDEFINED_INTEGRATION",
      integrationId: "integrationId_example",
      integrationName: "integrationName_example",
      isDefault: true,
      isEnabled: true,
      mimeType: "PLAIN_TEXT",
      name: "name_example",
      order: 1,
      origin: "UNDEFINED_ORIGIN",
      tags: [
        "tags_example",
      ],
      templateId: "templateId_example",
      title: "title_example",
    },
  },
};

apiInstance.templatesServiceCreateTemplate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3CreateTemplateRequest** | **Templatesv3CreateTemplateRequest**|  |


### Return type

**Templatesv3CreateTemplateResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceDeleteIntegration**
> Templatesv3DeleteIntegrationResponse templatesServiceDeleteIntegration()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceDeleteIntegrationRequest = {
  // string | Delete the templates associated with the specified integration ID.
  integrationId: "integration_id_example",
};

apiInstance.templatesServiceDeleteIntegration(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | [**string**] | Delete the templates associated with the specified integration ID. | defaults to undefined


### Return type

**Templatesv3DeleteIntegrationResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceDeleteTemplate**
> Templatesv3DeleteTemplateResponse templatesServiceDeleteTemplate()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceDeleteTemplateRequest = {
  // string | Delete the template with the specified unique ID.
  templateId: "template_id_example",
};

apiInstance.templatesServiceDeleteTemplate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**string**] | Delete the template with the specified unique ID. | defaults to undefined


### Return type

**Templatesv3DeleteTemplateResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceGetOriginDefaultContent**
> Templatesv3GetOriginDefaultContentResponse templatesServiceGetOriginDefaultContent()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceGetOriginDefaultContentRequest = {
  // 'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION' | Origin for the desired content.
  origin: "UNDEFINED_ORIGIN",
  // 'UNDEFINED_INTEGRATION' | 'SMTP' | 'SNMP' | 'SYSLOG' | 'CASES' | 'SERVICE_NOW' | 'RESILIENT' | 'SOAR' | 'WEBHOOK' | 'SLACK' | 'TEAMS' | 'SMS' | 'JIRA' | Integration provides the context for the Request. (optional)
  integration: "UNDEFINED_INTEGRATION",
  // 'PLAIN_TEXT' | 'TEXT_HTML' | 'APPLICATION_CEF' | MIME type for the desired content. (optional)
  mimeType: "PLAIN_TEXT",
};

apiInstance.templatesServiceGetOriginDefaultContent(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **origin** | [**&#39;UNDEFINED_ORIGIN&#39; | &#39;GENERAL_NOTIFICATION&#39; | &#39;ANOMALY_NOTIFICATION&#39; | &#39;DATAMART_NOTIFICATION&#39; | &#39;FETCH_NOTIFICATION&#39; | &#39;POLICY_ALERT_NOTIFICATION&#39; | &#39;RECOMMENDATION_NOTIFICATION&#39; | &#39;REPORTS_NOTIFICATION&#39; | &#39;SCHEDULED_REPORT_NOTIFICATION&#39; | &#39;SCHEDULED_AUDIT_NOTIFICATION&#39; | &#39;WELCOME_NOTIFICATION&#39; | &#39;EMAIL_HEADER_AND_FOOTER&#39; | &#39;RISK_NOTIFICATION&#39; | &#39;SCHEDULED_JOB_SUMMARY&#39; | &#39;INCIDENT_NOTIFICATION&#39; | &#39;MAINTENANCE_NOTIFICATION&#39; | &#39;QSPM_RISK&#39; | &#39;POLICY_IMPORT_NOTIFICATION&#39;**]**Array<&#39;UNDEFINED_ORIGIN&#39; &#124; &#39;GENERAL_NOTIFICATION&#39; &#124; &#39;ANOMALY_NOTIFICATION&#39; &#124; &#39;DATAMART_NOTIFICATION&#39; &#124; &#39;FETCH_NOTIFICATION&#39; &#124; &#39;POLICY_ALERT_NOTIFICATION&#39; &#124; &#39;RECOMMENDATION_NOTIFICATION&#39; &#124; &#39;REPORTS_NOTIFICATION&#39; &#124; &#39;SCHEDULED_REPORT_NOTIFICATION&#39; &#124; &#39;SCHEDULED_AUDIT_NOTIFICATION&#39; &#124; &#39;WELCOME_NOTIFICATION&#39; &#124; &#39;EMAIL_HEADER_AND_FOOTER&#39; &#124; &#39;RISK_NOTIFICATION&#39; &#124; &#39;SCHEDULED_JOB_SUMMARY&#39; &#124; &#39;INCIDENT_NOTIFICATION&#39; &#124; &#39;MAINTENANCE_NOTIFICATION&#39; &#124; &#39;QSPM_RISK&#39; &#124; &#39;POLICY_IMPORT_NOTIFICATION&#39;>** | Origin for the desired content. | defaults to undefined
 **integration** | [**&#39;UNDEFINED_INTEGRATION&#39; | &#39;SMTP&#39; | &#39;SNMP&#39; | &#39;SYSLOG&#39; | &#39;CASES&#39; | &#39;SERVICE_NOW&#39; | &#39;RESILIENT&#39; | &#39;SOAR&#39; | &#39;WEBHOOK&#39; | &#39;SLACK&#39; | &#39;TEAMS&#39; | &#39;SMS&#39; | &#39;JIRA&#39;**]**Array<&#39;UNDEFINED_INTEGRATION&#39; &#124; &#39;SMTP&#39; &#124; &#39;SNMP&#39; &#124; &#39;SYSLOG&#39; &#124; &#39;CASES&#39; &#124; &#39;SERVICE_NOW&#39; &#124; &#39;RESILIENT&#39; &#124; &#39;SOAR&#39; &#124; &#39;WEBHOOK&#39; &#124; &#39;SLACK&#39; &#124; &#39;TEAMS&#39; &#124; &#39;SMS&#39; &#124; &#39;JIRA&#39;>** | Integration provides the context for the Request. | (optional) defaults to 'UNDEFINED_INTEGRATION'
 **mimeType** | [**&#39;PLAIN_TEXT&#39; | &#39;TEXT_HTML&#39; | &#39;APPLICATION_CEF&#39;**]**Array<&#39;PLAIN_TEXT&#39; &#124; &#39;TEXT_HTML&#39; &#124; &#39;APPLICATION_CEF&#39;>** | MIME type for the desired content. | (optional) defaults to 'PLAIN_TEXT'


### Return type

**Templatesv3GetOriginDefaultContentResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceGetOriginFields**
> Templatesv3GetOriginFieldsResponse templatesServiceGetOriginFields()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceGetOriginFieldsRequest = {
  // 'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION' | Origin for the desired fields.
  origin: "UNDEFINED_ORIGIN",
};

apiInstance.templatesServiceGetOriginFields(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **origin** | [**&#39;UNDEFINED_ORIGIN&#39; | &#39;GENERAL_NOTIFICATION&#39; | &#39;ANOMALY_NOTIFICATION&#39; | &#39;DATAMART_NOTIFICATION&#39; | &#39;FETCH_NOTIFICATION&#39; | &#39;POLICY_ALERT_NOTIFICATION&#39; | &#39;RECOMMENDATION_NOTIFICATION&#39; | &#39;REPORTS_NOTIFICATION&#39; | &#39;SCHEDULED_REPORT_NOTIFICATION&#39; | &#39;SCHEDULED_AUDIT_NOTIFICATION&#39; | &#39;WELCOME_NOTIFICATION&#39; | &#39;EMAIL_HEADER_AND_FOOTER&#39; | &#39;RISK_NOTIFICATION&#39; | &#39;SCHEDULED_JOB_SUMMARY&#39; | &#39;INCIDENT_NOTIFICATION&#39; | &#39;MAINTENANCE_NOTIFICATION&#39; | &#39;QSPM_RISK&#39; | &#39;POLICY_IMPORT_NOTIFICATION&#39;**]**Array<&#39;UNDEFINED_ORIGIN&#39; &#124; &#39;GENERAL_NOTIFICATION&#39; &#124; &#39;ANOMALY_NOTIFICATION&#39; &#124; &#39;DATAMART_NOTIFICATION&#39; &#124; &#39;FETCH_NOTIFICATION&#39; &#124; &#39;POLICY_ALERT_NOTIFICATION&#39; &#124; &#39;RECOMMENDATION_NOTIFICATION&#39; &#124; &#39;REPORTS_NOTIFICATION&#39; &#124; &#39;SCHEDULED_REPORT_NOTIFICATION&#39; &#124; &#39;SCHEDULED_AUDIT_NOTIFICATION&#39; &#124; &#39;WELCOME_NOTIFICATION&#39; &#124; &#39;EMAIL_HEADER_AND_FOOTER&#39; &#124; &#39;RISK_NOTIFICATION&#39; &#124; &#39;SCHEDULED_JOB_SUMMARY&#39; &#124; &#39;INCIDENT_NOTIFICATION&#39; &#124; &#39;MAINTENANCE_NOTIFICATION&#39; &#124; &#39;QSPM_RISK&#39; &#124; &#39;POLICY_IMPORT_NOTIFICATION&#39;>** | Origin for the desired fields. | defaults to undefined


### Return type

**Templatesv3GetOriginFieldsResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceGetTemplate**
> Templatesv3GetTemplateResponse templatesServiceGetTemplate()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceGetTemplateRequest = {
  // string | The unique ID for the template to fetch.
  templateId: "template_id_example",
  // boolean | Include the Integration name in the returned template. (optional)
  includeIntegrationName: true,
};

apiInstance.templatesServiceGetTemplate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**string**] | The unique ID for the template to fetch. | defaults to undefined
 **includeIntegrationName** | [**boolean**] | Include the Integration name in the returned template. | (optional) defaults to undefined


### Return type

**Templatesv3GetTemplateResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceGetTemplates**
> Templatesv3GetTemplatesResponse templatesServiceGetTemplates()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceGetTemplatesRequest = {
  // string | Filter on templates associated with a specific integration. (optional)
  integrationId: "integration_id_example",
  // Array<'UNDEFINED_INTEGRATION' | 'SMTP' | 'SNMP' | 'SYSLOG' | 'CASES' | 'SERVICE_NOW' | 'RESILIENT' | 'SOAR' | 'WEBHOOK' | 'SLACK' | 'TEAMS' | 'SMS' | 'JIRA'> | Filter on a set of integrations; ignored if empty. (optional)
  filterIntegration: [
    "UNDEFINED_INTEGRATION",
  ],
  // Array<'UNDEFINED_ORIGIN' | 'GENERAL_NOTIFICATION' | 'ANOMALY_NOTIFICATION' | 'DATAMART_NOTIFICATION' | 'FETCH_NOTIFICATION' | 'POLICY_ALERT_NOTIFICATION' | 'RECOMMENDATION_NOTIFICATION' | 'REPORTS_NOTIFICATION' | 'SCHEDULED_REPORT_NOTIFICATION' | 'SCHEDULED_AUDIT_NOTIFICATION' | 'WELCOME_NOTIFICATION' | 'EMAIL_HEADER_AND_FOOTER' | 'RISK_NOTIFICATION' | 'SCHEDULED_JOB_SUMMARY' | 'INCIDENT_NOTIFICATION' | 'MAINTENANCE_NOTIFICATION' | 'QSPM_RISK' | 'POLICY_IMPORT_NOTIFICATION'> | Filter on a specific set of data origins; ignored if empty. (optional)
  filterOrigin: [
    "UNDEFINED_ORIGIN",
  ],
  // Array<'PLAIN_TEXT' | 'TEXT_HTML' | 'APPLICATION_CEF'> | Filter on specific mime types; ignored if empty. (optional)
  filterMimeType: [
    "PLAIN_TEXT",
  ],
  // Array<string> | Filter on specific tags; ignored if empty. (optional)
  filterTags: [
    "filter_tags_example",
  ],
  // boolean | Filter on all templates instead of just the enabled templates. (optional)
  filterEnabledOnly: true,
  // boolean | Include the Integration name in the returned templates. (optional)
  includeIntegrationName: true,
};

apiInstance.templatesServiceGetTemplates(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | [**string**] | Filter on templates associated with a specific integration. | (optional) defaults to undefined
 **filterIntegration** | **Array<&#39;UNDEFINED_INTEGRATION&#39; &#124; &#39;SMTP&#39; &#124; &#39;SNMP&#39; &#124; &#39;SYSLOG&#39; &#124; &#39;CASES&#39; &#124; &#39;SERVICE_NOW&#39; &#124; &#39;RESILIENT&#39; &#124; &#39;SOAR&#39; &#124; &#39;WEBHOOK&#39; &#124; &#39;SLACK&#39; &#124; &#39;TEAMS&#39; &#124; &#39;SMS&#39; &#124; &#39;JIRA&#39;>** | Filter on a set of integrations; ignored if empty. | (optional) defaults to undefined
 **filterOrigin** | **Array<&#39;UNDEFINED_ORIGIN&#39; &#124; &#39;GENERAL_NOTIFICATION&#39; &#124; &#39;ANOMALY_NOTIFICATION&#39; &#124; &#39;DATAMART_NOTIFICATION&#39; &#124; &#39;FETCH_NOTIFICATION&#39; &#124; &#39;POLICY_ALERT_NOTIFICATION&#39; &#124; &#39;RECOMMENDATION_NOTIFICATION&#39; &#124; &#39;REPORTS_NOTIFICATION&#39; &#124; &#39;SCHEDULED_REPORT_NOTIFICATION&#39; &#124; &#39;SCHEDULED_AUDIT_NOTIFICATION&#39; &#124; &#39;WELCOME_NOTIFICATION&#39; &#124; &#39;EMAIL_HEADER_AND_FOOTER&#39; &#124; &#39;RISK_NOTIFICATION&#39; &#124; &#39;SCHEDULED_JOB_SUMMARY&#39; &#124; &#39;INCIDENT_NOTIFICATION&#39; &#124; &#39;MAINTENANCE_NOTIFICATION&#39; &#124; &#39;QSPM_RISK&#39; &#124; &#39;POLICY_IMPORT_NOTIFICATION&#39;>** | Filter on a specific set of data origins; ignored if empty. | (optional) defaults to undefined
 **filterMimeType** | **Array<&#39;PLAIN_TEXT&#39; &#124; &#39;TEXT_HTML&#39; &#124; &#39;APPLICATION_CEF&#39;>** | Filter on specific mime types; ignored if empty. | (optional) defaults to undefined
 **filterTags** | **Array&lt;string&gt;** | Filter on specific tags; ignored if empty. | (optional) defaults to undefined
 **filterEnabledOnly** | [**boolean**] | Filter on all templates instead of just the enabled templates. | (optional) defaults to undefined
 **includeIntegrationName** | [**boolean**] | Include the Integration name in the returned templates. | (optional) defaults to undefined


### Return type

**Templatesv3GetTemplatesResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceTestTemplate**
> Templatesv3TestTemplateResponse templatesServiceTestTemplate(templatesv3TestTemplateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceTestTemplateRequest = {
  // Templatesv3TestTemplateRequest
  templatesv3TestTemplateRequest: {
    template: {
      content: "content_example",
      defaultRecipient: {
        recipientType: "USER",
        value: "value_example",
      },
      integration: "UNDEFINED_INTEGRATION",
      integrationId: "integrationId_example",
      integrationName: "integrationName_example",
      isDefault: true,
      isEnabled: true,
      mimeType: "PLAIN_TEXT",
      name: "name_example",
      order: 1,
      origin: "UNDEFINED_ORIGIN",
      tags: [
        "tags_example",
      ],
      templateId: "templateId_example",
      title: "title_example",
    },
  },
};

apiInstance.templatesServiceTestTemplate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3TestTemplateRequest** | **Templatesv3TestTemplateRequest**|  |


### Return type

**Templatesv3TestTemplateResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceTransformTemplate**
> Templatesv3TransformTemplateResponse templatesServiceTransformTemplate(templatesv3TransformTemplateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceTransformTemplateRequest = {
  // Templatesv3TransformTemplateRequest
  templatesv3TransformTemplateRequest: {
    data: {
      "key": "key_example",
    },
    integration: "UNDEFINED_INTEGRATION",
    mimeType: "PLAIN_TEXT",
    origin: "UNDEFINED_ORIGIN",
    templateId: "templateId_example",
  },
};

apiInstance.templatesServiceTransformTemplate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3TransformTemplateRequest** | **Templatesv3TransformTemplateRequest**|  |


### Return type

**Templatesv3TransformTemplateResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceTransformTemplateJSON**
> Templatesv3TransformTemplateJSONResponse templatesServiceTransformTemplateJSON(templatesv3TransformTemplateJSONRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceTransformTemplateJSONRequest = {
  // Templatesv3TransformTemplateJSONRequest
  templatesv3TransformTemplateJSONRequest: {
    data: "data_example",
    integration: "UNDEFINED_INTEGRATION",
    mimeType: "PLAIN_TEXT",
    origin: "UNDEFINED_ORIGIN",
    templateId: "templateId_example",
  },
};

apiInstance.templatesServiceTransformTemplateJSON(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3TransformTemplateJSONRequest** | **Templatesv3TransformTemplateJSONRequest**|  |


### Return type

**Templatesv3TransformTemplateJSONResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **templatesServiceUpdateTemplate**
> Templatesv3UpdateTemplateResponse templatesServiceUpdateTemplate(templatesv3UpdateTemplateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TemplatesServiceApi(configuration);

let body:.TemplatesServiceApiTemplatesServiceUpdateTemplateRequest = {
  // string | The template id to update.
  templateId: "template_id_example",
  // Templatesv3UpdateTemplateRequest
  templatesv3UpdateTemplateRequest: {
    template: {
      content: "content_example",
      defaultRecipient: {
        recipientType: "USER",
        value: "value_example",
      },
      integration: "UNDEFINED_INTEGRATION",
      integrationId: "integrationId_example",
      integrationName: "integrationName_example",
      isDefault: true,
      isEnabled: true,
      mimeType: "PLAIN_TEXT",
      name: "name_example",
      order: 1,
      origin: "UNDEFINED_ORIGIN",
      tags: [
        "tags_example",
      ],
      templateId: "templateId_example",
      title: "title_example",
    },
    templateId: "templateId_example",
  },
};

apiInstance.templatesServiceUpdateTemplate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3UpdateTemplateRequest** | **Templatesv3UpdateTemplateRequest**|  |
 **templateId** | [**string**] | The template id to update. | defaults to undefined


### Return type

**Templatesv3UpdateTemplateResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


