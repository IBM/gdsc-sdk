# SensitivitySummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tag** | **str** |  | 
**count** | **float** |  | 
**category** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.sensitivity_summary import SensitivitySummary

# TODO update the JSON string below
json = "{}"
# create an instance of SensitivitySummary from a JSON string
sensitivity_summary_instance = SensitivitySummary.from_json(json)
# print the JSON string representation of the object
print(SensitivitySummary.to_json())

# convert the object into a dict
sensitivity_summary_dict = sensitivity_summary_instance.to_dict()
# create an instance of SensitivitySummary from a dict
sensitivity_summary_from_dict = SensitivitySummary.from_dict(sensitivity_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


