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
* PutActivityRecord creates an activity log record.  All fields are optional.  Specified fields will be used to included in the persisted ActivityRecord.  If no fields are specified then no activity log record is persisted.
*/
export class Auditv3PutActivityRecordRequest {
    /**
    * The operation associated with the persisted Activity record (CRUD or other).
    */
    'actionTaken'?: string;
    /**
    * The reason the operation was performed (details about the operation).
    */
    'changesMade'?: string;
    /**
    * The service/collection on which the operation was performed.
    */
    'context'?: string;
    /**
    * The label of the Activity record.
    */
    'contextDescription'?: string;
    /**
    * The user id of the active user at the time the action was performed.
    */
    'performedBy'?: string;
    /**
    * The record ID with the persisted Activity record.
    */
    'uid'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "actionTaken",
            "baseName": "action_taken",
            "type": "string",
            "format": ""
        },
        {
            "name": "changesMade",
            "baseName": "changes_made",
            "type": "string",
            "format": ""
        },
        {
            "name": "context",
            "baseName": "context",
            "type": "string",
            "format": ""
        },
        {
            "name": "contextDescription",
            "baseName": "context_description",
            "type": "string",
            "format": ""
        },
        {
            "name": "performedBy",
            "baseName": "performed_by",
            "type": "string",
            "format": ""
        },
        {
            "name": "uid",
            "baseName": "uid",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Auditv3PutActivityRecordRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

