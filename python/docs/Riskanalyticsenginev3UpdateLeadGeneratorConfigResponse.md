# Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse

UpdateLeadGeneratorConfigResponse is the response object for UpdateLeadGeneratorConfig API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result_code** | **int** | Result code of the API -- 0 &#x3D; success, any other value &#x3D;&#x3D; failure. | [optional] 
**result_text** | **str** | Result text of the API -- empty string in case of success, error text in case of failure. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_update_lead_generator_config_response import Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse from a JSON string
riskanalyticsenginev3_update_lead_generator_config_response_instance = Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse.to_json())

# convert the object into a dict
riskanalyticsenginev3_update_lead_generator_config_response_dict = riskanalyticsenginev3_update_lead_generator_config_response_instance.to_dict()
# create an instance of Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse from a dict
riskanalyticsenginev3_update_lead_generator_config_response_from_dict = Riskanalyticsenginev3UpdateLeadGeneratorConfigResponse.from_dict(riskanalyticsenginev3_update_lead_generator_config_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


