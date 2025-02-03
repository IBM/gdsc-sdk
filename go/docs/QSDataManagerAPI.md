# \QSDataManagerAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**QSDataManagerGetAppDataForProvisionId**](QSDataManagerAPI.md#QSDataManagerGetAppDataForProvisionId) | **Get** /api/v3/datamanager/application/{provision_id}/data | Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.
[**QSDataManagerGetMasterData**](QSDataManagerAPI.md#QSDataManagerGetMasterData) | **Get** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
[**QSDataManagerGetNetLocDimDataForScanId**](QSDataManagerAPI.md#QSDataManagerGetNetLocDimDataForScanId) | **Get** /api/v3/datamanager/network/{scan_id}/data | Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.
[**QSDataManagerInsertAllEntities**](QSDataManagerAPI.md#QSDataManagerInsertAllEntities) | **Post** /api/v3/datamanager/all/entities | Summary: Insert Data Description: Insert All Dimension and Fact tables data.
[**QSDataManagerRegisterScan**](QSDataManagerAPI.md#QSDataManagerRegisterScan) | **Post** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table.
[**QSDataManagerRetrieveScan**](QSDataManagerAPI.md#QSDataManagerRetrieveScan) | **Get** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.
[**QSDataManagerSearchEntityData**](QSDataManagerAPI.md#QSDataManagerSearchEntityData) | **Post** /api/v3/datamanager/entity/search | Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters
[**QSDataManagerUpdateNetLocation**](QSDataManagerAPI.md#QSDataManagerUpdateNetLocation) | **Put** /api/v3/datamanager/network | Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.



## QSDataManagerGetAppDataForProvisionId

> Qspmdatamanagerv3AppDataResponse QSDataManagerGetAppDataForProvisionId(ctx, provisionId).Execute()

Summary: Fetch Application Provisoning Details Description: Fetch details from app dimension entity for given provision id.

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
	provisionId := "provisionId_example" // string | Identifier for the provision request

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSDataManagerAPI.QSDataManagerGetAppDataForProvisionId(context.Background(), provisionId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSDataManagerAPI.QSDataManagerGetAppDataForProvisionId``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSDataManagerGetAppDataForProvisionId`: Qspmdatamanagerv3AppDataResponse
	fmt.Fprintf(os.Stdout, "Response from `QSDataManagerAPI.QSDataManagerGetAppDataForProvisionId`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**provisionId** | **string** | Identifier for the provision request | 

### Other Parameters

Other parameters are passed through a pointer to a apiQSDataManagerGetAppDataForProvisionIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Qspmdatamanagerv3AppDataResponse**](Qspmdatamanagerv3AppDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSDataManagerGetMasterData

> Qspmdatamanagerv3MasterDataResponse QSDataManagerGetMasterData(ctx).Execute()

Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSDataManagerAPI.QSDataManagerGetMasterData(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSDataManagerAPI.QSDataManagerGetMasterData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSDataManagerGetMasterData`: Qspmdatamanagerv3MasterDataResponse
	fmt.Fprintf(os.Stdout, "Response from `QSDataManagerAPI.QSDataManagerGetMasterData`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiQSDataManagerGetMasterDataRequest struct via the builder pattern


### Return type

[**Qspmdatamanagerv3MasterDataResponse**](Qspmdatamanagerv3MasterDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSDataManagerGetNetLocDimDataForScanId

> Qspmdatamanagerv3NetlocDataResponse QSDataManagerGetNetLocDimDataForScanId(ctx, scanId).Execute()

Summary: Fetch Netlocation Details Description: Fetch details from netloc dimension entity for a given scanid.

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
	scanId := "scanId_example" // string | Identifier for the scan to retrieve netloc data for

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSDataManagerAPI.QSDataManagerGetNetLocDimDataForScanId(context.Background(), scanId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSDataManagerAPI.QSDataManagerGetNetLocDimDataForScanId``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSDataManagerGetNetLocDimDataForScanId`: Qspmdatamanagerv3NetlocDataResponse
	fmt.Fprintf(os.Stdout, "Response from `QSDataManagerAPI.QSDataManagerGetNetLocDimDataForScanId`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**scanId** | **string** | Identifier for the scan to retrieve netloc data for | 

### Other Parameters

Other parameters are passed through a pointer to a apiQSDataManagerGetNetLocDimDataForScanIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Qspmdatamanagerv3NetlocDataResponse**](Qspmdatamanagerv3NetlocDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSDataManagerInsertAllEntities

> map[string]interface{} QSDataManagerInsertAllEntities(ctx).Qspmdatamanagerv3InsertEntitiesRequest(qspmdatamanagerv3InsertEntitiesRequest).Execute()

Summary: Insert Data Description: Insert All Dimension and Fact tables data.

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
	qspmdatamanagerv3InsertEntitiesRequest := *openapiclient.NewQspmdatamanagerv3InsertEntitiesRequest() // Qspmdatamanagerv3InsertEntitiesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSDataManagerAPI.QSDataManagerInsertAllEntities(context.Background()).Qspmdatamanagerv3InsertEntitiesRequest(qspmdatamanagerv3InsertEntitiesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSDataManagerAPI.QSDataManagerInsertAllEntities``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSDataManagerInsertAllEntities`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `QSDataManagerAPI.QSDataManagerInsertAllEntities`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQSDataManagerInsertAllEntitiesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3InsertEntitiesRequest** | [**Qspmdatamanagerv3InsertEntitiesRequest**](Qspmdatamanagerv3InsertEntitiesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSDataManagerRegisterScan

> Qspmdatamanagerv3ScanResponse QSDataManagerRegisterScan(ctx).Qspmdatamanagerv3ScanRequest(qspmdatamanagerv3ScanRequest).Execute()

Summary: Insert ScanDetails Description: Register new data into scan dimension table.

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
	qspmdatamanagerv3ScanRequest := *openapiclient.NewQspmdatamanagerv3ScanRequest() // Qspmdatamanagerv3ScanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSDataManagerAPI.QSDataManagerRegisterScan(context.Background()).Qspmdatamanagerv3ScanRequest(qspmdatamanagerv3ScanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSDataManagerAPI.QSDataManagerRegisterScan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSDataManagerRegisterScan`: Qspmdatamanagerv3ScanResponse
	fmt.Fprintf(os.Stdout, "Response from `QSDataManagerAPI.QSDataManagerRegisterScan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQSDataManagerRegisterScanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3ScanRequest** | [**Qspmdatamanagerv3ScanRequest**](Qspmdatamanagerv3ScanRequest.md) |  | 

### Return type

[**Qspmdatamanagerv3ScanResponse**](Qspmdatamanagerv3ScanResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSDataManagerRetrieveScan

> Qspmdatamanagerv3ScanResponse QSDataManagerRetrieveScan(ctx, scanId).Execute()

Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.

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
	scanId := "scanId_example" // string | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSDataManagerAPI.QSDataManagerRetrieveScan(context.Background(), scanId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSDataManagerAPI.QSDataManagerRetrieveScan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSDataManagerRetrieveScan`: Qspmdatamanagerv3ScanResponse
	fmt.Fprintf(os.Stdout, "Response from `QSDataManagerAPI.QSDataManagerRetrieveScan`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**scanId** | **string** |  | 

### Other Parameters

Other parameters are passed through a pointer to a apiQSDataManagerRetrieveScanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Qspmdatamanagerv3ScanResponse**](Qspmdatamanagerv3ScanResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSDataManagerSearchEntityData

> Qspmdatamanagerv3SearchEntityDataResponse QSDataManagerSearchEntityData(ctx).Qspmdatamanagerv3SearchEntityDataRequest(qspmdatamanagerv3SearchEntityDataRequest).Execute()

Summary: Retrieve Entity Data Description:Retrieve Entity data for given parameters

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
	qspmdatamanagerv3SearchEntityDataRequest := *openapiclient.NewQspmdatamanagerv3SearchEntityDataRequest() // Qspmdatamanagerv3SearchEntityDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSDataManagerAPI.QSDataManagerSearchEntityData(context.Background()).Qspmdatamanagerv3SearchEntityDataRequest(qspmdatamanagerv3SearchEntityDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSDataManagerAPI.QSDataManagerSearchEntityData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSDataManagerSearchEntityData`: Qspmdatamanagerv3SearchEntityDataResponse
	fmt.Fprintf(os.Stdout, "Response from `QSDataManagerAPI.QSDataManagerSearchEntityData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQSDataManagerSearchEntityDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3SearchEntityDataRequest** | [**Qspmdatamanagerv3SearchEntityDataRequest**](Qspmdatamanagerv3SearchEntityDataRequest.md) |  | 

### Return type

[**Qspmdatamanagerv3SearchEntityDataResponse**](Qspmdatamanagerv3SearchEntityDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## QSDataManagerUpdateNetLocation

> Qspmdatamanagerv3UpdateNetLocResponse QSDataManagerUpdateNetLocation(ctx).Qspmdatamanagerv3UpdateNetLocRequest(qspmdatamanagerv3UpdateNetLocRequest).Execute()

Summary: Update Netlocation Details Description: Update netloc dimension entity for agiven scanid.

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
	qspmdatamanagerv3UpdateNetLocRequest := *openapiclient.NewQspmdatamanagerv3UpdateNetLocRequest() // Qspmdatamanagerv3UpdateNetLocRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.QSDataManagerAPI.QSDataManagerUpdateNetLocation(context.Background()).Qspmdatamanagerv3UpdateNetLocRequest(qspmdatamanagerv3UpdateNetLocRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `QSDataManagerAPI.QSDataManagerUpdateNetLocation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `QSDataManagerUpdateNetLocation`: Qspmdatamanagerv3UpdateNetLocResponse
	fmt.Fprintf(os.Stdout, "Response from `QSDataManagerAPI.QSDataManagerUpdateNetLocation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiQSDataManagerUpdateNetLocationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3UpdateNetLocRequest** | [**Qspmdatamanagerv3UpdateNetLocRequest**](Qspmdatamanagerv3UpdateNetLocRequest.md) |  | 

### Return type

[**Qspmdatamanagerv3UpdateNetLocResponse**](Qspmdatamanagerv3UpdateNetLocResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

