

# Snifassistv3SnifAssistResponse

SnifAssistResponse defines the message structure for response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **byte[]** | Data field if any. |  [optional] |
|**dataCrc** | **Long** | Provide CRC value of Response Data. |  [optional] |
|**stapId** | **String** | Provide STAP identifer. |  [optional] |
|**stapOperation** | **Snifassistv3StapOperation** |  |  [optional] |
|**statusCode** | **Integer** | Status code: 0 &#x3D; success; 1 &#x3D; failure. |  [optional] |
|**type** | **Snifassistv3SnifAssistType** |  |  [optional] |



