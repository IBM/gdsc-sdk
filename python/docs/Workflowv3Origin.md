# Workflowv3Origin


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_next** | **datetime** | Scheduled job next run time. | [optional] 
**date_start** | **datetime** | Scheduled job queue time. | [optional] 
**description** | **str** | Scheduled job description. | [optional] 
**frequency** | **str** | Scheduled job frequency. | [optional] 
**name** | **str** | Scheduled job name. | [optional] 
**scheduled_job_id** | **str** | Scheduled job ID. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.workflowv3_origin import Workflowv3Origin

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3Origin from a JSON string
workflowv3_origin_instance = Workflowv3Origin.from_json(json)
# print the JSON string representation of the object
print(Workflowv3Origin.to_json())

# convert the object into a dict
workflowv3_origin_dict = workflowv3_origin_instance.to_dict()
# create an instance of Workflowv3Origin from a dict
workflowv3_origin_from_dict = Workflowv3Origin.from_dict(workflowv3_origin_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


