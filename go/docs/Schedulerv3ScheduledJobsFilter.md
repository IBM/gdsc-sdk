# Schedulerv3ScheduledJobsFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | **string** | Optional: Enabled or not. | [optional] [default to null]
**EndTime** | [**time.Time**](time.Time.md) | Optional: Return records ending time. | [optional] [default to null]
**IgnoreAcl** | **bool** |  | [optional] [default to null]
**NameFilter** | **[]string** | Optional: Filter by report name. | [optional] [default to null]
**StartTime** | [**time.Time**](time.Time.md) | Optional: Return records starting at this time (&gt;&#x3D;). | [optional] [default to null]
**StatusFilter** | [**[]Schedulerv3ExecutionStatus**](schedulerv3ExecutionStatus.md) | Optional: Filter by status. | [optional] [default to null]
**TagFilter** | **string** | Optional: Filter by tags. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

