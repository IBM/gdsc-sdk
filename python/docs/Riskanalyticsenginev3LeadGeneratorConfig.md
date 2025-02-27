# Riskanalyticsenginev3LeadGeneratorConfig

LeadGeneratorConfig holds the configuration of a lead generator.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_active** | **bool** | Is the lead generator set to active or inactive. | [optional] 
**lead_generator_name** | **str** | Name of the lead generator. | [optional] 
**lead_generator_params** | [**List[Riskanalyticsenginev3LeadGeneratorConfigParamValue]**](Riskanalyticsenginev3LeadGeneratorConfigParamValue.md) | The parameters to update for this lead generator. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_lead_generator_config import Riskanalyticsenginev3LeadGeneratorConfig

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3LeadGeneratorConfig from a JSON string
riskanalyticsenginev3_lead_generator_config_instance = Riskanalyticsenginev3LeadGeneratorConfig.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3LeadGeneratorConfig.to_json())

# convert the object into a dict
riskanalyticsenginev3_lead_generator_config_dict = riskanalyticsenginev3_lead_generator_config_instance.to_dict()
# create an instance of Riskanalyticsenginev3LeadGeneratorConfig from a dict
riskanalyticsenginev3_lead_generator_config_from_dict = Riskanalyticsenginev3LeadGeneratorConfig.from_dict(riskanalyticsenginev3_lead_generator_config_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


