# Riskanalyticscontrollerv3GetRiskEventDetailsResponse

GetRiskEventDetailsResponse is the response object for GetRiskEventDetails API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emerging_risk_details** | [**Riskanalyticscontrollerv3EmergingRiskDetails**](Riskanalyticscontrollerv3EmergingRiskDetails.md) |  | [optional] 
**observations** | [**List[Riskanalyticscontrollerv3Observation]**](Riskanalyticscontrollerv3Observation.md) | Observations list. | [optional] 
**risk_event** | [**Riskanalyticscontrollerv3RiskEvent**](Riskanalyticscontrollerv3RiskEvent.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_get_risk_event_details_response import Riskanalyticscontrollerv3GetRiskEventDetailsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3GetRiskEventDetailsResponse from a JSON string
riskanalyticscontrollerv3_get_risk_event_details_response_instance = Riskanalyticscontrollerv3GetRiskEventDetailsResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3GetRiskEventDetailsResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_get_risk_event_details_response_dict = riskanalyticscontrollerv3_get_risk_event_details_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3GetRiskEventDetailsResponse from a dict
riskanalyticscontrollerv3_get_risk_event_details_response_from_dict = Riskanalyticscontrollerv3GetRiskEventDetailsResponse.from_dict(riskanalyticscontrollerv3_get_risk_event_details_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


