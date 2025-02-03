# Guardiumconnectorv3UpdateStreamingRequest

UpdateStreamingRequest is the request message containing the status of the CM pushed by GDP.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | ID of central manager. | [optional] 
**records** | [**List[Guardiumconnectorv3StatusRecord]**](Guardiumconnectorv3StatusRecord.md) | Status records pushed from GDP. | [optional] 
**status** | **str** | Status response from GDP grdapi. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_update_streaming_request import Guardiumconnectorv3UpdateStreamingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3UpdateStreamingRequest from a JSON string
guardiumconnectorv3_update_streaming_request_instance = Guardiumconnectorv3UpdateStreamingRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3UpdateStreamingRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_update_streaming_request_dict = guardiumconnectorv3_update_streaming_request_instance.to_dict()
# create an instance of Guardiumconnectorv3UpdateStreamingRequest from a dict
guardiumconnectorv3_update_streaming_request_from_dict = Guardiumconnectorv3UpdateStreamingRequest.from_dict(guardiumconnectorv3_update_streaming_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


