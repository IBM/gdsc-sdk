# Notificationsv3TestIntegrationRequest

Test the specified integrations confiuguration.  The configuration properties vary by integration and must match the required content.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**integration_type** | **str** | The integration type, SMTP, SYSLOG, SERVICE_NOW, etc. | [optional] 
**options** | **Dict[str, str]** | The integration properties; they must match those required by the integration. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.notificationsv3_test_integration_request import Notificationsv3TestIntegrationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3TestIntegrationRequest from a JSON string
notificationsv3_test_integration_request_instance = Notificationsv3TestIntegrationRequest.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3TestIntegrationRequest.to_json())

# convert the object into a dict
notificationsv3_test_integration_request_dict = notificationsv3_test_integration_request_instance.to_dict()
# create an instance of Notificationsv3TestIntegrationRequest from a dict
notificationsv3_test_integration_request_from_dict = Notificationsv3TestIntegrationRequest.from_dict(notificationsv3_test_integration_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


