# AccessTypeCountInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_type** | [**AccessType**](AccessType.md) |  | 
**count** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.access_type_count_inner import AccessTypeCountInner

# TODO update the JSON string below
json = "{}"
# create an instance of AccessTypeCountInner from a JSON string
access_type_count_inner_instance = AccessTypeCountInner.from_json(json)
# print the JSON string representation of the object
print(AccessTypeCountInner.to_json())

# convert the object into a dict
access_type_count_inner_dict = access_type_count_inner_instance.to_dict()
# create an instance of AccessTypeCountInner from a dict
access_type_count_inner_from_dict = AccessTypeCountInner.from_dict(access_type_count_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


