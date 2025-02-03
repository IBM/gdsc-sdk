# Outliersenginev3RunSimulatorRequest

RunSimulatorRequest message for RunSimulator.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configuration_file_path** | **str** | Optional: path to configuration file - is null or empty use the default config file. | [optional] 
**var_date** | **str** | Date in the format dd/mm/yyyy. | [optional] 
**enable_demo_mode** | **bool** | Optional: default false. | [optional] 
**length** | **int** | Number of periods. | [optional] 

## Example

```python
from ibm_gdsc_sdk_software.models.outliersenginev3_run_simulator_request import Outliersenginev3RunSimulatorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Outliersenginev3RunSimulatorRequest from a JSON string
outliersenginev3_run_simulator_request_instance = Outliersenginev3RunSimulatorRequest.from_json(json)
# print the JSON string representation of the object
print(Outliersenginev3RunSimulatorRequest.to_json())

# convert the object into a dict
outliersenginev3_run_simulator_request_dict = outliersenginev3_run_simulator_request_instance.to_dict()
# create an instance of Outliersenginev3RunSimulatorRequest from a dict
outliersenginev3_run_simulator_request_from_dict = Outliersenginev3RunSimulatorRequest.from_dict(outliersenginev3_run_simulator_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


