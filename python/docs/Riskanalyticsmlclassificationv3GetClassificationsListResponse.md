# Riskanalyticsmlclassificationv3GetClassificationsListResponse

GetClassificationListResponse for the GetClassificationsList api.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classifications** | [**List[Riskanalyticsmlclassificationv3ClassificationDefinition]**](Riskanalyticsmlclassificationv3ClassificationDefinition.md) |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.riskanalyticsmlclassificationv3_get_classifications_list_response import Riskanalyticsmlclassificationv3GetClassificationsListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of Riskanalyticsmlclassificationv3GetClassificationsListResponse from a JSON string
riskanalyticsmlclassificationv3_get_classifications_list_response_instance = Riskanalyticsmlclassificationv3GetClassificationsListResponse.from_json(json)
# print the JSON string representation of the object
print(Riskanalyticsmlclassificationv3GetClassificationsListResponse.to_json())

# convert the object into a dict
riskanalyticsmlclassificationv3_get_classifications_list_response_dict = riskanalyticsmlclassificationv3_get_classifications_list_response_instance.to_dict()
# create an instance of Riskanalyticsmlclassificationv3GetClassificationsListResponse from a dict
riskanalyticsmlclassificationv3_get_classifications_list_response_from_dict = Riskanalyticsmlclassificationv3GetClassificationsListResponse.from_dict(riskanalyticsmlclassificationv3_get_classifications_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


