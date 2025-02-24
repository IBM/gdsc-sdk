# Qspmpolicymanagerv3UpdateTicketStatusResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**new_status** | **str** |  | [optional] 
**update_time** | **datetime** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.qspmpolicymanagerv3_update_ticket_status_response import Qspmpolicymanagerv3UpdateTicketStatusResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Qspmpolicymanagerv3UpdateTicketStatusResponse from a JSON string
qspmpolicymanagerv3_update_ticket_status_response_instance = Qspmpolicymanagerv3UpdateTicketStatusResponse.from_json(json)
# print the JSON string representation of the object
print(Qspmpolicymanagerv3UpdateTicketStatusResponse.to_json())

# convert the object into a dict
qspmpolicymanagerv3_update_ticket_status_response_dict = qspmpolicymanagerv3_update_ticket_status_response_instance.to_dict()
# create an instance of Qspmpolicymanagerv3UpdateTicketStatusResponse from a dict
qspmpolicymanagerv3_update_ticket_status_response_from_dict = Qspmpolicymanagerv3UpdateTicketStatusResponse.from_dict(qspmpolicymanagerv3_update_ticket_status_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


