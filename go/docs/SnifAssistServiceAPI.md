# \SnifAssistServiceAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SnifAssistServiceTestRegex**](SnifAssistServiceAPI.md#SnifAssistServiceTestRegex) | **Post** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.



## SnifAssistServiceTestRegex

> Snifassistv3StatusResponseBase SnifAssistServiceTestRegex(ctx).Snifassistv3TestRegexRequest(snifassistv3TestRegexRequest).Execute()

Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.

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
	snifassistv3TestRegexRequest := *openapiclient.NewSnifassistv3TestRegexRequest() // Snifassistv3TestRegexRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.SnifAssistServiceAPI.SnifAssistServiceTestRegex(context.Background()).Snifassistv3TestRegexRequest(snifassistv3TestRegexRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `SnifAssistServiceAPI.SnifAssistServiceTestRegex``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SnifAssistServiceTestRegex`: Snifassistv3StatusResponseBase
	fmt.Fprintf(os.Stdout, "Response from `SnifAssistServiceAPI.SnifAssistServiceTestRegex`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSnifAssistServiceTestRegexRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snifassistv3TestRegexRequest** | [**Snifassistv3TestRegexRequest**](Snifassistv3TestRegexRequest.md) |  | 

### Return type

[**Snifassistv3StatusResponseBase**](Snifassistv3StatusResponseBase.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

