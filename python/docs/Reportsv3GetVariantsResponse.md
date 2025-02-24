# Reportsv3GetVariantsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**variants** | [**List[Reportsv3Variant]**](Reportsv3Variant.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_get_variants_response import Reportsv3GetVariantsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3GetVariantsResponse from a JSON string
reportsv3_get_variants_response_instance = Reportsv3GetVariantsResponse.from_json(json)
# print the JSON string representation of the object
print(Reportsv3GetVariantsResponse.to_json())

# convert the object into a dict
reportsv3_get_variants_response_dict = reportsv3_get_variants_response_instance.to_dict()
# create an instance of Reportsv3GetVariantsResponse from a dict
reportsv3_get_variants_response_from_dict = Reportsv3GetVariantsResponse.from_dict(reportsv3_get_variants_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


