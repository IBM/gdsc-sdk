# Riskanalyticsdataprocessorv3GetRiskContextResponse

GetRiskContextResponse message for the GetRiskContext api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context** | **Dict[str, str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsdataprocessorv3_get_risk_context_response import Riskanalyticsdataprocessorv3GetRiskContextResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsdataprocessorv3GetRiskContextResponse from a JSON string
riskanalyticsdataprocessorv3_get_risk_context_response_instance = Riskanalyticsdataprocessorv3GetRiskContextResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsdataprocessorv3GetRiskContextResponse.to_json())

# convert the object into a dict
riskanalyticsdataprocessorv3_get_risk_context_response_dict = riskanalyticsdataprocessorv3_get_risk_context_response_instance.to_dict()
# create an instance of Riskanalyticsdataprocessorv3GetRiskContextResponse from a dict
riskanalyticsdataprocessorv3_get_risk_context_response_from_dict = Riskanalyticsdataprocessorv3GetRiskContextResponse.from_dict(riskanalyticsdataprocessorv3_get_risk_context_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


