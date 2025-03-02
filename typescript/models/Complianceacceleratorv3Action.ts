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

import { Complianceacceleratorv3RecipientType } from '../models/Complianceacceleratorv3RecipientType';
import { HttpFile } from '../http/http';

/**
* A policy alert action.
*/
export class Complianceacceleratorv3Action {
    'notificationType'?: Complianceacceleratorv3RecipientType;
    /**
    * The emails for the action.
    */
    'userIds'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "notificationType",
            "baseName": "notification_type",
            "type": "Complianceacceleratorv3RecipientType",
            "format": ""
        },
        {
            "name": "userIds",
            "baseName": "user_ids",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Complianceacceleratorv3Action.attributeTypeMap;
    }

    public constructor() {
    }
}



