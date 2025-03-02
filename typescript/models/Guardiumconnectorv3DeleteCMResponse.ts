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

import { Guardiumconnectorv3StatusResponseBase } from '../models/Guardiumconnectorv3StatusResponseBase';
import { HttpFile } from '../http/http';

/**
* Returns the status when deleting a Central Manager.
*/
export class Guardiumconnectorv3DeleteCMResponse {
    'status'?: Guardiumconnectorv3StatusResponseBase;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "status",
            "baseName": "status",
            "type": "Guardiumconnectorv3StatusResponseBase",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Guardiumconnectorv3DeleteCMResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

