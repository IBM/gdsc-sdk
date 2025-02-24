# Riskanalyticscontrollerv3RiskEventHourlyFindings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateFrom** | [**time.Time**](time.Time.md) | Start date of the data in format YYYY-MM-DDTHH:mm:ssZ. | [optional] [default to null]
**DateTo** | [**time.Time**](time.Time.md) | End date of the data in format YYYY-MM-DDTHH:mm:ssZ. | [optional] [default to null]
**Findings** | [**[]Riskanalyticscontrollerv3Finding**](riskanalyticscontrollerv3Finding.md) | list of all the observations of the risk. | [optional] [default to null]
**HourlyCategory** | **string** | Classification of the risk in the given hour. | [optional] [default to null]
**HourlyCategoryDescription** | **string** | Classification description of the risk in the given hour. | [optional] [default to null]
**HourlyDescription** | **string** | Description of the risk. | [optional] [default to null]
**HourlySeverityLevel** | [***Riskanalyticsenginev3SeverityLevel**](riskanalyticsenginev3SeverityLevel.md) |  | [optional] [default to null]
**Indicators** | [**[]Riskanalyticscontrollerv3Indicator**](riskanalyticscontrollerv3Indicator.md) | list of all the indicators - Optional (depending on include_indicators). | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

