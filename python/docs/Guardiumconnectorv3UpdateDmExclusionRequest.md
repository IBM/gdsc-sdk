# Guardiumconnectorv3UpdateDmExclusionRequest

Request to update datamart exclusion list.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datamart_list** | **List[str]** | List of datamarts. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_update_dm_exclusion_request import Guardiumconnectorv3UpdateDmExclusionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3UpdateDmExclusionRequest from a JSON string
guardiumconnectorv3_update_dm_exclusion_request_instance = Guardiumconnectorv3UpdateDmExclusionRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3UpdateDmExclusionRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_update_dm_exclusion_request_dict = guardiumconnectorv3_update_dm_exclusion_request_instance.to_dict()
# create an instance of Guardiumconnectorv3UpdateDmExclusionRequest from a dict
guardiumconnectorv3_update_dm_exclusion_request_from_dict = Guardiumconnectorv3UpdateDmExclusionRequest.from_dict(guardiumconnectorv3_update_dm_exclusion_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


