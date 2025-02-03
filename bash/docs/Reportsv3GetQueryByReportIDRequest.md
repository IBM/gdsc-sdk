# reportsv3GetQueryByReportIDRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addUnderscoregroupUnderscoreliteral** | **string** | add_group_literal - Add a literal value of a group ID to assist in group population queries | [optional] [default to null]
**addUnderscorejobUnderscoreidUnderscoreliteral** | **string** | add_job_id_literal - Add a literal value of a join ID to the end of the results to assist in population of audit result tables | [optional] [default to null]
**dateUnderscorerange** | [**Reportsv3DateRange**](Reportsv3DateRange.md) |  | [optional] [default to null]
**defaultUnderscorechartUnderscoreexpanded** | **boolean** |  | [optional] [default to null]
**excludeUnderscoregroupUnderscoreid** | **string** | exclude_group_id - Remove current members of a supplied Group ID. Used for group population | [optional] [default to null]
**facetUnderscoreselectedUnderscoreheader** | [**Reportsv3ReportHeader**](Reportsv3ReportHeader.md) |  | [optional] [default to null]
**filterUnderscoreforUnderscorejobUnderscoreid** | **string** | filter_for_job_id - Filter for a specific join id - used in audit result review sql generation | [optional] [default to null]
**jobUnderscoretype** | [**Reportsv3JobType**](Reportsv3JobType.md) |  | [optional] [default to null]
**modelUnderscoretypes** | [**array[Reportsv3ModelType]**](Reportsv3ModelType.md) | Optional: database model types. If it is empty, then the model type will be set to classic | [optional] [default to null]
**reportUnderscoreid** | **string** |  | [optional] [default to null]
**sqlUnderscoretype** | [**Reportsv3SqlType**](Reportsv3SqlType.md) |  | [optional] [default to null]
**tableUnderscorejoinUnderscoreoptimization** | **boolean** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


