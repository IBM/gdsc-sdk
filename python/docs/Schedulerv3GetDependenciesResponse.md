# Schedulerv3GetDependenciesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencies** | [**List[Schedulerv3Dependency]**](Schedulerv3Dependency.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_get_dependencies_response import Schedulerv3GetDependenciesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3GetDependenciesResponse from a JSON string
schedulerv3_get_dependencies_response_instance = Schedulerv3GetDependenciesResponse.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3GetDependenciesResponse.to_json())

# convert the object into a dict
schedulerv3_get_dependencies_response_dict = schedulerv3_get_dependencies_response_instance.to_dict()
# create an instance of Schedulerv3GetDependenciesResponse from a dict
schedulerv3_get_dependencies_response_from_dict = Schedulerv3GetDependenciesResponse.from_dict(schedulerv3_get_dependencies_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


