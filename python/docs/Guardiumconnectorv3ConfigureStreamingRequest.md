# Guardiumconnectorv3ConfigureStreamingRequest

Configure datamart streaming for Managed Units.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | Enable/disable. | [optional] 
**central_manager_id** | **str** | Central Manager ID. | [optional] 
**skip_historical_datamarts** | **bool** | Flag to either skip or include historical datamarts as part of configure streaming API. | [optional] 
**units** | **List[str]** | List of managed units that will be configured for datamart streaming. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_configure_streaming_request import Guardiumconnectorv3ConfigureStreamingRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3ConfigureStreamingRequest from a JSON string
guardiumconnectorv3_configure_streaming_request_instance = Guardiumconnectorv3ConfigureStreamingRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3ConfigureStreamingRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_configure_streaming_request_dict = guardiumconnectorv3_configure_streaming_request_instance.to_dict()
# create an instance of Guardiumconnectorv3ConfigureStreamingRequest from a dict
guardiumconnectorv3_configure_streaming_request_from_dict = Guardiumconnectorv3ConfigureStreamingRequest.from_dict(guardiumconnectorv3_configure_streaming_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


