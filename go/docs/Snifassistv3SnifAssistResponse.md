# Snifassistv3SnifAssistResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BatchNum** | **string** | Specify batch number if Type is POLICY or GROUP_UPDATE. | [optional] [default to null]
**Data** | **string** | Data field if any. | [optional] [default to null]
**DataCrc** | **int64** | Provide CRC value of Response Data. | [optional] [default to null]
**StapId** | **string** | Provide STAP identifer. | [optional] [default to null]
**StapOperation** | [***Snifassistv3StapOperation**](snifassistv3StapOperation.md) |  | [optional] [default to null]
**StatusCode** | **int32** | Status code: 0 &#x3D; success; 1 &#x3D; failure. | [optional] [default to null]
**Type_** | [***Snifassistv3SnifAssistType**](snifassistv3SnifAssistType.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

