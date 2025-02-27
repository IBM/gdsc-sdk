

# Policybuilderv3PolicyUpdate

Create and update policy request message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activationStatus** | **Integer** | Activation status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. |  [optional] |
|**controlFlow** | **Policybuilderv3ControlFlow** |  |  [optional] |
|**deletedRuleIds** | **List&lt;String&gt;** | The rule ids which are supposed to be deleted on a update policy request. |  [optional] |
|**installedFlag** | **Boolean** | Flag to indicate whether policy is installed or not. |  [optional] |
|**installedOrder** | **Integer** | Variable to indicate the order of the installed policy. |  [optional] |
|**installedTimestamp** | **String** | Timestamp to indicate when the policy was installed. |  [optional] |
|**lastEditedTimestamp** | **String** | Timestamp to indicate when the policy was last edited. |  [optional] |
|**logFlat** | **Boolean** | Flag to indicate whether the policy has log flat enabled or not. |  [optional] |
|**policyId** | **String** | Policy Id. |  [optional] |
|**policyName** | **String** | Policy Name. |  [optional] |
|**policyType** | **Policybuilderv3PolicyType** |  |  [optional] |
|**rules** | [**List&lt;Policybuilderv3Rule&gt;**](Policybuilderv3Rule.md) |  |  [optional] |
|**rulesOnFlat** | **Boolean** | Flag to indicate whether the policy has rules on flat enabled or not. |  [optional] |
|**template** | **Boolean** | Flag to indicate whether the policy is a template policy or not. |  [optional] |
|**version** | **Integer** | Version of the policy. |  [optional] |



