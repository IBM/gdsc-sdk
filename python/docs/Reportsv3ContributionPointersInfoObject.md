# Reportsv3ContributionPointersInfoObject

ContributionPointersInfoObject is the request type for the api call to get the SQls based on the constructIDs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**column** | **str** | The colmun name in the db2 table. | [optional] 
**operator** | **str** | The operation to perform. | [optional] 
**value** | **str** | The value to match. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_contribution_pointers_info_object import Reportsv3ContributionPointersInfoObject

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3ContributionPointersInfoObject from a JSON string
reportsv3_contribution_pointers_info_object_instance = Reportsv3ContributionPointersInfoObject.from_json(json)
# print the JSON string representation of the object
print(Reportsv3ContributionPointersInfoObject.to_json())

# convert the object into a dict
reportsv3_contribution_pointers_info_object_dict = reportsv3_contribution_pointers_info_object_instance.to_dict()
# create an instance of Reportsv3ContributionPointersInfoObject from a dict
reportsv3_contribution_pointers_info_object_from_dict = Reportsv3ContributionPointersInfoObject.from_dict(reportsv3_contribution_pointers_info_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


