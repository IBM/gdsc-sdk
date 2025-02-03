# Riskanalyticsmlclassificationv3GetClassificationResponse

GetClassificationResponse message for the GetClassification api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**risk** | [**Riskanalyticsenginev3Risk**](Riskanalyticsenginev3Risk.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticsmlclassificationv3_get_classification_response import Riskanalyticsmlclassificationv3GetClassificationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsmlclassificationv3GetClassificationResponse from a JSON string
riskanalyticsmlclassificationv3_get_classification_response_instance = Riskanalyticsmlclassificationv3GetClassificationResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsmlclassificationv3GetClassificationResponse.to_json())

# convert the object into a dict
riskanalyticsmlclassificationv3_get_classification_response_dict = riskanalyticsmlclassificationv3_get_classification_response_instance.to_dict()
# create an instance of Riskanalyticsmlclassificationv3GetClassificationResponse from a dict
riskanalyticsmlclassificationv3_get_classification_response_from_dict = Riskanalyticsmlclassificationv3GetClassificationResponse.from_dict(riskanalyticsmlclassificationv3_get_classification_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


