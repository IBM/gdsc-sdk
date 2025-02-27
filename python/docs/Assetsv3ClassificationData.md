# Assetsv3ClassificationData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availability** | **str** |  | [optional] 
**rule_name** | **str** |  | [optional] 
**sensitive_data_count** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_classification_data import Assetsv3ClassificationData

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ClassificationData from a JSON string
assetsv3_classification_data_instance = Assetsv3ClassificationData.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ClassificationData.to_json())

# convert the object into a dict
assetsv3_classification_data_dict = assetsv3_classification_data_instance.to_dict()
# create an instance of Assetsv3ClassificationData from a dict
assetsv3_classification_data_from_dict = Assetsv3ClassificationData.from_dict(assetsv3_classification_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


