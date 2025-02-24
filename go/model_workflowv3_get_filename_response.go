/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// GetFilenameResponse - returns file path name and name to be saved for a report result.
type Workflowv3GetFilenameResponse struct {
	// File path name of result to be downloaded.
	FileName string `json:"file_name,omitempty"`
	// Friendly name for the file to be saved as.
	FriendlyName string `json:"friendly_name,omitempty"`
}
