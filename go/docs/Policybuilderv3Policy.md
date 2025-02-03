# Policybuilderv3Policy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActivationStatus** | **int32** | activation_status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. | [optional] [default to null]
**ContainsRuleTypes** | [**[]Policybuilderv3RuleType**](policybuilderv3RuleType.md) | Indicates different type of rule types contained by the policy. | [optional] [default to null]
**ControlFlow** | [***Policybuilderv3ControlFlow**](policybuilderv3ControlFlow.md) |  | [optional] [default to null]
**EdgeActivationInfo** | [**[]Policybuilderv3EdgeActivationObject**](policybuilderv3EdgeActivationObject.md) |  | [optional] [default to null]
**InstalledFlag** | **bool** | Flag to indicate whether policy is installed or not. | [optional] [default to null]
**InstalledOrder** | **int32** | Variable to indicate the order of the installed policy. | [optional] [default to null]
**InstalledTimestamp** | **string** | Timestamp to indicate when the policy was installed. | [optional] [default to null]
**LastEditedTimestamp** | **string** | Timestamp to indicate when the policy was last edited. | [optional] [default to null]
**LogFlat** | **bool** | Flag to indicate whether the policy has log flat enabled or not. | [optional] [default to null]
**NoOfRules** | **int32** | Indicates number of rules in the policy. | [optional] [default to null]
**PolicyId** | **string** | Policy Id. | [optional] [default to null]
**PolicyImportIssue** | [***Policybuilderv3ImportIssue**](policybuilderv3ImportIssue.md) |  | [optional] [default to null]
**PolicyImportState** | [***Policybuilderv3ImportState**](policybuilderv3ImportState.md) |  | [optional] [default to null]
**PolicyName** | **string** | Policy Name. | [optional] [default to null]
**PolicyType** | [***Policybuilderv3PolicyType**](policybuilderv3PolicyType.md) |  | [optional] [default to null]
**RulesOnFlat** | **bool** | Flag to indicate whether the policy has rules on flat enabled or not. | [optional] [default to null]
**Template** | **bool** | Flag to indicate whether the policy is a template policy or not. | [optional] [default to null]
**UiSequence** | **int32** | Sequence in which the policy will be displayed in the UI. | [optional] [default to null]
**Version** | **int32** | Policy version for different versions of the policy. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

