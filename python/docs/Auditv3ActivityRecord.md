# Auditv3ActivityRecord

An activity log record indicates who, what, when, where, and why something happened.  For the purposes of this service: who   = The unique user ID for the user that performed the operation. what  = The operation performed (CRUD operation or other action taken). when  = The time the operation, request, or event occurred. where = The context in which the operation was performed. why   = Details about the operation being performed. which = The unique service record id for the service that recorded the event. actor = When available track the actor that performed the activity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_taken** | **str** | The operation peformed (CRUD or other operation) (what). | [optional] 
**changes_made** | **str** | Further info about the request (why). | [optional] 
**context** | **str** | The entity (collection name) upon which the operation was performed (where). | [optional] 
**context_description** | **str** | Contains a brief description of the Activity record. | [optional] 
**creation_time** | **datetime** | The time the Activity record was created (when). | [optional] 
**performed_by** | **str** | UserID if the request originated from an external context (who). | [optional] 
**uid** | **str** | The record ID that the operation was performed upon (which). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.auditv3_activity_record import Auditv3ActivityRecord

# TODO update the JSON string below
json = "{}"
# create an instance of Auditv3ActivityRecord from a JSON string
auditv3_activity_record_instance = Auditv3ActivityRecord.from_json(json)
# print the JSON string representation of the object
print(Auditv3ActivityRecord.to_json())

# convert the object into a dict
auditv3_activity_record_dict = auditv3_activity_record_instance.to_dict()
# create an instance of Auditv3ActivityRecord from a dict
auditv3_activity_record_from_dict = Auditv3ActivityRecord.from_dict(auditv3_activity_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


