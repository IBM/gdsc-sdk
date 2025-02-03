

# Complianceacceleratorv3AuditConfig

Audit scheduling configuration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Audit description. |  [optional] |
|**enabled** | **Boolean** | If audit is enabled to run. |  [optional] |
|**id** | **String** | Audit id. |  [optional] |
|**instructions** | **String** | Audit instructions. |  [optional] |
|**isDeletion** | **Boolean** | Delete flag. |  [optional] |
|**name** | **String** | Audit name. |  [optional] |
|**owner** | [**Schedulerv3Recipient**](Schedulerv3Recipient.md) |  |  [optional] |
|**recipients** | [**List&lt;Schedulerv3Recipient&gt;**](Schedulerv3Recipient.md) | Recepients. |  [optional] |
|**reportKey** | **String** | Which reports set will be used. |  [optional] |
|**runOnceNow** | **Boolean** | Flag if run once right away. |  [optional] |
|**scheduler** | [**Complianceacceleratorv3AuditScheduler**](Complianceacceleratorv3AuditScheduler.md) |  |  [optional] |
|**tasks** | [**List&lt;Schedulerv3ScheduledTask&gt;**](Schedulerv3ScheduledTask.md) | Array of tasks. |  [optional] |



