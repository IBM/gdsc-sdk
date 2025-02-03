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

