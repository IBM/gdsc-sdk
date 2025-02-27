# Auditv3GetActivityRecordsResponse

GetActivityResponse returns the requested activity log records.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[Auditv3FilterField]**](Auditv3FilterField.md) | All of the eligible filters based on the passed in parameters. | [optional] 
**records** | [**List[Auditv3ActivityRecord]**](Auditv3ActivityRecord.md) | All of the activity log records based on the passed in parameters. | [optional] 
**total_records** | **str** | Total number of Activity records. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.auditv3_get_activity_records_response import Auditv3GetActivityRecordsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Auditv3GetActivityRecordsResponse from a JSON string
auditv3_get_activity_records_response_instance = Auditv3GetActivityRecordsResponse.from_json(json)
# print the JSON string representation of the object
print(Auditv3GetActivityRecordsResponse.to_json())

# convert the object into a dict
auditv3_get_activity_records_response_dict = auditv3_get_activity_records_response_instance.to_dict()
# create an instance of Auditv3GetActivityRecordsResponse from a dict
auditv3_get_activity_records_response_from_dict = Auditv3GetActivityRecordsResponse.from_dict(auditv3_get_activity_records_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


