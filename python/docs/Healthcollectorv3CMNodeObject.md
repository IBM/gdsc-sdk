# Healthcollectorv3CMNodeObject

CMNodeObject gets health information for the central manager and all its managed units and monitoring agents.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cm** | **str** | Host name or IP address of the central manager. | [optional] 
**last_health_info_collected_timestamp** | **str** | Timestamp from when the health information was collected. | [optional] 
**nodes** | [**List[Healthcollectorv3ManagedUnitObject]**](Healthcollectorv3ManagedUnitObject.md) | List of Guardium Data Protection systems. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_cm_node_object import Healthcollectorv3CMNodeObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3CMNodeObject from a JSON string
healthcollectorv3_cm_node_object_instance = Healthcollectorv3CMNodeObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3CMNodeObject.to_json())

# convert the object into a dict
healthcollectorv3_cm_node_object_dict = healthcollectorv3_cm_node_object_instance.to_dict()
# create an instance of Healthcollectorv3CMNodeObject from a dict
healthcollectorv3_cm_node_object_from_dict = Healthcollectorv3CMNodeObject.from_dict(healthcollectorv3_cm_node_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


