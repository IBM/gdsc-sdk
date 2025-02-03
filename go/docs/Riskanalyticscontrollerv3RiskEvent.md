# Riskanalyticscontrollerv3RiskEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CategorizationConfidence** | **float32** |  | [optional] [default to null]
**CategorizationModified** | **bool** |  | [optional] [default to null]
**CategoryDescription** | **string** | Category description of the risk. | [optional] [default to null]
**Classification** | **string** | Classification of the risk // key of the classification. | [optional] [default to null]
**ClassificationNls** | **string** | Classification nls // key of nls. | [optional] [default to null]
**Description** | **string** | Description of the risk. | [optional] [default to null]
**EmergingRisk** | **bool** | Flag for emerging risks. | [optional] [default to null]
**FromDate** | [**time.Time**](time.Time.md) | Opened date in format YYYY-MM-DDTHH:mm:ssZ. | [optional] [default to null]
**Justification** | **string** | Justification. | [optional] [default to null]
**Pivot** | [***Riskanalyticsenginev3Pivot**](riskanalyticsenginev3Pivot.md) |  | [optional] [default to null]
**RiskId** | **int32** | Risk id. | [optional] [default to null]
**Severity** | **int32** | Severity of the risk. | [optional] [default to null]
**SeverityLevel** | [***Riskanalyticsenginev3SeverityLevel**](riskanalyticsenginev3SeverityLevel.md) |  | [optional] [default to null]
**ShortObservations** | [**[]Riskanalyticscontrollerv3ShortObservation**](riskanalyticscontrollerv3ShortObservation.md) | Observations of the risk. | [optional] [default to null]
**Status** | [***Riskanalyticscontrollerv3Status**](riskanalyticscontrollerv3Status.md) |  | [optional] [default to null]
**StatusChangedByUserName** | **string** | Status changed by the user name. | [optional] [default to null]
**ToDate** | [**time.Time**](time.Time.md) | Last updated date in format YYYY-MM-DDTHH:mm:ssZ. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

