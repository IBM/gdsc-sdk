

# Guardiumconnectorv3StreamingStatusRecord

Streaming status for a particular Managed Unit.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;Guardiumconnectorv3Attribute&gt;**](Guardiumconnectorv3Attribute.md) | Name/value pair attributes stored in config db. |  [optional] |
|**message** | **String** | Message describing status. |  [optional] |
|**mu** | **String** | MU Name. |  [optional] |
|**state** | **String** | Streaming state : enabled, disabled. |  [optional] |
|**status** | **String** | Streaming configuration current status (e.g RUNNING,DONE,FAILED,...). |  [optional] |
|**unitType** | **String** | Type of managed unit (Collector or Aggregator). |  [optional] |



