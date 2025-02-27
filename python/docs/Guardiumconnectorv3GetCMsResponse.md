# Guardiumconnectorv3GetCMsResponse

Retrieves the list of Central Managers and number of Managed Units.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cms** | [**List[Guardiumconnectorv3CM]**](Guardiumconnectorv3CM.md) | List of Central Managers. | [optional] 
**status** | [**Guardiumconnectorv3StatusResponseBase**](Guardiumconnectorv3StatusResponseBase.md) |  | [optional] 
**total_mus** | **int** | Total list of Managed Units. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_get_cms_response import Guardiumconnectorv3GetCMsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3GetCMsResponse from a JSON string
guardiumconnectorv3_get_cms_response_instance = Guardiumconnectorv3GetCMsResponse.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3GetCMsResponse.to_json())

# convert the object into a dict
guardiumconnectorv3_get_cms_response_dict = guardiumconnectorv3_get_cms_response_instance.to_dict()
# create an instance of Guardiumconnectorv3GetCMsResponse from a dict
guardiumconnectorv3_get_cms_response_from_dict = Guardiumconnectorv3GetCMsResponse.from_dict(guardiumconnectorv3_get_cms_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


