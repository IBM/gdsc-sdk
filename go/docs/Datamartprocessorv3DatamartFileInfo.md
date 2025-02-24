# Datamartprocessorv3DatamartFileInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error_** | **string** | Errors if any. | [optional] [default to null]
**FailedState** | **bool** | If the file is in failed state, usually means failed permanently. | [optional] [default to null]
**FileName** | **string** | Filename. | [optional] [default to null]
**FileStatus** | **int32** | Status of the file. | [optional] [default to null]
**IngestRecordCount** | **int32** | Total numbers of records ingested for this file in Insights. | [optional] [default to null]
**RetryCount** | **int32** | Total number of times file has been retried. | [optional] [default to null]
**RetryEndTime** | [**time.Time**](time.Time.md) | End time of last retry attempt. | [optional] [default to null]
**RetryStartTime** | [**time.Time**](time.Time.md) | Start time of last retry attempt. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

