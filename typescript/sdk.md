# .AnalyticsEventsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyticsEventsServiceDeleteCacheKey**](AnalyticsEventsServiceApi.md#analyticsEventsServiceDeleteCacheKey) | **DELETE** /api/v3/eventscache/{cache_key} | Summary: Delete cache key Description: Return delete key result message.
[**analyticsEventsServicePostQSAdvisorRisk**](AnalyticsEventsServiceApi.md#analyticsEventsServicePostQSAdvisorRisk) | **POST** /api/v3/risk/qs_advisor | Summary: For QS Advisor risk notification only Description: Sends QS Advisor risk notification with recipients and returns a status


# **analyticsEventsServiceDeleteCacheKey**
> Analyticseventsv3DeleteCacheKeyResponse analyticsEventsServiceDeleteCacheKey(analyticseventsv3DeleteCacheKeyRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AnalyticsEventsServiceApi(configuration);

let body:.AnalyticsEventsServiceApiAnalyticsEventsServiceDeleteCacheKeyRequest = {
  // string | The cache key to delete.
  cacheKey: "cache_key_example",
  // Analyticseventsv3DeleteCacheKeyRequest
  analyticseventsv3DeleteCacheKeyRequest: {
    cacheKey: "cacheKey_example",
  },
};

apiInstance.analyticsEventsServiceDeleteCacheKey(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyticseventsv3DeleteCacheKeyRequest** | **Analyticseventsv3DeleteCacheKeyRequest**|  |
 **cacheKey** | [**string**] | The cache key to delete. | defaults to undefined


### Return type

**Analyticseventsv3DeleteCacheKeyResponse**

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

# **analyticsEventsServicePostQSAdvisorRisk**
> Analyticseventsv3PostQSAdvisorRiskResponse analyticsEventsServicePostQSAdvisorRisk(analyticseventsv3PostQSAdvisorRiskRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AnalyticsEventsServiceApi(configuration);

let body:.AnalyticsEventsServiceApiAnalyticsEventsServicePostQSAdvisorRiskRequest = {
  // Analyticseventsv3PostQSAdvisorRiskRequest
  analyticseventsv3PostQSAdvisorRiskRequest: {
    origin: "UNDEFINED_ORIGIN",
    originData: "originData_example",
    targetReceivers: [
      {
        integrationId: "integrationId_example",
        label: "label_example",
        templateId: "templateId_example",
        type: "UNDEFINED_RECTYPE",
        value: "value_example",
      },
    ],
    templateData: {
      "key": "key_example",
    },
    title: "title_example",
  },
};

apiInstance.analyticsEventsServicePostQSAdvisorRisk(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analyticseventsv3PostQSAdvisorRiskRequest** | **Analyticseventsv3PostQSAdvisorRiskRequest**|  |


### Return type

**Analyticseventsv3PostQSAdvisorRiskResponse**

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





# .AssetsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetsServiceAssetIngestion**](AssetsServiceApi.md#assetsServiceAssetIngestion) | **POST** /api/v3/assets/ingestion | AssetIngestion - Asset Ingestion Api to ingest assets from different applications including asset extensibility assets.
[**assetsServiceAssetIngestionManualTrigger**](AssetsServiceApi.md#assetsServiceAssetIngestionManualTrigger) | **POST** /api/v3/assets/ingestion/trigger | AssetIngestionManualTrigger - Manual trigger for Scheduled Asset Ingestion of databases.
[**assetsServiceClonePolicy**](AssetsServiceApi.md#assetsServiceClonePolicy) | **POST** /api/v3/assets/policies/{policy_id}/clone | ClonePolicy - Clone a policy.
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
> any assetsServiceDeleteFilterTemplateForAssets(assetsv3AssetFilterTemplateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AssetsServiceApi(configuration);

let body:.AssetsServiceApiAssetsServiceDeleteFilterTemplateForAssetsRequest = {
  // string | template id to be deleted
  templateId: "template_id_example",
  // Assetsv3AssetFilterTemplateRequest
  assetsv3AssetFilterTemplateRequest: {
    templateId: "templateId_example",
  },
};

apiInstance.assetsServiceDeleteFilterTemplateForAssets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetsv3AssetFilterTemplateRequest** | **Assetsv3AssetFilterTemplateRequest**|  |
 **templateId** | [**string**] | template id to be deleted | defaults to undefined


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
  // string | asset ntity type. (optional)
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
 **assetEntityType** | [**string**] | asset ntity type. | (optional) defaults to undefined


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





# .AuditServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditServiceGetActivityRecords**](AuditServiceApi.md#auditServiceGetActivityRecords) | **GET** /api/v3/activity | Summary: Get activity records Description: Return activity records that match the arguments passed in the request.  Multiple values can be passed to the (UID, Context, ActionTaken, PerformedBy) fields by supplying a  comma-separated list to the corresponding fields in the request.  For instance to check for  multiple Contexts set the field to \&quot;op1, op2, op3\&quot;.
[**auditServicePutDownloadActivityRecord**](AuditServiceApi.md#auditServicePutDownloadActivityRecord) | **POST** /api/v3/activity | Summary: Put download activity record Description: Create an activity log record with the arguments passed in the request.


# **auditServiceGetActivityRecords**
> Auditv3GetActivityRecordsResponse auditServiceGetActivityRecords()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuditServiceApi(configuration);

let body:.AuditServiceApiAuditServiceGetActivityRecordsRequest = {
  // Date | Return records starting at this time (>=). (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | Return records ending before this time (<). (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
  // string | Return records with this service/collection id. (optional)
  uid: "uid_example",
  // string | Return records matching this operation (CRUD or other action). (optional)
  actionTaken: "action_taken_example",
  // string | Return records for this service/collection. (optional)
  context: "context_example",
  // string | Return records created only for this reason. (optional)
  changesMade: "changes_made_example",
  // string | Return records originating with the specified user id. (optional)
  performedBy: "performed_by_example",
  // string | Return records with this label. (optional)
  contextDescription: "context_description_example",
  // string | Return records based on the query. (optional)
  query: "query_example",
  // number | The amount to offset the rows by for pagination. (optional)
  offset: 1,
  // number | The max amount of rows to return for pagination. (optional)
  limit: 1,
  // boolean | Return eligable filters if this is true. (optional)
  filter: true,
};

apiInstance.auditServiceGetActivityRecords(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startTime** | [**Date**] | Return records starting at this time (&gt;&#x3D;). | (optional) defaults to undefined
 **endTime** | [**Date**] | Return records ending before this time (&lt;). | (optional) defaults to undefined
 **uid** | [**string**] | Return records with this service/collection id. | (optional) defaults to undefined
 **actionTaken** | [**string**] | Return records matching this operation (CRUD or other action). | (optional) defaults to undefined
 **context** | [**string**] | Return records for this service/collection. | (optional) defaults to undefined
 **changesMade** | [**string**] | Return records created only for this reason. | (optional) defaults to undefined
 **performedBy** | [**string**] | Return records originating with the specified user id. | (optional) defaults to undefined
 **contextDescription** | [**string**] | Return records with this label. | (optional) defaults to undefined
 **query** | [**string**] | Return records based on the query. | (optional) defaults to undefined
 **offset** | [**number**] | The amount to offset the rows by for pagination. | (optional) defaults to undefined
 **limit** | [**number**] | The max amount of rows to return for pagination. | (optional) defaults to undefined
 **filter** | [**boolean**] | Return eligable filters if this is true. | (optional) defaults to undefined


### Return type

**Auditv3GetActivityRecordsResponse**

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

# **auditServicePutDownloadActivityRecord**
> Auditv3PutActivityRecordResponse auditServicePutDownloadActivityRecord(auditv3PutActivityRecordRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuditServiceApi(configuration);

let body:.AuditServiceApiAuditServicePutDownloadActivityRecordRequest = {
  // Auditv3PutActivityRecordRequest
  auditv3PutActivityRecordRequest: {
    actionTaken: "actionTaken_example",
    changesMade: "changesMade_example",
    context: "context_example",
    contextDescription: "contextDescription_example",
    performedBy: "performedBy_example",
    uid: "uid_example",
  },
};

apiInstance.auditServicePutDownloadActivityRecord(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditv3PutActivityRecordRequest** | **Auditv3PutActivityRecordRequest**|  |


### Return type

**Auditv3PutActivityRecordResponse**

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





# .AuthServerServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authServerServiceCreateOauthClient**](AuthServerServiceApi.md#authServerServiceCreateOauthClient) | **POST** /api/v3/oauth/clients | Summary: Create Oauth client Description: Create/register new Oauth client.
[**authServerServiceDeleteOauthClient**](AuthServerServiceApi.md#authServerServiceDeleteOauthClient) | **DELETE** /api/v3/oauth/clients/{client_id} | Summary: Delete Oauth client Description: Delete registered Oauth client by clientId.
[**authServerServiceGetAccessToken**](AuthServerServiceApi.md#authServerServiceGetAccessToken) | **GET** /api/v3/oauth/token | Summary: Get access token Description: Get access token from passed clientId and secret.
[**authServerServiceGetOauthClient**](AuthServerServiceApi.md#authServerServiceGetOauthClient) | **GET** /api/v3/oauth/clients/{client_id} | Summary: Get Oauth client Description: Get registered Oauth client by clientId.
[**authServerServiceGetUser**](AuthServerServiceApi.md#authServerServiceGetUser) | **GET** /api/v3/auth/user | Summary: Get user Description: Get user.
[**authServerServiceListOauthClient**](AuthServerServiceApi.md#authServerServiceListOauthClient) | **GET** /api/v3/oauth/clients | Summary: List Oauth client Description: List all registered Oauth client.


# **authServerServiceCreateOauthClient**
> AuthserverCreateOauthClientResponse authServerServiceCreateOauthClient(authserverCreateOauthClientRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:.AuthServerServiceApiAuthServerServiceCreateOauthClientRequest = {
  // AuthserverCreateOauthClientRequest
  authserverCreateOauthClientRequest: {
    description: "description_example",
    name: "name_example",
  },
};

apiInstance.authServerServiceCreateOauthClient(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authserverCreateOauthClientRequest** | **AuthserverCreateOauthClientRequest**|  |


### Return type

**AuthserverCreateOauthClientResponse**

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

# **authServerServiceDeleteOauthClient**
> any authServerServiceDeleteOauthClient()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:.AuthServerServiceApiAuthServerServiceDeleteOauthClientRequest = {
  // string | ClientID of registered OAuth.
  clientId: "client_id_example",
};

apiInstance.authServerServiceDeleteOauthClient(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**string**] | ClientID of registered OAuth. | defaults to undefined


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

# **authServerServiceGetAccessToken**
> AuthserverGetAccessTokenResponse authServerServiceGetAccessToken()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:any = {};

apiInstance.authServerServiceGetAccessToken(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthserverGetAccessTokenResponse**

### Authorization

[BasicAuth](README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **authServerServiceGetOauthClient**
> AuthserverGetOauthClientResponse authServerServiceGetOauthClient()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:.AuthServerServiceApiAuthServerServiceGetOauthClientRequest = {
  // string | ClientID of registered OAuth.
  clientId: "client_id_example",
};

apiInstance.authServerServiceGetOauthClient(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**string**] | ClientID of registered OAuth. | defaults to undefined


### Return type

**AuthserverGetOauthClientResponse**

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

# **authServerServiceGetUser**
> AuthserverGetUserResponse authServerServiceGetUser()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:any = {};

apiInstance.authServerServiceGetUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthserverGetUserResponse**

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

# **authServerServiceListOauthClient**
> AuthserverListOauthClientResponse authServerServiceListOauthClient()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .AuthServerServiceApi(configuration);

let body:any = {};

apiInstance.authServerServiceListOauthClient(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthserverListOauthClientResponse**

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





# .CloudAccountsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAnalyzedRegion**](CloudAccountsApi.md#addAnalyzedRegion) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions | Add a new region for data classification
[**addCloudAccounts**](CloudAccountsApi.md#addCloudAccounts) | **POST** /api/v1/dspm/cloudAccounts/cloudProviders | Add cloud account connections to DSPM
[**generateAtlassianConfluenceAuthUrl**](CloudAccountsApi.md#generateAtlassianConfluenceAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-confluence/generateAuthUrl | Generate a Confluence authentication URL
[**generateAtlassianJiraAuthUrl**](CloudAccountsApi.md#generateAtlassianJiraAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/atlassian-jira/generateAuthUrl | Generate a JIRA authentication URL
[**generateAzureAuthUrl**](CloudAccountsApi.md#generateAzureAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/azure/generateAuthUrl | Generate azure authorization url
[**generateOffice365AuthUrl**](CloudAccountsApi.md#generateOffice365AuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/office365/generateAuthUrl | Generate a Microsoft 365 consent URL
[**generateSlackAuthUrl**](CloudAccountsApi.md#generateSlackAuthUrl) | **GET** /api/v1/dspm/cloudAccounts/saasApps/slack/generateAuthUrl | Generate a Slack authentication URL
[**generateSnowflakeAuthUrl**](CloudAccountsApi.md#generateSnowflakeAuthUrl) | **POST** /api/v1/dspm/cloudAccounts/saasApps/snowflake/generateAuthUrl | Validate and Generate a Snowflake OAuth URL
[**getAnalyzedRegionStatus**](CloudAccountsApi.md#getAnalyzedRegionStatus) | **GET** /api/v1/dspm/cloudAccounts/cloudProviders/analyzedRegions/status | Get the status of analyzer installation for a region
[**getAzureAdminConsentStatus**](CloudAccountsApi.md#getAzureAdminConsentStatus) | **GET** /api/v1/dspm/cloudAccounts/azure/getAdminConsentStatus | Get Azure admin consent status
[**getCloudAccountInstallationStatus**](CloudAccountsApi.md#getCloudAccountInstallationStatus) | **GET** /api/v1/dspm/cloudAccounts/{cloudProvider}/{cloudAccountId}/installationStatus | Get the installation status of a cloud account
[**getRefreshTokenExpiry**](CloudAccountsApi.md#getRefreshTokenExpiry) | **GET** /api/v1/dspm/cloudAccounts/saasApps/snowflake/getRefreshTokenExpiry/{providerId} | Get Snowflake Refresh Token Expiry date
[**listLinkedAccounts**](CloudAccountsApi.md#listLinkedAccounts) | **GET** /api/v1/dspm/cloudAccounts/linkedAccounts | List cloud accounts connected to DSPM
[**removeAccounts**](CloudAccountsApi.md#removeAccounts) | **DELETE** /api/v1/dspm/cloudAccounts/removeAccounts | Post cloud account ID connections to be removed
[**removeAccountsInstructions**](CloudAccountsApi.md#removeAccountsInstructions) | **GET** /api/v1/dspm/cloudAccounts/removeAccountsInstructions | Post cloud account IDs and get instructions to remove the accounts
[**retrieveServiceAccountId**](CloudAccountsApi.md#retrieveServiceAccountId) | **GET** /api/v1/dspm/cloudAccounts/saasApps/google/retrieveServiceAccountId | Get Google Workspace authentication
[**snowflakeIntegrationScript**](CloudAccountsApi.md#snowflakeIntegrationScript) | **GET** /api/v1/dspm/cloudAccounts/saasApps/snowflake/snowflakeIntegrationScript | Generate Snowflake Integration Script
[**submitGoogleWorkspaceAdminEmail**](CloudAccountsApi.md#submitGoogleWorkspaceAdminEmail) | **POST** /api/v1/dspm/cloudAccounts/saasApps/google/submitAdminEmail | Submit email for service account authorization
[**submitOffice365TenantInfo**](CloudAccountsApi.md#submitOffice365TenantInfo) | **POST** /api/v1/dspm/cloudAccounts/saasApps/office365/submitTenantInfo | Submit Microsoft 365 customer information
[**submitSlackAuthCode**](CloudAccountsApi.md#submitSlackAuthCode) | **POST** /api/v1/dspm/cloudAccounts/saasApps/slack/submitAuthCode | Submit a Slack authentication code
[**submitSnowflakeAuthCode**](CloudAccountsApi.md#submitSnowflakeAuthCode) | **POST** /api/v1/dspm/cloudAccounts/saasApps/snowflake/submitAuthCode | Submit Snowflake oAuth code


# **addAnalyzedRegion**
> AddAnalyzedRegion200Response addAnalyzedRegion(addAnalyzedRegionRequest)

Install a new analyzer in the specified region to enable data classification in that region.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiAddAnalyzedRegionRequest = {
  // AddAnalyzedRegionRequest
  addAnalyzedRegionRequest: {
    cloudProvider: "aws",
    region: "europe-west1",
    regions: [
      "regions_example",
    ],
    customerTags: [
      {
        key: "Owner",
        value: "polarsec",
      },
    ],
  },
};

apiInstance.addAnalyzedRegion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addAnalyzedRegionRequest** | **AddAnalyzedRegionRequest**|  |


### Return type

**AddAnalyzedRegion200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **addCloudAccounts**
> AddCloudAccounts200Response addCloudAccounts(addCloudAccountsRequest)

You can add a single or multiple cloud account connections from the same cloud provider.<BR>Adding these cloud account connections will trigger Guardium DSPM for data store discovery.<BR>To enable data classification, run the \'Add a new region for data classification\' API.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiAddCloudAccountsRequest = {
  // AddCloudAccountsRequest
  addCloudAccountsRequest: {
    cloudProvider: "aws",
    cloudAccounts: [
      {
        cloudAccountId: "123456789101",
        cloudAccountName: "my cloud account name",
        environment: "development",
      },
    ],
    mainAccountId: "mainAccountId_example",
  },
};

apiInstance.addCloudAccounts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addCloudAccountsRequest** | **AddCloudAccountsRequest**|  |


### Return type

**AddCloudAccounts200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateAtlassianConfluenceAuthUrl**
> AuthUrl generateAtlassianConfluenceAuthUrl()

Generate an Atlassian authentication URL for Confluence integration.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.generateAtlassianConfluenceAuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateAtlassianJiraAuthUrl**
> AuthUrl generateAtlassianJiraAuthUrl()

Generate an Atlassian authentication URL for JIRA integration.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.generateAtlassianJiraAuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateAzureAuthUrl**
> AuthUrl generateAzureAuthUrl()

Generate azure authorization url.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiGenerateAzureAuthUrlRequest = {
  // string | Tenant Id of the new Azure account, GUID format. (optional)
  tenantId: "tenantId_example",
};

apiInstance.generateAzureAuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Tenant Id of the new Azure account, GUID format. | (optional) defaults to undefined


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateOffice365AuthUrl**
> AuthUrl generateOffice365AuthUrl()

Generate an administrator consent URL for Microsoft 365 integration.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.generateOffice365AuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateSlackAuthUrl**
> AuthUrl generateSlackAuthUrl()

Generate a Slack authentication URL.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.generateSlackAuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **generateSnowflakeAuthUrl**
> AuthUrl generateSnowflakeAuthUrl(clientInfo)

Generate an administrator consent URL for Snowflake integration.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiGenerateSnowflakeAuthUrlRequest = {
  // ClientInfo
  clientInfo: {
    clientId: "clientId_example",
    clientSecret: "clientSecret_example",
    authEndpoint: "authEndpoint_example",
  },
};

apiInstance.generateSnowflakeAuthUrl(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientInfo** | **ClientInfo**|  |


### Return type

**AuthUrl**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getAnalyzedRegionStatus**
> GetAnalyzedRegionStatus200Response getAnalyzedRegionStatus()

Get the installation status of Guardium DSPM for a region.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiGetAnalyzedRegionStatusRequest = {
  // CloudServiceProvider | The cloud provider for the cloud account
  cloudProvider: "aws",
  // string | The region code
  region: "europe-west1",
};

apiInstance.getAnalyzedRegionStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProvider** | **CloudServiceProvider** | The cloud provider for the cloud account | defaults to undefined
 **region** | [**string**] | The region code | defaults to undefined


### Return type

**GetAnalyzedRegionStatus200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getAzureAdminConsentStatus**
> boolean getAzureAdminConsentStatus()

Get Azure admin consent status.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.getAzureAdminConsentStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**boolean**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | true if the customer has granted admin permissions, false otherwise |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getCloudAccountInstallationStatus**
> CloudAccountInstallationStatus getCloudAccountInstallationStatus()

Get the installation status of a cloud account.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiGetCloudAccountInstallationStatusRequest = {
  // CloudServiceProvider | The cloud provider of the cloud account
  cloudProvider: "aws",
  // string | The cloud account identifier
  cloudAccountId: "12345678910",
};

apiInstance.getCloudAccountInstallationStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProvider** | **CloudServiceProvider** | The cloud provider of the cloud account | defaults to undefined
 **cloudAccountId** | [**string**] | The cloud account identifier | defaults to undefined


### Return type

**CloudAccountInstallationStatus**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getRefreshTokenExpiry**
> TokenExpiryInfo getRefreshTokenExpiry()

Get Snowflake Refresh Token Expiry date.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiGetRefreshTokenExpiryRequest = {
  // string | The ID of the provider
  providerId: "providerId_example",
};

apiInstance.getRefreshTokenExpiry(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | [**string**] | The ID of the provider | defaults to undefined


### Return type

**TokenExpiryInfo**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listLinkedAccounts**
> Array<LinkedAccounts> listLinkedAccounts()

Get a list of all the connected cloud accounts monitored by Guardium DSPM.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.listLinkedAccounts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<LinkedAccounts>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **removeAccounts**
> void removeAccounts()

Post cloud account ID connections to be removed from Guardium DSPM.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiRemoveAccountsRequest = {
  // Array<string>
  accountIds: ["1234567891011"],
  // ServiceProvider
  serviceProvider: "aws",
};

apiInstance.removeAccounts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIds** | **Array&lt;string&gt;** |  | defaults to undefined
 **serviceProvider** | **ServiceProvider** |  | defaults to undefined


### Return type

**void**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**404** | Not Found |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **removeAccountsInstructions**
> RemoveAccountsInstructions200Response removeAccountsInstructions()

Post cloud accounts IDs and get instructions to remove the accounts from the cloud service provider.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiRemoveAccountsInstructionsRequest = {
  // Array<string>
  accountIds: ["1234567891011"],
  // ServiceProvider
  serviceProvider: "aws",
};

apiInstance.removeAccountsInstructions(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountIds** | **Array&lt;string&gt;** |  | defaults to undefined
 **serviceProvider** | **ServiceProvider** |  | defaults to undefined


### Return type

**RemoveAccountsInstructions200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | string |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**404** | Not Found |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **retrieveServiceAccountId**
> ServiceAccountClientId retrieveServiceAccountId()

Retrieve a service account ID to use it for Google Workspace authentication.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.retrieveServiceAccountId(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**ServiceAccountClientId**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **snowflakeIntegrationScript**
> Script snowflakeIntegrationScript()

Generate Snowflake integration Script.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:any = {};

apiInstance.snowflakeIntegrationScript(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Script**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **submitGoogleWorkspaceAdminEmail**
> ServiceAccountInstallationStatus submitGoogleWorkspaceAdminEmail(submitAdminEmailParams)

Submit admin email for service account authorization and return service-account authorization status.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiSubmitGoogleWorkspaceAdminEmailRequest = {
  // SubmitAdminEmailParams
  submitAdminEmailParams: {
    adminEmail: "admin@email.com",
  },
};

apiInstance.submitGoogleWorkspaceAdminEmail(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submitAdminEmailParams** | **SubmitAdminEmailParams**|  |


### Return type

**ServiceAccountInstallationStatus**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **submitOffice365TenantInfo**
> Office365TenantInfo submitOffice365TenantInfo(tenantInfo)

Submit customer information for Microsoft 365 integration.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiSubmitOffice365TenantInfoRequest = {
  // TenantInfo
  tenantInfo: {
    tenantId: "1234",
  },
};

apiInstance.submitOffice365TenantInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantInfo** | **TenantInfo**|  |


### Return type

**Office365TenantInfo**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **submitSlackAuthCode**
> any submitSlackAuthCode(submitAuthCode)

Submit a Slack authentication code.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiSubmitSlackAuthCodeRequest = {
  // SubmitAuthCode
  submitAuthCode: {
    code: "code_example",
  },
};

apiInstance.submitSlackAuthCode(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **submitAuthCode** | **SubmitAuthCode**|  |


### Return type

**any**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **submitSnowflakeAuthCode**
> void submitSnowflakeAuthCode(authInfo)

Storing code that is returned from Snowflake oAuth.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .CloudAccountsApi(configuration);

let body:.CloudAccountsApiSubmitSnowflakeAuthCodeRequest = {
  // AuthInfo
  authInfo: {
    code: "1234",
    providerId: "1234",
  },
};

apiInstance.submitSnowflakeAuthCode(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authInfo** | **AuthInfo**|  |


### Return type

**void**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**503** | Service Unavailable |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)





# .ComplianceAcceleratorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**complianceAcceleratorCreateWorkspace**](ComplianceAcceleratorApi.md#complianceAcceleratorCreateWorkspace) | **POST** /api/v3/compliance/workspace | Summary: Create workspace Description: Create a workspace.
[**complianceAcceleratorDeleteComplianceWorkspaces**](ComplianceAcceleratorApi.md#complianceAcceleratorDeleteComplianceWorkspaces) | **DELETE** /api/v3/compliance | Summary: Delete compliance workspaces Description: Delete workspaces.
[**complianceAcceleratorGetComplianceInfo**](ComplianceAcceleratorApi.md#complianceAcceleratorGetComplianceInfo) | **GET** /api/v3/compliance | Summary: Get compliance info Description: Return stored compliance data.
[**complianceAcceleratorHydrateWorkspace**](ComplianceAcceleratorApi.md#complianceAcceleratorHydrateWorkspace) | **POST** /api/v3/compliance/workspace/hydrate | HydrateWorkspace - Hydrates specified objects within a workspace
[**complianceAcceleratorStoreComplianceInfo**](ComplianceAcceleratorApi.md#complianceAcceleratorStoreComplianceInfo) | **POST** /api/v3/compliance | Summary: Store compliance info Description: Store compliance data.


# **complianceAcceleratorCreateWorkspace**
> StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse complianceAcceleratorCreateWorkspace(complianceacceleratorv3CreateWorkspaceRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ComplianceAcceleratorApi(configuration);

let body:.ComplianceAcceleratorApiComplianceAcceleratorCreateWorkspaceRequest = {
  // Complianceacceleratorv3CreateWorkspaceRequest
  complianceacceleratorv3CreateWorkspaceRequest: {
    complianceInfo: {
      options: {
        emailConfig: {
          integrationId: "integrationId_example",
          templateId: "templateId_example",
        },
        parentGroups: {
          "key": {
            desc: "desc_example",
            groupTypeId: 1,
            id: 1,
            members: [
              {
                memberId: "memberId_example",
                name: "name_example",
              },
            ],
            membersToAdd: [
              "membersToAdd_example",
            ],
            membersToDelete: [
              {
                memberId: "memberId_example",
                name: "name_example",
              },
            ],
            name: "name_example",
            parent: true,
          },
        },
        policyId: "policyId_example",
        rules: {
          "key": {
            actions: {
              "key": {
                notificationType: "UNDEFINED_RECTYPE",
                userIds: [
                  "userIds_example",
                ],
              },
            },
            ruleId: "ruleId_example",
          },
        },
        syslogConfig: {
          host: "host_example",
          includeQRadar: true,
          isDeletion: true,
          name: "name_example",
          port: "port_example",
          protocol: "protocol_example",
          syslogId: "syslogId_example",
          templateId: "templateId_example",
        },
        tasks: {
          "key": "UNDEFINED",
        },
      },
      workspaces: {
        "key": {
          auditInfo: {
            description: "description_example",
            enabled: true,
            id: "id_example",
            instructions: "instructions_example",
            isDeletion: true,
            name: "name_example",
            owner: {
              integrationId: "integrationId_example",
              label: "label_example",
              templateId: "templateId_example",
              type: "UNDEFINED_RECTYPE",
              value: "value_example",
            },
            recipients: [
              {
                integrationId: "integrationId_example",
                label: "label_example",
                templateId: "templateId_example",
                type: "UNDEFINED_RECTYPE",
                value: "value_example",
              },
            ],
            reportKey: "reportKey_example",
            runOnceNow: true,
            scheduler: {
              beginSchedule: new Date('1970-01-01T00:00:00.00Z'),
              byDayOfMonth: true,
              dayOfMonth: "dayOfMonth_example",
              dayOfWeek: [
                "UNDEFINED_DAY",
              ],
              dayOrder: "UNDEFINED_ORDER",
              dayOrderDayOfWeek: "UNDEFINED_DAY",
              endSchedule: new Date('1970-01-01T00:00:00.00Z'),
              frequency: "UNDEFINED_FREQUENCY",
              months: [
                "EVERYMONTH",
              ],
              neverEnd: true,
              repeat: 1,
              repeatBegin: {
                hour: 1,
                minute: 1,
                timezone: "timezone_example",
              },
              repeatEnd: {
                hour: 1,
                minute: 1,
                timezone: "timezone_example",
              },
            },
            tasks: [
              {
                auditType: "UNDEFINED_TYPE",
                deliveryMethod: {
                  fileFormat: "UNDEFINED_FORMAT",
                  reportTimeZone: "reportTimeZone_example",
                },
                distributionRuleIds: [
                  "distributionRuleIds_example",
                ],
                emailSubject: "emailSubject_example",
                instructions: "instructions_example",
                name: "name_example",
                parameter: {
                  dataImportParameter: {
                    extraDetail: "extraDetail_example",
                    integrationId: "integrationId_example",
                    templateId: "templateId_example",
                    value: "value_example",
                  },
                  reportParameter: {
                    extraDetail: "extraDetail_example",
                    reportId: "reportId_example",
                    reportName: "reportName_example",
                    runtimeParameters: [
                      {
                        key: "key_example",
                        label: "label_example",
                        operatorType: "UNDEFINED_OPERATOR_TYPE",
                        runtimeParameterType: "UNDEFINED_TYPE",
                        runtimeParameterTypeLength: 1,
                        value: "value_example",
                      },
                    ],
                    syncExecutionDate: true,
                  },
                },
                recipients: [
                  {
                    integrationId: "integrationId_example",
                    label: "label_example",
                    templateId: "templateId_example",
                    type: "UNDEFINED_RECTYPE",
                    value: "value_example",
                  },
                ],
                reportFilters: {
                  bracketsId: 1,
                  filterName: "filterName_example",
                  filtersArray: [
                    {
                      brackets: ,
                      condition: {
                        caseInsensitive: true,
                        fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
                        filterId: 1,
                        headerId: "headerId_example",
                        headerName: "headerName_example",
                        headerType: "UNDEFINED_TYPE",
                        inReportDateRange: {
                          endDate: "endDate_example",
                          endNumber: 1,
                          endUnit: "UNDEFINED_UINT_TYPE",
                          startDate: "startDate_example",
                          startNumber: 1,
                          startUnit: "UNDEFINED_UINT_TYPE",
                          type: "UNDEFINED_DATE_RANGE_TYPE",
                        },
                        inReportFieldNlsKey: "inReportFieldNlsKey_example",
                        inReportHeaderId: "inReportHeaderId_example",
                        inReportHeaderName: "inReportHeaderName_example",
                        inReportId: "inReportId_example",
                        inReportName: "inReportName_example",
                        inReportTableName: "inReportTableName_example",
                        operatorType: "UNDEFINED_OPERATOR_TYPE",
                        parameterType: "UNDEFINED_PARAM_TYPE",
                        schemaName: "schemaName_example",
                        sequence: 1,
                        tableName: "tableName_example",
                        values: [
                          "values_example",
                        ],
                      },
                    },
                  ],
                  havingArray: [
                    {
                      condition: {
                        aggregationType: "UNDEFINED_AGG_TYPE",
                        headerId: "headerId_example",
                        headerName: "headerName_example",
                        operatorType: "UNDEFINED_OPERATOR_TYPE",
                        tableName: "tableName_example",
                        value: "value_example",
                      },
                    },
                  ],
                  isCustom: true,
                  optionType: "UNDEFINED_OPTION_TYPE",
                  sequence: 1,
                },
                scheduledTaskId: "scheduledTaskId_example",
                type: "UNDEFINED_JOBTYPE",
                workflowInvestigationLinks: [
                  {
                    display: "display_example",
                    id: "id_example",
                    type: "type_example",
                  },
                ],
                workflowResponseTemplate: {
                  display: "display_example",
                  id: "id_example",
                  type: "type_example",
                },
                workflowType: "REVIEW_NONE",
                workflowUniqueFields: [
                  "workflowUniqueFields_example",
                ],
              },
            ],
          },
          dashboards: [
            {
              ID: "ID_example",
              type: "UNDEFINED_DASH",
            },
          ],
          groups: {
            "key": {
              desc: "desc_example",
              groupTypeId: 1,
              id: 1,
              members: [
                {
                  memberId: "memberId_example",
                  name: "name_example",
                },
              ],
              membersToAdd: [
                "membersToAdd_example",
              ],
              membersToDelete: [
                {
                  memberId: "memberId_example",
                  name: "name_example",
                },
              ],
              name: "name_example",
              parent: true,
            },
          },
          reportsMap: {
            "key": {
              reports: [
                {
                  description: "description_example",
                  groupsNeeded: [
                    {
                      desc: "desc_example",
                      groupTypeId: 1,
                      id: 1,
                      members: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      membersToAdd: [
                        "membersToAdd_example",
                      ],
                      membersToDelete: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      name: "name_example",
                      parent: true,
                    },
                  ],
                  groupsPresent: [
                    {
                      desc: "desc_example",
                      groupTypeId: 1,
                      id: 1,
                      members: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      membersToAdd: [
                        "membersToAdd_example",
                      ],
                      membersToDelete: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      name: "name_example",
                      parent: true,
                    },
                  ],
                  reportId: "reportId_example",
                  reportTags: [
                    {
                      nlsKey: "nlsKey_example",
                      nlsValue: "nlsValue_example",
                    },
                  ],
                  status: "POPULATED",
                  title: "title_example",
                },
              ],
            },
          },
        },
      },
    },
  },
};

apiInstance.complianceAcceleratorCreateWorkspace(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3CreateWorkspaceRequest** | **Complianceacceleratorv3CreateWorkspaceRequest**|  |


### Return type

**StreamResultOfComplianceacceleratorv3CreateWorkspaceResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **complianceAcceleratorDeleteComplianceWorkspaces**
> Complianceacceleratorv3DeleteComplianceWorkspacesResponse complianceAcceleratorDeleteComplianceWorkspaces()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ComplianceAcceleratorApi(configuration);

let body:.ComplianceAcceleratorApiComplianceAcceleratorDeleteComplianceWorkspacesRequest = {
  // Array<string> | Id to be deleted. (optional)
  regulations: [
    "regulations_example",
  ],
  // boolean | if you want to delete a whole configuration. (optional)
  deleteAll: true,
};

apiInstance.complianceAcceleratorDeleteComplianceWorkspaces(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regulations** | **Array&lt;string&gt;** | Id to be deleted. | (optional) defaults to undefined
 **deleteAll** | [**boolean**] | if you want to delete a whole configuration. | (optional) defaults to undefined


### Return type

**Complianceacceleratorv3DeleteComplianceWorkspacesResponse**

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

# **complianceAcceleratorGetComplianceInfo**
> Complianceacceleratorv3GetComplianceInfoResponse complianceAcceleratorGetComplianceInfo()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ComplianceAcceleratorApi(configuration);

let body:any = {};

apiInstance.complianceAcceleratorGetComplianceInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Complianceacceleratorv3GetComplianceInfoResponse**

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

# **complianceAcceleratorHydrateWorkspace**
> Complianceacceleratorv3HydrateComplianceWorkspacesResponse complianceAcceleratorHydrateWorkspace(complianceacceleratorv3HydrateComplianceWorkspacesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ComplianceAcceleratorApi(configuration);

let body:.ComplianceAcceleratorApiComplianceAcceleratorHydrateWorkspaceRequest = {
  // Complianceacceleratorv3HydrateComplianceWorkspacesRequest
  complianceacceleratorv3HydrateComplianceWorkspacesRequest: {
    complianceId: "complianceId_example",
  },
};

apiInstance.complianceAcceleratorHydrateWorkspace(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3HydrateComplianceWorkspacesRequest** | **Complianceacceleratorv3HydrateComplianceWorkspacesRequest**|  |


### Return type

**Complianceacceleratorv3HydrateComplianceWorkspacesResponse**

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

# **complianceAcceleratorStoreComplianceInfo**
> Complianceacceleratorv3StoreComplianceInfoResponse complianceAcceleratorStoreComplianceInfo(complianceacceleratorv3StoreComplianceInfoRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ComplianceAcceleratorApi(configuration);

let body:.ComplianceAcceleratorApiComplianceAcceleratorStoreComplianceInfoRequest = {
  // Complianceacceleratorv3StoreComplianceInfoRequest
  complianceacceleratorv3StoreComplianceInfoRequest: {
    complianceInfo: {
      options: {
        emailConfig: {
          integrationId: "integrationId_example",
          templateId: "templateId_example",
        },
        parentGroups: {
          "key": {
            desc: "desc_example",
            groupTypeId: 1,
            id: 1,
            members: [
              {
                memberId: "memberId_example",
                name: "name_example",
              },
            ],
            membersToAdd: [
              "membersToAdd_example",
            ],
            membersToDelete: [
              {
                memberId: "memberId_example",
                name: "name_example",
              },
            ],
            name: "name_example",
            parent: true,
          },
        },
        policyId: "policyId_example",
        rules: {
          "key": {
            actions: {
              "key": {
                notificationType: "UNDEFINED_RECTYPE",
                userIds: [
                  "userIds_example",
                ],
              },
            },
            ruleId: "ruleId_example",
          },
        },
        syslogConfig: {
          host: "host_example",
          includeQRadar: true,
          isDeletion: true,
          name: "name_example",
          port: "port_example",
          protocol: "protocol_example",
          syslogId: "syslogId_example",
          templateId: "templateId_example",
        },
        tasks: {
          "key": "UNDEFINED",
        },
      },
      workspaces: {
        "key": {
          auditInfo: {
            description: "description_example",
            enabled: true,
            id: "id_example",
            instructions: "instructions_example",
            isDeletion: true,
            name: "name_example",
            owner: {
              integrationId: "integrationId_example",
              label: "label_example",
              templateId: "templateId_example",
              type: "UNDEFINED_RECTYPE",
              value: "value_example",
            },
            recipients: [
              {
                integrationId: "integrationId_example",
                label: "label_example",
                templateId: "templateId_example",
                type: "UNDEFINED_RECTYPE",
                value: "value_example",
              },
            ],
            reportKey: "reportKey_example",
            runOnceNow: true,
            scheduler: {
              beginSchedule: new Date('1970-01-01T00:00:00.00Z'),
              byDayOfMonth: true,
              dayOfMonth: "dayOfMonth_example",
              dayOfWeek: [
                "UNDEFINED_DAY",
              ],
              dayOrder: "UNDEFINED_ORDER",
              dayOrderDayOfWeek: "UNDEFINED_DAY",
              endSchedule: new Date('1970-01-01T00:00:00.00Z'),
              frequency: "UNDEFINED_FREQUENCY",
              months: [
                "EVERYMONTH",
              ],
              neverEnd: true,
              repeat: 1,
              repeatBegin: {
                hour: 1,
                minute: 1,
                timezone: "timezone_example",
              },
              repeatEnd: {
                hour: 1,
                minute: 1,
                timezone: "timezone_example",
              },
            },
            tasks: [
              {
                auditType: "UNDEFINED_TYPE",
                deliveryMethod: {
                  fileFormat: "UNDEFINED_FORMAT",
                  reportTimeZone: "reportTimeZone_example",
                },
                distributionRuleIds: [
                  "distributionRuleIds_example",
                ],
                emailSubject: "emailSubject_example",
                instructions: "instructions_example",
                name: "name_example",
                parameter: {
                  dataImportParameter: {
                    extraDetail: "extraDetail_example",
                    integrationId: "integrationId_example",
                    templateId: "templateId_example",
                    value: "value_example",
                  },
                  reportParameter: {
                    extraDetail: "extraDetail_example",
                    reportId: "reportId_example",
                    reportName: "reportName_example",
                    runtimeParameters: [
                      {
                        key: "key_example",
                        label: "label_example",
                        operatorType: "UNDEFINED_OPERATOR_TYPE",
                        runtimeParameterType: "UNDEFINED_TYPE",
                        runtimeParameterTypeLength: 1,
                        value: "value_example",
                      },
                    ],
                    syncExecutionDate: true,
                  },
                },
                recipients: [
                  {
                    integrationId: "integrationId_example",
                    label: "label_example",
                    templateId: "templateId_example",
                    type: "UNDEFINED_RECTYPE",
                    value: "value_example",
                  },
                ],
                reportFilters: {
                  bracketsId: 1,
                  filterName: "filterName_example",
                  filtersArray: [
                    {
                      brackets: ,
                      condition: {
                        caseInsensitive: true,
                        fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
                        filterId: 1,
                        headerId: "headerId_example",
                        headerName: "headerName_example",
                        headerType: "UNDEFINED_TYPE",
                        inReportDateRange: {
                          endDate: "endDate_example",
                          endNumber: 1,
                          endUnit: "UNDEFINED_UINT_TYPE",
                          startDate: "startDate_example",
                          startNumber: 1,
                          startUnit: "UNDEFINED_UINT_TYPE",
                          type: "UNDEFINED_DATE_RANGE_TYPE",
                        },
                        inReportFieldNlsKey: "inReportFieldNlsKey_example",
                        inReportHeaderId: "inReportHeaderId_example",
                        inReportHeaderName: "inReportHeaderName_example",
                        inReportId: "inReportId_example",
                        inReportName: "inReportName_example",
                        inReportTableName: "inReportTableName_example",
                        operatorType: "UNDEFINED_OPERATOR_TYPE",
                        parameterType: "UNDEFINED_PARAM_TYPE",
                        schemaName: "schemaName_example",
                        sequence: 1,
                        tableName: "tableName_example",
                        values: [
                          "values_example",
                        ],
                      },
                    },
                  ],
                  havingArray: [
                    {
                      condition: {
                        aggregationType: "UNDEFINED_AGG_TYPE",
                        headerId: "headerId_example",
                        headerName: "headerName_example",
                        operatorType: "UNDEFINED_OPERATOR_TYPE",
                        tableName: "tableName_example",
                        value: "value_example",
                      },
                    },
                  ],
                  isCustom: true,
                  optionType: "UNDEFINED_OPTION_TYPE",
                  sequence: 1,
                },
                scheduledTaskId: "scheduledTaskId_example",
                type: "UNDEFINED_JOBTYPE",
                workflowInvestigationLinks: [
                  {
                    display: "display_example",
                    id: "id_example",
                    type: "type_example",
                  },
                ],
                workflowResponseTemplate: {
                  display: "display_example",
                  id: "id_example",
                  type: "type_example",
                },
                workflowType: "REVIEW_NONE",
                workflowUniqueFields: [
                  "workflowUniqueFields_example",
                ],
              },
            ],
          },
          dashboards: [
            {
              ID: "ID_example",
              type: "UNDEFINED_DASH",
            },
          ],
          groups: {
            "key": {
              desc: "desc_example",
              groupTypeId: 1,
              id: 1,
              members: [
                {
                  memberId: "memberId_example",
                  name: "name_example",
                },
              ],
              membersToAdd: [
                "membersToAdd_example",
              ],
              membersToDelete: [
                {
                  memberId: "memberId_example",
                  name: "name_example",
                },
              ],
              name: "name_example",
              parent: true,
            },
          },
          reportsMap: {
            "key": {
              reports: [
                {
                  description: "description_example",
                  groupsNeeded: [
                    {
                      desc: "desc_example",
                      groupTypeId: 1,
                      id: 1,
                      members: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      membersToAdd: [
                        "membersToAdd_example",
                      ],
                      membersToDelete: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      name: "name_example",
                      parent: true,
                    },
                  ],
                  groupsPresent: [
                    {
                      desc: "desc_example",
                      groupTypeId: 1,
                      id: 1,
                      members: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      membersToAdd: [
                        "membersToAdd_example",
                      ],
                      membersToDelete: [
                        {
                          memberId: "memberId_example",
                          name: "name_example",
                        },
                      ],
                      name: "name_example",
                      parent: true,
                    },
                  ],
                  reportId: "reportId_example",
                  reportTags: [
                    {
                      nlsKey: "nlsKey_example",
                      nlsValue: "nlsValue_example",
                    },
                  ],
                  status: "POPULATED",
                  title: "title_example",
                },
              ],
            },
          },
        },
      },
    },
  },
};

apiInstance.complianceAcceleratorStoreComplianceInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **complianceacceleratorv3StoreComplianceInfoRequest** | **Complianceacceleratorv3StoreComplianceInfoRequest**|  |


### Return type

**Complianceacceleratorv3StoreComplianceInfoResponse**

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


# **connectionsServiceCreateConnectionsAccounts**
> Connectionsv3CreateConnectionsAccountsResponse connectionsServiceCreateConnectionsAccounts(connectionsv3CreateConnectionsAccountsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceCreateConnectionsAccountsRequest = {
  // Connectionsv3CreateConnectionsAccountsRequest
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

apiInstance.connectionsServiceCreateConnectionsAccounts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceCreateConnectionsConfigsRequest = {
  // Connectionsv3CreateConnectionsConfigsRequest
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

apiInstance.connectionsServiceCreateConnectionsConfigs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceCreatePluginRequest = {
  // Connectionsv3CreatePluginRequest
  connectionsv3CreatePluginRequest: {
    datasourceType: "datasourceType_example",
    developerName: "developerName_example",
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
  },
};

apiInstance.connectionsServiceCreatePlugin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceCreateSettingsRequest = {
  // Connectionsv3CreateSettingsRequest
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

apiInstance.connectionsServiceCreateSettings(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceDeleteConnectionsAccountsRequest = {
  // string | Account id.
  accountId: "account_id_example",
};

apiInstance.connectionsServiceDeleteConnectionsAccounts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceDeleteConnectionsConfigsRequest = {
  // string | Connection id.
  connectionId: "connection_id_example",
};

apiInstance.connectionsServiceDeleteConnectionsConfigs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceDeleteConnectorRequest = {
  // string | The connection id
  connectionId: "connection_id_example",
};

apiInstance.connectionsServiceDeleteConnector(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceDeletePluginRequest = {
  // string | plugin id
  id: "id_example",
};

apiInstance.connectionsServiceDeletePlugin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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

# **connectionsServiceGetBannerState**
> Connectionsv3GetBannerStateResponse connectionsServiceGetBannerState()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:any = {};

apiInstance.connectionsServiceGetBannerState(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceGetConnectionsAccountsRequest = {
  // string | Optional: account id. (optional)
  accountId: "account_id_example",
  // string | Optional: acccount access key. (optional)
  accessKey: "access_key_example",
};

apiInstance.connectionsServiceGetConnectionsAccounts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceGetConnectionsConfigsRequest = {
  // 'UNDEFINED_TYPE' | 'AWS' | 'AZURE' | 'UC' | 'STAP' | The type of connector. (optional)
  type: "UNDEFINED_TYPE",
  // string | Optional: if connection id did not provide then return all connections. (optional)
  connectionId: "connection_id_example",
};

apiInstance.connectionsServiceGetConnectionsConfigs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceGetConnectionsWithFiltersRequest = {
  // Connectionsv3GetConnectionsWithFiltersRequest
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

apiInstance.connectionsServiceGetConnectionsWithFilters(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:any = {};

apiInstance.connectionsServiceGetConnectorsSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:any = {};

apiInstance.connectionsServiceGetDataSources(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:any = {};

apiInstance.connectionsServiceGetGuardRecordFields(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:any = {};

apiInstance.connectionsServiceGetHeaders(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceGetPluginsRequest = {
  // string | Optional: if no plug-in id is provided, returns list of all plug-ins. (optional)
  id: "id_example",
};

apiInstance.connectionsServiceGetPlugins(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:any = {};

apiInstance.connectionsServiceGetSettings(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServicePartialUpdateConnectorsRequest = {
  // Connectionsv3PartialUpdateConnectorsRequest
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

apiInstance.connectionsServicePartialUpdateConnectors(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServicePostStapCommandRequest = {
  // Connectionsv3StapCommandRequest
  connectionsv3StapCommandRequest: {
    command: "command_example",
    operation: "STAP_REINITIALIZE_BUFFER",
    stapId: "stapId_example",
  },
};

apiInstance.connectionsServicePostStapCommand(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceUpdateBannerStateRequest = {
  // Connectionsv3UpdateBannerStateRequest
  connectionsv3UpdateBannerStateRequest: {
    hideObjectVerbBanner: true,
  },
};

apiInstance.connectionsServiceUpdateBannerState(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceUpdateConnectionsAccountsRequest = {
  // Connectionsv3UpdateConnectionsAccountsRequest
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

apiInstance.connectionsServiceUpdateConnectionsAccounts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceUpdateConnectionsConfigsRequest = {
  // Connectionsv3UpdateConnectionsConfigsRequest
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

apiInstance.connectionsServiceUpdateConnectionsConfigs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceUpdateConnectorsRequest = {
  // Connectionsv3UpdateConnectorsRequest
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

apiInstance.connectionsServiceUpdateConnectors(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceUpdatePluginRequest = {
  // string | id
  id: "id_example",
  // Connectionsv3UpdatePluginRequest
  connectionsv3UpdatePluginRequest: {
    datasourceType: "datasourceType_example",
    developerName: "developerName_example",
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
  },
};

apiInstance.connectionsServiceUpdatePlugin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ConnectionsServiceApi(configuration);

let body:.ConnectionsServiceApiConnectionsServiceUpdateSettingsRequest = {
  // Connectionsv3UpdateSettingsRequest
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

apiInstance.connectionsServiceUpdateSettings(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
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





# .DashboardsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dashboardsServiceCreateDashboard**](DashboardsServiceApi.md#dashboardsServiceCreateDashboard) | **POST** /api/v3/dashboards | Summary: Create dashboard Description: Create a unique dashboard.
[**dashboardsServiceDeleteDashboard**](DashboardsServiceApi.md#dashboardsServiceDeleteDashboard) | **DELETE** /api/v3/dashboards/{dashboard_id} | Summary: Delete dashboard Description: Delete a unique dashboard.
[**dashboardsServiceGetDashboards**](DashboardsServiceApi.md#dashboardsServiceGetDashboards) | **GET** /api/v3/dashboards | Summary: Get dashboards Description: Get a list of dashboards with all data.
[**dashboardsServiceUpdateDashboard**](DashboardsServiceApi.md#dashboardsServiceUpdateDashboard) | **PUT** /api/v3/dashboards/{dashboard_id} | Summary: Update dashboard Description: Update a dashboard.


# **dashboardsServiceCreateDashboard**
> Dashboardsv3CreateDashboardResponse dashboardsServiceCreateDashboard(dashboardsv3Dashboard)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DashboardsServiceApi(configuration);

let body:.DashboardsServiceApiDashboardsServiceCreateDashboardRequest = {
  // Dashboardsv3Dashboard | Unique dashboard.
  dashboardsv3Dashboard: {
    cards: [
      {
        cardID: "cardID_example",
        cardPosition: {
          height: 3.14,
          width: 3.14,
          xPosition: 3.14,
          yPosition: 3.14,
        },
        cardType: "UNDEFINED_CARD_TYPE",
        excludedGlobalFilterIds: [
          "excludedGlobalFilterIds_example",
        ],
        reportParameters: {
          end: "end_example",
          id: "id_example",
          localTimeFilter: {
            end: "end_example",
            range: "range_example",
            start: "start_example",
          },
          menuItem: "menuItem_example",
          override: true,
          range: "range_example",
          regulation: "regulation_example",
          start: "start_example",
          tags: [
            {
              nlsKey: "nlsKey_example",
              nlsValue: "nlsValue_example",
            },
          ],
          title: "title_example",
        },
      },
    ],
    dashboardDescription: "dashboardDescription_example",
    dashboardId: "dashboardId_example",
    dashboardTitle: "dashboardTitle_example",
    globalTimeFilter: {
      end: "end_example",
      range: "range_example",
      start: "start_example",
    },
    reportGlobalFilterList: [
      {
        caseInsensitive: true,
        filterItemType: "filterItemType_example",
        groupName: "groupName_example",
        headerId: "headerId_example",
        headerType: "headerType_example",
        id: "id_example",
        name: "name_example",
        operator: "operator_example",
        operatorKey: "operatorKey_example",
        reportOperator: [
          {
            key: "key_example",
            label: "label_example",
            value: "value_example",
          },
        ],
      },
    ],
  },
};

apiInstance.dashboardsServiceCreateDashboard(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardsv3Dashboard** | **Dashboardsv3Dashboard**| Unique dashboard. |


### Return type

**Dashboardsv3CreateDashboardResponse**

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

# **dashboardsServiceDeleteDashboard**
> Dashboardsv3DeleteDashboardResponse dashboardsServiceDeleteDashboard(dashboardsv3DeleteDashboardRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DashboardsServiceApi(configuration);

let body:.DashboardsServiceApiDashboardsServiceDeleteDashboardRequest = {
  // string | The id of the dashboard to be deleted.
  dashboardId: "dashboard_id_example",
  // Dashboardsv3DeleteDashboardRequest
  dashboardsv3DeleteDashboardRequest: {
    dashboardId: "dashboardId_example",
  },
};

apiInstance.dashboardsServiceDeleteDashboard(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardsv3DeleteDashboardRequest** | **Dashboardsv3DeleteDashboardRequest**|  |
 **dashboardId** | [**string**] | The id of the dashboard to be deleted. | defaults to undefined


### Return type

**Dashboardsv3DeleteDashboardResponse**

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

# **dashboardsServiceGetDashboards**
> Dashboardsv3GetDashboardsResponse dashboardsServiceGetDashboards()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DashboardsServiceApi(configuration);

let body:any = {};

apiInstance.dashboardsServiceGetDashboards(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Dashboardsv3GetDashboardsResponse**

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

# **dashboardsServiceUpdateDashboard**
> Dashboardsv3UpdateDashboardResponse dashboardsServiceUpdateDashboard(dashboardsv3UpdateDashboardRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DashboardsServiceApi(configuration);

let body:.DashboardsServiceApiDashboardsServiceUpdateDashboardRequest = {
  // string | The id of the dashboard that was updated.
  dashboardId: "dashboard_id_example",
  // Dashboardsv3UpdateDashboardRequest
  dashboardsv3UpdateDashboardRequest: {
    dashboard: {
      cards: [
        {
          cardID: "cardID_example",
          cardPosition: {
            height: 3.14,
            width: 3.14,
            xPosition: 3.14,
            yPosition: 3.14,
          },
          cardType: "UNDEFINED_CARD_TYPE",
          excludedGlobalFilterIds: [
            "excludedGlobalFilterIds_example",
          ],
          reportParameters: {
            end: "end_example",
            id: "id_example",
            localTimeFilter: {
              end: "end_example",
              range: "range_example",
              start: "start_example",
            },
            menuItem: "menuItem_example",
            override: true,
            range: "range_example",
            regulation: "regulation_example",
            start: "start_example",
            tags: [
              {
                nlsKey: "nlsKey_example",
                nlsValue: "nlsValue_example",
              },
            ],
            title: "title_example",
          },
        },
      ],
      dashboardDescription: "dashboardDescription_example",
      dashboardId: "dashboardId_example",
      dashboardTitle: "dashboardTitle_example",
      globalTimeFilter: {
        end: "end_example",
        range: "range_example",
        start: "start_example",
      },
      reportGlobalFilterList: [
        {
          caseInsensitive: true,
          filterItemType: "filterItemType_example",
          groupName: "groupName_example",
          headerId: "headerId_example",
          headerType: "headerType_example",
          id: "id_example",
          name: "name_example",
          operator: "operator_example",
          operatorKey: "operatorKey_example",
          reportOperator: [
            {
              key: "key_example",
              label: "label_example",
              value: "value_example",
            },
          ],
        },
      ],
    },
    dashboardId: "dashboardId_example",
    updateHint: "updateHint_example",
    updateType: "UNDEFINED_UPDATE_TYPE",
  },
};

apiInstance.dashboardsServiceUpdateDashboard(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardsv3UpdateDashboardRequest** | **Dashboardsv3UpdateDashboardRequest**|  |
 **dashboardId** | [**string**] | The id of the dashboard that was updated. | defaults to undefined


### Return type

**Dashboardsv3UpdateDashboardResponse**

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





# .DatabootstrapperServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**databootstrapperServiceLoadData**](DatabootstrapperServiceApi.md#databootstrapperServiceLoadData) | **POST** /api/v3/databootstrapper/data | Summary: Load data Description: Load data for a tenant.


# **databootstrapperServiceLoadData**
> Databootstrapperv3LoadDataResponse databootstrapperServiceLoadData(databootstrapperv3LoadDataRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatabootstrapperServiceApi(configuration);

let body:.DatabootstrapperServiceApiDatabootstrapperServiceLoadDataRequest = {
  // Databootstrapperv3LoadDataRequest
  databootstrapperv3LoadDataRequest: {
    partNumber: "partNumber_example",
  },
};

apiInstance.databootstrapperServiceLoadData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **databootstrapperv3LoadDataRequest** | **Databootstrapperv3LoadDataRequest**|  |


### Return type

**Databootstrapperv3LoadDataResponse**

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





# .DatamartProcessorServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**datamartProcessorServiceGetDatamartInfo**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetDatamartInfo) | **GET** /api/v3/datamarts/info | Summary: Get datamarts Description: Return a list of files inside a datamart to the caller.
[**datamartProcessorServiceGetDatamarts**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetDatamarts) | **GET** /api/v3/datamarts | Summary: Get datamarts Description: Return a list of datamarts for a time interval to the caller.
[**datamartProcessorServiceGetEarliestStartTime**](DatamartProcessorServiceApi.md#datamartProcessorServiceGetEarliestStartTime) | **GET** /api/v3/datamarts/earliest_start_time | Summary: Get rarliest start time Description: Return the earliest time period of data available in database.
[**datamartProcessorServiceSendAllCompleteFilesToQueue**](DatamartProcessorServiceApi.md#datamartProcessorServiceSendAllCompleteFilesToQueue) | **POST** /api/v3/datamarts/repush_files | 
[**datamartProcessorServiceStoreExtractionLogs**](DatamartProcessorServiceApi.md#datamartProcessorServiceStoreExtractionLogs) | **POST** /api/v3/datamarts/{request_id}/dm_extraction_logs | Summary: Store extraction logs Description: Store the datamart extraction logs inside GI.
[**uploadDatamart**](DatamartProcessorServiceApi.md#uploadDatamart) | **POST** /api/v3/datamarts/upload | Summary: Upload datamart Description: Upload datamart file for ingestion.


# **datamartProcessorServiceGetDatamartInfo**
> Datamartprocessorv3GetDatamartInfoResponse datamartProcessorServiceGetDatamartInfo()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:.DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartInfoRequest = {
  // string | Ingestion id. (optional)
  ingestionId: "ingestion_id_example",
};

apiInstance.datamartProcessorServiceGetDatamartInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingestionId** | [**string**] | Ingestion id. | (optional) defaults to undefined


### Return type

**Datamartprocessorv3GetDatamartInfoResponse**

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

# **datamartProcessorServiceGetDatamarts**
> Datamartprocessorv3GetDatamartResponse datamartProcessorServiceGetDatamarts()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:.DatamartProcessorServiceApiDatamartProcessorServiceGetDatamartsRequest = {
  // Date | Data starting time period in UTC. (optional)
  periodStart: new Date('1970-01-01T00:00:00.00Z'),
  // Date | Data ending time period in UTC. (optional)
  periodEnd: new Date('1970-01-01T00:00:00.00Z'),
};

apiInstance.datamartProcessorServiceGetDatamarts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **periodStart** | [**Date**] | Data starting time period in UTC. | (optional) defaults to undefined
 **periodEnd** | [**Date**] | Data ending time period in UTC. | (optional) defaults to undefined


### Return type

**Datamartprocessorv3GetDatamartResponse**

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

# **datamartProcessorServiceGetEarliestStartTime**
> Datamartprocessorv3GetEarliestStartTimeResponse datamartProcessorServiceGetEarliestStartTime()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:any = {};

apiInstance.datamartProcessorServiceGetEarliestStartTime(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Datamartprocessorv3GetEarliestStartTimeResponse**

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

# **datamartProcessorServiceSendAllCompleteFilesToQueue**
> Datamartprocessorv3StatusResponseBase datamartProcessorServiceSendAllCompleteFilesToQueue(body)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:.DatamartProcessorServiceApiDatamartProcessorServiceSendAllCompleteFilesToQueueRequest = {
  // any
  body: {},
};

apiInstance.datamartProcessorServiceSendAllCompleteFilesToQueue(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **any**|  |


### Return type

**Datamartprocessorv3StatusResponseBase**

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

# **datamartProcessorServiceStoreExtractionLogs**
> Datamartprocessorv3DMExtractionLogsResponse datamartProcessorServiceStoreExtractionLogs(datamartprocessorv3DMExtractionLogsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:.DatamartProcessorServiceApiDatamartProcessorServiceStoreExtractionLogsRequest = {
  // string | Request id which co-relates to request.
  requestId: "request_id_example",
  // Datamartprocessorv3DMExtractionLogsRequest
  datamartprocessorv3DMExtractionLogsRequest: {
    data: "data_example",
    requestId: "requestId_example",
  },
};

apiInstance.datamartProcessorServiceStoreExtractionLogs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datamartprocessorv3DMExtractionLogsRequest** | **Datamartprocessorv3DMExtractionLogsRequest**|  |
 **requestId** | [**string**] | Request id which co-relates to request. | defaults to undefined


### Return type

**Datamartprocessorv3DMExtractionLogsResponse**

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

# **uploadDatamart**
> void uploadDatamart()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DatamartProcessorServiceApi(configuration);

let body:.DatamartProcessorServiceApiUploadDatamartRequest = {
  // HttpFile | The file to upload.
  file: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

apiInstance.uploadDatamart(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**HttpFile**] | The file to upload. | defaults to undefined


### Return type

**void**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)





# .DataMovementsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActualFlow**](DataMovementsApi.md#getActualFlow) | **GET** /api/v1/dspm/dataMovements/actualFlows/{id} | Get actual flow by providing its ID
[**getActualFlowsSummary**](DataMovementsApi.md#getActualFlowsSummary) | **GET** /api/v1/dspm/dataMovements/actualFlows/summary | Get summary of actual flows
[**getPotentialFlow**](DataMovementsApi.md#getPotentialFlow) | **GET** /api/v1/dspm/dataMovements/potentialFlows/{flowId} | Get potential flow by providing its ID
[**getPotentialFlowPath**](DataMovementsApi.md#getPotentialFlowPath) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths/{flowPathId} | Get potential flow path by providing its ID
[**getPotentialFlowsSummary**](DataMovementsApi.md#getPotentialFlowsSummary) | **GET** /api/v1/dspm/dataMovements/potentialFlows/summary | Get summary of potential flows according to the filter applied
[**listActualFlowPaths**](DataMovementsApi.md#listActualFlowPaths) | **GET** /api/v1/dspm/dataMovements/actualFlowPaths | Get summary of actual flows according to the filter applied
[**listActualFlows**](DataMovementsApi.md#listActualFlows) | **GET** /api/v1/dspm/dataMovements/actualFlows | List actual flows
[**listPotentialFlows**](DataMovementsApi.md#listPotentialFlows) | **GET** /api/v1/dspm/dataMovements/potentialFlows | List potential flows
[**listPotentialFlowsPaths**](DataMovementsApi.md#listPotentialFlowsPaths) | **GET** /api/v1/dspm/dataMovements/potentialFlows/paths | List potential flow paths


# **getActualFlow**
> ActualFlow getActualFlow()

Get a detailed information about an actual flow by providing its ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiGetActualFlowRequest = {
  // string
  id: "id_example",
};

apiInstance.getActualFlow(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] |  | defaults to undefined


### Return type

**ActualFlow**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getActualFlowsSummary**
> ActualFlowsSummary getActualFlowsSummary()

Get a summary of all the actual flows discovered by Guardium DSPM, that is, details about source and destination, and other information.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiGetActualFlowsSummaryRequest = {
  // ListActualFlowsFilterParameter (optional)
  filter: null,
};

apiInstance.getActualFlowsSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListActualFlowsFilterParameter** |  | (optional) defaults to undefined


### Return type

**ActualFlowsSummary**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getPotentialFlow**
> PotentialFlow getPotentialFlow()

Get a detailed information about a potential flow by providing the flow ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiGetPotentialFlowRequest = {
  // string
  flowId: "ff2b4abe-89f4-62b8-061e-1232456789",
};

apiInstance.getPotentialFlow(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowId** | [**string**] |  | defaults to undefined


### Return type

**PotentialFlow**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**404** | potential flow not found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getPotentialFlowPath**
> PotentialFlowPath getPotentialFlowPath()

Get details of a specific potential flow of data by providing its ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiGetPotentialFlowPathRequest = {
  // string
  flowPathId: "ff2b4abe-89f4-62b8-061e-12345678910",
};

apiInstance.getPotentialFlowPath(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flowPathId** | [**string**] |  | defaults to undefined


### Return type

**PotentialFlowPath**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**404** | potential flow path not found |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getPotentialFlowsSummary**
> PotentialFlowsSummary getPotentialFlowsSummary()

Get a summary of all the potential flows based on a filter applied.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiGetPotentialFlowsSummaryRequest = {
  // PotentialFlowsFilterOptions (optional)
  filter: null,
};

apiInstance.getPotentialFlowsSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **PotentialFlowsFilterOptions** |  | (optional) defaults to undefined


### Return type

**PotentialFlowsSummary**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listActualFlowPaths**
> ListActualFlowPaths200Response listActualFlowPaths()

Get detailed information about the actual flows according to the filter applied.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiListActualFlowPathsRequest = {
  // ListActualFlowPathsSortParameter (optional)
  sort: {
    sortBy: "lastSeen",
    sortOrder: 1,
  },
  // ListActualFlowPathsFilterParameter (optional)
  filter: null,
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listActualFlowPaths(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **ListActualFlowPathsSortParameter** |  | (optional) defaults to undefined
 **filter** | **ListActualFlowPathsFilterParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListActualFlowPaths200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listActualFlows**
> ListActualFlows200Response listActualFlows()

List all the actual flows (based on logs) of users and services across your entire cloud accounts and SasS applications.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiListActualFlowsRequest = {
  // ListActualFlowsSortParameter (optional)
  sort: {
    sortBy: "lastSeen",
    sortOrder: 1,
  },
  // ListActualFlowsFilterParameter (optional)
  filter: null,
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listActualFlows(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **ListActualFlowsSortParameter** |  | (optional) defaults to undefined
 **filter** | **ListActualFlowsFilterParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListActualFlows200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listPotentialFlows**
> ListPotentialFlows200Response listPotentialFlows()

List all the potential flows of users and services across your entire cloud accounts and SaaS applications.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiListPotentialFlowsRequest = {
  // PotentialFlowsFilterOptions (optional)
  filter: null,
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listPotentialFlows(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **PotentialFlowsFilterOptions** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListPotentialFlows200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listPotentialFlowsPaths**
> ListPotentialFlowsPaths200Response listPotentialFlowsPaths()

List all the potential flow paths based on an applied filter.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataMovementsApi(configuration);

let body:.DataMovementsApiListPotentialFlowsPathsRequest = {
  // PotentialFlowsPathsFilterOptions (optional)
  filter: null,
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listPotentialFlowsPaths(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **PotentialFlowsPathsFilterOptions** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListPotentialFlowsPaths200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)





# .DataResourcesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataResource**](DataResourcesApi.md#getDataResource) | **GET** /api/v1/dspm/dataResources/{dataResourceId} | Get a specific data resource by its ID
[**getDataResourcesSummary**](DataResourcesApi.md#getDataResourcesSummary) | **GET** /api/v1/dspm/dataResources/summary | Data resources summary
[**listDataResources**](DataResourcesApi.md#listDataResources) | **GET** /api/v1/dspm/dataResources | List data resources that match a given filter
[**listDataResourcesNames**](DataResourcesApi.md#listDataResourcesNames) | **GET** /api/v1/dspm/dataResources/names | List names of data resources
[**removeResource**](DataResourcesApi.md#removeResource) | **DELETE** /api/v1/dspm/dataResources/{dataResourceId}/removeResource | Remove resource from DSPM
[**updateResourceReviewStatus**](DataResourcesApi.md#updateResourceReviewStatus) | **PUT** /api/v1/dspm/dataResources/{dataResourceId}/reviewed | Set review status of a data resource


# **getDataResource**
> DataResource getDataResource()

Get additional details on a specific data resource by providing its ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiGetDataResourceRequest = {
  // string | Data resource ID
  dataResourceId: "arn:aws:s3::12345678910:polar-security-corplex.xlsx",
};

apiInstance.getDataResource(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataResourceId** | [**string**] | Data resource ID | defaults to undefined


### Return type

**DataResource**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getDataResourcesSummary**
> DataResourcesSummary getDataResourcesSummary()

Get a summary of all the data resource, that is, number of data resources, types of data resources, and other information.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiGetDataResourcesSummaryRequest = {
  // string | Data store id (optional)
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
  // ListDataResourcesFilterParameter (optional)
  filter: {
    isReviewed: true,
    resourceOwners: ["Avi"],
    resourceNames: ["myFile.txt","myExcel.xlsx"],
    resourceTypes: ["File","Table"],
    sensitivityTags: ["BUSINESS_EMAIL_ADDRESS","CREDIT_CARD"],
    sensitivityCategories: [
      "SECRETS",
    ],
    resourcePartialName: "resourcePartialName_example",
  },
};

apiInstance.getDataResourcesSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | [**string**] | Data store id | (optional) defaults to undefined
 **filter** | **ListDataResourcesFilterParameter** |  | (optional) defaults to undefined


### Return type

**DataResourcesSummary**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listDataResources**
> ListDataResources200Response listDataResources()

Get a list of data resources based on the filter applied. You can filter by data store ID, data resource ID, data resource name, and more.<BR><B>Note:</B> Filter needs to be HTML encoded.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiListDataResourcesRequest = {
  // string (optional)
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
  // ListDataResourcesFilterParameter (optional)
  filter: {
    isReviewed: true,
    resourceOwners: ["Avi"],
    resourceNames: ["myFile.txt","myExcel.xlsx"],
    resourceTypes: ["File","Table"],
    sensitivityTags: ["BUSINESS_EMAIL_ADDRESS","CREDIT_CARD"],
    sensitivityCategories: [
      "SECRETS",
    ],
    resourcePartialName: "resourcePartialName_example",
  },
  // ListDataResourcesSortParameter (optional)
  sort: {
    sortBy: "creationTime",
    sortOrder: 1,
  },
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listDataResources(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | [**string**] |  | (optional) defaults to undefined
 **filter** | **ListDataResourcesFilterParameter** |  | (optional) defaults to undefined
 **sort** | **ListDataResourcesSortParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListDataResources200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listDataResourcesNames**
> Array<string> listDataResourcesNames()

List and filter data resources by their names

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiListDataResourcesNamesRequest = {
  // string | Prefix of data resource name
  prefix: "check",
  // string (optional)
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
};

apiInstance.listDataResourcesNames(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | [**string**] | Prefix of data resource name | defaults to undefined
 **dataStoreId** | [**string**] |  | (optional) defaults to undefined


### Return type

**Array<string>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **removeResource**
> RemoveResource200Response removeResource()

Removes a resource, with all its sensitivities, from Guardium DSPM dashboard. This action does not remove the resource from the resource\'s source environment.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiRemoveResourceRequest = {
  // string | Data resource ID
  dataResourceId: "arn:aws:s3::12345678910:polar-security-corplex.xlsx",
  // string | Data store ID
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
};

apiInstance.removeResource(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataResourceId** | [**string**] | Data resource ID | defaults to undefined
 **dataStoreId** | [**string**] | Data store ID | defaults to undefined


### Return type

**RemoveResource200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateResourceReviewStatus**
> UpdateResourceReviewStatus200Response updateResourceReviewStatus(updateResourceReviewBody)

Set the review status of a specific data resource in a specific data store.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataResourcesApi(configuration);

let body:.DataResourcesApiUpdateResourceReviewStatusRequest = {
  // string | Data resource id
  dataResourceId: "dataResourceId_example",
  // UpdateResourceReviewBody
  updateResourceReviewBody: {
    isReviewed: true,
  },
};

apiInstance.updateResourceReviewStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateResourceReviewBody** | **UpdateResourceReviewBody**|  |
 **dataResourceId** | [**string**] | Data resource id | defaults to undefined


### Return type

**UpdateResourceReviewStatus200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)





# .DataSensitivitiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSensitivitiesSummary**](DataSensitivitiesApi.md#getSensitivitiesSummary) | **GET** /api/v1/dspm/sensitivities/summary | Get the summary of sensitivities
[**getSensitivity**](DataSensitivitiesApi.md#getSensitivity) | **GET** /api/v1/dspm/sensitivities/{sensitivityId} | Get sensitivity details by providing its ID
[**listSensitivities**](DataSensitivitiesApi.md#listSensitivities) | **GET** /api/v1/dspm/sensitivities | List sensitivities


# **getSensitivitiesSummary**
> SensitivitiesSummary getSensitivitiesSummary()

Get a summarised information about all sensitivities classified by Guardium DSPM.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataSensitivitiesApi(configuration);

let body:.DataSensitivitiesApiGetSensitivitiesSummaryRequest = {
  // ListSensitivitiesFilterParameter (optional)
  filter: {
    resourceId: "arn:aws:s3::123456789101:polar-bucket_excel_sheet.xlsx",
    dataStoreId: "arn:aws:s3::123456789101:polar-bucket",
    sensitiveTag: "Business Email Address",
    sensitivityCategories: [
      "SECRETS",
    ],
    hash: "hash_example",
  },
};

apiInstance.getSensitivitiesSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListSensitivitiesFilterParameter** |  | (optional) defaults to undefined


### Return type

**SensitivitiesSummary**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getSensitivity**
> Sensitivity getSensitivity()

Get details of a sensitivity by providing its ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataSensitivitiesApi(configuration);

let body:.DataSensitivitiesApiGetSensitivityRequest = {
  // string
  sensitivityId: "sensitivityId_example",
};

apiInstance.getSensitivity(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensitivityId** | [**string**] |  | defaults to undefined


### Return type

**Sensitivity**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listSensitivities**
> ListSensitivities200Response listSensitivities()

Get a list of all the sensitivities based on an applied filter.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataSensitivitiesApi(configuration);

let body:.DataSensitivitiesApiListSensitivitiesRequest = {
  // ListSensitivitiesFilterParameter (optional)
  filter: {
    resourceId: "arn:aws:s3::123456789101:polar-bucket_excel_sheet.xlsx",
    dataStoreId: "arn:aws:s3::123456789101:polar-bucket",
    sensitiveTag: "Business Email Address",
    sensitivityCategories: [
      "SECRETS",
    ],
    hash: "hash_example",
  },
  // LastSeenSortSchema (optional)
  sort: {
    sortBy: "lastSeen",
    sortOrder: 1,
  },
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listSensitivities(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListSensitivitiesFilterParameter** |  | (optional) defaults to undefined
 **sort** | **LastSeenSortSchema** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListSensitivities200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)





# .DataStoresApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDataStore**](DataStoresApi.md#getDataStore) | **GET** /api/v1/dspm/dataStores/{dataStoreId} | Get a data store by its ID
[**getDataStoresSummary**](DataStoresApi.md#getDataStoresSummary) | **GET** /api/v1/dspm/dataStores/summary | Get summary of data stores
[**listAllDataStoresLabels**](DataStoresApi.md#listAllDataStoresLabels) | **GET** /api/v1/dspm/dataStores/labels | List labels of data stores.
[**listDataStores**](DataStoresApi.md#listDataStores) | **GET** /api/v1/dspm/dataStores | List data stores
[**listDataStoresCloudTagsKeys**](DataStoresApi.md#listDataStoresCloudTagsKeys) | **GET** /api/v1/dspm/dataStores/cloudTags/keys | List the cloud tag keys of data stores that can be filtered on the basis of prefixes.
[**listDataStoresCloudTagsValues**](DataStoresApi.md#listDataStoresCloudTagsValues) | **GET** /api/v1/dspm/dataStores/cloudTags/values | List the cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.
[**listDataStoresNames**](DataStoresApi.md#listDataStoresNames) | **GET** /api/v1/dspm/dataStores/filters/name | List name of filterable data stores
[**rescanDataStore**](DataStoresApi.md#rescanDataStore) | **POST** /api/v1/dspm/dataStores/rescan | Post data store rescan request
[**setDataStoreLabel**](DataStoresApi.md#setDataStoreLabel) | **PUT** /api/v1/dspm/dataStores/{dataStoreId}/labels | Label a data store with an existing or new label
[**updateDatastoreCustodian**](DataStoresApi.md#updateDatastoreCustodian) | **POST** /api/v1/dspm/dataStores/custodian | Update the name of a Data store custodian


# **getDataStore**
> DataStore getDataStore()

Get details of a specific data store by its ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataStoresApi(configuration);

let body:.DataStoresApiGetDataStoreRequest = {
  // string | ID of the data store
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
};

apiInstance.getDataStore(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataStoreId** | [**string**] | ID of the data store | defaults to undefined


### Return type

**DataStore**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getDataStoresSummary**
> DataStoresSummary getDataStoresSummary()

Get a summary of all the data stores, that is, name of data resources, types of data stores, and other information.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataStoresApi(configuration);

let body:.DataStoresApiGetDataStoresSummaryRequest = {
  // ListDataStoresFilterParameter (optional)
  filter: {
    storeTypesFamily: ["CLOUD"],
    storeNames: [
      "["polar-security-corplex"]",
    ],
    storeTypes: ["S3","RDS"],
    serviceProviders: [
      "aws",
    ],
    cloudAccountIds: [12345678910,12345678911],
    cloudRegions: ["us-east-1","us-central1"],
    labels: ["test1, test"],
    classificationStatuses: [
      "CLASSIFIED",
    ],
    sensitivityTags: ["EMAIL","PASSWORD"],
    sensitivityCategories: [
      "SECRETS",
    ],
    compliances: [
      "CPRA",
    ],
    cloudTags: ["Component"],
    encryptionStatuses: [
      "CLOUD_PROVIDER",
    ],
    storePartialName: "storePartialName_example",
  },
};

apiInstance.getDataStoresSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListDataStoresFilterParameter** |  | (optional) defaults to undefined


### Return type

**DataStoresSummary**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listAllDataStoresLabels**
> Array<string> listAllDataStoresLabels()

Get a list of all the labels of custom data stores.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataStoresApi(configuration);

let body:.DataStoresApiListAllDataStoresLabelsRequest = {
  // string | Prefix of data store label (optional)
  prefix: "test",
  // number (optional)
  maxResults: 10,
};

apiInstance.listAllDataStoresLabels(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | [**string**] | Prefix of data store label | (optional) defaults to undefined
 **maxResults** | [**number**] |  | (optional) defaults to undefined


### Return type

**Array<string>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listDataStores**
> ListDataStores200Response listDataStores()

List all data stores discovered by Guardium DSPM.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataStoresApi(configuration);

let body:.DataStoresApiListDataStoresRequest = {
  // ListDataStoresFilterParameter (optional)
  filter: {
    storeTypesFamily: ["CLOUD"],
    storeNames: [
      "["polar-security-corplex"]",
    ],
    storeTypes: ["S3","RDS"],
    serviceProviders: [
      "aws",
    ],
    cloudAccountIds: [12345678910,12345678911],
    cloudRegions: ["us-east-1","us-central1"],
    labels: ["test1, test"],
    classificationStatuses: [
      "CLASSIFIED",
    ],
    sensitivityTags: ["EMAIL","PASSWORD"],
    sensitivityCategories: [
      "SECRETS",
    ],
    compliances: [
      "CPRA",
    ],
    cloudTags: ["Component"],
    encryptionStatuses: [
      "CLOUD_PROVIDER",
    ],
    storePartialName: "storePartialName_example",
  },
  // ListDataStoresSortParameter (optional)
  sort: {
    sortBy: "name",
    sortOrder: 1,
  },
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listDataStores(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListDataStoresFilterParameter** |  | (optional) defaults to undefined
 **sort** | **ListDataStoresSortParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListDataStores200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listDataStoresCloudTagsKeys**
> Array<string> listDataStoresCloudTagsKeys()

Get a list of the available cloud tag keys of data stores that can be filtered on the basis of prefixes.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataStoresApi(configuration);

let body:.DataStoresApiListDataStoresCloudTagsKeysRequest = {
  // string | Prefix of cloud tag key
  prefix: "environment",
  // number (optional)
  maxResults: 10,
};

apiInstance.listDataStoresCloudTagsKeys(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | [**string**] | Prefix of cloud tag key | defaults to undefined
 **maxResults** | [**number**] |  | (optional) defaults to undefined


### Return type

**Array<string>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listDataStoresCloudTagsValues**
> Array<string> listDataStoresCloudTagsValues()

Get a list of the available cloud tag values of data stores that can be filtered on the basis of prefixes and cloud tag key names.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataStoresApi(configuration);

let body:.DataStoresApiListDataStoresCloudTagsValuesRequest = {
  // string | Prefix of cloud tag value
  prefix: "comp",
  // string
  tagKey: "Production",
  // number (optional)
  maxResults: 10,
};

apiInstance.listDataStoresCloudTagsValues(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | [**string**] | Prefix of cloud tag value | defaults to undefined
 **tagKey** | [**string**] |  | defaults to undefined
 **maxResults** | [**number**] |  | (optional) defaults to undefined


### Return type

**Array<string>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listDataStoresNames**
> Array<string> listDataStoresNames()

Lists the data stores that can be filtered or classified.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataStoresApi(configuration);

let body:.DataStoresApiListDataStoresNamesRequest = {
  // string | Prefix of data store name
  prefix: "polar",
};

apiInstance.listDataStoresNames(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | [**string**] | Prefix of data store name | defaults to undefined


### Return type

**Array<string>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **rescanDataStore**
> void rescanDataStore(rescanDataStoreRequest)

Post the request for a data store rescan.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataStoresApi(configuration);

let body:.DataStoresApiRescanDataStoreRequest = {
  // RescanDataStoreRequest
  rescanDataStoreRequest: {
    dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
  },
};

apiInstance.rescanDataStore(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rescanDataStoreRequest** | **RescanDataStoreRequest**|  |


### Return type

**void**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **setDataStoreLabel**
> void setDataStoreLabel(setDataStoreLabelRequest)

Add or update a custom label for a data store.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataStoresApi(configuration);

let body:.DataStoresApiSetDataStoreLabelRequest = {
  // string | Data store ID
  dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
  // SetDataStoreLabelRequest
  setDataStoreLabelRequest: {
    label: "BI Team",
  },
};

apiInstance.setDataStoreLabel(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setDataStoreLabelRequest** | **SetDataStoreLabelRequest**|  |
 **dataStoreId** | [**string**] | Data store ID | defaults to undefined


### Return type

**void**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateDatastoreCustodian**
> UpdateDatastoreCustodian200Response updateDatastoreCustodian(updateCustodianBody)

Add or update the name of a specific data store.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataStoresApi(configuration);

let body:.DataStoresApiUpdateDatastoreCustodianRequest = {
  // UpdateCustodianBody
  updateCustodianBody: {
    dataStoreId: "arn:aws:s3::123456789101:mys3-prod",
    custodian: "Avi",
  },
};

apiInstance.updateDatastoreCustodian(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCustodianBody** | **UpdateCustodianBody**|  |


### Return type

**UpdateDatastoreCustodian200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)





# .DataVulnerabilitiesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#addVulnerabilityStatusComment) | **POST** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments | Add vulnerability status comment
[**getVulnerabilitiesSummary**](DataVulnerabilitiesApi.md#getVulnerabilitiesSummary) | **GET** /api/v1/dspm/vulnerabilities/summary | Get vulnerabilities summary
[**getVulnerability**](DataVulnerabilitiesApi.md#getVulnerability) | **GET** /api/v1/dspm/vulnerabilities/{vulnerabilityId} | Get vulnerability details by ID
[**listVulnerabilities**](DataVulnerabilitiesApi.md#listVulnerabilities) | **GET** /api/v1/dspm/vulnerabilities | List vulnerabilities based on an applied filter
[**listVulnerabilitiesByDataStore**](DataVulnerabilitiesApi.md#listVulnerabilitiesByDataStore) | **GET** /api/v1/dspm/vulnerabilities/byDataStore | List vulnerabilities of data stores
[**removeVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#removeVulnerabilityStatusComment) | **DELETE** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Delete vulnerability status comment
[**setVulnerabilityStatus**](DataVulnerabilitiesApi.md#setVulnerabilityStatus) | **POST** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses | Set status of a vulnerability
[**updateVulnerabilityStatusComment**](DataVulnerabilitiesApi.md#updateVulnerabilityStatusComment) | **PUT** /api/v1/dspm/vulnerabilities/{vulnerabilityId}/statuses/{statusId}/comments/{commentId} | Set vulnerability status


# **addVulnerabilityStatusComment**
> VulnerabilityStatus addVulnerabilityStatusComment(addCommentBody)

Add or update the status comment of a vulnerability status to keep track of the workflow progress.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiAddVulnerabilityStatusCommentRequest = {
  // string
  vulnerabilityId: "384cd426-b187-438a-affc-e12b323f5890",
  // string
  statusId: "statusId_example",
  // AddCommentBody
  addCommentBody: {
    comment: "comment_example",
  },
};

apiInstance.addVulnerabilityStatusComment(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addCommentBody** | **AddCommentBody**|  |
 **vulnerabilityId** | [**string**] |  | defaults to undefined
 **statusId** | [**string**] |  | defaults to undefined


### Return type

**VulnerabilityStatus**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getVulnerabilitiesSummary**
> VulnerabilitiesSummary getVulnerabilitiesSummary()

Get a summary of all the vulnerabilities. You can also filter the results of the vulnerabilities based on the vulnerebility\'s type, threat, status, and so on.<BR><B>Note:</B> Filter needs to be HTML Encoded.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiGetVulnerabilitiesSummaryRequest = {
  // VulnerabilitiesFilterOptions (optional)
  filter: null,
};

apiInstance.getVulnerabilitiesSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **VulnerabilitiesFilterOptions** |  | (optional) defaults to undefined


### Return type

**VulnerabilitiesSummary**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getVulnerability**
> Vulnerability getVulnerability()

Get vulnerability details by providing its ID.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiGetVulnerabilityRequest = {
  // string
  vulnerabilityId: "384cd426-b187-438a-affc-e12b323f5890",
};

apiInstance.getVulnerability(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerabilityId** | [**string**] |  | defaults to undefined


### Return type

**Vulnerability**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listVulnerabilities**
> ListVulnerabilities200Response listVulnerabilities()

Get a list of data vulnerabilities based on a filter applied. You can filter by ID of the vulnerability, type of the vulnerability, and so on.<BR><B>Note:</B> Filter needs to be HTML encoded.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiListVulnerabilitiesRequest = {
  // VulnerabilitiesFilterOptions (optional)
  filter: null,
  // ListVulnerabilitiesSortParameter (optional)
  sort: {
    sortBy: "criticality",
    sortOrder: 1,
  },
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listVulnerabilities(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **VulnerabilitiesFilterOptions** |  | (optional) defaults to undefined
 **sort** | **ListVulnerabilitiesSortParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListVulnerabilities200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listVulnerabilitiesByDataStore**
> ListVulnerabilitiesByDataStore200Response listVulnerabilitiesByDataStore()

Get a list of all the vulnerabilities of data stores.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiListVulnerabilitiesByDataStoreRequest = {
  // VulnerabilitiesByDataStoreFilterOptions (optional)
  filter: null,
  // ListVulnerabilitiesByDataStoreSortParameter (optional)
  sort: {
    sortBy: "vulnerabilitiesCount",
    sortOrder: 1,
  },
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listVulnerabilitiesByDataStore(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **VulnerabilitiesByDataStoreFilterOptions** |  | (optional) defaults to undefined
 **sort** | **ListVulnerabilitiesByDataStoreSortParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListVulnerabilitiesByDataStore200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **removeVulnerabilityStatusComment**
> void removeVulnerabilityStatusComment()

Delete a status comment of a vulnerability status.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiRemoveVulnerabilityStatusCommentRequest = {
  // string
  vulnerabilityId: "384cd426-b187-438a-affc-e12b323f5890",
  // string
  statusId: "statusId_example",
  // string
  commentId: "commentId_example",
};

apiInstance.removeVulnerabilityStatusComment(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vulnerabilityId** | [**string**] |  | defaults to undefined
 **statusId** | [**string**] |  | defaults to undefined
 **commentId** | [**string**] |  | defaults to undefined


### Return type

**void**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **setVulnerabilityStatus**
> VulnerabilityStatus setVulnerabilityStatus(setVulnerabilityStatusRequest)

Add or update the status of a vulnerability to track its progress.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiSetVulnerabilityStatusRequest = {
  // string
  vulnerabilityId: "vulnerabilityId_example",
  // SetVulnerabilityStatusRequest
  setVulnerabilityStatusRequest: {
    status: "review",
  },
};

apiInstance.setVulnerabilityStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **setVulnerabilityStatusRequest** | **SetVulnerabilityStatusRequest**|  |
 **vulnerabilityId** | [**string**] |  | defaults to undefined


### Return type

**VulnerabilityStatus**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateVulnerabilityStatusComment**
> VulnerabilityStatusComment updateVulnerabilityStatusComment(updateCommentBody)

Set a vulnerability status of a vulnerability.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .DataVulnerabilitiesApi(configuration);

let body:.DataVulnerabilitiesApiUpdateVulnerabilityStatusCommentRequest = {
  // string
  vulnerabilityId: "384cd426-b187-438a-affc-e12b323f5890",
  // string
  statusId: "statusId_example",
  // string
  commentId: "commentId_example",
  // UpdateCommentBody
  updateCommentBody: {
    comment: "comment_example",
  },
};

apiInstance.updateVulnerabilityStatusComment(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateCommentBody** | **UpdateCommentBody**|  |
 **vulnerabilityId** | [**string**] |  | defaults to undefined
 **statusId** | [**string**] |  | defaults to undefined
 **commentId** | [**string**] |  | defaults to undefined


### Return type

**VulnerabilityStatusComment**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)





# .EcosystemServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ecosystemServiceCreateDataset**](EcosystemServiceApi.md#ecosystemServiceCreateDataset) | **POST** /api/v3/integrations/datasets | Summary: Create dataset Description: Save a definition in the database.
[**ecosystemServiceDataInsert**](EcosystemServiceApi.md#ecosystemServiceDataInsert) | **POST** /api/v3/integrations/datasets/{dataset_name} | Summary: Data insert Description: Process Data received from webhook API and insert.
[**ecosystemServiceDeleteDatasets**](EcosystemServiceApi.md#ecosystemServiceDeleteDatasets) | **DELETE** /api/v3/integrations/datasets | Summary: Delete datasets Description: Delete an array of datasets.
[**ecosystemServiceGetDatasetData**](EcosystemServiceApi.md#ecosystemServiceGetDatasetData) | **GET** /api/v3/integrations/datasets/{dataset_name}/data | Summary: Get dataset data Description: Return data report for a given dataset.
[**ecosystemServiceGetDatasetDetail**](EcosystemServiceApi.md#ecosystemServiceGetDatasetDetail) | **GET** /api/v3/integrations/datasets/{dataset_name}/details | Summary: Get dataset detail Description: Return detail on a dataset definition.
[**ecosystemServiceGetDatasets**](EcosystemServiceApi.md#ecosystemServiceGetDatasets) | **GET** /api/v3/integrations/datasets | Summary: Get datasets Description: Return dataset list that matches the specified filter.
[**ecosystemServiceGetPurgableRows**](EcosystemServiceApi.md#ecosystemServiceGetPurgableRows) | **POST** /api/v3/integrations/purge | Summary: Get purgable rows Description: Check the number of rows that can be purged.
[**ecosystemServicePurgeData**](EcosystemServiceApi.md#ecosystemServicePurgeData) | **DELETE** /api/v3/integrations/datasets/data | Summary: Purge data Description: Purge data.


# **ecosystemServiceCreateDataset**
> Ecosystemv3CreateDatasetResponse ecosystemServiceCreateDataset(ecosystemv3CreateDatasetRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceCreateDatasetRequest = {
  // Ecosystemv3CreateDatasetRequest
  ecosystemv3CreateDatasetRequest: {
    detail: {
      columns: [
        {
          allowNull: true,
          columnId: 1,
          columnName: "columnName_example",
          columnSize: "columnSize_example",
          columnType: "UNDEFINED_DATA_TYPE",
          unique: true,
        },
      ],
      dataCount: 1,
      datasetName: "datasetName_example",
      description: "description_example",
      editable: true,
    },
    isNew: true,
  },
};

apiInstance.ecosystemServiceCreateDataset(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3CreateDatasetRequest** | **Ecosystemv3CreateDatasetRequest**|  |


### Return type

**Ecosystemv3CreateDatasetResponse**

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

# **ecosystemServiceDataInsert**
> Ecosystemv3DataInsertResponse ecosystemServiceDataInsert(ecosystemv3DataInsertRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceDataInsertRequest = {
  // string | Data set target name.
  datasetName: "dataset_name_example",
  // Ecosystemv3DataInsertRequest
  ecosystemv3DataInsertRequest: {
    datasetName: "datasetName_example",
    entries: [
      {
        entry: {
          "key": "key_example",
        },
      },
    ],
  },
};

apiInstance.ecosystemServiceDataInsert(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3DataInsertRequest** | **Ecosystemv3DataInsertRequest**|  |
 **datasetName** | [**string**] | Data set target name. | defaults to undefined


### Return type

**Ecosystemv3DataInsertResponse**

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

# **ecosystemServiceDeleteDatasets**
> Ecosystemv3DeleteDatasetsResponse ecosystemServiceDeleteDatasets()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceDeleteDatasetsRequest = {
  // Array<string> | Name of the dataset, required field. (optional)
  datasetNames: [
    "dataset_names_example",
  ],
};

apiInstance.ecosystemServiceDeleteDatasets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetNames** | **Array&lt;string&gt;** | Name of the dataset, required field. | (optional) defaults to undefined


### Return type

**Ecosystemv3DeleteDatasetsResponse**

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

# **ecosystemServiceGetDatasetData**
> Ecosystemv3GetDatasetDataResponse ecosystemServiceGetDatasetData()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceGetDatasetDataRequest = {
  // string | Name of the dataset.
  datasetName: "dataset_name_example",
  // number | The amount to offset the rows by for pagination. (optional)
  offset: 1,
  // number | The max amount of rows to return for pagination. (optional)
  limit: 1,
  // boolean | If needs to return header information. It is for pagination. The first page needs header, the rest doesn\'t need. (optional)
  returnHeader: true,
  // string | Search field. (optional)
  field: "field_example",
  // string | Search value. (optional)
  value: "value_example",
  // string | Field to sort. (optional)
  sortField: "sort_field_example",
  // 'NONE' | 'ASC' | 'DESC' | Sort order. (optional)
  sortOrder: "NONE",
};

apiInstance.ecosystemServiceGetDatasetData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetName** | [**string**] | Name of the dataset. | defaults to undefined
 **offset** | [**number**] | The amount to offset the rows by for pagination. | (optional) defaults to undefined
 **limit** | [**number**] | The max amount of rows to return for pagination. | (optional) defaults to undefined
 **returnHeader** | [**boolean**] | If needs to return header information. It is for pagination. The first page needs header, the rest doesn\&#39;t need. | (optional) defaults to undefined
 **field** | [**string**] | Search field. | (optional) defaults to undefined
 **value** | [**string**] | Search value. | (optional) defaults to undefined
 **sortField** | [**string**] | Field to sort. | (optional) defaults to undefined
 **sortOrder** | [**&#39;NONE&#39; | &#39;ASC&#39; | &#39;DESC&#39;**]**Array<&#39;NONE&#39; &#124; &#39;ASC&#39; &#124; &#39;DESC&#39;>** | Sort order. | (optional) defaults to 'NONE'


### Return type

**Ecosystemv3GetDatasetDataResponse**

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

# **ecosystemServiceGetDatasetDetail**
> Ecosystemv3GetDatasetDetailResponse ecosystemServiceGetDatasetDetail()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceGetDatasetDetailRequest = {
  // string | Name of the dataset.
  datasetName: "dataset_name_example",
};

apiInstance.ecosystemServiceGetDatasetDetail(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetName** | [**string**] | Name of the dataset. | defaults to undefined


### Return type

**Ecosystemv3GetDatasetDetailResponse**

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

# **ecosystemServiceGetDatasets**
> Ecosystemv3GetDatasetsResponse ecosystemServiceGetDatasets()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceGetDatasetsRequest = {
  // Date | Return datasets created at this time or later (>=). (optional)
  filterStartTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | Return datasets created before this time (<). (optional)
  filterEndTime: new Date('1970-01-01T00:00:00.00Z'),
  // Array<string> | The state filter groups commonly paired states. Only returns records that include the specified names. (optional)
  filterDatasetNames: [
    "filter.dataset_names_example",
  ],
  // number | The amount to offset the rows by for pagination. (optional)
  offset: 1,
  // number | The max amount of rows to return for pagination. (optional)
  limit: 1,
  // boolean | Computing the filter counts is relatively expensive, only compute when needed. (optional)
  includeFilterCounts: true,
};

apiInstance.ecosystemServiceGetDatasets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartTime** | [**Date**] | Return datasets created at this time or later (&gt;&#x3D;). | (optional) defaults to undefined
 **filterEndTime** | [**Date**] | Return datasets created before this time (&lt;). | (optional) defaults to undefined
 **filterDatasetNames** | **Array&lt;string&gt;** | The state filter groups commonly paired states. Only returns records that include the specified names. | (optional) defaults to undefined
 **offset** | [**number**] | The amount to offset the rows by for pagination. | (optional) defaults to undefined
 **limit** | [**number**] | The max amount of rows to return for pagination. | (optional) defaults to undefined
 **includeFilterCounts** | [**boolean**] | Computing the filter counts is relatively expensive, only compute when needed. | (optional) defaults to undefined


### Return type

**Ecosystemv3GetDatasetsResponse**

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

# **ecosystemServiceGetPurgableRows**
> Ecosystemv3GetPurgableRowsResponse ecosystemServiceGetPurgableRows(ecosystemv3GetPurgableRowsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServiceGetPurgableRowsRequest = {
  // Ecosystemv3GetPurgableRowsRequest
  ecosystemv3GetPurgableRowsRequest: {
    hotRetentionPeriod: "hotRetentionPeriod_example",
    hotRetentionPeriodUnit: "hotRetentionPeriodUnit_example",
  },
};

apiInstance.ecosystemServiceGetPurgableRows(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ecosystemv3GetPurgableRowsRequest** | **Ecosystemv3GetPurgableRowsRequest**|  |


### Return type

**Ecosystemv3GetPurgableRowsResponse**

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

# **ecosystemServicePurgeData**
> Ecosystemv3PurgeDataResponse ecosystemServicePurgeData()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .EcosystemServiceApi(configuration);

let body:.EcosystemServiceApiEcosystemServicePurgeDataRequest = {
  // Array<string> | Name of the datasets, required field. (optional)
  datasetNames: [
    "dataset_names_example",
  ],
};

apiInstance.ecosystemServicePurgeData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetNames** | **Array&lt;string&gt;** | Name of the datasets, required field. | (optional) defaults to undefined


### Return type

**Ecosystemv3PurgeDataResponse**

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





# .FeatureFlagsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**featureFlagsServiceDeleteFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceDeleteFeatureFlagOverrides) | **DELETE** /api/v3/feature_flags/overrides | Summary: Delete feature Flag overrides Description: Delete feature Flag overrides from database.
[**featureFlagsServiceGetFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceGetFeatureFlagOverrides) | **GET** /api/v3/feature_flags/overrides | Summary: Get feature Flag overrides Description: Get feature Flag overrides by Feature Flag Name.
[**featureFlagsServiceGetFeatureFlags**](FeatureFlagsServiceApi.md#featureFlagsServiceGetFeatureFlags) | **GET** /api/v3/feature_flags | Summary: Get feature flags Description: Get feature flags by Feature Flag Name.
[**featureFlagsServiceUpdateFeatureFlagOverrides**](FeatureFlagsServiceApi.md#featureFlagsServiceUpdateFeatureFlagOverrides) | **PUT** /api/v3/feature_flags/overrides | Summary: Update feature Flag overrides Description: Update feature Flag overrides in the database.


# **featureFlagsServiceDeleteFeatureFlagOverrides**
> Featureflagsv3DeleteFeatureFlagOverridesResponse featureFlagsServiceDeleteFeatureFlagOverrides()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .FeatureFlagsServiceApi(configuration);

let body:.FeatureFlagsServiceApiFeatureFlagsServiceDeleteFeatureFlagOverridesRequest = {
  // string | Flag name. (optional)
  flagName: "flag_name_example",
  // string | Optional tenant id. (optional)
  tenantId: "tenant_id_example",
};

apiInstance.featureFlagsServiceDeleteFeatureFlagOverrides(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flagName** | [**string**] | Flag name. | (optional) defaults to undefined
 **tenantId** | [**string**] | Optional tenant id. | (optional) defaults to undefined


### Return type

**Featureflagsv3DeleteFeatureFlagOverridesResponse**

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

# **featureFlagsServiceGetFeatureFlagOverrides**
> Featureflagsv3GetFeatureFlagOverridesResponse featureFlagsServiceGetFeatureFlagOverrides()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .FeatureFlagsServiceApi(configuration);

let body:.FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagOverridesRequest = {
  // string | Optional tenant id. (optional)
  tenantId: "tenant_id_example",
  // Array<string> | Optional flag names; if empty then return all flag. (optional)
  flagNames: [
    "flag_names_example",
  ],
};

apiInstance.featureFlagsServiceGetFeatureFlagOverrides(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Optional tenant id. | (optional) defaults to undefined
 **flagNames** | **Array&lt;string&gt;** | Optional flag names; if empty then return all flag. | (optional) defaults to undefined


### Return type

**Featureflagsv3GetFeatureFlagOverridesResponse**

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

# **featureFlagsServiceGetFeatureFlags**
> Featureflagsv3GetFeatureFlagsResponse featureFlagsServiceGetFeatureFlags()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .FeatureFlagsServiceApi(configuration);

let body:.FeatureFlagsServiceApiFeatureFlagsServiceGetFeatureFlagsRequest = {
  // string | Tenant id. (optional)
  tenantId: "tenant_id_example",
  // Array<string> | Optional flag names; if empty then return all flag. (optional)
  flagNames: [
    "flag_names_example",
  ],
};

apiInstance.featureFlagsServiceGetFeatureFlags(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Tenant id. | (optional) defaults to undefined
 **flagNames** | **Array&lt;string&gt;** | Optional flag names; if empty then return all flag. | (optional) defaults to undefined


### Return type

**Featureflagsv3GetFeatureFlagsResponse**

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

# **featureFlagsServiceUpdateFeatureFlagOverrides**
> Featureflagsv3UpdateFeatureFlagOverridesResponse featureFlagsServiceUpdateFeatureFlagOverrides(featureflagsv3UpdateFeatureFlagOverridesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .FeatureFlagsServiceApi(configuration);

let body:.FeatureFlagsServiceApiFeatureFlagsServiceUpdateFeatureFlagOverridesRequest = {
  // Featureflagsv3UpdateFeatureFlagOverridesRequest
  featureflagsv3UpdateFeatureFlagOverridesRequest: {
    featureFlag: {
      flagName: "flagName_example",
      isEnabled: true,
      value: "value_example",
    },
    tenantId: "tenantId_example",
  },
};

apiInstance.featureFlagsServiceUpdateFeatureFlagOverrides(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **featureflagsv3UpdateFeatureFlagOverridesRequest** | **Featureflagsv3UpdateFeatureFlagOverridesRequest**|  |


### Return type

**Featureflagsv3UpdateFeatureFlagOverridesResponse**

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





# .GroupBuilderApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**groupBuilderCancelImportGroup**](GroupBuilderApi.md#groupBuilderCancelImportGroup) | **DELETE** /api/v3/groups_import | Summary: Cancel import group Description: Cancel import refresh for selected groups.
[**groupBuilderCreateGroup**](GroupBuilderApi.md#groupBuilderCreateGroup) | **POST** /api/v3/groups | Summary: Create group Description: Create new groups.
[**groupBuilderDeleteGroup**](GroupBuilderApi.md#groupBuilderDeleteGroup) | **DELETE** /api/v3/groups | Summary: Delete group Description: Delete specified groups if the group ID is not used for reports.
[**groupBuilderEditGroup**](GroupBuilderApi.md#groupBuilderEditGroup) | **PATCH** /api/v3/groups/{group_id} | Summary: Edit group Description: Add or delete group members.
[**groupBuilderExportGroup**](GroupBuilderApi.md#groupBuilderExportGroup) | **POST** /api/v3/groups_export | Summary: Export group Description: Export group content to a file based on a group ID.
[**groupBuilderGetGroupDetails**](GroupBuilderApi.md#groupBuilderGetGroupDetails) | **GET** /api/v3/groups/{group_id} | Summary: Get group details Description: Get details of group specified by group ID.
[**groupBuilderGetGroupMembers**](GroupBuilderApi.md#groupBuilderGetGroupMembers) | **POST** /api/v3/groups/search | Summary: Get group members Description: Get members of all the group ids provided in the request. To be consumed by policy builder ms.
[**groupBuilderGetGroupSyncMapping**](GroupBuilderApi.md#groupBuilderGetGroupSyncMapping) | **GET** /api/v3/groups/mappings/sync | Summary: Get gdp to gi group mapping Description: Get insights to gdp group sync mapping.
[**groupBuilderGetGroupTypeMapping**](GroupBuilderApi.md#groupBuilderGetGroupTypeMapping) | **GET** /api/v3/groups-mappings | Summary: Get group type mapping Description: Get insights to gdp group types mapping.
[**groupBuilderGetGroupTypes**](GroupBuilderApi.md#groupBuilderGetGroupTypes) | **GET** /api/v3/group_types | Summary: Get group types Description: Get a list of available group types.
[**groupBuilderGetGroups**](GroupBuilderApi.md#groupBuilderGetGroups) | **GET** /api/v3/groups | Summary: Get groups Description: Get a list of imported group members.
[**groupBuilderGetImportGroups**](GroupBuilderApi.md#groupBuilderGetImportGroups) | **GET** /api/v3/groups_import | Summary: Get import groups Description: Get unsynchronized groups from a central manager.
[**groupBuilderImportGroup**](GroupBuilderApi.md#groupBuilderImportGroup) | **POST** /api/v3/groups_import | Summary: Import group Description: Import selected groups from a central manager. (This API is called from GDP only)
[**groupBuilderRefreshGroups**](GroupBuilderApi.md#groupBuilderRefreshGroups) | **POST** /api/v3/groups/refresh | Summary: Refresh groups Description: Refresh tenants selected imported groups.
[**groupBuilderResetGroups**](GroupBuilderApi.md#groupBuilderResetGroups) | **POST** /api/v3/groups/reset | Summary: Reset groups Description: Resets tenants selected predefined groups.
[**groupBuilderStoreGroupMembersGdp**](GroupBuilderApi.md#groupBuilderStoreGroupMembersGdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups/members | Summary: Store group members Gdp Description: Store GDP groups. (This API is called from GDP only)
[**groupBuilderStoreGroupsGdp**](GroupBuilderApi.md#groupBuilderStoreGroupsGdp) | **POST** /api/v3/central_managers/{central_manager_id}/groups | Summary: Store groups Gdp Description: Store GDP groups. (This API is called from GDP only)


# **groupBuilderCancelImportGroup**
> Groupbuilderv3CancelGroupImportResponse groupBuilderCancelImportGroup()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderCancelImportGroupRequest = {
  // Array<number> | Group IDs to delete. (optional)
  groupIds: [
    1,
  ],
};

apiInstance.groupBuilderCancelImportGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | **Array&lt;number&gt;** | Group IDs to delete. | (optional) defaults to undefined


### Return type

**Groupbuilderv3CancelGroupImportResponse**

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

# **groupBuilderCreateGroup**
> Groupbuilderv3CreateGroupResponse groupBuilderCreateGroup(groupbuilderv3CreateGroupRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderCreateGroupRequest = {
  // Groupbuilderv3CreateGroupRequest
  groupbuilderv3CreateGroupRequest: {
    copyGroupId: 1,
    description: "description_example",
    groupTypeId: 1,
    name: "name_example",
    nested: true,
  },
};

apiInstance.groupBuilderCreateGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3CreateGroupRequest** | **Groupbuilderv3CreateGroupRequest**|  |


### Return type

**Groupbuilderv3CreateGroupResponse**

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

# **groupBuilderDeleteGroup**
> Groupbuilderv3DeleteGroupResponse groupBuilderDeleteGroup()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderDeleteGroupRequest = {
  // Array<number> | Group IDs to delete. (optional)
  groupIds: [
    1,
  ],
};

apiInstance.groupBuilderDeleteGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | **Array&lt;number&gt;** | Group IDs to delete. | (optional) defaults to undefined


### Return type

**Groupbuilderv3DeleteGroupResponse**

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

# **groupBuilderEditGroup**
> Groupbuilderv3EditGroupResponse groupBuilderEditGroup(groupbuilderv3EditGroupRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderEditGroupRequest = {
  // number | Group ID.
  groupId: 1,
  // Groupbuilderv3EditGroupRequest
  groupbuilderv3EditGroupRequest: {
    clearGroup: true,
    deletedMembers: [
      "deletedMembers_example",
    ],
    description: "description_example",
    groupId: 1,
    ldapConfig: {
      attributes: [
        "attributes_example",
      ],
      bindGroupId: 1,
      bindPassword: "bindPassword_example",
      clearGroup: true,
      filter: "filter_example",
      filterScope: 1,
      importLimit: 1,
      ldapGroupName: "ldapGroupName_example",
      ldapId: "ldapId_example",
      memberPrefix: "memberPrefix_example",
    },
    name: "name_example",
    newMembers: [
      "newMembers_example",
    ],
    updatedMembers: [
      {
        memberId: "memberId_example",
        name: "name_example",
      },
    ],
  },
};

apiInstance.groupBuilderEditGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3EditGroupRequest** | **Groupbuilderv3EditGroupRequest**|  |
 **groupId** | [**number**] | Group ID. | defaults to undefined


### Return type

**Groupbuilderv3EditGroupResponse**

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

# **groupBuilderExportGroup**
> Groupbuilderv3GetExportGroupResponse groupBuilderExportGroup(groupbuilderv3GetExportGroupRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderExportGroupRequest = {
  // Groupbuilderv3GetExportGroupRequest
  groupbuilderv3GetExportGroupRequest: {
    exportHierarchy: true,
    groupId: 1,
  },
};

apiInstance.groupBuilderExportGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3GetExportGroupRequest** | **Groupbuilderv3GetExportGroupRequest**|  |


### Return type

**Groupbuilderv3GetExportGroupResponse**

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

# **groupBuilderGetGroupDetails**
> Groupbuilderv3GetGroupDetailResponse groupBuilderGetGroupDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderGetGroupDetailsRequest = {
  // number | Group ID.
  groupId: 1,
  // string | Filter by group member name. (optional)
  filter: "filter_example",
  // string | Order by ascending (ASC) or descending (DESC). (optional)
  order: "order_example",
};

apiInstance.groupBuilderGetGroupDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | [**number**] | Group ID. | defaults to undefined
 **filter** | [**string**] | Filter by group member name. | (optional) defaults to undefined
 **order** | [**string**] | Order by ascending (ASC) or descending (DESC). | (optional) defaults to undefined


### Return type

**Groupbuilderv3GetGroupDetailResponse**

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

# **groupBuilderGetGroupMembers**
> Groupbuilderv3GetGroupMembersResponse groupBuilderGetGroupMembers(groupbuilderv3GetGroupMembersRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderGetGroupMembersRequest = {
  // Groupbuilderv3GetGroupMembersRequest
  groupbuilderv3GetGroupMembersRequest: {
    groupId: [
      1,
    ],
  },
};

apiInstance.groupBuilderGetGroupMembers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3GetGroupMembersRequest** | **Groupbuilderv3GetGroupMembersRequest**|  |


### Return type

**Groupbuilderv3GetGroupMembersResponse**

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

# **groupBuilderGetGroupSyncMapping**
> Groupbuilderv3GetGroupSyncMappingResponse groupBuilderGetGroupSyncMapping()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderGetGroupSyncMappingRequest = {
  // string | Central manager. (optional)
  centralManagerId: "central_manager_id_example",
};

apiInstance.groupBuilderGetGroupSyncMapping(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central manager. | (optional) defaults to undefined


### Return type

**Groupbuilderv3GetGroupSyncMappingResponse**

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

# **groupBuilderGetGroupTypeMapping**
> Groupbuilderv3GetGroupTypeMappingResponse groupBuilderGetGroupTypeMapping()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:any = {};

apiInstance.groupBuilderGetGroupTypeMapping(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Groupbuilderv3GetGroupTypeMappingResponse**

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

# **groupBuilderGetGroupTypes**
> Groupbuilderv3GetGroupTypesResponse groupBuilderGetGroupTypes()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:any = {};

apiInstance.groupBuilderGetGroupTypes(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Groupbuilderv3GetGroupTypesResponse**

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

# **groupBuilderGetGroups**
> Groupbuilderv3GetGroupsResponse groupBuilderGetGroups()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderGetGroupsRequest = {
  // boolean | Return group names, ID\'s, type ID\'s, nested bool, and tuple count only if the flag is true. (optional)
  doNotIncludeMemberCount: true,
  // boolean | Only return groups that user has full-access to. (optional)
  onlyFullAccess: true,
  // boolean | Only return non-nested groups. (optional)
  nonNested: true,
};

apiInstance.groupBuilderGetGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doNotIncludeMemberCount** | [**boolean**] | Return group names, ID\&#39;s, type ID\&#39;s, nested bool, and tuple count only if the flag is true. | (optional) defaults to undefined
 **onlyFullAccess** | [**boolean**] | Only return groups that user has full-access to. | (optional) defaults to undefined
 **nonNested** | [**boolean**] | Only return non-nested groups. | (optional) defaults to undefined


### Return type

**Groupbuilderv3GetGroupsResponse**

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

# **groupBuilderGetImportGroups**
> Groupbuilderv3GetImportGroupsResponse groupBuilderGetImportGroups()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderGetImportGroupsRequest = {
  // string | Central manager host name. (optional)
  centralManagerId: "central_manager_id_example",
};

apiInstance.groupBuilderGetImportGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central manager host name. | (optional) defaults to undefined


### Return type

**Groupbuilderv3GetImportGroupsResponse**

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

# **groupBuilderImportGroup**
> Groupbuilderv3ImportGroupResponse groupBuilderImportGroup(groupbuilderv3ImportGroupRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderImportGroupRequest = {
  // Groupbuilderv3ImportGroupRequest
  groupbuilderv3ImportGroupRequest: {
    centralManagerId: "centralManagerId_example",
    groups: [
      {
        accessLevel: 1,
        description: "description_example",
        flattenedMemberCount: 1,
        groupId: 1,
        groupTypeId: 1,
        lastSyncDate: new Date('1970-01-01T00:00:00.00Z'),
        ldapConfig: {
          attributes: [
            "attributes_example",
          ],
          bindGroupId: 1,
          bindPassword: "bindPassword_example",
          clearGroup: true,
          filter: "filter_example",
          filterScope: 1,
          importLimit: 1,
          ldapGroupName: "ldapGroupName_example",
          ldapId: "ldapId_example",
          memberPrefix: "memberPrefix_example",
        },
        memberCount: 1,
        members: [
          {
            memberId: "memberId_example",
            name: "name_example",
          },
        ],
        name: "name_example",
        nested: true,
        nestedGroupMembers: [
          {
            groupId: 1,
            name: "name_example",
            nestedMemberId: 1,
          },
        ],
        nextSyncDate: new Date('1970-01-01T00:00:00.00Z'),
        syncInactiveCode: 1,
        syncSource: "syncSource_example",
        synced: true,
        tupleCount: 1,
        tupleParams: [
          "tupleParams_example",
        ],
      },
    ],
    ldapConfig: {
      attributes: [
        "attributes_example",
      ],
      bindGroupId: 1,
      bindPassword: "bindPassword_example",
      clearGroup: true,
      filter: "filter_example",
      filterScope: 1,
      importLimit: 1,
      ldapGroupName: "ldapGroupName_example",
      ldapId: "ldapId_example",
      memberPrefix: "memberPrefix_example",
    },
    oneTime: true,
    preview: true,
  },
};

apiInstance.groupBuilderImportGroup(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3ImportGroupRequest** | **Groupbuilderv3ImportGroupRequest**|  |


### Return type

**Groupbuilderv3ImportGroupResponse**

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

# **groupBuilderRefreshGroups**
> Groupbuilderv3RefreshGroupsResponse groupBuilderRefreshGroups(groupbuilderv3RefreshGroupsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderRefreshGroupsRequest = {
  // Groupbuilderv3RefreshGroupsRequest
  groupbuilderv3RefreshGroupsRequest: {
    groupIds: [
      1,
    ],
  },
};

apiInstance.groupBuilderRefreshGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3RefreshGroupsRequest** | **Groupbuilderv3RefreshGroupsRequest**|  |


### Return type

**Groupbuilderv3RefreshGroupsResponse**

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

# **groupBuilderResetGroups**
> Groupbuilderv3ResetGroupsResponse groupBuilderResetGroups(groupbuilderv3ResetGroupsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderResetGroupsRequest = {
  // Groupbuilderv3ResetGroupsRequest
  groupbuilderv3ResetGroupsRequest: {
    groupIds: [
      1,
    ],
  },
};

apiInstance.groupBuilderResetGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3ResetGroupsRequest** | **Groupbuilderv3ResetGroupsRequest**|  |


### Return type

**Groupbuilderv3ResetGroupsResponse**

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

# **groupBuilderStoreGroupMembersGdp**
> Groupbuilderv3StoreGroupMembersGdpResponse groupBuilderStoreGroupMembersGdp(groupbuilderv3StoreGroupMembersGdpRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderStoreGroupMembersGdpRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // Groupbuilderv3StoreGroupMembersGdpRequest
  groupbuilderv3StoreGroupMembersGdpRequest: {
    centralManagerId: "centralManagerId_example",
    data: "data_example",
  },
};

apiInstance.groupBuilderStoreGroupMembersGdp(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3StoreGroupMembersGdpRequest** | **Groupbuilderv3StoreGroupMembersGdpRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Groupbuilderv3StoreGroupMembersGdpResponse**

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

# **groupBuilderStoreGroupsGdp**
> Groupbuilderv3GetGroupsResponseGdp groupBuilderStoreGroupsGdp(groupbuilderv3GetGroupsRequestGdp)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GroupBuilderApi(configuration);

let body:.GroupBuilderApiGroupBuilderStoreGroupsGdpRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // Groupbuilderv3GetGroupsRequestGdp
  groupbuilderv3GetGroupsRequestGdp: {
    centralManagerId: "centralManagerId_example",
    data: [
      {
        application: "application_example",
        description: "description_example",
        hierarchical: true,
        id: 1,
        memberCount: 1,
        members: "members_example",
        tupleCount: 1,
        tuples: "tuples_example",
        type: "type_example",
        typeId: 1,
      },
    ],
  },
};

apiInstance.groupBuilderStoreGroupsGdp(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupbuilderv3GetGroupsRequestGdp** | **Groupbuilderv3GetGroupsRequestGdp**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Groupbuilderv3GetGroupsResponseGdp**

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





# .GuardiumConnectorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**guardiumConnectorAddCM**](GuardiumConnectorApi.md#guardiumConnectorAddCM) | **POST** /api/v3/central_managers | Summary: Add CM Description: Add a Central Manager to the tenant database.
[**guardiumConnectorAddDatamarts**](GuardiumConnectorApi.md#guardiumConnectorAddDatamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts | Description: stores datamarts details from GDP
[**guardiumConnectorAddDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorAddDmExclusion) | **POST** /api/v3/datamarts/exclusion_list | Summary: Add DM exclusion Description: Add datamart to exclusion list.
[**guardiumConnectorAddTask**](GuardiumConnectorApi.md#guardiumConnectorAddTask) | **POST** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Add task Description: Add a task to be executed on GDP.
[**guardiumConnectorBlockUser**](GuardiumConnectorApi.md#guardiumConnectorBlockUser) | **POST** /api/v3/block_user | Summary: Block user Description: Block a database user on Guardium Data Protection or on a supported Database as a Service instance.
[**guardiumConnectorConfigureAggregatorExport**](GuardiumConnectorApi.md#guardiumConnectorConfigureAggregatorExport) | **PUT** /api/v3/central_managers/{central_manager_id}/aggregator_config_export | Summary: Configure aggregator export Description: Configure datamart export from the Aggregators to GI.
[**guardiumConnectorConfigureCollectorExport**](GuardiumConnectorApi.md#guardiumConnectorConfigureCollectorExport) | **PUT** /api/v3/central_managers/{central_manager_id}/collector_config_export | Summary: Configure collector export Description: Schedule export historical data for collectors.
[**guardiumConnectorConfigureStreaming**](GuardiumConnectorApi.md#guardiumConnectorConfigureStreaming) | **POST** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Configure streaming Description: Enable or disable streaming.
[**guardiumConnectorDatamartVersionCheck**](GuardiumConnectorApi.md#guardiumConnectorDatamartVersionCheck) | **POST** /api/v3/central_managers/{central_manager_id}/datamart_version | Description: validates if central manager has datamart support for event model
[**guardiumConnectorDeleteCM**](GuardiumConnectorApi.md#guardiumConnectorDeleteCM) | **DELETE** /api/v3/central_managers/{central_manager_id} | Summary: Delete CM Description: Delete a Central Manager by ID (Name, Hostname or IP).
[**guardiumConnectorDeleteDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorDeleteDmExclusion) | **DELETE** /api/v3/datamarts/exclusion_list | Summary: Delete DM exclusion Description: Delete a datamart from exclusion list.
[**guardiumConnectorDeleteTask**](GuardiumConnectorApi.md#guardiumConnectorDeleteTask) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Delete task Description: Delete a task by central manager id and task id.
[**guardiumConnectorDeleteTasks**](GuardiumConnectorApi.md#guardiumConnectorDeleteTasks) | **DELETE** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Delete tasks Description: Delete a central manager\&#39;s tasks by central manager id.
[**guardiumConnectorGetAggregatorsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetAggregatorsConfig) | **GET** /api/v3/central_managers/{central_manager_id}/aggregators_config | Summary: Get aggregators config Description: Return a list of managed units from the config collection in tenant database.
[**guardiumConnectorGetCMs**](GuardiumConnectorApi.md#guardiumConnectorGetCMs) | **GET** /api/v3/central_managers | Summary: Get CMs Description: Return a list of Central Managers from the tenant database with additional processing.
[**guardiumConnectorGetCMsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetCMsConfig) | **GET** /api/v3/central_managers_config | Summary: Get CMs config Description: Return a list of Central Managers from the tenant database.
[**guardiumConnectorGetCollectorsConfig**](GuardiumConnectorApi.md#guardiumConnectorGetCollectorsConfig) | **GET** /api/v3/central_managers/{central_manager_id}/collectors_config | Summary: Get collectors config Description: Return the list of collectors configuration from the tenant database.
[**guardiumConnectorGetDatamarts**](GuardiumConnectorApi.md#guardiumConnectorGetDatamarts) | **GET** /api/v3/central_managers/{central_manager_id}/datamarts | Description: returns full list of supported datamarts including type (historical or non-historical)
[**guardiumConnectorGetDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorGetDmExclusion) | **GET** /api/v3/datamarts/exclusion_list | Summary: Get DM exclusion Description: Return datamarts in the exclusion list.
[**guardiumConnectorGetGdpPolicyInfo**](GuardiumConnectorApi.md#guardiumConnectorGetGdpPolicyInfo) | **GET** /api/v3/central_managers/{central_manager_id}/policies/info | Summary: Get guardium policy definition Description: returns the policy definition on the cm
[**guardiumConnectorGetGdpPolicySummaries**](GuardiumConnectorApi.md#guardiumConnectorGetGdpPolicySummaries) | **GET** /api/v3/central_managers/{central_manager_id}/policies/summaries | Summary: Get guardium policy summary Description: returns the summaries of all policies on that central manager
[**guardiumConnectorGetHealthInfo**](GuardiumConnectorApi.md#guardiumConnectorGetHealthInfo) | **GET** /api/v3/central_managers/{central_manager_id}/health_info | Summary: Get gealth info Description: Get health information from Guardium Data Protection central mamangers.
[**guardiumConnectorGetLatestDMExtractionProfile**](GuardiumConnectorApi.md#guardiumConnectorGetLatestDMExtractionProfile) | **GET** /api/v3/central_managers/{central_manager_id}/datamart_extraction_profile | Summary: Get latest DM extraction profile Description: Return the Datamart Extraction Profile for Guardium.
[**guardiumConnectorGetStreamingStatus**](GuardiumConnectorApi.md#guardiumConnectorGetStreamingStatus) | **GET** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Get streaming status Description: Return the streaming configuration.
[**guardiumConnectorGetSyncDMs**](GuardiumConnectorApi.md#guardiumConnectorGetSyncDMs) | **GET** /api/v3/central_managers/{central_manager_id}/sync | Summary: Get sync DMs Description: Return the list of tasks from a central manager.
[**guardiumConnectorGetTaskTypes**](GuardiumConnectorApi.md#guardiumConnectorGetTaskTypes) | **GET** /api/v3/central_managers/task_types | Summary: Get task types Description: Return the list of supported task types.
[**guardiumConnectorGetTasks**](GuardiumConnectorApi.md#guardiumConnectorGetTasks) | **GET** /api/v3/central_managers/{central_manager_id}/tasks | Summary: Get tasks Description: Return the list of tasks from a central manager.
[**guardiumConnectorRunGDPReport**](GuardiumConnectorApi.md#guardiumConnectorRunGDPReport) | **POST** /api/v3/central_managers/{central_manager_id}/run_report | Summary: Run GDP report Description: Run GDP report.
[**guardiumConnectorSetupCM**](GuardiumConnectorApi.md#guardiumConnectorSetupCM) | **POST** /api/v3/central_managers/setup | Summary: Setup CM Description: Set up the registration between a GDP Central manager and Guardium.
[**guardiumConnectorSetupDatamarts**](GuardiumConnectorApi.md#guardiumConnectorSetupDatamarts) | **POST** /api/v3/central_managers/{central_manager_id}/datamarts/setup | Description: setup custom datamart execution mode
[**guardiumConnectorTaskError**](GuardiumConnectorApi.md#guardiumConnectorTaskError) | **POST** /api/v3/central_managers/{central_manager_id}/tasks/error | Summary: Task error Description: Log error messages from GDP task execution.
[**guardiumConnectorTestDatabaseConnection**](GuardiumConnectorApi.md#guardiumConnectorTestDatabaseConnection) | **POST** /api/v3/test_database | Summary: Test database connection Description: Return database connection results.
[**guardiumConnectorUpdateDmExclusion**](GuardiumConnectorApi.md#guardiumConnectorUpdateDmExclusion) | **PUT** /api/v3/datamarts/exclusion_list | Summary: Update DM exclusion Description: Update the atamart exclusion list.
[**guardiumConnectorUpdateStreaming**](GuardiumConnectorApi.md#guardiumConnectorUpdateStreaming) | **PUT** /api/v3/central_managers/{central_manager_id}/streaming | Summary: Update streaming Description: Update streaming status into GI.
[**guardiumConnectorUpdateTask**](GuardiumConnectorApi.md#guardiumConnectorUpdateTask) | **PUT** /api/v3/central_managers/{central_manager_id}/tasks/{task_id} | Summary: Update task Description: Update a task that gets executed on GDP.


# **guardiumConnectorAddCM**
> Guardiumconnectorv3AddCMResponse guardiumConnectorAddCM(guardiumconnectorv3AddCMRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorAddCMRequest = {
  // Guardiumconnectorv3AddCMRequest
  guardiumconnectorv3AddCMRequest: {
    cm: {
      attributes: [
        {
          name: "name_example",
          value: "value_example",
        },
      ],
      centralManagerId: "centralManagerId_example",
      cmDateParamAvailable: "cmDateParamAvailable_example",
      datamartEndDateAggregator: "datamartEndDateAggregator_example",
      datamartStartDateAggregator: "datamartStartDateAggregator_example",
      datamartStartDateCollector: "datamartStartDateCollector_example",
      maxSupportedDmVersion: "maxSupportedDmVersion_example",
      mode: "mode_example",
      name: "name_example",
      port: "port_example",
      status: "status_example",
      supportCustomDmTypeSetup: "supportCustomDmTypeSetup_example",
    },
    editCmAttributes: [
      "editCmAttributes_example",
    ],
    isEdit: true,
  },
};

apiInstance.guardiumConnectorAddCM(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3AddCMRequest** | **Guardiumconnectorv3AddCMRequest**|  |


### Return type

**Guardiumconnectorv3AddCMResponse**

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

# **guardiumConnectorAddDatamarts**
> Guardiumconnectorv3AddDatamartsResponse guardiumConnectorAddDatamarts(guardiumconnectorv3AddDatamartsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorAddDatamartsRequest = {
  // string | central manager
  centralManagerId: "central_manager_id_example",
  // Guardiumconnectorv3AddDatamartsRequest
  guardiumconnectorv3AddDatamartsRequest: {
    centralManagerId: "centralManagerId_example",
    data: "data_example",
  },
};

apiInstance.guardiumConnectorAddDatamarts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3AddDatamartsRequest** | **Guardiumconnectorv3AddDatamartsRequest**|  |
 **centralManagerId** | [**string**] | central manager | defaults to undefined


### Return type

**Guardiumconnectorv3AddDatamartsResponse**

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

# **guardiumConnectorAddDmExclusion**
> Guardiumconnectorv3AddDmExclusionResponse guardiumConnectorAddDmExclusion(guardiumconnectorv3AddDmExclusionRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorAddDmExclusionRequest = {
  // Guardiumconnectorv3AddDmExclusionRequest
  guardiumconnectorv3AddDmExclusionRequest: {
    datamart: "datamart_example",
  },
};

apiInstance.guardiumConnectorAddDmExclusion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3AddDmExclusionRequest** | **Guardiumconnectorv3AddDmExclusionRequest**|  |


### Return type

**Guardiumconnectorv3AddDmExclusionResponse**

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

# **guardiumConnectorAddTask**
> Guardiumconnectorv3AddTaskResponse guardiumConnectorAddTask(guardiumconnectorv3AddTaskRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorAddTaskRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // Guardiumconnectorv3AddTaskRequest
  guardiumconnectorv3AddTaskRequest: {
    centralManagerId: "centralManagerId_example",
    interval: "interval_example",
    keyObject: "keyObject_example",
    params: [
      {
        argName: "argName_example",
        argValue: "argValue_example",
      },
    ],
    taskType: "taskType_example",
  },
};

apiInstance.guardiumConnectorAddTask(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3AddTaskRequest** | **Guardiumconnectorv3AddTaskRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Guardiumconnectorv3AddTaskResponse**

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

# **guardiumConnectorBlockUser**
> Guardiumconnectorv3BlockUserResponse guardiumConnectorBlockUser(guardiumconnectorv3BlockUserRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorBlockUserRequest = {
  // Guardiumconnectorv3BlockUserRequest
  guardiumconnectorv3BlockUserRequest: {
    destination: {
      configId: "configId_example",
      guardiumId: "guardiumId_example",
    },
    details: {
      bdbname: "bdbname_example",
      bip: "bip_example",
      bport: "bport_example",
      buser: "buser_example",
    },
  },
};

apiInstance.guardiumConnectorBlockUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3BlockUserRequest** | **Guardiumconnectorv3BlockUserRequest**|  |


### Return type

**Guardiumconnectorv3BlockUserResponse**

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

# **guardiumConnectorConfigureAggregatorExport**
> Guardiumconnectorv3ConfigureAggregatorExportResponse guardiumConnectorConfigureAggregatorExport(guardiumconnectorv3ConfigureAggregatorExportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorConfigureAggregatorExportRequest = {
  // string | Central Manager ID.
  centralManagerId: "central_manager_id_example",
  // Guardiumconnectorv3ConfigureAggregatorExportRequest
  guardiumconnectorv3ConfigureAggregatorExportRequest: {
    centralManagerId: "centralManagerId_example",
    datamartEndDateAggregator: "datamartEndDateAggregator_example",
    datamartStartDateAggregator: "datamartStartDateAggregator_example",
    managedUnits: [
      "managedUnits_example",
    ],
    skipHistoricalDatamarts: true,
    updateCentralManager: true,
  },
};

apiInstance.guardiumConnectorConfigureAggregatorExport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3ConfigureAggregatorExportRequest** | **Guardiumconnectorv3ConfigureAggregatorExportRequest**|  |
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3ConfigureAggregatorExportResponse**

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

# **guardiumConnectorConfigureCollectorExport**
> Guardiumconnectorv3ConfigureCollectorExportResponse guardiumConnectorConfigureCollectorExport(guardiumconnectorv3ConfigureCollectorExportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorConfigureCollectorExportRequest = {
  // string | Central Manager ID.
  centralManagerId: "central_manager_id_example",
  // Guardiumconnectorv3ConfigureCollectorExportRequest
  guardiumconnectorv3ConfigureCollectorExportRequest: {
    centralManagerId: "centralManagerId_example",
    collectors: [
      "collectors_example",
    ],
    startDate: "startDate_example",
  },
};

apiInstance.guardiumConnectorConfigureCollectorExport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3ConfigureCollectorExportRequest** | **Guardiumconnectorv3ConfigureCollectorExportRequest**|  |
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3ConfigureCollectorExportResponse**

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

# **guardiumConnectorConfigureStreaming**
> Guardiumconnectorv3ConfigureStreamingResponse guardiumConnectorConfigureStreaming(guardiumconnectorv3ConfigureStreamingRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorConfigureStreamingRequest = {
  // string | Central Manager ID.
  centralManagerId: "central_manager_id_example",
  // Guardiumconnectorv3ConfigureStreamingRequest
  guardiumconnectorv3ConfigureStreamingRequest: {
    action: "action_example",
    centralManagerId: "centralManagerId_example",
    skipHistoricalDatamarts: true,
    units: [
      "units_example",
    ],
  },
};

apiInstance.guardiumConnectorConfigureStreaming(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3ConfigureStreamingRequest** | **Guardiumconnectorv3ConfigureStreamingRequest**|  |
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3ConfigureStreamingResponse**

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

# **guardiumConnectorDatamartVersionCheck**
> Guardiumconnectorv3DatamartVersionResponse guardiumConnectorDatamartVersionCheck(guardiumconnectorv3DatamartVersionRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorDatamartVersionCheckRequest = {
  // string | Central manager
  centralManagerId: "central_manager_id_example",
  // Guardiumconnectorv3DatamartVersionRequest
  guardiumconnectorv3DatamartVersionRequest: {
    centralManagerId: "centralManagerId_example",
    data: "data_example",
  },
};

apiInstance.guardiumConnectorDatamartVersionCheck(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3DatamartVersionRequest** | **Guardiumconnectorv3DatamartVersionRequest**|  |
 **centralManagerId** | [**string**] | Central manager | defaults to undefined


### Return type

**Guardiumconnectorv3DatamartVersionResponse**

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

# **guardiumConnectorDeleteCM**
> Guardiumconnectorv3DeleteCMResponse guardiumConnectorDeleteCM()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorDeleteCMRequest = {
  // string | Central Manager ID.
  centralManagerId: "central_manager_id_example",
  // number | Flag to force delete CM and associated tasks (0=validate CM is online before deleting, 1=force delete CM). (optional)
  force: 1,
};

apiInstance.guardiumConnectorDeleteCM(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined
 **force** | [**number**] | Flag to force delete CM and associated tasks (0&#x3D;validate CM is online before deleting, 1&#x3D;force delete CM). | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3DeleteCMResponse**

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

# **guardiumConnectorDeleteDmExclusion**
> Guardiumconnectorv3DeleteDmExclusionResponse guardiumConnectorDeleteDmExclusion()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorDeleteDmExclusionRequest = {
  // string | Datamart name. (optional)
  datamart: "datamart_example",
};

apiInstance.guardiumConnectorDeleteDmExclusion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datamart** | [**string**] | Datamart name. | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3DeleteDmExclusionResponse**

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

# **guardiumConnectorDeleteTask**
> Guardiumconnectorv3DeleteTaskResponse guardiumConnectorDeleteTask()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorDeleteTaskRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // string | ID of task being deleted.
  taskId: "task_id_example",
};

apiInstance.guardiumConnectorDeleteTask(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined
 **taskId** | [**string**] | ID of task being deleted. | defaults to undefined


### Return type

**Guardiumconnectorv3DeleteTaskResponse**

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

# **guardiumConnectorDeleteTasks**
> Guardiumconnectorv3DeleteTasksResponse guardiumConnectorDeleteTasks()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorDeleteTasksRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
};

apiInstance.guardiumConnectorDeleteTasks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Guardiumconnectorv3DeleteTasksResponse**

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

# **guardiumConnectorGetAggregatorsConfig**
> Guardiumconnectorv3GetAggregatorsConfigResponse guardiumConnectorGetAggregatorsConfig()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetAggregatorsConfigRequest = {
  // string | Central Manager ID.
  centralManagerId: "central_manager_id_example",
};

apiInstance.guardiumConnectorGetAggregatorsConfig(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3GetAggregatorsConfigResponse**

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

# **guardiumConnectorGetCMs**
> Guardiumconnectorv3GetCMsResponse guardiumConnectorGetCMs()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetCMsRequest = {
  // boolean | Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. (optional)
  runAdditionalChecks: true,
};

apiInstance.guardiumConnectorGetCMs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runAdditionalChecks** | [**boolean**] | Retrieve the streaming status for all Managed Units that are reporting to a particular Central Manager. | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3GetCMsResponse**

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

# **guardiumConnectorGetCMsConfig**
> Guardiumconnectorv3GetCMsConfigResponse guardiumConnectorGetCMsConfig()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:any = {};

apiInstance.guardiumConnectorGetCMsConfig(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Guardiumconnectorv3GetCMsConfigResponse**

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

# **guardiumConnectorGetCollectorsConfig**
> Guardiumconnectorv3GetCollectorsConfigResponse guardiumConnectorGetCollectorsConfig()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetCollectorsConfigRequest = {
  // string | Central Manager ID.
  centralManagerId: "central_manager_id_example",
};

apiInstance.guardiumConnectorGetCollectorsConfig(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3GetCollectorsConfigResponse**

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

# **guardiumConnectorGetDatamarts**
> Guardiumconnectorv3GetDatamartsResponse guardiumConnectorGetDatamarts()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetDatamartsRequest = {
  // string | central manager hostname
  centralManagerId: "central_manager_id_example",
};

apiInstance.guardiumConnectorGetDatamarts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | central manager hostname | defaults to undefined


### Return type

**Guardiumconnectorv3GetDatamartsResponse**

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

# **guardiumConnectorGetDmExclusion**
> Guardiumconnectorv3GetDmExclusionResponse guardiumConnectorGetDmExclusion()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:any = {};

apiInstance.guardiumConnectorGetDmExclusion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Guardiumconnectorv3GetDmExclusionResponse**

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

# **guardiumConnectorGetGdpPolicyInfo**
> Guardiumconnectorv3GetPolicyInfoResponse guardiumConnectorGetGdpPolicyInfo()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetGdpPolicyInfoRequest = {
  // string | Central manager hostname
  centralManagerId: "central_manager_id_example",
  // string | Policy name. (optional)
  policyName: "policy_name_example",
};

apiInstance.guardiumConnectorGetGdpPolicyInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central manager hostname | defaults to undefined
 **policyName** | [**string**] | Policy name. | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3GetPolicyInfoResponse**

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

# **guardiumConnectorGetGdpPolicySummaries**
> Guardiumconnectorv3GetPolicySummariesResponse guardiumConnectorGetGdpPolicySummaries()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetGdpPolicySummariesRequest = {
  // string | Central manager hostname
  centralManagerId: "central_manager_id_example",
};

apiInstance.guardiumConnectorGetGdpPolicySummaries(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central manager hostname | defaults to undefined


### Return type

**Guardiumconnectorv3GetPolicySummariesResponse**

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

# **guardiumConnectorGetHealthInfo**
> Guardiumconnectorv3GetHealthInfoResponse guardiumConnectorGetHealthInfo()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetHealthInfoRequest = {
  // string | Central Manager ID.
  centralManagerId: "central_manager_id_example",
  // boolean | Flag indicating if the older gdp api is to be called in case it doesn\'t support new api. (optional)
  useFallback: true,
};

apiInstance.guardiumConnectorGetHealthInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined
 **useFallback** | [**boolean**] | Flag indicating if the older gdp api is to be called in case it doesn\&#39;t support new api. | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3GetHealthInfoResponse**

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

# **guardiumConnectorGetLatestDMExtractionProfile**
> Guardiumconnectorv3GetLatestDMExtractionProfileResponse guardiumConnectorGetLatestDMExtractionProfile()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetLatestDMExtractionProfileRequest = {
  // string | Central Manager ID.
  centralManagerId: "central_manager_id_example",
};

apiInstance.guardiumConnectorGetLatestDMExtractionProfile(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3GetLatestDMExtractionProfileResponse**

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

# **guardiumConnectorGetStreamingStatus**
> Guardiumconnectorv3GetStreamingStatusResponse guardiumConnectorGetStreamingStatus()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetStreamingStatusRequest = {
  // string | Central Manager ID.
  centralManagerId: "central_manager_id_example",
};

apiInstance.guardiumConnectorGetStreamingStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3GetStreamingStatusResponse**

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

# **guardiumConnectorGetSyncDMs**
> Guardiumconnectorv3GetSyncDMsResponse guardiumConnectorGetSyncDMs()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetSyncDMsRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
};

apiInstance.guardiumConnectorGetSyncDMs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Guardiumconnectorv3GetSyncDMsResponse**

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

# **guardiumConnectorGetTaskTypes**
> Guardiumconnectorv3GetTaskTypesResponse guardiumConnectorGetTaskTypes()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:any = {};

apiInstance.guardiumConnectorGetTaskTypes(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Guardiumconnectorv3GetTaskTypesResponse**

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

# **guardiumConnectorGetTasks**
> Guardiumconnectorv3GetTasksResponse guardiumConnectorGetTasks()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorGetTasksRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // string | ID of task. (optional)
  taskId: "task_id_example",
  // string | Type of task. (optional)
  taskType: "task_type_example",
  // string | Key object. (optional)
  keyObject: "key_object_example",
};

apiInstance.guardiumConnectorGetTasks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined
 **taskId** | [**string**] | ID of task. | (optional) defaults to undefined
 **taskType** | [**string**] | Type of task. | (optional) defaults to undefined
 **keyObject** | [**string**] | Key object. | (optional) defaults to undefined


### Return type

**Guardiumconnectorv3GetTasksResponse**

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

# **guardiumConnectorRunGDPReport**
> Guardiumconnectorv3RunGDPReportResponse guardiumConnectorRunGDPReport(guardiumconnectorv3RunGDPReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorRunGDPReportRequest = {
  // string | Central Manager ID.
  centralManagerId: "central_manager_id_example",
  // Guardiumconnectorv3RunGDPReportRequest
  guardiumconnectorv3RunGDPReportRequest: {
    centralManagerId: "centralManagerId_example",
    maxFetchSize: 1,
    reportName: "reportName_example",
    reportParameters: [
      {
        parameterValue: "parameterValue_example",
        paremeterName: "paremeterName_example",
      },
    ],
    sortColumn: "sortColumn_example",
    sortOrder: "ACS",
    startFrom: 1,
  },
};

apiInstance.guardiumConnectorRunGDPReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3RunGDPReportRequest** | **Guardiumconnectorv3RunGDPReportRequest**|  |
 **centralManagerId** | [**string**] | Central Manager ID. | defaults to undefined


### Return type

**Guardiumconnectorv3RunGDPReportResponse**

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

# **guardiumConnectorSetupCM**
> Guardiumconnectorv3SetupCMResponse guardiumConnectorSetupCM(guardiumconnectorv3SetupCMRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorSetupCMRequest = {
  // Guardiumconnectorv3SetupCMRequest
  guardiumconnectorv3SetupCMRequest: {
    attributes: [
      {
        name: "name_example",
        value: "value_example",
      },
    ],
    cmGid: "cmGid_example",
    cmHostname: "cmHostname_example",
    cmIp: "cmIp_example",
    pushRegistration: true,
  },
};

apiInstance.guardiumConnectorSetupCM(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3SetupCMRequest** | **Guardiumconnectorv3SetupCMRequest**|  |


### Return type

**Guardiumconnectorv3SetupCMResponse**

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

# **guardiumConnectorSetupDatamarts**
> Guardiumconnectorv3SetupDatamartsResponse guardiumConnectorSetupDatamarts(guardiumconnectorv3SetupDatamartsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorSetupDatamartsRequest = {
  // string | central manager
  centralManagerId: "central_manager_id_example",
  // Guardiumconnectorv3SetupDatamartsRequest
  guardiumconnectorv3SetupDatamartsRequest: {
    centralManagerId: "centralManagerId_example",
    datamarts: [
      {
        dmExecDefaultMode: "dmExecDefaultMode_example",
        dmExecMode: "dmExecMode_example",
        dmName: "dmName_example",
      },
    ],
  },
};

apiInstance.guardiumConnectorSetupDatamarts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3SetupDatamartsRequest** | **Guardiumconnectorv3SetupDatamartsRequest**|  |
 **centralManagerId** | [**string**] | central manager | defaults to undefined


### Return type

**Guardiumconnectorv3SetupDatamartsResponse**

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

# **guardiumConnectorTaskError**
> Guardiumconnectorv3TaskErrorResponse guardiumConnectorTaskError(guardiumconnectorv3TaskErrorRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorTaskErrorRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // Guardiumconnectorv3TaskErrorRequest
  guardiumconnectorv3TaskErrorRequest: {
    centralManagerId: "centralManagerId_example",
    errorCode: "errorCode_example",
    errorDescription: "errorDescription_example",
    task: {
      taskId: "taskId_example",
      taskParams: [
        {
          argName: "argName_example",
          argValue: "argValue_example",
        },
      ],
      taskType: "taskType_example",
    },
  },
};

apiInstance.guardiumConnectorTaskError(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3TaskErrorRequest** | **Guardiumconnectorv3TaskErrorRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Guardiumconnectorv3TaskErrorResponse**

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

# **guardiumConnectorTestDatabaseConnection**
> Guardiumconnectorv3DatabaseResultResponse guardiumConnectorTestDatabaseConnection(guardiumconnectorv3DatabaseConnectionStringRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorTestDatabaseConnectionRequest = {
  // Guardiumconnectorv3DatabaseConnectionStringRequest
  guardiumconnectorv3DatabaseConnectionStringRequest: {
    dbhost: "dbhost_example",
    dbname: "dbname_example",
    password: "password_example",
    port: "port_example",
    user: "user_example",
  },
};

apiInstance.guardiumConnectorTestDatabaseConnection(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3DatabaseConnectionStringRequest** | **Guardiumconnectorv3DatabaseConnectionStringRequest**|  |


### Return type

**Guardiumconnectorv3DatabaseResultResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **guardiumConnectorUpdateDmExclusion**
> Guardiumconnectorv3UpdateDmExclusionResponse guardiumConnectorUpdateDmExclusion(guardiumconnectorv3UpdateDmExclusionRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorUpdateDmExclusionRequest = {
  // Guardiumconnectorv3UpdateDmExclusionRequest
  guardiumconnectorv3UpdateDmExclusionRequest: {
    datamartList: [
      "datamartList_example",
    ],
  },
};

apiInstance.guardiumConnectorUpdateDmExclusion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3UpdateDmExclusionRequest** | **Guardiumconnectorv3UpdateDmExclusionRequest**|  |


### Return type

**Guardiumconnectorv3UpdateDmExclusionResponse**

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

# **guardiumConnectorUpdateStreaming**
> Guardiumconnectorv3UpdateStreamingResponse guardiumConnectorUpdateStreaming(guardiumconnectorv3UpdateStreamingRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorUpdateStreamingRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // Guardiumconnectorv3UpdateStreamingRequest
  guardiumconnectorv3UpdateStreamingRequest: {
    centralManagerId: "centralManagerId_example",
    records: [
      {
        attributes: [
          {
            key: "key_example",
            value: "value_example",
          },
        ],
        hostName: "hostName_example",
        message: "message_example",
        state: "state_example",
        status: "status_example",
      },
    ],
    status: "status_example",
  },
};

apiInstance.guardiumConnectorUpdateStreaming(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3UpdateStreamingRequest** | **Guardiumconnectorv3UpdateStreamingRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Guardiumconnectorv3UpdateStreamingResponse**

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

# **guardiumConnectorUpdateTask**
> Guardiumconnectorv3UpdateTaskResponse guardiumConnectorUpdateTask(guardiumconnectorv3UpdateTaskRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .GuardiumConnectorApi(configuration);

let body:.GuardiumConnectorApiGuardiumConnectorUpdateTaskRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // string | ID of task being updated.
  taskId: "task_id_example",
  // Guardiumconnectorv3UpdateTaskRequest
  guardiumconnectorv3UpdateTaskRequest: {
    centralManagerId: "centralManagerId_example",
    interval: "interval_example",
    taskId: "taskId_example",
  },
};

apiInstance.guardiumConnectorUpdateTask(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **guardiumconnectorv3UpdateTaskRequest** | **Guardiumconnectorv3UpdateTaskRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined
 **taskId** | [**string**] | ID of task being updated. | defaults to undefined


### Return type

**Guardiumconnectorv3UpdateTaskResponse**

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





# .HealthCollectorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthCollectorGetDataWarehouseUsage**](HealthCollectorApi.md#healthCollectorGetDataWarehouseUsage) | **GET** /api/v3/metrics/warehouse/{type} | Summary: Get data warehouse usage info Description: Get information from Db2 related to usage
[**healthCollectorGetGDPHealthInfo**](HealthCollectorApi.md#healthCollectorGetGDPHealthInfo) | **GET** /api/v3/health | Summary: Get GDP health info Description: Get information from MongoDB for Guardium central managers using health-connector service.
[**healthCollectorGetHistoricalHealthInfo**](HealthCollectorApi.md#healthCollectorGetHistoricalHealthInfo) | **GET** /api/v3/health/history | Summary: Get historical health info Description: Retrieve historical s-tap related statistics from health-collector service.
[**healthCollectorGetObjectStorageUsage**](HealthCollectorApi.md#healthCollectorGetObjectStorageUsage) | **GET** /api/v3/metrics/object_storage/{type} | Summary: Get object storage usage info Description: Get information from object storage about tenant bucket usage
[**healthCollectorGetPVCUsage**](HealthCollectorApi.md#healthCollectorGetPVCUsage) | **GET** /api/v3/metrics/pvc/{type} | Summary: Get the PVC usage information Description: Get information about the PVC usage in the OCP cluster
[**healthCollectorGetPodRestarts**](HealthCollectorApi.md#healthCollectorGetPodRestarts) | **GET** /api/v3/metrics/pods/{type} | Summary: Get the pod restart information Description: Get information about the number of restarts by pod in OCP
[**healthCollectorGetStreamsIngestion**](HealthCollectorApi.md#healthCollectorGetStreamsIngestion) | **GET** /api/v3/metrics/streams/{type} | Summary: Get streams ingestion volume over a given time Description: Get information about streams ingestion volume
[**healthCollectorGetTopGDPCollectors**](HealthCollectorApi.md#healthCollectorGetTopGDPCollectors) | **GET** /api/v3/metrics/collectors/{type} | Summary: Get the top GDP collectors which send data to GI Description: Get information about the top GDP collectors
[**healthCollectorStoreHealthInfo**](HealthCollectorApi.md#healthCollectorStoreHealthInfo) | **POST** /api/v3/health/central_managers/{central_manager_id}/health_info | Summary: Store health info Description: Store health info from GDP into GI. (This API is called from GDP only)


# **healthCollectorGetDataWarehouseUsage**
> Healthcollectorv3GetDataWarehouseUsageResponse healthCollectorGetDataWarehouseUsage()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .HealthCollectorApi(configuration);

let body:.HealthCollectorApiHealthCollectorGetDataWarehouseUsageRequest = {
  // string | The type of metric to retrieve
  type: "type_example",
  // Date | The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

apiInstance.healthCollectorGetDataWarehouseUsage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetDataWarehouseUsageResponse**

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

# **healthCollectorGetGDPHealthInfo**
> Healthcollectorv3GetGDPHealthInfoResponse healthCollectorGetGDPHealthInfo()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .HealthCollectorApi(configuration);

let body:any = {};

apiInstance.healthCollectorGetGDPHealthInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Healthcollectorv3GetGDPHealthInfoResponse**

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

# **healthCollectorGetHistoricalHealthInfo**
> Healthcollectorv3GetHistoricalHealthInfoResponse healthCollectorGetHistoricalHealthInfo()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .HealthCollectorApi(configuration);

let body:.HealthCollectorApiHealthCollectorGetHistoricalHealthInfoRequest = {
  // 'UNKNOWN_UNIT' | 'STAP' | Type of unit for which data needs to be retrieved. (optional)
  unit: "UNKNOWN_UNIT",
  // string | Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. (optional)
  cmId: "cm_id_example",
  // Date | The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

apiInstance.healthCollectorGetHistoricalHealthInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **unit** | [**&#39;UNKNOWN_UNIT&#39; | &#39;STAP&#39;**]**Array<&#39;UNKNOWN_UNIT&#39; &#124; &#39;STAP&#39;>** | Type of unit for which data needs to be retrieved. | (optional) defaults to 'UNKNOWN_UNIT'
 **cmId** | [**string**] | Optional value if the data is for a particular cm. If it is empty the data for all cms would be retrieved. | (optional) defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetHistoricalHealthInfoResponse**

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

# **healthCollectorGetObjectStorageUsage**
> Healthcollectorv3GetObjectStorageUsageResponse healthCollectorGetObjectStorageUsage()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .HealthCollectorApi(configuration);

let body:.HealthCollectorApiHealthCollectorGetObjectStorageUsageRequest = {
  // string | The type of metric to retrieve
  type: "type_example",
  // Date | The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

apiInstance.healthCollectorGetObjectStorageUsage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetObjectStorageUsageResponse**

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

# **healthCollectorGetPVCUsage**
> Healthcollectorv3GetPVCUsageResponse healthCollectorGetPVCUsage()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .HealthCollectorApi(configuration);

let body:.HealthCollectorApiHealthCollectorGetPVCUsageRequest = {
  // string | The type of metric to retrieve
  type: "type_example",
  // Date | The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

apiInstance.healthCollectorGetPVCUsage(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetPVCUsageResponse**

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

# **healthCollectorGetPodRestarts**
> Healthcollectorv3GetPodRestartsResponse healthCollectorGetPodRestarts()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .HealthCollectorApi(configuration);

let body:.HealthCollectorApiHealthCollectorGetPodRestartsRequest = {
  // string | The type of metric to retrieve
  type: "type_example",
  // Date | The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

apiInstance.healthCollectorGetPodRestarts(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetPodRestartsResponse**

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

# **healthCollectorGetStreamsIngestion**
> Healthcollectorv3GetStreamsIngestionResponse healthCollectorGetStreamsIngestion()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .HealthCollectorApi(configuration);

let body:.HealthCollectorApiHealthCollectorGetStreamsIngestionRequest = {
  // string | The type of metric to retrieve
  type: "type_example",
  // Date | The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

apiInstance.healthCollectorGetStreamsIngestion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetStreamsIngestionResponse**

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

# **healthCollectorGetTopGDPCollectors**
> Healthcollectorv3GetTopGDPCollectorsResponse healthCollectorGetTopGDPCollectors()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .HealthCollectorApi(configuration);

let body:.HealthCollectorApiHealthCollectorGetTopGDPCollectorsRequest = {
  // string | The type of metric to retrieve
  type: "type_example",
  // Date | The start time from which the data needs to be calculated. (optional)
  startTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | The end time from which the data needs to be calculated. (optional)
  endTime: new Date('1970-01-01T00:00:00.00Z'),
};

apiInstance.healthCollectorGetTopGDPCollectors(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**string**] | The type of metric to retrieve | defaults to undefined
 **startTime** | [**Date**] | The start time from which the data needs to be calculated. | (optional) defaults to undefined
 **endTime** | [**Date**] | The end time from which the data needs to be calculated. | (optional) defaults to undefined


### Return type

**Healthcollectorv3GetTopGDPCollectorsResponse**

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

# **healthCollectorStoreHealthInfo**
> Healthcollectorv3StoreHealthInfoResponse healthCollectorStoreHealthInfo(healthcollectorv3StoreHealthInfoRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .HealthCollectorApi(configuration);

let body:.HealthCollectorApiHealthCollectorStoreHealthInfoRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // Healthcollectorv3StoreHealthInfoRequest
  healthcollectorv3StoreHealthInfoRequest: {
    centralManagerId: "centralManagerId_example",
    data: [
      {
        nodes: [
          {
            aggHealthStatus: 1,
            connectivity: 1,
            details: {
              aggHealthViewList: [
                {
                  aggActionError: "aggActionError_example",
                  aggActionHealthStatus: 1,
                  aggType: "aggType_example",
                  errorCode: 1,
                  unit: "unit_example",
                },
              ],
              connectivityDetails: {
                errMessages: "errMessages_example",
              },
              generalErrMessages: [
                "generalErrMessages_example",
              ],
              utilizationScheme: {
                analyzerQueueValue: 1,
                errorMessagesCode: 1,
                errorMessagesValue: "errorMessagesValue_example",
                freeBuffSpaceValue: 1,
                loggerQueueValue: 1,
                mysqlDiskUsageValue: 1,
                noOfRestartsValue: 1,
                numOfExceptionsValue: 1,
                numOfFlatLogRequestsValue: 1,
                numOfPolicyViolationsValue: 1,
                numOfRequestsValue: 1,
                precMysqlMemValue: 1,
                snifMemoryValue: 1,
                sysVarDiskUsageValue: 1,
                systemCpuLoadValue: 1,
              },
            },
            exportsTo: [
              "exportsTo_example",
            ],
            id: 1,
            importsFrom: [
              "importsFrom_example",
            ],
            musStapsHealthStatus: 1,
            name: "name_example",
            osVersion: "osVersion_example",
            patch: "patch_example",
            status: 1,
            type: "type_example",
            unitHostIp: "unitHostIp_example",
            unitUtilizationHealthStatus: 1,
            version: "version_example",
          },
        ],
        staps: [
          {
            children: [
              {
                ieStatus: 1,
                inspectionEngine: "inspectionEngine_example",
              },
            ],
            collectorHostName: "collectorHostName_example",
            connectivity: 1,
            details: {
              connectivityDetails: {
                errMessages: "errMessages_example",
              },
              generalErrMessages: [
                "generalErrMessages_example",
              ],
              ktapDetails: {
                errMessages: "errMessages_example",
              },
              stapLivelinessInfo: {
                hasEvent: true,
                healthStatus: 1,
                livelinessState: "livelinessState_example",
                stap: "stap_example",
              },
              stapVerInfoList: [
                {
                  ie: "ie_example",
                  port: "port_example",
                  protocol: "protocol_example",
                  stap: "stap_example",
                  verificationHealth: 1,
                  verificationResult: "verificationResult_example",
                  verificationState: "verificationState_example",
                  version: "version_example",
                },
              ],
              trafficDetails: {
                errMessages: "errMessages_example",
              },
            },
            ieStatus: 1,
            inspectionEngine: "inspectionEngine_example",
            ktap: 1,
            name: "name_example",
            osType: "osType_example",
            revision: "revision_example",
            stapIp: "stapIp_example",
            status: 1,
            traffic: 1,
          },
        ],
      },
    ],
  },
};

apiInstance.healthCollectorStoreHealthInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **healthcollectorv3StoreHealthInfoRequest** | **Healthcollectorv3StoreHealthInfoRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Healthcollectorv3StoreHealthInfoResponse**

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





# .JumpboxServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**jumpboxServiceAuthorize**](JumpboxServiceApi.md#jumpboxServiceAuthorize) | **POST** /api/v3/authorization | Summary: Authorize Description: Authenticate a user and return a JWT.
[**jumpboxServiceDeleteTenant**](JumpboxServiceApi.md#jumpboxServiceDeleteTenant) | **DELETE** /api/v3/tenants/{tenant_id} | Summary: Delete tenant Description: Delete a tenant.
[**jumpboxServiceDeleteUser**](JumpboxServiceApi.md#jumpboxServiceDeleteUser) | **DELETE** /api/v3/users/{user_id} | Summary: Delete user Description: Delete the user.
[**jumpboxServiceGetTenant**](JumpboxServiceApi.md#jumpboxServiceGetTenant) | **GET** /api/v3/tenants/{tenant_id} | Summary: Get tenant Description: Get a tenant.
[**jumpboxServiceGetTenants**](JumpboxServiceApi.md#jumpboxServiceGetTenants) | **GET** /api/v3/tenants | Summary: Get tenants Description: Get all tenant base on UID.
[**jumpboxServiceGetUsers**](JumpboxServiceApi.md#jumpboxServiceGetUsers) | **GET** /api/v3/users | Summary: Get users Description: Get all users base on a tenantID.
[**jumpboxServicePostTenants**](JumpboxServiceApi.md#jumpboxServicePostTenants) | **POST** /api/v3/tenants | Summary: Post tenants Description: Create a tenant.
[**jumpboxServicePostUsers**](JumpboxServiceApi.md#jumpboxServicePostUsers) | **POST** /api/v3/users | Summary: Post users Description: Create users.
[**jumpboxServiceSearchUsers**](JumpboxServiceApi.md#jumpboxServiceSearchUsers) | **POST** /api/v3/users/search | Summary: Search users Description: Search for all users matching the provided string.
[**jumpboxServiceTestUser**](JumpboxServiceApi.md#jumpboxServiceTestUser) | **POST** /api/v3/users/test | Summary: Test user Description: Test a user lookup to a given LDAP.
[**jumpboxServiceUpdateTenant**](JumpboxServiceApi.md#jumpboxServiceUpdateTenant) | **PATCH** /api/v3/tenants/{tenant_id} | Summary: Update tenant Description: Update a tenant.
[**jumpboxServiceUpdateUsers**](JumpboxServiceApi.md#jumpboxServiceUpdateUsers) | **PATCH** /api/v3/users | Summary: Update users Description: Update an array of users.


# **jumpboxServiceAuthorize**
> Jumpboxv3AuthorizeResponse jumpboxServiceAuthorize(jumpboxv3AuthorizeRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceAuthorizeRequest = {
  // Jumpboxv3AuthorizeRequest
  jumpboxv3AuthorizeRequest: {
    displayName: "displayName_example",
    email: "email_example",
    externalId: "externalId_example",
    firstName: "firstName_example",
    isRenew: true,
    isUpdateUserInfo: true,
    lastName: "lastName_example",
    loginId: "loginId_example",
    tenantId: "tenantId_example",
  },
};

apiInstance.jumpboxServiceAuthorize(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3AuthorizeRequest** | **Jumpboxv3AuthorizeRequest**|  |


### Return type

**Jumpboxv3AuthorizeResponse**

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

# **jumpboxServiceDeleteTenant**
> any jumpboxServiceDeleteTenant()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceDeleteTenantRequest = {
  // string | Tenant id.
  tenantId: "tenant_id_example",
  // boolean | Delete tenant permanently if true. (optional)
  isPermanentDelete: true,
  // boolean | Async. (optional)
  async: true,
};

apiInstance.jumpboxServiceDeleteTenant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Tenant id. | defaults to undefined
 **isPermanentDelete** | [**boolean**] | Delete tenant permanently if true. | (optional) defaults to undefined
 **async** | [**boolean**] | Async. | (optional) defaults to undefined


### Return type

**any**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **jumpboxServiceDeleteUser**
> any jumpboxServiceDeleteUser()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceDeleteUserRequest = {
  // string | The user id.
  userId: "user_id_example",
};

apiInstance.jumpboxServiceDeleteUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | The user id. | defaults to undefined


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

# **jumpboxServiceGetTenant**
> Jumpboxv3GetTenantResponse jumpboxServiceGetTenant()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceGetTenantRequest = {
  // string | Tenant id.
  tenantId: "tenant_id_example",
  // boolean | Include inactive. (optional)
  includeInactive: true,
  // boolean | Include tenants that are not ready(are in state of being created or deleted). (optional)
  includeNotReady: true,
};

apiInstance.jumpboxServiceGetTenant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | Tenant id. | defaults to undefined
 **includeInactive** | [**boolean**] | Include inactive. | (optional) defaults to undefined
 **includeNotReady** | [**boolean**] | Include tenants that are not ready(are in state of being created or deleted). | (optional) defaults to undefined


### Return type

**Jumpboxv3GetTenantResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **jumpboxServiceGetTenants**
> Jumpboxv3GetTenantsResponse jumpboxServiceGetTenants()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceGetTenantsRequest = {
  // string | Email. (optional)
  uid: "uid_example",
  // string | External id. (optional)
  externalId: "external_id_example",
  // boolean | Include inactive. (optional)
  includeInactive: true,
  // boolean | Include tenants that are not ready(are in state of being created or deleted). (optional)
  includeNotReady: true,
};

apiInstance.jumpboxServiceGetTenants(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | [**string**] | Email. | (optional) defaults to undefined
 **externalId** | [**string**] | External id. | (optional) defaults to undefined
 **includeInactive** | [**boolean**] | Include inactive. | (optional) defaults to undefined
 **includeNotReady** | [**boolean**] | Include tenants that are not ready(are in state of being created or deleted). | (optional) defaults to undefined


### Return type

**Jumpboxv3GetTenantsResponse**

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

# **jumpboxServiceGetUsers**
> Tenantuserv3GetUsersResponse jumpboxServiceGetUsers()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceGetUsersRequest = {
  // string | Email. (optional)
  uid: "uid_example",
};

apiInstance.jumpboxServiceGetUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uid** | [**string**] | Email. | (optional) defaults to undefined


### Return type

**Tenantuserv3GetUsersResponse**

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

# **jumpboxServicePostTenants**
> Jumpboxv3PostTenantsResponse jumpboxServicePostTenants(jumpboxv3PostTenantsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServicePostTenantsRequest = {
  // Jumpboxv3PostTenantsRequest
  jumpboxv3PostTenantsRequest: {
    async: true,
    externalId: "externalId_example",
    externalMetadata: {
      "key": {
        addOns: {
          "key": {
            unit: "unit_example",
            value: "value_example",
          },
        },
        crn: "crn_example",
        expirationDate: new Date('1970-01-01T00:00:00.00Z'),
        instanceId: "instanceId_example",
        partNumber: "partNumber_example",
        planId: "planId_example",
        serviceId: "serviceId_example",
        subscriptionId: "subscriptionId_example",
      },
    },
    name: "name_example",
    partNumber: "partNumber_example",
    uid: "uid_example",
  },
};

apiInstance.jumpboxServicePostTenants(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3PostTenantsRequest** | **Jumpboxv3PostTenantsRequest**|  |


### Return type

**Jumpboxv3PostTenantsResponse**

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

# **jumpboxServicePostUsers**
> Jumpboxv3PostUsersBulkResponse jumpboxServicePostUsers(jumpboxv3PostUsersBulkRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServicePostUsersRequest = {
  // Jumpboxv3PostUsersBulkRequest
  jumpboxv3PostUsersBulkRequest: {
    users: [
      {
        activationDate: new Date('1970-01-01T00:00:00.00Z'),
        directoryId: "directoryId_example",
        disabled: true,
        displayName: "displayName_example",
        distinguishedName: "distinguishedName_example",
        email: "email_example",
        externalId: "externalId_example",
        metadata: {
          "key": "key_example",
        },
        roles: [
          "roles_example",
        ],
        state: "ACTIVE",
        uid: "uid_example",
        userId: "userId_example",
      },
    ],
  },
};

apiInstance.jumpboxServicePostUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3PostUsersBulkRequest** | **Jumpboxv3PostUsersBulkRequest**|  |


### Return type

**Jumpboxv3PostUsersBulkResponse**

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

# **jumpboxServiceSearchUsers**
> Jumpboxv3SearchUsersResponse jumpboxServiceSearchUsers(jumpboxv3SearchUsersRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceSearchUsersRequest = {
  // Jumpboxv3SearchUsersRequest
  jumpboxv3SearchUsersRequest: {
    searchString: "searchString_example",
  },
};

apiInstance.jumpboxServiceSearchUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3SearchUsersRequest** | **Jumpboxv3SearchUsersRequest**|  |


### Return type

**Jumpboxv3SearchUsersResponse**

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

# **jumpboxServiceTestUser**
> Jumpboxv3TestUserResponse jumpboxServiceTestUser(jumpboxv3TestUserRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceTestUserRequest = {
  // Jumpboxv3TestUserRequest
  jumpboxv3TestUserRequest: {
    ldapId: "ldapId_example",
    uid: "uid_example",
  },
};

apiInstance.jumpboxServiceTestUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3TestUserRequest** | **Jumpboxv3TestUserRequest**|  |


### Return type

**Jumpboxv3TestUserResponse**

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

# **jumpboxServiceUpdateTenant**
> Jumpboxv3UpdateTenantResponse jumpboxServiceUpdateTenant(jumpboxv3UpdateTenantRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceUpdateTenantRequest = {
  // string | Tenant id.
  tenantId: "tenant_id_example",
  // Jumpboxv3UpdateTenantRequest
  jumpboxv3UpdateTenantRequest: {
    externalMetadata: {
      "key": {
        addOns: {
          "key": {
            unit: "unit_example",
            value: "value_example",
          },
        },
        crn: "crn_example",
        expirationDate: new Date('1970-01-01T00:00:00.00Z'),
        instanceId: "instanceId_example",
        partNumber: "partNumber_example",
        planId: "planId_example",
        serviceId: "serviceId_example",
        subscriptionId: "subscriptionId_example",
      },
    },
    isInactive: true,
    isReady: true,
    name: "name_example",
    partNumber: "partNumber_example",
    tenantId: "tenantId_example",
    uid: "uid_example",
  },
};

apiInstance.jumpboxServiceUpdateTenant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3UpdateTenantRequest** | **Jumpboxv3UpdateTenantRequest**|  |
 **tenantId** | [**string**] | Tenant id. | defaults to undefined


### Return type

**Jumpboxv3UpdateTenantResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **jumpboxServiceUpdateUsers**
> Jumpboxv3UpdateUsersBulkResponse jumpboxServiceUpdateUsers(jumpboxv3UpdateUsersBulkRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .JumpboxServiceApi(configuration);

let body:.JumpboxServiceApiJumpboxServiceUpdateUsersRequest = {
  // Jumpboxv3UpdateUsersBulkRequest
  jumpboxv3UpdateUsersBulkRequest: {
    action: "action_example",
    metadataOnly: true,
    users: [
      {
        activationDate: new Date('1970-01-01T00:00:00.00Z'),
        directoryId: "directoryId_example",
        disabled: true,
        displayName: "displayName_example",
        distinguishedName: "distinguishedName_example",
        email: "email_example",
        externalId: "externalId_example",
        metadata: {
          "key": "key_example",
        },
        roles: [
          "roles_example",
        ],
        state: "ACTIVE",
        uid: "uid_example",
        userId: "userId_example",
      },
    ],
  },
};

apiInstance.jumpboxServiceUpdateUsers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jumpboxv3UpdateUsersBulkRequest** | **Jumpboxv3UpdateUsersBulkRequest**|  |


### Return type

**Jumpboxv3UpdateUsersBulkResponse**

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





# .NotificationsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationsServiceCreateTicket**](NotificationsServiceApi.md#notificationsServiceCreateTicket) | **POST** /api/v3/integrations/ticket | Summary: Create ticket Description: Create ticket based on information passed in.
[**notificationsServiceGetFolders**](NotificationsServiceApi.md#notificationsServiceGetFolders) | **POST** /api/v3/integrations/folders | Summary: Get folders Description: Get folder for the integration connection provided.
[**notificationsServiceGetNotificationFilename**](NotificationsServiceApi.md#notificationsServiceGetNotificationFilename) | **GET** /api/v3/notifications/filename | Summary: Get notification filename Description: Return filename associated with the notifications record referenced in the associated context record. The notification id is required but may be set in the associated authentication token or explicitly in the request.
[**notificationsServiceGetNotificationRecord**](NotificationsServiceApi.md#notificationsServiceGetNotificationRecord) | **GET** /api/v3/notifications/details/{notification_id} | Summary: Get notification record Description: Return notifications record with the specified ID.
[**notificationsServiceGetNotificationRecords**](NotificationsServiceApi.md#notificationsServiceGetNotificationRecords) | **GET** /api/v3/notifications | Summary: Get notification records Description: Return notifications records that match the specified filter.
[**notificationsServiceGetTicketStatus**](NotificationsServiceApi.md#notificationsServiceGetTicketStatus) | **GET** /api/v3/integrations/ticket/status | Summary: Get ticket status Description: Get the status of the given ticket
[**notificationsServiceTestIntegration**](NotificationsServiceApi.md#notificationsServiceTestIntegration) | **POST** /api/v3/integrations/test | Summary: Test integration Description: Test the integration connection with the arguments passed in the TestIntegrationRequest.  When possible a test message is sent to the integration to ensure it is functional.
[**notificationsServiceUpdateNotificationRecord**](NotificationsServiceApi.md#notificationsServiceUpdateNotificationRecord) | **POST** /api/v3/notifications | Summary: Update notification record Description: Update a notification record with the specified values.  The ID field is required and must match an existing notification. All fields other than the ID are optional. Creation timestamp, user and other administrative fields can not updated.


# **notificationsServiceCreateTicket**
> Notificationsv3CreateTicketResponse notificationsServiceCreateTicket(notificationsv3CreateTicketRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceCreateTicketRequest = {
  // Notificationsv3CreateTicketRequest
  notificationsv3CreateTicketRequest: {
    additionalData: {
      "key": "key_example",
    },
    contents: "contents_example",
    integrationId: "integrationId_example",
    severity: "UNDEFINED",
    title: "title_example",
  },
};

apiInstance.notificationsServiceCreateTicket(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3CreateTicketRequest** | **Notificationsv3CreateTicketRequest**|  |


### Return type

**Notificationsv3CreateTicketResponse**

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

# **notificationsServiceGetFolders**
> Notificationsv3GetFoldersResponse notificationsServiceGetFolders(notificationsv3GetFoldersRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceGetFoldersRequest = {
  // Notificationsv3GetFoldersRequest
  notificationsv3GetFoldersRequest: {
    folderName: "folderName_example",
    integrationId: "integrationId_example",
  },
};

apiInstance.notificationsServiceGetFolders(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3GetFoldersRequest** | **Notificationsv3GetFoldersRequest**|  |


### Return type

**Notificationsv3GetFoldersResponse**

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

# **notificationsServiceGetNotificationFilename**
> Notificationsv3GetNotificationFilenameResponse notificationsServiceGetNotificationFilename()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceGetNotificationFilenameRequest = {
  // string | Params are located in the requests context (tenant id, user email, notification id). (optional)
  notificationId: "notification_id_example",
};

apiInstance.notificationsServiceGetNotificationFilename(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | [**string**] | Params are located in the requests context (tenant id, user email, notification id). | (optional) defaults to undefined


### Return type

**Notificationsv3GetNotificationFilenameResponse**

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

# **notificationsServiceGetNotificationRecord**
> Notificationsv3GetNotificationRecordResponse notificationsServiceGetNotificationRecord()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceGetNotificationRecordRequest = {
  // string | ID for the record to return.
  notificationId: "notification_id_example",
};

apiInstance.notificationsServiceGetNotificationRecord(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationId** | [**string**] | ID for the record to return. | defaults to undefined


### Return type

**Notificationsv3GetNotificationRecordResponse**

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

# **notificationsServiceGetNotificationRecords**
> Notificationsv3GetNotificationRecordsResponse notificationsServiceGetNotificationRecords()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceGetNotificationRecordsRequest = {
  // Date | Return records created at this time or later (>=). (optional)
  filterStartTime: new Date('1970-01-01T00:00:00.00Z'),
  // Date | Return records created before this time (<). (optional)
  filterEndTime: new Date('1970-01-01T00:00:00.00Z'),
  // 'INCLUDE_ALL' | 'UNREAD_ONLY' | 'READ_ONLY' | 'COMPLETE_ONLY' | 'NOT_COMPLETE' | Only return record that include the specified state. (optional)
  filterState: "INCLUDE_ALL",
  // Array<string> | Only return record that includes the specified origins. (optional)
  filterOrigins: [
    "filter.origins_example",
  ],
  // string | Only return record that with the specified origin_data. (optional)
  filterOriginData: "filter.origin_data_example",
  // number | The amount to offset the rows by for pagination. (optional)
  offset: 1,
  // number | The max amount of rows to return for pagination. (optional)
  limit: 1,
  // boolean | Computing the filter counts is relatively expensive, only compute when needed. (optional)
  includeFilterCounts: true,
};

apiInstance.notificationsServiceGetNotificationRecords(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterStartTime** | [**Date**] | Return records created at this time or later (&gt;&#x3D;). | (optional) defaults to undefined
 **filterEndTime** | [**Date**] | Return records created before this time (&lt;). | (optional) defaults to undefined
 **filterState** | [**&#39;INCLUDE_ALL&#39; | &#39;UNREAD_ONLY&#39; | &#39;READ_ONLY&#39; | &#39;COMPLETE_ONLY&#39; | &#39;NOT_COMPLETE&#39;**]**Array<&#39;INCLUDE_ALL&#39; &#124; &#39;UNREAD_ONLY&#39; &#124; &#39;READ_ONLY&#39; &#124; &#39;COMPLETE_ONLY&#39; &#124; &#39;NOT_COMPLETE&#39;>** | Only return record that include the specified state. | (optional) defaults to 'INCLUDE_ALL'
 **filterOrigins** | **Array&lt;string&gt;** | Only return record that includes the specified origins. | (optional) defaults to undefined
 **filterOriginData** | [**string**] | Only return record that with the specified origin_data. | (optional) defaults to undefined
 **offset** | [**number**] | The amount to offset the rows by for pagination. | (optional) defaults to undefined
 **limit** | [**number**] | The max amount of rows to return for pagination. | (optional) defaults to undefined
 **includeFilterCounts** | [**boolean**] | Computing the filter counts is relatively expensive, only compute when needed. | (optional) defaults to undefined


### Return type

**Notificationsv3GetNotificationRecordsResponse**

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

# **notificationsServiceGetTicketStatus**
> Notificationsv3GetTicketStatusResponse notificationsServiceGetTicketStatus()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceGetTicketStatusRequest = {
  // string | The ID of the ticket to fetch. (optional)
  ticketId: "ticket_id_example",
  // string | The ID of the ticketing integration. (optional)
  integrationId: "integration_id_example",
};

apiInstance.notificationsServiceGetTicketStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticketId** | [**string**] | The ID of the ticket to fetch. | (optional) defaults to undefined
 **integrationId** | [**string**] | The ID of the ticketing integration. | (optional) defaults to undefined


### Return type

**Notificationsv3GetTicketStatusResponse**

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

# **notificationsServiceTestIntegration**
> Notificationsv3TestIntegrationResponse notificationsServiceTestIntegration(notificationsv3TestIntegrationRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceTestIntegrationRequest = {
  // Notificationsv3TestIntegrationRequest
  notificationsv3TestIntegrationRequest: {
    integrationType: "integrationType_example",
    options: {
      "key": "key_example",
    },
  },
};

apiInstance.notificationsServiceTestIntegration(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3TestIntegrationRequest** | **Notificationsv3TestIntegrationRequest**|  |


### Return type

**Notificationsv3TestIntegrationResponse**

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

# **notificationsServiceUpdateNotificationRecord**
> Notificationsv3UpdateNotificationRecordResponse notificationsServiceUpdateNotificationRecord(notificationsv3UpdateNotificationRecordRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .NotificationsServiceApi(configuration);

let body:.NotificationsServiceApiNotificationsServiceUpdateNotificationRecordRequest = {
  // Notificationsv3UpdateNotificationRecordRequest
  notificationsv3UpdateNotificationRecordRequest: {
    notificationId: [
      "notificationId_example",
    ],
    severity: "UNDEFINED",
    state: "UNREAD",
    templateData: [
      {
        name: "name_example",
        value: "value_example",
      },
    ],
  },
};

apiInstance.notificationsServiceUpdateNotificationRecord(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationsv3UpdateNotificationRecordRequest** | **Notificationsv3UpdateNotificationRecordRequest**|  |


### Return type

**Notificationsv3UpdateNotificationRecordResponse**

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





# .OutliersEngineApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outliersEngineGetSourceStatistics**](OutliersEngineApi.md#outliersEngineGetSourceStatistics) | **GET** /api/v3/outliers/source/statistics | Summary: Get source statistics Description: Return statistics regarding the input source, including distribution of verbs, source program, working hours etc.
[**outliersEngineGetStatistics**](OutliersEngineApi.md#outliersEngineGetStatistics) | **GET** /api/v3/outliers/statistics | Summary: Get statistics Description: Return statistics regarding number of outliers, clusters and un/completed periods.
[**outliersEngineGetWorkingHoursPeriods**](OutliersEngineApi.md#outliersEngineGetWorkingHoursPeriods) | **GET** /api/v3/outliers/working_hours_periods | Summary: Get working hours periods Description: Get a list of the working hours periods.
[**outliersEngineRunSimulator**](OutliersEngineApi.md#outliersEngineRunSimulator) | **POST** /api/v3/outliers/simulator | Summary: Run simulator Description: Run outlier simulator.
[**outliersEngineUpdateWorkingHoursPeriods**](OutliersEngineApi.md#outliersEngineUpdateWorkingHoursPeriods) | **PUT** /api/v3/outliers/working_hours_periods | Summary: Update working hours periods Description: Update the working hours periods values.
[**outliersEngineUploadAndAnalyzePeriod**](OutliersEngineApi.md#outliersEngineUploadAndAnalyzePeriod) | **POST** /api/v3/outliers | Summary: Upload and analyze period Description: Run outliers detection on ready periods.
[**outliersEngineUserClustering**](OutliersEngineApi.md#outliersEngineUserClustering) | **POST** /api/v3/outliers/clusters | Summary: User clustering Description: Run user-clustering on current sources.


# **outliersEngineGetSourceStatistics**
> Outliersenginev3GetSourceStatisticsResponse outliersEngineGetSourceStatistics()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:.OutliersEngineApiOutliersEngineGetSourceStatisticsRequest = {
  // string | server ip. (optional)
  sourceServerIp: "source.server_ip_example",
  // string | database name. (optional)
  sourceDatabaseName: "source.database_name_example",
  // string | db user name (optional). (optional)
  sourceDbUser: "source.db_user_example",
  // number | The number of attributes to return for each SourceAttributeType - optional. (optional)
  attributesLimit: 1,
};

apiInstance.outliersEngineGetSourceStatistics(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceServerIp** | [**string**] | server ip. | (optional) defaults to undefined
 **sourceDatabaseName** | [**string**] | database name. | (optional) defaults to undefined
 **sourceDbUser** | [**string**] | db user name (optional). | (optional) defaults to undefined
 **attributesLimit** | [**number**] | The number of attributes to return for each SourceAttributeType - optional. | (optional) defaults to undefined


### Return type

**Outliersenginev3GetSourceStatisticsResponse**

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

# **outliersEngineGetStatistics**
> Outliersenginev3StatisticsResponse outliersEngineGetStatistics()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:any = {};

apiInstance.outliersEngineGetStatistics(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Outliersenginev3StatisticsResponse**

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

# **outliersEngineGetWorkingHoursPeriods**
> Outliersenginev3GetWorkingHoursPeriodsResponse outliersEngineGetWorkingHoursPeriods()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:any = {};

apiInstance.outliersEngineGetWorkingHoursPeriods(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Outliersenginev3GetWorkingHoursPeriodsResponse**

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

# **outliersEngineRunSimulator**
> RpcStatus outliersEngineRunSimulator(outliersenginev3RunSimulatorRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:.OutliersEngineApiOutliersEngineRunSimulatorRequest = {
  // Outliersenginev3RunSimulatorRequest
  outliersenginev3RunSimulatorRequest: {
    configurationFilePath: "configurationFilePath_example",
    date: "date_example",
    enableDemoMode: true,
    length: 1,
  },
};

apiInstance.outliersEngineRunSimulator(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outliersenginev3RunSimulatorRequest** | **Outliersenginev3RunSimulatorRequest**|  |


### Return type

**RpcStatus**

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

# **outliersEngineUpdateWorkingHoursPeriods**
> Outliersenginev3OutlierResponse outliersEngineUpdateWorkingHoursPeriods(outliersenginev3UpdateWorkingHoursPeriodsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:.OutliersEngineApiOutliersEngineUpdateWorkingHoursPeriodsRequest = {
  // Outliersenginev3UpdateWorkingHoursPeriodsRequest
  outliersenginev3UpdateWorkingHoursPeriodsRequest: {
    period: {
      contiguous: true,
      datetimeCodeDescription: "datetimeCodeDescription_example",
      datetimeCodeId: 1,
      hourFrom: "hourFrom_example",
      hourTo: "hourTo_example",
      weekdayFrom: 1,
      weekdayTo: 1,
    },
  },
};

apiInstance.outliersEngineUpdateWorkingHoursPeriods(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **outliersenginev3UpdateWorkingHoursPeriodsRequest** | **Outliersenginev3UpdateWorkingHoursPeriodsRequest**|  |


### Return type

**Outliersenginev3OutlierResponse**

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

# **outliersEngineUploadAndAnalyzePeriod**
> RpcStatus outliersEngineUploadAndAnalyzePeriod(body)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:.OutliersEngineApiOutliersEngineUploadAndAnalyzePeriodRequest = {
  // any
  body: {},
};

apiInstance.outliersEngineUploadAndAnalyzePeriod(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **any**|  |


### Return type

**RpcStatus**

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

# **outliersEngineUserClustering**
> RpcStatus outliersEngineUserClustering(body)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .OutliersEngineApi(configuration);

let body:.OutliersEngineApiOutliersEngineUserClusteringRequest = {
  // any
  body: {},
};

apiInstance.outliersEngineUserClustering(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **any**|  |


### Return type

**RpcStatus**

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





# .PipelineconfigServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pipelineconfigServiceDeleteTenantResources**](PipelineconfigServiceApi.md#pipelineconfigServiceDeleteTenantResources) | **DELETE** /api/v3/resources/{tenant_id}/{resource} | Summary: Delete a tenant resource Description: Delete tenant specific resources such as db2, mongo, postgres and s3.


# **pipelineconfigServiceDeleteTenantResources**
> Pipelineconfigv3DeleteTenantResponse pipelineconfigServiceDeleteTenantResources()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PipelineconfigServiceApi(configuration);

let body:.PipelineconfigServiceApiPipelineconfigServiceDeleteTenantResourcesRequest = {
  // string | unique tenant ID
  tenantId: "tenant_id_example",
  // string | resource specifies the specific resource to delete
  resource: "resource_example",
};

apiInstance.pipelineconfigServiceDeleteTenantResources(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**string**] | unique tenant ID | defaults to undefined
 **resource** | [**string**] | resource specifies the specific resource to delete | defaults to undefined


### Return type

**Pipelineconfigv3DeleteTenantResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)





# .PolicyBuilderApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**policyBuilderClonePolicy**](PolicyBuilderApi.md#policyBuilderClonePolicy) | **POST** /api/v3/policies/clone/{policy_id} | Summary: Clone policy Description: Clone a policy.
[**policyBuilderCreatePolicy**](PolicyBuilderApi.md#policyBuilderCreatePolicy) | **POST** /api/v3/policies | Summary: Create policy Description: Create Policy returns response code and message.
[**policyBuilderDeleteGdpSyncEntry**](PolicyBuilderApi.md#policyBuilderDeleteGdpSyncEntry) | **DELETE** /api/v3/policies/sync_entry | Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
[**policyBuilderDeletePolicies**](PolicyBuilderApi.md#policyBuilderDeletePolicies) | **DELETE** /api/v3/policies | Summary: Delete policies Description: Delete Policy returns response code and message.
[**policyBuilderGetGdpPolicyMetaData**](PolicyBuilderApi.md#policyBuilderGetGdpPolicyMetaData) | **GET** /api/v3/policies/metadata_list | Summary: Get GDP policy summary information Description: Get GDP\&#39;s CM\&#39;s policy summary from mogodb
[**policyBuilderGetPolicies**](PolicyBuilderApi.md#policyBuilderGetPolicies) | **GET** /api/v3/policies | Summary: Get policies Description: Return a list of policies to the caller.
[**policyBuilderGetPolicyDetails**](PolicyBuilderApi.md#policyBuilderGetPolicyDetails) | **GET** /api/v3/policies/{policy_id}/details | Summary: Get policy details Description: Return a list of rules inside the policy.
[**policyBuilderGetPolicyNamesFromRuleIDs**](PolicyBuilderApi.md#policyBuilderGetPolicyNamesFromRuleIDs) | **POST** /api/v3/policies/policy_names | Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
[**policyBuilderGetPolicySyncList**](PolicyBuilderApi.md#policyBuilderGetPolicySyncList) | **GET** /api/v3/policies/sync_list | Summary: Get list of synced polices Description: Returns the list and status of sync entries
[**policyBuilderGetReceivers**](PolicyBuilderApi.md#policyBuilderGetReceivers) | **GET** /api/v3/policies/receivers | Summary: Get receivers Description: Get all the receivers associated with actions.
[**policyBuilderGetRuleMetadata**](PolicyBuilderApi.md#policyBuilderGetRuleMetadata) | **GET** /api/v3/rules/metadata | Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
[**policyBuilderInsertGdpPolicy**](PolicyBuilderApi.md#policyBuilderInsertGdpPolicy) | **POST** /api/v3/policies/sync_entry | Summary: Insert GDP policy sync entry Description: Inserts GDP policy\&#39;s name into sync collection
[**policyBuilderInsertGdpPolicyMetaData**](PolicyBuilderApi.md#policyBuilderInsertGdpPolicyMetaData) | **POST** /api/v3/central_managers/{central_manager_id}/policies/policy_metadata | Summary: Insert gdp policy summaries Description: Inserts GDP\&#39;s CM\&#39;s policy summary information into mogodb. (This API is called from GDP only)
[**policyBuilderInstallPolicies**](PolicyBuilderApi.md#policyBuilderInstallPolicies) | **PUT** /api/v3/policies/install | Summary: Install policies Description: Activate Policies request performs activations.
[**policyBuilderIntegrationCheck**](PolicyBuilderApi.md#policyBuilderIntegrationCheck) | **GET** /api/v3/policies/integration_check/{integration_id} | Summary: Integration check Description: Check if integration id is being used in policies.
[**policyBuilderPoliciesGroups**](PolicyBuilderApi.md#policyBuilderPoliciesGroups) | **GET** /api/v3/policies/groups | Summary: Policies groups Description: Get policy groups.
[**policyBuilderRuleValidation**](PolicyBuilderApi.md#policyBuilderRuleValidation) | **POST** /api/v3/rules/validate | Summary: Rule validation Description: Validate a rule parameters and actions.
[**policyBuilderStorePoliciesGdp**](PolicyBuilderApi.md#policyBuilderStorePoliciesGdp) | **POST** /api/v3/policies/{central_manager_id} | Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)


# **policyBuilderClonePolicy**
> Policybuilderv3StandardCRUDResponse policyBuilderClonePolicy(policybuilderv3ClonePolicyRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderClonePolicyRequest = {
  // string | Policy id that needs to be cloned.
  policyId: "policy_id_example",
  // Policybuilderv3ClonePolicyRequest
  policybuilderv3ClonePolicyRequest: {
    policyId: "policyId_example",
    policyName: "policyName_example",
  },
};

apiInstance.policyBuilderClonePolicy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3ClonePolicyRequest** | **Policybuilderv3ClonePolicyRequest**|  |
 **policyId** | [**string**] | Policy id that needs to be cloned. | defaults to undefined


### Return type

**Policybuilderv3StandardCRUDResponse**

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

# **policyBuilderCreatePolicy**
> Policybuilderv3CreateUpdatePolicyResponse policyBuilderCreatePolicy(policybuilderv3CreateUpdatePolicyRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderCreatePolicyRequest = {
  // Policybuilderv3CreateUpdatePolicyRequest
  policybuilderv3CreateUpdatePolicyRequest: {
    canOverrideName: true,
    policyObject: {
      activationStatus: 1,
      controlFlow: "STANDARD",
      deletedRuleIds: [
        "deletedRuleIds_example",
      ],
      installedFlag: true,
      installedOrder: 1,
      installedTimestamp: "installedTimestamp_example",
      lastEditedTimestamp: "lastEditedTimestamp_example",
      logFlat: true,
      policyId: "policyId_example",
      policyName: "policyName_example",
      policyType: "DATA_POLICY",
      rules: [
        {
          actions: [
            {
              actionName: "actionName_example",
              notifications: [
                {
                  integrationId: "integrationId_example",
                  templateId: "templateId_example",
                  type: "UNDEFINED_RECTYPE",
                  value: "value_example",
                },
              ],
              order: 1,
              parameters: [
                {
                  parameterName: "parameterName_example",
                  parameterValue: "parameterValue_example",
                },
              ],
              qrDefintionId: 1,
              type: "UNDEFINED_ACTIONTYPE",
              uiLabel: "uiLabel_example",
            },
          ],
          continueToNextRule: true,
          emptyGroups: [
            1,
          ],
          invalidActions: [
            {
              actionName: "actionName_example",
              notifications: [
                {
                  integrationId: "integrationId_example",
                  templateId: "templateId_example",
                  type: "UNDEFINED_RECTYPE",
                  value: "value_example",
                },
              ],
              order: 1,
              parameters: [
                {
                  parameterName: "parameterName_example",
                  parameterValue: "parameterValue_example",
                },
              ],
              qrDefintionId: 1,
              type: "UNDEFINED_ACTIONTYPE",
              uiLabel: "uiLabel_example",
            },
          ],
          invalidParameters: [
            {
              parameterName: "parameterName_example",
              parameterOperator: "UNKNOWN_OPERATOR",
              parameterType: "parameterType_example",
              parameterValue: "parameterValue_example",
              parameterValueLabel: "parameterValueLabel_example",
              uiLabel: "uiLabel_example",
            },
          ],
          parameters: [
            {
              parameterName: "parameterName_example",
              parameterOperator: "UNKNOWN_OPERATOR",
              parameterType: "parameterType_example",
              parameterValue: "parameterValue_example",
              parameterValueLabel: "parameterValueLabel_example",
              uiLabel: "uiLabel_example",
            },
          ],
          policyId: "policyId_example",
          ruleId: "ruleId_example",
          ruleKey: "ruleKey_example",
          ruleName: "ruleName_example",
          ruleOrder: 1,
          ruleType: "ACCESS",
          severity: "INFO",
          tags: [
            "tags_example",
          ],
          template: true,
        },
      ],
      rulesOnFlat: true,
      template: true,
      version: 1,
    },
  },
};

apiInstance.policyBuilderCreatePolicy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3CreateUpdatePolicyRequest** | **Policybuilderv3CreateUpdatePolicyRequest**|  |


### Return type

**Policybuilderv3CreateUpdatePolicyResponse**

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

# **policyBuilderDeleteGdpSyncEntry**
> Policybuilderv3DeleteGdpPolicySyncResponse policyBuilderDeleteGdpSyncEntry()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderDeleteGdpSyncEntryRequest = {
  // Array<string> | Policy sync entry id to delete from sync. (optional)
  syncIds: [
    "sync_ids_example",
  ],
};

apiInstance.policyBuilderDeleteGdpSyncEntry(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncIds** | **Array&lt;string&gt;** | Policy sync entry id to delete from sync. | (optional) defaults to undefined


### Return type

**Policybuilderv3DeleteGdpPolicySyncResponse**

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

# **policyBuilderDeletePolicies**
> Policybuilderv3StandardCRUDResponse policyBuilderDeletePolicies()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderDeletePoliciesRequest = {
  // Array<string> | Policy ids. (optional)
  policyIds: [
    "policy_ids_example",
  ],
};

apiInstance.policyBuilderDeletePolicies(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyIds** | **Array&lt;string&gt;** | Policy ids. | (optional) defaults to undefined


### Return type

**Policybuilderv3StandardCRUDResponse**

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

# **policyBuilderGetGdpPolicyMetaData**
> Policybuilderv3GetGdpPolicyMetaDataResponse policyBuilderGetGdpPolicyMetaData()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:any = {};

apiInstance.policyBuilderGetGdpPolicyMetaData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Policybuilderv3GetGdpPolicyMetaDataResponse**

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

# **policyBuilderGetPolicies**
> Policybuilderv3GetPoliciesResponse policyBuilderGetPolicies()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:any = {};

apiInstance.policyBuilderGetPolicies(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Policybuilderv3GetPoliciesResponse**

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

# **policyBuilderGetPolicyDetails**
> Policybuilderv3GetPolicyDetailsResponse policyBuilderGetPolicyDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderGetPolicyDetailsRequest = {
  // string | Policy id.
  policyId: "policy_id_example",
};

apiInstance.policyBuilderGetPolicyDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | [**string**] | Policy id. | defaults to undefined


### Return type

**Policybuilderv3GetPolicyDetailsResponse**

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

# **policyBuilderGetPolicyNamesFromRuleIDs**
> Policybuilderv3GetPolicyNamesFromRuleIDsResponse policyBuilderGetPolicyNamesFromRuleIDs(policybuilderv3GetPolicyNamesFromRuleIDsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderGetPolicyNamesFromRuleIDsRequest = {
  // Policybuilderv3GetPolicyNamesFromRuleIDsRequest
  policybuilderv3GetPolicyNamesFromRuleIDsRequest: {
    ruleIdsList: [
      "ruleIdsList_example",
    ],
  },
};

apiInstance.policyBuilderGetPolicyNamesFromRuleIDs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3GetPolicyNamesFromRuleIDsRequest** | **Policybuilderv3GetPolicyNamesFromRuleIDsRequest**|  |


### Return type

**Policybuilderv3GetPolicyNamesFromRuleIDsResponse**

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

# **policyBuilderGetPolicySyncList**
> Policybuilderv3GetPolicySyncListResponse policyBuilderGetPolicySyncList()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:any = {};

apiInstance.policyBuilderGetPolicySyncList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Policybuilderv3GetPolicySyncListResponse**

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

# **policyBuilderGetReceivers**
> Policybuilderv3GetReceiversResponse policyBuilderGetReceivers()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderGetReceiversRequest = {
  // Array<string> | Action id. (optional)
  actionId: [
    "action_id_example",
  ],
  // boolean | Flag that indicates if cache needs to be validated. (optional)
  validateCache: true,
};

apiInstance.policyBuilderGetReceivers(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionId** | **Array&lt;string&gt;** | Action id. | (optional) defaults to undefined
 **validateCache** | [**boolean**] | Flag that indicates if cache needs to be validated. | (optional) defaults to undefined


### Return type

**Policybuilderv3GetReceiversResponse**

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

# **policyBuilderGetRuleMetadata**
> Policybuilderv3RuleMetadataResponse policyBuilderGetRuleMetadata()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderGetRuleMetadataRequest = {
  // 'ACCESS' | 'EXCEPTION' | 'RESULT_SET' | Rule type integer to indicate rule type. (optional)
  ruleType: "ACCESS",
};

apiInstance.policyBuilderGetRuleMetadata(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleType** | [**&#39;ACCESS&#39; | &#39;EXCEPTION&#39; | &#39;RESULT_SET&#39;**]**Array<&#39;ACCESS&#39; &#124; &#39;EXCEPTION&#39; &#124; &#39;RESULT_SET&#39;>** | Rule type integer to indicate rule type. | (optional) defaults to 'ACCESS'


### Return type

**Policybuilderv3RuleMetadataResponse**

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

# **policyBuilderInsertGdpPolicy**
> Policybuilderv3InsertGdpPolicySyncResponse policyBuilderInsertGdpPolicy(policybuilderv3InsertGdpPolicySyncRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderInsertGdpPolicyRequest = {
  // Policybuilderv3InsertGdpPolicySyncRequest
  policybuilderv3InsertGdpPolicySyncRequest: {
    gdpPolicies: [
      {
        cmName: "cmName_example",
        policyName: "policyName_example",
        policyUiName: "policyUiName_example",
      },
    ],
  },
};

apiInstance.policyBuilderInsertGdpPolicy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3InsertGdpPolicySyncRequest** | **Policybuilderv3InsertGdpPolicySyncRequest**|  |


### Return type

**Policybuilderv3InsertGdpPolicySyncResponse**

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

# **policyBuilderInsertGdpPolicyMetaData**
> Policybuilderv3InsertGdpPolicyMetaDataResponse policyBuilderInsertGdpPolicyMetaData(policybuilderv3InsertGdpPolicyMetaDataRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderInsertGdpPolicyMetaDataRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // Policybuilderv3InsertGdpPolicyMetaDataRequest
  policybuilderv3InsertGdpPolicyMetaDataRequest: {
    centralManagerId: "centralManagerId_example",
    data: [
      {
        id: 1,
        policyDescription: "policyDescription_example",
        policyRulesCount: "policyRulesCount_example",
        policySubType: "policySubType_example",
        policyType: "policyType_example",
      },
    ],
  },
};

apiInstance.policyBuilderInsertGdpPolicyMetaData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3InsertGdpPolicyMetaDataRequest** | **Policybuilderv3InsertGdpPolicyMetaDataRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Policybuilderv3InsertGdpPolicyMetaDataResponse**

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

# **policyBuilderInstallPolicies**
> Policybuilderv3StatusResponseBase policyBuilderInstallPolicies(policybuilderv3InstallPoliciesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderInstallPoliciesRequest = {
  // Policybuilderv3InstallPoliciesRequest
  policybuilderv3InstallPoliciesRequest: {
    performInstallation: true,
    policyList: [
      {
        installationSequence: 1,
        policyId: "policyId_example",
        uiSequence: 1,
      },
    ],
  },
};

apiInstance.policyBuilderInstallPolicies(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3InstallPoliciesRequest** | **Policybuilderv3InstallPoliciesRequest**|  |


### Return type

**Policybuilderv3StatusResponseBase**

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

# **policyBuilderIntegrationCheck**
> Policybuilderv3GetIntegrationCheckResponse policyBuilderIntegrationCheck()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderIntegrationCheckRequest = {
  // string | Integration Id to check if it is being used in policies.
  integrationId: "integration_id_example",
  // string | Template Id to check if it is being used in policies. (optional)
  templateId: "template_id_example",
};

apiInstance.policyBuilderIntegrationCheck(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | [**string**] | Integration Id to check if it is being used in policies. | defaults to undefined
 **templateId** | [**string**] | Template Id to check if it is being used in policies. | (optional) defaults to undefined


### Return type

**Policybuilderv3GetIntegrationCheckResponse**

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

# **policyBuilderPoliciesGroups**
> Policybuilderv3GetPoliciesGroupsResponse policyBuilderPoliciesGroups()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderPoliciesGroupsRequest = {
  // Array<string> | Group ids to check if they are being used in policies. (optional)
  groupIds: [
    "group_ids_example",
  ],
};

apiInstance.policyBuilderPoliciesGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | **Array&lt;string&gt;** | Group ids to check if they are being used in policies. | (optional) defaults to undefined


### Return type

**Policybuilderv3GetPoliciesGroupsResponse**

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

# **policyBuilderRuleValidation**
> Policybuilderv3StandardCRUDResponse policyBuilderRuleValidation(policybuilderv3GetRuleValidationRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderRuleValidationRequest = {
  // Policybuilderv3GetRuleValidationRequest
  policybuilderv3GetRuleValidationRequest: {
    rule: {
      actions: [
        {
          actionName: "actionName_example",
          notifications: [
            {
              integrationId: "integrationId_example",
              templateId: "templateId_example",
              type: "UNDEFINED_RECTYPE",
              value: "value_example",
            },
          ],
          order: 1,
          parameters: [
            {
              parameterName: "parameterName_example",
              parameterValue: "parameterValue_example",
            },
          ],
          qrDefintionId: 1,
          type: "UNDEFINED_ACTIONTYPE",
          uiLabel: "uiLabel_example",
        },
      ],
      continueToNextRule: true,
      emptyGroups: [
        1,
      ],
      invalidActions: [
        {
          actionName: "actionName_example",
          notifications: [
            {
              integrationId: "integrationId_example",
              templateId: "templateId_example",
              type: "UNDEFINED_RECTYPE",
              value: "value_example",
            },
          ],
          order: 1,
          parameters: [
            {
              parameterName: "parameterName_example",
              parameterValue: "parameterValue_example",
            },
          ],
          qrDefintionId: 1,
          type: "UNDEFINED_ACTIONTYPE",
          uiLabel: "uiLabel_example",
        },
      ],
      invalidParameters: [
        {
          parameterName: "parameterName_example",
          parameterOperator: "UNKNOWN_OPERATOR",
          parameterType: "parameterType_example",
          parameterValue: "parameterValue_example",
          parameterValueLabel: "parameterValueLabel_example",
          uiLabel: "uiLabel_example",
        },
      ],
      parameters: [
        {
          parameterName: "parameterName_example",
          parameterOperator: "UNKNOWN_OPERATOR",
          parameterType: "parameterType_example",
          parameterValue: "parameterValue_example",
          parameterValueLabel: "parameterValueLabel_example",
          uiLabel: "uiLabel_example",
        },
      ],
      policyId: "policyId_example",
      ruleId: "ruleId_example",
      ruleKey: "ruleKey_example",
      ruleName: "ruleName_example",
      ruleOrder: 1,
      ruleType: "ACCESS",
      severity: "INFO",
      tags: [
        "tags_example",
      ],
      template: true,
    },
  },
};

apiInstance.policyBuilderRuleValidation(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3GetRuleValidationRequest** | **Policybuilderv3GetRuleValidationRequest**|  |


### Return type

**Policybuilderv3StandardCRUDResponse**

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

# **policyBuilderStorePoliciesGdp**
> Policybuilderv3StorePolicyGdpResponse policyBuilderStorePoliciesGdp(policybuilderv3StorePolicyGdpRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderStorePoliciesGdpRequest = {
  // string | ID of central manager.
  centralManagerId: "central_manager_id_example",
  // Policybuilderv3StorePolicyGdpRequest
  policybuilderv3StorePolicyGdpRequest: {
    centralManagerId: "centralManagerId_example",
    data: "data_example",
  },
};

apiInstance.policyBuilderStorePoliciesGdp(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3StorePolicyGdpRequest** | **Policybuilderv3StorePolicyGdpRequest**|  |
 **centralManagerId** | [**string**] | ID of central manager. | defaults to undefined


### Return type

**Policybuilderv3StorePolicyGdpResponse**

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





# .QSDataManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSDataManagerGetMasterData**](QSDataManagerApi.md#qSDataManagerGetMasterData) | **GET** /api/v3/datamanager/master-data | Summary: master data for all entities Description: Retrieves All Dimension and Fact tables data.
[**qSDataManagerRegisterScan**](QSDataManagerApi.md#qSDataManagerRegisterScan) | **POST** /api/v3/datamanager/scan | Summary: Insert ScanDetails Description: Register new data into scan dimension table.
[**qSDataManagerRetrieveScan**](QSDataManagerApi.md#qSDataManagerRetrieveScan) | **GET** /api/v3/datamanager/scan/{scan_id}/data | Summary: Fetch ScanDetails Description: Fetch details from scan dimension table.


# **qSDataManagerGetMasterData**
> Qspmdatamanagerv3MasterDataResponse qSDataManagerGetMasterData()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:any = {};

apiInstance.qSDataManagerGetMasterData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Qspmdatamanagerv3MasterDataResponse**

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

# **qSDataManagerRegisterScan**
> Qspmdatamanagerv3ScanResponse qSDataManagerRegisterScan(qspmdatamanagerv3ScanRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:.QSDataManagerApiQSDataManagerRegisterScanRequest = {
  // Qspmdatamanagerv3ScanRequest
  qspmdatamanagerv3ScanRequest: {
    pluginId: "pluginId_example",
    scanCbomId: "scanCbomId_example",
    scanDataTs: new Date('1970-01-01T00:00:00.00Z'),
    scanDataUpdateTs: new Date('1970-01-01T00:00:00.00Z'),
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    scanStatus: "scanStatus_example",
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSDataManagerRegisterScan(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmdatamanagerv3ScanRequest** | **Qspmdatamanagerv3ScanRequest**|  |


### Return type

**Qspmdatamanagerv3ScanResponse**

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

# **qSDataManagerRetrieveScan**
> Qspmdatamanagerv3ScanResponse qSDataManagerRetrieveScan()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSDataManagerApi(configuration);

let body:.QSDataManagerApiQSDataManagerRetrieveScanRequest = {
  // string
  scanId: "scan_id_example",
};

apiInstance.qSDataManagerRetrieveScan(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scanId** | [**string**] |  | defaults to undefined


### Return type

**Qspmdatamanagerv3ScanResponse**

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





# .QSPluginManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSPluginManagerInvokeAppProv**](QSPluginManagerApi.md#qSPluginManagerInvokeAppProv) | **POST** /api/v3/plugins/{plugin_id}/application | Summary: Invoke only application provisioning data plugin Description:Parses app input file and triggers dataload
[**qSPluginManagerInvokeExplorerV1**](QSPluginManagerApi.md#qSPluginManagerInvokeExplorerV1) | **POST** /api/v3/plugins/{plugin_id}/explorer | Summary: Invoke only explorer inventory data plugin Description:Parses explorer input file and triggers dataload
[**qSPluginManagerInvokeExplorerV2**](QSPluginManagerApi.md#qSPluginManagerInvokeExplorerV2) | **POST** /api/v3/plugins/{plugin_id}/explorer/analytics | Summary: Invoke only explorer analytics data plugin Description:Parses explorer input file and triggers dataload
[**qSPluginManagerInvokePlugin**](QSPluginManagerApi.md#qSPluginManagerInvokePlugin) | **POST** /api/v3/plugins/{plugin_id}/network | Summary: Invoke consolidated or only network data plugin Description:Parses input files and triggers dataload
[**qSPluginManagerInvokePolicy**](QSPluginManagerApi.md#qSPluginManagerInvokePolicy) | **POST** /api/v3/plugins/{plugin_id}/policy | Summary: Invoke only policy data plugin Description:Parses policy input file and triggers dataload


# **qSPluginManagerInvokeAppProv**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokeAppProv(qspmpluginmanagerv3PluginRQ)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPluginManagerApi(configuration);

let body:.QSPluginManagerApiQSPluginManagerInvokeAppProvRequest = {
  // string | Unique identifier for the plugin
  pluginId: "plugin_id_example",
  // Qspmpluginmanagerv3PluginRQ
  qspmpluginmanagerv3PluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    provisionId: "provisionId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSPluginManagerInvokeAppProv(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpluginmanagerv3PluginRQ** | **Qspmpluginmanagerv3PluginRQ**|  |
 **pluginId** | [**string**] | Unique identifier for the plugin | defaults to undefined


### Return type

**Qspmpluginmanagerv3PluginRS**

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

# **qSPluginManagerInvokeExplorerV1**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokeExplorerV1(qspmpluginmanagerv3PluginRQ)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPluginManagerApi(configuration);

let body:.QSPluginManagerApiQSPluginManagerInvokeExplorerV1Request = {
  // string | Unique identifier for the plugin
  pluginId: "plugin_id_example",
  // Qspmpluginmanagerv3PluginRQ
  qspmpluginmanagerv3PluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    provisionId: "provisionId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSPluginManagerInvokeExplorerV1(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpluginmanagerv3PluginRQ** | **Qspmpluginmanagerv3PluginRQ**|  |
 **pluginId** | [**string**] | Unique identifier for the plugin | defaults to undefined


### Return type

**Qspmpluginmanagerv3PluginRS**

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

# **qSPluginManagerInvokeExplorerV2**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokeExplorerV2(qspmpluginmanagerv3PluginRQ)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPluginManagerApi(configuration);

let body:.QSPluginManagerApiQSPluginManagerInvokeExplorerV2Request = {
  // string | Unique identifier for the plugin
  pluginId: "plugin_id_example",
  // Qspmpluginmanagerv3PluginRQ
  qspmpluginmanagerv3PluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    provisionId: "provisionId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSPluginManagerInvokeExplorerV2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpluginmanagerv3PluginRQ** | **Qspmpluginmanagerv3PluginRQ**|  |
 **pluginId** | [**string**] | Unique identifier for the plugin | defaults to undefined


### Return type

**Qspmpluginmanagerv3PluginRS**

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

# **qSPluginManagerInvokePlugin**
> Qspmpluginmanagerv3PluginRS qSPluginManagerInvokePlugin(qspmpluginmanagerv3PluginRQ)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPluginManagerApi(configuration);

let body:.QSPluginManagerApiQSPluginManagerInvokePluginRequest = {
  // string | Unique identifier for the plugin
  pluginId: "plugin_id_example",
  // Qspmpluginmanagerv3PluginRQ
  qspmpluginmanagerv3PluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    provisionId: "provisionId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSPluginManagerInvokePlugin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpluginmanagerv3PluginRQ** | **Qspmpluginmanagerv3PluginRQ**|  |
 **pluginId** | [**string**] | Unique identifier for the plugin | defaults to undefined


### Return type

**Qspmpluginmanagerv3PluginRS**

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

# **qSPluginManagerInvokePolicy**
> Qspmpluginmanagerv3PolicyPluginRS qSPluginManagerInvokePolicy(qspmpluginmanagerv3PolicyPluginRQ)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPluginManagerApi(configuration);

let body:.QSPluginManagerApiQSPluginManagerInvokePolicyRequest = {
  // string | Unique identifier for the plugin
  pluginId: "plugin_id_example",
  // Qspmpluginmanagerv3PolicyPluginRQ
  qspmpluginmanagerv3PolicyPluginRQ: {
    externalParam: {
      "key": "key_example",
    },
    orgId: "orgId_example",
    pluginId: "pluginId_example",
    runForAllScans: true,
    scanDesc: "scanDesc_example",
    scanId: "scanId_example",
    scanType: "scanType_example",
    userEmail: "userEmail_example",
  },
};

apiInstance.qSPluginManagerInvokePolicy(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpluginmanagerv3PolicyPluginRQ** | **Qspmpluginmanagerv3PolicyPluginRQ**|  |
 **pluginId** | [**string**] | Unique identifier for the plugin | defaults to undefined


### Return type

**Qspmpluginmanagerv3PolicyPluginRS**

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





# .QSPolicyManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qSPolicyManagerBatchStatusUpdate**](QSPolicyManagerApi.md#qSPolicyManagerBatchStatusUpdate) | **PUT** /api/v3/policy_manager/tickets/status | BatchStatusUpdate - trigger the batch to update the status of the Ticket .
[**qSPolicyManagerCreateTicket**](QSPolicyManagerApi.md#qSPolicyManagerCreateTicket) | **POST** /api/v3/policy_manager/ticket | CreateTicket - Create a new Incident .
[**qSPolicyManagerFetchFilesfromBuckets**](QSPolicyManagerApi.md#qSPolicyManagerFetchFilesfromBuckets) | **GET** /api/v3/policy_manager/os-files | FetchFilesfromBuckets - fetch the file(s) from bucket of the object storage
[**qSPolicyManagerProcessPolicyDimentionRecords**](QSPolicyManagerApi.md#qSPolicyManagerProcessPolicyDimentionRecords) | **POST** /api/v3/policy_manager/policy/process | ProcessPolicyDimentionRecords - fetch the records from Policy Dimention and update Policy Fact table
[**qSPolicyManagerUpdateTicketStatus**](QSPolicyManagerApi.md#qSPolicyManagerUpdateTicketStatus) | **PUT** /api/v3/policy_manager/ticket/status | UpdateTicketStatus - Update the ticket status based on the IntegrationId and TicketId .


# **qSPolicyManagerBatchStatusUpdate**
> Qspmpolicymanagerv3StandardEmptyResponse qSPolicyManagerBatchStatusUpdate(body)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPolicyManagerApi(configuration);

let body:.QSPolicyManagerApiQSPolicyManagerBatchStatusUpdateRequest = {
  // any
  body: {},
};

apiInstance.qSPolicyManagerBatchStatusUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **any**|  |


### Return type

**Qspmpolicymanagerv3StandardEmptyResponse**

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

# **qSPolicyManagerCreateTicket**
> Qspmpolicymanagerv3CreateTicketResponse qSPolicyManagerCreateTicket(qspmpolicymanagerv3CreateTicketRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPolicyManagerApi(configuration);

let body:.QSPolicyManagerApiQSPolicyManagerCreateTicketRequest = {
  // Qspmpolicymanagerv3CreateTicketRequest
  qspmpolicymanagerv3CreateTicketRequest: {
    policyDatasetId: "policyDatasetId_example",
    policyType: "policyType_example",
    additionalData: {
      "key": "key_example",
    },
    contents: "contents_example",
    integrationId: "integrationId_example",
    severity: "UNDEFINED",
    title: "title_example",
  },
};

apiInstance.qSPolicyManagerCreateTicket(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3CreateTicketRequest** | **Qspmpolicymanagerv3CreateTicketRequest**|  |


### Return type

**Qspmpolicymanagerv3CreateTicketResponse**

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

# **qSPolicyManagerFetchFilesfromBuckets**
> Qspmpolicymanagerv3FetchObjectStoreFileResponse qSPolicyManagerFetchFilesfromBuckets()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPolicyManagerApi(configuration);

let body:any = {};

apiInstance.qSPolicyManagerFetchFilesfromBuckets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Qspmpolicymanagerv3FetchObjectStoreFileResponse**

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

# **qSPolicyManagerProcessPolicyDimentionRecords**
> Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse qSPolicyManagerProcessPolicyDimentionRecords(qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPolicyManagerApi(configuration);

let body:.QSPolicyManagerApiQSPolicyManagerProcessPolicyDimentionRecordsRequest = {
  // Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest
  qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest: {
    provisonIdList: [
      "provisonIdList_example",
    ],
    scanIdList: [
      "scanIdList_example",
    ],
  },
};

apiInstance.qSPolicyManagerProcessPolicyDimentionRecords(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest** | **Qspmpolicymanagerv3ProcessPolicyDimentionRecordsRequest**|  |


### Return type

**Qspmpolicymanagerv3ProcessPolicyDimentionRecordsResonse**

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

# **qSPolicyManagerUpdateTicketStatus**
> Qspmpolicymanagerv3UpdateTicketStatusResponse qSPolicyManagerUpdateTicketStatus(qspmpolicymanagerv3UpdateTicketStatusRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .QSPolicyManagerApi(configuration);

let body:.QSPolicyManagerApiQSPolicyManagerUpdateTicketStatusRequest = {
  // Qspmpolicymanagerv3UpdateTicketStatusRequest
  qspmpolicymanagerv3UpdateTicketStatusRequest: {
    policyDatasetId: "policyDatasetId_example",
    policyType: "policyType_example",
  },
};

apiInstance.qSPolicyManagerUpdateTicketStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qspmpolicymanagerv3UpdateTicketStatusRequest** | **Qspmpolicymanagerv3UpdateTicketStatusRequest**|  |


### Return type

**Qspmpolicymanagerv3UpdateTicketStatusResponse**

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





# .ReportsRunnerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsRunnerGetActiveQueries**](ReportsRunnerApi.md#reportsRunnerGetActiveQueries) | **POST** /api/v3/queries/search | Summary: Get running queries Description: Get queries that are running more than certain time
[**reportsRunnerGetAuditDataCount**](ReportsRunnerApi.md#reportsRunnerGetAuditDataCount) | **POST** /api/v3/reports/{report_id}/audit_count | Summary: Get audit data count Description: Get audit data.
[**reportsRunnerGetChartData**](ReportsRunnerApi.md#reportsRunnerGetChartData) | **POST** /api/v3/charts/run | Summary: Get chart data Description: Get Chart data by chart ID or by specifying report definition and chart settings.
[**reportsRunnerGetChartDatav2**](ReportsRunnerApi.md#reportsRunnerGetChartDatav2) | **POST** /api/v3/flex-charts/run | 
[**reportsRunnerGetReportColumnFacet**](ReportsRunnerApi.md#reportsRunnerGetReportColumnFacet) | **POST** /api/v3/reports/facet | Summary: Get report column facet Description: Get counts that is group by values for the selected column.
[**reportsRunnerGetReportDataCount**](ReportsRunnerApi.md#reportsRunnerGetReportDataCount) | **POST** /api/v3/reports/count | Summary: Get report data count Description: Get report data.
[**reportsRunnerRunAuditReport**](ReportsRunnerApi.md#reportsRunnerRunAuditReport) | **POST** /api/v3/audit/{report_id}/run | Summary: Run audit report Description: Run task report by SQL based ob report ID and filter definition.
[**reportsRunnerRunReport**](ReportsRunnerApi.md#reportsRunnerRunReport) | **POST** /api/v3/reports/run | Summary: Run report Description: Run report by report ID or by specifying report definition.
[**reportsRunnerStopQuery**](ReportsRunnerApi.md#reportsRunnerStopQuery) | **POST** /api/v3/queries/stop | Summary: Stop query Description: Stop a query based on the id


# **reportsRunnerGetActiveQueries**
> Reportsrunnerv3GetActiveQueriesResponse reportsRunnerGetActiveQueries(reportsrunnerv3GetActiveQueriesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetActiveQueriesRequest = {
  // Reportsrunnerv3GetActiveQueriesRequest
  reportsrunnerv3GetActiveQueriesRequest: {
    elapsedTime: 1,
    type: [
      "type_example",
    ],
  },
};

apiInstance.reportsRunnerGetActiveQueries(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetActiveQueriesRequest** | **Reportsrunnerv3GetActiveQueriesRequest**|  |


### Return type

**Reportsrunnerv3GetActiveQueriesResponse**

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

# **reportsRunnerGetAuditDataCount**
> Reportsrunnerv3GetReportDataCountResponse reportsRunnerGetAuditDataCount(reportsrunnerv3GetAuditDataCountRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetAuditDataCountRequest = {
  // string | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905).
  reportId: "report_id_example",
  // Reportsrunnerv3GetAuditDataCountRequest
  reportsrunnerv3GetAuditDataCountRequest: {
    jobId: "jobId_example",
    reportFilters: {
      bracketsId: 1,
      filterName: "filterName_example",
      filtersArray: [
        {
          brackets: ,
          condition: {
            caseInsensitive: true,
            fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
            filterId: 1,
            headerId: "headerId_example",
            headerName: "headerName_example",
            headerType: "UNDEFINED_TYPE",
            inReportDateRange: {
              endDate: "endDate_example",
              endNumber: 1,
              endUnit: "UNDEFINED_UINT_TYPE",
              startDate: "startDate_example",
              startNumber: 1,
              startUnit: "UNDEFINED_UINT_TYPE",
              type: "UNDEFINED_DATE_RANGE_TYPE",
            },
            inReportFieldNlsKey: "inReportFieldNlsKey_example",
            inReportHeaderId: "inReportHeaderId_example",
            inReportHeaderName: "inReportHeaderName_example",
            inReportId: "inReportId_example",
            inReportName: "inReportName_example",
            inReportTableName: "inReportTableName_example",
            operatorType: "UNDEFINED_OPERATOR_TYPE",
            parameterType: "UNDEFINED_PARAM_TYPE",
            schemaName: "schemaName_example",
            sequence: 1,
            tableName: "tableName_example",
            values: [
              "values_example",
            ],
          },
        },
      ],
      havingArray: [
        {
          condition: {
            aggregationType: "UNDEFINED_AGG_TYPE",
            headerId: "headerId_example",
            headerName: "headerName_example",
            operatorType: "UNDEFINED_OPERATOR_TYPE",
            tableName: "tableName_example",
            value: "value_example",
          },
        },
      ],
      isCustom: true,
      optionType: "UNDEFINED_OPTION_TYPE",
      sequence: 1,
    },
    reportId: "reportId_example",
    schemaName: "schemaName_example",
    tableName: "tableName_example",
  },
};

apiInstance.reportsRunnerGetAuditDataCount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetAuditDataCountRequest** | **Reportsrunnerv3GetAuditDataCountRequest**|  |
 **reportId** | [**string**] | Optional: the ID of the Report we wish to run (e.g. 000000000000000000000905). | defaults to undefined


### Return type

**Reportsrunnerv3GetReportDataCountResponse**

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

# **reportsRunnerGetChartData**
> Reportsrunnerv3GetChartDataResponse reportsRunnerGetChartData(reportsrunnerv3GetChartDataRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetChartDataRequest = {
  // Reportsrunnerv3GetChartDataRequest
  reportsrunnerv3GetChartDataRequest: {
    chartId: "chartId_example",
    chartSettings: {
      chartId: "chartId_example",
      chartTitle: "chartTitle_example",
      chartType: "UNDEFINED_CHART_TYPE",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      datasetHeaderId: "datasetHeaderId_example",
      datasetMaxValues: 1,
      defaultChartExpanded: true,
      isDefaultChart: true,
      isPredefined: true,
      refreshRate: 1,
      reportId: "reportId_example",
      xaxisHeaderId: "xaxisHeaderId_example",
      xaxisMaxValues: 1,
      yaxisHeaderId: "yaxisHeaderId_example",
    },
    modelType: "UNDEFINED_MODEL_TYPE",
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    runtimeParameterList: [
      {
        key: "key_example",
        label: "label_example",
        operatorType: "UNDEFINED_OPERATOR_TYPE",
        runtimeParameterType: "UNDEFINED_TYPE",
        runtimeParameterTypeLength: 1,
        value: "value_example",
      },
    ],
    timeZone: "timeZone_example",
  },
};

apiInstance.reportsRunnerGetChartData(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetChartDataRequest** | **Reportsrunnerv3GetChartDataRequest**|  |


### Return type

**Reportsrunnerv3GetChartDataResponse**

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

# **reportsRunnerGetChartDatav2**
> Reportsrunnerv3GetChartDataResponsev2 reportsRunnerGetChartDatav2(reportsrunnerv3GetChartDataRequestv2)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetChartDatav2Request = {
  // Reportsrunnerv3GetChartDataRequestv2
  reportsrunnerv3GetChartDataRequestv2: {
    chartId: "chartId_example",
    chartSettings: {
      categorySequenceNumbers: [
        1,
      ],
      chartId: "chartId_example",
      chartTitle: "chartTitle_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      defaultChartExpanded: true,
      isDefaultChart: true,
      isPredefined: true,
      measureSequenceNumbers: [
        1,
      ],
      refreshRate: 1,
      reportId: "reportId_example",
      vegaDefinition: "vegaDefinition_example",
    },
    modelType: "UNDEFINED_MODEL_TYPE",
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    runtimeParameterList: [
      {
        key: "key_example",
        label: "label_example",
        operatorType: "UNDEFINED_OPERATOR_TYPE",
        runtimeParameterType: "UNDEFINED_TYPE",
        runtimeParameterTypeLength: 1,
        value: "value_example",
      },
    ],
    timeZone: "timeZone_example",
  },
};

apiInstance.reportsRunnerGetChartDatav2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetChartDataRequestv2** | **Reportsrunnerv3GetChartDataRequestv2**|  |


### Return type

**Reportsrunnerv3GetChartDataResponsev2**

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

# **reportsRunnerGetReportColumnFacet**
> Reportsrunnerv3GetReportColumnFacetResponse reportsRunnerGetReportColumnFacet(reportsrunnerv3GetReportColumnFacetRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetReportColumnFacetRequest = {
  // Reportsrunnerv3GetReportColumnFacetRequest
  reportsrunnerv3GetReportColumnFacetRequest: {
    dateRange: {
      endDate: "endDate_example",
      endNumber: 1,
      endUnit: "UNDEFINED_UINT_TYPE",
      startDate: "startDate_example",
      startNumber: 1,
      startUnit: "UNDEFINED_UINT_TYPE",
      type: "UNDEFINED_DATE_RANGE_TYPE",
    },
    facetSelectedHeader: {
      aggregationType: "UNDEFINED_AGG_TYPE",
      fieldName: {
        customizedValue: "customizedValue_example",
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      groupTypeId: 1,
      headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
      headerDescription: {
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      headerId: "headerId_example",
      headerName: "headerName_example",
      headerType: "UNDEFINED_TYPE",
      headerTypeLength: 1,
      literal: {
        customizedValue: "customizedValue_example",
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      orderBy: "UNDEFINED_ORDER_BY",
      orderBySeq: 1,
      schemaName: "schemaName_example",
      sequence: 1,
      tableName: "tableName_example",
    },
    modelType: "UNDEFINED_MODEL_TYPE",
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    runtimeParameterList: [
      {
        key: "key_example",
        label: "label_example",
        operatorType: "UNDEFINED_OPERATOR_TYPE",
        runtimeParameterType: "UNDEFINED_TYPE",
        runtimeParameterTypeLength: 1,
        value: "value_example",
      },
    ],
    timeZone: "timeZone_example",
  },
};

apiInstance.reportsRunnerGetReportColumnFacet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetReportColumnFacetRequest** | **Reportsrunnerv3GetReportColumnFacetRequest**|  |


### Return type

**Reportsrunnerv3GetReportColumnFacetResponse**

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

# **reportsRunnerGetReportDataCount**
> Reportsrunnerv3GetReportDataCountResponse reportsRunnerGetReportDataCount(reportsrunnerv3GetReportDataCountRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerGetReportDataCountRequest = {
  // Reportsrunnerv3GetReportDataCountRequest
  reportsrunnerv3GetReportDataCountRequest: {
    dateRange: {
      endDate: "endDate_example",
      endNumber: 1,
      endUnit: "UNDEFINED_UINT_TYPE",
      startDate: "startDate_example",
      startNumber: 1,
      startUnit: "UNDEFINED_UINT_TYPE",
      type: "UNDEFINED_DATE_RANGE_TYPE",
    },
    modelType: "UNDEFINED_MODEL_TYPE",
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    reportId: "reportId_example",
    runtimeParameterList: [
      {
        key: "key_example",
        label: "label_example",
        operatorType: "UNDEFINED_OPERATOR_TYPE",
        runtimeParameterType: "UNDEFINED_TYPE",
        runtimeParameterTypeLength: 1,
        value: "value_example",
      },
    ],
    timeZone: "timeZone_example",
  },
};

apiInstance.reportsRunnerGetReportDataCount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3GetReportDataCountRequest** | **Reportsrunnerv3GetReportDataCountRequest**|  |


### Return type

**Reportsrunnerv3GetReportDataCountResponse**

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

# **reportsRunnerRunAuditReport**
> StreamResultOfReportsrunnerv3RunReportResponse reportsRunnerRunAuditReport(reportsrunnerv3RunAuditReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerRunAuditReportRequest = {
  // string | The ID of the Report we wish to run (e.g. 000000000000000000000905).
  reportId: "report_id_example",
  // Reportsrunnerv3RunAuditReportRequest
  reportsrunnerv3RunAuditReportRequest: {
    fetchSize: 1,
    headerName: "headerName_example",
    jobId: "jobId_example",
    offset: 1,
    orderBy: "UNDEFINED_ORDER_BY",
    reportFilters: {
      bracketsId: 1,
      filterName: "filterName_example",
      filtersArray: [
        {
          brackets: ,
          condition: {
            caseInsensitive: true,
            fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
            filterId: 1,
            headerId: "headerId_example",
            headerName: "headerName_example",
            headerType: "UNDEFINED_TYPE",
            inReportDateRange: {
              endDate: "endDate_example",
              endNumber: 1,
              endUnit: "UNDEFINED_UINT_TYPE",
              startDate: "startDate_example",
              startNumber: 1,
              startUnit: "UNDEFINED_UINT_TYPE",
              type: "UNDEFINED_DATE_RANGE_TYPE",
            },
            inReportFieldNlsKey: "inReportFieldNlsKey_example",
            inReportHeaderId: "inReportHeaderId_example",
            inReportHeaderName: "inReportHeaderName_example",
            inReportId: "inReportId_example",
            inReportName: "inReportName_example",
            inReportTableName: "inReportTableName_example",
            operatorType: "UNDEFINED_OPERATOR_TYPE",
            parameterType: "UNDEFINED_PARAM_TYPE",
            schemaName: "schemaName_example",
            sequence: 1,
            tableName: "tableName_example",
            values: [
              "values_example",
            ],
          },
        },
      ],
      havingArray: [
        {
          condition: {
            aggregationType: "UNDEFINED_AGG_TYPE",
            headerId: "headerId_example",
            headerName: "headerName_example",
            operatorType: "UNDEFINED_OPERATOR_TYPE",
            tableName: "tableName_example",
            value: "value_example",
          },
        },
      ],
      isCustom: true,
      optionType: "UNDEFINED_OPTION_TYPE",
      sequence: 1,
    },
    reportId: "reportId_example",
    schemaName: "schemaName_example",
    tableName: "tableName_example",
    withoutLimit: true,
  },
};

apiInstance.reportsRunnerRunAuditReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3RunAuditReportRequest** | **Reportsrunnerv3RunAuditReportRequest**|  |
 **reportId** | [**string**] | The ID of the Report we wish to run (e.g. 000000000000000000000905). | defaults to undefined


### Return type

**StreamResultOfReportsrunnerv3RunReportResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsRunnerRunReport**
> StreamResultOfReportsrunnerv3RunReportResponse reportsRunnerRunReport(reportsrunnerv3RunReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerRunReportRequest = {
  // Reportsrunnerv3RunReportRequest
  reportsrunnerv3RunReportRequest: {
    calculateFacets: true,
    dateRange: {
      endDate: "endDate_example",
      endNumber: 1,
      endUnit: "UNDEFINED_UINT_TYPE",
      startDate: "startDate_example",
      startNumber: 1,
      startUnit: "UNDEFINED_UINT_TYPE",
      type: "UNDEFINED_DATE_RANGE_TYPE",
    },
    defaultChartExpanded: true,
    fetchSize: 1,
    jobType: "UNDEFINED_JOB_TYPE",
    modelType: "UNDEFINED_MODEL_TYPE",
    offset: 1,
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    reportId: "reportId_example",
    runtimeParameterList: [
      {
        key: "key_example",
        label: "label_example",
        operatorType: "UNDEFINED_OPERATOR_TYPE",
        runtimeParameterType: "UNDEFINED_TYPE",
        runtimeParameterTypeLength: 1,
        value: "value_example",
      },
    ],
    timeZone: "timeZone_example",
    useQuickFacets: true,
    withoutLimit: true,
  },
};

apiInstance.reportsRunnerRunReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3RunReportRequest** | **Reportsrunnerv3RunReportRequest**|  |


### Return type

**StreamResultOfReportsrunnerv3RunReportResponse**

### Authorization

[BasicAuth](README.md#BasicAuth), [ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response.(streaming responses) |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **reportsRunnerStopQuery**
> Reportsrunnerv3StopQueryResponse reportsRunnerStopQuery(reportsrunnerv3StopQueryRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsRunnerApi(configuration);

let body:.ReportsRunnerApiReportsRunnerStopQueryRequest = {
  // Reportsrunnerv3StopQueryRequest
  reportsrunnerv3StopQueryRequest: {
    queryIds: [
      "queryIds_example",
    ],
  },
};

apiInstance.reportsRunnerStopQuery(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsrunnerv3StopQueryRequest** | **Reportsrunnerv3StopQueryRequest**|  |


### Return type

**Reportsrunnerv3StopQueryResponse**

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





# .ReportsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportsServiceCreateCategory**](ReportsServiceApi.md#reportsServiceCreateCategory) | **POST** /api/v3/reports/categories | Summary: Create a category Description: Create a report category
[**reportsServiceCreateChart**](ReportsServiceApi.md#reportsServiceCreateChart) | **POST** /api/v3/charts | Summary: Create chart Description: Create custom chart based on provided properties.
[**reportsServiceCreateChartTemplatev2**](ReportsServiceApi.md#reportsServiceCreateChartTemplatev2) | **POST** /api/v3/flex-charts/templates | Summary: Create chart template v2 Description: Create custom VEGA chart template.
[**reportsServiceCreateChartv2**](ReportsServiceApi.md#reportsServiceCreateChartv2) | **POST** /api/v3/flex-charts | Summary: Create chart v2 Description: Create custom VEGA chart based on provided properties.
[**reportsServiceCreateFieldsByCategory**](ReportsServiceApi.md#reportsServiceCreateFieldsByCategory) | **POST** /api/v3/reports/fields | Summary - Create fields by category Description: Cteate category fields based on provided properties.
[**reportsServiceCreateJoin**](ReportsServiceApi.md#reportsServiceCreateJoin) | **POST** /api/v3/reports/categories/joins | Summary: Create a join Description: Create a custom report join
[**reportsServiceCreateReport**](ReportsServiceApi.md#reportsServiceCreateReport) | **POST** /api/v3/reports | Summary: Create report Description: Create custom report based on provided properties.
[**reportsServiceCreateVariant**](ReportsServiceApi.md#reportsServiceCreateVariant) | **POST** /api/v3/reports/variants | Summary: Create a variant Description: Create a variant for reports
[**reportsServiceDeleteCategory**](ReportsServiceApi.md#reportsServiceDeleteCategory) | **DELETE** /api/v3/reports/categories | Summary: Delete a category Description: Delete a report category
[**reportsServiceDeleteChart**](ReportsServiceApi.md#reportsServiceDeleteChart) | **DELETE** /api/v3/charts/{chart_id} | Summary: Delete chart Description: Delete a custom chart.
[**reportsServiceDeleteChartTemplatev2**](ReportsServiceApi.md#reportsServiceDeleteChartTemplatev2) | **DELETE** /api/v3/flex-charts/templates/{template_id} | Summary: Delete chart template v2 Description: Delete a custom VEGA chart template.
[**reportsServiceDeleteChartv2**](ReportsServiceApi.md#reportsServiceDeleteChartv2) | **DELETE** /api/v3/flex-charts/{chart_id} | Summary: Delete chart v2 Description: Delete a custom VEGA chart.
[**reportsServiceDeleteFieldsByCategory**](ReportsServiceApi.md#reportsServiceDeleteFieldsByCategory) | **DELETE** /api/v3/reports/fields | Summary - Delete fields by category Description: Delete category fields based on provided properties.
[**reportsServiceDeleteJoin**](ReportsServiceApi.md#reportsServiceDeleteJoin) | **DELETE** /api/v3/reports/categories/joins/{join_id} | Summary: Delete a join Description: Delete a custom join
[**reportsServiceDeleteReport**](ReportsServiceApi.md#reportsServiceDeleteReport) | **DELETE** /api/v3/reports/{report_id} | Summary: Delete report Description: Delete a custom report.
[**reportsServiceDeleteVariant**](ReportsServiceApi.md#reportsServiceDeleteVariant) | **DELETE** /api/v3/reports/variants/{variant_id} | Summary: Delete a variant Description: Delete a variant
[**reportsServiceGetCategories**](ReportsServiceApi.md#reportsServiceGetCategories) | **GET** /api/v3/reports/categories | Summary:  Get all available report categories. Description: Get all category related fields or all possible fields.
[**reportsServiceGetChartSettings**](ReportsServiceApi.md#reportsServiceGetChartSettings) | **GET** /api/v3/charts | Summary: Get chart settings Description: Get a custom chart based on provided report id.
[**reportsServiceGetChartSettingsv2**](ReportsServiceApi.md#reportsServiceGetChartSettingsv2) | **GET** /api/v3/flex-charts | Summary: Get chart settings v2 Description: Get a custom VEGA chart based on provided report id.
[**reportsServiceGetChartTemplatesv2**](ReportsServiceApi.md#reportsServiceGetChartTemplatesv2) | **GET** /api/v3/flex-charts/templates | Summary: Get chart template v2 Description: Get all custom VEGA chart templates.
[**reportsServiceGetFieldsByCategories**](ReportsServiceApi.md#reportsServiceGetFieldsByCategories) | **GET** /api/v3/reports/fields/categories | Summary: Get fields by categories Description: Get all category related fields or all possible fields based on a list of categories.
[**reportsServiceGetFieldsByCategory**](ReportsServiceApi.md#reportsServiceGetFieldsByCategory) | **GET** /api/v3/reports/fields | Summary: Get fields by category Description: Get all category related fields or all possible fields.
[**reportsServiceGetJoins**](ReportsServiceApi.md#reportsServiceGetJoins) | **GET** /api/v3/reports/categories/joins | Summary: Get all joins Description: Get all custom joins.
[**reportsServiceGetQueryByReportDefinition**](ReportsServiceApi.md#reportsServiceGetQueryByReportDefinition) | **POST** /api/v3/reports/query/definition | Summary: Get query by report definition Description: Get query by report definition.
[**reportsServiceGetQueryByReportID**](ReportsServiceApi.md#reportsServiceGetQueryByReportID) | **POST** /api/v3/reports/query/id | Summary: Get query by report ID Description: Get query by report ID.
[**reportsServiceGetReportDefinition**](ReportsServiceApi.md#reportsServiceGetReportDefinition) | **GET** /api/v3/reports/{report_id}/definition | Summary: Get report definition Description: Get report definition.
[**reportsServiceGetReportGroups**](ReportsServiceApi.md#reportsServiceGetReportGroups) | **GET** /api/v3/reports_groups | Summary: Get report groups Description: Get reports used by the provided groups.
[**reportsServiceGetReportSynopsis**](ReportsServiceApi.md#reportsServiceGetReportSynopsis) | **GET** /api/v3/reports/{report_id}/synopsis | Summary: Get report synopsis Description: Return BriefReport.
[**reportsServiceGetReportTimestampHeader**](ReportsServiceApi.md#reportsServiceGetReportTimestampHeader) | **GET** /api/v3/reports/headers/timestamp/default | Summary: Get report timestamp header Description: Get where to take a report timestamp given an entity.
[**reportsServiceGetReports**](ReportsServiceApi.md#reportsServiceGetReports) | **GET** /api/v3/reports | Summary: Get reports Description: Get reports list.
[**reportsServiceGetReportsForJoin**](ReportsServiceApi.md#reportsServiceGetReportsForJoin) | **GET** /api/v3/reports/categories/joins/{join_id}/reports | Summary: Get the reports that use a join Description: Get the reports that use a join and the headers that are imported by the reports using the join
[**reportsServiceGetReportsTags**](ReportsServiceApi.md#reportsServiceGetReportsTags) | **GET** /api/v3/reports/tags | Summary: Get reports tags Description: Get all report distinct tags.
[**reportsServiceGetVariant**](ReportsServiceApi.md#reportsServiceGetVariant) | **GET** /api/v3/reports/variants/{variant_id} | Summary: Get a variant Description: Get a given variant
[**reportsServiceGetVariants**](ReportsServiceApi.md#reportsServiceGetVariants) | **GET** /api/v3/reports/variants | Summary: Get all variants Description: Get all variants in reports
[**reportsServicePartialChartUpdate**](ReportsServiceApi.md#reportsServicePartialChartUpdate) | **PATCH** /api/v3/charts/{chart_id} | Summary: Partial chart update Description: Update a custom chart with partial information.
[**reportsServicePartialReportUpdate**](ReportsServiceApi.md#reportsServicePartialReportUpdate) | **PATCH** /api/v3/reports/{report_id} | Summary: Partial report update Description: Update a custom report with partial information.
[**reportsServiceRunVariantOperation**](ReportsServiceApi.md#reportsServiceRunVariantOperation) | **POST** /api/v3/reports/variants/run | Summary: Run a variant Description: Run the operations in a variant
[**reportsServiceTranspose**](ReportsServiceApi.md#reportsServiceTranspose) | **POST** /api/v3/reports/transpose | Summary: Transpose Description: Return the corresponding full sql data.
[**reportsServiceUpdateChart**](ReportsServiceApi.md#reportsServiceUpdateChart) | **PUT** /api/v3/charts/{chart_id} | Summary: Update chart Description: Update a custom chart.
[**reportsServiceUpdateChartv2**](ReportsServiceApi.md#reportsServiceUpdateChartv2) | **PUT** /api/v3/flex-charts/{chart_id} | Summary: Update chart v2 Description: Update a custom VEGA chart.
[**reportsServiceUpdateJoin**](ReportsServiceApi.md#reportsServiceUpdateJoin) | **PUT** /api/v3/reports/categories/joins/{join_id} | Summary: Update a join Description: Update a custom join
[**reportsServiceUpdateReport**](ReportsServiceApi.md#reportsServiceUpdateReport) | **PUT** /api/v3/reports/{report_id} | Summary: Update report Description: Update a custom report.
[**reportsServiceUpdateVariantOverride**](ReportsServiceApi.md#reportsServiceUpdateVariantOverride) | **PUT** /api/v3/reports/variants/{variant_id} | Summary: Update a variant Description: Update a variant with a custom override


# **reportsServiceCreateCategory**
> Reportsv3CreateCategoryResponse reportsServiceCreateCategory(reportsv3CreateCategoryRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateCategoryRequest = {
  // Reportsv3CreateCategoryRequest
  reportsv3CreateCategoryRequest: {
    category: {
      categoryDescription: "categoryDescription_example",
      categoryName: "categoryName_example",
      categoryTables: [
        "categoryTables_example",
      ],
      timestampMapping: [
        {
          level: 1,
          tableName: "tableName_example",
          timestampHeaderId: "timestampHeaderId_example",
          timestampHeaderName: "timestampHeaderName_example",
        },
      ],
    },
  },
};

apiInstance.reportsServiceCreateCategory(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateCategoryRequest** | **Reportsv3CreateCategoryRequest**|  |


### Return type

**Reportsv3CreateCategoryResponse**

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

# **reportsServiceCreateChart**
> Reportsv3CreateChartResponse reportsServiceCreateChart(reportsv3CreateChartRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateChartRequest = {
  // Reportsv3CreateChartRequest
  reportsv3CreateChartRequest: {
    chartSettings: {
      chartId: "chartId_example",
      chartTitle: "chartTitle_example",
      chartType: "UNDEFINED_CHART_TYPE",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      datasetHeaderId: "datasetHeaderId_example",
      datasetMaxValues: 1,
      defaultChartExpanded: true,
      isDefaultChart: true,
      isPredefined: true,
      refreshRate: 1,
      reportId: "reportId_example",
      xaxisHeaderId: "xaxisHeaderId_example",
      xaxisMaxValues: 1,
      yaxisHeaderId: "yaxisHeaderId_example",
    },
  },
};

apiInstance.reportsServiceCreateChart(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartRequest** | **Reportsv3CreateChartRequest**|  |


### Return type

**Reportsv3CreateChartResponse**

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

# **reportsServiceCreateChartTemplatev2**
> Reportsv3CreateChartTemplatev2Response reportsServiceCreateChartTemplatev2(reportsv3CreateChartTemplatev2Request)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateChartTemplatev2Request = {
  // Reportsv3CreateChartTemplatev2Request
  reportsv3CreateChartTemplatev2Request: {
    vegaDefinition: "vegaDefinition_example",
  },
};

apiInstance.reportsServiceCreateChartTemplatev2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartTemplatev2Request** | **Reportsv3CreateChartTemplatev2Request**|  |


### Return type

**Reportsv3CreateChartTemplatev2Response**

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

# **reportsServiceCreateChartv2**
> Reportsv3CreateChartv2Response reportsServiceCreateChartv2(reportsv3CreateChartv2Request)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateChartv2Request = {
  // Reportsv3CreateChartv2Request
  reportsv3CreateChartv2Request: {
    chartSettingsV2: {
      categorySequenceNumbers: [
        1,
      ],
      chartId: "chartId_example",
      chartTitle: "chartTitle_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      defaultChartExpanded: true,
      isDefaultChart: true,
      isPredefined: true,
      measureSequenceNumbers: [
        1,
      ],
      refreshRate: 1,
      reportId: "reportId_example",
      vegaDefinition: "vegaDefinition_example",
    },
  },
};

apiInstance.reportsServiceCreateChartv2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateChartv2Request** | **Reportsv3CreateChartv2Request**|  |


### Return type

**Reportsv3CreateChartv2Response**

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

# **reportsServiceCreateFieldsByCategory**
> Reportsv3CreateFieldsByCategoryResponse reportsServiceCreateFieldsByCategory(reportsv3CreateFieldsByCategoryRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateFieldsByCategoryRequest = {
  // Reportsv3CreateFieldsByCategoryRequest
  reportsv3CreateFieldsByCategoryRequest: {
    fields: [
      {
        canBeUsedInChart: true,
        fieldName: "fieldName_example",
        groupTypeId: 1,
        headerCategory: "headerCategory_example",
        headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
        headerDescription: "headerDescription_example",
        headerName: "headerName_example",
        isRecommended: true,
        isVisible: true,
        tableName: "tableName_example",
        type: "UNDEFINED_TYPE",
        typeLength: 1,
      },
    ],
  },
};

apiInstance.reportsServiceCreateFieldsByCategory(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateFieldsByCategoryRequest** | **Reportsv3CreateFieldsByCategoryRequest**|  |


### Return type

**Reportsv3CreateFieldsByCategoryResponse**

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

# **reportsServiceCreateJoin**
> Reportsv3CreateJoinResponse reportsServiceCreateJoin(reportsv3CreateJoinRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateJoinRequest = {
  // Reportsv3CreateJoinRequest
  reportsv3CreateJoinRequest: {
    joinDefinition: {
      categoryId: "categoryId_example",
      headerPairList: [
        {
          sourceHeaderId: "sourceHeaderId_example",
          targetHeaderId: "targetHeaderId_example",
        },
      ],
      sourceTableName: "sourceTableName_example",
      targetHeadersSelectedIds: [
        "targetHeadersSelectedIds_example",
      ],
      targetTableName: "targetTableName_example",
    },
  },
};

apiInstance.reportsServiceCreateJoin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateJoinRequest** | **Reportsv3CreateJoinRequest**|  |


### Return type

**Reportsv3CreateJoinResponse**

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

# **reportsServiceCreateReport**
> Reportsv3CreateReportResponse reportsServiceCreateReport(reportsv3CreateReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateReportRequest = {
  // Reportsv3CreateReportRequest
  reportsv3CreateReportRequest: {
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
  },
};

apiInstance.reportsServiceCreateReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateReportRequest** | **Reportsv3CreateReportRequest**|  |


### Return type

**Reportsv3CreateReportResponse**

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

# **reportsServiceCreateVariant**
> Reportsv3CreateVariantResponse reportsServiceCreateVariant(reportsv3CreateVariantRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceCreateVariantRequest = {
  // Reportsv3CreateVariantRequest
  reportsv3CreateVariantRequest: {
    headerId: "headerId_example",
    rules: [
      {
        actionIfType: "UNDEFINED_VARIANT_ACTION_IF",
        delimiter: "delimiter_example",
        extractValue: "extractValue_example",
        matcher: "matcher_example",
        type: "UNDEFINED_VARIANT_RULE_TYPE",
      },
    ],
    variantName: "variantName_example",
  },
};

apiInstance.reportsServiceCreateVariant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3CreateVariantRequest** | **Reportsv3CreateVariantRequest**|  |


### Return type

**Reportsv3CreateVariantResponse**

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

# **reportsServiceDeleteCategory**
> Reportsv3DeleteCategoryResponse reportsServiceDeleteCategory()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteCategoryRequest = {
  // string | category id. (optional)
  categoryId: "category_id_example",
  // string | table name. (optional)
  tableName: "table_name_example",
};

apiInstance.reportsServiceDeleteCategory(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | [**string**] | category id. | (optional) defaults to undefined
 **tableName** | [**string**] | table name. | (optional) defaults to undefined


### Return type

**Reportsv3DeleteCategoryResponse**

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

# **reportsServiceDeleteChart**
> Reportsv3DeleteChartResponse reportsServiceDeleteChart()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteChartRequest = {
  // string | The id of the chart to be deleted.
  chartId: "chart_id_example",
};

apiInstance.reportsServiceDeleteChart(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | [**string**] | The id of the chart to be deleted. | defaults to undefined


### Return type

**Reportsv3DeleteChartResponse**

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

# **reportsServiceDeleteChartTemplatev2**
> Reportsv3DeleteChartTemplatev2Response reportsServiceDeleteChartTemplatev2()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteChartTemplatev2Request = {
  // string | Unique template ID.
  templateId: "template_id_example",
};

apiInstance.reportsServiceDeleteChartTemplatev2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **templateId** | [**string**] | Unique template ID. | defaults to undefined


### Return type

**Reportsv3DeleteChartTemplatev2Response**

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

# **reportsServiceDeleteChartv2**
> Reportsv3DeleteChartv2Response reportsServiceDeleteChartv2()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteChartv2Request = {
  // string | The ID of the chart for deletion.
  chartId: "chart_id_example",
};

apiInstance.reportsServiceDeleteChartv2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | [**string**] | The ID of the chart for deletion. | defaults to undefined


### Return type

**Reportsv3DeleteChartv2Response**

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

# **reportsServiceDeleteFieldsByCategory**
> Reportsv3DeleteFieldsByCategoryResponse reportsServiceDeleteFieldsByCategory()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteFieldsByCategoryRequest = {
  // Array<string> | Header ids. (optional)
  headerIds: [
    "header_ids_example",
  ],
  // string | table name. (optional)
  tableName: "table_name_example",
};

apiInstance.reportsServiceDeleteFieldsByCategory(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **headerIds** | **Array&lt;string&gt;** | Header ids. | (optional) defaults to undefined
 **tableName** | [**string**] | table name. | (optional) defaults to undefined


### Return type

**Reportsv3DeleteFieldsByCategoryResponse**

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

# **reportsServiceDeleteJoin**
> Reportsv3DeleteJoinResponse reportsServiceDeleteJoin()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteJoinRequest = {
  // string | The id of the join to be deleted.
  joinId: "join_id_example",
};

apiInstance.reportsServiceDeleteJoin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **joinId** | [**string**] | The id of the join to be deleted. | defaults to undefined


### Return type

**Reportsv3DeleteJoinResponse**

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

# **reportsServiceDeleteReport**
> Reportsv3DeleteReportResponse reportsServiceDeleteReport()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteReportRequest = {
  // string | The id of the Report to be deleted.
  reportId: "report_id_example",
};

apiInstance.reportsServiceDeleteReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | [**string**] | The id of the Report to be deleted. | defaults to undefined


### Return type

**Reportsv3DeleteReportResponse**

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

# **reportsServiceDeleteVariant**
> Reportsv3DeleteVariantResponse reportsServiceDeleteVariant()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceDeleteVariantRequest = {
  // string | The id of the variant to delete
  variantId: "variant_id_example",
};

apiInstance.reportsServiceDeleteVariant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantId** | [**string**] | The id of the variant to delete | defaults to undefined


### Return type

**Reportsv3DeleteVariantResponse**

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

# **reportsServiceGetCategories**
> Reportsv3GetCategoriesResponse reportsServiceGetCategories()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetCategoriesRequest = {
  // string | Report ID. (optional)
  reportId: "report_id_example",
};

apiInstance.reportsServiceGetCategories(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | [**string**] | Report ID. | (optional) defaults to undefined


### Return type

**Reportsv3GetCategoriesResponse**

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

# **reportsServiceGetChartSettings**
> Reportsv3GetChartSettingsResponse reportsServiceGetChartSettings()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetChartSettingsRequest = {
  // string | Unique Chart ID. (optional)
  chartId: "chart_id_example",
  // string | Unique Report ID. (optional)
  reportId: "report_id_example",
};

apiInstance.reportsServiceGetChartSettings(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | [**string**] | Unique Chart ID. | (optional) defaults to undefined
 **reportId** | [**string**] | Unique Report ID. | (optional) defaults to undefined


### Return type

**Reportsv3GetChartSettingsResponse**

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

# **reportsServiceGetChartSettingsv2**
> Reportsv3GetChartSettingsv2Response reportsServiceGetChartSettingsv2()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetChartSettingsv2Request = {
  // string | Unique Chart ID. (optional)
  chartId: "chart_id_example",
  // string | Unique Report ID. (optional)
  reportId: "report_id_example",
};

apiInstance.reportsServiceGetChartSettingsv2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chartId** | [**string**] | Unique Chart ID. | (optional) defaults to undefined
 **reportId** | [**string**] | Unique Report ID. | (optional) defaults to undefined


### Return type

**Reportsv3GetChartSettingsv2Response**

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

# **reportsServiceGetChartTemplatesv2**
> Reportsv3GetChartTemplatesv2Response reportsServiceGetChartTemplatesv2()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetChartTemplatesv2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetChartTemplatesv2Response**

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

# **reportsServiceGetFieldsByCategories**
> Reportsv3GetFieldsByCategoriesResponse reportsServiceGetFieldsByCategories()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetFieldsByCategoriesRequest = {
  // Array<string> | Category IDs. (optional)
  categoryIds: [
    "category_ids_example",
  ],
};

apiInstance.reportsServiceGetFieldsByCategories(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryIds** | **Array&lt;string&gt;** | Category IDs. | (optional) defaults to undefined


### Return type

**Reportsv3GetFieldsByCategoriesResponse**

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

# **reportsServiceGetFieldsByCategory**
> Reportsv3GetFieldsByCategoryResponse reportsServiceGetFieldsByCategory()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetFieldsByCategoryRequest = {
  // string | Category ID. (optional)
  categoryId: "category_id_example",
  // string | Report ID. (optional)
  reportId: "report_id_example",
  // string | optional table name parameter. (optional)
  tableName: "table_name_example",
};

apiInstance.reportsServiceGetFieldsByCategory(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | [**string**] | Category ID. | (optional) defaults to undefined
 **reportId** | [**string**] | Report ID. | (optional) defaults to undefined
 **tableName** | [**string**] | optional table name parameter. | (optional) defaults to undefined


### Return type

**Reportsv3GetFieldsByCategoryResponse**

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

# **reportsServiceGetJoins**
> Reportsv3GetJoinsResponse reportsServiceGetJoins()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetJoinsRequest = {
  // string | Category ID (Optional). (optional)
  categoryId: "category_id_example",
};

apiInstance.reportsServiceGetJoins(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | [**string**] | Category ID (Optional). | (optional) defaults to undefined


### Return type

**Reportsv3GetJoinsResponse**

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

# **reportsServiceGetQueryByReportDefinition**
> Reportsv3GetReportQueryResponse reportsServiceGetQueryByReportDefinition(reportsv3GetQueryByReportDefinitionRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetQueryByReportDefinitionRequest = {
  // Reportsv3GetQueryByReportDefinitionRequest
  reportsv3GetQueryByReportDefinitionRequest: {
    addGroupLiteral: "addGroupLiteral_example",
    addJobIdLiteral: "addJobIdLiteral_example",
    dateRange: {
      endDate: "endDate_example",
      endNumber: 1,
      endUnit: "UNDEFINED_UINT_TYPE",
      startDate: "startDate_example",
      startNumber: 1,
      startUnit: "UNDEFINED_UINT_TYPE",
      type: "UNDEFINED_DATE_RANGE_TYPE",
    },
    defaultChartExpanded: true,
    excludeGroupId: "excludeGroupId_example",
    facetSelectedHeader: {
      aggregationType: "UNDEFINED_AGG_TYPE",
      fieldName: {
        customizedValue: "customizedValue_example",
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      groupTypeId: 1,
      headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
      headerDescription: {
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      headerId: "headerId_example",
      headerName: "headerName_example",
      headerType: "UNDEFINED_TYPE",
      headerTypeLength: 1,
      literal: {
        customizedValue: "customizedValue_example",
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      orderBy: "UNDEFINED_ORDER_BY",
      orderBySeq: 1,
      schemaName: "schemaName_example",
      sequence: 1,
      tableName: "tableName_example",
    },
    filterForJobId: "filterForJobId_example",
    jobType: "UNDEFINED_JOB_TYPE",
    modelTypes: [
      "UNDEFINED_MODEL_TYPE",
    ],
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    sqlType: "UNDEFINED_SQL_TYPE",
    tableJoinOptimization: true,
  },
};

apiInstance.reportsServiceGetQueryByReportDefinition(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3GetQueryByReportDefinitionRequest** | **Reportsv3GetQueryByReportDefinitionRequest**|  |


### Return type

**Reportsv3GetReportQueryResponse**

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

# **reportsServiceGetQueryByReportID**
> Reportsv3GetReportQueryResponse reportsServiceGetQueryByReportID(reportsv3GetQueryByReportIDRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetQueryByReportIDRequest = {
  // Reportsv3GetQueryByReportIDRequest
  reportsv3GetQueryByReportIDRequest: {
    addGroupLiteral: "addGroupLiteral_example",
    addJobIdLiteral: "addJobIdLiteral_example",
    dateRange: {
      endDate: "endDate_example",
      endNumber: 1,
      endUnit: "UNDEFINED_UINT_TYPE",
      startDate: "startDate_example",
      startNumber: 1,
      startUnit: "UNDEFINED_UINT_TYPE",
      type: "UNDEFINED_DATE_RANGE_TYPE",
    },
    defaultChartExpanded: true,
    excludeGroupId: "excludeGroupId_example",
    facetSelectedHeader: {
      aggregationType: "UNDEFINED_AGG_TYPE",
      fieldName: {
        customizedValue: "customizedValue_example",
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      groupTypeId: 1,
      headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
      headerDescription: {
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      headerId: "headerId_example",
      headerName: "headerName_example",
      headerType: "UNDEFINED_TYPE",
      headerTypeLength: 1,
      literal: {
        customizedValue: "customizedValue_example",
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
      orderBy: "UNDEFINED_ORDER_BY",
      orderBySeq: 1,
      schemaName: "schemaName_example",
      sequence: 1,
      tableName: "tableName_example",
    },
    filterForJobId: "filterForJobId_example",
    jobType: "UNDEFINED_JOB_TYPE",
    modelTypes: [
      "UNDEFINED_MODEL_TYPE",
    ],
    reportId: "reportId_example",
    sqlType: "UNDEFINED_SQL_TYPE",
    tableJoinOptimization: true,
  },
};

apiInstance.reportsServiceGetQueryByReportID(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3GetQueryByReportIDRequest** | **Reportsv3GetQueryByReportIDRequest**|  |


### Return type

**Reportsv3GetReportQueryResponse**

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

# **reportsServiceGetReportDefinition**
> Reportsv3GetReportDefinitionResponse reportsServiceGetReportDefinition()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportDefinitionRequest = {
  // string | Unique Report ID.
  reportId: "report_id_example",
};

apiInstance.reportsServiceGetReportDefinition(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | [**string**] | Unique Report ID. | defaults to undefined


### Return type

**Reportsv3GetReportDefinitionResponse**

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

# **reportsServiceGetReportGroups**
> Reportsv3GetReportGroupsResponse reportsServiceGetReportGroups()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportGroupsRequest = {
  // Array<string> | List of group IDs that should be checked for usage in each report. (optional)
  groups: [
    "groups_example",
  ],
};

apiInstance.reportsServiceGetReportGroups(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groups** | **Array&lt;string&gt;** | List of group IDs that should be checked for usage in each report. | (optional) defaults to undefined


### Return type

**Reportsv3GetReportGroupsResponse**

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

# **reportsServiceGetReportSynopsis**
> Reportsv3GetReportSynopsisResponse reportsServiceGetReportSynopsis()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportSynopsisRequest = {
  // string | Unique Report ID.
  reportId: "report_id_example",
};

apiInstance.reportsServiceGetReportSynopsis(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | [**string**] | Unique Report ID. | defaults to undefined


### Return type

**Reportsv3GetReportSynopsisResponse**

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

# **reportsServiceGetReportTimestampHeader**
> Reportsv3GetReportTimestampHeaderResponse reportsServiceGetReportTimestampHeader()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportTimestampHeaderRequest = {
  // string | Category ID parameter. (optional)
  categoryId: "category_id_example",
  // Array<string> | List of all header tables. (optional)
  tableNames: [
    "table_names_example",
  ],
};

apiInstance.reportsServiceGetReportTimestampHeader(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | [**string**] | Category ID parameter. | (optional) defaults to undefined
 **tableNames** | **Array&lt;string&gt;** | List of all header tables. | (optional) defaults to undefined


### Return type

**Reportsv3GetReportTimestampHeaderResponse**

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

# **reportsServiceGetReports**
> Reportsv3GetReportsResponse reportsServiceGetReports()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportsRequest = {
  // string | Optional Category ID parameter. (optional)
  categoryId: "category_id_example",
  // string | Optional table name parameter. (optional)
  tableName: "table_name_example",
};

apiInstance.reportsServiceGetReports(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | [**string**] | Optional Category ID parameter. | (optional) defaults to undefined
 **tableName** | [**string**] | Optional table name parameter. | (optional) defaults to undefined


### Return type

**Reportsv3GetReportsResponse**

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

# **reportsServiceGetReportsForJoin**
> Reportsv3GetReportsForJoinResponse reportsServiceGetReportsForJoin()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetReportsForJoinRequest = {
  // string
  joinId: "join_id_example",
};

apiInstance.reportsServiceGetReportsForJoin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **joinId** | [**string**] |  | defaults to undefined


### Return type

**Reportsv3GetReportsForJoinResponse**

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

# **reportsServiceGetReportsTags**
> Reportsv3GetReportsTagsResponse reportsServiceGetReportsTags()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetReportsTags(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetReportsTagsResponse**

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

# **reportsServiceGetVariant**
> Reportsv3GetVariantResponse reportsServiceGetVariant()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceGetVariantRequest = {
  // string | The variant id
  variantId: "variant_id_example",
};

apiInstance.reportsServiceGetVariant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **variantId** | [**string**] | The variant id | defaults to undefined


### Return type

**Reportsv3GetVariantResponse**

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

# **reportsServiceGetVariants**
> Reportsv3GetVariantsResponse reportsServiceGetVariants()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:any = {};

apiInstance.reportsServiceGetVariants(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Reportsv3GetVariantsResponse**

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

# **reportsServicePartialChartUpdate**
> Reportsv3PartialChartUpdateResponse reportsServicePartialChartUpdate(reportsv3PartialChartUpdateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServicePartialChartUpdateRequest = {
  // string | Unique chart ID.
  chartId: "chart_id_example",
  // Reportsv3PartialChartUpdateRequest
  reportsv3PartialChartUpdateRequest: {
    chartId: "chartId_example",
    chartTitle: "chartTitle_example",
    chartType: "UNDEFINED_CHART_TYPE",
    updateMask: {
      paths: [
        "paths_example",
      ],
    },
  },
};

apiInstance.reportsServicePartialChartUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3PartialChartUpdateRequest** | **Reportsv3PartialChartUpdateRequest**|  |
 **chartId** | [**string**] | Unique chart ID. | defaults to undefined


### Return type

**Reportsv3PartialChartUpdateResponse**

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

# **reportsServicePartialReportUpdate**
> Reportsv3PartialReportUpdateResponse reportsServicePartialReportUpdate(reportsv3PartialReportUpdateRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServicePartialReportUpdateRequest = {
  // string | Unique Report ID.
  reportId: "report_id_example",
  // Reportsv3PartialReportUpdateRequest
  reportsv3PartialReportUpdateRequest: {
    defaultChartExpanded: true,
    isHidden: true,
    isPinned: true,
    reportDescription: "reportDescription_example",
    reportId: "reportId_example",
    reportName: "reportName_example",
    reportTags: [
      {
        nlsKey: "nlsKey_example",
        nlsValue: "nlsValue_example",
      },
    ],
    updateMask: {
      paths: [
        "paths_example",
      ],
    },
  },
};

apiInstance.reportsServicePartialReportUpdate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3PartialReportUpdateRequest** | **Reportsv3PartialReportUpdateRequest**|  |
 **reportId** | [**string**] | Unique Report ID. | defaults to undefined


### Return type

**Reportsv3PartialReportUpdateResponse**

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

# **reportsServiceRunVariantOperation**
> Reportsv3RunVariantOperationResponse reportsServiceRunVariantOperation(reportsv3RunVariantOperationRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceRunVariantOperationRequest = {
  // Reportsv3RunVariantOperationRequest
  reportsv3RunVariantOperationRequest: {
    input: "input_example",
    rules: [
      {
        actionIfType: "UNDEFINED_VARIANT_ACTION_IF",
        delimiter: "delimiter_example",
        extractValue: "extractValue_example",
        matcher: "matcher_example",
        type: "UNDEFINED_VARIANT_RULE_TYPE",
      },
    ],
    variantId: "variantId_example",
  },
};

apiInstance.reportsServiceRunVariantOperation(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3RunVariantOperationRequest** | **Reportsv3RunVariantOperationRequest**|  |


### Return type

**Reportsv3RunVariantOperationResponse**

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

# **reportsServiceTranspose**
> Reportsv3RunReportResponse reportsServiceTranspose(reportsv3TransposeRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceTransposeRequest = {
  // Reportsv3TransposeRequest
  reportsv3TransposeRequest: {
    constructIds: [
      "constructIds_example",
    ],
    contributionIndicators: "contributionIndicators_example",
    contributionPointers: [
      {
        column: "column_example",
        operator: "operator_example",
        value: "value_example",
      },
    ],
    limit: "limit_example",
    offset: "offset_example",
    summary: true,
  },
};

apiInstance.reportsServiceTranspose(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3TransposeRequest** | **Reportsv3TransposeRequest**|  |


### Return type

**Reportsv3RunReportResponse**

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

# **reportsServiceUpdateChart**
> Reportsv3UpdateChartResponse reportsServiceUpdateChart(reportsv3UpdateChartRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateChartRequest = {
  // string | Unique chart ID.
  chartId: "chart_id_example",
  // Reportsv3UpdateChartRequest
  reportsv3UpdateChartRequest: {
    chartId: "chartId_example",
    chartSettings: {
      chartId: "chartId_example",
      chartTitle: "chartTitle_example",
      chartType: "UNDEFINED_CHART_TYPE",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      datasetHeaderId: "datasetHeaderId_example",
      datasetMaxValues: 1,
      defaultChartExpanded: true,
      isDefaultChart: true,
      isPredefined: true,
      refreshRate: 1,
      reportId: "reportId_example",
      xaxisHeaderId: "xaxisHeaderId_example",
      xaxisMaxValues: 1,
      yaxisHeaderId: "yaxisHeaderId_example",
    },
  },
};

apiInstance.reportsServiceUpdateChart(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateChartRequest** | **Reportsv3UpdateChartRequest**|  |
 **chartId** | [**string**] | Unique chart ID. | defaults to undefined


### Return type

**Reportsv3UpdateChartResponse**

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

# **reportsServiceUpdateChartv2**
> Reportsv3UpdateChartv2Response reportsServiceUpdateChartv2(reportsv3UpdateChartv2Request)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateChartv2Request = {
  // string | Unique chart ID.
  chartId: "chart_id_example",
  // Reportsv3UpdateChartv2Request
  reportsv3UpdateChartv2Request: {
    chartId: "chartId_example",
    chartSettingsV2: {
      categorySequenceNumbers: [
        1,
      ],
      chartId: "chartId_example",
      chartTitle: "chartTitle_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      defaultChartExpanded: true,
      isDefaultChart: true,
      isPredefined: true,
      measureSequenceNumbers: [
        1,
      ],
      refreshRate: 1,
      reportId: "reportId_example",
      vegaDefinition: "vegaDefinition_example",
    },
    primaryCategory: 1,
    primaryMeasure: 1,
    secondaryCategory: 1,
    secondaryMeasure: 1,
    tertiaryCategory: 1,
    tertiaryMeasure: 1,
    vegaDefinition: "vegaDefinition_example",
  },
};

apiInstance.reportsServiceUpdateChartv2(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateChartv2Request** | **Reportsv3UpdateChartv2Request**|  |
 **chartId** | [**string**] | Unique chart ID. | defaults to undefined


### Return type

**Reportsv3UpdateChartv2Response**

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

# **reportsServiceUpdateJoin**
> Reportsv3UpdateJoinResponse reportsServiceUpdateJoin(reportsv3UpdateJoinRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateJoinRequest = {
  // string | Unique join ID.
  joinId: "join_id_example",
  // Reportsv3UpdateJoinRequest
  reportsv3UpdateJoinRequest: {
    joinDef: {
      categoryId: "categoryId_example",
      headerPairList: [
        {
          sourceHeaderId: "sourceHeaderId_example",
          targetHeaderId: "targetHeaderId_example",
        },
      ],
      sourceTableName: "sourceTableName_example",
      targetHeadersSelectedIds: [
        "targetHeadersSelectedIds_example",
      ],
      targetTableName: "targetTableName_example",
    },
    joinId: "joinId_example",
  },
};

apiInstance.reportsServiceUpdateJoin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateJoinRequest** | **Reportsv3UpdateJoinRequest**|  |
 **joinId** | [**string**] | Unique join ID. | defaults to undefined


### Return type

**Reportsv3UpdateJoinResponse**

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

# **reportsServiceUpdateReport**
> Reportsv3UpdateReportResponse reportsServiceUpdateReport(reportsv3UpdateReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateReportRequest = {
  // string | Unique Report ID.
  reportId: "report_id_example",
  // Reportsv3UpdateReportRequest
  reportsv3UpdateReportRequest: {
    chartSettings: {
      chartId: "chartId_example",
      chartTitle: "chartTitle_example",
      chartType: "UNDEFINED_CHART_TYPE",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      datasetHeaderId: "datasetHeaderId_example",
      datasetMaxValues: 1,
      defaultChartExpanded: true,
      isDefaultChart: true,
      isPredefined: true,
      refreshRate: 1,
      reportId: "reportId_example",
      xaxisHeaderId: "xaxisHeaderId_example",
      xaxisMaxValues: 1,
      yaxisHeaderId: "yaxisHeaderId_example",
    },
    reportDefinition: {
      categoryId: "categoryId_example",
      creationTime: new Date('1970-01-01T00:00:00.00Z'),
      creatorUserId: "creatorUserId_example",
      dateRange: {
        endDate: "endDate_example",
        endNumber: 1,
        endUnit: "UNDEFINED_UINT_TYPE",
        startDate: "startDate_example",
        startNumber: 1,
        startUnit: "UNDEFINED_UINT_TYPE",
        type: "UNDEFINED_DATE_RANGE_TYPE",
      },
      defaultTimestampHeaderId: "defaultTimestampHeaderId_example",
      isAuditable: true,
      isHidden: true,
      isPinned: true,
      isPredefined: true,
      refreshRate: 1,
      reportDescription: "reportDescription_example",
      reportFilters: {
        bracketsId: 1,
        filterName: "filterName_example",
        filtersArray: [
          {
            brackets: ,
            condition: {
              caseInsensitive: true,
              fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
              filterId: 1,
              headerId: "headerId_example",
              headerName: "headerName_example",
              headerType: "UNDEFINED_TYPE",
              inReportDateRange: {
                endDate: "endDate_example",
                endNumber: 1,
                endUnit: "UNDEFINED_UINT_TYPE",
                startDate: "startDate_example",
                startNumber: 1,
                startUnit: "UNDEFINED_UINT_TYPE",
                type: "UNDEFINED_DATE_RANGE_TYPE",
              },
              inReportFieldNlsKey: "inReportFieldNlsKey_example",
              inReportHeaderId: "inReportHeaderId_example",
              inReportHeaderName: "inReportHeaderName_example",
              inReportId: "inReportId_example",
              inReportName: "inReportName_example",
              inReportTableName: "inReportTableName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              parameterType: "UNDEFINED_PARAM_TYPE",
              schemaName: "schemaName_example",
              sequence: 1,
              tableName: "tableName_example",
              values: [
                "values_example",
              ],
            },
          },
        ],
        havingArray: [
          {
            condition: {
              aggregationType: "UNDEFINED_AGG_TYPE",
              headerId: "headerId_example",
              headerName: "headerName_example",
              operatorType: "UNDEFINED_OPERATOR_TYPE",
              tableName: "tableName_example",
              value: "value_example",
            },
          },
        ],
        isCustom: true,
        optionType: "UNDEFINED_OPTION_TYPE",
        sequence: 1,
      },
      reportHeaders: [
        {
          aggregationType: "UNDEFINED_AGG_TYPE",
          fieldName: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          groupTypeId: 1,
          headerDataType: "UNDEFINED_REPORT_HEADER_TYPE",
          headerDescription: {
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          headerId: "headerId_example",
          headerName: "headerName_example",
          headerType: "UNDEFINED_TYPE",
          headerTypeLength: 1,
          literal: {
            customizedValue: "customizedValue_example",
            nlsKey: "nlsKey_example",
            nlsValue: "nlsValue_example",
          },
          orderBy: "UNDEFINED_ORDER_BY",
          orderBySeq: 1,
          schemaName: "schemaName_example",
          sequence: 1,
          tableName: "tableName_example",
        },
      ],
      reportId: "reportId_example",
      reportName: "reportName_example",
      reportTags: [
        {
          nlsKey: "nlsKey_example",
          nlsValue: "nlsValue_example",
        },
      ],
      runtimeParameters: [
        {
          key: "key_example",
          label: "label_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          runtimeParameterType: "UNDEFINED_TYPE",
          runtimeParameterTypeLength: 1,
          value: "value_example",
        },
      ],
      selectedTimestampHeaderId: "selectedTimestampHeaderId_example",
      shouldAddCount: true,
      shouldAddDistinct: true,
      sqlLastVersion: "sqlLastVersion_example",
      tableJoinOptimization: "tableJoinOptimization_example",
      usePipelineQueries: "usePipelineQueries_example",
    },
    reportId: "reportId_example",
  },
};

apiInstance.reportsServiceUpdateReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateReportRequest** | **Reportsv3UpdateReportRequest**|  |
 **reportId** | [**string**] | Unique Report ID. | defaults to undefined


### Return type

**Reportsv3UpdateReportResponse**

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

# **reportsServiceUpdateVariantOverride**
> Reportsv3UpdateVariantOverrideResponse reportsServiceUpdateVariantOverride(reportsv3UpdateVariantOverrideRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ReportsServiceApi(configuration);

let body:.ReportsServiceApiReportsServiceUpdateVariantOverrideRequest = {
  // string | The variant id
  variantId: "variant_id_example",
  // Reportsv3UpdateVariantOverrideRequest
  reportsv3UpdateVariantOverrideRequest: {
    key: "key_example",
    values: {
      "key": "key_example",
    },
    variantId: "variantId_example",
  },
};

apiInstance.reportsServiceUpdateVariantOverride(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsv3UpdateVariantOverrideRequest** | **Reportsv3UpdateVariantOverrideRequest**|  |
 **variantId** | [**string**] | The variant id | defaults to undefined


### Return type

**Reportsv3UpdateVariantOverrideResponse**

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





# .RiskAnalyticsControllerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskAnalyticsControllerEnableDisableRiskEventFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerEnableDisableRiskEventFeedback) | **PUT** /api/v3/risk_feedback/status | Summary: Enable disable risk rvent feedback Description: Enable or disable the collect feedback process.
[**riskAnalyticsControllerEnableDisableRiskEventProcess**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerEnableDisableRiskEventProcess) | **PUT** /api/v3/risk_process/status | Summary: Enable disable risk event process Description: Enable or disable the risk event process.
[**riskAnalyticsControllerGetAllClassificationsList**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetAllClassificationsList) | **GET** /api/v3/risk_events/classifications | Summary: Get all classifications Description: Get all possible classifications for a risk event.
[**riskAnalyticsControllerGetRiskEventClassificationsList**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventClassificationsList) | **GET** /api/v3/risk_events/feedback/{risk_id} | Summary: Get risk event classifications list Description: retrieves the ClassificationMatchDetails for a given risk id – classification that did not matched will be with class_value 0.
[**riskAnalyticsControllerGetRiskEventDataForSummarization**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventDataForSummarization) | **GET** /api/v3/risk_events/summarization/data/{risk_id} | Summary: Get risk event data needed for summarization task Description: Retrieve the full information about this risk event including all findings data
[**riskAnalyticsControllerGetRiskEventDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventDetails) | **GET** /api/v3/risk_events/details/{risk_id} | Summary: Get risk event details Description: Return the details of a risk event, including risk general info and a list of observations.
[**riskAnalyticsControllerGetRiskEventProcessStatus**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventProcessStatus) | **GET** /api/v3/risk_process/status | Summary: Get risk event process status Description: Get the risk event process status.
[**riskAnalyticsControllerGetRiskEventRow**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventRow) | **GET** /api/v3/risk_events | Summary: Get risk event row Description: Return a list of risk events.
[**riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails) | **PUT** /api/v3/risk_events/va/{risk_id} | Summary: Get vulnerability assessment details for a given risk event Description: Retrieve the information about failed VA tests for assets database and db user
[**riskAnalyticsControllerGetRiskFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskFeedback) | **GET** /api/v3/risk_events/feedback | Summary: Get risk feedback Description: Get all feedbacks that are in status NEW/WIP and change them to status WIP.
[**riskAnalyticsControllerGetRiskObservationDetails**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetRiskObservationDetails) | **GET** /api/v3/risk_events/observations | Summary: Get risk observation details Description: Return details of a single risk observation.
[**riskAnalyticsControllerGetUserUISettings**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerGetUserUISettings) | **GET** /api/v3/risk_events/user_ui_settings | Summary: Get user UI settings Description: Get the user settings by user id to display the risk in the UI.
[**riskAnalyticsControllerRiskEventTuning**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerRiskEventTuning) | **PUT** /api/v3/risk_events/tuning | Summary: Risk event tuning Description: Perform tuning risk event actions.
[**riskAnalyticsControllerSetRiskEventStatus**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerSetRiskEventStatus) | **PUT** /api/v3/risk_events/status | Summary: Set risk event status Description: Update the risk status and justification.
[**riskAnalyticsControllerSetUserUISettings**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerSetUserUISettings) | **PUT** /api/v3/risk_events/user_ui_settings | Summary: Set user UI settings Description: Set the user settings by user id in the mongo collection. WARNING: this API should not be used manually or by a system external to Guardium. Using this API to change a user settings may prevent the user from using the Risk Event function within Guardium.
[**riskAnalyticsControllerUpdateRiskFeedback**](RiskAnalyticsControllerApi.md#riskAnalyticsControllerUpdateRiskFeedback) | **PUT** /api/v3/risk_events/feedback | Summary: Update risk feedback Description: Provide feedback for one or more risk events


# **riskAnalyticsControllerEnableDisableRiskEventFeedback**
> Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse riskAnalyticsControllerEnableDisableRiskEventFeedback(riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerEnableDisableRiskEventFeedbackRequest = {
  // Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest
  riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest: {
    action: "UNDEFINED_ACTION_TYPE",
  },
};

apiInstance.riskAnalyticsControllerEnableDisableRiskEventFeedback(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest** | **Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackRequest**|  |


### Return type

**Riskanalyticscontrollerv3EnableDisableRiskEventFeedbackResponse**

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

# **riskAnalyticsControllerEnableDisableRiskEventProcess**
> Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse riskAnalyticsControllerEnableDisableRiskEventProcess(riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerEnableDisableRiskEventProcessRequest = {
  // Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest
  riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest: {
    action: "UNDEFINED_ACTION_TYPE",
  },
};

apiInstance.riskAnalyticsControllerEnableDisableRiskEventProcess(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest** | **Riskanalyticscontrollerv3EnableDisableRiskEventProcessRequest**|  |


### Return type

**Riskanalyticscontrollerv3EnableDisableRiskEventProcessResponse**

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

# **riskAnalyticsControllerGetAllClassificationsList**
> Riskanalyticscontrollerv3GetAllClassificationsListResponse riskAnalyticsControllerGetAllClassificationsList()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsControllerGetAllClassificationsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticscontrollerv3GetAllClassificationsListResponse**

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

# **riskAnalyticsControllerGetRiskEventClassificationsList**
> Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse riskAnalyticsControllerGetRiskEventClassificationsList()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventClassificationsListRequest = {
  // number | Risk id
  riskId: 1,
};

apiInstance.riskAnalyticsControllerGetRiskEventClassificationsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk id | defaults to undefined


### Return type

**Riskanalyticscontrollerv3GetRiskEventClassificationsListResponse**

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

# **riskAnalyticsControllerGetRiskEventDataForSummarization**
> Riskanalyticscontrollerv3RiskEventSummarizationDataResponse riskAnalyticsControllerGetRiskEventDataForSummarization()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDataForSummarizationRequest = {
  // number | Risk ID
  riskId: 1,
  // boolean | Indicates whether to include indicators in the response or not. (optional)
  includeIndicators: true,
  // number | Max number of hours to get for the risk. (optional)
  numFindingsLimit: 1,
};

apiInstance.riskAnalyticsControllerGetRiskEventDataForSummarization(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk ID | defaults to undefined
 **includeIndicators** | [**boolean**] | Indicates whether to include indicators in the response or not. | (optional) defaults to undefined
 **numFindingsLimit** | [**number**] | Max number of hours to get for the risk. | (optional) defaults to undefined


### Return type

**Riskanalyticscontrollerv3RiskEventSummarizationDataResponse**

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

# **riskAnalyticsControllerGetRiskEventDetails**
> Riskanalyticscontrollerv3GetRiskEventDetailsResponse riskAnalyticsControllerGetRiskEventDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventDetailsRequest = {
  // number | Risk id.
  riskId: 1,
};

apiInstance.riskAnalyticsControllerGetRiskEventDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk id. | defaults to undefined


### Return type

**Riskanalyticscontrollerv3GetRiskEventDetailsResponse**

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

# **riskAnalyticsControllerGetRiskEventProcessStatus**
> Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse riskAnalyticsControllerGetRiskEventProcessStatus()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsControllerGetRiskEventProcessStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse**

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

# **riskAnalyticsControllerGetRiskEventRow**
> Riskanalyticscontrollerv3GetRiskEventRowResponse riskAnalyticsControllerGetRiskEventRow()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventRowRequest = {
  // 'UNDEFINED_STATUS' | 'OPENED' | 'CLOSED' | 'DELEGATED' | 'FOLLOWUP' | Status to retrieve only the status events, blank to retrieve all. (optional)
  status: "UNDEFINED_STATUS",
  // Date | The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. (optional)
  dateFrom: new Date('1970-01-01T00:00:00.00Z'),
  // Date | The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. (optional)
  dateTo: new Date('1970-01-01T00:00:00.00Z'),
  // 'UNDEFINED_PIVOT_TYPE' | 'DATABASE' | 'DB_USER' | 'OS_USER' | 'GLOBAL' | Pivot type - enum. (optional)
  pivotType: "UNDEFINED_PIVOT_TYPE",
  // string | Pivot id -  all pivot fields separated by semicolon. (optional)
  pivotId: "pivot.id_example",
  // string | Optional db_user - if pivot is db user. (optional)
  pivotDbUser: "pivot.db_user_example",
  // string | Optional database - if pivot is db user / database. (optional)
  pivotDatabase: "pivot.database_example",
  // string | Optional server_ip - if pivot is db user / database. (optional)
  pivotServerIp: "pivot.server_ip_example",
  // string | Optional os_user - if pivot is os user. (optional)
  pivotOsUser: "pivot.os_user_example",
  // 'UNDEFINED' | 'DATABASE_NAME' | 'SERVICE_NAME' | Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. (optional)
  pivotDatabaseSourceField: "UNDEFINED",
};

apiInstance.riskAnalyticsControllerGetRiskEventRow(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **status** | [**&#39;UNDEFINED_STATUS&#39; | &#39;OPENED&#39; | &#39;CLOSED&#39; | &#39;DELEGATED&#39; | &#39;FOLLOWUP&#39;**]**Array<&#39;UNDEFINED_STATUS&#39; &#124; &#39;OPENED&#39; &#124; &#39;CLOSED&#39; &#124; &#39;DELEGATED&#39; &#124; &#39;FOLLOWUP&#39;>** | Status to retrieve only the status events, blank to retrieve all. | (optional) defaults to 'UNDEFINED_STATUS'
 **dateFrom** | [**Date**] | The API retrieves risk events that were open in a time range. date_from defines the start of this time range. format YYYY-MM-DDTHH:mm:ssZ. | (optional) defaults to undefined
 **dateTo** | [**Date**] | The API retrieves risk events that were open in a time range. date_to defines the end of this time range. format YYYY-MM-DDTHH:mm:ssZ. | (optional) defaults to undefined
 **pivotType** | [**&#39;UNDEFINED_PIVOT_TYPE&#39; | &#39;DATABASE&#39; | &#39;DB_USER&#39; | &#39;OS_USER&#39; | &#39;GLOBAL&#39;**]**Array<&#39;UNDEFINED_PIVOT_TYPE&#39; &#124; &#39;DATABASE&#39; &#124; &#39;DB_USER&#39; &#124; &#39;OS_USER&#39; &#124; &#39;GLOBAL&#39;>** | Pivot type - enum. | (optional) defaults to 'UNDEFINED_PIVOT_TYPE'
 **pivotId** | [**string**] | Pivot id -  all pivot fields separated by semicolon. | (optional) defaults to undefined
 **pivotDbUser** | [**string**] | Optional db_user - if pivot is db user. | (optional) defaults to undefined
 **pivotDatabase** | [**string**] | Optional database - if pivot is db user / database. | (optional) defaults to undefined
 **pivotServerIp** | [**string**] | Optional server_ip - if pivot is db user / database. | (optional) defaults to undefined
 **pivotOsUser** | [**string**] | Optional os_user - if pivot is os user. | (optional) defaults to undefined
 **pivotDatabaseSourceField** | [**&#39;UNDEFINED&#39; | &#39;DATABASE_NAME&#39; | &#39;SERVICE_NAME&#39;**]**Array<&#39;UNDEFINED&#39; &#124; &#39;DATABASE_NAME&#39; &#124; &#39;SERVICE_NAME&#39;>** | Optional database_source_field (values database name/service name depends on the server type) - if pivot is db user / database. | (optional) defaults to 'UNDEFINED'


### Return type

**Riskanalyticscontrollerv3GetRiskEventRowResponse**

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

# **riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails**
> Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetailsRequest = {
  // number | Risk ID
  riskId: 1,
};

apiInstance.riskAnalyticsControllerGetRiskEventVulnerabilityAssessmentDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk ID | defaults to undefined


### Return type

**Riskanalyticscontrollerv3RiskEventVulnerabilityAssessmentDetailsResponse**

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

# **riskAnalyticsControllerGetRiskFeedback**
> Riskanalyticscontrollerv3GetRiskFeedbackResponse riskAnalyticsControllerGetRiskFeedback()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsControllerGetRiskFeedback(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticscontrollerv3GetRiskFeedbackResponse**

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

# **riskAnalyticsControllerGetRiskObservationDetails**
> Riskanalyticscontrollerv3GetRiskObservationDetailsResponse riskAnalyticsControllerGetRiskObservationDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerGetRiskObservationDetailsRequest = {
  // number | Lead feature id. (optional)
  leadFeatureId: 1,
  // 'UNDEFINED_OBSERVATION_TYPE' | 'ACTIVITY' | 'EXCEPTION' | 'VIOLATION' | 'OUTLIER' | 'ANOMALY' | Observation type. (optional)
  observationType: "UNDEFINED_OBSERVATION_TYPE",
};

apiInstance.riskAnalyticsControllerGetRiskObservationDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadFeatureId** | [**number**] | Lead feature id. | (optional) defaults to undefined
 **observationType** | [**&#39;UNDEFINED_OBSERVATION_TYPE&#39; | &#39;ACTIVITY&#39; | &#39;EXCEPTION&#39; | &#39;VIOLATION&#39; | &#39;OUTLIER&#39; | &#39;ANOMALY&#39;**]**Array<&#39;UNDEFINED_OBSERVATION_TYPE&#39; &#124; &#39;ACTIVITY&#39; &#124; &#39;EXCEPTION&#39; &#124; &#39;VIOLATION&#39; &#124; &#39;OUTLIER&#39; &#124; &#39;ANOMALY&#39;>** | Observation type. | (optional) defaults to 'UNDEFINED_OBSERVATION_TYPE'


### Return type

**Riskanalyticscontrollerv3GetRiskObservationDetailsResponse**

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

# **riskAnalyticsControllerGetUserUISettings**
> Riskanalyticscontrollerv3GetUserUISettingsResponse riskAnalyticsControllerGetUserUISettings()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsControllerGetUserUISettings(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticscontrollerv3GetUserUISettingsResponse**

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

# **riskAnalyticsControllerRiskEventTuning**
> Riskanalyticscontrollerv3RiskEventTuningResponse riskAnalyticsControllerRiskEventTuning(riskanalyticscontrollerv3RiskEventTuningRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerRiskEventTuningRequest = {
  // Riskanalyticscontrollerv3RiskEventTuningRequest
  riskanalyticscontrollerv3RiskEventTuningRequest: {
    excludedItems: [
      {
        excludedItemType: "UNDEFINED_EXCLUDED_ITEM_TYPE",
        key: "key_example",
      },
    ],
  },
};

apiInstance.riskAnalyticsControllerRiskEventTuning(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3RiskEventTuningRequest** | **Riskanalyticscontrollerv3RiskEventTuningRequest**|  |


### Return type

**Riskanalyticscontrollerv3RiskEventTuningResponse**

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

# **riskAnalyticsControllerSetRiskEventStatus**
> Riskanalyticscontrollerv3SetRiskEventStatusResponse riskAnalyticsControllerSetRiskEventStatus(riskanalyticscontrollerv3SetRiskEventStatusRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerSetRiskEventStatusRequest = {
  // Riskanalyticscontrollerv3SetRiskEventStatusRequest
  riskanalyticscontrollerv3SetRiskEventStatusRequest: {
    justification: "justification_example",
    riskIds: [
      1,
    ],
    status: "UNDEFINED_STATUS",
  },
};

apiInstance.riskAnalyticsControllerSetRiskEventStatus(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3SetRiskEventStatusRequest** | **Riskanalyticscontrollerv3SetRiskEventStatusRequest**|  |


### Return type

**Riskanalyticscontrollerv3SetRiskEventStatusResponse**

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

# **riskAnalyticsControllerSetUserUISettings**
> Riskanalyticscontrollerv3SetUserUISettingsResponse riskAnalyticsControllerSetUserUISettings(riskanalyticscontrollerv3SetUserUISettingsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerSetUserUISettingsRequest = {
  // Riskanalyticscontrollerv3SetUserUISettingsRequest
  riskanalyticscontrollerv3SetUserUISettingsRequest: {
    userUiSettings: {
      cardSettings: [
        {
          filters: [
            {
              headerId: "headerId_example",
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
          orderBy: "UNDEFINED_ORDER_BY",
          sequenceOrder: 1,
          sortedBy: "sortedBy_example",
        },
      ],
      showBanner: true,
    },
  },
};

apiInstance.riskAnalyticsControllerSetUserUISettings(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3SetUserUISettingsRequest** | **Riskanalyticscontrollerv3SetUserUISettingsRequest**|  |


### Return type

**Riskanalyticscontrollerv3SetUserUISettingsResponse**

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

# **riskAnalyticsControllerUpdateRiskFeedback**
> Riskanalyticscontrollerv3UpdateRiskFeedbackResponse riskAnalyticsControllerUpdateRiskFeedback(riskanalyticscontrollerv3UpdateRiskFeedbackRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsControllerApi(configuration);

let body:.RiskAnalyticsControllerApiRiskAnalyticsControllerUpdateRiskFeedbackRequest = {
  // Riskanalyticscontrollerv3UpdateRiskFeedbackRequest
  riskanalyticscontrollerv3UpdateRiskFeedbackRequest: {
    comment: "comment_example",
    feedbackClassificationKey: "feedbackClassificationKey_example",
    originalClassificationKey: "originalClassificationKey_example",
    riskIds: [
      1,
    ],
  },
};

apiInstance.riskAnalyticsControllerUpdateRiskFeedback(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticscontrollerv3UpdateRiskFeedbackRequest** | **Riskanalyticscontrollerv3UpdateRiskFeedbackRequest**|  |


### Return type

**Riskanalyticscontrollerv3UpdateRiskFeedbackResponse**

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





# .RiskAnalyticsDataProcessorApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskAnalyticsDataProcessorGetRiskContext**](RiskAnalyticsDataProcessorApi.md#riskAnalyticsDataProcessorGetRiskContext) | **GET** /api/v3/risk_events/context/{risk_id} | Summary: Get Risk Event Context Description: Retrieve the context of the given risk ID. This context will be used for LLM interactions.
[**riskAnalyticsDataProcessorGetRiskPredefinedQuestions**](RiskAnalyticsDataProcessorApi.md#riskAnalyticsDataProcessorGetRiskPredefinedQuestions) | **GET** /api/v3/risk_events/{risk_id}/questions | Summary: Get Risk Event Predefined Questions Description: Retrieve the Predefined Questions of the given risk ID. This Predefined Questions will be used quick actions recommendations.


# **riskAnalyticsDataProcessorGetRiskContext**
> Riskanalyticsdataprocessorv3GetRiskContextResponse riskAnalyticsDataProcessorGetRiskContext()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsDataProcessorApi(configuration);

let body:.RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskContextRequest = {
  // number | Risk id.
  riskId: 1,
  // string | Timezone in IANA format. (optional)
  timezone: "timezone_example",
};

apiInstance.riskAnalyticsDataProcessorGetRiskContext(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk id. | defaults to undefined
 **timezone** | [**string**] | Timezone in IANA format. | (optional) defaults to undefined


### Return type

**Riskanalyticsdataprocessorv3GetRiskContextResponse**

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

# **riskAnalyticsDataProcessorGetRiskPredefinedQuestions**
> Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse riskAnalyticsDataProcessorGetRiskPredefinedQuestions()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsDataProcessorApi(configuration);

let body:.RiskAnalyticsDataProcessorApiRiskAnalyticsDataProcessorGetRiskPredefinedQuestionsRequest = {
  // number | Risk id.
  riskId: 1,
};

apiInstance.riskAnalyticsDataProcessorGetRiskPredefinedQuestions(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskId** | [**number**] | Risk id. | defaults to undefined


### Return type

**Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse**

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





# .RiskAnalyticsEngineApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskAnalyticsEngineGetLeadGeneratorConfig**](RiskAnalyticsEngineApi.md#riskAnalyticsEngineGetLeadGeneratorConfig) | **GET** /api/v3/risk/lead_generator | Summary: Get lead generator config Description: Retrieve the configuration of a lead generator.
[**riskAnalyticsEngineUpdateLeadGeneratorConfig**](RiskAnalyticsEngineApi.md#riskAnalyticsEngineUpdateLeadGeneratorConfig) | **PUT** /api/v3/risk/lead_generator | Summary: Update lead generator config Description: Update the configuration of a leads generator.


# **riskAnalyticsEngineGetLeadGeneratorConfig**
> Riskanalyticsenginev3GetLeadGeneratorConfigResponse riskAnalyticsEngineGetLeadGeneratorConfig()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsEngineApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsEngineGetLeadGeneratorConfig(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticsenginev3GetLeadGeneratorConfigResponse**

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

# **riskAnalyticsEngineUpdateLeadGeneratorConfig**
> Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse riskAnalyticsEngineUpdateLeadGeneratorConfig(riskanalyticsenginev3UpdateLeadGeneratorConfigRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsEngineApi(configuration);

let body:.RiskAnalyticsEngineApiRiskAnalyticsEngineUpdateLeadGeneratorConfigRequest = {
  // Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest
  riskanalyticsenginev3UpdateLeadGeneratorConfigRequest: {
    config: {
      isActive: true,
      leadGeneratorName: "leadGeneratorName_example",
      leadGeneratorParams: [
        {
          name: "name_example",
          value: "value_example",
        },
      ],
    },
  },
};

apiInstance.riskAnalyticsEngineUpdateLeadGeneratorConfig(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **riskanalyticsenginev3UpdateLeadGeneratorConfigRequest** | **Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest**|  |


### Return type

**Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse**

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





# .RiskAnalyticsMlClassificationApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**riskAnalyticsMlClassificationResetModelToDefaults**](RiskAnalyticsMlClassificationApi.md#riskAnalyticsMlClassificationResetModelToDefaults) | **POST** /api/v3/classification/ml/models/reset | Summary: Reset the model to its default weights. Description: Load the initial model instead of the existing model - this action is irreversible.


# **riskAnalyticsMlClassificationResetModelToDefaults**
> Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse riskAnalyticsMlClassificationResetModelToDefaults()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .RiskAnalyticsMlClassificationApi(configuration);

let body:any = {};

apiInstance.riskAnalyticsMlClassificationResetModelToDefaults(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Riskanalyticsmlclassificationv3ResetModelToDefaultsResponse**

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





# .SchedulerServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulerServiceCreateScheduledJob**](SchedulerServiceApi.md#schedulerServiceCreateScheduledJob) | **POST** /api/v3/schedules | Summary: Create scheduled job Description: Create a new scheduled job with tasks.
[**schedulerServiceDeleteScheduledJob**](SchedulerServiceApi.md#schedulerServiceDeleteScheduledJob) | **DELETE** /api/v3/schedules/{schedule_id} | Summary: Delete scheduled job Description: Delete a single scheduled job.
[**schedulerServiceGetDependencies**](SchedulerServiceApi.md#schedulerServiceGetDependencies) | **GET** /api/v3/schedules/dependencies | Summary: Get dependencies Description: returns IDs of distribution rules, response templates, or processing rules that are in use
[**schedulerServiceGetDistributionRules**](SchedulerServiceApi.md#schedulerServiceGetDistributionRules) | **GET** /api/v3/schedules/distribution_rules | Summary: Get distribution rules Description: Return a list of distribution rule IDs that are used by the scheduler Distribution rules can\&#39;t be edited if it is used by a scheduled job.
[**schedulerServiceGetScheduledJobDetails**](SchedulerServiceApi.md#schedulerServiceGetScheduledJobDetails) | **GET** /api/v3/schedules/{schedule_id}/details | Summary: Get scheduled job Description: Return a single ScheduledJob in detail.
[**schedulerServiceGetScheduledJobs**](SchedulerServiceApi.md#schedulerServiceGetScheduledJobs) | **GET** /api/v3/schedules | Summary: Get scheduled jobs Description: Return a list of scheduled jobs and the linked tasks.
[**schedulerServiceGetSchedulesByReport**](SchedulerServiceApi.md#schedulerServiceGetSchedulesByReport) | **POST** /api/v3/schedules/searchByReport/{report_id} | Summary: Get schedules by report Description: Return an array of scheduled job IDs that run the report_id.  An empty array is returned if the report_id is not scheduled.
[**schedulerServiceGetTags**](SchedulerServiceApi.md#schedulerServiceGetTags) | **GET** /api/v3/schedules/tags | Summary: Get tags Description: Return an array of all the unique tags from scheduled jobs.
[**schedulerServiceSearchScheduledJobs**](SchedulerServiceApi.md#schedulerServiceSearchScheduledJobs) | **POST** /api/v3/schedules/search | Summary: Search scheduled jobs Description: Return a filtered list of scheduled jobs and the linked tasks.
[**schedulerServiceSearchScheduledTaskRuns**](SchedulerServiceApi.md#schedulerServiceSearchScheduledTaskRuns) | **POST** /api/v3/schedules/runs/search | Summary: Search scheduled task runs Description: Return a list of scheduled task run, start date, end date, status
[**schedulerServiceUpdateScheduledJob**](SchedulerServiceApi.md#schedulerServiceUpdateScheduledJob) | **PATCH** /api/v3/schedules/{schedule_id} | Summary: Update scheduled job Description: Update a single schedule job.


# **schedulerServiceCreateScheduledJob**
> Schedulerv3CreateScheduledJobResponse schedulerServiceCreateScheduledJob(schedulerv3CreateScheduledJobRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceCreateScheduledJobRequest = {
  // Schedulerv3CreateScheduledJobRequest
  schedulerv3CreateScheduledJobRequest: {
    description: "description_example",
    enabled: true,
    instructions: "instructions_example",
    internalAudit: "UNDEFINED_TYPE",
    name: "name_example",
    notification: "UNDEFINED_NOTIFICATION",
    origin: "origin_example",
    recipient: {
      integrationId: "integrationId_example",
      label: "label_example",
      templateId: "templateId_example",
      type: "UNDEFINED_RECTYPE",
      value: "value_example",
    },
    recipients: [
      {
        integrationId: "integrationId_example",
        label: "label_example",
        templateId: "templateId_example",
        type: "UNDEFINED_RECTYPE",
        value: "value_example",
      },
    ],
    retention: {
      archive: true,
      days: 1,
    },
    scheduler: {
      beginSchedule: new Date('1970-01-01T00:00:00.00Z'),
      byDayOfMonth: true,
      dayOfMonth: "dayOfMonth_example",
      dayOfWeek: [
        "UNDEFINED_DAY",
      ],
      dayOrder: "UNDEFINED_ORDER",
      dayOrderDayOfWeek: "UNDEFINED_DAY",
      endSchedule: new Date('1970-01-01T00:00:00.00Z'),
      frequency: "UNDEFINED_FREQUENCY",
      months: [
        "EVERYMONTH",
      ],
      neverEnd: true,
      repeat: 1,
      repeatBegin: {
        hour: 1,
        minute: 1,
        timezone: "timezone_example",
      },
      repeatEnd: {
        hour: 1,
        minute: 1,
        timezone: "timezone_example",
      },
      repeatMinutes: 1,
      runOnceNow: true,
    },
    tags: [
      "tags_example",
    ],
    tasks: [
      {
        auditType: "UNDEFINED_TYPE",
        deliveryMethod: {
          fileFormat: "UNDEFINED_FORMAT",
          reportTimeZone: "reportTimeZone_example",
        },
        distributionRuleIds: [
          "distributionRuleIds_example",
        ],
        emailSubject: "emailSubject_example",
        instructions: "instructions_example",
        name: "name_example",
        parameter: {
          dataImportParameter: {
            extraDetail: "extraDetail_example",
            integrationId: "integrationId_example",
            templateId: "templateId_example",
            value: "value_example",
          },
          reportParameter: {
            extraDetail: "extraDetail_example",
            reportId: "reportId_example",
            reportName: "reportName_example",
            runtimeParameters: [
              {
                key: "key_example",
                label: "label_example",
                operatorType: "UNDEFINED_OPERATOR_TYPE",
                runtimeParameterType: "UNDEFINED_TYPE",
                runtimeParameterTypeLength: 1,
                value: "value_example",
              },
            ],
            syncExecutionDate: true,
          },
        },
        recipients: [
          {
            integrationId: "integrationId_example",
            label: "label_example",
            templateId: "templateId_example",
            type: "UNDEFINED_RECTYPE",
            value: "value_example",
          },
        ],
        reportFilters: {
          bracketsId: 1,
          filterName: "filterName_example",
          filtersArray: [
            {
              brackets: ,
              condition: {
                caseInsensitive: true,
                fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
                filterId: 1,
                headerId: "headerId_example",
                headerName: "headerName_example",
                headerType: "UNDEFINED_TYPE",
                inReportDateRange: {
                  endDate: "endDate_example",
                  endNumber: 1,
                  endUnit: "UNDEFINED_UINT_TYPE",
                  startDate: "startDate_example",
                  startNumber: 1,
                  startUnit: "UNDEFINED_UINT_TYPE",
                  type: "UNDEFINED_DATE_RANGE_TYPE",
                },
                inReportFieldNlsKey: "inReportFieldNlsKey_example",
                inReportHeaderId: "inReportHeaderId_example",
                inReportHeaderName: "inReportHeaderName_example",
                inReportId: "inReportId_example",
                inReportName: "inReportName_example",
                inReportTableName: "inReportTableName_example",
                operatorType: "UNDEFINED_OPERATOR_TYPE",
                parameterType: "UNDEFINED_PARAM_TYPE",
                schemaName: "schemaName_example",
                sequence: 1,
                tableName: "tableName_example",
                values: [
                  "values_example",
                ],
              },
            },
          ],
          havingArray: [
            {
              condition: {
                aggregationType: "UNDEFINED_AGG_TYPE",
                headerId: "headerId_example",
                headerName: "headerName_example",
                operatorType: "UNDEFINED_OPERATOR_TYPE",
                tableName: "tableName_example",
                value: "value_example",
              },
            },
          ],
          isCustom: true,
          optionType: "UNDEFINED_OPTION_TYPE",
          sequence: 1,
        },
        scheduledTaskId: "scheduledTaskId_example",
        type: "UNDEFINED_JOBTYPE",
        workflowInvestigationLinks: [
          {
            display: "display_example",
            id: "id_example",
            type: "type_example",
          },
        ],
        workflowResponseTemplate: {
          display: "display_example",
          id: "id_example",
          type: "type_example",
        },
        workflowType: "REVIEW_NONE",
        workflowUniqueFields: [
          "workflowUniqueFields_example",
        ],
      },
    ],
  },
};

apiInstance.schedulerServiceCreateScheduledJob(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3CreateScheduledJobRequest** | **Schedulerv3CreateScheduledJobRequest**|  |


### Return type

**Schedulerv3CreateScheduledJobResponse**

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

# **schedulerServiceDeleteScheduledJob**
> Schedulerv3DeleteScheduledJobResponse schedulerServiceDeleteScheduledJob()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceDeleteScheduledJobRequest = {
  // string | Unique ID, required for delete.
  scheduleId: "schedule_id_example",
};

apiInstance.schedulerServiceDeleteScheduledJob(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | [**string**] | Unique ID, required for delete. | defaults to undefined


### Return type

**Schedulerv3DeleteScheduledJobResponse**

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

# **schedulerServiceGetDependencies**
> Schedulerv3GetDependenciesResponse schedulerServiceGetDependencies()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceGetDependenciesRequest = {
  // string | specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. (optional)
  configType: "config_type_example",
};

apiInstance.schedulerServiceGetDependencies(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configType** | [**string**] | specify the configuration entry type: Distribution.Rule, workflow_investigation_link, workflow_response_template, etc. | (optional) defaults to undefined


### Return type

**Schedulerv3GetDependenciesResponse**

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

# **schedulerServiceGetDistributionRules**
> Schedulerv3GetDistributionRulesResponse schedulerServiceGetDistributionRules()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:any = {};

apiInstance.schedulerServiceGetDistributionRules(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Schedulerv3GetDistributionRulesResponse**

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

# **schedulerServiceGetScheduledJobDetails**
> Schedulerv3GetScheduledJobResponse schedulerServiceGetScheduledJobDetails()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceGetScheduledJobDetailsRequest = {
  // string | Used to return a single scheduledjob.
  scheduleId: "schedule_id_example",
};

apiInstance.schedulerServiceGetScheduledJobDetails(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scheduleId** | [**string**] | Used to return a single scheduledjob. | defaults to undefined


### Return type

**Schedulerv3GetScheduledJobResponse**

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

# **schedulerServiceGetScheduledJobs**
> Schedulerv3ScheduledJobSummaryResponse schedulerServiceGetScheduledJobs()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceGetScheduledJobsRequest = {
  // number | Optional: the amount to offset the rows by for pagination. (optional)
  offset: 1,
  // number | Optional: the max amount of rows to return for pagination. (optional)
  limit: 1,
};

apiInstance.schedulerServiceGetScheduledJobs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | [**number**] | Optional: the amount to offset the rows by for pagination. | (optional) defaults to undefined
 **limit** | [**number**] | Optional: the max amount of rows to return for pagination. | (optional) defaults to undefined


### Return type

**Schedulerv3ScheduledJobSummaryResponse**

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

# **schedulerServiceGetSchedulesByReport**
> Schedulerv3GetSchedulesByReportResponse schedulerServiceGetSchedulesByReport(schedulerv3GetSchedulesByReportRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceGetSchedulesByReportRequest = {
  // string | Report ID for the scheduled report.
  reportId: "report_id_example",
  // Schedulerv3GetSchedulesByReportRequest
  schedulerv3GetSchedulesByReportRequest: {
    reportId: "reportId_example",
  },
};

apiInstance.schedulerServiceGetSchedulesByReport(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3GetSchedulesByReportRequest** | **Schedulerv3GetSchedulesByReportRequest**|  |
 **reportId** | [**string**] | Report ID for the scheduled report. | defaults to undefined


### Return type

**Schedulerv3GetSchedulesByReportResponse**

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

# **schedulerServiceGetTags**
> Schedulerv3GetTagsResponse schedulerServiceGetTags()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:any = {};

apiInstance.schedulerServiceGetTags(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Schedulerv3GetTagsResponse**

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

# **schedulerServiceSearchScheduledJobs**
> Schedulerv3ScheduledJobSummaryResponse schedulerServiceSearchScheduledJobs(schedulerv3SearchScheduledJobsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceSearchScheduledJobsRequest = {
  // Schedulerv3SearchScheduledJobsRequest
  schedulerv3SearchScheduledJobsRequest: {
    limit: 1,
    offset: 1,
    filter: {
      enabled: "enabled_example",
      endTime: new Date('1970-01-01T00:00:00.00Z'),
      ignoreAcl: true,
      nameFilter: [
        "nameFilter_example",
      ],
      startTime: new Date('1970-01-01T00:00:00.00Z'),
      statusFilter: [
        "UNDEFINED",
      ],
      tagFilter: "tagFilter_example",
    },
  },
};

apiInstance.schedulerServiceSearchScheduledJobs(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3SearchScheduledJobsRequest** | **Schedulerv3SearchScheduledJobsRequest**|  |


### Return type

**Schedulerv3ScheduledJobSummaryResponse**

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

# **schedulerServiceSearchScheduledTaskRuns**
> Schedulerv3SearchScheduledTaskRunsResponse schedulerServiceSearchScheduledTaskRuns(schedulerv3SearchScheduledTaskRunsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceSearchScheduledTaskRunsRequest = {
  // Schedulerv3SearchScheduledTaskRunsRequest
  schedulerv3SearchScheduledTaskRunsRequest: {
    limit: 1,
    offset: 1,
    scheduledJobId: [
      "scheduledJobId_example",
    ],
    withLatest: true,
  },
};

apiInstance.schedulerServiceSearchScheduledTaskRuns(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3SearchScheduledTaskRunsRequest** | **Schedulerv3SearchScheduledTaskRunsRequest**|  |


### Return type

**Schedulerv3SearchScheduledTaskRunsResponse**

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

# **schedulerServiceUpdateScheduledJob**
> Schedulerv3UpdateScheduledJobResponse schedulerServiceUpdateScheduledJob(schedulerv3UpdateScheduledJobRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SchedulerServiceApi(configuration);

let body:.SchedulerServiceApiSchedulerServiceUpdateScheduledJobRequest = {
  // string | Unique ID, required for update.
  scheduleId: "schedule_id_example",
  // Schedulerv3UpdateScheduledJobRequest
  schedulerv3UpdateScheduledJobRequest: {
    query: {
      "key": "key_example",
    },
    scheduleId: "scheduleId_example",
    scheduledJob: {
      description: "description_example",
      enabled: true,
      instructions: "instructions_example",
      internalAudit: "UNDEFINED_TYPE",
      name: "name_example",
      notification: "UNDEFINED_NOTIFICATION",
      origin: "origin_example",
      recipient: {
        integrationId: "integrationId_example",
        label: "label_example",
        templateId: "templateId_example",
        type: "UNDEFINED_RECTYPE",
        value: "value_example",
      },
      recipients: [
        {
          integrationId: "integrationId_example",
          label: "label_example",
          templateId: "templateId_example",
          type: "UNDEFINED_RECTYPE",
          value: "value_example",
        },
      ],
      retention: {
        archive: true,
        days: 1,
      },
      scheduler: {
        beginSchedule: new Date('1970-01-01T00:00:00.00Z'),
        byDayOfMonth: true,
        dayOfMonth: "dayOfMonth_example",
        dayOfWeek: [
          "UNDEFINED_DAY",
        ],
        dayOrder: "UNDEFINED_ORDER",
        dayOrderDayOfWeek: "UNDEFINED_DAY",
        endSchedule: new Date('1970-01-01T00:00:00.00Z'),
        frequency: "UNDEFINED_FREQUENCY",
        months: [
          "EVERYMONTH",
        ],
        neverEnd: true,
        repeat: 1,
        repeatBegin: {
          hour: 1,
          minute: 1,
          timezone: "timezone_example",
        },
        repeatEnd: {
          hour: 1,
          minute: 1,
          timezone: "timezone_example",
        },
        repeatMinutes: 1,
        runOnceNow: true,
      },
      tags: [
        "tags_example",
      ],
      tasks: [
        {
          auditType: "UNDEFINED_TYPE",
          deliveryMethod: {
            fileFormat: "UNDEFINED_FORMAT",
            reportTimeZone: "reportTimeZone_example",
          },
          distributionRuleIds: [
            "distributionRuleIds_example",
          ],
          emailSubject: "emailSubject_example",
          instructions: "instructions_example",
          name: "name_example",
          parameter: {
            dataImportParameter: {
              extraDetail: "extraDetail_example",
              integrationId: "integrationId_example",
              templateId: "templateId_example",
              value: "value_example",
            },
            reportParameter: {
              extraDetail: "extraDetail_example",
              reportId: "reportId_example",
              reportName: "reportName_example",
              runtimeParameters: [
                {
                  key: "key_example",
                  label: "label_example",
                  operatorType: "UNDEFINED_OPERATOR_TYPE",
                  runtimeParameterType: "UNDEFINED_TYPE",
                  runtimeParameterTypeLength: 1,
                  value: "value_example",
                },
              ],
              syncExecutionDate: true,
            },
          },
          recipients: [
            {
              integrationId: "integrationId_example",
              label: "label_example",
              templateId: "templateId_example",
              type: "UNDEFINED_RECTYPE",
              value: "value_example",
            },
          ],
          reportFilters: {
            bracketsId: 1,
            filterName: "filterName_example",
            filtersArray: [
              {
                brackets: ,
                condition: {
                  caseInsensitive: true,
                  fieldNlsTranslationKey: "fieldNlsTranslationKey_example",
                  filterId: 1,
                  headerId: "headerId_example",
                  headerName: "headerName_example",
                  headerType: "UNDEFINED_TYPE",
                  inReportDateRange: {
                    endDate: "endDate_example",
                    endNumber: 1,
                    endUnit: "UNDEFINED_UINT_TYPE",
                    startDate: "startDate_example",
                    startNumber: 1,
                    startUnit: "UNDEFINED_UINT_TYPE",
                    type: "UNDEFINED_DATE_RANGE_TYPE",
                  },
                  inReportFieldNlsKey: "inReportFieldNlsKey_example",
                  inReportHeaderId: "inReportHeaderId_example",
                  inReportHeaderName: "inReportHeaderName_example",
                  inReportId: "inReportId_example",
                  inReportName: "inReportName_example",
                  inReportTableName: "inReportTableName_example",
                  operatorType: "UNDEFINED_OPERATOR_TYPE",
                  parameterType: "UNDEFINED_PARAM_TYPE",
                  schemaName: "schemaName_example",
                  sequence: 1,
                  tableName: "tableName_example",
                  values: [
                    "values_example",
                  ],
                },
              },
            ],
            havingArray: [
              {
                condition: {
                  aggregationType: "UNDEFINED_AGG_TYPE",
                  headerId: "headerId_example",
                  headerName: "headerName_example",
                  operatorType: "UNDEFINED_OPERATOR_TYPE",
                  tableName: "tableName_example",
                  value: "value_example",
                },
              },
            ],
            isCustom: true,
            optionType: "UNDEFINED_OPTION_TYPE",
            sequence: 1,
          },
          scheduledTaskId: "scheduledTaskId_example",
          type: "UNDEFINED_JOBTYPE",
          workflowInvestigationLinks: [
            {
              display: "display_example",
              id: "id_example",
              type: "type_example",
            },
          ],
          workflowResponseTemplate: {
            display: "display_example",
            id: "id_example",
            type: "type_example",
          },
          workflowType: "REVIEW_NONE",
          workflowUniqueFields: [
            "workflowUniqueFields_example",
          ],
        },
      ],
    },
  },
};

apiInstance.schedulerServiceUpdateScheduledJob(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulerv3UpdateScheduledJobRequest** | **Schedulerv3UpdateScheduledJobRequest**|  |
 **scheduleId** | [**string**] | Unique ID, required for update. | defaults to undefined


### Return type

**Schedulerv3UpdateScheduledJobResponse**

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








# .SnifAssistServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**snifAssistServiceTestRegex**](SnifAssistServiceApi.md#snifAssistServiceTestRegex) | **POST** /api/v3/snif/test_regex | Summary: Test regex Description: Match a text string with a regular expression using the same sniffer  code used in production to match a regex.


# **snifAssistServiceTestRegex**
> Snifassistv3StatusResponseBase snifAssistServiceTestRegex(snifassistv3TestRegexRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .SnifAssistServiceApi(configuration);

let body:.SnifAssistServiceApiSnifAssistServiceTestRegexRequest = {
  // Snifassistv3TestRegexRequest
  snifassistv3TestRegexRequest: {
    regex: "regex_example",
    tenantId: "tenantId_example",
    text: "text_example",
  },
};

apiInstance.snifAssistServiceTestRegex(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snifassistv3TestRegexRequest** | **Snifassistv3TestRegexRequest**|  |


### Return type

**Snifassistv3StatusResponseBase**

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





# .StreamsServiceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streamsServiceCheckAWSCredentials**](StreamsServiceApi.md#streamsServiceCheckAWSCredentials) | **POST** /api/v3/streams/credentials | Summary: Check AWS credentials Description: Service to verify AWS credentials.
[**streamsServiceCheckAzureEventHub**](StreamsServiceApi.md#streamsServiceCheckAzureEventHub) | **POST** /api/v3/streams/azure_eventhub | Summary: Check Azure event hub Description: Service to check Azure event hub.
[**streamsServiceCheckAzureStorageString**](StreamsServiceApi.md#streamsServiceCheckAzureStorageString) | **POST** /api/v3/streams/azure_storage | Summary: Check Azure storage string Description: Service to verify Azure storage connection.
[**streamsServiceGetAWSRegions**](StreamsServiceApi.md#streamsServiceGetAWSRegions) | **GET** /api/v3/streams/regions | Summary: Get AWS regions Description: Service to get AWS regions.
[**streamsServiceListAWSStreams**](StreamsServiceApi.md#streamsServiceListAWSStreams) | **POST** /api/v3/streams | Summary: List AWS streams Description: Service to list AWS Kinesis streams.


# **streamsServiceCheckAWSCredentials**
> Streamsv3CheckAWSCredentialsResponse streamsServiceCheckAWSCredentials(streamsv3CheckAWSCredentialsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StreamsServiceApi(configuration);

let body:.StreamsServiceApiStreamsServiceCheckAWSCredentialsRequest = {
  // Streamsv3CheckAWSCredentialsRequest
  streamsv3CheckAWSCredentialsRequest: {
    accessKeyId: "accessKeyId_example",
    authType: "SECURITY_CREDENTIALS",
    id: "id_example",
    region: "region_example",
    roleArn: "roleArn_example",
    secretKeyId: "secretKeyId_example",
    streamName: "streamName_example",
    streamType: "AWS_KINESIS",
  },
};

apiInstance.streamsServiceCheckAWSCredentials(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAWSCredentialsRequest** | **Streamsv3CheckAWSCredentialsRequest**|  |


### Return type

**Streamsv3CheckAWSCredentialsResponse**

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

# **streamsServiceCheckAzureEventHub**
> Streamsv3CheckAzureEventHubResponse streamsServiceCheckAzureEventHub(streamsv3CheckAzureEventHubRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StreamsServiceApi(configuration);

let body:.StreamsServiceApiStreamsServiceCheckAzureEventHubRequest = {
  // Streamsv3CheckAzureEventHubRequest
  streamsv3CheckAzureEventHubRequest: {
    accessKeyId: "accessKeyId_example",
    id: "id_example",
    namespace: "namespace_example",
    secretKeyId: "secretKeyId_example",
    streamName: "streamName_example",
    streamType: "AWS_KINESIS",
  },
};

apiInstance.streamsServiceCheckAzureEventHub(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAzureEventHubRequest** | **Streamsv3CheckAzureEventHubRequest**|  |


### Return type

**Streamsv3CheckAzureEventHubResponse**

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

# **streamsServiceCheckAzureStorageString**
> Streamsv3CheckAzureStorageStringResponse streamsServiceCheckAzureStorageString(streamsv3CheckAzureStorageStringRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StreamsServiceApi(configuration);

let body:.StreamsServiceApiStreamsServiceCheckAzureStorageStringRequest = {
  // Streamsv3CheckAzureStorageStringRequest
  streamsv3CheckAzureStorageStringRequest: {
    connectionString: "connectionString_example",
  },
};

apiInstance.streamsServiceCheckAzureStorageString(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3CheckAzureStorageStringRequest** | **Streamsv3CheckAzureStorageStringRequest**|  |


### Return type

**Streamsv3CheckAzureStorageStringResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **streamsServiceGetAWSRegions**
> Streamsv3GetAWSRegionsResponse streamsServiceGetAWSRegions()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StreamsServiceApi(configuration);

let body:any = {};

apiInstance.streamsServiceGetAWSRegions(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Streamsv3GetAWSRegionsResponse**

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

# **streamsServiceListAWSStreams**
> Streamsv3ListAWSStreamsResponse streamsServiceListAWSStreams(streamsv3ListAWSStreamsRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .StreamsServiceApi(configuration);

let body:.StreamsServiceApiStreamsServiceListAWSStreamsRequest = {
  // Streamsv3ListAWSStreamsRequest
  streamsv3ListAWSStreamsRequest: {
    accessKeyId: "accessKeyId_example",
    authType: "SECURITY_CREDENTIALS",
    id: "id_example",
    region: [
      "region_example",
    ],
    roleArn: "roleArn_example",
    secretKeyId: "secretKeyId_example",
    streamType: "AWS_KINESIS",
  },
};

apiInstance.streamsServiceListAWSStreams(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **streamsv3ListAWSStreamsRequest** | **Streamsv3ListAWSStreamsRequest**|  |


### Return type

**Streamsv3ListAWSStreamsResponse**

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





# .TenantuserApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tenantuserCreateAPIKey**](TenantuserApi.md#tenantuserCreateAPIKey) | **POST** /api/v3/apikeys | Summary: Create API key Description: Create API Key.
[**tenantuserDeleteAPIKey**](TenantuserApi.md#tenantuserDeleteAPIKey) | **DELETE** /api/v3/apikeys/{id} | Summary: Delete API key Description: Delete APIKey Document based on the document id.
[**tenantuserDeleteRole**](TenantuserApi.md#tenantuserDeleteRole) | **DELETE** /api/v3/roles/{role_id} | Summary: Delete role Description: Delete a role.
[**tenantuserGetAPIKeys**](TenantuserApi.md#tenantuserGetAPIKeys) | **GET** /api/v3/apikeys | Summary: Get API keys Description: Get all APIKeys base on a tenant ID.
[**tenantuserGetCurrentUser**](TenantuserApi.md#tenantuserGetCurrentUser) | **GET** /api/v3/currentuser | Summary: Get current user Description: Return the currently authenticated user.
[**tenantuserGetPrivilege**](TenantuserApi.md#tenantuserGetPrivilege) | **GET** /api/v3/privileges/{privilege.privilege_id} | Summary: Get privilege Description: Return privilege.
[**tenantuserGetPrivileges**](TenantuserApi.md#tenantuserGetPrivileges) | **GET** /api/v3/privileges | Summary: Get privileges Description: Return all available privileges (pages, restapi, reports, etc) if no roles are specified If roles are specified, returns cumulative privileges for the list of roles.
[**tenantuserGetRole**](TenantuserApi.md#tenantuserGetRole) | **GET** /api/v3/roles/{role_id} | Summary: Get role Description: Return single role.
[**tenantuserGetRoles**](TenantuserApi.md#tenantuserGetRoles) | **GET** /api/v3/roles | Summary: Get roles Description: Return all roles without privileges.
[**tenantuserGetUser**](TenantuserApi.md#tenantuserGetUser) | **GET** /api/v3/users/user/{user_id} | Summary: Get user Description: Return full user for specified user_id.
[**tenantuserGetUserNames**](TenantuserApi.md#tenantuserGetUserNames) | **POST** /api/v3/users/names | Summary: Get user names Description: Get user names.
[**tenantuserGetUserTenant**](TenantuserApi.md#tenantuserGetUserTenant) | **GET** /api/v3/users/tenant/{user_id} | Summary: Get user tenant Description: Return the user plus tenant information.
[**tenantuserPostPrivilegesBulk**](TenantuserApi.md#tenantuserPostPrivilegesBulk) | **POST** /api/v3/privileges | Summary: Post privileges bulk Description: Perform bulk user add preivilege.
[**tenantuserPostRole**](TenantuserApi.md#tenantuserPostRole) | **POST** /api/v3/roles | Summary: Post role Description: Create a new role.
[**tenantuserUpdatePrivilege**](TenantuserApi.md#tenantuserUpdatePrivilege) | **PATCH** /api/v3/privileges/{privilege_id} | Summary: Update privilege Description: Update privilege.
[**tenantuserUpdatePrivilegesRoleBulk**](TenantuserApi.md#tenantuserUpdatePrivilegesRoleBulk) | **PATCH** /api/v3/privileges | Summary: Update privileges role bulk Description: Perform bulk user update role.
[**tenantuserUpdateRole**](TenantuserApi.md#tenantuserUpdateRole) | **PATCH** /api/v3/roles/{role_id} | Summary: Update role Description: Update single role.
[**tenantuserUpdateUserRoleBulk**](TenantuserApi.md#tenantuserUpdateUserRoleBulk) | **PATCH** /api/v3/users/role | Summary: Update user role bulk Description: Perform bulk user add or remove role.


# **tenantuserCreateAPIKey**
> Tenantuserv3CreateApiKeyResponse tenantuserCreateAPIKey(tenantuserv3CreateApiKeyRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserCreateAPIKeyRequest = {
  // Tenantuserv3CreateApiKeyRequest
  tenantuserv3CreateApiKeyRequest: {
    name: "name_example",
    roles: [
      "roles_example",
    ],
  },
};

apiInstance.tenantuserCreateAPIKey(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3CreateApiKeyRequest** | **Tenantuserv3CreateApiKeyRequest**|  |


### Return type

**Tenantuserv3CreateApiKeyResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserDeleteAPIKey**
> any tenantuserDeleteAPIKey()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserDeleteAPIKeyRequest = {
  // string | Apikey id.
  id: "id_example",
};

apiInstance.tenantuserDeleteAPIKey(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | Apikey id. | defaults to undefined


### Return type

**any**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserDeleteRole**
> any tenantuserDeleteRole()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserDeleteRoleRequest = {
  // string | ID or role deleted.
  roleId: "role_id_example",
};

apiInstance.tenantuserDeleteRole(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | [**string**] | ID or role deleted. | defaults to undefined


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

# **tenantuserGetAPIKeys**
> Tenantuserv3GetApiKeysResponse tenantuserGetAPIKeys()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:any = {};

apiInstance.tenantuserGetAPIKeys(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Tenantuserv3GetApiKeysResponse**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A successful response. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **tenantuserGetCurrentUser**
> Tenantuserv3GetCurrentUserResponse tenantuserGetCurrentUser()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:any = {};

apiInstance.tenantuserGetCurrentUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Tenantuserv3GetCurrentUserResponse**

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

# **tenantuserGetPrivilege**
> Tenantuserv3GetPrivilegeResponse tenantuserGetPrivilege()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserGetPrivilegeRequest = {
  // string | Privilege ID.
  privilegePrivilegeId: "privilege.privilege_id_example",
  // string | Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. (optional)
  privilegeType: "privilege.type_example",
};

apiInstance.tenantuserGetPrivilege(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **privilegePrivilegeId** | [**string**] | Privilege ID. | defaults to undefined
 **privilegeType** | [**string**] | Privilege Type - a report, group, and datasource may have the same ID. By passing type, the artifact can be uniquely determined. | (optional) defaults to undefined


### Return type

**Tenantuserv3GetPrivilegeResponse**

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

# **tenantuserGetPrivileges**
> Tenantuserv3GetPrivilegesResponse tenantuserGetPrivileges()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserGetPrivilegesRequest = {
  // Array<string> | If empty, will return all privileges. (optional)
  roles: [
    "roles_example",
  ],
  // string | Type of privilege to return: group, page, permission, report, restapi, etc. (optional)
  type: "type_example",
};

apiInstance.tenantuserGetPrivileges(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roles** | **Array&lt;string&gt;** | If empty, will return all privileges. | (optional) defaults to undefined
 **type** | [**string**] | Type of privilege to return: group, page, permission, report, restapi, etc. | (optional) defaults to undefined


### Return type

**Tenantuserv3GetPrivilegesResponse**

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

# **tenantuserGetRole**
> Tenantuserv3Role tenantuserGetRole()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserGetRoleRequest = {
  // string | ID of role to be returned.
  roleId: "role_id_example",
};

apiInstance.tenantuserGetRole(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleId** | [**string**] | ID of role to be returned. | defaults to undefined


### Return type

**Tenantuserv3Role**

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

# **tenantuserGetRoles**
> Tenantuserv3GetRolesResponse tenantuserGetRoles()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:any = {};

apiInstance.tenantuserGetRoles(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Tenantuserv3GetRolesResponse**

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

# **tenantuserGetUser**
> Tenantuserv3GetUserResponse tenantuserGetUser()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserGetUserRequest = {
  // string | User id defaults to the current user or specify \"current\" or an actual user id.
  userId: "user_id_example",
};

apiInstance.tenantuserGetUser(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | defaults to undefined


### Return type

**Tenantuserv3GetUserResponse**

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

# **tenantuserGetUserNames**
> Tenantuserv3GetUserNamesResponse tenantuserGetUserNames(tenantuserv3GetUserNamesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserGetUserNamesRequest = {
  // Tenantuserv3GetUserNamesRequest
  tenantuserv3GetUserNamesRequest: {
    userIds: [
      "userIds_example",
    ],
  },
};

apiInstance.tenantuserGetUserNames(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3GetUserNamesRequest** | **Tenantuserv3GetUserNamesRequest**|  |


### Return type

**Tenantuserv3GetUserNamesResponse**

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

# **tenantuserGetUserTenant**
> Tenantuserv3GetUserTenantResponse tenantuserGetUserTenant()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserGetUserTenantRequest = {
  // string | User id defaults to the current user or specify \"current\" or an actual user id.
  userId: "user_id_example",
};

apiInstance.tenantuserGetUserTenant(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | [**string**] | User id defaults to the current user or specify \&quot;current\&quot; or an actual user id. | defaults to undefined


### Return type

**Tenantuserv3GetUserTenantResponse**

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

# **tenantuserPostPrivilegesBulk**
> Tenantuserv3PostPrivilegesBulkResponse tenantuserPostPrivilegesBulk(tenantuserv3PostPrivilegesBulkRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserPostPrivilegesBulkRequest = {
  // Tenantuserv3PostPrivilegesBulkRequest
  tenantuserv3PostPrivilegesBulkRequest: {
    privileges: [
      {
        authorId: "authorId_example",
        immutableRoles: [
          "immutableRoles_example",
        ],
        manageRoles: [
          "manageRoles_example",
        ],
        name: "name_example",
        nlsId: "nlsId_example",
        privilegeId: "privilegeId_example",
        removable: true,
        roles: [
          "roles_example",
        ],
        type: "type_example",
      },
    ],
  },
};

apiInstance.tenantuserPostPrivilegesBulk(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3PostPrivilegesBulkRequest** | **Tenantuserv3PostPrivilegesBulkRequest**|  |


### Return type

**Tenantuserv3PostPrivilegesBulkResponse**

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

# **tenantuserPostRole**
> Tenantuserv3PostRoleResponse tenantuserPostRole(tenantuserv3PostRoleRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserPostRoleRequest = {
  // Tenantuserv3PostRoleRequest
  tenantuserv3PostRoleRequest: {
    role: {
      description: "description_example",
      icpRoles: [
        "icpRoles_example",
      ],
      name: "name_example",
      removable: true,
      roleId: "roleId_example",
    },
  },
};

apiInstance.tenantuserPostRole(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3PostRoleRequest** | **Tenantuserv3PostRoleRequest**|  |


### Return type

**Tenantuserv3PostRoleResponse**

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

# **tenantuserUpdatePrivilege**
> Tenantuserv3UpdatePrivilegeResponse tenantuserUpdatePrivilege(tenantuserv3UpdatePrivilegeRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserUpdatePrivilegeRequest = {
  // string | Permanent id of the privilege to be updated or created.
  privilegeId: "privilege_id_example",
  // Tenantuserv3UpdatePrivilegeRequest
  tenantuserv3UpdatePrivilegeRequest: {
    manageRoles: [
      "manageRoles_example",
    ],
    name: "name_example",
    privilegeId: "privilegeId_example",
    removable: true,
    roles: [
      "roles_example",
    ],
    type: "type_example",
  },
};

apiInstance.tenantuserUpdatePrivilege(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3UpdatePrivilegeRequest** | **Tenantuserv3UpdatePrivilegeRequest**|  |
 **privilegeId** | [**string**] | Permanent id of the privilege to be updated or created. | defaults to undefined


### Return type

**Tenantuserv3UpdatePrivilegeResponse**

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

# **tenantuserUpdatePrivilegesRoleBulk**
> Tenantuserv3UpdatePrivilegesBulkResponse tenantuserUpdatePrivilegesRoleBulk(tenantuserv3UpdatePrivilegesBulkRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserUpdatePrivilegesRoleBulkRequest = {
  // Tenantuserv3UpdatePrivilegesBulkRequest
  tenantuserv3UpdatePrivilegesBulkRequest: {
    privilege: [
      {
        privilegeId: "privilegeId_example",
        roles: [
          "roles_example",
        ],
        type: "type_example",
      },
    ],
    roleId: "roleId_example",
  },
};

apiInstance.tenantuserUpdatePrivilegesRoleBulk(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3UpdatePrivilegesBulkRequest** | **Tenantuserv3UpdatePrivilegesBulkRequest**|  |


### Return type

**Tenantuserv3UpdatePrivilegesBulkResponse**

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

# **tenantuserUpdateRole**
> Tenantuserv3UpdateRoleResponse tenantuserUpdateRole(tenantuserv3UpdateRoleRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserUpdateRoleRequest = {
  // string | Permanent id of the role.
  roleId: "role_id_example",
  // Tenantuserv3UpdateRoleRequest
  tenantuserv3UpdateRoleRequest: {
    description: "description_example",
    icpRoles: [
      "icpRoles_example",
    ],
    name: "name_example",
    removable: true,
    roleId: "roleId_example",
  },
};

apiInstance.tenantuserUpdateRole(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3UpdateRoleRequest** | **Tenantuserv3UpdateRoleRequest**|  |
 **roleId** | [**string**] | Permanent id of the role. | defaults to undefined


### Return type

**Tenantuserv3UpdateRoleResponse**

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

# **tenantuserUpdateUserRoleBulk**
> Tenantuserv3UpdateUserRoleBulkResponse tenantuserUpdateUserRoleBulk(tenantuserv3UpdateUserRoleBulkRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .TenantuserApi(configuration);

let body:.TenantuserApiTenantuserUpdateUserRoleBulkRequest = {
  // Tenantuserv3UpdateUserRoleBulkRequest
  tenantuserv3UpdateUserRoleBulkRequest: {
    assignRoleId: [
      "assignRoleId_example",
    ],
    removeRoleId: [
      "removeRoleId_example",
    ],
    userId: [
      "userId_example",
    ],
  },
};

apiInstance.tenantuserUpdateUserRoleBulk(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantuserv3UpdateUserRoleBulkRequest** | **Tenantuserv3UpdateUserRoleBulkRequest**|  |


### Return type

**Tenantuserv3UpdateUserRoleBulkResponse**

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





# .ThirdPartyVendorsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLinkedVendor**](ThirdPartyVendorsApi.md#getLinkedVendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/cloudAccounts | Get additional details of a specific third party vendor
[**getSingleLinkedVendor**](ThirdPartyVendorsApi.md#getSingleLinkedVendor) | **GET** /api/v1/dspm/linkedVendors/{vendorId} | Get the third party vendors list
[**listLinkedVendorDataStores**](ThirdPartyVendorsApi.md#listLinkedVendorDataStores) | **GET** /api/v1/dspm/linkedVendors/{vendorId}/dataStores | Get the data stores associated with a third party vendor
[**listLinkedVendors**](ThirdPartyVendorsApi.md#listLinkedVendors) | **GET** /api/v1/dspm/linkedVendors | Get the summary of a third party vendor
[**listTrustedAssets**](ThirdPartyVendorsApi.md#listTrustedAssets) | **GET** /api/v1/dspm/linkedVendors/trustedAssets | Get a list of all the actual trusted assets


# **getLinkedVendor**
> Array<VendorSummary> getLinkedVendor()

Get additional details of a specific third party vendor, such as, customer account details, sensitivities summary, and so on.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ThirdPartyVendorsApi(configuration);

let body:.ThirdPartyVendorsApiGetLinkedVendorRequest = {
  // string | The third party vendor\'s account ID
  vendorId: "123456789101",
};

apiInstance.getLinkedVendor(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | [**string**] | The third party vendor\&#39;s account ID | defaults to undefined


### Return type

**Array<VendorSummary>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**403** | Forbidden |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**500** | Internal Server Error |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**503** | Service Unavailable |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getSingleLinkedVendor**
> LinkedVendor getSingleLinkedVendor()

Get details about a third party vendor.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ThirdPartyVendorsApi(configuration);

let body:.ThirdPartyVendorsApiGetSingleLinkedVendorRequest = {
  // string | vendor id
  vendorId: "123456789101",
};

apiInstance.getSingleLinkedVendor(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | [**string**] | vendor id | defaults to undefined


### Return type

**LinkedVendor**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listLinkedVendorDataStores**
> ListLinkedVendorDataStores200Response listLinkedVendorDataStores()

Get a list of all the data stores that a third party vendor can access. Find out whether the data stores have sensitivities and which role can access the data stores.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ThirdPartyVendorsApi(configuration);

let body:.ThirdPartyVendorsApiListLinkedVendorDataStoresRequest = {
  // string | The third party vendor\'s account ID
  vendorId: "123456789101",
  // ListVendorDataStoresFilterParameter (optional)
  filter: {
    cloudAccountId: "cloudAccountId_example",
    dataStoreId: "dataStoreId_example",
    dataStoreType: "dataStoreType_example",
    dataStoreName: "dataStoreName_example",
    cloudRegion: "cloudRegion_example",
    cloudProvider: "aws",
  },
  // ListLinkedVendorDataStoresSortParameter (optional)
  sort: {
    sortBy: "dataStoreId",
    sortOrder: 1,
  },
  // number (optional)
  pageSize: 3.14,
  // string (optional)
  nextToken: "nextToken_example",
};

apiInstance.listLinkedVendorDataStores(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | [**string**] | The third party vendor\&#39;s account ID | defaults to undefined
 **filter** | **ListVendorDataStoresFilterParameter** |  | (optional) defaults to undefined
 **sort** | **ListLinkedVendorDataStoresSortParameter** |  | (optional) defaults to undefined
 **pageSize** | [**number**] |  | (optional) defaults to undefined
 **nextToken** | [**string**] |  | (optional) defaults to undefined


### Return type

**ListLinkedVendorDataStores200Response**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listLinkedVendors**
> Array<LinkedVendor> listLinkedVendors()

Get a list of all third party vendors associated to your cloud environments (relevant for the cloud environments connected to Guardium DSPM only).

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ThirdPartyVendorsApi(configuration);

let body:any = {};

apiInstance.listLinkedVendors(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Array<LinkedVendor>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **listTrustedAssets**
> Array<Trustee> listTrustedAssets()

Get a list of roles, buckets or service principles, and their entitled permissions associated to your cloud environments connected to Guardium DSPM.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .ThirdPartyVendorsApi(configuration);

let body:.ThirdPartyVendorsApiListTrustedAssetsRequest = {
  // ListTrusteesFilterParameter (optional)
  filter: {
    vendorId: "123456789101",
    dataStoreId: "123456789101",
    cloudAccountId: "123456789101",
  },
};

apiInstance.listTrustedAssets(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **ListTrusteesFilterParameter** |  | (optional) defaults to undefined


### Return type

**Array<Trustee>**

### Authorization

[ApiKeyAuth](README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |
**400** | Bad Request |  * Access-Control-Allow-Origin -  <br>  * Access-Control-Allow-Methods -  <br>  * Access-Control-Allow-Headers -  <br>  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)





# .UniversalConnectorManagerApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**universalConnectorManagerGetCertificate**](UniversalConnectorManagerApi.md#universalConnectorManagerGetCertificate) | **GET** /api/v3/certificates | Summary: Get certificate Description: Get the certificate that allows secure communication between data sources and universal connections in Guardium.
[**universalConnectorManagerGetConnectors**](UniversalConnectorManagerApi.md#universalConnectorManagerGetConnectors) | **GET** /api/v3/connectors | Summary: Get connectors Description: Get all the connectors Universal Connector can support. Includes a list of event pipelines (input--filter pairs), along with the supported data source types and platforms.
[**universalConnectorManagerListConnectionsSummary**](UniversalConnectorManagerApi.md#universalConnectorManagerListConnectionsSummary) | **GET** /api/v3/universal_connections | Summary: List connections summary Description: List a summary of Universal Connector configured connections (AKA datasources).
[**universalConnectorManagerPluginsList**](UniversalConnectorManagerApi.md#universalConnectorManagerPluginsList) | **GET** /api/v3/plugins | Summary: Plugins list Description: List of all universal connector plugins.
[**universalConnectorManagerUploadPlugin**](UniversalConnectorManagerApi.md#universalConnectorManagerUploadPlugin) | **POST** /api/v3/plugins | Summary: Upload plugin Description: Upload a plugin-package for Universal Connector.


# **universalConnectorManagerGetCertificate**
> Universalconnectormanagerv3FileResponse universalConnectorManagerGetCertificate()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:any = {};

apiInstance.universalConnectorManagerGetCertificate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Universalconnectormanagerv3FileResponse**

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

# **universalConnectorManagerGetConnectors**
> Universalconnectormanagerv3GetConnectorsResponse universalConnectorManagerGetConnectors()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:any = {};

apiInstance.universalConnectorManagerGetConnectors(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Universalconnectormanagerv3GetConnectorsResponse**

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

# **universalConnectorManagerListConnectionsSummary**
> Universalconnectormanagerv3ListConnectionsResponse universalConnectorManagerListConnectionsSummary()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:any = {};

apiInstance.universalConnectorManagerListConnectionsSummary(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Universalconnectormanagerv3ListConnectionsResponse**

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

# **universalConnectorManagerPluginsList**
> Universalconnectormanagerv3PluginsListResponse universalConnectorManagerPluginsList()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:any = {};

apiInstance.universalConnectorManagerPluginsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters
This endpoint does not need any parameter.


### Return type

**Universalconnectormanagerv3PluginsListResponse**

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

# **universalConnectorManagerUploadPlugin**
> RpcStatus universalConnectorManagerUploadPlugin(universalconnectormanagerv3UploadPluginRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .UniversalConnectorManagerApi(configuration);

let body:.UniversalConnectorManagerApiUniversalConnectorManagerUploadPluginRequest = {
  // Universalconnectormanagerv3UploadPluginRequest
  universalconnectormanagerv3UploadPluginRequest: {
    pluginId: "pluginId_example",
  },
};

apiInstance.universalConnectorManagerUploadPlugin(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **universalconnectormanagerv3UploadPluginRequest** | **Universalconnectormanagerv3UploadPluginRequest**|  |


### Return type

**RpcStatus**

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





# .WorkflowApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**workflowCreateCase**](WorkflowApi.md#workflowCreateCase) | **POST** /api/v3/cases | Summary: Create case Description: Create single case.
[**workflowCreateTask**](WorkflowApi.md#workflowCreateTask) | **POST** /api/v3/cases/{case_id}/tasks | Summary: Create task Description: Create single task within a parent case.
[**workflowGetCases**](WorkflowApi.md#workflowGetCases) | **GET** /api/v3/cases | Summary: Get cases Description: Return all cases requested.
[**workflowGetCasesCount**](WorkflowApi.md#workflowGetCasesCount) | **POST** /api/v3/cases/count | Summary: Get cases count Description: Get case count.
[**workflowGetFilename**](WorkflowApi.md#workflowGetFilename) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/filename | Summary: Get filename Description: Return filename associated with the task referenced in the associated context record.
[**workflowGetJobsCount**](WorkflowApi.md#workflowGetJobsCount) | **POST** /api/v3/cases/{case_id}/jobs/count | Summary: Get jobs count Description: Get jobs count.
[**workflowGetReportResult**](WorkflowApi.md#workflowGetReportResult) | **GET** /api/v3/cases/{case_id}/tasks/{task_id}/result | Summary: Get report result Description: Return a page of results.
[**workflowGetTasks**](WorkflowApi.md#workflowGetTasks) | **GET** /api/v3/cases/{case_id}/tasks | Summary: Get tasks Description: Return all tasks requested.
[**workflowGetTasksCount**](WorkflowApi.md#workflowGetTasksCount) | **POST** /api/v3/cases/{case_id}/tasks/count | Summary: Get cases count Description: Get case count.
[**workflowSearchCases**](WorkflowApi.md#workflowSearchCases) | **POST** /api/v3/cases/search | Summary: Search cases Description: Return a subset of cases.
[**workflowSearchReports**](WorkflowApi.md#workflowSearchReports) | **POST** /api/v3/cases/reports | Summary: Get a list of report IDs Description: Returns a list of report IDs referenced in all cases and tasks
[**workflowSearchTasks**](WorkflowApi.md#workflowSearchTasks) | **POST** /api/v3/cases/{case_id}/tasks/search | Summary: Search cases Description: Return a subset of cases.
[**workflowUpdateCases**](WorkflowApi.md#workflowUpdateCases) | **PUT** /api/v3/cases | Summary: Update cases Description: Update multiple cases in one request.
[**workflowUpdateTasks**](WorkflowApi.md#workflowUpdateTasks) | **PUT** /api/v3/cases/{case_id}/tasks | Summary: Update tasks Description: Update multiple tasks for the same parent in one request.


# **workflowCreateCase**
> Workflowv3CreateCaseResponse workflowCreateCase(workflowv3CreateCaseRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowCreateCaseRequest = {
  // Workflowv3CreateCaseRequest
  workflowv3CreateCaseRequest: {
    _case: {
      artifacts: [
        "artifacts_example",
      ],
      assignments: [
        {
          label: "label_example",
          templateId: "templateId_example",
          type: "UNDEFINED_ENTITY_TYPE",
          value: "value_example",
        },
      ],
      caseId: "caseId_example",
      comment: "comment_example",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      description: "description_example",
      priority: "UNDEFINED_PRIORITY",
      status: "UNDEFINED_STATUS",
      title: "title_example",
    },
  },
};

apiInstance.workflowCreateCase(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3CreateCaseRequest** | **Workflowv3CreateCaseRequest**|  |


### Return type

**Workflowv3CreateCaseResponse**

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

# **workflowCreateTask**
> Workflowv3CreateTaskResponse workflowCreateTask(workflowv3CreateTaskRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowCreateTaskRequest = {
  // string | Create tasks with common parent.
  caseId: "case_id_example",
  // Workflowv3CreateTaskRequest
  workflowv3CreateTaskRequest: {
    caseId: "caseId_example",
    task: {
      altId: "altId_example",
      assignments: [
        {
          label: "label_example",
          templateId: "templateId_example",
          type: "UNDEFINED_ENTITY_TYPE",
          value: "value_example",
        },
      ],
      comment: "comment_example",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dependsOn: [
        "dependsOn_example",
      ],
      description: "description_example",
      investigationLinks: [
        {
          display: "display_example",
          id: "id_example",
          type: "type_example",
        },
      ],
      origin: {
        dateNext: new Date('1970-01-01T00:00:00.00Z'),
        dateStart: new Date('1970-01-01T00:00:00.00Z'),
        description: "description_example",
        frequency: "frequency_example",
        name: "name_example",
        scheduledJobId: "scheduledJobId_example",
      },
      priority: "UNDEFINED_PRIORITY",
      reportResult: {
        headers: [
          {
            header: "header_example",
            key: "key_example",
          },
        ],
        rows: [
          {
            row: {
              "key": "key_example",
            },
          },
        ],
      },
      responseTemplate: {
        display: "display_example",
        id: "id_example",
        type: "type_example",
      },
      status: "UNDEFINED_STATUS",
      tags: [
        "tags_example",
      ],
      title: "title_example",
    },
  },
};

apiInstance.workflowCreateTask(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3CreateTaskRequest** | **Workflowv3CreateTaskRequest**|  |
 **caseId** | [**string**] | Create tasks with common parent. | defaults to undefined


### Return type

**Workflowv3CreateTaskResponse**

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

# **workflowGetCases**
> Workflowv3CaseListResponse workflowGetCases()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetCasesRequest = {
  // string | Optional case_id to get a response of an array of one member. (optional)
  caseId: "case_id_example",
  // string | Optional field to sort by | first character determines ascending (>) or descending (<). (optional)
  sortBy: "sort_by_example",
  // number | Optional starting point for the page of data. (optional)
  offset: 1,
  // number | Optional page size. (optional)
  limit: 1,
};

apiInstance.workflowGetCases(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | [**string**] | Optional case_id to get a response of an array of one member. | (optional) defaults to undefined
 **sortBy** | [**string**] | Optional field to sort by | first character determines ascending (&gt;) or descending (&lt;). | (optional) defaults to undefined
 **offset** | [**number**] | Optional starting point for the page of data. | (optional) defaults to undefined
 **limit** | [**number**] | Optional page size. | (optional) defaults to undefined


### Return type

**Workflowv3CaseListResponse**

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

# **workflowGetCasesCount**
> Workflowv3GetCasesCountResponse workflowGetCasesCount(workflowv3GetCasesCountRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetCasesCountRequest = {
  // Workflowv3GetCasesCountRequest
  workflowv3GetCasesCountRequest: {
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
  },
};

apiInstance.workflowGetCasesCount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3GetCasesCountRequest** | **Workflowv3GetCasesCountRequest**|  |


### Return type

**Workflowv3GetCasesCountResponse**

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

# **workflowGetFilename**
> Workflowv3GetFilenameResponse workflowGetFilename()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetFilenameRequest = {
  // string | Can be \"*\" if JWT token contains the case_id.
  caseId: "case_id_example",
  // string | Can be \"*\" if JWT token contains the task_id.
  taskId: "task_id_example",
};

apiInstance.workflowGetFilename(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | [**string**] | Can be \&quot;*\&quot; if JWT token contains the case_id. | defaults to undefined
 **taskId** | [**string**] | Can be \&quot;*\&quot; if JWT token contains the task_id. | defaults to undefined


### Return type

**Workflowv3GetFilenameResponse**

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

# **workflowGetJobsCount**
> Workflowv3GetJobsCountResponse workflowGetJobsCount(workflowv3GetJobsCountRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetJobsCountRequest = {
  // string | Case ID - can be * for all
  caseId: "case_id_example",
  // Workflowv3GetJobsCountRequest
  workflowv3GetJobsCountRequest: {
    caseId: "caseId_example",
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
  },
};

apiInstance.workflowGetJobsCount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3GetJobsCountRequest** | **Workflowv3GetJobsCountRequest**|  |
 **caseId** | [**string**] | Case ID - can be * for all | defaults to undefined


### Return type

**Workflowv3GetJobsCountResponse**

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

# **workflowGetReportResult**
> Workflowv3GetReportResultResponse workflowGetReportResult()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetReportResultRequest = {
  // string | ID to get the case  (read-only).
  caseId: "case_id_example",
  // string | ID to get the task for case(read-only).
  taskId: "task_id_example",
  // number | Optional starting point for the page of data. (optional)
  offset: 1,
  // number | Optional page size. (optional)
  limit: 1,
};

apiInstance.workflowGetReportResult(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | [**string**] | ID to get the case  (read-only). | defaults to undefined
 **taskId** | [**string**] | ID to get the task for case(read-only). | defaults to undefined
 **offset** | [**number**] | Optional starting point for the page of data. | (optional) defaults to undefined
 **limit** | [**number**] | Optional page size. | (optional) defaults to undefined


### Return type

**Workflowv3GetReportResultResponse**

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

# **workflowGetTasks**
> Workflowv3TaskListResponse workflowGetTasks()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetTasksRequest = {
  // string | Mandaroty: The parent case which contains the tasks.
  caseId: "case_id_example",
  // string | Optional: task_id to return an array of one. (optional)
  taskId: "task_id_example",
};

apiInstance.workflowGetTasks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **caseId** | [**string**] | Mandaroty: The parent case which contains the tasks. | defaults to undefined
 **taskId** | [**string**] | Optional: task_id to return an array of one. | (optional) defaults to undefined


### Return type

**Workflowv3TaskListResponse**

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

# **workflowGetTasksCount**
> Workflowv3GetTasksCountResponse workflowGetTasksCount(workflowv3GetTasksCountRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowGetTasksCountRequest = {
  // string | Case ID - can be * for all
  caseId: "case_id_example",
  // Workflowv3GetTasksCountRequest
  workflowv3GetTasksCountRequest: {
    caseId: "caseId_example",
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
  },
};

apiInstance.workflowGetTasksCount(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3GetTasksCountRequest** | **Workflowv3GetTasksCountRequest**|  |
 **caseId** | [**string**] | Case ID - can be * for all | defaults to undefined


### Return type

**Workflowv3GetTasksCountResponse**

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

# **workflowSearchCases**
> Workflowv3CaseListResponse workflowSearchCases(workflowv3SearchCasesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowSearchCasesRequest = {
  // Workflowv3SearchCasesRequest
  workflowv3SearchCasesRequest: {
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
    limit: 1,
    offset: 1,
    withLatest: true,
  },
};

apiInstance.workflowSearchCases(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3SearchCasesRequest** | **Workflowv3SearchCasesRequest**|  |


### Return type

**Workflowv3CaseListResponse**

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

# **workflowSearchReports**
> Workflowv3SearchReportsResponse workflowSearchReports(workflowv3SearchCasesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowSearchReportsRequest = {
  // Workflowv3SearchCasesRequest
  workflowv3SearchCasesRequest: {
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
    limit: 1,
    offset: 1,
    withLatest: true,
  },
};

apiInstance.workflowSearchReports(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3SearchCasesRequest** | **Workflowv3SearchCasesRequest**|  |


### Return type

**Workflowv3SearchReportsResponse**

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

# **workflowSearchTasks**
> Workflowv3TaskListResponse workflowSearchTasks(workflowv3SearchTasksRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowSearchTasksRequest = {
  // string | Case ID - can be * for all
  caseId: "case_id_example",
  // Workflowv3SearchTasksRequest
  workflowv3SearchTasksRequest: {
    caseId: "caseId_example",
    filter: {
      assignedToMe: true,
      assignedToMyRoles: true,
      dateCreated: new Date('1970-01-01T00:00:00.00Z'),
      dateCreatedOperator: "IGNORE",
      dateDue: new Date('1970-01-01T00:00:00.00Z'),
      dateDueOperator: "IGNORE",
      filterColumns: [
        {
          headerName: "headerName_example",
          operatorType: "UNDEFINED_OPERATOR_TYPE",
          values: [
            "values_example",
          ],
        },
      ],
      priority: "UNDEFINED_PRIORITY",
      priorityOperator: "IGNORE",
      reportId: "reportId_example",
      scheduledJobId: [
        "scheduledJobId_example",
      ],
      scheduledTaskId: [
        "scheduledTaskId_example",
      ],
      status: "UNDEFINED_STATUS",
      statusOperator: "IGNORE",
      tags: [
        "tags_example",
      ],
    },
    limit: 1,
    offset: 1,
    sortField: "sortField_example",
    sortOrder: "UNDEFINED_ORDER_BY",
    taskId: "taskId_example",
  },
};

apiInstance.workflowSearchTasks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3SearchTasksRequest** | **Workflowv3SearchTasksRequest**|  |
 **caseId** | [**string**] | Case ID - can be * for all | defaults to undefined


### Return type

**Workflowv3TaskListResponse**

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

# **workflowUpdateCases**
> Workflowv3UpdateCasesResponse workflowUpdateCases(workflowv3UpdateCasesRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowUpdateCasesRequest = {
  // Workflowv3UpdateCasesRequest
  workflowv3UpdateCasesRequest: {
    cases: [
      {
        artifacts: [
          "artifacts_example",
        ],
        assignments: [
          {
            label: "label_example",
            templateId: "templateId_example",
            type: "UNDEFINED_ENTITY_TYPE",
            value: "value_example",
          },
        ],
        caseId: "caseId_example",
        comment: "comment_example",
        dateDue: new Date('1970-01-01T00:00:00.00Z'),
        description: "description_example",
        priority: "UNDEFINED_PRIORITY",
        status: "UNDEFINED_STATUS",
        title: "title_example",
      },
    ],
    updateFields: [
      "updateFields_example",
    ],
  },
};

apiInstance.workflowUpdateCases(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3UpdateCasesRequest** | **Workflowv3UpdateCasesRequest**|  |


### Return type

**Workflowv3UpdateCasesResponse**

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

# **workflowUpdateTasks**
> Workflowv3UpdateTasksResponse workflowUpdateTasks(workflowv3UpdateTasksRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .WorkflowApi(configuration);

let body:.WorkflowApiWorkflowUpdateTasksRequest = {
  // string | Update tasks belonging to common parent.
  caseId: "case_id_example",
  // Workflowv3UpdateTasksRequest
  workflowv3UpdateTasksRequest: {
    caseId: "caseId_example",
    tasks: [
      {
        assignments: [
          {
            label: "label_example",
            templateId: "templateId_example",
            type: "UNDEFINED_ENTITY_TYPE",
            value: "value_example",
          },
        ],
        comment: "comment_example",
        dateDue: new Date('1970-01-01T00:00:00.00Z'),
        dependsOn: [
          "dependsOn_example",
        ],
        description: "description_example",
        investigationLinks: [
          {
            display: "display_example",
            id: "id_example",
            type: "type_example",
          },
        ],
        justification: "justification_example",
        priority: "UNDEFINED_PRIORITY",
        responseTemplate: {
          display: "display_example",
          id: "id_example",
          type: "type_example",
        },
        reviewAction: "reviewAction_example",
        status: "UNDEFINED_STATUS",
        tags: [
          "tags_example",
        ],
        taskId: "taskId_example",
        title: "title_example",
      },
    ],
    updateFields: [
      "updateFields_example",
    ],
    workflowId: "workflowId_example",
  },
};

apiInstance.workflowUpdateTasks(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowv3UpdateTasksRequest** | **Workflowv3UpdateTasksRequest**|  |
 **caseId** | [**string**] | Update tasks belonging to common parent. | defaults to undefined


### Return type

**Workflowv3UpdateTasksResponse**

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





