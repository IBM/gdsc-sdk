# Healthcollectorv3CountObject

Count object is the generic object which indicates counts and timestamp.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **str** | Count of the entity. | [optional] 
**timestamp** | **datetime** | Timestamp for the counts. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_count_object import Healthcollectorv3CountObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3CountObject from a JSON string
healthcollectorv3_count_object_instance = Healthcollectorv3CountObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3CountObject.to_json())

# convert the object into a dict
healthcollectorv3_count_object_dict = healthcollectorv3_count_object_instance.to_dict()
# create an instance of Healthcollectorv3CountObject from a dict
healthcollectorv3_count_object_from_dict = Healthcollectorv3CountObject.from_dict(healthcollectorv3_count_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


