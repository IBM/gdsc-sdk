# \TemplatesServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TemplatesServiceCreateIntegration**](TemplatesServiceAPI.md#TemplatesServiceCreateIntegration) | **Post** /api/v3/templates/integration | Summary: Create integration Description: Create a set of new templates for a new integration.
[**TemplatesServiceCreateTemplate**](TemplatesServiceAPI.md#TemplatesServiceCreateTemplate) | **Post** /api/v3/templates | Summary: Create template Description: Create a new template.
[**TemplatesServiceDeleteIntegration**](TemplatesServiceAPI.md#TemplatesServiceDeleteIntegration) | **Delete** /api/v3/templates/integrations/{integration_id} | Summary: Delete integration Description: Delete all templates associated with an integration.
[**TemplatesServiceDeleteTemplate**](TemplatesServiceAPI.md#TemplatesServiceDeleteTemplate) | **Delete** /api/v3/templates/{template_id} | Summary: Delete template Description: Delete a specific template.
[**TemplatesServiceGetOriginDefaultContent**](TemplatesServiceAPI.md#TemplatesServiceGetOriginDefaultContent) | **Get** /api/v3/templates/origins/{origin}/content | Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.
[**TemplatesServiceGetOriginFields**](TemplatesServiceAPI.md#TemplatesServiceGetOriginFields) | **Get** /api/v3/templates/origins/{origin}/fields | Summary: Get origin fields Description: Return the fields available with a specific origin.
[**TemplatesServiceGetTemplate**](TemplatesServiceAPI.md#TemplatesServiceGetTemplate) | **Get** /api/v3/templates/{template_id} | Summary: Get template Description: Return a specific template by id.
[**TemplatesServiceGetTemplates**](TemplatesServiceAPI.md#TemplatesServiceGetTemplates) | **Get** /api/v3/templates | Summary: Get templates Description: Return all templates based on supplied filters.
[**TemplatesServiceTestTemplate**](TemplatesServiceAPI.md#TemplatesServiceTestTemplate) | **Post** /api/v3/templates/test | Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.
[**TemplatesServiceTransformTemplate**](TemplatesServiceAPI.md#TemplatesServiceTransformTemplate) | **Post** /api/v3/templates/transform | Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.
[**TemplatesServiceTransformTemplateJSON**](TemplatesServiceAPI.md#TemplatesServiceTransformTemplateJSON) | **Post** /api/v3/templates/transformjson | Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.
[**TemplatesServiceUpdateTemplate**](TemplatesServiceAPI.md#TemplatesServiceUpdateTemplate) | **Patch** /api/v3/templates/{template_id} | Summary: Update template Description: Update a single template.



## TemplatesServiceCreateIntegration

> Templatesv3CreateIntegrationResponse TemplatesServiceCreateIntegration(ctx).Templatesv3CreateIntegrationRequest(templatesv3CreateIntegrationRequest).Execute()

Summary: Create integration Description: Create a set of new templates for a new integration.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	templatesv3CreateIntegrationRequest := *openapiclient.NewTemplatesv3CreateIntegrationRequest() // Templatesv3CreateIntegrationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceCreateIntegration(context.Background()).Templatesv3CreateIntegrationRequest(templatesv3CreateIntegrationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceCreateIntegration``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceCreateIntegration`: Templatesv3CreateIntegrationResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceCreateIntegration`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceCreateIntegrationRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceCreateTemplate

> Templatesv3CreateTemplateResponse TemplatesServiceCreateTemplate(ctx).Templatesv3CreateTemplateRequest(templatesv3CreateTemplateRequest).Execute()

Summary: Create template Description: Create a new template.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	templatesv3CreateTemplateRequest := *openapiclient.NewTemplatesv3CreateTemplateRequest() // Templatesv3CreateTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceCreateTemplate(context.Background()).Templatesv3CreateTemplateRequest(templatesv3CreateTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceCreateTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceCreateTemplate`: Templatesv3CreateTemplateResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceCreateTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceCreateTemplateRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceDeleteIntegration

> Templatesv3DeleteIntegrationResponse TemplatesServiceDeleteIntegration(ctx, integrationId).Execute()

Summary: Delete integration Description: Delete all templates associated with an integration.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	integrationId := "integrationId_example" // string | Delete the templates associated with the specified integration ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceDeleteIntegration(context.Background(), integrationId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceDeleteIntegration``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceDeleteIntegration`: Templatesv3DeleteIntegrationResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceDeleteIntegration`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**integrationId** | **string** | Delete the templates associated with the specified integration ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceDeleteIntegrationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Templatesv3DeleteIntegrationResponse**](Templatesv3DeleteIntegrationResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceDeleteTemplate

> Templatesv3DeleteTemplateResponse TemplatesServiceDeleteTemplate(ctx, templateId).Execute()

Summary: Delete template Description: Delete a specific template.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	templateId := "templateId_example" // string | Delete the template with the specified unique ID.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceDeleteTemplate(context.Background(), templateId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceDeleteTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceDeleteTemplate`: Templatesv3DeleteTemplateResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceDeleteTemplate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**templateId** | **string** | Delete the template with the specified unique ID. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceDeleteTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Templatesv3DeleteTemplateResponse**](Templatesv3DeleteTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceGetOriginDefaultContent

> Templatesv3GetOriginDefaultContentResponse TemplatesServiceGetOriginDefaultContent(ctx, origin).Integration(integration).MimeType(mimeType).Execute()

Summary: Get origin default content Description: Return the default content for a template with a specified origin and MIME type.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	origin := "origin_example" // string | Origin for the desired content.
	integration := "integration_example" // string | Integration provides the context for the Request. (optional) (default to "UNDEFINED_INTEGRATION")
	mimeType := "mimeType_example" // string | MIME type for the desired content. (optional) (default to "PLAIN_TEXT")

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceGetOriginDefaultContent(context.Background(), origin).Integration(integration).MimeType(mimeType).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceGetOriginDefaultContent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceGetOriginDefaultContent`: Templatesv3GetOriginDefaultContentResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceGetOriginDefaultContent`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**origin** | **string** | Origin for the desired content. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceGetOriginDefaultContentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **integration** | **string** | Integration provides the context for the Request. | [default to &quot;UNDEFINED_INTEGRATION&quot;]
 **mimeType** | **string** | MIME type for the desired content. | [default to &quot;PLAIN_TEXT&quot;]

### Return type

[**Templatesv3GetOriginDefaultContentResponse**](Templatesv3GetOriginDefaultContentResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceGetOriginFields

> Templatesv3GetOriginFieldsResponse TemplatesServiceGetOriginFields(ctx, origin).Execute()

Summary: Get origin fields Description: Return the fields available with a specific origin.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	origin := "origin_example" // string | Origin for the desired fields.

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceGetOriginFields(context.Background(), origin).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceGetOriginFields``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceGetOriginFields`: Templatesv3GetOriginFieldsResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceGetOriginFields`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**origin** | **string** | Origin for the desired fields. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceGetOriginFieldsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Templatesv3GetOriginFieldsResponse**](Templatesv3GetOriginFieldsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceGetTemplate

> Templatesv3GetTemplateResponse TemplatesServiceGetTemplate(ctx, templateId).IncludeIntegrationName(includeIntegrationName).Execute()

Summary: Get template Description: Return a specific template by id.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	templateId := "templateId_example" // string | The unique ID for the template to fetch.
	includeIntegrationName := true // bool | Include the Integration name in the returned template. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceGetTemplate(context.Background(), templateId).IncludeIntegrationName(includeIntegrationName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceGetTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceGetTemplate`: Templatesv3GetTemplateResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceGetTemplate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**templateId** | **string** | The unique ID for the template to fetch. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceGetTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **includeIntegrationName** | **bool** | Include the Integration name in the returned template. | 

### Return type

[**Templatesv3GetTemplateResponse**](Templatesv3GetTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceGetTemplates

> Templatesv3GetTemplatesResponse TemplatesServiceGetTemplates(ctx).IntegrationId(integrationId).FilterIntegration(filterIntegration).FilterOrigin(filterOrigin).FilterMimeType(filterMimeType).FilterTags(filterTags).FilterEnabledOnly(filterEnabledOnly).IncludeIntegrationName(includeIntegrationName).Execute()

Summary: Get templates Description: Return all templates based on supplied filters.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	integrationId := "integrationId_example" // string | Filter on templates associated with a specific integration. (optional)
	filterIntegration := []string{"FilterIntegration_example"} // []string | Filter on a set of integrations; ignored if empty. (optional)
	filterOrigin := []string{"FilterOrigin_example"} // []string | Filter on a specific set of data origins; ignored if empty. (optional)
	filterMimeType := []string{"FilterMimeType_example"} // []string | Filter on specific mime types; ignored if empty. (optional)
	filterTags := []string{"Inner_example"} // []string | Filter on specific tags; ignored if empty. (optional)
	filterEnabledOnly := true // bool | Filter on all templates instead of just the enabled templates. (optional)
	includeIntegrationName := true // bool | Include the Integration name in the returned templates. (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceGetTemplates(context.Background()).IntegrationId(integrationId).FilterIntegration(filterIntegration).FilterOrigin(filterOrigin).FilterMimeType(filterMimeType).FilterTags(filterTags).FilterEnabledOnly(filterEnabledOnly).IncludeIntegrationName(includeIntegrationName).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceGetTemplates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceGetTemplates`: Templatesv3GetTemplatesResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceGetTemplates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceGetTemplatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **string** | Filter on templates associated with a specific integration. | 
 **filterIntegration** | **[]string** | Filter on a set of integrations; ignored if empty. | 
 **filterOrigin** | **[]string** | Filter on a specific set of data origins; ignored if empty. | 
 **filterMimeType** | **[]string** | Filter on specific mime types; ignored if empty. | 
 **filterTags** | **[]string** | Filter on specific tags; ignored if empty. | 
 **filterEnabledOnly** | **bool** | Filter on all templates instead of just the enabled templates. | 
 **includeIntegrationName** | **bool** | Include the Integration name in the returned templates. | 

### Return type

[**Templatesv3GetTemplatesResponse**](Templatesv3GetTemplatesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceTestTemplate

> Templatesv3TestTemplateResponse TemplatesServiceTestTemplate(ctx).Templatesv3TestTemplateRequest(templatesv3TestTemplateRequest).Execute()

Summary: Test template Description: Analyze a specified template to ensure will function correctly when utilized.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	templatesv3TestTemplateRequest := *openapiclient.NewTemplatesv3TestTemplateRequest() // Templatesv3TestTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceTestTemplate(context.Background()).Templatesv3TestTemplateRequest(templatesv3TestTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceTestTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceTestTemplate`: Templatesv3TestTemplateResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceTestTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceTestTemplateRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceTransformTemplate

> Templatesv3TransformTemplateResponse TemplatesServiceTransformTemplate(ctx).Templatesv3TransformTemplateRequest(templatesv3TransformTemplateRequest).Execute()

Summary: Transform template Description: Process the specified template and returns the Title and Content based on supplied data.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	templatesv3TransformTemplateRequest := *openapiclient.NewTemplatesv3TransformTemplateRequest() // Templatesv3TransformTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceTransformTemplate(context.Background()).Templatesv3TransformTemplateRequest(templatesv3TransformTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceTransformTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceTransformTemplate`: Templatesv3TransformTemplateResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceTransformTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceTransformTemplateRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceTransformTemplateJSON

> Templatesv3TransformTemplateJSONResponse TemplatesServiceTransformTemplateJSON(ctx).Templatesv3TransformTemplateJSONRequest(templatesv3TransformTemplateJSONRequest).Execute()

Summary: Transform template JSON Description: Process the specified template and returns the Title and Content based on supplied json data string.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	templatesv3TransformTemplateJSONRequest := *openapiclient.NewTemplatesv3TransformTemplateJSONRequest() // Templatesv3TransformTemplateJSONRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceTransformTemplateJSON(context.Background()).Templatesv3TransformTemplateJSONRequest(templatesv3TransformTemplateJSONRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceTransformTemplateJSON``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceTransformTemplateJSON`: Templatesv3TransformTemplateJSONResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceTransformTemplateJSON`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceTransformTemplateJSONRequest struct via the builder pattern


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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## TemplatesServiceUpdateTemplate

> Templatesv3UpdateTemplateResponse TemplatesServiceUpdateTemplate(ctx, templateId).Templatesv3UpdateTemplateRequest(templatesv3UpdateTemplateRequest).Execute()

Summary: Update template Description: Update a single template.

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
	templateId := "templateId_example" // string | The template id to update.
	templatesv3UpdateTemplateRequest := *openapiclient.NewTemplatesv3UpdateTemplateRequest() // Templatesv3UpdateTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.TemplatesServiceAPI.TemplatesServiceUpdateTemplate(context.Background(), templateId).Templatesv3UpdateTemplateRequest(templatesv3UpdateTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `TemplatesServiceAPI.TemplatesServiceUpdateTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `TemplatesServiceUpdateTemplate`: Templatesv3UpdateTemplateResponse
	fmt.Fprintf(os.Stdout, "Response from `TemplatesServiceAPI.TemplatesServiceUpdateTemplate`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**templateId** | **string** | The template id to update. | 

### Other Parameters

Other parameters are passed through a pointer to a apiTemplatesServiceUpdateTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **templatesv3UpdateTemplateRequest** | [**Templatesv3UpdateTemplateRequest**](Templatesv3UpdateTemplateRequest.md) |  | 

### Return type

[**Templatesv3UpdateTemplateResponse**](Templatesv3UpdateTemplateResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

