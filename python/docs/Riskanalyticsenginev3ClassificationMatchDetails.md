# Riskanalyticsenginev3ClassificationMatchDetails

ClassificationMatchDetails contains the details about matched classifications.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_key** | **str** |  | [optional] 
**class_value** | **float** |  | [optional] 
**classification_confidence** | **float** |  | [optional] 
**classification_nls** | **str** |  | [optional] 
**model_probability** | **float** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsenginev3_classification_match_details import Riskanalyticsenginev3ClassificationMatchDetails

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3ClassificationMatchDetails from a JSON string
riskanalyticsenginev3_classification_match_details_instance = Riskanalyticsenginev3ClassificationMatchDetails.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3ClassificationMatchDetails.to_json())

# convert the object into a dict
riskanalyticsenginev3_classification_match_details_dict = riskanalyticsenginev3_classification_match_details_instance.to_dict()
# create an instance of Riskanalyticsenginev3ClassificationMatchDetails from a dict
riskanalyticsenginev3_classification_match_details_from_dict = Riskanalyticsenginev3ClassificationMatchDetails.from_dict(riskanalyticsenginev3_classification_match_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


