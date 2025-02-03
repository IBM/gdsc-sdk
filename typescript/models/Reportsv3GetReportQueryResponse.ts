/**
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization\'s Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Reportsv3ReportDisplayLayout } from '../models/Reportsv3ReportDisplayLayout';
import { HttpFile } from '../http/http';

/**
* GetReportQueryResponse is the return type of the GetQueryByReportID() and GetQueryByReportDefinition() apis.
*/
export class Reportsv3GetReportQueryResponse {
    /**
    * The report\'s query.
    */
    'query'?: string;
    'reportLayout'?: Reportsv3ReportDisplayLayout;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "query",
            "baseName": "query",
            "type": "string",
            "format": ""
        },
        {
            "name": "reportLayout",
            "baseName": "report_layout",
            "type": "Reportsv3ReportDisplayLayout",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3GetReportQueryResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

