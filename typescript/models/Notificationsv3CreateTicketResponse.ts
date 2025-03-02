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

import { RpcStatus } from '../models/RpcStatus';
import { HttpFile } from '../http/http';

/**
* Response from creating a ticket.
*/
export class Notificationsv3CreateTicketResponse {
    'status'?: RpcStatus;
    'summary'?: string;
    'ticketId'?: string;
    'ticketNumber'?: string;
    'uri'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "status",
            "baseName": "status",
            "type": "RpcStatus",
            "format": ""
        },
        {
            "name": "summary",
            "baseName": "summary",
            "type": "string",
            "format": ""
        },
        {
            "name": "ticketId",
            "baseName": "ticket_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "ticketNumber",
            "baseName": "ticket_number",
            "type": "string",
            "format": ""
        },
        {
            "name": "uri",
            "baseName": "uri",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Notificationsv3CreateTicketResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

