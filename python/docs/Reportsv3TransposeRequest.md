# Reportsv3TransposeRequest

TransposeRequest is the request type for the api call to get the SQls based on the constructIDs.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**construct_ids** | **List[str]** | The list of construct IDs to get the SQLs for. | [optional] 
**contribution_indicators** | **str** | The contribution indicators represented as a string. | [optional] 
**contribution_pointers** | [**List[Reportsv3ContributionPointersInfoObject]**](Reportsv3ContributionPointersInfoObject.md) | The list of contribution pointers. | [optional] 
**limit** | **str** | The max amount of rows to return for pagination. Required if report query uses offset and limit parameters. | [optional] 
**offset** | **str** | The amount to offset the rows by for pagination. Required if report query uses offset and limit parameters. | [optional] 
**summary** | **bool** | Whether or not to run Summary query. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.reportsv3_transpose_request import Reportsv3TransposeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsv3TransposeRequest from a JSON string
reportsv3_transpose_request_instance = Reportsv3TransposeRequest.from_json(json)
# print the JSON string representation of the object
print(Reportsv3TransposeRequest.to_json())

# convert the object into a dict
reportsv3_transpose_request_dict = reportsv3_transpose_request_instance.to_dict()
# create an instance of Reportsv3TransposeRequest from a dict
reportsv3_transpose_request_from_dict = Reportsv3TransposeRequest.from_dict(reportsv3_transpose_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


