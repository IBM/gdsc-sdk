# Connectionsv3StatusResponseBase

StatusResponseBase is the message that stores status code and message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Message for status response. | [optional] 
**status** | **str** | Status code. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_status_response_base import Connectionsv3StatusResponseBase

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3StatusResponseBase from a JSON string
connectionsv3_status_response_base_instance = Connectionsv3StatusResponseBase.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3StatusResponseBase.to_json())

# convert the object into a dict
connectionsv3_status_response_base_dict = connectionsv3_status_response_base_instance.to_dict()
# create an instance of Connectionsv3StatusResponseBase from a dict
connectionsv3_status_response_base_from_dict = Connectionsv3StatusResponseBase.from_dict(connectionsv3_status_response_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


