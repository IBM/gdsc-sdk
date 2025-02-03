# Reportsv3Variant


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**header_id** | **str** |  | [optional] 
**last_run** | **datetime** |  | [optional] 
**last_run_error** | **str** |  | [optional] 
**total_count** | **int** |  | [optional] 
**variant_id** | **str** |  | [optional] 
**variant_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_variant import Reportsv3Variant

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Variant from a JSON string
reportsv3_variant_instance = Reportsv3Variant.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Variant.to_json())

# convert the object into a dict
reportsv3_variant_dict = reportsv3_variant_instance.to_dict()
# create an instance of Reportsv3Variant from a dict
reportsv3_variant_from_dict = Reportsv3Variant.from_dict(reportsv3_variant_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


