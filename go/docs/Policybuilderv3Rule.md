# Policybuilderv3Rule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Actions** | [**[]Policybuilderv3Action**](policybuilderv3Action.md) | Action object of the actions in the rules. | [optional] [default to null]
**ContinueToNextRule** | **bool** | Flag indicating whether continue to next rule is on/off. | [optional] [default to null]
**EmptyGroups** | **[]int32** | Variable that contains group ids being used by the rule that contains 0 members. | [optional] [default to null]
**InvalidActions** | [**[]Policybuilderv3Action**](policybuilderv3Action.md) |  | [optional] [default to null]
**InvalidParameters** | [**[]Policybuilderv3RuleParameter**](policybuilderv3RuleParameter.md) |  | [optional] [default to null]
**Parameters** | [**[]Policybuilderv3RuleParameter**](policybuilderv3RuleParameter.md) | Parameter object which are used in the rule. | [optional] [default to null]
**PolicyId** | **string** | Policy Id. | [optional] [default to null]
**RuleId** | **string** | Rule id. | [optional] [default to null]
**RuleKey** | **string** |  | [optional] [default to null]
**RuleName** | **string** | Rule name. | [optional] [default to null]
**RuleOrder** | **int32** | Integer to indicate the order of the rule in the policy. | [optional] [default to null]
**RuleType** | [***Policybuilderv3RuleType**](policybuilderv3RuleType.md) |  | [optional] [default to null]
**Severity** | [***Policybuilderv3RuleSeverity**](policybuilderv3RuleSeverity.md) |  | [optional] [default to null]
**Tags** | **[]string** | Variable that contains tags assosicated with the rule. | [optional] [default to null]
**Template** | **bool** | Flag to indicate if the rule is a template rule. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

