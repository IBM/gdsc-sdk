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

import { Notificationsv3NotificationRecord } from '../models/Notificationsv3NotificationRecord';
import { RpcStatus } from '../models/RpcStatus';
import { HttpFile } from '../http/http';

export class Notificationsv3SearchNotificationRecordsResponse {
    /**
    * Total number of records associated with the filter.
    */
    'recordCount'?: number;
    /**
    * Records associated with pipeline.
    */
    'records'?: Array<Notificationsv3NotificationRecord>;
    'status'?: RpcStatus;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "recordCount",
            "baseName": "record_count",
            "type": "number",
            "format": "int64"
        },
        {
            "name": "records",
            "baseName": "records",
            "type": "Array<Notificationsv3NotificationRecord>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "RpcStatus",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Notificationsv3SearchNotificationRecordsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

