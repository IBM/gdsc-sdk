# Reportsrunnerv3FilterHeaders


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[Reportsrunnerv3Filter]**](Reportsrunnerv3Filter.md) | A list of filters. | [optional] 
**header_sequence** | **str** | The filter header sequence corresponding to the header. | [optional] 
**nls_translation** | **str** | The translated header. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsrunnerv3_filter_headers import Reportsrunnerv3FilterHeaders

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3FilterHeaders from a JSON string
reportsrunnerv3_filter_headers_instance = Reportsrunnerv3FilterHeaders.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3FilterHeaders.to_json())

# convert the object into a dict
reportsrunnerv3_filter_headers_dict = reportsrunnerv3_filter_headers_instance.to_dict()
# create an instance of Reportsrunnerv3FilterHeaders from a dict
reportsrunnerv3_filter_headers_from_dict = Reportsrunnerv3FilterHeaders.from_dict(reportsrunnerv3_filter_headers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


