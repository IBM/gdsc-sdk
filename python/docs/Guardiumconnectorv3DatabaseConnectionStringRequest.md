# Guardiumconnectorv3DatabaseConnectionStringRequest

Connection string for database.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dbhost** | **str** | Database host. | [optional] 
**dbname** | **str** | Database name. | [optional] 
**password** | **str** | Database password. | [optional] 
**port** | **str** | Database port. | [optional] 
**user** | **str** | Database user. | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.guardiumconnectorv3_database_connection_string_request import Guardiumconnectorv3DatabaseConnectionStringRequest

# TODO update the JSON string below
json = "{}"
# create an instance of Guardiumconnectorv3DatabaseConnectionStringRequest from a JSON string
guardiumconnectorv3_database_connection_string_request_instance = Guardiumconnectorv3DatabaseConnectionStringRequest.from_json(json)
# print the JSON string representation of the object
print(Guardiumconnectorv3DatabaseConnectionStringRequest.to_json())

# convert the object into a dict
guardiumconnectorv3_database_connection_string_request_dict = guardiumconnectorv3_database_connection_string_request_instance.to_dict()
# create an instance of Guardiumconnectorv3DatabaseConnectionStringRequest from a dict
guardiumconnectorv3_database_connection_string_request_from_dict = Guardiumconnectorv3DatabaseConnectionStringRequest.from_dict(guardiumconnectorv3_database_connection_string_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


