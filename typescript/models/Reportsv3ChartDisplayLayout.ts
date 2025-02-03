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

import { Reportsv3DisplayHeader } from '../models/Reportsv3DisplayHeader';
import { HttpFile } from '../http/http';

/**
* ChartDisplayLayout has Chart matadata , rows and headers.
*/
export class Reportsv3ChartDisplayLayout {
    /**
    * The Chart headers.
    */
    'chartHeaders'?: Array<Reportsv3DisplayHeader>;
    /**
    * The chart ID.
    */
    'chartId'?: string;
    /**
    * The report ID.
    */
    'reportId'?: string;
    /**
    * Chart data results limit.
    */
    'resultsLimit'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "chartHeaders",
            "baseName": "chart_headers",
            "type": "Array<Reportsv3DisplayHeader>",
            "format": ""
        },
        {
            "name": "chartId",
            "baseName": "chart_id",
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
            "name": "resultsLimit",
            "baseName": "results_limit",
            "type": "number",
            "format": "int32"
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3ChartDisplayLayout.attributeTypeMap;
    }

    public constructor() {
    }
}

