# Qspmpolicymanagerv3CreateTicketRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_dataset_id** | **str** |  | [optional] 
**policy_type** | **str** |  | [optional] 
**additional_data** | **Dict[str, str]** |  | [optional] 
**contents** | **str** |  | [optional] 
**integration_id** | **str** |  | [optional] 
**severity** | [**Qspmpolicymanagerv3NotificationSeverity**](Qspmpolicymanagerv3NotificationSeverity.md) |  | [optional] 
**title** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_create_ticket_request import Qspmpolicymanagerv3CreateTicketRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpolicymanagerv3CreateTicketRequest from a JSON string
qspmpolicymanagerv3_create_ticket_request_instance = Qspmpolicymanagerv3CreateTicketRequest.from_json(json)
# print the JSON string representation of the object
print(Qspmpolicymanagerv3CreateTicketRequest.to_json())

# convert the object into a dict
qspmpolicymanagerv3_create_ticket_request_dict = qspmpolicymanagerv3_create_ticket_request_instance.to_dict()
# create an instance of Qspmpolicymanagerv3CreateTicketRequest from a dict
qspmpolicymanagerv3_create_ticket_request_from_dict = Qspmpolicymanagerv3CreateTicketRequest.from_dict(qspmpolicymanagerv3_create_ticket_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


