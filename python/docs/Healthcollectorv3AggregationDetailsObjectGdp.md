# Healthcollectorv3AggregationDetailsObjectGdp

AggregationDetailsObject gets additional information about aggregation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agg_action_error** | **str** | Aggregation action error. | [optional] 
**agg_action_health_status** | **int** | Aggregation health status. | [optional] 
**agg_type** | **str** | Aggregation type. | [optional] 
**error_code** | **int** | Error code. | [optional] 
**unit** | **str** | Aggregator host name or IP address. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_aggregation_details_object_gdp import Healthcollectorv3AggregationDetailsObjectGdp

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3AggregationDetailsObjectGdp from a JSON string
healthcollectorv3_aggregation_details_object_gdp_instance = Healthcollectorv3AggregationDetailsObjectGdp.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3AggregationDetailsObjectGdp.to_json())

# convert the object into a dict
healthcollectorv3_aggregation_details_object_gdp_dict = healthcollectorv3_aggregation_details_object_gdp_instance.to_dict()
# create an instance of Healthcollectorv3AggregationDetailsObjectGdp from a dict
healthcollectorv3_aggregation_details_object_gdp_from_dict = Healthcollectorv3AggregationDetailsObjectGdp.from_dict(healthcollectorv3_aggregation_details_object_gdp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


