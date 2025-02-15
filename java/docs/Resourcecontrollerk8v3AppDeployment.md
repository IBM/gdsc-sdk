

# Resourcecontrollerk8v3AppDeployment

AppDeployment contains the information required to deploy an app.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**controllerId** | **String** | Optional: The internal ID of the controller for the app. |  [optional] |
|**details** | **String** | Optional: The details of the deployment. Used to hold error details if status is error. |  [optional] |
|**modified** | **String** | Optional: The date this app deployment was modified (ms since epoch). |  [optional] |
|**replicas** | **Integer** | Optional: The replicas of the deployment. |  [optional] |
|**status** | **String** | Optional: The status of the deployment. Currently supported values are deploying, ready, error, undeploying, and restarting. |  [optional] |



