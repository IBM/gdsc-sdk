# Riskanalyticsmlclassificationv3ClassificationDefinition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classifications** | **List[str]** |  | [optional] 
**pivot_type** | [**Riskanalyticsenginev3PivotType**](Riskanalyticsenginev3PivotType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsmlclassificationv3_classification_definition import Riskanalyticsmlclassificationv3ClassificationDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsmlclassificationv3ClassificationDefinition from a JSON string
riskanalyticsmlclassificationv3_classification_definition_instance = Riskanalyticsmlclassificationv3ClassificationDefinition.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsmlclassificationv3ClassificationDefinition.to_json())

# convert the object into a dict
riskanalyticsmlclassificationv3_classification_definition_dict = riskanalyticsmlclassificationv3_classification_definition_instance.to_dict()
# create an instance of Riskanalyticsmlclassificationv3ClassificationDefinition from a dict
riskanalyticsmlclassificationv3_classification_definition_from_dict = Riskanalyticsmlclassificationv3ClassificationDefinition.from_dict(riskanalyticsmlclassificationv3_classification_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


