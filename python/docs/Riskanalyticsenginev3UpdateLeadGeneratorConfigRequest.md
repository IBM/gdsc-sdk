# Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest

UpdateLeadGeneratorConfigRequest is the request object for UpdateLeadGeneratorConfig API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config** | [**Riskanalyticsenginev3LeadGeneratorConfig**](Riskanalyticsenginev3LeadGeneratorConfig.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_update_lead_generator_config_request import Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest from a JSON string
riskanalyticsenginev3_update_lead_generator_config_request_instance = Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest.to_json())

# convert the object into a dict
riskanalyticsenginev3_update_lead_generator_config_request_dict = riskanalyticsenginev3_update_lead_generator_config_request_instance.to_dict()
# create an instance of Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest from a dict
riskanalyticsenginev3_update_lead_generator_config_request_from_dict = Riskanalyticsenginev3UpdateLeadGeneratorConfigRequest.from_dict(riskanalyticsenginev3_update_lead_generator_config_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


