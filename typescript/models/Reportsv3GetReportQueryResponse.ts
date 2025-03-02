/**
 * IBM Guardium Data Security Center
 * Use Guardium Data Security Center SDK (application programming interfaces) to interact with other applications, such as Guardium Data Protection, universal connectors, and Guardium Data Security Center reports.
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

