# Assetsv3SubscriptionVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **str** |  | [optional] 
**end_time** | **datetime** |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**name** | **str** |  | [optional] 
**resolution_key** | **str** |  | [optional] 
**start_time** | **datetime** |  | [optional] 
**subscription_account** | [**List[Assetsv3ConnectionEdge]**](Assetsv3ConnectionEdge.md) |  | [optional] 
**subscription_id** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_subscription_vertex import Assetsv3SubscriptionVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3SubscriptionVertex from a JSON string
assetsv3_subscription_vertex_instance = Assetsv3SubscriptionVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3SubscriptionVertex.to_json())

# convert the object into a dict
assetsv3_subscription_vertex_dict = assetsv3_subscription_vertex_instance.to_dict()
# create an instance of Assetsv3SubscriptionVertex from a dict
assetsv3_subscription_vertex_from_dict = Assetsv3SubscriptionVertex.from_dict(assetsv3_subscription_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


