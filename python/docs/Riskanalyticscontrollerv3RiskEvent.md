# Riskanalyticscontrollerv3RiskEvent

Risk event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categorization_confidence** | **float** |  | [optional] 
**categorization_modified** | **bool** |  | [optional] 
**category_description** | **str** | Category description of the risk. | [optional] 
**classification** | **str** | Classification of the risk // key of the classification. | [optional] 
**classification_nls** | **str** | Classification nls // key of nls. | [optional] 
**description** | **str** | Description of the risk. | [optional] 
**emerging_risk** | **bool** | Flag for emerging risks. | [optional] 
**from_date** | **datetime** | Opened date in format YYYY-MM-DDTHH:mm:ssZ. | [optional] 
**justification** | **str** | Justification. | [optional] 
**pivot** | [**Riskanalyticsenginev3Pivot**](Riskanalyticsenginev3Pivot.md) |  | [optional] 
**risk_id** | **int** | Risk id. | [optional] 
**severity** | **int** | Severity of the risk. | [optional] 
**severity_level** | [**Riskanalyticsenginev3SeverityLevel**](Riskanalyticsenginev3SeverityLevel.md) |  | [optional] 
**short_observations** | [**List[Riskanalyticscontrollerv3ShortObservation]**](Riskanalyticscontrollerv3ShortObservation.md) | Observations of the risk. | [optional] 
**status** | [**Riskanalyticscontrollerv3Status**](Riskanalyticscontrollerv3Status.md) |  | [optional] 
**status_changed_by_user_name** | **str** | Status changed by the user name. | [optional] 
**to_date** | **datetime** | Last updated date in format YYYY-MM-DDTHH:mm:ssZ. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.riskanalyticscontrollerv3_risk_event import Riskanalyticscontrollerv3RiskEvent

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3RiskEvent from a JSON string
riskanalyticscontrollerv3_risk_event_instance = Riskanalyticscontrollerv3RiskEvent.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3RiskEvent.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_risk_event_dict = riskanalyticscontrollerv3_risk_event_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3RiskEvent from a dict
riskanalyticscontrollerv3_risk_event_from_dict = Riskanalyticscontrollerv3RiskEvent.from_dict(riskanalyticscontrollerv3_risk_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


