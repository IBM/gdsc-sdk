/*
 * IBM Guardium Data Security Center
 *
 * IBM Guardium Data Security Center simplifies your organization's Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * API version: 3
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

type Vendor struct {
	// The 3rd party vendor unique ID
	VendorId string `json:"vendorId"`
	// The 3rd party vendor name (Company name)
	VendorName string `json:"vendorName"`
	// The 3rd party company website URL
	VendorUrl string `json:"vendorUrl,omitempty"`
	// Short description of the 3rd party vendor
	Description string `json:"description"`
	Accounts []VendorAccount `json:"accounts,omitempty"`
	Certificates []VendorCertificate `json:"certificates,omitempty"`
}
