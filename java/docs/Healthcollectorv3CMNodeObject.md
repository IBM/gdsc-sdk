

# Healthcollectorv3CMNodeObject

CMNodeObject gets health information for the central manager and all its managed units and monitoring agents.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cm** | **String** | Host name or IP address of the central manager. |  [optional] |
|**lastHealthInfoCollectedTimestamp** | **String** | Timestamp from when the health information was collected. |  [optional] |
|**nodes** | [**List&lt;Healthcollectorv3ManagedUnitObject&gt;**](Healthcollectorv3ManagedUnitObject.md) | List of Guardium Data Protection systems. |  [optional] |



