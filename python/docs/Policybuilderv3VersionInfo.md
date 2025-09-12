# Policybuilderv3VersionInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creation_timestamp** | **datetime** |  | [optional] 
**last_revised_by** | **str** |  | [optional] 
**version** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.policybuilderv3_version_info import Policybuilderv3VersionInfo

# TODO update the JSON string below
json = "{}"
# create an instance of Policybuilderv3VersionInfo from a JSON string
policybuilderv3_version_info_instance = Policybuilderv3VersionInfo.from_json(json)
# print the JSON string representation of the object
print(Policybuilderv3VersionInfo.to_json())

# convert the object into a dict
policybuilderv3_version_info_dict = policybuilderv3_version_info_instance.to_dict()
# create an instance of Policybuilderv3VersionInfo from a dict
policybuilderv3_version_info_from_dict = Policybuilderv3VersionInfo.from_dict(policybuilderv3_version_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


