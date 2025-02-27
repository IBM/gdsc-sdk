

# Riskanalyticscontrollerv3RiskObservationDetails

Risk observation details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**classification** | **String** |  |  [optional] |
|**dateFrom** | **OffsetDateTime** | Start date in format YYYY-MM-DDTHH:mm:ssZ. |  [optional] |
|**dateTo** | **OffsetDateTime** | End updated date in format YYYY-MM-DDTHH:mm:ssZ. |  [optional] |
|**description** | **String** |  |  [optional] |
|**emergingRiskDetails** | [**Riskanalyticscontrollerv3EmergingRiskDetails**](Riskanalyticscontrollerv3EmergingRiskDetails.md) |  |  [optional] |
|**features** | [**List&lt;Riskanalyticsenginev3Feature&gt;**](Riskanalyticsenginev3Feature.md) | Features list based on the requested lead_feature_id. |  [optional] |
|**finding** | [**Riskanalyticscontrollerv3Finding**](Riskanalyticscontrollerv3Finding.md) |  |  [optional] |
|**reportFilters** | [**List&lt;Riskanalyticscontrollerv3ObservationReportFilter&gt;**](Riskanalyticscontrollerv3ObservationReportFilter.md) | List of headers and values for filtering the report based on pivot information. |  [optional] |
|**reportId** | **String** | Report id based on the requested ObservationType. |  [optional] |



