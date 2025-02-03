/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger
import (
	"time"
)

type Schedulerv3ScheduledJobRun struct {
	CollectionId string `json:"collection_id,omitempty"`
	EndTime time.Time `json:"end_time,omitempty"`
	JobId string `json:"job_id,omitempty"`
	PreviousJobId string `json:"previous_job_id,omitempty"`
	QueryFrom string `json:"query_from,omitempty"`
	QueryTo string `json:"query_to,omitempty"`
	QueueTime time.Time `json:"queue_time,omitempty"`
	RunDetail string `json:"run_detail,omitempty"`
	ScheduleId string `json:"schedule_id,omitempty"`
	StartTime time.Time `json:"start_time,omitempty"`
	Status *Schedulerv3ExecutionStatus `json:"status,omitempty"`
	TaskId string `json:"task_id,omitempty"`
	TaskName string `json:"task_name,omitempty"`
	TaskType *Schedulerv3TaskType `json:"task_type,omitempty"`
}
