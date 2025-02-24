# Schedulerv3ScheduledJobSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreationTime** | [**time.Time**](time.Time.md) | Optional: Timestamp when the scheduled job was created. | [optional] [default to null]
**Description** | **string** | Optional: Description for the scheduledJob. | [optional] [default to null]
**Enabled** | **bool** | Enabled or disable the schedule. | [optional] [default to null]
**Expired** | **bool** | Optional: If this schedule is expired or continues forever. | [optional] [default to null]
**Frequency** | [***Schedulerv3Frequency**](schedulerv3Frequency.md) |  | [optional] [default to null]
**LastModifiedTime** | [**time.Time**](time.Time.md) | Optional: Timestamp for the last time the scheduled job was modified. | [optional] [default to null]
**LastRunDuration** | **int64** | Optional: Duration of the previous run. | [optional] [default to null]
**LastRunStart** | [**time.Time**](time.Time.md) | Optional: Timestamp for the previous run. | [optional] [default to null]
**Name** | **string** | Schedule name. | [optional] [default to null]
**NextRun** | [**time.Time**](time.Time.md) | Optional: Timestamp for the next jobrun. | [optional] [default to null]
**Recipient** | [***Schedulerv3Recipient**](schedulerv3Recipient.md) |  | [optional] [default to null]
**Recipients** | [**[]Schedulerv3Recipient**](schedulerv3Recipient.md) |  | [optional] [default to null]
**ReportNames** | **[]string** | Optional: Reports run by this scheduled job. | [optional] [default to null]
**ScheduleId** | **string** | ID for this record. It is automatically created by the database. | [optional] [default to null]
**Tags** | **[]string** | Optional: Tags to use. | [optional] [default to null]
**Tasks** | [**[]Schedulerv3ScheduledTaskSummary**](schedulerv3ScheduledTaskSummary.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

