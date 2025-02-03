# Policybuilderv3CreateUpdatePolicyResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActivationStatus** | **int32** | activation_status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. | [optional] [default to null]
**EdgeActivationInfo** | [***Policybuilderv3EdgeActivationObject**](policybuilderv3EdgeActivationObject.md) |  | [optional] [default to null]
**InstalledFlag** | **bool** | Flag to indicate whether policy is installed or not. | [optional] [default to null]
**PolicyId** | **string** | Policy id of the created or updated policy. | [optional] [default to null]
**PolicyName** | **string** | Policy Name for the created or updated policy. | [optional] [default to null]
**Rules** | [**[]Policybuilderv3Rule**](policybuilderv3Rule.md) | Rules contained by the policy. | [optional] [default to null]
**Status** | [***Policybuilderv3StatusResponseBase**](policybuilderv3StatusResponseBase.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

