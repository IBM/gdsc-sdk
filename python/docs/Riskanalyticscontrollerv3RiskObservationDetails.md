# Riskanalyticscontrollerv3RiskObservationDetails

Risk observation details.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification** | **str** |  | [optional] 
**date_from** | **datetime** | Start date in format YYYY-MM-DDTHH:mm:ssZ. | [optional] 
**date_to** | **datetime** | End updated date in format YYYY-MM-DDTHH:mm:ssZ. | [optional] 
**description** | **str** |  | [optional] 
**emerging_risk_details** | [**Riskanalyticscontrollerv3EmergingRiskDetails**](Riskanalyticscontrollerv3EmergingRiskDetails.md) |  | [optional] 
**features** | [**List[Riskanalyticsenginev3Feature]**](Riskanalyticsenginev3Feature.md) | Features list based on the requested lead_feature_id. | [optional] 
**report_filters** | [**List[Riskanalyticscontrollerv3ObservationReportFilter]**](Riskanalyticscontrollerv3ObservationReportFilter.md) | List of headers and values for filtering the report based on pivot information. | [optional] 
**report_id** | **str** | Report id based on the requested ObservationType. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_observation_details import Riskanalyticscontrollerv3RiskObservationDetails

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3RiskObservationDetails from a JSON string
riskanalyticscontrollerv3_risk_observation_details_instance = Riskanalyticscontrollerv3RiskObservationDetails.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3RiskObservationDetails.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_risk_observation_details_dict = riskanalyticscontrollerv3_risk_observation_details_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3RiskObservationDetails from a dict
riskanalyticscontrollerv3_risk_observation_details_from_dict = Riskanalyticscontrollerv3RiskObservationDetails.from_dict(riskanalyticscontrollerv3_risk_observation_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


