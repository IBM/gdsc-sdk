# Assetsv3ListTagDomainsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**List[Assetsv3TagCategory]**](Assetsv3TagCategory.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.assetsv3_list_tag_domains_response import Assetsv3ListTagDomainsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ListTagDomainsResponse from a JSON string
assetsv3_list_tag_domains_response_instance = Assetsv3ListTagDomainsResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ListTagDomainsResponse.to_json())

# convert the object into a dict
assetsv3_list_tag_domains_response_dict = assetsv3_list_tag_domains_response_instance.to_dict()
# create an instance of Assetsv3ListTagDomainsResponse from a dict
assetsv3_list_tag_domains_response_from_dict = Assetsv3ListTagDomainsResponse.from_dict(assetsv3_list_tag_domains_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


