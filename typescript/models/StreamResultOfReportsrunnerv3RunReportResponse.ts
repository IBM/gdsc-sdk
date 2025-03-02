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

import { Reportsrunnerv3RunReportResponse } from '../models/Reportsrunnerv3RunReportResponse';
import { RuntimeStreamError } from '../models/RuntimeStreamError';
import { HttpFile } from '../http/http';

export class StreamResultOfReportsrunnerv3RunReportResponse {
    'error'?: RuntimeStreamError;
    'result'?: Reportsrunnerv3RunReportResponse;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "error",
            "baseName": "error",
            "type": "RuntimeStreamError",
            "format": ""
        },
        {
            "name": "result",
            "baseName": "result",
            "type": "Reportsrunnerv3RunReportResponse",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return StreamResultOfReportsrunnerv3RunReportResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

