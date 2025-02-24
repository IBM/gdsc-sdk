# Assetsv3FilterCatagory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catagory_id** | **str** |  | [optional] 
**date_range** | [**Assetsv3TimelineDateRange**](Assetsv3TimelineDateRange.md) |  | [optional] 
**selected_sub_catagory_list** | [**List[Assetsv3FilterSubCatagory]**](Assetsv3FilterSubCatagory.md) |  | [optional] 
**sub_catagory_ids** | **List[str]** |  | [optional] 
**sub_category_values** | **List[str]** |  | [optional] 
**timeline_value_selected** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_filter_catagory import Assetsv3FilterCatagory

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3FilterCatagory from a JSON string
assetsv3_filter_catagory_instance = Assetsv3FilterCatagory.from_json(json)
# print the JSON string representation of the object
print(Assetsv3FilterCatagory.to_json())

# convert the object into a dict
assetsv3_filter_catagory_dict = assetsv3_filter_catagory_instance.to_dict()
# create an instance of Assetsv3FilterCatagory from a dict
assetsv3_filter_catagory_from_dict = Assetsv3FilterCatagory.from_dict(assetsv3_filter_catagory_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


