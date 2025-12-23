# Connectionsv3StreamConnection

Structure for AWS/Azure Connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_id** | **str** | Account id. | [optional] 
**account_name** | **str** | Account name. | [optional] 
**cluster_resource_id** | **str** | Cluster resource ID. | [optional] 
**consumer_group_name** | **str** | Consumer group name. | [optional] 
**db_dns_endpoint** | **str** | Database DNS endpoint OR Database host. | [optional] 
**db_name** | **str** | Database name. | [optional] 
**db_type** | **str** | Database type. | [optional] 
**name** | **str** | Event Hub name || Stream name. | [optional] 
**namespace** | **str** | Optional: Namespace provided if the connection type is Azure. | [optional] 
**password** | **str** | Database credential password. | [optional] 
**port** | **str** | Port. | [optional] 
**provider** | **str** | Optional: the provider provided if the connection type is Azure. | [optional] 
**region** | **str** | Optional: the region provided if the connection type is AWS. | [optional] 
**start_monitor** | **str** | Connection Monitoring. | [optional] 
**status** | [**Connectionsv3Status**](Connectionsv3Status.md) |  | [optional] [default to Connectionsv3Status.UNDEFINED_STATUS]
**status_text** | **str** | If status is not OK, details what&#39;s wrong (non-localized). | [optional] 
**status_timestamp** | **str** | The time stamp of status. | [optional] 
**storage_connection_string** | **str** | Optional: Storage connection string must be provided if the connection type is Azure. | [optional] 
**username** | **str** | Database credential username. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_stream_connection import Connectionsv3StreamConnection

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3StreamConnection from a JSON string
connectionsv3_stream_connection_instance = Connectionsv3StreamConnection.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3StreamConnection.to_json())

# convert the object into a dict
connectionsv3_stream_connection_dict = connectionsv3_stream_connection_instance.to_dict()
# create an instance of Connectionsv3StreamConnection from a dict
connectionsv3_stream_connection_from_dict = Connectionsv3StreamConnection.from_dict(connectionsv3_stream_connection_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


