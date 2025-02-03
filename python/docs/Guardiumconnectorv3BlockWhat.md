# Guardiumconnectorv3BlockWhat

Block a database user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bdbname** | **str** | DB name. | [optional] 
**bip** | **str** | DB server hostname. | [optional] 
**bport** | **str** | DB port. | [optional] 
**buser** | **str** | User to block. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.guardiumconnectorv3_block_what import Guardiumconnectorv3BlockWhat

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3BlockWhat from a JSON string
guardiumconnectorv3_block_what_instance = Guardiumconnectorv3BlockWhat.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3BlockWhat.to_json())

# convert the object into a dict
guardiumconnectorv3_block_what_dict = guardiumconnectorv3_block_what_instance.to_dict()
# create an instance of Guardiumconnectorv3BlockWhat from a dict
guardiumconnectorv3_block_what_from_dict = Guardiumconnectorv3BlockWhat.from_dict(guardiumconnectorv3_block_what_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


