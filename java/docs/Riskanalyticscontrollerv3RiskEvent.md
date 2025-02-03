

# Riskanalyticscontrollerv3RiskEvent

Risk event.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categorizationConfidence** | **Float** |  |  [optional] |
|**categorizationModified** | **Boolean** |  |  [optional] |
|**categoryDescription** | **String** | Category description of the risk. |  [optional] |
|**classification** | **String** | Classification of the risk // key of the classification. |  [optional] |
|**classificationNls** | **String** | Classification nls // key of nls. |  [optional] |
|**description** | **String** | Description of the risk. |  [optional] |
|**emergingRisk** | **Boolean** | Flag for emerging risks. |  [optional] |
|**fromDate** | **OffsetDateTime** | Opened date in format YYYY-MM-DDTHH:mm:ssZ. |  [optional] |
|**justification** | **String** | Justification. |  [optional] |
|**pivot** | [**Riskanalyticsenginev3Pivot**](Riskanalyticsenginev3Pivot.md) |  |  [optional] |
|**riskId** | **Integer** | Risk id. |  [optional] |
|**severity** | **Integer** | Severity of the risk. |  [optional] |
|**severityLevel** | **Riskanalyticsenginev3SeverityLevel** |  |  [optional] |
|**shortObservations** | [**List&lt;Riskanalyticscontrollerv3ShortObservation&gt;**](Riskanalyticscontrollerv3ShortObservation.md) | Observations of the risk. |  [optional] |
|**status** | **Riskanalyticscontrollerv3Status** |  |  [optional] |
|**statusChangedByUserName** | **String** | Status changed by the user name. |  [optional] |
|**toDate** | **OffsetDateTime** | Last updated date in format YYYY-MM-DDTHH:mm:ssZ. |  [optional] |



