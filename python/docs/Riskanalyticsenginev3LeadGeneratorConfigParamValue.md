# Riskanalyticsenginev3LeadGeneratorConfigParamValue

LeadGeneratorConfigParamValue is a parameter name and value for a lead generator configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the parameter. | [optional] 
**value** | **str** | Value of the parameter. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_lead_generator_config_param_value import Riskanalyticsenginev3LeadGeneratorConfigParamValue

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3LeadGeneratorConfigParamValue from a JSON string
riskanalyticsenginev3_lead_generator_config_param_value_instance = Riskanalyticsenginev3LeadGeneratorConfigParamValue.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3LeadGeneratorConfigParamValue.to_json())

# convert the object into a dict
riskanalyticsenginev3_lead_generator_config_param_value_dict = riskanalyticsenginev3_lead_generator_config_param_value_instance.to_dict()
# create an instance of Riskanalyticsenginev3LeadGeneratorConfigParamValue from a dict
riskanalyticsenginev3_lead_generator_config_param_value_from_dict = Riskanalyticsenginev3LeadGeneratorConfigParamValue.from_dict(riskanalyticsenginev3_lead_generator_config_param_value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


