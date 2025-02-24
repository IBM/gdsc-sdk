/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type Resourcecontrollerk8v3ControllerAppFile struct {
	// The GZIP base64 encoded content of the file.
	Content string `json:"content,omitempty"`
	// The internal ID of the app file.
	Id string `json:"id,omitempty"`
	// The date this app file was modified (ms since epoch).
	Modified string `json:"modified,omitempty"`
	// The name of the app file.
	Name string `json:"name,omitempty"`
	// The path to the file for the app.
	Path string `json:"path,omitempty"`
}
