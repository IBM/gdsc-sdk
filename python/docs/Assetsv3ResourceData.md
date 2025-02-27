# Assetsv3ResourceData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_date** | **str** |  | [optional] 
**location** | **str** |  | [optional] 
**sensitivities** | **str** |  | [optional] 
**size** | **str** |  | [optional] 
**type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_resource_data import Assetsv3ResourceData

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ResourceData from a JSON string
assetsv3_resource_data_instance = Assetsv3ResourceData.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ResourceData.to_json())

# convert the object into a dict
assetsv3_resource_data_dict = assetsv3_resource_data_instance.to_dict()
# create an instance of Assetsv3ResourceData from a dict
assetsv3_resource_data_from_dict = Assetsv3ResourceData.from_dict(assetsv3_resource_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


