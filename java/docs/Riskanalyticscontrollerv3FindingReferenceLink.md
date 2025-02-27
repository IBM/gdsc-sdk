

# Riskanalyticscontrollerv3FindingReferenceLink

[risk-details] A reference link within a finding; used for representing a deep-link to relevant report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reportFilters** | [**List&lt;Riskanalyticscontrollerv3ObservationReportFilter&gt;**](Riskanalyticscontrollerv3ObservationReportFilter.md) |  |  [optional] |
|**statistics** | [**Riskanalyticscontrollerv3Statistics**](Riskanalyticscontrollerv3Statistics.md) |  |  [optional] |
|**text** | **String** | Final text, generated from text_template (localized) and text_variables (as-is). |  [optional] |
|**textTemplate** | **String** | Text template key in insights-nls project; used to create the final text for the UI, during the response. |  [optional] |
|**textVariables** | **List&lt;String&gt;** | [optional] Variable text tokens that replace placeholders in the text template; ordered according to appearance in template. |  [optional] |



