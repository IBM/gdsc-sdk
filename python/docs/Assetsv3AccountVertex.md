# Assetsv3AccountVertex


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_type** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**extended_properties** | [**List[Assetsv3CustomProperty]**](Assetsv3CustomProperty.md) |  | [optional] 
**name** | **str** |  | [optional] 
**resolution_key** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_account_vertex import Assetsv3AccountVertex

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AccountVertex from a JSON string
assetsv3_account_vertex_instance = Assetsv3AccountVertex.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AccountVertex.to_json())

# convert the object into a dict
assetsv3_account_vertex_dict = assetsv3_account_vertex_instance.to_dict()
# create an instance of Assetsv3AccountVertex from a dict
assetsv3_account_vertex_from_dict = Assetsv3AccountVertex.from_dict(assetsv3_account_vertex_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


