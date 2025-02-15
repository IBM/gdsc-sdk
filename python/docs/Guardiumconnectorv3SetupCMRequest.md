# Guardiumconnectorv3SetupCMRequest

SetupCMRequest is the argument type used to register a GDP Central Manager to Guardium.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**List[Guardiumconnectorv3Attribute]**](Guardiumconnectorv3Attribute.md) | Attributes specific to the GDP Central Manager. | [optional] 
**cm_gid** | **str** | Central Manager GID. | [optional] 
**cm_hostname** | **str** | Central Manager hostname. | [optional] 
**cm_ip** | **str** | Central Manager IP. | [optional] 
**push_registration** | **bool** | Attribute used to distinguish between old mode (pull) and new SaaS mode (push) used during registration. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_setup_cm_request import Guardiumconnectorv3SetupCMRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3SetupCMRequest from a JSON string
guardiumconnectorv3_setup_cm_request_instance = Guardiumconnectorv3SetupCMRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3SetupCMRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_setup_cm_request_dict = guardiumconnectorv3_setup_cm_request_instance.to_dict()
# create an instance of Guardiumconnectorv3SetupCMRequest from a dict
guardiumconnectorv3_setup_cm_request_from_dict = Guardiumconnectorv3SetupCMRequest.from_dict(guardiumconnectorv3_setup_cm_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


