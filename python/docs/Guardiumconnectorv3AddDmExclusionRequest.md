# Guardiumconnectorv3AddDmExclusionRequest

Request to add a datamart to the exclusion list.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datamart** | **str** | Datamart name. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_add_dm_exclusion_request import Guardiumconnectorv3AddDmExclusionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3AddDmExclusionRequest from a JSON string
guardiumconnectorv3_add_dm_exclusion_request_instance = Guardiumconnectorv3AddDmExclusionRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3AddDmExclusionRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_add_dm_exclusion_request_dict = guardiumconnectorv3_add_dm_exclusion_request_instance.to_dict()
# create an instance of Guardiumconnectorv3AddDmExclusionRequest from a dict
guardiumconnectorv3_add_dm_exclusion_request_from_dict = Guardiumconnectorv3AddDmExclusionRequest.from_dict(guardiumconnectorv3_add_dm_exclusion_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


