# .ConnectionsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectionsServiceCreateConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceCreateConnectionsAccounts) | **POST** /api/v3/connections/accounts | Summary: Create Connections accounts Description: Create Connections acccounts.
[**connectionsServiceCreateConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceCreateConnectionsConfigs) | **POST** /api/v3/connections/configs | Summary: Create connections configs Description: Create Connection config by connection type.
[**connectionsServiceCreatePlugin**](ConnectionsServiceApi.md#connectionsServiceCreatePlugin) | **POST** /api/v3/connections/plugins | Summary: Create plugin Description: Create UC generic plugin
[**connectionsServiceCreateSettings**](ConnectionsServiceApi.md#connectionsServiceCreateSettings) | **POST** /api/v3/connections/settings | Summary: Create settings Description: Create Settings.
[**connectionsServiceDeleteConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceDeleteConnectionsAccounts) | **DELETE** /api/v3/connections/accounts/{account_id} | Summary: Delete Connections accounts Description: Delete Connections acccounts.
[**connectionsServiceDeleteConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceDeleteConnectionsConfigs) | **DELETE** /api/v3/connections/configs/{connection_id} | Summary: Delete connections configs Description: Delete Connection config by connection id.
[**connectionsServiceDeleteConnector**](ConnectionsServiceApi.md#connectionsServiceDeleteConnector) | **DELETE** /api/v3/connections/{connection_id} | Summary: Delete connector Description: Delete a Connection.
[**connectionsServiceDeletePlugin**](ConnectionsServiceApi.md#connectionsServiceDeletePlugin) | **DELETE** /api/v3/connections/plugins/{id} | Summary: Delete plugin. Description: Delete plugin.
[**connectionsServiceGeneratePackage**](ConnectionsServiceApi.md#connectionsServiceGeneratePackage) | **PUT** /api/v3/connections/plugins/{id}/package | Summary: Generate package. Description: Generate package.
[**connectionsServiceGetBannerState**](ConnectionsServiceApi.md#connectionsServiceGetBannerState) | **GET** /api/v3/connections/banner | Summary: Get banner state for object verb page.  Description: Get banner state for object verb page.
[**connectionsServiceGetConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceGetConnectionsAccounts) | **GET** /api/v3/connections/accounts | Summary: Get Connections accounts Description: Get Connections acccounts.
[**connectionsServiceGetConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceGetConnectionsConfigs) | **GET** /api/v3/connections/configs | Summary: Get connections configs Description: Get Connection config by connection type.
[**connectionsServiceGetConnectionsWithFilters**](ConnectionsServiceApi.md#connectionsServiceGetConnectionsWithFilters) | **POST** /api/v3/connections | Summary: Get connections with filters Description: Get connections with filters.
[**connectionsServiceGetConnectorsSummary**](ConnectionsServiceApi.md#connectionsServiceGetConnectorsSummary) | **GET** /api/v3/connections/summary | Summary: Get connectors summary Description: Get a summary of Connectors.
[**connectionsServiceGetDataSources**](ConnectionsServiceApi.md#connectionsServiceGetDataSources) | **GET** /api/v3/connections/datasources | Summary: Get data sources Description: Get a list of data sources.
[**connectionsServiceGetGuardRecordFields**](ConnectionsServiceApi.md#connectionsServiceGetGuardRecordFields) | **GET** /api/v3/connections/fields | Summary: Get list of guard record fields.  Description: Get list of guard record fields.
[**connectionsServiceGetHeaders**](ConnectionsServiceApi.md#connectionsServiceGetHeaders) | **GET** /api/v3/connections/headers | Summary: Get headers Description: Get a list of Headers.
[**connectionsServiceGetPlugins**](ConnectionsServiceApi.md#connectionsServiceGetPlugins) | **GET** /api/v3/connections/plugins | Summary: Get plugins  Description: Get custom universal connector plugins
[**connectionsServiceGetSettings**](ConnectionsServiceApi.md#connectionsServiceGetSettings) | **GET** /api/v3/connections/settings | Summary: Get settings Description: Get a list of Settings.
[**connectionsServicePartialUpdateConnectors**](ConnectionsServiceApi.md#connectionsServicePartialUpdateConnectors) | **PATCH** /api/v3/connections | Summary: Partial update connectors Description: Partial update of Connectors.
[**connectionsServicePostStapCommand**](ConnectionsServiceApi.md#connectionsServicePostStapCommand) | **POST** /api/v3/stap/commands | Summary: Post stap command Description: Send a STAP command down to kafka for snif-assist.
[**connectionsServiceUpdateBannerState**](ConnectionsServiceApi.md#connectionsServiceUpdateBannerState) | **PUT** /api/v3/connections/banner | Summary: Update banner state for object verb page.  Description: Update banner state for object verb page.
[**connectionsServiceUpdateConnectionsAccounts**](ConnectionsServiceApi.md#connectionsServiceUpdateConnectionsAccounts) | **PUT** /api/v3/connections/accounts | Summary: Update Connections accounts Description: Update Connections acccounts.
[**connectionsServiceUpdateConnectionsConfigs**](ConnectionsServiceApi.md#connectionsServiceUpdateConnectionsConfigs) | **PATCH** /api/v3/connections/configs | Summary: Update connections configs Description: Update Connection config by connection id.
[**connectionsServiceUpdateConnectors**](ConnectionsServiceApi.md#connectionsServiceUpdateConnectors) | **PUT** /api/v3/connections | Summary: Update connectors Description: Update a list of Connectors.
[**connectionsServiceUpdatePlugin**](ConnectionsServiceApi.md#connectionsServiceUpdatePlugin) | **PUT** /api/v3/connections/plugins/{id} | Summary: Update plugin. Description: Update plugin.
[**connectionsServiceUpdateSettings**](ConnectionsServiceApi.md#connectionsServiceUpdateSettings) | **PUT** /api/v3/connections/settings | Summary: Update settings Description: Update Settings.
[**connectionsServiceValidateAwsConnection**](ConnectionsServiceApi.md#connectionsServiceValidateAwsConnection) | **POST** /api/v3/connections/validate/aws | Summary: Validate an AWS connection. Description: Validate an AWS connection.
[**connectionsServiceValidateAzureConnection**](ConnectionsServiceApi.md#connectionsServiceValidateAzureConnection) | **POST** /api/v3/connections/validate/azure | Summary: Validate an Azure connection. Description: Validate an Azure connection.
[**connectionsServiceValidateGcpConnection**](ConnectionsServiceApi.md#connectionsServiceValidateGcpConnection) | **POST** /api/v3/connections/validate/gcp | Summary: Validate a GCP connection. Description: Validate a GCP connection.


# **connectionsServiceCreateConnectionsAccounts**
> Connectionsv3CreateConnectionsAccountsResponse connectionsServiceCreateConnectionsAccounts(connectionsv3CreateConnectionsAccountsRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceCreateConnectionsAccountsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceCreateConnectionsAccountsRequest = {
  
  connectionsv3CreateConnectionsAccountsRequest: {
    account: {
      accessKey: "accessKey_example",
      authenticationType: "authenticationType_example",
      connectionType: "connectionType_example",
      name: "name_example",
      roleArn: "roleArn_example",
      secretAccessKey: "secretAccessKey_example",
    },
    accountId: "accountId_example",
  },
};

const data = await apiInstance.connectionsServiceCreateConnectionsAccounts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreateConnectionsAccountsRequest** | **Connectionsv3CreateConnectionsAccountsRequest**|  |


### Return type

**Connectionsv3CreateConnectionsAccountsResponse**

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

# **connectionsServiceCreateConnectionsConfigs**
> Connectionsv3CreateConnectionsConfigsResponse connectionsServiceCreateConnectionsConfigs(connectionsv3CreateConnectionsConfigsRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceCreateConnectionsConfigsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceCreateConnectionsConfigsRequest = {
  
  connectionsv3CreateConnectionsConfigsRequest: {
    connectionId: "connectionId_example",
    streamConnection: {
      accountId: "accountId_example",
      accountName: "accountName_example",
      clusterResourceId: "clusterResourceId_example",
      consumerGroupName: "consumerGroupName_example",
      dbDnsEndpoint: "dbDnsEndpoint_example",
      dbName: "dbName_example",
      dbType: "dbType_example",
      name: "name_example",
      namespace: "namespace_example",
      password: "password_example",
      port: "port_example",
      provider: "provider_example",
      region: "region_example",
      startMonitor: "startMonitor_example",
      status: "UNDEFINED_STATUS",
      statusText: "statusText_example",
      statusTimestamp: "statusTimestamp_example",
      storageConnectionString: "storageConnectionString_example",
      username: "username_example",
    },
    type: "UNDEFINED_TYPE",
    ucConnection: {
      alias: "alias_example",
      configId: "configId_example",
      datasourceType: "datasourceType_example",
      edgeDeploymentServer: {
        id: "id_example",
        name: "name_example",
      },
      filterAlias: "filterAlias_example",
      host: "host_example",
      inputAlias: "inputAlias_example",
      lastResponse: "lastResponse_example",
      port: "port_example",
      status: "UNDEFINED_STATUS",
      statusText: "statusText_example",
      ucConnectionId: "ucConnectionId_example",
    },
  },
};

const data = await apiInstance.connectionsServiceCreateConnectionsConfigs(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreateConnectionsConfigsRequest** | **Connectionsv3CreateConnectionsConfigsRequest**|  |


### Return type

**Connectionsv3CreateConnectionsConfigsResponse**

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

# **connectionsServiceCreatePlugin**
> Connectionsv3CreatePluginResponse connectionsServiceCreatePlugin(connectionsv3CreatePluginRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceCreatePluginRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceCreatePluginRequest = {
  
  connectionsv3CreatePluginRequest: {
    datasourceType: "datasourceType_example",
    developerName: "developerName_example",
    documentLink: "documentLink_example",
    logfile: "logfile_example",
    name: "name_example",
    readme: "readme_example",
    records: [
      {
        guardRecordName: "guardRecordName_example",
        value: "value_example",
      },
    ],
    supportedInputs: [
      "supportedInputs_example",
    ],
    version: "version_example",
    versionTested: "versionTested_example",
  },
};

const data = await apiInstance.connectionsServiceCreatePlugin(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreatePluginRequest** | **Connectionsv3CreatePluginRequest**|  |


### Return type

**Connectionsv3CreatePluginResponse**

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

# **connectionsServiceCreateSettings**
> any connectionsServiceCreateSettings(connectionsv3CreateSettingsRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceCreateSettingsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceCreateSettingsRequest = {
  
  connectionsv3CreateSettingsRequest: {
    settings: [
      {
        description: "description_example",
        filters: [
          {
            id: "id_example",
            values: [
              "values_example",
            ],
          },
        ],
        headers: [
          "headers_example",
        ],
        id: "id_example",
        name: "name_example",
        order: "NONE",
        sortedBy: "sortedBy_example",
      },
    ],
  },
};

const data = await apiInstance.connectionsServiceCreateSettings(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3CreateSettingsRequest** | **Connectionsv3CreateSettingsRequest**|  |


### Return type

**any**

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

# **connectionsServiceDeleteConnectionsAccounts**
> Connectionsv3DeleteConnectionsAccountsResponse connectionsServiceDeleteConnectionsAccounts()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceDeleteConnectionsAccountsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceDeleteConnectionsAccountsRequest = {
    // Account id.
  accountId: "account_id_example",
};

const data = await apiInstance.connectionsServiceDeleteConnectionsAccounts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**string**] | Account id. | defaults to undefined


### Return type

**Connectionsv3DeleteConnectionsAccountsResponse**

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

# **connectionsServiceDeleteConnectionsConfigs**
> Connectionsv3DeleteConnectionsConfigsResponse connectionsServiceDeleteConnectionsConfigs()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceDeleteConnectionsConfigsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceDeleteConnectionsConfigsRequest = {
    // Connection id.
  connectionId: "connection_id_example",
};

const data = await apiInstance.connectionsServiceDeleteConnectionsConfigs(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**string**] | Connection id. | defaults to undefined


### Return type

**Connectionsv3DeleteConnectionsConfigsResponse**

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

# **connectionsServiceDeleteConnector**
> any connectionsServiceDeleteConnector()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceDeleteConnectorRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceDeleteConnectorRequest = {
    // The connection id
  connectionId: "connection_id_example",
};

const data = await apiInstance.connectionsServiceDeleteConnector(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionId** | [**string**] | The connection id | defaults to undefined


### Return type

**any**

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

# **connectionsServiceDeletePlugin**
> Connectionsv3DeletePluginResponse connectionsServiceDeletePlugin()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceDeletePluginRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceDeletePluginRequest = {
    // plugin id
  id: "id_example",
};

const data = await apiInstance.connectionsServiceDeletePlugin(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | plugin id | defaults to undefined


### Return type

**Connectionsv3DeletePluginResponse**

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

# **connectionsServiceGeneratePackage**
> Connectionsv3GeneratePackageResponse connectionsServiceGeneratePackage(connectionsv3GeneratePackageRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceGeneratePackageRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceGeneratePackageRequest = {
    // id
  id: "id_example",
  
  connectionsv3GeneratePackageRequest: {
    datasourceType: "datasourceType_example",
    developerName: "developerName_example",
    documentLink: "documentLink_example",
    id: "id_example",
    logfile: "logfile_example",
    name: "name_example",
    readme: "readme_example",
    records: [
      {
        guardRecordName: "guardRecordName_example",
        value: "value_example",
      },
    ],
    state: "state_example",
    supportedInputs: [
      "supportedInputs_example",
    ],
    version: "version_example",
    versionTested: "versionTested_example",
  },
};

const data = await apiInstance.connectionsServiceGeneratePackage(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3GeneratePackageRequest** | **Connectionsv3GeneratePackageRequest**|  |
 **id** | [**string**] | id | defaults to undefined


### Return type

**Connectionsv3GeneratePackageResponse**

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

# **connectionsServiceGetBannerState**
> Connectionsv3GetBannerStateResponse connectionsServiceGetBannerState()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request = {};

const data = await apiInstance.connectionsServiceGetBannerState(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Connectionsv3GetBannerStateResponse**

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

# **connectionsServiceGetConnectionsAccounts**
> Connectionsv3GetConnectionsAccountsResponse connectionsServiceGetConnectionsAccounts()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceGetConnectionsAccountsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceGetConnectionsAccountsRequest = {
    // Optional: account id. (optional)
  accountId: "account_id_example",
    // Optional: acccount access key. (optional)
  accessKey: "access_key_example",
};

const data = await apiInstance.connectionsServiceGetConnectionsAccounts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**string**] | Optional: account id. | (optional) defaults to undefined
 **accessKey** | [**string**] | Optional: acccount access key. | (optional) defaults to undefined


### Return type

**Connectionsv3GetConnectionsAccountsResponse**

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

# **connectionsServiceGetConnectionsConfigs**
> Connectionsv3GetConnectionsConfigsResponse connectionsServiceGetConnectionsConfigs()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceGetConnectionsConfigsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceGetConnectionsConfigsRequest = {
    // The type of connector. (optional)
  type: "UNDEFINED_TYPE",
    // Optional: if connection id did not provide then return all connections. (optional)
  connectionId: "connection_id_example",
};

const data = await apiInstance.connectionsServiceGetConnectionsConfigs(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**&#39;UNDEFINED_TYPE&#39; | &#39;AWS&#39; | &#39;AZURE&#39; | &#39;UC&#39; | &#39;STAP&#39;**]**Array<&#39;UNDEFINED_TYPE&#39; &#124; &#39;AWS&#39; &#124; &#39;AZURE&#39; &#124; &#39;UC&#39; &#124; &#39;STAP&#39;>** | The type of connector. | (optional) defaults to 'UNDEFINED_TYPE'
 **connectionId** | [**string**] | Optional: if connection id did not provide then return all connections. | (optional) defaults to undefined


### Return type

**Connectionsv3GetConnectionsConfigsResponse**

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

# **connectionsServiceGetConnectionsWithFilters**
> Connectionsv3GetConnectionsWithFiltersResponse connectionsServiceGetConnectionsWithFilters(connectionsv3GetConnectionsWithFiltersRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceGetConnectionsWithFiltersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceGetConnectionsWithFiltersRequest = {
  
  connectionsv3GetConnectionsWithFiltersRequest: {
    calculateFacets: true,
    calculatePresetStats: true,
    calculateTotal: true,
    fetchSize: 1,
    filters: [
      {
        id: "id_example",
        values: [
          "values_example",
        ],
      },
    ],
    headers: [
      "headers_example",
    ],
    offset: 1,
    order: "NONE",
    search: "search_example",
    sortBy: "sortBy_example",
  },
};

const data = await apiInstance.connectionsServiceGetConnectionsWithFilters(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3GetConnectionsWithFiltersRequest** | **Connectionsv3GetConnectionsWithFiltersRequest**|  |


### Return type

**Connectionsv3GetConnectionsWithFiltersResponse**

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

# **connectionsServiceGetConnectorsSummary**
> Connectionsv3GetConnectorsSummaryResponse connectionsServiceGetConnectorsSummary()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request = {};

const data = await apiInstance.connectionsServiceGetConnectorsSummary(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Connectionsv3GetConnectorsSummaryResponse**

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

# **connectionsServiceGetDataSources**
> Connectionsv3GetDataSourcesResponse connectionsServiceGetDataSources()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request = {};

const data = await apiInstance.connectionsServiceGetDataSources(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Connectionsv3GetDataSourcesResponse**

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

# **connectionsServiceGetGuardRecordFields**
> Connectionsv3GetGuardRecordFieldsResponse connectionsServiceGetGuardRecordFields()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request = {};

const data = await apiInstance.connectionsServiceGetGuardRecordFields(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Connectionsv3GetGuardRecordFieldsResponse**

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

# **connectionsServiceGetHeaders**
> Connectionsv3GetHeadersResponse connectionsServiceGetHeaders()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request = {};

const data = await apiInstance.connectionsServiceGetHeaders(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Connectionsv3GetHeadersResponse**

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

# **connectionsServiceGetPlugins**
> Connectionsv3GetPluginsResponse connectionsServiceGetPlugins()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceGetPluginsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceGetPluginsRequest = {
    // Optional: if no plug-in id is provided, returns list of all plug-ins. (optional)
  id: "id_example",
};

const data = await apiInstance.connectionsServiceGetPlugins(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | Optional: if no plug-in id is provided, returns list of all plug-ins. | (optional) defaults to undefined


### Return type

**Connectionsv3GetPluginsResponse**

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

# **connectionsServiceGetSettings**
> Connectionsv3GetSettingsResponse connectionsServiceGetSettings()


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request = {};

const data = await apiInstance.connectionsServiceGetSettings(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Connectionsv3GetSettingsResponse**

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

# **connectionsServicePartialUpdateConnectors**
> Connectionsv3PartialUpdateConnectorsResponse connectionsServicePartialUpdateConnectors(connectionsv3PartialUpdateConnectorsRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServicePartialUpdateConnectorsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServicePartialUpdateConnectorsRequest = {
  
  connectionsv3PartialUpdateConnectorsRequest: {
    connectors: [
      {
        columns: [
          {
            id: "id_example",
            values: [
              "values_example",
            ],
          },
        ],
        id: "id_example",
        lastResponse: "lastResponse_example",
        tags: [
          "tags_example",
        ],
      },
    ],
  },
};

const data = await apiInstance.connectionsServicePartialUpdateConnectors(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3PartialUpdateConnectorsRequest** | **Connectionsv3PartialUpdateConnectorsRequest**|  |


### Return type

**Connectionsv3PartialUpdateConnectorsResponse**

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

# **connectionsServicePostStapCommand**
> Connectionsv3StatusResponseBase connectionsServicePostStapCommand(connectionsv3StapCommandRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServicePostStapCommandRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServicePostStapCommandRequest = {
  
  connectionsv3StapCommandRequest: {
    command: "command_example",
    operation: "STAP_REINITIALIZE_BUFFER",
    stapId: "stapId_example",
  },
};

const data = await apiInstance.connectionsServicePostStapCommand(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3StapCommandRequest** | **Connectionsv3StapCommandRequest**|  |


### Return type

**Connectionsv3StatusResponseBase**

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

# **connectionsServiceUpdateBannerState**
> Connectionsv3UpdateBannerStateResponse connectionsServiceUpdateBannerState(connectionsv3UpdateBannerStateRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceUpdateBannerStateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceUpdateBannerStateRequest = {
  
  connectionsv3UpdateBannerStateRequest: {
    hideObjectVerbBanner: true,
  },
};

const data = await apiInstance.connectionsServiceUpdateBannerState(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateBannerStateRequest** | **Connectionsv3UpdateBannerStateRequest**|  |


### Return type

**Connectionsv3UpdateBannerStateResponse**

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

# **connectionsServiceUpdateConnectionsAccounts**
> Connectionsv3UpdateConnectionsAccountsResponse connectionsServiceUpdateConnectionsAccounts(connectionsv3UpdateConnectionsAccountsRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceUpdateConnectionsAccountsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceUpdateConnectionsAccountsRequest = {
  
  connectionsv3UpdateConnectionsAccountsRequest: {
    account: {
      accessKey: "accessKey_example",
      authenticationType: "authenticationType_example",
      connectionType: "connectionType_example",
      name: "name_example",
      roleArn: "roleArn_example",
      secretAccessKey: "secretAccessKey_example",
    },
    accountId: "accountId_example",
  },
};

const data = await apiInstance.connectionsServiceUpdateConnectionsAccounts(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateConnectionsAccountsRequest** | **Connectionsv3UpdateConnectionsAccountsRequest**|  |


### Return type

**Connectionsv3UpdateConnectionsAccountsResponse**

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

# **connectionsServiceUpdateConnectionsConfigs**
> Connectionsv3UpdateConnectionsConfigsResponse connectionsServiceUpdateConnectionsConfigs(connectionsv3UpdateConnectionsConfigsRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceUpdateConnectionsConfigsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceUpdateConnectionsConfigsRequest = {
  
  connectionsv3UpdateConnectionsConfigsRequest: {
    streamConnectionConfigs: [
      {
        connectionId: "connectionId_example",
        streamConnection: {
          accountId: "accountId_example",
          accountName: "accountName_example",
          clusterResourceId: "clusterResourceId_example",
          consumerGroupName: "consumerGroupName_example",
          dbDnsEndpoint: "dbDnsEndpoint_example",
          dbName: "dbName_example",
          dbType: "dbType_example",
          name: "name_example",
          namespace: "namespace_example",
          password: "password_example",
          port: "port_example",
          provider: "provider_example",
          region: "region_example",
          startMonitor: "startMonitor_example",
          status: "UNDEFINED_STATUS",
          statusText: "statusText_example",
          statusTimestamp: "statusTimestamp_example",
          storageConnectionString: "storageConnectionString_example",
          username: "username_example",
        },
      },
    ],
    type: "UNDEFINED_TYPE",
    ucConnectionConfigs: [
      {
        connectionId: "connectionId_example",
        ucConnectionSummary: {
          alias: "alias_example",
          configId: "configId_example",
          datasourceType: "datasourceType_example",
          edgeDeploymentServer: {
            id: "id_example",
            name: "name_example",
          },
          filterAlias: "filterAlias_example",
          host: "host_example",
          inputAlias: "inputAlias_example",
          lastResponse: "lastResponse_example",
          port: "port_example",
          status: "UNDEFINED_STATUS",
          statusText: "statusText_example",
          ucConnectionId: "ucConnectionId_example",
        },
      },
    ],
  },
};

const data = await apiInstance.connectionsServiceUpdateConnectionsConfigs(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateConnectionsConfigsRequest** | **Connectionsv3UpdateConnectionsConfigsRequest**|  |


### Return type

**Connectionsv3UpdateConnectionsConfigsResponse**

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

# **connectionsServiceUpdateConnectors**
> any connectionsServiceUpdateConnectors(connectionsv3UpdateConnectorsRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceUpdateConnectorsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceUpdateConnectorsRequest = {
  
  connectionsv3UpdateConnectorsRequest: {
    connectors: [
      {
        columns: [
          {
            id: "id_example",
            values: [
              "values_example",
            ],
          },
        ],
        id: "id_example",
        tags: [
          "tags_example",
        ],
        type: "UNDEFINED_TYPE",
      },
    ],
  },
};

const data = await apiInstance.connectionsServiceUpdateConnectors(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateConnectorsRequest** | **Connectionsv3UpdateConnectorsRequest**|  |


### Return type

**any**

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

# **connectionsServiceUpdatePlugin**
> Connectionsv3UpdatePluginResponse connectionsServiceUpdatePlugin(connectionsv3UpdatePluginRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceUpdatePluginRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceUpdatePluginRequest = {
    // id
  id: "id_example",
  
  connectionsv3UpdatePluginRequest: {
    datasourceType: "datasourceType_example",
    developerName: "developerName_example",
    documentLink: "documentLink_example",
    id: "id_example",
    logfile: "logfile_example",
    name: "name_example",
    readme: "readme_example",
    records: [
      {
        guardRecordName: "guardRecordName_example",
        value: "value_example",
      },
    ],
    state: "state_example",
    supportedInputs: [
      "supportedInputs_example",
    ],
    version: "version_example",
    versionTested: "versionTested_example",
  },
};

const data = await apiInstance.connectionsServiceUpdatePlugin(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdatePluginRequest** | **Connectionsv3UpdatePluginRequest**|  |
 **id** | [**string**] | id | defaults to undefined


### Return type

**Connectionsv3UpdatePluginResponse**

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

# **connectionsServiceUpdateSettings**
> any connectionsServiceUpdateSettings(connectionsv3UpdateSettingsRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceUpdateSettingsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceUpdateSettingsRequest = {
  
  connectionsv3UpdateSettingsRequest: {
    settings: [
      {
        description: "description_example",
        filters: [
          {
            id: "id_example",
            values: [
              "values_example",
            ],
          },
        ],
        headers: [
          "headers_example",
        ],
        id: "id_example",
        name: "name_example",
        order: "NONE",
        sortedBy: "sortedBy_example",
      },
    ],
  },
};

const data = await apiInstance.connectionsServiceUpdateSettings(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3UpdateSettingsRequest** | **Connectionsv3UpdateSettingsRequest**|  |


### Return type

**any**

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

# **connectionsServiceValidateAwsConnection**
> Connectionsv3ValidateConnectionResponse connectionsServiceValidateAwsConnection(connectionsv3ValidateAwsConnectionRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceValidateAwsConnectionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceValidateAwsConnectionRequest = {
  
  connectionsv3ValidateAwsConnectionRequest: {
    accessKey: "accessKey_example",
    bucketName: "bucketName_example",
    groupName: "groupName_example",
    inputPluginType: "inputPluginType_example",
    queueUrl: "queueUrl_example",
    region: "region_example",
    secretKey: "secretKey_example",
  },
};

const data = await apiInstance.connectionsServiceValidateAwsConnection(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3ValidateAwsConnectionRequest** | **Connectionsv3ValidateAwsConnectionRequest**|  |


### Return type

**Connectionsv3ValidateConnectionResponse**

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

# **connectionsServiceValidateAzureConnection**
> Connectionsv3ValidateConnectionResponse connectionsServiceValidateAzureConnection(connectionsv3ValidateAzureConnectionRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceValidateAzureConnectionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceValidateAzureConnectionRequest = {
  
  connectionsv3ValidateAzureConnectionRequest: {
    eventHubName: "eventHubName_example",
    storageConnectionString: "storageConnectionString_example",
  },
};

const data = await apiInstance.connectionsServiceValidateAzureConnection(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3ValidateAzureConnectionRequest** | **Connectionsv3ValidateAzureConnectionRequest**|  |


### Return type

**Connectionsv3ValidateConnectionResponse**

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

# **connectionsServiceValidateGcpConnection**
> Connectionsv3ValidateConnectionResponse connectionsServiceValidateGcpConnection(connectionsv3ValidateGcpConnectionRequest)


### Example


```typescript
import { createConfiguration, ConnectionsServiceApi } from '';
import type { ConnectionsServiceApiConnectionsServiceValidateGcpConnectionRequest } from '';

const configuration = createConfiguration();
const apiInstance = new ConnectionsServiceApi(configuration);

const request: ConnectionsServiceApiConnectionsServiceValidateGcpConnectionRequest = {
  
  connectionsv3ValidateGcpConnectionRequest: {
    clientEmail: "clientEmail_example",
    privateKey: "privateKey_example",
    projectId: "projectId_example",
    subscription: "subscription_example",
    topic: "topic_example",
  },
};

const data = await apiInstance.connectionsServiceValidateGcpConnection(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectionsv3ValidateGcpConnectionRequest** | **Connectionsv3ValidateGcpConnectionRequest**|  |


### Return type

**Connectionsv3ValidateConnectionResponse**

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


