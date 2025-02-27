# Assetsv3ClassificationScanStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **str** |  | [optional] 
**key** | **str** |  | [optional] 
**tag_category** | **str** |  | [optional] 
**tag_id** | **str** |  | [optional] 
**tag_name** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_classification_scan_status import Assetsv3ClassificationScanStatus

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3ClassificationScanStatus from a JSON string
assetsv3_classification_scan_status_instance = Assetsv3ClassificationScanStatus.from_json(json)
# print the JSON string representation of the object
print(Assetsv3ClassificationScanStatus.to_json())

# convert the object into a dict
assetsv3_classification_scan_status_dict = assetsv3_classification_scan_status_instance.to_dict()
# create an instance of Assetsv3ClassificationScanStatus from a dict
assetsv3_classification_scan_status_from_dict = Assetsv3ClassificationScanStatus.from_dict(assetsv3_classification_scan_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


