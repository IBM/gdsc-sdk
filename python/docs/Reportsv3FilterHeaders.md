# Reportsv3FilterHeaders

FilterHeaders is the column for which each of the filters can be selected.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[Reportsv3Filter]**](Reportsv3Filter.md) | A list of filters. | [optional] 
**header_sequence** | **str** | The filter header sequence corresponding to the header. | [optional] 
**nls_translation** | **str** | The translated header. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsv3_filter_headers import Reportsv3FilterHeaders

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3FilterHeaders from a JSON string
reportsv3_filter_headers_instance = Reportsv3FilterHeaders.from_json(json)
# print the JSON string representation of the object
print(Reportsv3FilterHeaders.to_json())

# convert the object into a dict
reportsv3_filter_headers_dict = reportsv3_filter_headers_instance.to_dict()
# create an instance of Reportsv3FilterHeaders from a dict
reportsv3_filter_headers_from_dict = Reportsv3FilterHeaders.from_dict(reportsv3_filter_headers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


