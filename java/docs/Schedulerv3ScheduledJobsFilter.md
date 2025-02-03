

# Schedulerv3ScheduledJobsFilter

ScheduledJobsFilter includes all fields used to filter the set of desired scheduled jobs returned.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**enabled** | **String** | Optional: Enabled or not. |  [optional] |
|**endTime** | **OffsetDateTime** | Optional: Return records ending time. |  [optional] |
|**ignoreAcl** | **Boolean** |  |  [optional] |
|**nameFilter** | **List&lt;String&gt;** | Optional: Filter by report name. |  [optional] |
|**startTime** | **OffsetDateTime** | Optional: Return records starting at this time (&gt;&#x3D;). |  [optional] |
|**statusFilter** | **List&lt;Schedulerv3ExecutionStatus&gt;** | Optional: Filter by status. |  [optional] |
|**tagFilter** | **String** | Optional: Filter by tags. |  [optional] |



