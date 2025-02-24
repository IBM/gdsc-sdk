# Guardiumconnectorv3StatusResponseBase

Default status message response from the Guardium connector service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Optional message field. | [optional] 
**status** | **str** | Status code returned by the Guardium connector. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_status_response_base import Guardiumconnectorv3StatusResponseBase

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3StatusResponseBase from a JSON string
guardiumconnectorv3_status_response_base_instance = Guardiumconnectorv3StatusResponseBase.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3StatusResponseBase.to_json())

# convert the object into a dict
guardiumconnectorv3_status_response_base_dict = guardiumconnectorv3_status_response_base_instance.to_dict()
# create an instance of Guardiumconnectorv3StatusResponseBase from a dict
guardiumconnectorv3_status_response_base_from_dict = Guardiumconnectorv3StatusResponseBase.from_dict(guardiumconnectorv3_status_response_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


