# Reportsv3VariantDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**header_id** | **str** |  | [optional] 
**last_run** | **datetime** |  | [optional] 
**last_run_error** | **str** |  | [optional] 
**rules** | [**List[Reportsv3VariantRule]**](Reportsv3VariantRule.md) |  | [optional] 
**total_count** | **int** |  | [optional] 
**variant_id** | **str** |  | [optional] 
**variant_name** | **str** |  | [optional] 
**variant_table** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_variant_details import Reportsv3VariantDetails

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3VariantDetails from a JSON string
reportsv3_variant_details_instance = Reportsv3VariantDetails.from_json(json)
# print the JSON string representation of the object
print(Reportsv3VariantDetails.to_json())

# convert the object into a dict
reportsv3_variant_details_dict = reportsv3_variant_details_instance.to_dict()
# create an instance of Reportsv3VariantDetails from a dict
reportsv3_variant_details_from_dict = Reportsv3VariantDetails.from_dict(reportsv3_variant_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


