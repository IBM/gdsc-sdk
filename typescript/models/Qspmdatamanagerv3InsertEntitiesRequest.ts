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
* InsertEntitiesRequest is the request object for InsertAllEntities API.
*/
export class Qspmdatamanagerv3InsertEntitiesRequest {
    'dims'?: Array<any>;
    'facts'?: Array<any>;
    'policysqls'?: Array<string>;
    'scanId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "dims",
            "baseName": "dims",
            "type": "Array<any>",
            "format": ""
        },
        {
            "name": "facts",
            "baseName": "facts",
            "type": "Array<any>",
            "format": ""
        },
        {
            "name": "policysqls",
            "baseName": "policysqls",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "scanId",
            "baseName": "scan_id",
            "type": "string",
            "format": "int64"
        }    ];

    static getAttributeTypeMap() {
        return Qspmdatamanagerv3InsertEntitiesRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

