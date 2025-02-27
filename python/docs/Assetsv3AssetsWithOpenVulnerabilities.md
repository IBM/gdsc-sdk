# Assetsv3AssetsWithOpenVulnerabilities


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_type** | **str** |  | [optional] 
**total_assets** | **str** |  | [optional] 
**vulnerability_group** | **str** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.assetsv3_assets_with_open_vulnerabilities import Assetsv3AssetsWithOpenVulnerabilities

# TODO update the JSON string below
json = "{}"
# create an instance of Assetsv3AssetsWithOpenVulnerabilities from a JSON string
assetsv3_assets_with_open_vulnerabilities_instance = Assetsv3AssetsWithOpenVulnerabilities.from_json(json)
# print the JSON string representation of the object
print(Assetsv3AssetsWithOpenVulnerabilities.to_json())

# convert the object into a dict
assetsv3_assets_with_open_vulnerabilities_dict = assetsv3_assets_with_open_vulnerabilities_instance.to_dict()
# create an instance of Assetsv3AssetsWithOpenVulnerabilities from a dict
assetsv3_assets_with_open_vulnerabilities_from_dict = Assetsv3AssetsWithOpenVulnerabilities.from_dict(assetsv3_assets_with_open_vulnerabilities_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


