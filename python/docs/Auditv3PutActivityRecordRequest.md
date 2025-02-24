# Auditv3PutActivityRecordRequest

PutActivityRecord creates an activity log record.  All fields are optional.  Specified fields will be used to included in the persisted ActivityRecord.  If no fields are specified then no activity log record is persisted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_taken** | **str** | The operation associated with the persisted Activity record (CRUD or other). | [optional] 
**changes_made** | **str** | The reason the operation was performed (details about the operation). | [optional] 
**context** | **str** | The service/collection on which the operation was performed. | [optional] 
**context_description** | **str** | The label of the Activity record. | [optional] 
**performed_by** | **str** | The user id of the active user at the time the action was performed. | [optional] 
**uid** | **str** | The record ID with the persisted Activity record. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.auditv3_put_activity_record_request import Auditv3PutActivityRecordRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Auditv3PutActivityRecordRequest from a JSON string
auditv3_put_activity_record_request_instance = Auditv3PutActivityRecordRequest.from_json(json)
# print the JSON string representation of the object
print(Auditv3PutActivityRecordRequest.to_json())

# convert the object into a dict
auditv3_put_activity_record_request_dict = auditv3_put_activity_record_request_instance.to_dict()
# create an instance of Auditv3PutActivityRecordRequest from a dict
auditv3_put_activity_record_request_from_dict = Auditv3PutActivityRecordRequest.from_dict(auditv3_put_activity_record_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


