

# Guardiumconnectorv3StatusRecord

StatusRecord is the streaming status for each Guardium unit returned by grdapi.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;Guardiumconnectorv3StatusAttribute&gt;**](Guardiumconnectorv3StatusAttribute.md) | Attributes of the Guardium unit (version, unitType, isUnitOnline, etc). |  [optional] |
|**hostName** | **String** | Hostname as its being sent by GDP. |  [optional] |
|**message** | **String** | Message describing status. |  [optional] |
|**state** | **String** | Streaming state: enabled, disabled. |  [optional] |
|**status** | **String** | Current status of streaming (e.g sucess,failed,...). |  [optional] |



