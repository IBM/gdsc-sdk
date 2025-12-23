# Riskanalyticscontrollerv3RiskEventHourlyFindings

RiskEventHourlyFindings message represents the hourly findings of a given risk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_from** | **datetime** | Start date of the data in format YYYY-MM-DDTHH:mm:ssZ. | [optional] 
**date_to** | **datetime** | End date of the data in format YYYY-MM-DDTHH:mm:ssZ. | [optional] 
**findings** | [**List[Riskanalyticscontrollerv3Finding]**](Riskanalyticscontrollerv3Finding.md) | list of all the observations of the risk. | [optional] 
**hourly_category** | **str** | Classification of the risk in the given hour. | [optional] 
**hourly_category_description** | **str** | Classification description of the risk in the given hour. | [optional] 
**hourly_description** | **str** | Description of the risk. | [optional] 
**hourly_severity_level** | [**Riskanalyticsenginev3SeverityLevel**](Riskanalyticsenginev3SeverityLevel.md) |  | [optional] [default to Riskanalyticsenginev3SeverityLevel.UNDEFINED_SEVERITY_LEVEL]
**indicators** | [**List[Riskanalyticscontrollerv3Indicator]**](Riskanalyticscontrollerv3Indicator.md) | list of all the indicators - Optional (depending on include_indicators). | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_risk_event_hourly_findings import Riskanalyticscontrollerv3RiskEventHourlyFindings

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3RiskEventHourlyFindings from a JSON string
riskanalyticscontrollerv3_risk_event_hourly_findings_instance = Riskanalyticscontrollerv3RiskEventHourlyFindings.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3RiskEventHourlyFindings.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_risk_event_hourly_findings_dict = riskanalyticscontrollerv3_risk_event_hourly_findings_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3RiskEventHourlyFindings from a dict
riskanalyticscontrollerv3_risk_event_hourly_findings_from_dict = Riskanalyticscontrollerv3RiskEventHourlyFindings.from_dict(riskanalyticscontrollerv3_risk_event_hourly_findings_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


