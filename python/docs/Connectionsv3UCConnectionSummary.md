# Connectionsv3UCConnectionSummary

Structure for [Universal connector] Connection.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **str** | Connection configuration nickname, set by dev/user (optional). | [optional] 
**config_id** | **str** | Foreign key to the saved connection configuration by the user. | [optional] 
**datasource_type** | **str** | Datasource type. | [optional] 
**edge_deployment_server** | [**Connectionsv3EdgeDeploymentServer**](Connectionsv3EdgeDeploymentServer.md) |  | [optional] 
**filter_alias** | **str** | Connector filter plugin alias (datasource, usually, like \&quot;MongoDB\&quot;). | [optional] 
**host** | **str** | URI where related Universal connector service is running/listening. | [optional] 
**input_alias** | **str** | Connection input plugin alias, like \&quot;Filebeat\&quot;. | [optional] 
**last_response** | **str** | The heartbeat. | [optional] 
**port** | **str** | Port where the related Universal connector service is running/listening. | [optional] 
**status** | [**Connectionsv3Status**](Connectionsv3Status.md) |  | [optional] 
**status_text** | **str** | If status is not OK, details what&#39;s wrong (non-localized). | [optional] 
**uc_connection_id** | **str** | UC connection id. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.connectionsv3_uc_connection_summary import Connectionsv3UCConnectionSummary

# TODO update the JSON string below
json = "{}"
# create an instance of Connectionsv3UCConnectionSummary from a JSON string
connectionsv3_uc_connection_summary_instance = Connectionsv3UCConnectionSummary.from_json(json)
# print the JSON string representation of the object
print(Connectionsv3UCConnectionSummary.to_json())

# convert the object into a dict
connectionsv3_uc_connection_summary_dict = connectionsv3_uc_connection_summary_instance.to_dict()
# create an instance of Connectionsv3UCConnectionSummary from a dict
connectionsv3_uc_connection_summary_from_dict = Connectionsv3UCConnectionSummary.from_dict(connectionsv3_uc_connection_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


