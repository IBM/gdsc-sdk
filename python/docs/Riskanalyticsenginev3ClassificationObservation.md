# Riskanalyticsenginev3ClassificationObservation

ClassificationObservation is a pair of key and value of observation that were found for this classification.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_supporting_observation** | **bool** | Is supporting observation - means is this observation used as a supporting observation for this classification. | [optional] 
**key** | **str** | Classification observation key. | [optional] 
**original_value** | **float** | Classification observation value before normalization. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_classification_observation import Riskanalyticsenginev3ClassificationObservation

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3ClassificationObservation from a JSON string
riskanalyticsenginev3_classification_observation_instance = Riskanalyticsenginev3ClassificationObservation.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3ClassificationObservation.to_json())

# convert the object into a dict
riskanalyticsenginev3_classification_observation_dict = riskanalyticsenginev3_classification_observation_instance.to_dict()
# create an instance of Riskanalyticsenginev3ClassificationObservation from a dict
riskanalyticsenginev3_classification_observation_from_dict = Riskanalyticsenginev3ClassificationObservation.from_dict(riskanalyticsenginev3_classification_observation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


