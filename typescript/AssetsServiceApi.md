# .AssetsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetsServiceAssetIngestion**](AssetsServiceApi.md#assetsServiceAssetIngestion) | **POST** /api/v3/assets/ingestion | AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
[**assetsServiceAssetIngestionManualTrigger**](AssetsServiceApi.md#assetsServiceAssetIngestionManualTrigger) | **POST** /api/v3/assets/ingestion/trigger | AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
[**assetsServiceCancelCSVImport**](AssetsServiceApi.md#assetsServiceCancelCSVImport) | **DELETE** /api/v3/assets/csv/cancel/{csv_id} | CancelCSVImport - Cancel the import of CSV and update the status in import log table
[**assetsServiceClonePolicy**](AssetsServiceApi.md#assetsServiceClonePolicy) | **POST** /api/v3/assets/policies/{policy_id}/clone | ClonePolicy - Clone a policy.
[**assetsServiceCompareCSVToExistingAssets**](AssetsServiceApi.md#assetsServiceCompareCSVToExistingAssets) | **GET** /api/v3/assets/csv/compare/{csv_id} | CompareCSVToExistingAssets - Compare CSV with existing assets and return list of assets(existing/to be imported/both) on demand from csv.
[**assetsServiceCreateUpdatePolicy**](AssetsServiceApi.md#assetsServiceCreateUpdatePolicy) | **POST** /api/v3/assets/policies | CreateUpdatePolicy - Create/update new Policy.
[**assetsServiceDeleteFilterTemplateForAssets**](AssetsServiceApi.md#assetsServiceDeleteFilterTemplateForAssets) | **DELETE** /api/v3/assets/filters/template/{template_id} | DeleteFilterTemplateForAssets - Deleting a template using TemplateID in manage assets.
[**assetsServiceDeletePolicies**](AssetsServiceApi.md#assetsServiceDeletePolicies) | **DELETE** /api/v3/assets/policies | DeletePolicies - Delete Policy returns response code and message.
[**assetsServiceFetchAssetChangeLog**](AssetsServiceApi.md#assetsServiceFetchAssetChangeLog) | **POST** /api/v3/assets/logs | FetchAssetChangeLog - Fetch the logs for any actions performed on assets.
[**assetsServiceFetchAssetDashboard**](AssetsServiceApi.md#assetsServiceFetchAssetDashboard) | **GET** /api/v3/assets/dashboard/{widget_type} | FetchAssetDashboard - Gets Filter Templates for Dshboard Widgets.
[**assetsServiceFetchAssetList**](AssetsServiceApi.md#assetsServiceFetchAssetList) | **POST** /api/v3/assets | FetchAssetList - Asset Fetch Api .
[**assetsServiceFetchAssetsForMergeSplit**](AssetsServiceApi.md#assetsServiceFetchAssetsForMergeSplit) | **GET** /api/v3/assets/configuration | FetchAssetsForMergeSplit : Fetch assets for Merge and Split.
[**assetsServiceFindAssetName**](AssetsServiceApi.md#assetsServiceFindAssetName) | **GET** /api/v3/assets/name | FindAssetName - Checks if the given Asset Name has already been assigned to an asset.
[**assetsServiceGetAssetOverview**](AssetsServiceApi.md#assetsServiceGetAssetOverview) | **GET** /api/v3/assets/overview | GetAssetOverview - Get asset overview widgets data for a particular asset.
[**assetsServiceGetAssetTopology**](AssetsServiceApi.md#assetsServiceGetAssetTopology) | **POST** /api/v3/assets/topology | GetAssetTopology- Get list of topology for a parent asset.
[**assetsServiceGetFilterTemplateForAssets**](AssetsServiceApi.md#assetsServiceGetFilterTemplateForAssets) | **GET** /api/v3/assets/filters/templates | GetFilterTemplateForAssets - Get list of filters query templates for manage assets.
[**assetsServiceGetFiltersForAssets**](AssetsServiceApi.md#assetsServiceGetFiltersForAssets) | **GET** /api/v3/assets/filters | GetFiltersForAssets - Get a list of filters category and sub category with all data.
[**assetsServiceImportCSV**](AssetsServiceApi.md#assetsServiceImportCSV) | **POST** /api/v3/assets/csv/import/{csv_id} | ImportCSV - Start the async asset import from CSV by starting the db procedure and send notification at the end.
[**assetsServiceListPolicy**](AssetsServiceApi.md#assetsServiceListPolicy) | **GET** /api/v3/assets/policies | ListPolicy - List all policies.
[**assetsServiceListRule**](AssetsServiceApi.md#assetsServiceListRule) | **GET** /api/v3/assets/policies/{policy_id}/rules | ListRule - List all rules for a policy.
[**assetsServiceListTagDomains**](AssetsServiceApi.md#assetsServiceListTagDomains) | **GET** /api/v3/assets/tags/categories | ListTagDomains - Get Tag categories by request parameters .
[**assetsServiceListTags**](AssetsServiceApi.md#assetsServiceListTags) | **GET** /api/v3/assets/tags | ListTags - Get Tags for Manage Tags listing screen .
[**assetsServiceMergeOrSplitAssets**](AssetsServiceApi.md#assetsServiceMergeOrSplitAssets) | **POST** /api/v3/assets/configuration | MergeOrSplitAssets - Merge or split the selected assets.
[**assetsServiceSaveAssignedTags**](AssetsServiceApi.md#assetsServiceSaveAssignedTags) | **POST** /api/v3/assets/tags/assign | SaveAssignedTags - Save Assigned Tags to TAG_DSDEF_MAP table.
[**assetsServiceSaveTagConceptData**](AssetsServiceApi.md#assetsServiceSaveTagConceptData) | **POST** /api/v3/assets/tags | SaveTagConceptData - creates a custom tag
[**assetsServiceSaveTagDomainData**](AssetsServiceApi.md#assetsServiceSaveTagDomainData) | **POST** /api/v3/assets/tags/categories | SaveTagDomainData - creates a custom category to be assigned to a tag
[**assetsServiceSaveUpdateFilterTemplateForAssets**](AssetsServiceApi.md#assetsServiceSaveUpdateFilterTemplateForAssets) | **POST** /api/v3/assets/filters/templates | SaveUpdateFilterTemplateForAssets - Save/Update a filters query to use as template in manage assets along with reordering of template list.
[**assetsServiceSetBannerState**](AssetsServiceApi.md#assetsServiceSetBannerState) | **PUT** /api/v3/assets/banner | SetBannerState - Set banner state for asset inventory page.
[**assetsServiceUpdateAssetName**](AssetsServiceApi.md#assetsServiceUpdateAssetName) | **PUT** /api/v3/assets/name | UpdateAssetName - Udates the name of the asset as given by the user.
[**assetsServiceUpdatePolicy**](AssetsServiceApi.md#assetsServiceUpdatePolicy) | **PUT** /api/v3/assets/policies | UpdatePolicy - Update existing Policy status.


# **assetsServiceAssetIngestion**
> Assetsv3AssetIngestionResponse assetsServiceAssetIngestion(assetsv3AssetIngestionRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceAssetIngestionRequest = {
  // Assetsv3AssetIngestionRequest
  assetsv3AssetIngestionRequest: {
    accounts: [
      {
        accountType: "accountType_example",
        description: "description_example",
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        name: "name_example",
        resolutionKey: "resolutionKey_example",
      },
    ],
    applications: [
      {
        appId: "appId_example",
        applicationDatabase: [
          {
            identifier: "identifier_example",
          },
        ],
        applicationEndpoint: [
          {
            identifier: "identifier_example",
          },
        ],
        applicationHost: [
          {
            identifier: "identifier_example",
          },
        ],
        applicationIp: [
          {
            identifier: "identifier_example",
          },
        ],
        applicationName: "applicationName_example",
        applicationStorage: [
          {
            identifier: "identifier_example",
          },
        ],
        applicationSubType: "applicationSubType_example",
        applicationSubscription: [
          {
            identifier: "identifier_example",
          },
        ],
        applicationType: "applicationType_example",
        category: "category_example",
        criticality: "LEVEL_UNKNOWN",
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        lastUsed: new Date('1970-01-01T00:00:00.00Z'),
        owner: [
          "owner_example",
        ],
        parentApplication: "parentApplication_example",
        resolutionKey: "resolutionKey_example",
        riskLevel: "LEVEL_UNKNOWN",
        serviceType: "serviceType_example",
        version: "version_example",
      },
    ],
    databases: [
      {
        catalog: "catalog_example",
        criticality: "LEVEL_UNKNOWN",
        databaseHost: [
          {
            identifier: "identifier_example",
          },
        ],
        databaseIp: [
          {
            identifier: "identifier_example",
          },
        ],
        databaseName: "databaseName_example",
        databaseSubType: "databaseSubType_example",
        databaseSubscription: [
          {
            identifier: "identifier_example",
          },
        ],
        databaseType: "databaseType_example",
        description: "description_example",
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        owner: [
          "owner_example",
        ],
        resolutionKey: "resolutionKey_example",
        riskLevel: "LEVEL_UNKNOWN",
        schemaName: "schemaName_example",
        serviceName: "serviceName_example",
      },
    ],
    deployments: [
      {
        city: "city_example",
        country: "country_example",
        criticality: "LEVEL_UNKNOWN",
        dataCenter: "dataCenter_example",
        deploymentAccount: [
          {
            identifier: "identifier_example",
          },
        ],
        deploymentId: "deploymentId_example",
        deploymentSubscription: [
          {
            identifier: "identifier_example",
          },
        ],
        dns: "dns_example",
        environment: "environment_example",
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        name: "name_example",
        region: "region_example",
        resolutionKey: "resolutionKey_example",
        riskLevel: "LEVEL_UNKNOWN",
        service: "service_example",
        state: "state_example",
        type: "type_example",
      },
    ],
    endpoints: [
      {
        criticality: "LEVEL_UNKNOWN",
        endpointHost: [
          {
            identifier: "identifier_example",
          },
        ],
        endpointIp: [
          {
            identifier: "identifier_example",
          },
        ],
        endpointName: "endpointName_example",
        endpointSubType: "endpointSubType_example",
        endpointType: "endpointType_example",
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        isAccessUrl: true,
        os: "os_example",
        owner: [
          "owner_example",
        ],
        resolutionKey: "resolutionKey_example",
        riskLevel: "LEVEL_UNKNOWN",
      },
    ],
    hosts: [
      {
        city: "city_example",
        country: "country_example",
        dataCenter: "dataCenter_example",
        description: "description_example",
        dns: "dns_example",
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        hostIp: [
          {
            identifier: "identifier_example",
          },
        ],
        hostName: "hostName_example",
        hostPort: [
          {
            identifier: "identifier_example",
          },
        ],
        region: "region_example",
        resolutionKey: "resolutionKey_example",
        state: "state_example",
      },
    ],
    ips: [
      {
        city: "city_example",
        country: "country_example",
        dataCenter: "dataCenter_example",
        description: "description_example",
        dns: "dns_example",
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        ipAddress: "ipAddress_example",
        ipPort: [
          {
            identifier: "identifier_example",
          },
        ],
        macAddress: "macAddress_example",
        region: "region_example",
        resolutionKey: "resolutionKey_example",
        state: "state_example",
        version: "version_example",
      },
    ],
    models: [
      {
        criticality: "LEVEL_UNKNOWN",
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        hasTrainingData: true,
        lastTrained: new Date('1970-01-01T00:00:00.00Z'),
        modelApplication: [
          {
            identifier: "identifier_example",
          },
        ],
        modelDeployment: [
          {
            identifier: "identifier_example",
          },
        ],
        modelId: "modelId_example",
        modelName: "modelName_example",
        modelResources: [
          {
            identifier: "identifier_example",
          },
        ],
        modelSubType: "modelSubType_example",
        modelType: "modelType_example",
        publisher: "publisher_example",
        resolutionKey: "resolutionKey_example",
        riskLevel: "LEVEL_UNKNOWN",
        version: "version_example",
      },
    ],
    origin: "origin_example",
    ports: [
      {
        description: "description_example",
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        portNumber: "portNumber_example",
        protocol: "protocol_example",
        protocolVersion: "protocolVersion_example",
        resolutionKey: "resolutionKey_example",
      },
    ],
    resources: [
      {
        creationDate: new Date('1970-01-01T00:00:00.00Z'),
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        location: "location_example",
        name: "name_example",
        resolutionKey: "resolutionKey_example",
        resourcesAccount: [
          {
            identifier: "identifier_example",
          },
        ],
        sensitivities: [
          {
            category: "category_example",
            count: 1,
            name: "name_example",
          },
        ],
        size: "size_example",
        type: "type_example",
      },
    ],
    storages: [
      {
        city: "city_example",
        country: "country_example",
        criticality: "LEVEL_UNKNOWN",
        dataCenter: "dataCenter_example",
        dns: "dns_example",
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        folderPath: "folderPath_example",
        owner: [
          "owner_example",
        ],
        region: "region_example",
        resolutionKey: "resolutionKey_example",
        riskLevel: "LEVEL_UNKNOWN",
        size: "size_example",
        state: "state_example",
        storageAccount: [
          {
            identifier: "identifier_example",
          },
        ],
        storageHost: [
          {
            identifier: "identifier_example",
          },
        ],
        storageId: "storageId_example",
        storageIp: [
          {
            identifier: "identifier_example",
          },
        ],
        storageName: "storageName_example",
        storageResources: [
          {
            identifier: "identifier_example",
          },
        ],
        storageSubType: "storageSubType_example",
        storageSubscription: [
          {
            identifier: "identifier_example",
          },
        ],
        storageType: "storageType_example",
      },
    ],
    subscriptions: [
      {
        duration: "duration_example",
        endTime: new Date('1970-01-01T00:00:00.00Z'),
        extendedProperties: [
          {
            dataType: "dataType_example",
            key: "key_example",
            value: "value_example",
          },
        ],
        name: "name_example",
        resolutionKey: "resolutionKey_example",
        startTime: new Date('1970-01-01T00:00:00.00Z'),
        subscriptionAccount: [
          {
            identifier: "identifier_example",
          },
        ],
        subscriptionId: "subscriptionId_example",
        type: "type_example",
      },
    ],
  },
};

apiInstance.assetsServiceAssetIngestion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3AssetIngestionRequest** | **Assetsv3AssetIngestionRequest**|  |


### Return type

**Assetsv3AssetIngestionResponse**

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

# **assetsServiceAssetIngestionManualTrigger**
> Assetsv3AssetIngestionResponse assetsServiceAssetIngestionManualTrigger(body)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceAssetIngestionManualTriggerRequest = {
  // any
  body: {},
};

apiInstance.assetsServiceAssetIngestionManualTrigger(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **any**|  |


### Return type

**Assetsv3AssetIngestionResponse**

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

# **assetsServiceCancelCSVImport**
> any assetsServiceCancelCSVImport()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceCancelCSVImportRequest = {
  // string | unique id of the csv
  csvId: "csv_id_example",
};

apiInstance.assetsServiceCancelCSVImport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **csvId** | [**string**] | unique id of the csv | defaults to undefined


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

# **assetsServiceClonePolicy**
> any assetsServiceClonePolicy(assetsv3ClonePolicyRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceClonePolicyRequest = {
  // string | Policy id that needs to be cloned.
  policyId: "policy_id_example",
  // Assetsv3ClonePolicyRequest
  assetsv3ClonePolicyRequest: {
    policyId: "policyId_example",
    policyName: "policyName_example",
    rules: [
      {
        actions: [
          {
            destCategory: "destCategory_example",
            destType: "destType_example",
            destValue: "destValue_example",
          },
        ],
        isDelete: 1,
        parameters: [
          {
            assetAttribute: "assetAttribute_example",
            attributeEnum: "attributeEnum_example",
            condition: "condition_example",
            conditionCategory: "conditionCategory_example",
            conditionValue: "conditionValue_example",
          },
        ],
        policyId: "policyId_example",
        ruleId: "ruleId_example",
        ruleName: "ruleName_example",
        ruleType: "ACCESS",
      },
    ],
  },
};

apiInstance.assetsServiceClonePolicy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3ClonePolicyRequest** | **Assetsv3ClonePolicyRequest**|  |
 **policyId** | [**string**] | Policy id that needs to be cloned. | defaults to undefined


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

# **assetsServiceCompareCSVToExistingAssets**
> Assetsv3CompareCSVResponse assetsServiceCompareCSVToExistingAssets()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceCompareCSVToExistingAssetsRequest = {
  // string | unique id of the csv
  csvId: "csv_id_example",
  // string | which rows are required, existing or new or all. (optional)
  rowsRequired: "rows_required_example",
  // number | page number. (optional)
  pageNumber: 1,
  // number | page size. (optional)
  pageSize: 1,
  // 'DATABASE' | Asset CSV template type.   - DATABASE: Template for database (optional)
  templateType: "DATABASE",
};

apiInstance.assetsServiceCompareCSVToExistingAssets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **csvId** | [**string**] | unique id of the csv | defaults to undefined
 **rowsRequired** | [**string**] | which rows are required, existing or new or all. | (optional) defaults to undefined
 **pageNumber** | [**number**] | page number. | (optional) defaults to undefined
 **pageSize** | [**number**] | page size. | (optional) defaults to undefined
 **templateType** | [**&#39;DATABASE&#39;**]**Array<&#39;DATABASE&#39;>** | Asset CSV template type.   - DATABASE: Template for database | (optional) defaults to 'DATABASE'


### Return type

**Assetsv3CompareCSVResponse**

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

# **assetsServiceCreateUpdatePolicy**
> Assetsv3CreateUpdatePolicyResponse assetsServiceCreateUpdatePolicy(assetsv3CreateUpdatePolicyRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceCreateUpdatePolicyRequest = {
  // Assetsv3CreateUpdatePolicyRequest
  assetsv3CreateUpdatePolicyRequest: {
    operation: 1,
    policy: {
      activationStatus: 1,
      deletedRuleIds: [
        "deletedRuleIds_example",
      ],
      installedFlag: true,
      installedTimestamp: "installedTimestamp_example",
      lastEditedTimestamp: "lastEditedTimestamp_example",
      policyId: "policyId_example",
      policyName: "policyName_example",
      policySequence: 1,
      rules: [
        {
          actions: [
            {
              destCategory: "destCategory_example",
              destType: "destType_example",
              destValue: "destValue_example",
            },
          ],
          isDelete: 1,
          parameters: [
            {
              assetAttribute: "assetAttribute_example",
              attributeEnum: "attributeEnum_example",
              condition: "condition_example",
              conditionCategory: "conditionCategory_example",
              conditionValue: "conditionValue_example",
            },
          ],
          policyId: "policyId_example",
          ruleId: "ruleId_example",
          ruleName: "ruleName_example",
          ruleType: "ACCESS",
        },
      ],
      updatedRuleIds: [
        "updatedRuleIds_example",
      ],
    },
  },
};

apiInstance.assetsServiceCreateUpdatePolicy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3CreateUpdatePolicyRequest** | **Assetsv3CreateUpdatePolicyRequest**|  |


### Return type

**Assetsv3CreateUpdatePolicyResponse**

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

# **assetsServiceDeleteFilterTemplateForAssets**
> any assetsServiceDeleteFilterTemplateForAssets()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceDeleteFilterTemplateForAssetsRequest = {
  // string | template id to be deleted
  templateId: "template_id_example",
};

apiInstance.assetsServiceDeleteFilterTemplateForAssets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**string**] | template id to be deleted | defaults to undefined


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

# **assetsServiceDeletePolicies**
> any assetsServiceDeletePolicies()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceDeletePoliciesRequest = {
  // Array<string> | Policy ids. (optional)
  policyIds: [
    "policy_ids_example",
  ],
};

apiInstance.assetsServiceDeletePolicies(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyIds** | **Array&lt;string&gt;** | Policy ids. | (optional) defaults to undefined


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

# **assetsServiceFetchAssetChangeLog**
> Assetsv3FetchAssetChangeLogResponse assetsServiceFetchAssetChangeLog(assetsv3FetchAssetChangeLogRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceFetchAssetChangeLogRequest = {
  // Assetsv3FetchAssetChangeLogRequest
  assetsv3FetchAssetChangeLogRequest: {
    assetId: "assetId_example",
    filter: [
      {
        catagoryId: "catagoryId_example",
        dateRange: {
          end: "end_example",
          endNumber: 1,
          endUnit: "endUnit_example",
          error: "error_example",
          key: "key_example",
          start: "start_example",
          startNumber: 1,
          startUnit: "startUnit_example",
          type: "type_example",
        },
        selectedSubCatagoryList: [
          {
            selectedChildrenList: [
              {
                childId: "childId_example",
                childName: "childName_example",
              },
            ],
            subCatagoryId: "subCatagoryId_example",
            subCategoryValue: "subCategoryValue_example",
          },
        ],
        subCatagoryIds: [
          "subCatagoryIds_example",
        ],
        subCategoryValues: [
          "subCategoryValues_example",
        ],
        timelineValueSelected: "timelineValueSelected_example",
      },
    ],
    pageNumber: 1,
    pageSize: 1,
    searchKey: "searchKey_example",
    sort: "sort_example",
    sortBy: "sortBy_example",
  },
};

apiInstance.assetsServiceFetchAssetChangeLog(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3FetchAssetChangeLogRequest** | **Assetsv3FetchAssetChangeLogRequest**|  |


### Return type

**Assetsv3FetchAssetChangeLogResponse**

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

# **assetsServiceFetchAssetDashboard**
> Assetsv3FetchAssetDashboardResponse assetsServiceFetchAssetDashboard()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceFetchAssetDashboardRequest = {
  // string | ID of the Dashboard Widget
  widgetType: "widget_type_example",
  // string | start of date range for ui widget. (optional)
  dateRangeStart: "date_range.start_example",
  // string | end of date range for ui widget. (optional)
  dateRangeEnd: "date_range.end_example",
  // string | type of date range for ui widget. (optional)
  dateRangeType: "date_range.type_example",
  // string | key for ui widget. (optional)
  dateRangeKey: "date_range.key_example",
  // string | error for ui widget. (optional)
  dateRangeError: "date_range.error_example",
  // number | start_number for ui widget. (optional)
  dateRangeStartNumber: 1,
  // string | start of date range for ui widget. (optional)
  dateRangeStartUnit: "date_range.start_unit_example",
  // number | start of date range for ui widget. (optional)
  dateRangeEndNumber: 1,
  // string | start of date range for ui widget. (optional)
  dateRangeEndUnit: "date_range.end_unit_example",
  // string | Name of the timeline value selected from drop down. (optional)
  timelineValueSelected: "timeline_value_selected_example",
  // string | Tag ID. (optional)
  tagId: "tag_id_example",
};

apiInstance.assetsServiceFetchAssetDashboard(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **widgetType** | [**string**] | ID of the Dashboard Widget | defaults to undefined
 **dateRangeStart** | [**string**] | start of date range for ui widget. | (optional) defaults to undefined
 **dateRangeEnd** | [**string**] | end of date range for ui widget. | (optional) defaults to undefined
 **dateRangeType** | [**string**] | type of date range for ui widget. | (optional) defaults to undefined
 **dateRangeKey** | [**string**] | key for ui widget. | (optional) defaults to undefined
 **dateRangeError** | [**string**] | error for ui widget. | (optional) defaults to undefined
 **dateRangeStartNumber** | [**number**] | start_number for ui widget. | (optional) defaults to undefined
 **dateRangeStartUnit** | [**string**] | start of date range for ui widget. | (optional) defaults to undefined
 **dateRangeEndNumber** | [**number**] | start of date range for ui widget. | (optional) defaults to undefined
 **dateRangeEndUnit** | [**string**] | start of date range for ui widget. | (optional) defaults to undefined
 **timelineValueSelected** | [**string**] | Name of the timeline value selected from drop down. | (optional) defaults to undefined
 **tagId** | [**string**] | Tag ID. | (optional) defaults to undefined


### Return type

**Assetsv3FetchAssetDashboardResponse**

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

# **assetsServiceFetchAssetList**
> Assetsv3FetchAssetListResponse assetsServiceFetchAssetList(assetsv3FetchAssetListRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceFetchAssetListRequest = {
  // Assetsv3FetchAssetListRequest
  assetsv3FetchAssetListRequest: {
    columns: [
      "columns_example",
    ],
    filter: [
      {
        catagoryId: "catagoryId_example",
        dateRange: {
          end: "end_example",
          endNumber: 1,
          endUnit: "endUnit_example",
          error: "error_example",
          key: "key_example",
          start: "start_example",
          startNumber: 1,
          startUnit: "startUnit_example",
          type: "type_example",
        },
        selectedSubCatagoryList: [
          {
            selectedChildrenList: [
              {
                childId: "childId_example",
                childName: "childName_example",
              },
            ],
            subCatagoryId: "subCatagoryId_example",
            subCategoryValue: "subCategoryValue_example",
          },
        ],
        subCatagoryIds: [
          "subCatagoryIds_example",
        ],
        subCategoryValues: [
          "subCategoryValues_example",
        ],
        timelineValueSelected: "timelineValueSelected_example",
      },
    ],
    pageNumber: 1,
    pageSize: 1,
    parentId: "parentId_example",
    searchKey: "searchKey_example",
    sort: "sort_example",
    sortBy: "sortBy_example",
    viewType: "DB",
  },
};

apiInstance.assetsServiceFetchAssetList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3FetchAssetListRequest** | **Assetsv3FetchAssetListRequest**|  |


### Return type

**Assetsv3FetchAssetListResponse**

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

# **assetsServiceFetchAssetsForMergeSplit**
> Assetsv3FetchAssetsForMergeSplitResponse assetsServiceFetchAssetsForMergeSplit()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceFetchAssetsForMergeSplitRequest = {
  // string | Asset grouper Id. (optional)
  assetId: "asset_id_example",
  // number | Page number. (optional)
  pageNumber: 1,
  // number | Page size. (optional)
  pageSize: 1,
  // string | Action : merge or split. (optional)
  action: "action_example",
  // string | Search from the list based on asset name, database name, ip or host. (optional)
  searchKey: "search_key_example",
};

apiInstance.assetsServiceFetchAssetsForMergeSplit(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | [**string**] | Asset grouper Id. | (optional) defaults to undefined
 **pageNumber** | [**number**] | Page number. | (optional) defaults to undefined
 **pageSize** | [**number**] | Page size. | (optional) defaults to undefined
 **action** | [**string**] | Action : merge or split. | (optional) defaults to undefined
 **searchKey** | [**string**] | Search from the list based on asset name, database name, ip or host. | (optional) defaults to undefined


### Return type

**Assetsv3FetchAssetsForMergeSplitResponse**

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

# **assetsServiceFindAssetName**
> Assetsv3FindAssetNameResponse assetsServiceFindAssetName()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceFindAssetNameRequest = {
  // string | Name of asset. (optional)
  assetName: "asset_name_example",
};

apiInstance.assetsServiceFindAssetName(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetName** | [**string**] | Name of asset. | (optional) defaults to undefined


### Return type

**Assetsv3FindAssetNameResponse**

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

# **assetsServiceGetAssetOverview**
> Assetsv3AssetOverviewResponse assetsServiceGetAssetOverview()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceGetAssetOverviewRequest = {
  // string | Asset grouper Id. (optional)
  assetId: "asset_id_example",
  // number | Page number. (optional)
  pageNumber: 1,
  // number | Page size. (optional)
  size: 1,
  // 'ALL' | 'CLASSIFICATION' | 'TAG' | 'RESOURCE' | Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets. (optional)
  widget: "ALL",
  // string | Asset IP. (optional)
  ip: "ip_example",
  // string | Asset Host. (optional)
  host: "host_example",
  // string | Database Name. (optional)
  database: "database_example",
  // string | asset entity type. (optional)
  assetEntityType: "asset_entity_type_example",
};

apiInstance.assetsServiceGetAssetOverview(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | [**string**] | Asset grouper Id. | (optional) defaults to undefined
 **pageNumber** | [**number**] | Page number. | (optional) defaults to undefined
 **size** | [**number**] | Page size. | (optional) defaults to undefined
 **widget** | [**&#39;ALL&#39; | &#39;CLASSIFICATION&#39; | &#39;TAG&#39; | &#39;RESOURCE&#39;**]**Array<&#39;ALL&#39; &#124; &#39;CLASSIFICATION&#39; &#124; &#39;TAG&#39; &#124; &#39;RESOURCE&#39;>** | Widget type.   - ALL: All Asset Overview Widgets.  - CLASSIFICATION: Classification Asset Overview Widgets.  - TAG: Tag Asset Overview Widgets.  - RESOURCE: Resource Asset Overview Widgets. | (optional) defaults to 'ALL'
 **ip** | [**string**] | Asset IP. | (optional) defaults to undefined
 **host** | [**string**] | Asset Host. | (optional) defaults to undefined
 **database** | [**string**] | Database Name. | (optional) defaults to undefined
 **assetEntityType** | [**string**] | asset entity type. | (optional) defaults to undefined


### Return type

**Assetsv3AssetOverviewResponse**

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

# **assetsServiceGetAssetTopology**
> Assetsv3GetAssetTopologyResponse assetsServiceGetAssetTopology(assetsv3GetAssetTopologyRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceGetAssetTopologyRequest = {
  // Assetsv3GetAssetTopologyRequest
  assetsv3GetAssetTopologyRequest: {
    assetId: "assetId_example",
    type: "type_example",
  },
};

apiInstance.assetsServiceGetAssetTopology(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3GetAssetTopologyRequest** | **Assetsv3GetAssetTopologyRequest**|  |


### Return type

**Assetsv3GetAssetTopologyResponse**

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

# **assetsServiceGetFilterTemplateForAssets**
> Assetsv3GetFilterTemplateResponse assetsServiceGetFilterTemplateForAssets()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceGetFilterTemplateForAssetsRequest = {
  // string | template id to be deleted. (optional)
  templateId: "template_id_example",
};

apiInstance.assetsServiceGetFilterTemplateForAssets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**string**] | template id to be deleted. | (optional) defaults to undefined


### Return type

**Assetsv3GetFilterTemplateResponse**

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

# **assetsServiceGetFiltersForAssets**
> Assetsv3GetFiltersDataResponse assetsServiceGetFiltersForAssets()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:any = {};

apiInstance.assetsServiceGetFiltersForAssets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Assetsv3GetFiltersDataResponse**

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

# **assetsServiceImportCSV**
> Assetsv3ImportCSVResponse assetsServiceImportCSV(assetsv3ImportCSVRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceImportCSVRequest = {
  // string | unique id of the csv
  csvId: "csv_id_example",
  // Assetsv3ImportCSVRequest
  assetsv3ImportCSVRequest: {
    csvId: "csvId_example",
    importAction: "importAction_example",
    templateType: "DATABASE",
  },
};

apiInstance.assetsServiceImportCSV(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3ImportCSVRequest** | **Assetsv3ImportCSVRequest**|  |
 **csvId** | [**string**] | unique id of the csv | defaults to undefined


### Return type

**Assetsv3ImportCSVResponse**

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

# **assetsServiceListPolicy**
> Assetsv3ListPolicyResponse assetsServiceListPolicy()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:any = {};

apiInstance.assetsServiceListPolicy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Assetsv3ListPolicyResponse**

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

# **assetsServiceListRule**
> Assetsv3ListRuleResponse assetsServiceListRule()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceListRuleRequest = {
  // string | Policy ID
  policyId: "policy_id_example",
};

apiInstance.assetsServiceListRule(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | [**string**] | Policy ID | defaults to undefined


### Return type

**Assetsv3ListRuleResponse**

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

# **assetsServiceListTagDomains**
> Assetsv3ListTagDomainsResponse assetsServiceListTagDomains()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceListTagDomainsRequest = {
  // string | Optional: dom_grouper required if we want to fetch domains based on the group. (optional)
  domGrouper: "dom_grouper_example",
  // string | Optional: purpose required if we want to fetch domains based on the purpose. (optional)
  purpose: "purpose_example",
  // boolean | Optional: If we need Tag  based on the Domains. (optional)
  needTag: true,
};

apiInstance.assetsServiceListTagDomains(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domGrouper** | [**string**] | Optional: dom_grouper required if we want to fetch domains based on the group. | (optional) defaults to undefined
 **purpose** | [**string**] | Optional: purpose required if we want to fetch domains based on the purpose. | (optional) defaults to undefined
 **needTag** | [**boolean**] | Optional: If we need Tag  based on the Domains. | (optional) defaults to undefined


### Return type

**Assetsv3ListTagDomainsResponse**

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

# **assetsServiceListTags**
> Assetsv3ListTagsResponse assetsServiceListTags()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceListTagsRequest = {
  // Array<string> | asset id - Asset ID. (optional)
  assetId: [
    "asset_id_example",
  ],
};

apiInstance.assetsServiceListTags(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetId** | **Array&lt;string&gt;** | asset id - Asset ID. | (optional) defaults to undefined


### Return type

**Assetsv3ListTagsResponse**

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

# **assetsServiceMergeOrSplitAssets**
> any assetsServiceMergeOrSplitAssets(assetsv3MergeOrSplitAssetsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceMergeOrSplitAssetsRequest = {
  // Assetsv3MergeOrSplitAssetsRequest
  assetsv3MergeOrSplitAssetsRequest: {
    action: "action_example",
    destinationAssets: [
      {
        assetId: "assetId_example",
        assetName: "assetName_example",
        dsdefKey: [
          "dsdefKey_example",
        ],
      },
    ],
    sourceAsset: {
      assetId: "assetId_example",
      assetName: "assetName_example",
      dsdefKey: [
        "dsdefKey_example",
      ],
    },
  },
};

apiInstance.assetsServiceMergeOrSplitAssets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3MergeOrSplitAssetsRequest** | **Assetsv3MergeOrSplitAssetsRequest**|  |


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

# **assetsServiceSaveAssignedTags**
> any assetsServiceSaveAssignedTags(assetsv3SaveAssignedTagsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceSaveAssignedTagsRequest = {
  // Assetsv3SaveAssignedTagsRequest
  assetsv3SaveAssignedTagsRequest: {
    tagsAssigned: [
      {
        assetId: "assetId_example",
        tagId: [
          "tagId_example",
        ],
      },
    ],
  },
};

apiInstance.assetsServiceSaveAssignedTags(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveAssignedTagsRequest** | **Assetsv3SaveAssignedTagsRequest**|  |


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

# **assetsServiceSaveTagConceptData**
> any assetsServiceSaveTagConceptData(assetsv3SaveTagConceptDataRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceSaveTagConceptDataRequest = {
  // Assetsv3SaveTagConceptDataRequest
  assetsv3SaveTagConceptDataRequest: {
    tag: {
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creationTimeUtc: new Date('1970-01-01T00:00:00.00Z'),
      description: "description_example",
      domainId: "domainId_example",
      id: "id_example",
      isDelete: true,
      name: "name_example",
      properties: "properties_example",
      source: "source_example",
      updatedTime: new Date('1970-01-01T00:00:00.00Z'),
      utcOffset: 1,
    },
  },
};

apiInstance.assetsServiceSaveTagConceptData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveTagConceptDataRequest** | **Assetsv3SaveTagConceptDataRequest**|  |


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

# **assetsServiceSaveTagDomainData**
> any assetsServiceSaveTagDomainData(assetsv3SaveTagDomainDataRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceSaveTagDomainDataRequest = {
  // Assetsv3SaveTagDomainDataRequest
  assetsv3SaveTagDomainDataRequest: {
    category: {
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creationTimeUtc: new Date('1970-01-01T00:00:00.00Z'),
      description: "description_example",
      grouper: "grouper_example",
      id: "id_example",
      isDelete: true,
      mappedEntityName: "mappedEntityName_example",
      name: "name_example",
      properties: "properties_example",
      purpose: "purpose_example",
      tags: [
        {
          creationTime: new Date('1970-01-01T00:00:00.00Z'),
          creationTimeUtc: new Date('1970-01-01T00:00:00.00Z'),
          description: "description_example",
          domainId: "domainId_example",
          id: "id_example",
          isDelete: true,
          name: "name_example",
          properties: "properties_example",
          source: "source_example",
          updatedTime: new Date('1970-01-01T00:00:00.00Z'),
          utcOffset: 1,
        },
      ],
      updatedTime: new Date('1970-01-01T00:00:00.00Z'),
      utcOffset: 1,
    },
  },
};

apiInstance.assetsServiceSaveTagDomainData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveTagDomainDataRequest** | **Assetsv3SaveTagDomainDataRequest**|  |


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

# **assetsServiceSaveUpdateFilterTemplateForAssets**
> Assetsv3SaveUpdateFilterTemplateResponse assetsServiceSaveUpdateFilterTemplateForAssets(assetsv3SaveUpdateFilterTemplateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceSaveUpdateFilterTemplateForAssetsRequest = {
  // Assetsv3SaveUpdateFilterTemplateRequest
  assetsv3SaveUpdateFilterTemplateRequest: {
    isDefault: true,
    template: {
      colummnsList: [
        {
          _default: true,
          defaultOrder: 1,
          fixed: true,
          header: "header_example",
          id: "id_example",
          nlsKey: "nlsKey_example",
          select: true,
        },
      ],
      count: "count_example",
      createdBy: "createdBy_example",
      createdDate: "createdDate_example",
      dashboardTemplate: true,
      description: "description_example",
      id: "id_example",
      selectedFilters: [
        {
          catagoryId: "catagoryId_example",
          dateRange: {
            end: "end_example",
            endNumber: 1,
            endUnit: "endUnit_example",
            error: "error_example",
            key: "key_example",
            start: "start_example",
            startNumber: 1,
            startUnit: "startUnit_example",
            type: "type_example",
          },
          selectedSubCatagoryList: [
            {
              selectedChildrenList: [
                {
                  childId: "childId_example",
                  childName: "childName_example",
                },
              ],
              subCatagoryId: "subCatagoryId_example",
              subCategoryValue: "subCategoryValue_example",
            },
          ],
          subCatagoryIds: [
            "subCatagoryIds_example",
          ],
          subCategoryValues: [
            "subCategoryValues_example",
          ],
          timelineValueSelected: "timelineValueSelected_example",
        },
      ],
      templateId: "templateId_example",
      title: "title_example",
      updatedDate: "updatedDate_example",
    },
    templateIdsList: [
      "templateIdsList_example",
    ],
  },
};

apiInstance.assetsServiceSaveUpdateFilterTemplateForAssets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SaveUpdateFilterTemplateRequest** | **Assetsv3SaveUpdateFilterTemplateRequest**|  |


### Return type

**Assetsv3SaveUpdateFilterTemplateResponse**

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

# **assetsServiceSetBannerState**
> any assetsServiceSetBannerState(assetsv3SetBannerStateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceSetBannerStateRequest = {
  // Assetsv3SetBannerStateRequest
  assetsv3SetBannerStateRequest: {
    hideAssetsBanner: true,
  },
};

apiInstance.assetsServiceSetBannerState(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3SetBannerStateRequest** | **Assetsv3SetBannerStateRequest**|  |


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

# **assetsServiceUpdateAssetName**
> any assetsServiceUpdateAssetName(assetsv3UpdateAssetNameRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceUpdateAssetNameRequest = {
  // Assetsv3UpdateAssetNameRequest
  assetsv3UpdateAssetNameRequest: {
    grouperId: 1,
    updatedName: "updatedName_example",
  },
};

apiInstance.assetsServiceUpdateAssetName(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3UpdateAssetNameRequest** | **Assetsv3UpdateAssetNameRequest**|  |


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

# **assetsServiceUpdatePolicy**
> any assetsServiceUpdatePolicy(assetsv3UpdatePolicyRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceUpdatePolicyRequest = {
  // Assetsv3UpdatePolicyRequest
  assetsv3UpdatePolicyRequest: {
    policyId: [
      "policyId_example",
    ],
    updateActivationStatus: true,
  },
};

apiInstance.assetsServiceUpdatePolicy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3UpdatePolicyRequest** | **Assetsv3UpdatePolicyRequest**|  |


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


