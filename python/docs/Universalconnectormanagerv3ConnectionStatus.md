# Universalconnectormanagerv3ConnectionStatus

An object that describes the Connectivity status of this connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**Universalconnectormanagerv3ConnectivityState**](Universalconnectormanagerv3ConnectivityState.md) |  | [optional] 
**status_text** | **str** | If status is not OK, details what&#39;s wrong (non-localized). | [optional] 
**timestamp** | **datetime** | Datetime of status. | [optional] 
**timestamp_last_ok** | **datetime** | Datetime of previous OK status. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.universalconnectormanagerv3_connection_status import Universalconnectormanagerv3ConnectionStatus

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3ConnectionStatus from a JSON string
universalconnectormanagerv3_connection_status_instance = Universalconnectormanagerv3ConnectionStatus.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3ConnectionStatus.to_json())

# convert the object into a dict
universalconnectormanagerv3_connection_status_dict = universalconnectormanagerv3_connection_status_instance.to_dict()
# create an instance of Universalconnectormanagerv3ConnectionStatus from a dict
universalconnectormanagerv3_connection_status_from_dict = Universalconnectormanagerv3ConnectionStatus.from_dict(universalconnectormanagerv3_connection_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


