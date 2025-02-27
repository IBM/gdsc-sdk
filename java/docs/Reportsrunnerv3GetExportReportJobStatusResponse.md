

# Reportsrunnerv3GetExportReportJobStatusResponse

GetExportReportJobStatusResponse is the return type of GetExportReportStatus API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callStatus** | [**RpcStatus**](RpcStatus.md) |  |  [optional] |
|**fileName** | **String** | File name. |  [optional] |
|**jobDuration** | **Integer** | Duration of the export job in minutes. |  [optional] |
|**jobId** | **String** | Token that identifies the export job. |  [optional] |
|**jobStartTime** | **String** | The start time of the export job. |  [optional] |
|**jobStatus** | **Reportsrunnerv3ExportJobStatus** |  |  [optional] |
|**message** | **String** | An error message in case of failure while retriving the export job status. |  [optional] |
|**resultSize** | **Integer** | The size of the exported file in MB. |  [optional] |
|**tenantId** | **String** | The unique tenant ID that the executing job is running against. |  [optional] |



