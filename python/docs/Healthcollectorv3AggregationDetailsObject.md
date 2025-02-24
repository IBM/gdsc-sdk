# Healthcollectorv3AggregationDetailsObject

AggregationDetailsObject gets additional information about aggregation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregation_action_error** | **str** | Aggregation action error. | [optional] 
**aggregation_action_health_status** | **int** | Aggregation health status. | [optional] 
**aggregation_type** | **str** | Aggregation type. | [optional] 
**error** | **int** | Error code for the aggregator. | [optional] 
**unit** | **str** | Aggregator host name or IP address. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_aggregation_details_object import Healthcollectorv3AggregationDetailsObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3AggregationDetailsObject from a JSON string
healthcollectorv3_aggregation_details_object_instance = Healthcollectorv3AggregationDetailsObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3AggregationDetailsObject.to_json())

# convert the object into a dict
healthcollectorv3_aggregation_details_object_dict = healthcollectorv3_aggregation_details_object_instance.to_dict()
# create an instance of Healthcollectorv3AggregationDetailsObject from a dict
healthcollectorv3_aggregation_details_object_from_dict = Healthcollectorv3AggregationDetailsObject.from_dict(healthcollectorv3_aggregation_details_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


