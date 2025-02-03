# Riskanalyticsenginev3GetLeadGeneratorConfigResponse

GetLeadGeneratorConfigResponse is the response object for GetLeadGeneratorConfig API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configs** | [**List[Riskanalyticsenginev3LeadGeneratorConfig]**](Riskanalyticsenginev3LeadGeneratorConfig.md) | A list of lead generator configs from the risk analytics engine. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticsenginev3_get_lead_generator_config_response import Riskanalyticsenginev3GetLeadGeneratorConfigResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3GetLeadGeneratorConfigResponse from a JSON string
riskanalyticsenginev3_get_lead_generator_config_response_instance = Riskanalyticsenginev3GetLeadGeneratorConfigResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3GetLeadGeneratorConfigResponse.to_json())

# convert the object into a dict
riskanalyticsenginev3_get_lead_generator_config_response_dict = riskanalyticsenginev3_get_lead_generator_config_response_instance.to_dict()
# create an instance of Riskanalyticsenginev3GetLeadGeneratorConfigResponse from a dict
riskanalyticsenginev3_get_lead_generator_config_response_from_dict = Riskanalyticsenginev3GetLeadGeneratorConfigResponse.from_dict(riskanalyticsenginev3_get_lead_generator_config_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


