

# Guardiumconnectorv3CM

Central Manager definition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;Guardiumconnectorv3Attribute&gt;**](Guardiumconnectorv3Attribute.md) | Central Manager attributes. |  [optional] |
|**centralManagerId** | **String** | Central Manager hostname or ip. |  [optional] |
|**cmDateParamAvailable** | **String** | Flag check if CM can handle setting start end date for aggregator dm export. |  [optional] |
|**datamartEndDateAggregator** | **String** | Initial start date for streaming historical datamart from GDP aggregator. |  [optional] |
|**datamartStartDateAggregator** | **String** | Initial start date for streaming historical datamart from GDP aggregator. |  [optional] |
|**datamartStartDateCollector** | **String** | Initial start date for streaming historical datamart from GDP. |  [optional] |
|**maxSupportedDmVersion** | **String** |  |  [optional] |
|**mode** | **String** | Flag to determine if GI supports push or pull mode. |  [optional] |
|**name** | **String** | Central Manager name. |  [optional] |
|**port** | **String** | Port used to communicate with the Central Manager. |  [optional] |
|**status** | **String** | Central Manager status. |  [optional] |
|**supportCustomDmTypeSetup** | **String** |  |  [optional] |



