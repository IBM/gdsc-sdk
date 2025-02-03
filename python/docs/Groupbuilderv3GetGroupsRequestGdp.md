# Groupbuilderv3GetGroupsRequestGdp


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**central_manager_id** | **str** | ID of central manager. | [optional] 
**data** | [**List[Groupbuilderv3GdpGroup]**](Groupbuilderv3GdpGroup.md) | Groups pushed from GDP. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.groupbuilderv3_get_groups_request_gdp import Groupbuilderv3GetGroupsRequestGdp

# TODO update the JSON string below
json = "{}"
# create an instance of Groupbuilderv3GetGroupsRequestGdp from a JSON string
groupbuilderv3_get_groups_request_gdp_instance = Groupbuilderv3GetGroupsRequestGdp.from_json(json)
# print the JSON string representation of the object
print(Groupbuilderv3GetGroupsRequestGdp.to_json())

# convert the object into a dict
groupbuilderv3_get_groups_request_gdp_dict = groupbuilderv3_get_groups_request_gdp_instance.to_dict()
# create an instance of Groupbuilderv3GetGroupsRequestGdp from a dict
groupbuilderv3_get_groups_request_gdp_from_dict = Groupbuilderv3GetGroupsRequestGdp.from_dict(groupbuilderv3_get_groups_request_gdp_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


