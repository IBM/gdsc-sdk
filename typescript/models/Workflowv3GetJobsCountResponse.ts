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

import { GooglerpcStatus } from '../models/GooglerpcStatus';
import { Workflowv3JobCount } from '../models/Workflowv3JobCount';
import { HttpFile } from '../http/http';

export class Workflowv3GetJobsCountResponse {
    'counts'?: Array<Workflowv3JobCount>;
    'status'?: GooglerpcStatus;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "counts",
            "baseName": "counts",
            "type": "Array<Workflowv3JobCount>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "GooglerpcStatus",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Workflowv3GetJobsCountResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

