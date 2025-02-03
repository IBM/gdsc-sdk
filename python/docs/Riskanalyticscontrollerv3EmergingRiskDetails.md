# Riskanalyticscontrollerv3EmergingRiskDetails

EmergingRiskDetails is the information for emerging risks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_max_time** | **datetime** | Time of the last max value. | [optional] 
**end_max_value** | **int** | Value of the last max value. | [optional] 
**peak_max_time** | **datetime** | Time of the peak max value. | [optional] 
**peak_max_value** | **int** | Value of the peak max value. | [optional] 
**previous_max_value** | **int** | Value of the previous max value. | [optional] 
**risk_features** | **str** | Features of the risk in JSON format. | [optional] 
**start_max_time** | **datetime** | Time of the first max value. | [optional] 
**start_max_value** | **int** | Value of the first max value. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_emerging_risk_details import Riskanalyticscontrollerv3EmergingRiskDetails

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3EmergingRiskDetails from a JSON string
riskanalyticscontrollerv3_emerging_risk_details_instance = Riskanalyticscontrollerv3EmergingRiskDetails.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3EmergingRiskDetails.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_emerging_risk_details_dict = riskanalyticscontrollerv3_emerging_risk_details_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3EmergingRiskDetails from a dict
riskanalyticscontrollerv3_emerging_risk_details_from_dict = Riskanalyticscontrollerv3EmergingRiskDetails.from_dict(riskanalyticscontrollerv3_emerging_risk_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


