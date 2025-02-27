# workflowv3WorkflowEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **map[String, string]** | Event data | [optional] [default to null]
**entityUnderscoreid** | **string** | source of the data (AISPM, DSPM, QSPM, etc.) must match entity registered in Workflow service | [optional] [default to null]
**href** | **string** | Optional HREF identifier to the record in the data&#39;s origin | [optional] [default to null]
**severity** | [**Workflowv3Priority**](Workflowv3Priority.md) |  | [optional] [default to null]
**tenantUnderscoreid** | **string** | Optional tenant identifier on API, but mandatory on Kafka message | [optional] [default to null]
**title** | **string** | Event title - mandatory for API, optional for Kafka | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


