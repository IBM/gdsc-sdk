# TemplatesServiceApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**templatesServiceCreateIntegration**](TemplatesServiceApi.md#templatesServiceCreateIntegration) | **POST** /api/v3/templates/integration | Summary: Create integration
Description: Create a set of new templates for a new integration.
[**templatesServiceCreateTemplate**](TemplatesServiceApi.md#templatesServiceCreateTemplate) | **POST** /api/v3/templates | Summary: Create template
Description: Create a new template.
[**templatesServiceDeleteIntegration**](TemplatesServiceApi.md#templatesServiceDeleteIntegration) | **DELETE** /api/v3/templates/integrations/{integration_id} | Summary: Delete integration
Description: Delete all templates associated with an integration.
[**templatesServiceDeleteTemplate**](TemplatesServiceApi.md#templatesServiceDeleteTemplate) | **DELETE** /api/v3/templates/{template_id} | Summary: Delete template
Description: Delete a specific template.
[**templatesServiceGetOriginDefaultContent**](TemplatesServiceApi.md#templatesServiceGetOriginDefaultContent) | **GET** /api/v3/templates/origins/{origin}/content | Summary: Get origin default content
Description: Return the default content for a template with a specified origin and MIME type.
[**templatesServiceGetOriginFields**](TemplatesServiceApi.md#templatesServiceGetOriginFields) | **GET** /api/v3/templates/origins/{origin}/fields | Summary: Get origin fields
Description: Return the fields available with a specific origin.
[**templatesServiceGetTemplate**](TemplatesServiceApi.md#templatesServiceGetTemplate) | **GET** /api/v3/templates/{template_id} | Summary: Get template
Description: Return a specific template by id.
[**templatesServiceGetTemplates**](TemplatesServiceApi.md#templatesServiceGetTemplates) | **GET** /api/v3/templates | Summary: Get templates
Description: Return all templates based on supplied filters.
[**templatesServiceGetTemplatesForEdge**](TemplatesServiceApi.md#templatesServiceGetTemplatesForEdge) | **GET** /api/v3/templates/edge | Summary: Get templates for edge
Description: Return all templates based on supplied filters.
[**templatesServiceTestTemplate**](TemplatesServiceApi.md#templatesServiceTestTemplate) | **POST** /api/v3/templates/test | Summary: Test template
Description: Analyze a specified template to ensure will function correctly when utilized.
[**templatesServiceTransformTemplate**](TemplatesServiceApi.md#templatesServiceTransformTemplate) | **POST** /api/v3/templates/transform | Summary: Transform template
Description: Process the specified template and returns the Title and Content based on supplied data.
[**templatesServiceTransformTemplateJSON**](TemplatesServiceApi.md#templatesServiceTransformTemplateJSON) | **POST** /api/v3/templates/transformjson | Summary: Transform template JSON
Description: Process the specified template and returns the Title and Content based on supplied json data string.
[**templatesServiceUpdateTemplate**](TemplatesServiceApi.md#templatesServiceUpdateTemplate) | **PATCH** /api/v3/templates/{template_id} | Summary: Update template
Description: Update a single template.



## templatesServiceCreateIntegration

Summary: Create integration
Description: Create a set of new templates for a new integration.

### Example

```bash
 templatesServiceCreateIntegration
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3CreateIntegrationRequest** | [**Templatesv3CreateIntegrationRequest**](Templatesv3CreateIntegrationRequest.md) |  |

### Return type

[**Templatesv3CreateIntegrationResponse**](Templatesv3CreateIntegrationResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceCreateTemplate

Summary: Create template
Description: Create a new template.

### Example

```bash
 templatesServiceCreateTemplate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3CreateTemplateRequest** | [**Templatesv3CreateTemplateRequest**](Templatesv3CreateTemplateRequest.md) |  |

### Return type

[**Templatesv3CreateTemplateResponse**](Templatesv3CreateTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceDeleteIntegration

Summary: Delete integration
Description: Delete all templates associated with an integration.

### Example

```bash
 templatesServiceDeleteIntegration integration_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **string** | Delete the templates associated with the specified integration ID. | [default to null]

### Return type

[**Templatesv3DeleteIntegrationResponse**](Templatesv3DeleteIntegrationResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceDeleteTemplate

Summary: Delete template
Description: Delete a specific template.

### Example

```bash
 templatesServiceDeleteTemplate template_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **string** | Delete the template with the specified unique ID. | [default to null]

### Return type

[**Templatesv3DeleteTemplateResponse**](Templatesv3DeleteTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceGetOriginDefaultContent

Summary: Get origin default content
Description: Return the default content for a template with a specified origin and MIME type.

### Example

```bash
 templatesServiceGetOriginDefaultContent origin=value  integration=value  mime_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **origin** | **string** | Origin for the desired content. | [default to null]
 **integration** | **string** | Integration provides the context for the Request. | [optional] [default to UNDEFINED_INTEGRATION]
 **mimeType** | **string** | MIME type for the desired content. | [optional] [default to PLAIN_TEXT]

### Return type

[**Templatesv3GetOriginDefaultContentResponse**](Templatesv3GetOriginDefaultContentResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceGetOriginFields

Summary: Get origin fields
Description: Return the fields available with a specific origin.

### Example

```bash
 templatesServiceGetOriginFields origin=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **origin** | **string** | Origin for the desired fields. | [default to null]

### Return type

[**Templatesv3GetOriginFieldsResponse**](Templatesv3GetOriginFieldsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceGetTemplate

Summary: Get template
Description: Return a specific template by id.

### Example

```bash
 templatesServiceGetTemplate template_id=value  include_integration_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **string** | The unique ID for the template to fetch. | [default to null]
 **includeIntegrationName** | **boolean** | Include the Integration name in the returned template. | [optional] [default to null]

### Return type

[**Templatesv3GetTemplateResponse**](Templatesv3GetTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceGetTemplates

Summary: Get templates
Description: Return all templates based on supplied filters.

### Example

```bash
 templatesServiceGetTemplates  integration_id=value  Specify as:  filter_integration=value1 filter_integration=value2 filter_integration=...  Specify as:  filter_origin=value1 filter_origin=value2 filter_origin=...  Specify as:  filter_mime_type=value1 filter_mime_type=value2 filter_mime_type=...  Specify as:  filter_tags=value1 filter_tags=value2 filter_tags=...  filter_enabled_only=value  include_integration_name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **string** | Filter on templates associated with a specific integration. | [optional] [default to null]
 **filterIntegration** | [**array[string]**](string.md) | Filter on a set of integrations; ignored if empty. | [optional] [default to null]
 **filterOrigin** | [**array[string]**](string.md) | Filter on a specific set of data origins; ignored if empty. | [optional] [default to null]
 **filterMimeType** | [**array[string]**](string.md) | Filter on specific mime types; ignored if empty. | [optional] [default to null]
 **filterTags** | [**array[string]**](string.md) | Filter on specific tags; ignored if empty. | [optional] [default to null]
 **filterEnabledOnly** | **boolean** | Filter on all templates instead of just the enabled templates. | [optional] [default to null]
 **includeIntegrationName** | **boolean** | Include the Integration name in the returned templates. | [optional] [default to null]

### Return type

[**Templatesv3GetTemplatesResponse**](Templatesv3GetTemplatesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceGetTemplatesForEdge

Summary: Get templates for edge
Description: Return all templates based on supplied filters.

### Example

```bash
 templatesServiceGetTemplatesForEdge  integration_id=value  Specify as:  filter_origin=value1 filter_origin=value2 filter_origin=...  filter_enabled_only=value  include_integration_name=value  transform_to_gdp_format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **string** | Templates associated with a specific integration. | [optional] [default to null]
 **filterOrigin** | [**array[string]**](string.md) | Filter on a specific set of data origins; ignored if empty. | [optional] [default to null]
 **filterEnabledOnly** | **boolean** | Filter on all templates instead of just the enabled templates. | [optional] [default to null]
 **includeIntegrationName** | **boolean** | Include the Integration name in the returned templates. | [optional] [default to null]
 **transformToGdpFormat** | **boolean** | Tranform template format to GDP style format. | [optional] [default to null]

### Return type

[**Templatesv3GetTemplatesForEdgeResponse**](Templatesv3GetTemplatesForEdgeResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceTestTemplate

Summary: Test template
Description: Analyze a specified template to ensure will function correctly when utilized.

### Example

```bash
 templatesServiceTestTemplate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3TestTemplateRequest** | [**Templatesv3TestTemplateRequest**](Templatesv3TestTemplateRequest.md) |  |

### Return type

[**Templatesv3TestTemplateResponse**](Templatesv3TestTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceTransformTemplate

Summary: Transform template
Description: Process the specified template and returns the Title and Content based on supplied data.

### Example

```bash
 templatesServiceTransformTemplate
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3TransformTemplateRequest** | [**Templatesv3TransformTemplateRequest**](Templatesv3TransformTemplateRequest.md) |  |

### Return type

[**Templatesv3TransformTemplateResponse**](Templatesv3TransformTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceTransformTemplateJSON

Summary: Transform template JSON
Description: Process the specified template and returns the Title and Content based on supplied json data string.

### Example

```bash
 templatesServiceTransformTemplateJSON
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templatesv3TransformTemplateJSONRequest** | [**Templatesv3TransformTemplateJSONRequest**](Templatesv3TransformTemplateJSONRequest.md) |  |

### Return type

[**Templatesv3TransformTemplateJSONResponse**](Templatesv3TransformTemplateJSONResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## templatesServiceUpdateTemplate

Summary: Update template
Description: Update a single template.

### Example

```bash
 templatesServiceUpdateTemplate template_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | **string** | The template id to update. | [default to null]
 **templatesv3UpdateTemplateRequest** | [**Templatesv3UpdateTemplateRequest**](Templatesv3UpdateTemplateRequest.md) |  |

### Return type

[**Templatesv3UpdateTemplateResponse**](Templatesv3UpdateTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

