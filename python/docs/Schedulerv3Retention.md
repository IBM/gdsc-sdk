# Schedulerv3Retention

Retention include amount of retention time and whether to archive once over.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archive** | **bool** | Optional: Delete or archive. | [optional] 
**days** | **int** | Number of days to retain data. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.schedulerv3_retention import Schedulerv3Retention

# TODO update the JSON string below
json = "{}"
# create an instance of Schedulerv3Retention from a JSON string
schedulerv3_retention_instance = Schedulerv3Retention.from_json(json)
# print the JSON string representation of the object
print(Schedulerv3Retention.to_json())

# convert the object into a dict
schedulerv3_retention_dict = schedulerv3_retention_instance.to_dict()
# create an instance of Schedulerv3Retention from a dict
schedulerv3_retention_from_dict = Schedulerv3Retention.from_dict(schedulerv3_retention_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


