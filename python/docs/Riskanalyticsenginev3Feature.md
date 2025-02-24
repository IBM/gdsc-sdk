# Riskanalyticsenginev3Feature

Feature is a pair of key and value.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feature_nls** | **str** | NLS Feature key //upper case. | [optional] 
**is_observation** | **bool** | Is observation flag to let the score service update it if need it. | [optional] 
**is_zero** | **bool** | If value is zero - there is no value or original value so this flag will be true. | [optional] 
**key** | **str** | Feature key. | [optional] 
**method_type** | [**Riskanalyticsenginev3MethodType**](Riskanalyticsenginev3MethodType.md) |  | [optional] 
**original_value** | **float** | Feature value before normalization. | [optional] 
**score** | **int** | The feature score that was defined by riskApp. | [optional] 
**sequence** | **int** | Sequence. | [optional] 
**severity_level** | [**Riskanalyticsenginev3SeverityLevel**](Riskanalyticsenginev3SeverityLevel.md) |  | [optional] 
**value** | **float** | Feature value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_feature import Riskanalyticsenginev3Feature

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3Feature from a JSON string
riskanalyticsenginev3_feature_instance = Riskanalyticsenginev3Feature.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3Feature.to_json())

# convert the object into a dict
riskanalyticsenginev3_feature_dict = riskanalyticsenginev3_feature_instance.to_dict()
# create an instance of Riskanalyticsenginev3Feature from a dict
riskanalyticsenginev3_feature_from_dict = Riskanalyticsenginev3Feature.from_dict(riskanalyticsenginev3_feature_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


