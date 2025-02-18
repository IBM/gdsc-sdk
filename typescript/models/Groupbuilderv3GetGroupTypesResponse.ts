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

import { Groupbuilderv3GroupType } from '../models/Groupbuilderv3GroupType';
import { Groupbuilderv3StatusResponseBase } from '../models/Groupbuilderv3StatusResponseBase';
import { HttpFile } from '../http/http';

/**
* GetGroupTypesResponse returns the list of available group types.
*/
export class Groupbuilderv3GetGroupTypesResponse {
    /**
    * List of available group types.
    */
    'groupTypes'?: Array<Groupbuilderv3GroupType>;
    'status'?: Groupbuilderv3StatusResponseBase;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "groupTypes",
            "baseName": "group_types",
            "type": "Array<Groupbuilderv3GroupType>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "Groupbuilderv3StatusResponseBase",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Groupbuilderv3GetGroupTypesResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

