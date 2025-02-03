# Notificationsv3CreateTicketResponse

Response from creating a ticket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 
**summary** | **str** |  | [optional] 
**ticket_id** | **str** |  | [optional] 
**ticket_number** | **str** |  | [optional] 
**uri** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.notificationsv3_create_ticket_response import Notificationsv3CreateTicketResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3CreateTicketResponse from a JSON string
notificationsv3_create_ticket_response_instance = Notificationsv3CreateTicketResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3CreateTicketResponse.to_json())

# convert the object into a dict
notificationsv3_create_ticket_response_dict = notificationsv3_create_ticket_response_instance.to_dict()
# create an instance of Notificationsv3CreateTicketResponse from a dict
notificationsv3_create_ticket_response_from_dict = Notificationsv3CreateTicketResponse.from_dict(notificationsv3_create_ticket_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


