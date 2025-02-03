# Qspmpolicymanagerv3CreateTicketResponse

Response from creating a ticket.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create_time** | **datetime** |  | [optional] 
**integration_name** | **str** |  | [optional] 
**status** | [**RpcStatus**](RpcStatus.md) |  | [optional] 
**summary** | **str** |  | [optional] 
**ticket_id** | **str** |  | [optional] 
**ticket_number** | **str** |  | [optional] 
**uri** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.qspmpolicymanagerv3_create_ticket_response import Qspmpolicymanagerv3CreateTicketResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpolicymanagerv3CreateTicketResponse from a JSON string
qspmpolicymanagerv3_create_ticket_response_instance = Qspmpolicymanagerv3CreateTicketResponse.from_json(json)
# print the JSON string representation of the object
print(Qspmpolicymanagerv3CreateTicketResponse.to_json())

# convert the object into a dict
qspmpolicymanagerv3_create_ticket_response_dict = qspmpolicymanagerv3_create_ticket_response_instance.to_dict()
# create an instance of Qspmpolicymanagerv3CreateTicketResponse from a dict
qspmpolicymanagerv3_create_ticket_response_from_dict = Qspmpolicymanagerv3CreateTicketResponse.from_dict(qspmpolicymanagerv3_create_ticket_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


