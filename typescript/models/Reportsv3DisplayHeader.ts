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

import { Reportsv3FieldName } from '../models/Reportsv3FieldName';
import { Reportsv3HeaderDescription } from '../models/Reportsv3HeaderDescription';
import { HttpFile } from '../http/http';

/**
* DisplayHeader that have the header name and the translated value.
*/
export class Reportsv3DisplayHeader {
    'fieldName'?: Reportsv3FieldName;
    'headerDescription'?: Reportsv3HeaderDescription;
    /**
    * The header ID.
    */
    'headerId'?: string;
    /**
    * The header name.
    */
    'headerName'?: string;
    /**
    * Sequence of the corresponding header.
    */
    'sequence'?: number;
    /**
    * Table name.
    */
    'tableName'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "fieldName",
            "baseName": "field_name",
            "type": "Reportsv3FieldName",
            "format": ""
        },
        {
            "name": "headerDescription",
            "baseName": "header_description",
            "type": "Reportsv3HeaderDescription",
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
            "name": "sequence",
            "baseName": "sequence",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "tableName",
            "baseName": "table_name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3DisplayHeader.attributeTypeMap;
    }

    public constructor() {
    }
}

