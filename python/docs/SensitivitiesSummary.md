# SensitivitiesSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sensitivities_count** | **float** |  | 
**sensitivities_summary** | [**List[SensitivitySummary]**](SensitivitySummary.md) |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.sensitivities_summary import SensitivitiesSummary

# TODO update the JSON string below
json = "{}"
# create an instance of SensitivitiesSummary from a JSON string
sensitivities_summary_instance = SensitivitiesSummary.from_json(json)
# print the JSON string representation of the object
print(SensitivitiesSummary.to_json())

# convert the object into a dict
sensitivities_summary_dict = sensitivities_summary_instance.to_dict()
# create an instance of SensitivitiesSummary from a dict
sensitivities_summary_from_dict = SensitivitiesSummary.from_dict(sensitivities_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


