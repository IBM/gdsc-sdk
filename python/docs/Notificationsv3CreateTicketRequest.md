# Notificationsv3CreateTicketRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_data** | **Dict[str, str]** |  | [optional] 
**contents** | **str** |  | [optional] 
**integration_id** | **str** |  | [optional] 
**severity** | [**Notificationsv3NotificationSeverity**](Notificationsv3NotificationSeverity.md) |  | [optional] 
**title** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.notificationsv3_create_ticket_request import Notificationsv3CreateTicketRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3CreateTicketRequest from a JSON string
notificationsv3_create_ticket_request_instance = Notificationsv3CreateTicketRequest.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3CreateTicketRequest.to_json())

# convert the object into a dict
notificationsv3_create_ticket_request_dict = notificationsv3_create_ticket_request_instance.to_dict()
# create an instance of Notificationsv3CreateTicketRequest from a dict
notificationsv3_create_ticket_request_from_dict = Notificationsv3CreateTicketRequest.from_dict(notificationsv3_create_ticket_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


