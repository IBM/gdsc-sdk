# Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse

GetRiskEventProcessStatusResponse is the request object for GetRiskEventProcessStatus API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feedback_status** | [**Riskanalyticscontrollerv3ProcessStatus**](Riskanalyticscontrollerv3ProcessStatus.md) |  | [optional] [default to Riskanalyticscontrollerv3ProcessStatus.UNDEFINED_PROCESS_STATUS_TYPE]
**last_run_date** | **datetime** | Last run date in format YYYY-MM-DDTHH:mm:ssZ. | [optional] 
**process_status** | [**Riskanalyticscontrollerv3ProcessStatus**](Riskanalyticscontrollerv3ProcessStatus.md) |  | [optional] [default to Riskanalyticscontrollerv3ProcessStatus.UNDEFINED_PROCESS_STATUS_TYPE]

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_get_risk_event_process_status_response import Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse from a JSON string
riskanalyticscontrollerv3_get_risk_event_process_status_response_instance = Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_get_risk_event_process_status_response_dict = riskanalyticscontrollerv3_get_risk_event_process_status_response_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse from a dict
riskanalyticscontrollerv3_get_risk_event_process_status_response_from_dict = Riskanalyticscontrollerv3GetRiskEventProcessStatusResponse.from_dict(riskanalyticscontrollerv3_get_risk_event_process_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


