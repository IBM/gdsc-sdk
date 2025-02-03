# Riskanalyticscontrollerv3SetRiskEventStatusRequest

SetRiskEventStatusRequest is the request object for SetRiskEventStatus API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**justification** | **str** | Justification. | [optional] 
**risk_ids** | **List[int]** | One or more risk id. This API can be called for multiple risks. | [optional] 
**status** | [**Riskanalyticscontrollerv3Status**](Riskanalyticscontrollerv3Status.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_set_risk_event_status_request import Riskanalyticscontrollerv3SetRiskEventStatusRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3SetRiskEventStatusRequest from a JSON string
riskanalyticscontrollerv3_set_risk_event_status_request_instance = Riskanalyticscontrollerv3SetRiskEventStatusRequest.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3SetRiskEventStatusRequest.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_set_risk_event_status_request_dict = riskanalyticscontrollerv3_set_risk_event_status_request_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3SetRiskEventStatusRequest from a dict
riskanalyticscontrollerv3_set_risk_event_status_request_from_dict = Riskanalyticscontrollerv3SetRiskEventStatusRequest.from_dict(riskanalyticscontrollerv3_set_risk_event_status_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


