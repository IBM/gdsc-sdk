# Reportsrunnerv3GetExportReportJobStatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CallStatus** | [***RpcStatus**](rpcStatus.md) |  | [optional] [default to null]
**FileName** | **string** | File name. | [optional] [default to null]
**JobDuration** | **int32** | Duration of the export job in minutes. | [optional] [default to null]
**JobId** | **string** | Token that identifies the export job. | [optional] [default to null]
**JobStartTime** | **string** | The start time of the export job. | [optional] [default to null]
**JobStatus** | [***Reportsrunnerv3ExportJobStatus**](reportsrunnerv3ExportJobStatus.md) |  | [optional] [default to null]
**Message** | **string** | An error message in case of failure while retriving the export job status. | [optional] [default to null]
**ResultSize** | **int32** | The size of the exported file in MB. | [optional] [default to null]
**TenantId** | **string** | The unique tenant ID that the executing job is running against. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

