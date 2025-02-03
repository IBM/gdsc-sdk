/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// ScheduledTaskSummary returns enough details for list view.
type Schedulerv3ScheduledTaskSummary struct {
	AuditType *Schedulerv3AuditType `json:"audit_type,omitempty"`
	// Task name (usually the same as the report name).
	Name string `json:"name,omitempty"`
	ReportId string `json:"report_id,omitempty"`
	ReportName string `json:"report_name,omitempty"`
	// Id for the task.
	ScheduledTaskId string `json:"scheduled_task_id,omitempty"`
	Type_ *Schedulerv3TaskType `json:"type,omitempty"`
}
