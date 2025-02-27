# Riskanalyticscontrollerv3GetRiskEventRowResponse

GetRiskEventRowResponse is the response object for GetRiskEventRow API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit_reached** | **bool** | Indicate whether riskevent list is partial because the number of risks reached the limit. | [optional] 
**risk_event_rows** | [**List[Riskanalyticscontrollerv3RiskEvent]**](Riskanalyticscontrollerv3RiskEvent.md) | Repeated risk event rows. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_get_risk_event_row_response import Riskanalyticscontrollerv3GetRiskEventRowResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3GetRiskEventRowResponse from a JSON string
riskanalyticscontrollerv3_get_risk_event_row_response_instance = Riskanalyticscontrollerv3GetRiskEventRowResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3GetRiskEventRowResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_get_risk_event_row_response_dict = riskanalyticscontrollerv3_get_risk_event_row_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3GetRiskEventRowResponse from a dict
riskanalyticscontrollerv3_get_risk_event_row_response_from_dict = Riskanalyticscontrollerv3GetRiskEventRowResponse.from_dict(riskanalyticscontrollerv3_get_risk_event_row_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


