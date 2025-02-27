

# Healthcollectorv3ManagedUnitObject

ManagedUnitObject gets information about managed units.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aggregationHealthStatus** | **Integer** | Aggregation health status. |  [optional] |
|**connectivity** | **Integer** | Connectivity status. |  [optional] |
|**details** | [**Healthcollectorv3MUDetailsObj**](Healthcollectorv3MUDetailsObj.md) |  |  [optional] |
|**exportsTo** | **List&lt;String&gt;** | Aggregator the collector exports data to. |  [optional] |
|**importsFrom** | **List&lt;String&gt;** | Collectors the aggregator imports data from. |  [optional] |
|**osVersion** | **String** | Operating system version. |  [optional] |
|**overallStapStatusForMu** | **Integer** | Overall status of S-TAPs for the system. |  [optional] |
|**overallStatus** | **Integer** | Overall system status. |  [optional] |
|**patch** | **String** | Patch number. |  [optional] |
|**staps** | [**List&lt;Healthcollectorv3StapObject&gt;**](Healthcollectorv3StapObject.md) | Details of S-TAPs for the system. |  [optional] |
|**type** | **String** | Unit type. |  [optional] |
|**unitHostname** | **String** | Name of the Guardium Data Protection system. |  [optional] |
|**unitIp** | **String** | IP address. |  [optional] |
|**unitUtilizationHealthStatus** | **Integer** | Unit utilization status. |  [optional] |
|**version** | **String** | Guardium Data Protection version. |  [optional] |



