# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TemplatesServiceCreateIntegration**](TemplatesServiceApi.md#TemplatesServiceCreateIntegration) | **Post** /api/v3/templates/integration | Summary: Create integration Description: Create a set of new templates for a new integration.
[**TemplatesServiceCreateTemplate**](TemplatesServiceApi.md#TemplatesServiceCreateTemplate) | **Post** /api/v3/templates | Summary: Create template Description: Create a new template.
[**TemplatesServiceDeleteIntegration**](TemplatesServiceApi.md#TemplatesServiceDeleteIntegration) | **Delete** /api/v3/templates/integrations/{integration_id} | Summary: Delete integration Description: Delete all templates associated with an integration.
[**TemplatesServiceDeleteTemplate**](TemplatesServiceApi.md#TemplatesServiceDeleteTemplate) | **Delete** /api/v3/templates/{template_id} | Summary: Delete template Description: Delete a specific template.
[**TemplatesServiceGetOriginDefaultContent**](TemplatesServiceApi.md#TemplatesServiceGetOriginDefaultContent) | **Get** /api/v3/templates/origins/{origin}/content | Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
[**TemplatesServiceGetOriginFields**](TemplatesServiceApi.md#TemplatesServiceGetOriginFields) | **Get** /api/v3/templates/origins/{origin}/fields | Summary: Get origin fields Description: Return the fields available with a specific origin.
[**TemplatesServiceGetTemplate**](TemplatesServiceApi.md#TemplatesServiceGetTemplate) | **Get** /api/v3/templates/{template_id} | Summary: Get template Description: Return a specific template by id.
[**TemplatesServiceGetTemplates**](TemplatesServiceApi.md#TemplatesServiceGetTemplates) | **Get** /api/v3/templates | Summary: Get templates Description: Return all templates based on supplied filters.
[**TemplatesServiceGetTemplatesForEdge**](TemplatesServiceApi.md#TemplatesServiceGetTemplatesForEdge) | **Get** /api/v3/templates/edge | Summary: Get templates for edge Description: Return all templates based on supplied filters.
[**TemplatesServiceTestTemplate**](TemplatesServiceApi.md#TemplatesServiceTestTemplate) | **Post** /api/v3/templates/test | Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
[**TemplatesServiceTransformTemplate**](TemplatesServiceApi.md#TemplatesServiceTransformTemplate) | **Post** /api/v3/templates/transform | Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
[**TemplatesServiceTransformTemplateJSON**](TemplatesServiceApi.md#TemplatesServiceTransformTemplateJSON) | **Post** /api/v3/templates/transformjson | Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
[**TemplatesServiceUpdateTemplate**](TemplatesServiceApi.md#TemplatesServiceUpdateTemplate) | **Patch** /api/v3/templates/{template_id} | Summary: Update template Description: Update a single template.

# **TemplatesServiceCreateIntegration**
> Templatesv3CreateIntegrationResponse TemplatesServiceCreateIntegration(ctx, body)
Summary: Create integration Description: Create a set of new templates for a new integration.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Templatesv3CreateIntegrationRequest**](Templatesv3CreateIntegrationRequest.md)|  | 

### Return type

[**Templatesv3CreateIntegrationResponse**](templatesv3CreateIntegrationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceCreateTemplate**
> Templatesv3CreateTemplateResponse TemplatesServiceCreateTemplate(ctx, body)
Summary: Create template Description: Create a new template.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Templatesv3CreateTemplateRequest**](Templatesv3CreateTemplateRequest.md)|  | 

### Return type

[**Templatesv3CreateTemplateResponse**](templatesv3CreateTemplateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceDeleteIntegration**
> Templatesv3DeleteIntegrationResponse TemplatesServiceDeleteIntegration(ctx, integrationId)
Summary: Delete integration Description: Delete all templates associated with an integration.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **integrationId** | **string**| Delete the templates associated with the specified integration ID. | 

### Return type

[**Templatesv3DeleteIntegrationResponse**](templatesv3DeleteIntegrationResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceDeleteTemplate**
> Templatesv3DeleteTemplateResponse TemplatesServiceDeleteTemplate(ctx, templateId)
Summary: Delete template Description: Delete a specific template.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **templateId** | **string**| Delete the template with the specified unique ID. | 

### Return type

[**Templatesv3DeleteTemplateResponse**](templatesv3DeleteTemplateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceGetOriginDefaultContent**
> Templatesv3GetOriginDefaultContentResponse TemplatesServiceGetOriginDefaultContent(ctx, origin, optional)
Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **origin** | **string**| Origin for the desired content. | 
 **optional** | ***TemplatesServiceApiTemplatesServiceGetOriginDefaultContentOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a TemplatesServiceApiTemplatesServiceGetOriginDefaultContentOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **integration** | **optional.String**| Integration provides the context for the Request. | [default to UNDEFINED_INTEGRATION]
 **mimeType** | **optional.String**| MIME type for the desired content. | [default to PLAIN_TEXT]

### Return type

[**Templatesv3GetOriginDefaultContentResponse**](templatesv3GetOriginDefaultContentResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceGetOriginFields**
> Templatesv3GetOriginFieldsResponse TemplatesServiceGetOriginFields(ctx, origin)
Summary: Get origin fields Description: Return the fields available with a specific origin.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **origin** | **string**| Origin for the desired fields. | 

### Return type

[**Templatesv3GetOriginFieldsResponse**](templatesv3GetOriginFieldsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceGetTemplate**
> Templatesv3GetTemplateResponse TemplatesServiceGetTemplate(ctx, templateId, optional)
Summary: Get template Description: Return a specific template by id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **templateId** | **string**| The unique ID for the template to fetch. | 
 **optional** | ***TemplatesServiceApiTemplatesServiceGetTemplateOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a TemplatesServiceApiTemplatesServiceGetTemplateOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **includeIntegrationName** | **optional.Bool**| Include the Integration name in the returned template. | 

### Return type

[**Templatesv3GetTemplateResponse**](templatesv3GetTemplateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceGetTemplates**
> Templatesv3GetTemplatesResponse TemplatesServiceGetTemplates(ctx, optional)
Summary: Get templates Description: Return all templates based on supplied filters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***TemplatesServiceApiTemplatesServiceGetTemplatesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a TemplatesServiceApiTemplatesServiceGetTemplatesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **optional.String**| Filter on templates associated with a specific integration. | 
 **filterIntegration** | [**optional.Interface of []string**](string.md)| Filter on a set of integrations; ignored if empty. | 
 **filterOrigin** | [**optional.Interface of []string**](string.md)| Filter on a specific set of data origins; ignored if empty. | 
 **filterMimeType** | [**optional.Interface of []string**](string.md)| Filter on specific mime types; ignored if empty. | 
 **filterTags** | [**optional.Interface of []string**](string.md)| Filter on specific tags; ignored if empty. | 
 **filterEnabledOnly** | **optional.Bool**| Filter on all templates instead of just the enabled templates. | 
 **includeIntegrationName** | **optional.Bool**| Include the Integration name in the returned templates. | 

### Return type

[**Templatesv3GetTemplatesResponse**](templatesv3GetTemplatesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceGetTemplatesForEdge**
> Templatesv3GetTemplatesForEdgeResponse TemplatesServiceGetTemplatesForEdge(ctx, optional)
Summary: Get templates for edge Description: Return all templates based on supplied filters.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***TemplatesServiceApiTemplatesServiceGetTemplatesForEdgeOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a TemplatesServiceApiTemplatesServiceGetTemplatesForEdgeOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **optional.String**| Templates associated with a specific integration. | 
 **filterOrigin** | [**optional.Interface of []string**](string.md)| Filter on a specific set of data origins; ignored if empty. | 
 **filterEnabledOnly** | **optional.Bool**| Filter on all templates instead of just the enabled templates. | 
 **includeIntegrationName** | **optional.Bool**| Include the Integration name in the returned templates. | 
 **transformToGdpFormat** | **optional.Bool**| Tranform template format to GDP style format. | 

### Return type

[**Templatesv3GetTemplatesForEdgeResponse**](templatesv3GetTemplatesForEdgeResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceTestTemplate**
> Templatesv3TestTemplateResponse TemplatesServiceTestTemplate(ctx, body)
Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Templatesv3TestTemplateRequest**](Templatesv3TestTemplateRequest.md)|  | 

### Return type

[**Templatesv3TestTemplateResponse**](templatesv3TestTemplateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceTransformTemplate**
> Templatesv3TransformTemplateResponse TemplatesServiceTransformTemplate(ctx, body)
Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Templatesv3TransformTemplateRequest**](Templatesv3TransformTemplateRequest.md)|  | 

### Return type

[**Templatesv3TransformTemplateResponse**](templatesv3TransformTemplateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceTransformTemplateJSON**
> Templatesv3TransformTemplateJsonResponse TemplatesServiceTransformTemplateJSON(ctx, body)
Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Templatesv3TransformTemplateJsonRequest**](Templatesv3TransformTemplateJsonRequest.md)|  | 

### Return type

[**Templatesv3TransformTemplateJsonResponse**](templatesv3TransformTemplateJSONResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TemplatesServiceUpdateTemplate**
> Templatesv3UpdateTemplateResponse TemplatesServiceUpdateTemplate(ctx, body, templateId)
Summary: Update template Description: Update a single template.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Templatesv3UpdateTemplateRequest**](Templatesv3UpdateTemplateRequest.md)|  | 
  **templateId** | **string**| The template id to update. | 

### Return type

[**Templatesv3UpdateTemplateResponse**](templatesv3UpdateTemplateResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

