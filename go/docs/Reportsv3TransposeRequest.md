# Reportsv3TransposeRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ConstructIds** | **[]string** | The list of construct IDs to get the SQLs for. | [optional] [default to null]
**ContributionIndicators** | **string** | The contribution indicators represented as a string. | [optional] [default to null]
**ContributionPointers** | [**[]Reportsv3ContributionPointersInfoObject**](reportsv3ContributionPointersInfoObject.md) | The list of contribution pointers. | [optional] [default to null]
**Limit** | **string** | The max amount of rows to return for pagination. Required if report query uses offset and limit parameters. | [optional] [default to null]
**Offset** | **string** | The amount to offset the rows by for pagination. Required if report query uses offset and limit parameters. | [optional] [default to null]
**Summary** | **bool** | Whether or not to run Summary query. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

