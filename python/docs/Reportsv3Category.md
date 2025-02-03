# Reportsv3Category


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_description** | **str** | The category description. | [optional] 
**category_id** | **str** | The category id. | [optional] 
**category_name** | **str** | Identifies the NLS translated string. | [optional] 
**multi_version** | **bool** |  | [optional] 
**versions** | [**List[Reportsv3CategoryVersion]**](Reportsv3CategoryVersion.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_category import Reportsv3Category

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Category from a JSON string
reportsv3_category_instance = Reportsv3Category.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Category.to_json())

# convert the object into a dict
reportsv3_category_dict = reportsv3_category_instance.to_dict()
# create an instance of Reportsv3Category from a dict
reportsv3_category_from_dict = Reportsv3Category.from_dict(reportsv3_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


