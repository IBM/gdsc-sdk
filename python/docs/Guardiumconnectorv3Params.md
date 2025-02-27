# Guardiumconnectorv3Params

Params is the parameter name-value pair.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**param_name** | **str** | Parameter name. | [optional] 
**param_value** | **str** | Parameter value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_params import Guardiumconnectorv3Params

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3Params from a JSON string
guardiumconnectorv3_params_instance = Guardiumconnectorv3Params.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3Params.to_json())

# convert the object into a dict
guardiumconnectorv3_params_dict = guardiumconnectorv3_params_instance.to_dict()
# create an instance of Guardiumconnectorv3Params from a dict
guardiumconnectorv3_params_from_dict = Guardiumconnectorv3Params.from_dict(guardiumconnectorv3_params_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


