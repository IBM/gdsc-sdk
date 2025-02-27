# Assetsv3SensitivityInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **str** |  | [optional] 
**count** | **int** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_sensitivity_info import Assetsv3SensitivityInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3SensitivityInfo from a JSON string
assetsv3_sensitivity_info_instance = Assetsv3SensitivityInfo.from_json(json)
# print the JSON string representation of the object
print(Assetsv3SensitivityInfo.to_json())

# convert the object into a dict
assetsv3_sensitivity_info_dict = assetsv3_sensitivity_info_instance.to_dict()
# create an instance of Assetsv3SensitivityInfo from a dict
assetsv3_sensitivity_info_from_dict = Assetsv3SensitivityInfo.from_dict(assetsv3_sensitivity_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


