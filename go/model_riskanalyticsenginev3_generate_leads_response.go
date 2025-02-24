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

// GenerateLeadsResponse is the response object for GenerateLeads API.
type Riskanalyticsenginev3GenerateLeadsResponse struct {
	// The end time of the risks in format YYYY-MM-ddTHH:mm:ssZ.
	EndTime time.Time `json:"end_time,omitempty"`
	PivotType *Riskanalyticsenginev3PivotType `json:"pivot_type,omitempty"`
	// Returns an array with risks with pivot and leads.
	Risks []Riskanalyticsenginev3Risk `json:"risks,omitempty"`
	// The start time of the risks in format YYYY-MM-ddTHH:mm:ssZ.
	StartTime time.Time `json:"start_time,omitempty"`
}
