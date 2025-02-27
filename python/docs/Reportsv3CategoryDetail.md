# Reportsv3CategoryDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category_description** | **str** | The category description. | [optional] 
**category_name** | **str** | Identifies the NLS translated string. | [optional] 
**category_tables** | **List[str]** |  | [optional] 
**timestamp_mapping** | [**List[Reportsv3TimestampMapping]**](Reportsv3TimestampMapping.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_category_detail import Reportsv3CategoryDetail

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3CategoryDetail from a JSON string
reportsv3_category_detail_instance = Reportsv3CategoryDetail.from_json(json)
# print the JSON string representation of the object
print(Reportsv3CategoryDetail.to_json())

# convert the object into a dict
reportsv3_category_detail_dict = reportsv3_category_detail_instance.to_dict()
# create an instance of Reportsv3CategoryDetail from a dict
reportsv3_category_detail_from_dict = Reportsv3CategoryDetail.from_dict(reportsv3_category_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


