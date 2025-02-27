# Qspmpolicymanagerv3UpdateTicketStatusRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy_dataset_id** | **str** |  | [optional] 
**policy_type** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_update_ticket_status_request import Qspmpolicymanagerv3UpdateTicketStatusRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpolicymanagerv3UpdateTicketStatusRequest from a JSON string
qspmpolicymanagerv3_update_ticket_status_request_instance = Qspmpolicymanagerv3UpdateTicketStatusRequest.from_json(json)
# print the JSON string representation of the object
print(Qspmpolicymanagerv3UpdateTicketStatusRequest.to_json())

# convert the object into a dict
qspmpolicymanagerv3_update_ticket_status_request_dict = qspmpolicymanagerv3_update_ticket_status_request_instance.to_dict()
# create an instance of Qspmpolicymanagerv3UpdateTicketStatusRequest from a dict
qspmpolicymanagerv3_update_ticket_status_request_from_dict = Qspmpolicymanagerv3UpdateTicketStatusRequest.from_dict(qspmpolicymanagerv3_update_ticket_status_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


