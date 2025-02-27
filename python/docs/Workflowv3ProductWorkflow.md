# Workflowv3ProductWorkflow


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audit_type** | [**Schedulerv3AuditType**](Schedulerv3AuditType.md) |  | [optional] 
**config_types** | **List[str]** |  | [optional] 
**workflow_investigation_links** | [**List[Schedulerv3ConfigurationItem]**](Schedulerv3ConfigurationItem.md) |  | [optional] 
**workflow_response_template** | [**Schedulerv3ConfigurationItem**](Schedulerv3ConfigurationItem.md) |  | [optional] 
**workflow_unique_fields** | **List[str]** |  | [optional] 

## Example

```python
from ibm_gdsc_sdk_saas.models.workflowv3_product_workflow import Workflowv3ProductWorkflow

# TODO update the JSON string below
json = "{}"
# create an instance of Workflowv3ProductWorkflow from a JSON string
workflowv3_product_workflow_instance = Workflowv3ProductWorkflow.from_json(json)
# print the JSON string representation of the object
print(Workflowv3ProductWorkflow.to_json())

# convert the object into a dict
workflowv3_product_workflow_dict = workflowv3_product_workflow_instance.to_dict()
# create an instance of Workflowv3ProductWorkflow from a dict
workflowv3_product_workflow_from_dict = Workflowv3ProductWorkflow.from_dict(workflowv3_product_workflow_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


