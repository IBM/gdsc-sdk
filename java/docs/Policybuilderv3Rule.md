

# Policybuilderv3Rule

Message format for rule object.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actions** | [**List&lt;Policybuilderv3Action&gt;**](Policybuilderv3Action.md) | Action object of the actions in the rules. |  [optional] |
|**continueToNextRule** | **Boolean** | Flag indicating whether continue to next rule is on/off. |  [optional] |
|**emptyGroups** | **List&lt;Integer&gt;** | Variable that contains group ids being used by the rule that contains 0 members. |  [optional] |
|**invalidActions** | [**List&lt;Policybuilderv3Action&gt;**](Policybuilderv3Action.md) |  |  [optional] |
|**invalidParameters** | [**List&lt;Policybuilderv3RuleParameter&gt;**](Policybuilderv3RuleParameter.md) |  |  [optional] |
|**parameters** | [**List&lt;Policybuilderv3RuleParameter&gt;**](Policybuilderv3RuleParameter.md) | Parameter object which are used in the rule. |  [optional] |
|**policyId** | **String** | Policy Id. |  [optional] |
|**ruleId** | **String** | Rule id. |  [optional] |
|**ruleKey** | **String** |  |  [optional] |
|**ruleName** | **String** | Rule name. |  [optional] |
|**ruleOrder** | **Integer** | Integer to indicate the order of the rule in the policy. |  [optional] |
|**ruleType** | **Policybuilderv3RuleType** |  |  [optional] |
|**severity** | **Policybuilderv3RuleSeverity** |  |  [optional] |
|**tags** | **List&lt;String&gt;** | Variable that contains tags assosicated with the rule. |  [optional] |
|**template** | **Boolean** | Flag to indicate if the rule is a template rule. |  [optional] |



