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

// DatasetsFilter includes all fields used to filter the set of desired datasets list returned by a GET request.
type Ecosystemv3DatasetsFilter struct {
	// The state filter groups commonly paired states. Only returns records that include the specified names.
	DatasetNames []string `json:"dataset_names,omitempty"`
	// Return datasets created before this time (<).
	EndTime time.Time `json:"end_time,omitempty"`
	// Return datasets created at this time or later (>=).
	StartTime time.Time `json:"start_time,omitempty"`
}
