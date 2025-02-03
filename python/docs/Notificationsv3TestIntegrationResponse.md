# Notificationsv3TestIntegrationResponse

Response from test of an SMTP configuration.  A translated response is provided to provide status of the test.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | **str** | The result is \&quot;\&quot; if the operation is a success, otherwise a translated error is returned. | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.notificationsv3_test_integration_response import Notificationsv3TestIntegrationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3TestIntegrationResponse from a JSON string
notificationsv3_test_integration_response_instance = Notificationsv3TestIntegrationResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3TestIntegrationResponse.to_json())

# convert the object into a dict
notificationsv3_test_integration_response_dict = notificationsv3_test_integration_response_instance.to_dict()
# create an instance of Notificationsv3TestIntegrationResponse from a dict
notificationsv3_test_integration_response_from_dict = Notificationsv3TestIntegrationResponse.from_dict(notificationsv3_test_integration_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


