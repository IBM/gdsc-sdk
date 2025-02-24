# DataStoresSummaryCloudLocationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**location** | **str** |  | 
**count** | **float** |  | 

## Example

```python
from ibm_gdsc_sdk_saas.models.data_stores_summary_cloud_locations_inner import DataStoresSummaryCloudLocationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of DataStoresSummaryCloudLocationsInner from a JSON string
data_stores_summary_cloud_locations_inner_instance = DataStoresSummaryCloudLocationsInner.from_json(json)
# print the JSON string representation of the object
print(DataStoresSummaryCloudLocationsInner.to_json())

# convert the object into a dict
data_stores_summary_cloud_locations_inner_dict = data_stores_summary_cloud_locations_inner_instance.to_dict()
# create an instance of DataStoresSummaryCloudLocationsInner from a dict
data_stores_summary_cloud_locations_inner_from_dict = DataStoresSummaryCloudLocationsInner.from_dict(data_stores_summary_cloud_locations_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


