# SetQuestionBodyParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**question_type** | [**QuestionType**](QuestionType.md) |  | 
**answers** | **List[str]** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.set_question_body_params import SetQuestionBodyParams

# TODO update the JSON string below
json = "{}"
# create an instance of SetQuestionBodyParams from a JSON string
set_question_body_params_instance = SetQuestionBodyParams.from_json(json)
# print the JSON string representation of the object
print(SetQuestionBodyParams.to_json())

# convert the object into a dict
set_question_body_params_dict = set_question_body_params_instance.to_dict()
# create an instance of SetQuestionBodyParams from a dict
set_question_body_params_from_dict = SetQuestionBodyParams.from_dict(set_question_body_params_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


