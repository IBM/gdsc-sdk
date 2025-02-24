# Riskanalyticscontrollerv3FindingReferenceLink

[risk-details] A reference link within a finding; used for representing a deep-link to relevant report.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_filters** | [**List[Riskanalyticscontrollerv3ObservationReportFilter]**](Riskanalyticscontrollerv3ObservationReportFilter.md) |  | [optional] 
**statistics** | [**Riskanalyticscontrollerv3Statistics**](Riskanalyticscontrollerv3Statistics.md) |  | [optional] 
**text** | **str** | Final text, generated from text_template (localized) and text_variables (as-is). | [optional] 
**text_template** | **str** | Text template key in insights-nls project; used to create the final text for the UI, during the response. | [optional] 
**text_variables** | **List[str]** | [optional] Variable text tokens that replace placeholders in the text template; ordered according to appearance in template. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticscontrollerv3_finding_reference_link import Riskanalyticscontrollerv3FindingReferenceLink

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticscontrollerv3FindingReferenceLink from a JSON string
riskanalyticscontrollerv3_finding_reference_link_instance = Riskanalyticscontrollerv3FindingReferenceLink.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticscontrollerv3FindingReferenceLink.to_json())

# convert the object into a dict
riskanalyticscontrollerv3_finding_reference_link_dict = riskanalyticscontrollerv3_finding_reference_link_instance.to_dict()
# create an instance of Riskanalyticscontrollerv3FindingReferenceLink from a dict
riskanalyticscontrollerv3_finding_reference_link_from_dict = Riskanalyticscontrollerv3FindingReferenceLink.from_dict(riskanalyticscontrollerv3_finding_reference_link_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


