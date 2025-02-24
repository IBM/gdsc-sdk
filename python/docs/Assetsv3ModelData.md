# Assetsv3ModelData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource_location** | **str** |  | [optional] 
**resource_name** | **str** |  | [optional] 
**resource_size** | **str** |  | [optional] 
**resource_type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_model_data import Assetsv3ModelData

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ModelData from a JSON string
assetsv3_model_data_instance = Assetsv3ModelData.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ModelData.to_json())

# convert the object into a dict
assetsv3_model_data_dict = assetsv3_model_data_instance.to_dict()
# create an instance of Assetsv3ModelData from a dict
assetsv3_model_data_from_dict = Assetsv3ModelData.from_dict(assetsv3_model_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


