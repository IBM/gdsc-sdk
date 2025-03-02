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

import { Reportsv3DateRange } from '../models/Reportsv3DateRange';
import { HttpFile } from '../http/http';

/**
* InReportAdditionalParameter that holds dateRange information of subquery reports.
*/
export class Reportsv3InReportAdditionalParameter {
    'dateRange'?: Reportsv3DateRange;
    /**
    * Header Name of subquery.
    */
    'headerName'?: string;
    /**
    * Report ID of subquery.
    */
    'reportId'?: string;
    /**
    * Table Name of subquery.
    */
    'tableName'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "dateRange",
            "baseName": "date_range",
            "type": "Reportsv3DateRange",
            "format": ""
        },
        {
            "name": "headerName",
            "baseName": "header_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "reportId",
            "baseName": "report_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "tableName",
            "baseName": "table_name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3InReportAdditionalParameter.attributeTypeMap;
    }

    public constructor() {
    }
}

