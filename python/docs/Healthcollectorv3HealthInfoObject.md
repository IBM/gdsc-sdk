# Healthcollectorv3HealthInfoObject

Health Info in Gdp Format.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodes** | [**List[Healthcollectorv3ManagedUnitObjectGdp]**](Healthcollectorv3ManagedUnitObjectGdp.md) | List of Guardium Data Protection systems. | [optional] 
**staps** | [**List[Healthcollectorv3StapObjectGdp]**](Healthcollectorv3StapObjectGdp.md) | List of S-TAP objects. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.healthcollectorv3_health_info_object import Healthcollectorv3HealthInfoObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3HealthInfoObject from a JSON string
healthcollectorv3_health_info_object_instance = Healthcollectorv3HealthInfoObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3HealthInfoObject.to_json())

# convert the object into a dict
healthcollectorv3_health_info_object_dict = healthcollectorv3_health_info_object_instance.to_dict()
# create an instance of Healthcollectorv3HealthInfoObject from a dict
healthcollectorv3_health_info_object_from_dict = Healthcollectorv3HealthInfoObject.from_dict(healthcollectorv3_health_info_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


