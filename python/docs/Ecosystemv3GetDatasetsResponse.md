# Ecosystemv3GetDatasetsResponse

Returns the datasets information that match the specified filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**List[Ecosystemv3FilterField]**](Ecosystemv3FilterField.md) | Filter counts associated with the search. | [optional] 
**record_count** | **int** | Total number of records associated with the filter (ignoring Limit &amp; Offset). | [optional] 
**records** | [**List[Ecosystemv3DatasetRecord]**](Ecosystemv3DatasetRecord.md) | Records associated with the specified filter. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.ecosystemv3_get_datasets_response import Ecosystemv3GetDatasetsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Ecosystemv3GetDatasetsResponse from a JSON string
ecosystemv3_get_datasets_response_instance = Ecosystemv3GetDatasetsResponse.from_json(json)
# print the JSON string representation of the object
print(Ecosystemv3GetDatasetsResponse.to_json())

# convert the object into a dict
ecosystemv3_get_datasets_response_dict = ecosystemv3_get_datasets_response_instance.to_dict()
# create an instance of Ecosystemv3GetDatasetsResponse from a dict
ecosystemv3_get_datasets_response_from_dict = Ecosystemv3GetDatasetsResponse.from_dict(ecosystemv3_get_datasets_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


