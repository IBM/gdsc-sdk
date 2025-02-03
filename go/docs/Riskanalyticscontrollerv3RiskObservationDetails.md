# Riskanalyticscontrollerv3RiskObservationDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Classification** | **string** |  | [optional] [default to null]
**DateFrom** | [**time.Time**](time.Time.md) | Start date in format YYYY-MM-DDTHH:mm:ssZ. | [optional] [default to null]
**DateTo** | [**time.Time**](time.Time.md) | End updated date in format YYYY-MM-DDTHH:mm:ssZ. | [optional] [default to null]
**Description** | **string** |  | [optional] [default to null]
**EmergingRiskDetails** | [***Riskanalyticscontrollerv3EmergingRiskDetails**](riskanalyticscontrollerv3EmergingRiskDetails.md) |  | [optional] [default to null]
**Features** | [**[]Riskanalyticsenginev3Feature**](riskanalyticsenginev3Feature.md) | Features list based on the requested lead_feature_id. | [optional] [default to null]
**ReportFilters** | [**[]Riskanalyticscontrollerv3ObservationReportFilter**](riskanalyticscontrollerv3ObservationReportFilter.md) | List of headers and values for filtering the report based on pivot information. | [optional] [default to null]
**ReportId** | **string** | Report id based on the requested ObservationType. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

