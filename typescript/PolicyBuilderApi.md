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
[**policyBuilderGetPolicyVersion**](PolicyBuilderApi.md#policyBuilderGetPolicyVersion) | **GET** /api/v3/policies/{policy_id}/details/versions/{version} | Summary: Get a particular version of the policy Description: Returns a particular version of policy and response code and message
[**policyBuilderGetPolicyVersionsInfo**](PolicyBuilderApi.md#policyBuilderGetPolicyVersionsInfo) | **GET** /api/v3/policies/{policy_id}/versions/metdata | Summary: Gets policy versions info Description: Returns information of all versions of a policy and response code and message
[**policyBuilderGetReceivers**](PolicyBuilderApi.md#policyBuilderGetReceivers) | **GET** /api/v3/policies/receivers | Summary: Get receivers Description: Get all the receivers associated with actions.
[**policyBuilderGetRuleMetadata**](PolicyBuilderApi.md#policyBuilderGetRuleMetadata) | **GET** /api/v3/rules/metadata | Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
[**policyBuilderInsertGdpPolicy**](PolicyBuilderApi.md#policyBuilderInsertGdpPolicy) | **POST** /api/v3/policies/sync_entry | Summary: Insert GDP policy sync entry Description: Inserts GDP policy\&#39;s name into sync collection
[**policyBuilderInsertGdpPolicyMetaData**](PolicyBuilderApi.md#policyBuilderInsertGdpPolicyMetaData) | **POST** /api/v3/central_managers/{central_manager_id}/policies/policy_metadata | Summary: Insert GDP policy summaries Description: Inserts GDP\&#39;s CM\&#39;s policy summary information into mogodb. (This API is called from GDP only)
[**policyBuilderInstallPolicies**](PolicyBuilderApi.md#policyBuilderInstallPolicies) | **PUT** /api/v3/policies/install | Summary: Install policies Description: Activate Policies request performs activations.
[**policyBuilderIntegrationCheck**](PolicyBuilderApi.md#policyBuilderIntegrationCheck) | **GET** /api/v3/policies/integration_check/{integration_id} | Summary: Integration check Description: Check if integration id is being used in policies.
[**policyBuilderPoliciesGroups**](PolicyBuilderApi.md#policyBuilderPoliciesGroups) | **GET** /api/v3/policies/groups | Summary: Policies groups Description: Get policy groups.
[**policyBuilderRuleValidation**](PolicyBuilderApi.md#policyBuilderRuleValidation) | **POST** /api/v3/rules/validate | Summary: Rule validation Description: Validate a rule parameters and actions.
[**policyBuilderStorePoliciesGdp**](PolicyBuilderApi.md#policyBuilderStorePoliciesGdp) | **POST** /api/v3/policies/{central_manager_id} | Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)
[**policyBuilderUpdatePolicy**](PolicyBuilderApi.md#policyBuilderUpdatePolicy) | **PUT** /api/v3/policies | Summary: Update policy Description: Update Policy returns response code and message.


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
      productId: "NO_PRODUCT",
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

# **policyBuilderGetPolicyVersion**
> Policybuilderv3GetPolicyVersionResponse policyBuilderGetPolicyVersion()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderGetPolicyVersionRequest = {
  // string | Policy id of the requested policy
  policyId: "policy_id_example",
  // number | Requested version number of the policy
  version: 1,
};

apiInstance.policyBuilderGetPolicyVersion(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | [**string**] | Policy id of the requested policy | defaults to undefined
 **version** | [**number**] | Requested version number of the policy | defaults to undefined


### Return type

**Policybuilderv3GetPolicyVersionResponse**

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

# **policyBuilderGetPolicyVersionsInfo**
> Policybuilderv3GetPolicyVersionsInfoResponse policyBuilderGetPolicyVersionsInfo()


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderGetPolicyVersionsInfoRequest = {
  // string | Policy id of the requested policy
  policyId: "policy_id_example",
};

apiInstance.policyBuilderGetPolicyVersionsInfo(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | [**string**] | Policy id of the requested policy | defaults to undefined


### Return type

**Policybuilderv3GetPolicyVersionsInfoResponse**

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
        edgeIdentifier: "edgeIdentifier_example",
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

# **policyBuilderUpdatePolicy**
> Policybuilderv3CreateUpdatePolicyResponse policyBuilderUpdatePolicy(policybuilderv3CreateUpdatePolicyRequest)


### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .PolicyBuilderApi(configuration);

let body:.PolicyBuilderApiPolicyBuilderUpdatePolicyRequest = {
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
      productId: "NO_PRODUCT",
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

apiInstance.policyBuilderUpdatePolicy(body).then((data:any) => {
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


