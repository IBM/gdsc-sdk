# Assetsv3FilterTemplate

FilterTemplate - Filter Template structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**colummns_list** | [**List[Assetsv3TableColumn]**](Assetsv3TableColumn.md) |  | [optional] 
**count** | **str** |  | [optional] 
**created_by** | **str** |  | [optional] 
**created_date** | **str** |  | [optional] 
**dashboard_template** | **bool** |  | [optional] 
**description** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**selected_filters** | [**List[Assetsv3FilterCatagory]**](Assetsv3FilterCatagory.md) |  | [optional] 
**template_id** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**updated_date** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_filter_template import Assetsv3FilterTemplate

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3FilterTemplate from a JSON string
assetsv3_filter_template_instance = Assetsv3FilterTemplate.from_json(json)
# print the JSON string representation of the object
print(Assetsv3FilterTemplate.to_json())

# convert the object into a dict
assetsv3_filter_template_dict = assetsv3_filter_template_instance.to_dict()
# create an instance of Assetsv3FilterTemplate from a dict
assetsv3_filter_template_from_dict = Assetsv3FilterTemplate.from_dict(assetsv3_filter_template_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


