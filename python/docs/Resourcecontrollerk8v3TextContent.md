# Resourcecontrollerk8v3TextContent

TextContent contains text content data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **str** | Optional: The actual content of the object. | [optional] 
**format** | **str** | The format of this text content, currently allowed formats are text. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.resourcecontrollerk8v3_text_content import Resourcecontrollerk8v3TextContent

# TODO update the JSON string below
json = "{}"
# create an instance of Resourcecontrollerk8v3TextContent from a JSON string
resourcecontrollerk8v3_text_content_instance = Resourcecontrollerk8v3TextContent.from_json(json)
# print the JSON string representation of the object
print(Resourcecontrollerk8v3TextContent.to_json())

# convert the object into a dict
resourcecontrollerk8v3_text_content_dict = resourcecontrollerk8v3_text_content_instance.to_dict()
# create an instance of Resourcecontrollerk8v3TextContent from a dict
resourcecontrollerk8v3_text_content_from_dict = Resourcecontrollerk8v3TextContent.from_dict(resourcecontrollerk8v3_text_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


