# Policybuilderv3GetPolicyDetailsResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActivationStatus** | **int32** | activation_status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. | [optional] [default to null]
**ControlFlow** | [***Policybuilderv3ControlFlow**](policybuilderv3ControlFlow.md) |  | [optional] [default to null]
**InstalledFlag** | **bool** | Flag to indicate whether policy is installed or not. | [optional] [default to null]
**PolicyImportIssue** | [***Policybuilderv3ImportIssue**](policybuilderv3ImportIssue.md) |  | [optional] [default to null]
**PolicyImportState** | [***Policybuilderv3ImportState**](policybuilderv3ImportState.md) |  | [optional] [default to null]
**PolicyInfo** | [***Policybuilderv3Policy**](policybuilderv3Policy.md) |  | [optional] [default to null]
**PolicyName** | **string** |  | [optional] [default to null]
**Rules** | [**[]Policybuilderv3Rule**](policybuilderv3Rule.md) | Rules contained by the policy. | [optional] [default to null]
**Status** | [***Policybuilderv3StatusResponseBase**](policybuilderv3StatusResponseBase.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

