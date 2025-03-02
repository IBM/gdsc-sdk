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

import { Policybuilderv3GdpPolicyObject } from '../models/Policybuilderv3GdpPolicyObject';
import { HttpFile } from '../http/http';

/**
* Request object containing a list of objects.
*/
export class Policybuilderv3InsertGdpPolicyMetaDataRequest {
    /**
    * ID of central manager.
    */
    'centralManagerId'?: string;
    'data'?: Array<Policybuilderv3GdpPolicyObject>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "centralManagerId",
            "baseName": "central_manager_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<Policybuilderv3GdpPolicyObject>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Policybuilderv3InsertGdpPolicyMetaDataRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

