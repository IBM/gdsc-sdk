# Auditv3PutActivityRecordResponse

PutActivityRecordResponse indicates if the activity log record was created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **str** | Result is \&quot;\&quot; if an activity log record is created, otherwise an error is returned. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.auditv3_put_activity_record_response import Auditv3PutActivityRecordResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Auditv3PutActivityRecordResponse from a JSON string
auditv3_put_activity_record_response_instance = Auditv3PutActivityRecordResponse.from_json(json)
# print the JSON string representation of the object
print(Auditv3PutActivityRecordResponse.to_json())

# convert the object into a dict
auditv3_put_activity_record_response_dict = auditv3_put_activity_record_response_instance.to_dict()
# create an instance of Auditv3PutActivityRecordResponse from a dict
auditv3_put_activity_record_response_from_dict = Auditv3PutActivityRecordResponse.from_dict(auditv3_put_activity_record_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


