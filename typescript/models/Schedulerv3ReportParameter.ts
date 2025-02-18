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

import { Reportsv3RunTimeParameter } from '../models/Reportsv3RunTimeParameter';
import { HttpFile } from '../http/http';

/**
* ReportParameter includes all the parameters needed to run a report.
*/
export class Schedulerv3ReportParameter {
    'extraDetail'?: string;
    /**
    * Report ID for the scheduled report.
    */
    'reportId'?: string;
    /**
    * Optional: Report Name for the scheduled report.
    */
    'reportName'?: string;
    /**
    * Optional: Runtime parameters for this report.
    */
    'runtimeParameters'?: Array<Reportsv3RunTimeParameter>;
    /**
    * Optional: Flag if sync query_from_date when running this report.
    */
    'syncExecutionDate'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "extraDetail",
            "baseName": "extra_detail",
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
            "name": "reportName",
            "baseName": "report_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "runtimeParameters",
            "baseName": "runtime_parameters",
            "type": "Array<Reportsv3RunTimeParameter>",
            "format": ""
        },
        {
            "name": "syncExecutionDate",
            "baseName": "sync_execution_date",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Schedulerv3ReportParameter.attributeTypeMap;
    }

    public constructor() {
    }
}

