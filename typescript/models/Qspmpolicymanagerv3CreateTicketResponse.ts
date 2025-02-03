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

import { RpcStatus } from '../models/RpcStatus';
import { HttpFile } from '../http/http';

/**
* Response from creating a ticket.
*/
export class Qspmpolicymanagerv3CreateTicketResponse {
    'createTime'?: Date;
    'integrationName'?: string;
    'status'?: RpcStatus;
    'summary'?: string;
    'ticketId'?: string;
    'ticketNumber'?: string;
    'uri'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "createTime",
            "baseName": "createTime",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "integrationName",
            "baseName": "integrationName",
            "type": "string",
            "format": ""
        },
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
        return Qspmpolicymanagerv3CreateTicketResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

