# Guardiumconnectorv3GeneralDetailsObject

Health information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**err_messages** | **str** | Error messages. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_general_details_object import Guardiumconnectorv3GeneralDetailsObject

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GeneralDetailsObject from a JSON string
guardiumconnectorv3_general_details_object_instance = Guardiumconnectorv3GeneralDetailsObject.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GeneralDetailsObject.to_json())

# convert the object into a dict
guardiumconnectorv3_general_details_object_dict = guardiumconnectorv3_general_details_object_instance.to_dict()
# create an instance of Guardiumconnectorv3GeneralDetailsObject from a dict
guardiumconnectorv3_general_details_object_from_dict = Guardiumconnectorv3GeneralDetailsObject.from_dict(guardiumconnectorv3_general_details_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


