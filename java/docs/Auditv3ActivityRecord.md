

# Auditv3ActivityRecord

An activity log record indicates who, what, when, where, and why something happened.  For the purposes of this service: who   = The unique user ID for the user that performed the operation. what  = The operation performed (CRUD operation or other action taken). when  = The time the operation, request, or event occurred. where = The context in which the operation was performed. why   = Details about the operation being performed. which = The unique service record id for the service that recorded the event. actor = When available track the actor that performed the activity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionTaken** | **String** | The operation peformed (CRUD or other operation) (what). |  [optional] |
|**changesMade** | **String** | Further info about the request (why). |  [optional] |
|**context** | **String** | The entity (collection name) upon which the operation was performed (where). |  [optional] |
|**contextDescription** | **String** | Contains a brief description of the Activity record. |  [optional] |
|**creationTime** | **OffsetDateTime** | The time the Activity record was created (when). |  [optional] |
|**performedBy** | **String** | UserID if the request originated from an external context (who). |  [optional] |
|**uid** | **String** | The record ID that the operation was performed upon (which). |  [optional] |



