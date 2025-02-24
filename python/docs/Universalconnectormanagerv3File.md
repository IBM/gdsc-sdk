# Universalconnectormanagerv3File

File is an object for UC pipeline file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **bytearray** | Content of the file. | [optional] 
**name** | **str** | Name of the file. | [optional] 
**path** | **str** | Path of the file in s3. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.universalconnectormanagerv3_file import Universalconnectormanagerv3File

# TODO update the JSON string below
json = "{}"
# create an instance of Universalconnectormanagerv3File from a JSON string
universalconnectormanagerv3_file_instance = Universalconnectormanagerv3File.from_json(json)
# print the JSON string representation of the object
print(Universalconnectormanagerv3File.to_json())

# convert the object into a dict
universalconnectormanagerv3_file_dict = universalconnectormanagerv3_file_instance.to_dict()
# create an instance of Universalconnectormanagerv3File from a dict
universalconnectormanagerv3_file_from_dict = Universalconnectormanagerv3File.from_dict(universalconnectormanagerv3_file_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


