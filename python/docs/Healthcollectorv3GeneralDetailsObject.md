# Healthcollectorv3GeneralDetailsObject

GeneralDetailsObject gets additional health information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**err_messages** | **str** | Error messages. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.healthcollectorv3_general_details_object import Healthcollectorv3GeneralDetailsObject

# TODO update the JSON string below
json = "{}"
# create an instance of Healthcollectorv3GeneralDetailsObject from a JSON string
healthcollectorv3_general_details_object_instance = Healthcollectorv3GeneralDetailsObject.from_json(json)
# print the JSON string representation of the object
print(Healthcollectorv3GeneralDetailsObject.to_json())

# convert the object into a dict
healthcollectorv3_general_details_object_dict = healthcollectorv3_general_details_object_instance.to_dict()
# create an instance of Healthcollectorv3GeneralDetailsObject from a dict
healthcollectorv3_general_details_object_from_dict = Healthcollectorv3GeneralDetailsObject.from_dict(healthcollectorv3_general_details_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


