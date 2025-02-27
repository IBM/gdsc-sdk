# Templatesv3DefaultContent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | Template content. | [optional] 
**is_default** | **bool** | If this is default content. | [optional] 
**name** | **str** | Name of the default content. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.templatesv3_default_content import Templatesv3DefaultContent

# TODO update the JSON string below
json = "{}"
# create an instance of Templatesv3DefaultContent from a JSON string
templatesv3_default_content_instance = Templatesv3DefaultContent.from_json(json)
# print the JSON string representation of the object
print(Templatesv3DefaultContent.to_json())

# convert the object into a dict
templatesv3_default_content_dict = templatesv3_default_content_instance.to_dict()
# create an instance of Templatesv3DefaultContent from a dict
templatesv3_default_content_from_dict = Templatesv3DefaultContent.from_dict(templatesv3_default_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


