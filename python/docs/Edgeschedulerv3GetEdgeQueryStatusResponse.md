# Edgeschedulerv3GetEdgeQueryStatusResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_time** | **datetime** |  | [optional] 
**status** | **str** | The status of the query. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.edgeschedulerv3_get_edge_query_status_response import Edgeschedulerv3GetEdgeQueryStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Edgeschedulerv3GetEdgeQueryStatusResponse from a JSON string
edgeschedulerv3_get_edge_query_status_response_instance = Edgeschedulerv3GetEdgeQueryStatusResponse.from_json(json)
# print the JSON string representation of the object
print(Edgeschedulerv3GetEdgeQueryStatusResponse.to_json())

# convert the object into a dict
edgeschedulerv3_get_edge_query_status_response_dict = edgeschedulerv3_get_edge_query_status_response_instance.to_dict()
# create an instance of Edgeschedulerv3GetEdgeQueryStatusResponse from a dict
edgeschedulerv3_get_edge_query_status_response_from_dict = Edgeschedulerv3GetEdgeQueryStatusResponse.from_dict(edgeschedulerv3_get_edge_query_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


