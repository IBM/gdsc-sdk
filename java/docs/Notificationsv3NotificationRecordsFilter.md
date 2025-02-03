

# Notificationsv3NotificationRecordsFilter

NotificationRecordsFilter includes all fields used to filter the set of desired notification records returned. by a GET request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endTime** | **OffsetDateTime** | Return records created before this time (&lt;). |  [optional] |
|**originData** | **String** | Only return record that with the specified origin_data. |  [optional] |
|**origins** | **List&lt;String&gt;** | Only return record that includes the specified origins. |  [optional] |
|**startTime** | **OffsetDateTime** | Return records created at this time or later (&gt;&#x3D;). |  [optional] |
|**state** | **NotificationRecordsFilterStateFilter** |  |  [optional] |



