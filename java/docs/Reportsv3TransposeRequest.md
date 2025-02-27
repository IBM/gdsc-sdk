

# Reportsv3TransposeRequest

TransposeRequest is the request type for the api call to get the SQls based on the constructIDs.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**constructIds** | **List&lt;String&gt;** | The list of construct IDs to get the SQLs for. |  [optional] |
|**contributionIndicators** | **String** | The contribution indicators represented as a string. |  [optional] |
|**contributionPointers** | [**List&lt;Reportsv3ContributionPointersInfoObject&gt;**](Reportsv3ContributionPointersInfoObject.md) | The list of contribution pointers. |  [optional] |
|**limit** | **String** | The max amount of rows to return for pagination. Required if report query uses offset and limit parameters. |  [optional] |
|**offset** | **String** | The amount to offset the rows by for pagination. Required if report query uses offset and limit parameters. |  [optional] |
|**summary** | **Boolean** | Whether or not to run Summary query. |  [optional] |



