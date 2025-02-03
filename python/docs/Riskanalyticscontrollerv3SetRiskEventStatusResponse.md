# Riskanalyticscontrollerv3SetRiskEventStatusResponse

SetRiskEventStatusResponse is the response object for SetRiskEventStatus API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Response message. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_set_risk_event_status_response import Riskanalyticscontrollerv3SetRiskEventStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3SetRiskEventStatusResponse from a JSON string
riskanalyticscontrollerv3_set_risk_event_status_response_instance = Riskanalyticscontrollerv3SetRiskEventStatusResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3SetRiskEventStatusResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_set_risk_event_status_response_dict = riskanalyticscontrollerv3_set_risk_event_status_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3SetRiskEventStatusResponse from a dict
riskanalyticscontrollerv3_set_risk_event_status_response_from_dict = Riskanalyticscontrollerv3SetRiskEventStatusResponse.from_dict(riskanalyticscontrollerv3_set_risk_event_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


