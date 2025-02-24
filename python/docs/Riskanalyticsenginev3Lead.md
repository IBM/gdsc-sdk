# Riskanalyticsenginev3Lead

A lead for each pivot which triggers the whole process - to find a risk for this pivot.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **int** | Count of events. | [optional] 
**creation_time** | **datetime** | The lead creation time in format YYYY-MM-DDTHH:mm:ss.sssZ. | [optional] 
**info** | [**List[Riskanalyticsenginev3AdditionalInfo]**](Riskanalyticsenginev3AdditionalInfo.md) | Additional info. | [optional] 
**is_observation** | **bool** | Is observation flag for the lead to set true based on lead information. | [optional] 
**lead_key** | **str** | The Lead Key name. | [optional] 
**pivot** | [**Riskanalyticsenginev3Pivot**](Riskanalyticsenginev3Pivot.md) |  | [optional] 
**score** | **float** | The lead score (normalized score between 0 and 1). | [optional] 
**severity** | **int** | Lead severity. | [optional] 
**type** | [**Riskanalyticsenginev3LeadType**](Riskanalyticsenginev3LeadType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_lead import Riskanalyticsenginev3Lead

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3Lead from a JSON string
riskanalyticsenginev3_lead_instance = Riskanalyticsenginev3Lead.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3Lead.to_json())

# convert the object into a dict
riskanalyticsenginev3_lead_dict = riskanalyticsenginev3_lead_instance.to_dict()
# create an instance of Riskanalyticsenginev3Lead from a dict
riskanalyticsenginev3_lead_from_dict = Riskanalyticsenginev3Lead.from_dict(riskanalyticsenginev3_lead_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


