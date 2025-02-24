# Riskanalyticscontrollerv3ObservationReportFilter

ObservationReportFilter header id and value to apply as a report filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**header_id** | **str** | The header id to filter. | [optional] 
**header_value** | **str** | The value to filter this header by. | [optional] 
**operator_type** | [**Reportsv3OperatorType**](Reportsv3OperatorType.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_observation_report_filter import Riskanalyticscontrollerv3ObservationReportFilter

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3ObservationReportFilter from a JSON string
riskanalyticscontrollerv3_observation_report_filter_instance = Riskanalyticscontrollerv3ObservationReportFilter.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3ObservationReportFilter.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_observation_report_filter_dict = riskanalyticscontrollerv3_observation_report_filter_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3ObservationReportFilter from a dict
riskanalyticscontrollerv3_observation_report_filter_from_dict = Riskanalyticscontrollerv3ObservationReportFilter.from_dict(riskanalyticscontrollerv3_observation_report_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


