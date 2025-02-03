# Guardiumconnectorv3AggregationViewListObject

Information about aggregation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agg_action_error** | **str** | Aggregation action error. | [optional] 
**agg_action_health_status** | **int** | Aggregation health status. | [optional] 
**agg_type** | **str** | Aggregation type. | [optional] 
**error** | **int** | Error code. | [optional] 
**unit** | **str** | Aggregator host name or IP address. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_aggregation_view_list_object import Guardiumconnectorv3AggregationViewListObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3AggregationViewListObject from a JSON string
guardiumconnectorv3_aggregation_view_list_object_instance = Guardiumconnectorv3AggregationViewListObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3AggregationViewListObject.to_json())

# convert the object into a dict
guardiumconnectorv3_aggregation_view_list_object_dict = guardiumconnectorv3_aggregation_view_list_object_instance.to_dict()
# create an instance of Guardiumconnectorv3AggregationViewListObject from a dict
guardiumconnectorv3_aggregation_view_list_object_from_dict = Guardiumconnectorv3AggregationViewListObject.from_dict(guardiumconnectorv3_aggregation_view_list_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


