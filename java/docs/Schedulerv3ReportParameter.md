

# Schedulerv3ReportParameter

ReportParameter includes all the parameters needed to run a report.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**extraDetail** | **String** |  |  [optional] |
|**reportId** | **String** | Report ID for the scheduled report. |  [optional] |
|**reportName** | **String** | Optional: Report Name for the scheduled report. |  [optional] |
|**runtimeParameters** | [**List&lt;Reportsv3RunTimeParameter&gt;**](Reportsv3RunTimeParameter.md) | Optional: Runtime parameters for this report. |  [optional] |
|**syncExecutionDate** | **Boolean** | Optional: Flag if sync query_from_date when running this report. |  [optional] |
|**threshold** | **Long** | Optional: threshold count for creating tickets or other integration messages. Default is 1. If there is one row of data from a report, send message. |  [optional] |



