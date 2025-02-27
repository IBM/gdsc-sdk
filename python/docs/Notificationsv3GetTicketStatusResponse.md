# Notificationsv3GetTicketStatusResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**value** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.notificationsv3_get_ticket_status_response import Notificationsv3GetTicketStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Notificationsv3GetTicketStatusResponse from a JSON string
notificationsv3_get_ticket_status_response_instance = Notificationsv3GetTicketStatusResponse.from_json(json)
# print the JSON string representation of the object
print(Notificationsv3GetTicketStatusResponse.to_json())

# convert the object into a dict
notificationsv3_get_ticket_status_response_dict = notificationsv3_get_ticket_status_response_instance.to_dict()
# create an instance of Notificationsv3GetTicketStatusResponse from a dict
notificationsv3_get_ticket_status_response_from_dict = Notificationsv3GetTicketStatusResponse.from_dict(notificationsv3_get_ticket_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


