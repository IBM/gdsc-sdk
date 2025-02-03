# Qspmpluginmanagerv3ValidationResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | **Dict[str, str]** |  | [optional] 
**valid** | **bool** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmpluginmanagerv3_validation_result import Qspmpluginmanagerv3ValidationResult

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpluginmanagerv3ValidationResult from a JSON string
qspmpluginmanagerv3_validation_result_instance = Qspmpluginmanagerv3ValidationResult.from_json(json)
# print the JSON string representation of the object
print(Qspmpluginmanagerv3ValidationResult.to_json())

# convert the object into a dict
qspmpluginmanagerv3_validation_result_dict = qspmpluginmanagerv3_validation_result_instance.to_dict()
# create an instance of Qspmpluginmanagerv3ValidationResult from a dict
qspmpluginmanagerv3_validation_result_from_dict = Qspmpluginmanagerv3ValidationResult.from_dict(qspmpluginmanagerv3_validation_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


