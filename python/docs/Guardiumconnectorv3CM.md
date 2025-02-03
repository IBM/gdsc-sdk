# Guardiumconnectorv3CM

Central Manager definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**List[Guardiumconnectorv3Attribute]**](Guardiumconnectorv3Attribute.md) | Central Manager attributes. | [optional] 
**central_manager_id** | **str** | Central Manager hostname or ip. | [optional] 
**cm_date_param_available** | **str** | Flag check if CM can handle setting start end date for aggregator dm export. | [optional] 
**datamart_end_date_aggregator** | **str** | Initial start date for streaming historical datamart from GDP aggregator. | [optional] 
**datamart_start_date_aggregator** | **str** | Initial start date for streaming historical datamart from GDP aggregator. | [optional] 
**datamart_start_date_collector** | **str** | Initial start date for streaming historical datamart from GDP. | [optional] 
**max_supported_dm_version** | **str** |  | [optional] 
**mode** | **str** | Flag to determine if GI supports push or pull mode. | [optional] 
**name** | **str** | Central Manager name. | [optional] 
**port** | **str** | Port used to communicate with the Central Manager. | [optional] 
**status** | **str** | Central Manager status. | [optional] 
**support_custom_dm_type_setup** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_cm import Guardiumconnectorv3CM

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3CM from a JSON string
guardiumconnectorv3_cm_instance = Guardiumconnectorv3CM.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3CM.to_json())

# convert the object into a dict
guardiumconnectorv3_cm_dict = guardiumconnectorv3_cm_instance.to_dict()
# create an instance of Guardiumconnectorv3CM from a dict
guardiumconnectorv3_cm_from_dict = Guardiumconnectorv3CM.from_dict(guardiumconnectorv3_cm_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


