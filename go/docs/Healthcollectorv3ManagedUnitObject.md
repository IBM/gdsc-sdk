# Healthcollectorv3ManagedUnitObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AggregationHealthStatus** | **int32** | Aggregation health status. | [optional] [default to null]
**Connectivity** | **int32** | Connectivity status. | [optional] [default to null]
**Details** | [***Healthcollectorv3MuDetailsObj**](healthcollectorv3MUDetailsObj.md) |  | [optional] [default to null]
**ExportsTo** | **[]string** | Aggregator the collector exports data to. | [optional] [default to null]
**ImportsFrom** | **[]string** | Collectors the aggregator imports data from. | [optional] [default to null]
**OsVersion** | **string** | Operating system version. | [optional] [default to null]
**OverallStapStatusForMu** | **int32** | Overall status of S-TAPs for the system. | [optional] [default to null]
**OverallStatus** | **int32** | Overall system status. | [optional] [default to null]
**Patch** | **string** | Patch number. | [optional] [default to null]
**Staps** | [**[]Healthcollectorv3StapObject**](healthcollectorv3StapObject.md) | Details of S-TAPs for the system. | [optional] [default to null]
**Type_** | **string** | Unit type. | [optional] [default to null]
**UnitHostname** | **string** | Name of the Guardium Data Protection system. | [optional] [default to null]
**UnitIp** | **string** | IP address. | [optional] [default to null]
**UnitUtilizationHealthStatus** | **int32** | Unit utilization status. | [optional] [default to null]
**Version** | **string** | Guardium Data Protection version. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

