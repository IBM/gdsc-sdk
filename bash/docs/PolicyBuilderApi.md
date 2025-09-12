# PolicyBuilderApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**policyBuilderClonePolicy**](PolicyBuilderApi.md#policyBuilderClonePolicy) | **POST** /api/v3/policies/clone/{policy_id} | Summary: Clone policy
Description: Clone a policy.
[**policyBuilderCreatePolicy**](PolicyBuilderApi.md#policyBuilderCreatePolicy) | **POST** /api/v3/policies | Summary: Create policy
Description: Create Policy returns response code and message.
[**policyBuilderDeleteGdpSyncEntry**](PolicyBuilderApi.md#policyBuilderDeleteGdpSyncEntry) | **DELETE** /api/v3/policies/sync_entry | Summary: Delete GDP policy sync entry
Description: Deletes GDP policy from sync collection
[**policyBuilderDeletePolicies**](PolicyBuilderApi.md#policyBuilderDeletePolicies) | **DELETE** /api/v3/policies | Summary: Delete policies
Description: Delete Policy returns response code and message.
[**policyBuilderGetGdpPolicyMetaData**](PolicyBuilderApi.md#policyBuilderGetGdpPolicyMetaData) | **GET** /api/v3/policies/metadata_list | Summary: Get GDP policy summary information
Description: Get GDP&#39;s CM&#39;s policy summary from mogodb
[**policyBuilderGetPolicies**](PolicyBuilderApi.md#policyBuilderGetPolicies) | **GET** /api/v3/policies | Summary: Get policies
Description: Return a list of policies to the caller.
[**policyBuilderGetPolicyDetails**](PolicyBuilderApi.md#policyBuilderGetPolicyDetails) | **GET** /api/v3/policies/{policy_id}/details | Summary: Get policy details
Description: Return a list of rules inside the policy.
[**policyBuilderGetPolicyNamesFromRuleIDs**](PolicyBuilderApi.md#policyBuilderGetPolicyNamesFromRuleIDs) | **POST** /api/v3/policies/policy_names | Summary: GetPolicy names from rule IDs
Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
[**policyBuilderGetPolicySyncList**](PolicyBuilderApi.md#policyBuilderGetPolicySyncList) | **GET** /api/v3/policies/sync_list | Summary: Get list of synced polices
Description: Returns the list and status of sync entries
[**policyBuilderGetPolicyVersion**](PolicyBuilderApi.md#policyBuilderGetPolicyVersion) | **GET** /api/v3/policies/{policy_id}/details/versions/{version} | Summary: Get a particular version of the policy
Description: Returns a particular version of policy and response code and message
[**policyBuilderGetPolicyVersionsInfo**](PolicyBuilderApi.md#policyBuilderGetPolicyVersionsInfo) | **GET** /api/v3/policies/{policy_id}/versions/metdata | Summary: Gets policy versions info
Description: Returns information of all versions of a policy and response code and message
[**policyBuilderGetReceivers**](PolicyBuilderApi.md#policyBuilderGetReceivers) | **GET** /api/v3/policies/receivers | Summary: Get receivers
Description: Get all the receivers associated with actions.
[**policyBuilderGetRuleMetadata**](PolicyBuilderApi.md#policyBuilderGetRuleMetadata) | **GET** /api/v3/rules/metadata | Summary: Get rule metadata
Description: Return a list of rule parameters and actions to the caller.
[**policyBuilderInsertGdpPolicy**](PolicyBuilderApi.md#policyBuilderInsertGdpPolicy) | **POST** /api/v3/policies/sync_entry | Summary: Insert GDP policy sync entry
Description: Inserts GDP policy&#39;s name into sync collection
[**policyBuilderInsertGdpPolicyMetaData**](PolicyBuilderApi.md#policyBuilderInsertGdpPolicyMetaData) | **POST** /api/v3/central_managers/{central_manager_id}/policies/policy_metadata | Summary: Insert GDP policy summaries
Description: Inserts GDP&#39;s CM&#39;s policy summary information into mogodb. (This API is called from GDP only)
[**policyBuilderInstallPolicies**](PolicyBuilderApi.md#policyBuilderInstallPolicies) | **PUT** /api/v3/policies/install | Summary: Install policies
Description: Activate Policies request performs activations.
[**policyBuilderIntegrationCheck**](PolicyBuilderApi.md#policyBuilderIntegrationCheck) | **GET** /api/v3/policies/integration_check/{integration_id} | Summary: Integration check
Description: Check if integration id is being used in policies.
[**policyBuilderPoliciesGroups**](PolicyBuilderApi.md#policyBuilderPoliciesGroups) | **GET** /api/v3/policies/groups | Summary: Policies groups
Description: Get policy groups.
[**policyBuilderRuleValidation**](PolicyBuilderApi.md#policyBuilderRuleValidation) | **POST** /api/v3/rules/validate | Summary: Rule validation
Description: Validate a rule parameters and actions.
[**policyBuilderStorePoliciesGdp**](PolicyBuilderApi.md#policyBuilderStorePoliciesGdp) | **POST** /api/v3/policies/{central_manager_id} | Summary: Store policies Gdp
Description: Store policies.  (This API is called from GDP only)
[**policyBuilderUpdatePolicy**](PolicyBuilderApi.md#policyBuilderUpdatePolicy) | **PUT** /api/v3/policies | Summary: Update policy
Description: Update Policy returns response code and message.



## policyBuilderClonePolicy

Summary: Clone policy
Description: Clone a policy.

### Example

```bash
 policyBuilderClonePolicy policy_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **string** | Policy id that needs to be cloned. | [default to null]
 **policybuilderv3ClonePolicyRequest** | [**Policybuilderv3ClonePolicyRequest**](Policybuilderv3ClonePolicyRequest.md) |  |

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderCreatePolicy

Summary: Create policy
Description: Create Policy returns response code and message.

### Example

```bash
 policyBuilderCreatePolicy
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3CreateUpdatePolicyRequest** | [**Policybuilderv3CreateUpdatePolicyRequest**](Policybuilderv3CreateUpdatePolicyRequest.md) |  |

### Return type

[**Policybuilderv3CreateUpdatePolicyResponse**](Policybuilderv3CreateUpdatePolicyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderDeleteGdpSyncEntry

Summary: Delete GDP policy sync entry
Description: Deletes GDP policy from sync collection

### Example

```bash
 policyBuilderDeleteGdpSyncEntry  Specify as:  sync_ids=value1 sync_ids=value2 sync_ids=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncIds** | [**array[string]**](string.md) | Policy sync entry id to delete from sync. | [optional] [default to null]

### Return type

[**Policybuilderv3DeleteGdpPolicySyncResponse**](Policybuilderv3DeleteGdpPolicySyncResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderDeletePolicies

Summary: Delete policies
Description: Delete Policy returns response code and message.

### Example

```bash
 policyBuilderDeletePolicies  Specify as:  policy_ids=value1 policy_ids=value2 policy_ids=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyIds** | [**array[string]**](string.md) | Policy ids. | [optional] [default to null]

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderGetGdpPolicyMetaData

Summary: Get GDP policy summary information
Description: Get GDP's CM's policy summary from mogodb

### Example

```bash
 policyBuilderGetGdpPolicyMetaData
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Policybuilderv3GetGdpPolicyMetaDataResponse**](Policybuilderv3GetGdpPolicyMetaDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderGetPolicies

Summary: Get policies
Description: Return a list of policies to the caller.

### Example

```bash
 policyBuilderGetPolicies
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Policybuilderv3GetPoliciesResponse**](Policybuilderv3GetPoliciesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderGetPolicyDetails

Summary: Get policy details
Description: Return a list of rules inside the policy.

### Example

```bash
 policyBuilderGetPolicyDetails policy_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **string** | Policy id. | [default to null]

### Return type

[**Policybuilderv3GetPolicyDetailsResponse**](Policybuilderv3GetPolicyDetailsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderGetPolicyNamesFromRuleIDs

Summary: GetPolicy names from rule IDs
Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.

### Example

```bash
 policyBuilderGetPolicyNamesFromRuleIDs
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3GetPolicyNamesFromRuleIDsRequest** | [**Policybuilderv3GetPolicyNamesFromRuleIDsRequest**](Policybuilderv3GetPolicyNamesFromRuleIDsRequest.md) |  |

### Return type

[**Policybuilderv3GetPolicyNamesFromRuleIDsResponse**](Policybuilderv3GetPolicyNamesFromRuleIDsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderGetPolicySyncList

Summary: Get list of synced polices
Description: Returns the list and status of sync entries

### Example

```bash
 policyBuilderGetPolicySyncList
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Policybuilderv3GetPolicySyncListResponse**](Policybuilderv3GetPolicySyncListResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderGetPolicyVersion

Summary: Get a particular version of the policy
Description: Returns a particular version of policy and response code and message

### Example

```bash
 policyBuilderGetPolicyVersion policy_id=value version=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **string** | Policy id of the requested policy | [default to null]
 **version** | **integer** | Requested version number of the policy | [default to null]

### Return type

[**Policybuilderv3GetPolicyVersionResponse**](Policybuilderv3GetPolicyVersionResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderGetPolicyVersionsInfo

Summary: Gets policy versions info
Description: Returns information of all versions of a policy and response code and message

### Example

```bash
 policyBuilderGetPolicyVersionsInfo policy_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyId** | **string** | Policy id of the requested policy | [default to null]

### Return type

[**Policybuilderv3GetPolicyVersionsInfoResponse**](Policybuilderv3GetPolicyVersionsInfoResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderGetReceivers

Summary: Get receivers
Description: Get all the receivers associated with actions.

### Example

```bash
 policyBuilderGetReceivers  Specify as:  action_id=value1 action_id=value2 action_id=...  validate_cache=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionId** | [**array[string]**](string.md) | Action id. | [optional] [default to null]
 **validateCache** | **boolean** | Flag that indicates if cache needs to be validated. | [optional] [default to null]

### Return type

[**Policybuilderv3GetReceiversResponse**](Policybuilderv3GetReceiversResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderGetRuleMetadata

Summary: Get rule metadata
Description: Return a list of rule parameters and actions to the caller.

### Example

```bash
 policyBuilderGetRuleMetadata  rule_type=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleType** | **string** | Rule type integer to indicate rule type. | [optional] [default to ACCESS]

### Return type

[**Policybuilderv3RuleMetadataResponse**](Policybuilderv3RuleMetadataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderInsertGdpPolicy

Summary: Insert GDP policy sync entry
Description: Inserts GDP policy's name into sync collection

### Example

```bash
 policyBuilderInsertGdpPolicy
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3InsertGdpPolicySyncRequest** | [**Policybuilderv3InsertGdpPolicySyncRequest**](Policybuilderv3InsertGdpPolicySyncRequest.md) |  |

### Return type

[**Policybuilderv3InsertGdpPolicySyncResponse**](Policybuilderv3InsertGdpPolicySyncResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderInsertGdpPolicyMetaData

Summary: Insert GDP policy summaries
Description: Inserts GDP's CM's policy summary information into mogodb. (This API is called from GDP only)

### Example

```bash
 policyBuilderInsertGdpPolicyMetaData central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **policybuilderv3InsertGdpPolicyMetaDataRequest** | [**Policybuilderv3InsertGdpPolicyMetaDataRequest**](Policybuilderv3InsertGdpPolicyMetaDataRequest.md) |  |

### Return type

[**Policybuilderv3InsertGdpPolicyMetaDataResponse**](Policybuilderv3InsertGdpPolicyMetaDataResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderInstallPolicies

Summary: Install policies
Description: Activate Policies request performs activations.

### Example

```bash
 policyBuilderInstallPolicies
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3InstallPoliciesRequest** | [**Policybuilderv3InstallPoliciesRequest**](Policybuilderv3InstallPoliciesRequest.md) |  |

### Return type

[**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderIntegrationCheck

Summary: Integration check
Description: Check if integration id is being used in policies.

### Example

```bash
 policyBuilderIntegrationCheck integration_id=value  template_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationId** | **string** | Integration Id to check if it is being used in policies. | [default to null]
 **templateId** | **string** | Template Id to check if it is being used in policies. | [optional] [default to null]

### Return type

[**Policybuilderv3GetIntegrationCheckResponse**](Policybuilderv3GetIntegrationCheckResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderPoliciesGroups

Summary: Policies groups
Description: Get policy groups.

### Example

```bash
 policyBuilderPoliciesGroups  Specify as:  group_ids=value1 group_ids=value2 group_ids=...
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | [**array[string]**](string.md) | Group ids to check if they are being used in policies. | [optional] [default to null]

### Return type

[**Policybuilderv3GetPoliciesGroupsResponse**](Policybuilderv3GetPoliciesGroupsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderRuleValidation

Summary: Rule validation
Description: Validate a rule parameters and actions.

### Example

```bash
 policyBuilderRuleValidation
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3GetRuleValidationRequest** | [**Policybuilderv3GetRuleValidationRequest**](Policybuilderv3GetRuleValidationRequest.md) |  |

### Return type

[**Policybuilderv3StandardCRUDResponse**](Policybuilderv3StandardCRUDResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderStorePoliciesGdp

Summary: Store policies Gdp
Description: Store policies.  (This API is called from GDP only)

### Example

```bash
 policyBuilderStorePoliciesGdp central_manager_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **centralManagerId** | **string** | ID of central manager. | [default to null]
 **policybuilderv3StorePolicyGdpRequest** | [**Policybuilderv3StorePolicyGdpRequest**](Policybuilderv3StorePolicyGdpRequest.md) |  |

### Return type

[**Policybuilderv3StorePolicyGdpResponse**](Policybuilderv3StorePolicyGdpResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## policyBuilderUpdatePolicy

Summary: Update policy
Description: Update Policy returns response code and message.

### Example

```bash
 policyBuilderUpdatePolicy
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policybuilderv3CreateUpdatePolicyRequest** | [**Policybuilderv3CreateUpdatePolicyRequest**](Policybuilderv3CreateUpdatePolicyRequest.md) |  |

### Return type

[**Policybuilderv3CreateUpdatePolicyResponse**](Policybuilderv3CreateUpdatePolicyResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth), [ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

