# Riskanalyticsenginev3ClassificationDetails

ClassificationDetails message an additional info for the classification the UI.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**class_description_nls** | **str** | Class description for UI with translation. | [optional] 
**class_key** | **str** | Key of the classification found for this risk. | [optional] 
**class_nls** | **str** | Key of the classification found for this risk. | [optional] 
**class_observations** | [**List[Riskanalyticsenginev3ClassificationObservation]**](Riskanalyticsenginev3ClassificationObservation.md) | Classification Observation array of observations that were found for this classification. | [optional] 
**class_value** | **float** | Value of the classification found for this risk. | [optional] 
**classification_match_details** | [**List[Riskanalyticsenginev3ClassificationMatchDetails]**](Riskanalyticsenginev3ClassificationMatchDetails.md) |  | [optional] 
**classification_modified** | **bool** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticsenginev3_classification_details import Riskanalyticsenginev3ClassificationDetails

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3ClassificationDetails from a JSON string
riskanalyticsenginev3_classification_details_instance = Riskanalyticsenginev3ClassificationDetails.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3ClassificationDetails.to_json())

# convert the object into a dict
riskanalyticsenginev3_classification_details_dict = riskanalyticsenginev3_classification_details_instance.to_dict()
# create an instance of Riskanalyticsenginev3ClassificationDetails from a dict
riskanalyticsenginev3_classification_details_from_dict = Riskanalyticsenginev3ClassificationDetails.from_dict(riskanalyticsenginev3_classification_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


