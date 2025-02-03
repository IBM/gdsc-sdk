

# Outliersenginev3OutlierTypeStats

Describes an outlier type: What characterizes it, and how many were found during a period of time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**count** | **Integer** | The number outliers found with the same characterization. |  [optional] |
|**typeDiffMessages** | **Boolean** |  |  [optional] |
|**typeFails** | **Boolean** | Outlier is characterized by a high rate of exceptions, or error types. |  [optional] |
|**typeNewMessages** | **Boolean** | Outlier is characterized by high volume of new activity. |  [optional] |
|**typeOngoing** | **Boolean** | Outlier is characterized by an ongoing activity below the thresholds, in recent hours. |  [optional] |
|**typeVolume** | **Boolean** | Outlier is characterized by high volume of activity, in general. |  [optional] |
|**typeVulnerableObjects** | **Boolean** | Outlier is characterized by a high activity rate on vulnerable object groups. |  [optional] |



