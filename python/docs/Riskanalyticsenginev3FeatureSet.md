# Riskanalyticsenginev3FeatureSet

FeatureSet is a group of features.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**features** | [**List[Riskanalyticsenginev3Feature]**](Riskanalyticsenginev3Feature.md) | Feature set list of features. | [optional] 
**name** | **str** | Feature set name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_feature_set import Riskanalyticsenginev3FeatureSet

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3FeatureSet from a JSON string
riskanalyticsenginev3_feature_set_instance = Riskanalyticsenginev3FeatureSet.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3FeatureSet.to_json())

# convert the object into a dict
riskanalyticsenginev3_feature_set_dict = riskanalyticsenginev3_feature_set_instance.to_dict()
# create an instance of Riskanalyticsenginev3FeatureSet from a dict
riskanalyticsenginev3_feature_set_from_dict = Riskanalyticsenginev3FeatureSet.from_dict(riskanalyticsenginev3_feature_set_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


