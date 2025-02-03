# Reportsrunnerv3DataRow


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**results** | **Dict[str, str]** | One data row results. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.reportsrunnerv3_data_row import Reportsrunnerv3DataRow

# TODO update the JSON string below
json = "{}"
# create an instance of Reportsrunnerv3DataRow from a JSON string
reportsrunnerv3_data_row_instance = Reportsrunnerv3DataRow.from_json(json)
# print the JSON string representation of the object
print(Reportsrunnerv3DataRow.to_json())

# convert the object into a dict
reportsrunnerv3_data_row_dict = reportsrunnerv3_data_row_instance.to_dict()
# create an instance of Reportsrunnerv3DataRow from a dict
reportsrunnerv3_data_row_from_dict = Reportsrunnerv3DataRow.from_dict(reportsrunnerv3_data_row_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


