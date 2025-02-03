# Auditv3ActivityRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActionTaken** | **string** | The operation peformed (CRUD or other operation) (what). | [optional] [default to null]
**ChangesMade** | **string** | Further info about the request (why). | [optional] [default to null]
**Context** | **string** | The entity (collection name) upon which the operation was performed (where). | [optional] [default to null]
**ContextDescription** | **string** | Contains a brief description of the Activity record. | [optional] [default to null]
**CreationTime** | [**time.Time**](time.Time.md) | The time the Activity record was created (when). | [optional] [default to null]
**PerformedBy** | **string** | UserID if the request originated from an external context (who). | [optional] [default to null]
**Uid** | **string** | The record ID that the operation was performed upon (which). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

