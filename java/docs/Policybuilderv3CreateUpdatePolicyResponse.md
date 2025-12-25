

# Policybuilderv3CreateUpdatePolicyResponse

Return object for creating or updating a policy.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activationStatus** | **Integer** | activation_status identifier: 1001 -&gt; install with no issues, 1002-&gt; installed with issues, 1003 -&gt; not installed. |  [optional] |
|**edgeActivationInfo** | [**List&lt;Policybuilderv3EdgeActivationObject&gt;**](Policybuilderv3EdgeActivationObject.md) |  |  [optional] |
|**installedFlag** | **Boolean** | Flag to indicate whether policy is installed or not. |  [optional] |
|**policyId** | **String** | Policy id of the created or updated policy. |  [optional] |
|**policyName** | **String** | Policy Name for the created or updated policy. |  [optional] |
|**rules** | [**List&lt;Policybuilderv3Rule&gt;**](Policybuilderv3Rule.md) | Rules contained by the policy. |  [optional] |
|**status** | [**Policybuilderv3StatusResponseBase**](Policybuilderv3StatusResponseBase.md) |  |  [optional] |



