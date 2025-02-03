# Guardiumconnectorv3UpdateStreamingResponse

UpdateStreamingResponse is the response message object returned when updating the streaming status in GI.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response** | **str** | Response message. | [optional] 
**response_code** | **str** | Translatable reponse code or empty string if there is no response. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_update_streaming_response import Guardiumconnectorv3UpdateStreamingResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3UpdateStreamingResponse from a JSON string
guardiumconnectorv3_update_streaming_response_instance = Guardiumconnectorv3UpdateStreamingResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3UpdateStreamingResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_update_streaming_response_dict = guardiumconnectorv3_update_streaming_response_instance.to_dict()
# create an instance of Guardiumconnectorv3UpdateStreamingResponse from a dict
guardiumconnectorv3_update_streaming_response_from_dict = Guardiumconnectorv3UpdateStreamingResponse.from_dict(guardiumconnectorv3_update_streaming_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


