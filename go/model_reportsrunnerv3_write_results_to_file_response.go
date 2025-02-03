/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// WriteResultsToFileResponse is the return type of the WriteResultsToFileByIDRequest() and WriteResultsToFileByDefinition() apis.
type Reportsrunnerv3WriteResultsToFileResponse struct {
	// File name.
	FileName string `json:"file_name,omitempty"`
	// Token that identifies the writing results to file job.
	JobId string `json:"job_id,omitempty"`
	// Return message after writing results to file job was scheduled.
	Message string `json:"message,omitempty"`
}
