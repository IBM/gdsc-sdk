# Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse

GenerateFeaturesForRisksGroupResponse is the response object for GenerateFeaturesForGroup API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**risks** | [**List[Riskanalyticsenginev3Risk]**](Riskanalyticsenginev3Risk.md) | Returns an array with risks with pivot , leads and features. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticsenginev3_generate_features_for_risks_group_response import Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse from a JSON string
riskanalyticsenginev3_generate_features_for_risks_group_response_instance = Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse.to_json())

# convert the object into a dict
riskanalyticsenginev3_generate_features_for_risks_group_response_dict = riskanalyticsenginev3_generate_features_for_risks_group_response_instance.to_dict()
# create an instance of Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse from a dict
riskanalyticsenginev3_generate_features_for_risks_group_response_from_dict = Riskanalyticsenginev3GenerateFeaturesForRisksGroupResponse.from_dict(riskanalyticsenginev3_generate_features_for_risks_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


