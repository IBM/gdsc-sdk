# Reportsv3HeaderPair


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_header_id** | **str** |  | [optional] 
**target_header_id** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_header_pair import Reportsv3HeaderPair

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3HeaderPair from a JSON string
reportsv3_header_pair_instance = Reportsv3HeaderPair.from_json(json)
# print the JSON string representation of the object
print(Reportsv3HeaderPair.to_json())

# convert the object into a dict
reportsv3_header_pair_dict = reportsv3_header_pair_instance.to_dict()
# create an instance of Reportsv3HeaderPair from a dict
reportsv3_header_pair_from_dict = Reportsv3HeaderPair.from_dict(reportsv3_header_pair_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


