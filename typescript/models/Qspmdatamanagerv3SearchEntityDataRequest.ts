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

import { HttpFile } from '../http/http';

/**
* SearchEntityDataRequest is the request object for SearchEntityData API.
*/
export class Qspmdatamanagerv3SearchEntityDataRequest {
    'columns'?: Array<string>;
    'filter'?: string;
    'limit'?: string;
    'tableName'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "columns",
            "baseName": "columns",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "filter",
            "baseName": "filter",
            "type": "string",
            "format": ""
        },
        {
            "name": "limit",
            "baseName": "limit",
            "type": "string",
            "format": "int64"
        },
        {
            "name": "tableName",
            "baseName": "table_name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Qspmdatamanagerv3SearchEntityDataRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

