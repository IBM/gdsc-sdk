

# Assetsv3PolicyUpdate

Create and update policy request message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activationStatus** | **Integer** | Activation status identifier. |  [optional] |
|**deletedRuleIds** | **List&lt;String&gt;** | The rule ids which are supposed to be deleted on a update policy request. |  [optional] |
|**installedFlag** | **Boolean** | Flag to indicate whether policy is installed or not. |  [optional] |
|**installedTimestamp** | **String** | Timestamp to indicate when the policy was installed. |  [optional] |
|**lastEditedTimestamp** | **String** | Timestamp to indicate when the policy was last edited. |  [optional] |
|**policyId** | **String** | Policy ID. |  [optional] |
|**policyName** | **String** | Policy Name. |  [optional] |
|**policySequence** | **Integer** |  |  [optional] |
|**rules** | [**List&lt;Assetsv3Rule&gt;**](Assetsv3Rule.md) |  |  [optional] |
|**updatedRuleIds** | **List&lt;String&gt;** | The rule ids which have been updated on a update policy request. |  [optional] |



