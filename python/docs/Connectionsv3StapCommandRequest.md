# Connectionsv3StapCommandRequest

StapCommandRequest defines the message structure for STAP command request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**command** | **str** | Specify STAP command. | [optional] 
**operation** | [**Connectionsv3StapOperation**](Connectionsv3StapOperation.md) |  | [optional] 
**stap_id** | **str** | Provide STAP identifier. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.connectionsv3_stap_command_request import Connectionsv3StapCommandRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3StapCommandRequest from a JSON string
connectionsv3_stap_command_request_instance = Connectionsv3StapCommandRequest.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3StapCommandRequest.to_json())

# convert the object into a dict
connectionsv3_stap_command_request_dict = connectionsv3_stap_command_request_instance.to_dict()
# create an instance of Connectionsv3StapCommandRequest from a dict
connectionsv3_stap_command_request_from_dict = Connectionsv3StapCommandRequest.from_dict(connectionsv3_stap_command_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


