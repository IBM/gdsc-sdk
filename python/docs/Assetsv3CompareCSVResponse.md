# Assetsv3CompareCSVResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **str** |  | [optional] 
**existing_count** | **str** |  | [optional] 
**rows** | [**List[Assetsv3CSVRow]**](Assetsv3CSVRow.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_compare_csv_response import Assetsv3CompareCSVResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3CompareCSVResponse from a JSON string
assetsv3_compare_csv_response_instance = Assetsv3CompareCSVResponse.from_json(json)
# print the JSON string representation of the object
print(Assetsv3CompareCSVResponse.to_json())

# convert the object into a dict
assetsv3_compare_csv_response_dict = assetsv3_compare_csv_response_instance.to_dict()
# create an instance of Assetsv3CompareCSVResponse from a dict
assetsv3_compare_csv_response_from_dict = Assetsv3CompareCSVResponse.from_dict(assetsv3_compare_csv_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


