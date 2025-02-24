# Riskanalyticscontrollerv3GetRiskObservationDetailsResponse

GetRiskObservationDetailsResponse is the response object for GetRiskObservationDetails API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**risk_observation_details** | [**Riskanalyticscontrollerv3RiskObservationDetails**](Riskanalyticscontrollerv3RiskObservationDetails.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_get_risk_observation_details_response import Riskanalyticscontrollerv3GetRiskObservationDetailsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3GetRiskObservationDetailsResponse from a JSON string
riskanalyticscontrollerv3_get_risk_observation_details_response_instance = Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_get_risk_observation_details_response_dict = riskanalyticscontrollerv3_get_risk_observation_details_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3GetRiskObservationDetailsResponse from a dict
riskanalyticscontrollerv3_get_risk_observation_details_response_from_dict = Riskanalyticscontrollerv3GetRiskObservationDetailsResponse.from_dict(riskanalyticscontrollerv3_get_risk_observation_details_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


