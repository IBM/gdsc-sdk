/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type Schedulerv3SearchScheduledTaskRunsRequest struct {
	// Optional: the max amount of rows to return for pagination.
	Limit int64 `json:"limit,omitempty"`
	// Optional: the amount to offset the rows by for pagination.
	Offset int64 `json:"offset,omitempty"`
	// Optional: specicified ScheduledJobs.
	ScheduledJobId []string `json:"scheduled_job_id,omitempty"`
	// Optional: whether return latest runs for ScheduledJobs.
	WithLatest bool `json:"with_latest,omitempty"`
}
