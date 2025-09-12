# Reportsv3GetMeasuresResponse

GetMeasuresResponse is the return type which encapsulates a list of measures from the GetMeasures() api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**measures_list** | [**List[Reportsv3Measure]**](Reportsv3Measure.md) | List of Measures. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_measures_response import Reportsv3GetMeasuresResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetMeasuresResponse from a JSON string
reportsv3_get_measures_response_instance = Reportsv3GetMeasuresResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetMeasuresResponse.to_json())

# convert the object into a dict
reportsv3_get_measures_response_dict = reportsv3_get_measures_response_instance.to_dict()
# create an instance of Reportsv3GetMeasuresResponse from a dict
reportsv3_get_measures_response_from_dict = Reportsv3GetMeasuresResponse.from_dict(reportsv3_get_measures_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


