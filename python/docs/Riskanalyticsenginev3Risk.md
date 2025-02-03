# Riskanalyticsenginev3Risk


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification_details** | [**Riskanalyticsenginev3ClassificationDetails**](Riskanalyticsenginev3ClassificationDetails.md) |  | [optional] 
**creation_time** | **datetime** | The risk creation time in format YYYY-MM-DDTHH:mm:ss.sssZ. | [optional] 
**end_time** | **datetime** | The leads end time in format YYYY-MM-DDTHH:mm:ss.sssZ. | [optional] 
**feature_sets** | [**List[Riskanalyticsenginev3FeatureSet]**](Riskanalyticsenginev3FeatureSet.md) | The risk features (scores). | [optional] 
**id** | **str** | The risk id. | [optional] 
**is_emerging** | **bool** |  | [optional] 
**leads** | [**List[Riskanalyticsenginev3Lead]**](Riskanalyticsenginev3Lead.md) | The risk leads. | [optional] 
**pivot** | [**Riskanalyticsenginev3Pivot**](Riskanalyticsenginev3Pivot.md) |  | [optional] 
**score** | **int** | The risk score. | [optional] 
**severity_level** | [**Riskanalyticsenginev3SeverityLevel**](Riskanalyticsenginev3SeverityLevel.md) |  | [optional] 
**start_time** | **datetime** | The leads start time in format YYYY-MM-DDTHH:mm:ss.sssZ. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticsenginev3_risk import Riskanalyticsenginev3Risk

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsenginev3Risk from a JSON string
riskanalyticsenginev3_risk_instance = Riskanalyticsenginev3Risk.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsenginev3Risk.to_json())

# convert the object into a dict
riskanalyticsenginev3_risk_dict = riskanalyticsenginev3_risk_instance.to_dict()
# create an instance of Riskanalyticsenginev3Risk from a dict
riskanalyticsenginev3_risk_from_dict = Riskanalyticsenginev3Risk.from_dict(riskanalyticsenginev3_risk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


