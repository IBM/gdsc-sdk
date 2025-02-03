# Guardiumconnectorv3AddCMRequest

Add a new Central Manager.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cm** | [**Guardiumconnectorv3CM**](Guardiumconnectorv3CM.md) |  | [optional] 
**edit_cm_attributes** | **List[str]** | Central Manager edit attributes to get original values. | [optional] 
**is_edit** | **bool** | Flag to indicate if the Central Manager is being edited. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_add_cm_request import Guardiumconnectorv3AddCMRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3AddCMRequest from a JSON string
guardiumconnectorv3_add_cm_request_instance = Guardiumconnectorv3AddCMRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3AddCMRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_add_cm_request_dict = guardiumconnectorv3_add_cm_request_instance.to_dict()
# create an instance of Guardiumconnectorv3AddCMRequest from a dict
guardiumconnectorv3_add_cm_request_from_dict = Guardiumconnectorv3AddCMRequest.from_dict(guardiumconnectorv3_add_cm_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


