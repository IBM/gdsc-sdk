

# Guardiumconnectorv3ConfigureAggregatorExportRequest

ConfigureAggExportRequest definition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**centralManagerId** | **String** | Central Manager ID. |  [optional] |
|**datamartEndDateAggregator** | **String** | End date for aggregator datamart export. |  [optional] |
|**datamartStartDateAggregator** | **String** | Start date for aggregator datamart export. |  [optional] |
|**managedUnits** | **List&lt;String&gt;** | List of managed units to which apply the dm export start/end dates. |  [optional] |
|**skipHistoricalDatamarts** | **Boolean** | Flag to either skip or include historical datamarts as part of configure streaming API. |  [optional] |
|**updateCentralManager** | **Boolean** | Flag to update the cm record with date ranges. |  [optional] |



