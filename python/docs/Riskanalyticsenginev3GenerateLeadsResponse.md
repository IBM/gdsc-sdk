# Riskanalyticsenginev3GenerateLeadsResponse

GenerateLeadsResponse is the response object for GenerateLeads API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_time** | **datetime** | The end time of the risks in format YYYY-MM-ddTHH:mm:ssZ. | [optional] 
**pivot_type** | [**Riskanalyticsenginev3PivotType**](Riskanalyticsenginev3PivotType.md) |  | [optional] [default to Riskanalyticsenginev3PivotType.UNDEFINED_PIVOT_TYPE]
**risks** | [**List[Riskanalyticsenginev3Risk]**](Riskanalyticsenginev3Risk.md) | Returns an array with risks with pivot and leads. | [optional] 
**start_time** | **datetime** | The start time of the risks in format YYYY-MM-ddTHH:mm:ssZ. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_generate_leads_response import Riskanalyticsenginev3GenerateLeadsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3GenerateLeadsResponse from a JSON string
riskanalyticsenginev3_generate_leads_response_instance = Riskanalyticsenginev3GenerateLeadsResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3GenerateLeadsResponse.to_json())

# convert the object into a dict
riskanalyticsenginev3_generate_leads_response_dict = riskanalyticsenginev3_generate_leads_response_instance.to_dict()
# create an instance of Riskanalyticsenginev3GenerateLeadsResponse from a dict
riskanalyticsenginev3_generate_leads_response_from_dict = Riskanalyticsenginev3GenerateLeadsResponse.from_dict(riskanalyticsenginev3_generate_leads_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


