# Groupbuilderv3GetGroupsResponseGdp


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response** | **str** | Response message. | [optional] 
**response_code** | **str** | Translatable response code or empty string if there is no response. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_groups_response_gdp import Groupbuilderv3GetGroupsResponseGdp

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetGroupsResponseGdp from a JSON string
groupbuilderv3_get_groups_response_gdp_instance = Groupbuilderv3GetGroupsResponseGdp.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetGroupsResponseGdp.to_json())

# convert the object into a dict
groupbuilderv3_get_groups_response_gdp_dict = groupbuilderv3_get_groups_response_gdp_instance.to_dict()
# create an instance of Groupbuilderv3GetGroupsResponseGdp from a dict
groupbuilderv3_get_groups_response_gdp_from_dict = Groupbuilderv3GetGroupsResponseGdp.from_dict(groupbuilderv3_get_groups_response_gdp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


