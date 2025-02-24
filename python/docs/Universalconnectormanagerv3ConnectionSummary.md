# Universalconnectormanagerv3ConnectionSummary

Structure for [Universal connector] Connection response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connection_alias** | **str** | Connection configuration nickname, set by dev/user (optional). | [optional] 
**connection_changed** | **datetime** | Date changed; used to defer tenant status queries immediately after creation. | [optional] 
**connection_config_id** | **str** | Foreign key to the saved connection configuration by the user. | [optional] 
**connection_configuration_note** | **str** | Datasource configuration note, by plugin developers, intended for user. | [optional] 
**connection_filter_alias** | **str** | Connector filter plugin alias (datasource, usually, like \&quot;MongoDB\&quot;). | [optional] 
**connection_id** | **str** | Connection configuration id. | [optional] 
**connection_input_alias** | **str** | Connection input plugin alias, like \&quot;Filebeat\&quot;. | [optional] 
**connection_route** | [**Universalconnectormanagerv3ConnectionRoute**](Universalconnectormanagerv3ConnectionRoute.md) |  | [optional] 
**connection_status** | [**Universalconnectormanagerv3ConnectionStatus**](Universalconnectormanagerv3ConnectionStatus.md) |  | [optional] 
**user** | [**Universalconnectormanagerv3User**](Universalconnectormanagerv3User.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_connection_summary import Universalconnectormanagerv3ConnectionSummary

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3ConnectionSummary from a JSON string
universalconnectormanagerv3_connection_summary_instance = Universalconnectormanagerv3ConnectionSummary.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3ConnectionSummary.to_json())

# convert the object into a dict
universalconnectormanagerv3_connection_summary_dict = universalconnectormanagerv3_connection_summary_instance.to_dict()
# create an instance of Universalconnectormanagerv3ConnectionSummary from a dict
universalconnectormanagerv3_connection_summary_from_dict = Universalconnectormanagerv3ConnectionSummary.from_dict(universalconnectormanagerv3_connection_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


