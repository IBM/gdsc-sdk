# Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse

GetRiskPredefinedQuestionsResponse message for the GetRiskPredefinedQuestions api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questions** | [**List[Riskanalyticsdataprocessorv3Question]**](Riskanalyticsdataprocessorv3Question.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticsdataprocessorv3_get_risk_predefined_questions_response import Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse from a JSON string
riskanalyticsdataprocessorv3_get_risk_predefined_questions_response_instance = Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse.to_json())

# convert the object into a dict
riskanalyticsdataprocessorv3_get_risk_predefined_questions_response_dict = riskanalyticsdataprocessorv3_get_risk_predefined_questions_response_instance.to_dict()
# create an instance of Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse from a dict
riskanalyticsdataprocessorv3_get_risk_predefined_questions_response_from_dict = Riskanalyticsdataprocessorv3GetRiskPredefinedQuestionsResponse.from_dict(riskanalyticsdataprocessorv3_get_risk_predefined_questions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


