

# Policybuilderv3Policy

Policy object for creating/storing the policy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activationStatus** | **Integer** | activation_status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. |  [optional] |
|**containsRuleTypes** | **List&lt;Policybuilderv3RuleType&gt;** | Indicates different type of rule types contained by the policy. |  [optional] |
|**controlFlow** | **Policybuilderv3ControlFlow** |  |  [optional] |
|**edgeActivationInfo** | [**List&lt;Policybuilderv3EdgeActivationObject&gt;**](Policybuilderv3EdgeActivationObject.md) |  |  [optional] |
|**installedFlag** | **Boolean** | Flag to indicate whether policy is installed or not. |  [optional] |
|**installedOrder** | **Integer** | Variable to indicate the order of the installed policy. |  [optional] |
|**installedTimestamp** | **String** | Timestamp to indicate when the policy was installed. |  [optional] |
|**lastEditedTimestamp** | **String** | Timestamp to indicate when the policy was last edited. |  [optional] |
|**logFlat** | **Boolean** | Flag to indicate whether the policy has log flat enabled or not. |  [optional] |
|**noOfRules** | **Integer** | Indicates number of rules in the policy. |  [optional] |
|**policyId** | **String** | Policy Id. |  [optional] |
|**policyImportIssue** | **Policybuilderv3ImportIssue** |  |  [optional] |
|**policyImportState** | **Policybuilderv3ImportState** |  |  [optional] |
|**policyName** | **String** | Policy Name. |  [optional] |
|**policyType** | **Policybuilderv3PolicyType** |  |  [optional] |
|**rulesOnFlat** | **Boolean** | Flag to indicate whether the policy has rules on flat enabled or not. |  [optional] |
|**template** | **Boolean** | Flag to indicate whether the policy is a template policy or not. |  [optional] |
|**uiSequence** | **Integer** | Sequence in which the policy will be displayed in the UI. |  [optional] |
|**version** | **Integer** | Policy version for different versions of the policy. |  [optional] |



