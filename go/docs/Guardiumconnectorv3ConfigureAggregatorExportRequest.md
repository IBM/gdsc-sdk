# Guardiumconnectorv3ConfigureAggregatorExportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CentralManagerId** | **string** | Central Manager ID. | [optional] [default to null]
**DatamartEndDateAggregator** | **string** | End date for aggregator datamart export. | [optional] [default to null]
**DatamartStartDateAggregator** | **string** | Start date for aggregator datamart export. | [optional] [default to null]
**ManagedUnits** | **[]string** | List of managed units to which apply the dm export start/end dates. | [optional] [default to null]
**SkipHistoricalDatamarts** | **bool** | Flag to either skip or include historical datamarts as part of configure streaming API. | [optional] [default to null]
**UpdateCentralManager** | **bool** | Flag to update the cm record with date ranges. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

