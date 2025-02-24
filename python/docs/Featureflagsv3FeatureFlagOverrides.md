# Featureflagsv3FeatureFlagOverrides

FeatureFlagOverrides feature flag model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flag_name** | **str** | Feature flag name. | [optional] 
**high_priority** | **bool** | Optional: high priority. | [optional] 
**is_enabled** | **bool** | Feature flag enabled or not. | [optional] 
**value** | **str** | Optional: additional value for the feature flag. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.featureflagsv3_feature_flag_overrides import Featureflagsv3FeatureFlagOverrides

# TODO update the JSON string below
json = "{}"
# create an instance of Featureflagsv3FeatureFlagOverrides from a JSON string
featureflagsv3_feature_flag_overrides_instance = Featureflagsv3FeatureFlagOverrides.from_json(json)
# print the JSON string representation of the object
print(Featureflagsv3FeatureFlagOverrides.to_json())

# convert the object into a dict
featureflagsv3_feature_flag_overrides_dict = featureflagsv3_feature_flag_overrides_instance.to_dict()
# create an instance of Featureflagsv3FeatureFlagOverrides from a dict
featureflagsv3_feature_flag_overrides_from_dict = Featureflagsv3FeatureFlagOverrides.from_dict(featureflagsv3_feature_flag_overrides_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


