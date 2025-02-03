

# Policybuilderv3RuleParameterMetadata

Message format for RuleParameter Metadata.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**defaultValue** | **String** | Default value. |  [optional] |
|**description** | **String** |  |  [optional] |
|**groupTypeId** | **Integer** | Group type id. |  [optional] |
|**hasEvery** | **String** | Indicating and populating parameter name if it supports every operator. |  [optional] |
|**hasGroup** | **String** | Indicating and populating parameter name if it supports group. |  [optional] |
|**hasNot** | **String** | Indicating and populating parameter name if it supports a not operator. |  [optional] |
|**label** | **String** | UI label for parameter. |  [optional] |
|**mandatory** | **Boolean** | Flag to indicate if the parameter is mandatory or not. |  [optional] |
|**parameterName** | **String** | Parameter name. |  [optional] |
|**possibleValues** | [**List&lt;Policybuilderv3PossibleValueObj&gt;**](Policybuilderv3PossibleValueObj.md) | Possible value length of the rule parameter. |  [optional] |
|**relationships** | [**List&lt;Policybuilderv3ParameterRelationShip&gt;**](Policybuilderv3ParameterRelationShip.md) | Parameter relationship object. |  [optional] |
|**ruleCategory** | **String** | Category of the rule. |  [optional] |
|**ruleType** | **Policybuilderv3RuleType** |  |  [optional] |
|**standaloneParameter** | **Boolean** | If the parameter is standalone. |  [optional] |
|**supportedDbTypes** | **List&lt;String&gt;** | Stores all the supported db types. |  [optional] |
|**type** | **String** | Type of parameter. |  [optional] |
|**valueLength** | **Integer** | Maximum value of the parameter value. |  [optional] |



