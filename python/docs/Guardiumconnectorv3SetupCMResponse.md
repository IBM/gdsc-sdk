# Guardiumconnectorv3SetupCMResponse

SetupCMResponse is the response after registering a GDP Central manager to Guardium insights.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response** | **str** | Response message. | [optional] 
**response_code** | **str** | Translatable reponse code or empty string if there is no response. | [optional] 
**tasks** | [**List[Guardiumconnectorv3TaskObject]**](Guardiumconnectorv3TaskObject.md) | List of Tasks associated with the Central Manager. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_setup_cm_response import Guardiumconnectorv3SetupCMResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3SetupCMResponse from a JSON string
guardiumconnectorv3_setup_cm_response_instance = Guardiumconnectorv3SetupCMResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3SetupCMResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_setup_cm_response_dict = guardiumconnectorv3_setup_cm_response_instance.to_dict()
# create an instance of Guardiumconnectorv3SetupCMResponse from a dict
guardiumconnectorv3_setup_cm_response_from_dict = Guardiumconnectorv3SetupCMResponse.from_dict(guardiumconnectorv3_setup_cm_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


