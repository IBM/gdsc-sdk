

# Policybuilderv3GetPolicyDetailsResponse

Policy details response message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activationStatus** | **Integer** | activation_status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. |  [optional] |
|**controlFlow** | **Policybuilderv3ControlFlow** |  |  [optional] |
|**installedFlag** | **Boolean** | Flag to indicate whether policy is installed or not. |  [optional] |
|**policyImportIssue** | **Policybuilderv3ImportIssue** |  |  [optional] |
|**policyImportState** | **Policybuilderv3ImportState** |  |  [optional] |
|**policyName** | **String** |  |  [optional] |
|**rules** | [**List&lt;Policybuilderv3Rule&gt;**](Policybuilderv3Rule.md) | Rules contained by the policy. |  [optional] |
|**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  |  [optional] |



