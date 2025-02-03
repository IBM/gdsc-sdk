# Guardiumconnectorv3BlockWhere

Where to execute the block action - either against a Guardium system with a globalID, or a DBaaS instance with a configID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config_id** | **str** | ID for AWS/Azure instance. | [optional] 
**guardium_id** | **str** | ID for guardium instance. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_block_where import Guardiumconnectorv3BlockWhere

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3BlockWhere from a JSON string
guardiumconnectorv3_block_where_instance = Guardiumconnectorv3BlockWhere.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3BlockWhere.to_json())

# convert the object into a dict
guardiumconnectorv3_block_where_dict = guardiumconnectorv3_block_where_instance.to_dict()
# create an instance of Guardiumconnectorv3BlockWhere from a dict
guardiumconnectorv3_block_where_from_dict = Guardiumconnectorv3BlockWhere.from_dict(guardiumconnectorv3_block_where_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


