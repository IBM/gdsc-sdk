# Ecosystemv3GetPurgableRowsRequest

Requires hot retention period and hot retention period unit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hot_retention_period** | **str** | Return number of rows created at this time or later (&gt;&#x3D;). | [optional] 
**hot_retention_period_unit** | **str** | Return number of rows created before this time (&lt;). | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.ecosystemv3_get_purgable_rows_request import Ecosystemv3GetPurgableRowsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3GetPurgableRowsRequest from a JSON string
ecosystemv3_get_purgable_rows_request_instance = Ecosystemv3GetPurgableRowsRequest.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3GetPurgableRowsRequest.to_json())

# convert the object into a dict
ecosystemv3_get_purgable_rows_request_dict = ecosystemv3_get_purgable_rows_request_instance.to_dict()
# create an instance of Ecosystemv3GetPurgableRowsRequest from a dict
ecosystemv3_get_purgable_rows_request_from_dict = Ecosystemv3GetPurgableRowsRequest.from_dict(ecosystemv3_get_purgable_rows_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


