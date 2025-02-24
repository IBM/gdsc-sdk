# Riskanalyticscontrollerv3RiskEventFormerHours


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | **datetime** | Date and time of the first finding in format YYYY-MM-DDTHH:mm:ssZ. | [optional] 
**date_to** | **datetime** | Date and time of the last finding in format YYYY-MM-DDTHH:mm:ssZ. | [optional] 
**former_hours_categories** | **Dict[str, int]** | The categories of the risk in former hours and the number of occurrences. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_risk_event_former_hours import Riskanalyticscontrollerv3RiskEventFormerHours

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3RiskEventFormerHours from a JSON string
riskanalyticscontrollerv3_risk_event_former_hours_instance = Riskanalyticscontrollerv3RiskEventFormerHours.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3RiskEventFormerHours.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_risk_event_former_hours_dict = riskanalyticscontrollerv3_risk_event_former_hours_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3RiskEventFormerHours from a dict
riskanalyticscontrollerv3_risk_event_former_hours_from_dict = Riskanalyticscontrollerv3RiskEventFormerHours.from_dict(riskanalyticscontrollerv3_risk_event_former_hours_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


