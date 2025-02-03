

# Riskanalyticscontrollerv3RiskEventHourlyFindings

RiskEventHourlyFindings message represents the hourly findings of a given risk.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateFrom** | **OffsetDateTime** | Start date of the data in format YYYY-MM-DDTHH:mm:ssZ. |  [optional] |
|**dateTo** | **OffsetDateTime** | End date of the data in format YYYY-MM-DDTHH:mm:ssZ. |  [optional] |
|**findings** | [**List&lt;Riskanalyticscontrollerv3Finding&gt;**](Riskanalyticscontrollerv3Finding.md) | list of all the observations of the risk. |  [optional] |
|**hourlyCategory** | **String** | Classification of the risk in the given hour. |  [optional] |
|**hourlyCategoryDescription** | **String** | Classification description of the risk in the given hour. |  [optional] |
|**hourlyDescription** | **String** | Description of the risk. |  [optional] |
|**hourlySeverityLevel** | **Riskanalyticsenginev3SeverityLevel** |  |  [optional] |
|**indicators** | [**List&lt;Riskanalyticscontrollerv3Indicator&gt;**](Riskanalyticscontrollerv3Indicator.md) | list of all the indicators - Optional (depending on include_indicators). |  [optional] |



