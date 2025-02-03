# Assetsv3FilterSubCatagory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selected_children_list** | [**List[Assetsv3FilterSubCatagoryChild]**](Assetsv3FilterSubCatagoryChild.md) |  | [optional] 
**sub_catagory_id** | **str** |  | [optional] 
**sub_category_value** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_filter_sub_catagory import Assetsv3FilterSubCatagory

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3FilterSubCatagory from a JSON string
assetsv3_filter_sub_catagory_instance = Assetsv3FilterSubCatagory.from_json(json)
# print the JSON string representation of the object
print(Assetsv3FilterSubCatagory.to_json())

# convert the object into a dict
assetsv3_filter_sub_catagory_dict = assetsv3_filter_sub_catagory_instance.to_dict()
# create an instance of Assetsv3FilterSubCatagory from a dict
assetsv3_filter_sub_catagory_from_dict = Assetsv3FilterSubCatagory.from_dict(assetsv3_filter_sub_catagory_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


