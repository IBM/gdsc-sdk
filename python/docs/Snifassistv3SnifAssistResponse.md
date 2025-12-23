# Snifassistv3SnifAssistResponse

SnifAssistResponse defines the message structure for response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_num** | **str** | Specify batch number if Type is POLICY or GROUP_UPDATE. | [optional] 
**data** | **bytearray** | Data field if any. | [optional] 
**data_crc** | **int** | Provide CRC value of Response Data. | [optional] 
**stap_id** | **str** | Provide STAP identifer. | [optional] 
**stap_operation** | [**Snifassistv3StapOperation**](Snifassistv3StapOperation.md) |  | [optional] [default to Snifassistv3StapOperation.STAP_REINITIALIZE_BUFFER]
**status_code** | **int** | Status code: 0 &#x3D; success; 1 &#x3D; failure. | [optional] 
**type** | [**Snifassistv3SnifAssistType**](Snifassistv3SnifAssistType.md) |  | [optional] [default to Snifassistv3SnifAssistType.VERSION_NOT_SUPPORTED]

## Example

```python
from ibm_gdsc_sdk_saas.models.snifassistv3_snif_assist_response import Snifassistv3SnifAssistResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Snifassistv3SnifAssistResponse from a JSON string
snifassistv3_snif_assist_response_instance = Snifassistv3SnifAssistResponse.from_json(json)
# print the JSON string representation of the object
print(Snifassistv3SnifAssistResponse.to_json())

# convert the object into a dict
snifassistv3_snif_assist_response_dict = snifassistv3_snif_assist_response_instance.to_dict()
# create an instance of Snifassistv3SnifAssistResponse from a dict
snifassistv3_snif_assist_response_from_dict = Snifassistv3SnifAssistResponse.from_dict(snifassistv3_snif_assist_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


