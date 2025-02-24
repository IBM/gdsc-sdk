# Riskanalyticsmlclassificationv3GetClassificationModelResponse

GetClassificationModelResponse message for the GetClassificationModel api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | [**List[Riskanalyticsmlclassificationv3ClassModelExplained]**](Riskanalyticsmlclassificationv3ClassModelExplained.md) | Classification model weights. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsmlclassificationv3_get_classification_model_response import Riskanalyticsmlclassificationv3GetClassificationModelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsmlclassificationv3GetClassificationModelResponse from a JSON string
riskanalyticsmlclassificationv3_get_classification_model_response_instance = Riskanalyticsmlclassificationv3GetClassificationModelResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsmlclassificationv3GetClassificationModelResponse.to_json())

# convert the object into a dict
riskanalyticsmlclassificationv3_get_classification_model_response_dict = riskanalyticsmlclassificationv3_get_classification_model_response_instance.to_dict()
# create an instance of Riskanalyticsmlclassificationv3GetClassificationModelResponse from a dict
riskanalyticsmlclassificationv3_get_classification_model_response_from_dict = Riskanalyticsmlclassificationv3GetClassificationModelResponse.from_dict(riskanalyticsmlclassificationv3_get_classification_model_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


