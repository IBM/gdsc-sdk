# Reportsv3Artifact


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artifact_id** | **str** |  | [optional] 
**create_user_id** | **str** |  | [optional] 
**create_user_name** | **str** |  | [optional] 
**date_created** | **datetime** |  | [optional] 
**date_updated** | **datetime** |  | [optional] 
**description** | **str** |  | [optional] 
**type** | [**Reportsv3ArtifactType**](Reportsv3ArtifactType.md) |  | [optional] [default to Reportsv3ArtifactType.ARTIFACT_UNKNOWN]
**update_user_id** | **str** |  | [optional] 
**update_user_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_artifact import Reportsv3Artifact

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3Artifact from a JSON string
reportsv3_artifact_instance = Reportsv3Artifact.from_json(json)
# print the JSON string representation of the object
print(Reportsv3Artifact.to_json())

# convert the object into a dict
reportsv3_artifact_dict = reportsv3_artifact_instance.to_dict()
# create an instance of Reportsv3Artifact from a dict
reportsv3_artifact_from_dict = Reportsv3Artifact.from_dict(reportsv3_artifact_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


