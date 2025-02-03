# {{classname}}

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PolicyBuilderClonePolicy**](PolicyBuilderApi.md#PolicyBuilderClonePolicy) | **Post** /api/v3/policies/clone/{policy_id} | Summary: Clone policy Description: Clone a policy.
[**PolicyBuilderCreatePolicy**](PolicyBuilderApi.md#PolicyBuilderCreatePolicy) | **Post** /api/v3/policies | Summary: Create policy Description: Create Policy returns response code and message.
[**PolicyBuilderDeleteGdpSyncEntry**](PolicyBuilderApi.md#PolicyBuilderDeleteGdpSyncEntry) | **Delete** /api/v3/policies/sync_entry | Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection
[**PolicyBuilderDeletePolicies**](PolicyBuilderApi.md#PolicyBuilderDeletePolicies) | **Delete** /api/v3/policies | Summary: Delete policies Description: Delete Policy returns response code and message.
[**PolicyBuilderGetGdpPolicyMetaData**](PolicyBuilderApi.md#PolicyBuilderGetGdpPolicyMetaData) | **Get** /api/v3/policies/metadata_list | Summary: Get GDP policy summary information Description: Get GDP&#x27;s CM&#x27;s policy summary from mogodb
[**PolicyBuilderGetPolicies**](PolicyBuilderApi.md#PolicyBuilderGetPolicies) | **Get** /api/v3/policies | Summary: Get policies Description: Return a list of policies to the caller.
[**PolicyBuilderGetPolicyDetails**](PolicyBuilderApi.md#PolicyBuilderGetPolicyDetails) | **Get** /api/v3/policies/{policy_id}/details | Summary: Get policy details Description: Return a list of rules inside the policy.
[**PolicyBuilderGetPolicyNamesFromRuleIDs**](PolicyBuilderApi.md#PolicyBuilderGetPolicyNamesFromRuleIDs) | **Post** /api/v3/policies/policy_names | Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.
[**PolicyBuilderGetPolicySyncList**](PolicyBuilderApi.md#PolicyBuilderGetPolicySyncList) | **Get** /api/v3/policies/sync_list | Summary: Get list of synced polices Description: Returns the list and status of sync entries
[**PolicyBuilderGetReceivers**](PolicyBuilderApi.md#PolicyBuilderGetReceivers) | **Get** /api/v3/policies/receivers | Summary: Get receivers Description: Get all the receivers associated with actions.
[**PolicyBuilderGetRuleMetadata**](PolicyBuilderApi.md#PolicyBuilderGetRuleMetadata) | **Get** /api/v3/rules/metadata | Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.
[**PolicyBuilderInsertGdpPolicy**](PolicyBuilderApi.md#PolicyBuilderInsertGdpPolicy) | **Post** /api/v3/policies/sync_entry | Summary: Insert GDP policy sync entry Description: Inserts GDP policy&#x27;s name into sync collection
[**PolicyBuilderInsertGdpPolicyMetaData**](PolicyBuilderApi.md#PolicyBuilderInsertGdpPolicyMetaData) | **Post** /api/v3/central_managers/{central_manager_id}/policies/policy_metadata | Summary: Insert gdp policy summaries Description: Inserts GDP&#x27;s CM&#x27;s policy summary information into mogodb. (This API is called from GDP only)
[**PolicyBuilderInstallPolicies**](PolicyBuilderApi.md#PolicyBuilderInstallPolicies) | **Put** /api/v3/policies/install | Summary: Install policies Description: Activate Policies request performs activations.
[**PolicyBuilderIntegrationCheck**](PolicyBuilderApi.md#PolicyBuilderIntegrationCheck) | **Get** /api/v3/policies/integration_check/{integration_id} | Summary: Integration check Description: Check if integration id is being used in policies.
[**PolicyBuilderPoliciesGroups**](PolicyBuilderApi.md#PolicyBuilderPoliciesGroups) | **Get** /api/v3/policies/groups | Summary: Policies groups Description: Get policy groups.
[**PolicyBuilderRuleValidation**](PolicyBuilderApi.md#PolicyBuilderRuleValidation) | **Post** /api/v3/rules/validate | Summary: Rule validation Description: Validate a rule parameters and actions.
[**PolicyBuilderStorePoliciesGdp**](PolicyBuilderApi.md#PolicyBuilderStorePoliciesGdp) | **Post** /api/v3/policies/{central_manager_id} | Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)

# **PolicyBuilderClonePolicy**
> Policybuilderv3StandardCrudResponse PolicyBuilderClonePolicy(ctx, body, policyId)
Summary: Clone policy Description: Clone a policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Policybuilderv3ClonePolicyRequest**](Policybuilderv3ClonePolicyRequest.md)|  | 
  **policyId** | **string**| Policy id that needs to be cloned. | 

### Return type

[**Policybuilderv3StandardCrudResponse**](policybuilderv3StandardCRUDResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderCreatePolicy**
> Policybuilderv3CreateUpdatePolicyResponse PolicyBuilderCreatePolicy(ctx, body)
Summary: Create policy Description: Create Policy returns response code and message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Policybuilderv3CreateUpdatePolicyRequest**](Policybuilderv3CreateUpdatePolicyRequest.md)|  | 

### Return type

[**Policybuilderv3CreateUpdatePolicyResponse**](policybuilderv3CreateUpdatePolicyResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderDeleteGdpSyncEntry**
> Policybuilderv3DeleteGdpPolicySyncResponse PolicyBuilderDeleteGdpSyncEntry(ctx, optional)
Summary: Delete GDP policy sync entry Description: Deletes GDP policy from sync collection

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PolicyBuilderApiPolicyBuilderDeleteGdpSyncEntryOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PolicyBuilderApiPolicyBuilderDeleteGdpSyncEntryOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncIds** | [**optional.Interface of []string**](string.md)| Policy sync entry id to delete from sync. | 

### Return type

[**Policybuilderv3DeleteGdpPolicySyncResponse**](policybuilderv3DeleteGdpPolicySyncResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderDeletePolicies**
> Policybuilderv3StandardCrudResponse PolicyBuilderDeletePolicies(ctx, optional)
Summary: Delete policies Description: Delete Policy returns response code and message.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PolicyBuilderApiPolicyBuilderDeletePoliciesOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PolicyBuilderApiPolicyBuilderDeletePoliciesOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyIds** | [**optional.Interface of []string**](string.md)| Policy ids. | 

### Return type

[**Policybuilderv3StandardCrudResponse**](policybuilderv3StandardCRUDResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderGetGdpPolicyMetaData**
> Policybuilderv3GetGdpPolicyMetaDataResponse PolicyBuilderGetGdpPolicyMetaData(ctx, )
Summary: Get GDP policy summary information Description: Get GDP's CM's policy summary from mogodb

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Policybuilderv3GetGdpPolicyMetaDataResponse**](policybuilderv3GetGdpPolicyMetaDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderGetPolicies**
> Policybuilderv3GetPoliciesResponse PolicyBuilderGetPolicies(ctx, )
Summary: Get policies Description: Return a list of policies to the caller.

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Policybuilderv3GetPoliciesResponse**](policybuilderv3GetPoliciesResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderGetPolicyDetails**
> Policybuilderv3GetPolicyDetailsResponse PolicyBuilderGetPolicyDetails(ctx, policyId)
Summary: Get policy details Description: Return a list of rules inside the policy.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **policyId** | **string**| Policy id. | 

### Return type

[**Policybuilderv3GetPolicyDetailsResponse**](policybuilderv3GetPolicyDetailsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderGetPolicyNamesFromRuleIDs**
> Policybuilderv3GetPolicyNamesFromRuleIdsResponse PolicyBuilderGetPolicyNamesFromRuleIDs(ctx, body)
Summary: GetPolicy names from rule IDs Description: Return a map where the key is the rule ID and value is the policy name that has the rule ID.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Policybuilderv3GetPolicyNamesFromRuleIdsRequest**](Policybuilderv3GetPolicyNamesFromRuleIdsRequest.md)|  | 

### Return type

[**Policybuilderv3GetPolicyNamesFromRuleIdsResponse**](policybuilderv3GetPolicyNamesFromRuleIDsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderGetPolicySyncList**
> Policybuilderv3GetPolicySyncListResponse PolicyBuilderGetPolicySyncList(ctx, )
Summary: Get list of synced polices Description: Returns the list and status of sync entries

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Policybuilderv3GetPolicySyncListResponse**](policybuilderv3GetPolicySyncListResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderGetReceivers**
> Policybuilderv3GetReceiversResponse PolicyBuilderGetReceivers(ctx, optional)
Summary: Get receivers Description: Get all the receivers associated with actions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PolicyBuilderApiPolicyBuilderGetReceiversOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PolicyBuilderApiPolicyBuilderGetReceiversOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **actionId** | [**optional.Interface of []string**](string.md)| Action id. | 
 **validateCache** | **optional.Bool**| Flag that indicates if cache needs to be validated. | 

### Return type

[**Policybuilderv3GetReceiversResponse**](policybuilderv3GetReceiversResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderGetRuleMetadata**
> Policybuilderv3RuleMetadataResponse PolicyBuilderGetRuleMetadata(ctx, optional)
Summary: Get rule metadata Description: Return a list of rule parameters and actions to the caller.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PolicyBuilderApiPolicyBuilderGetRuleMetadataOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PolicyBuilderApiPolicyBuilderGetRuleMetadataOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ruleType** | **optional.String**| Rule type integer to indicate rule type. | [default to ACCESS]

### Return type

[**Policybuilderv3RuleMetadataResponse**](policybuilderv3RuleMetadataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderInsertGdpPolicy**
> Policybuilderv3InsertGdpPolicySyncResponse PolicyBuilderInsertGdpPolicy(ctx, body)
Summary: Insert GDP policy sync entry Description: Inserts GDP policy's name into sync collection

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Policybuilderv3InsertGdpPolicySyncRequest**](Policybuilderv3InsertGdpPolicySyncRequest.md)|  | 

### Return type

[**Policybuilderv3InsertGdpPolicySyncResponse**](policybuilderv3InsertGdpPolicySyncResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderInsertGdpPolicyMetaData**
> Policybuilderv3InsertGdpPolicyMetaDataResponse PolicyBuilderInsertGdpPolicyMetaData(ctx, body, centralManagerId)
Summary: Insert gdp policy summaries Description: Inserts GDP's CM's policy summary information into mogodb. (This API is called from GDP only)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Policybuilderv3InsertGdpPolicyMetaDataRequest**](Policybuilderv3InsertGdpPolicyMetaDataRequest.md)|  | 
  **centralManagerId** | **string**| ID of central manager. | 

### Return type

[**Policybuilderv3InsertGdpPolicyMetaDataResponse**](policybuilderv3InsertGdpPolicyMetaDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderInstallPolicies**
> Policybuilderv3StatusResponseBase PolicyBuilderInstallPolicies(ctx, body)
Summary: Install policies Description: Activate Policies request performs activations.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Policybuilderv3InstallPoliciesRequest**](Policybuilderv3InstallPoliciesRequest.md)|  | 

### Return type

[**Policybuilderv3StatusResponseBase**](policybuilderv3StatusResponseBase.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderIntegrationCheck**
> Policybuilderv3GetIntegrationCheckResponse PolicyBuilderIntegrationCheck(ctx, integrationId, optional)
Summary: Integration check Description: Check if integration id is being used in policies.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **integrationId** | **string**| Integration Id to check if it is being used in policies. | 
 **optional** | ***PolicyBuilderApiPolicyBuilderIntegrationCheckOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PolicyBuilderApiPolicyBuilderIntegrationCheckOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **templateId** | **optional.String**| Template Id to check if it is being used in policies. | 

### Return type

[**Policybuilderv3GetIntegrationCheckResponse**](policybuilderv3GetIntegrationCheckResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderPoliciesGroups**
> Policybuilderv3GetPoliciesGroupsResponse PolicyBuilderPoliciesGroups(ctx, optional)
Summary: Policies groups Description: Get policy groups.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***PolicyBuilderApiPolicyBuilderPoliciesGroupsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a PolicyBuilderApiPolicyBuilderPoliciesGroupsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupIds** | [**optional.Interface of []string**](string.md)| Group ids to check if they are being used in policies. | 

### Return type

[**Policybuilderv3GetPoliciesGroupsResponse**](policybuilderv3GetPoliciesGroupsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderRuleValidation**
> Policybuilderv3StandardCrudResponse PolicyBuilderRuleValidation(ctx, body)
Summary: Rule validation Description: Validate a rule parameters and actions.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Policybuilderv3GetRuleValidationRequest**](Policybuilderv3GetRuleValidationRequest.md)|  | 

### Return type

[**Policybuilderv3StandardCrudResponse**](policybuilderv3StandardCRUDResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **PolicyBuilderStorePoliciesGdp**
> Policybuilderv3StorePolicyGdpResponse PolicyBuilderStorePoliciesGdp(ctx, body, centralManagerId)
Summary: Store policies Gdp Description: Store policies.  (This API is called from GDP only)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**Policybuilderv3StorePolicyGdpRequest**](Policybuilderv3StorePolicyGdpRequest.md)|  | 
  **centralManagerId** | **string**| ID of central manager. | 

### Return type

[**Policybuilderv3StorePolicyGdpResponse**](policybuilderv3StorePolicyGdpResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

