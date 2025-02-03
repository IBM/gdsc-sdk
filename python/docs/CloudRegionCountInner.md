# CloudRegionCountInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud_region** | **str** |  | 
**count** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_software.models.cloud_region_count_inner import CloudRegionCountInner

# TODO update the JSON string below
json = "{}"
# create an instance of CloudRegionCountInner from a JSON string
cloud_region_count_inner_instance = CloudRegionCountInner.from_json(json)
# print the JSON string representation of the object
print(CloudRegionCountInner.to_json())

# convert the object into a dict
cloud_region_count_inner_dict = cloud_region_count_inner_instance.to_dict()
# create an instance of CloudRegionCountInner from a dict
cloud_region_count_inner_from_dict = CloudRegionCountInner.from_dict(cloud_region_count_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


