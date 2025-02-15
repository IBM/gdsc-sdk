# Edgeschedulerv3ScheduleEdgeQueryRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**edge_query_end_time** | **datetime** | the upper bound of the UC query time range in format YYYY-MM-DDTHH:mm:ss.sssZ. | [optional] 
**edge_query_start_time** | **datetime** | the lower bound of the UC query time range in format YYYY-MM-DDTHH:mm:ss.sssZ. | [optional] 
**edge_id** | **str** |  | [optional] 
**edge_result_report_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.edgeschedulerv3_schedule_edge_query_request import Edgeschedulerv3ScheduleEdgeQueryRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Edgeschedulerv3ScheduleEdgeQueryRequest from a JSON string
edgeschedulerv3_schedule_edge_query_request_instance = Edgeschedulerv3ScheduleEdgeQueryRequest.from_json(json)
# print the JSON string representation of the object
print(Edgeschedulerv3ScheduleEdgeQueryRequest.to_json())

# convert the object into a dict
edgeschedulerv3_schedule_edge_query_request_dict = edgeschedulerv3_schedule_edge_query_request_instance.to_dict()
# create an instance of Edgeschedulerv3ScheduleEdgeQueryRequest from a dict
edgeschedulerv3_schedule_edge_query_request_from_dict = Edgeschedulerv3ScheduleEdgeQueryRequest.from_dict(edgeschedulerv3_schedule_edge_query_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


