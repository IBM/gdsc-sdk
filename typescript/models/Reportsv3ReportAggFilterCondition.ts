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

import { Reportsv3AggregationType } from '../models/Reportsv3AggregationType';
import { Reportsv3OperatorType } from '../models/Reportsv3OperatorType';
import { HttpFile } from '../http/http';

/**
* ReportAggFilterCondition represents a report aggregate filter condition.
*/
export class Reportsv3ReportAggFilterCondition {
    'aggregationType'?: Reportsv3AggregationType;
    'headerId'?: string;
    'headerName'?: string;
    'operatorType'?: Reportsv3OperatorType;
    'tableName'?: string;
    'value'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "aggregationType",
            "baseName": "aggregation_type",
            "type": "Reportsv3AggregationType",
            "format": ""
        },
        {
            "name": "headerId",
            "baseName": "header_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "headerName",
            "baseName": "header_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "operatorType",
            "baseName": "operator_type",
            "type": "Reportsv3OperatorType",
            "format": ""
        },
        {
            "name": "tableName",
            "baseName": "table_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3ReportAggFilterCondition.attributeTypeMap;
    }

    public constructor() {
    }
}



