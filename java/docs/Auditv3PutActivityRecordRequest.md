

# Auditv3PutActivityRecordRequest

PutActivityRecord creates an activity log record.  All fields are optional.  Specified fields will be used to included in the persisted ActivityRecord.  If no fields are specified then no activity log record is persisted.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionTaken** | **String** | The operation associated with the persisted Activity record (CRUD or other). |  [optional] |
|**changesMade** | **String** | The reason the operation was performed (details about the operation). |  [optional] |
|**context** | **String** | The service/collection on which the operation was performed. |  [optional] |
|**contextDescription** | **String** | The label of the Activity record. |  [optional] |
|**performedBy** | **String** | The user id of the active user at the time the action was performed. |  [optional] |
|**uid** | **String** | The record ID with the persisted Activity record. |  [optional] |



