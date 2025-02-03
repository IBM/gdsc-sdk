# Guardiumconnectorv3GetStreamingStatusResponse

Returns the datamart streaming status response for Managed Units.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**records** | [**List[Guardiumconnectorv3StreamingStatusRecord]**](Guardiumconnectorv3StreamingStatusRecord.md) | Status records. | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_get_streaming_status_response import Guardiumconnectorv3GetStreamingStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetStreamingStatusResponse from a JSON string
guardiumconnectorv3_get_streaming_status_response_instance = Guardiumconnectorv3GetStreamingStatusResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetStreamingStatusResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_streaming_status_response_dict = guardiumconnectorv3_get_streaming_status_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetStreamingStatusResponse from a dict
guardiumconnectorv3_get_streaming_status_response_from_dict = Guardiumconnectorv3GetStreamingStatusResponse.from_dict(guardiumconnectorv3_get_streaming_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


