# Riskanalyticsmlclassificationv3ClassModelExplained

ClassModelExplained message for the response of GetClassificationModel api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_confidence** | **float** |  | [optional] 
**class_key** | **str** |  | [optional] 
**rule_sets** | [**List[Riskanalyticsmlclassificationv3RuleSetList]**](Riskanalyticsmlclassificationv3RuleSetList.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsmlclassificationv3_class_model_explained import Riskanalyticsmlclassificationv3ClassModelExplained

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsmlclassificationv3ClassModelExplained from a JSON string
riskanalyticsmlclassificationv3_class_model_explained_instance = Riskanalyticsmlclassificationv3ClassModelExplained.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsmlclassificationv3ClassModelExplained.to_json())

# convert the object into a dict
riskanalyticsmlclassificationv3_class_model_explained_dict = riskanalyticsmlclassificationv3_class_model_explained_instance.to_dict()
# create an instance of Riskanalyticsmlclassificationv3ClassModelExplained from a dict
riskanalyticsmlclassificationv3_class_model_explained_from_dict = Riskanalyticsmlclassificationv3ClassModelExplained.from_dict(riskanalyticsmlclassificationv3_class_model_explained_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


