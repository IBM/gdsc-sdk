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

import { Reportsv3OperatorType } from '../models/Reportsv3OperatorType';
import { HttpFile } from '../http/http';

/**
* ObservationReportFilter header id and value to apply as a report filter.
*/
export class Riskanalyticscontrollerv3ObservationReportFilter {
    /**
    * The header id to filter.
    */
    'headerId'?: string;
    /**
    * The value to filter this header by.
    */
    'headerValue'?: string;
    'operatorType'?: Reportsv3OperatorType;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "headerId",
            "baseName": "header_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "headerValue",
            "baseName": "header_value",
            "type": "string",
            "format": ""
        },
        {
            "name": "operatorType",
            "baseName": "operator_type",
            "type": "Reportsv3OperatorType",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3ObservationReportFilter.attributeTypeMap;
    }

    public constructor() {
    }
}



