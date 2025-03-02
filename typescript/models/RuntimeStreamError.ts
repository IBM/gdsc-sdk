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

import { ProtobufAny } from '../models/ProtobufAny';
import { HttpFile } from '../http/http';

export class RuntimeStreamError {
    'details'?: Array<ProtobufAny>;
    'grpcCode'?: number;
    'httpCode'?: number;
    'httpStatus'?: string;
    'message'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "details",
            "baseName": "details",
            "type": "Array<ProtobufAny>",
            "format": ""
        },
        {
            "name": "grpcCode",
            "baseName": "grpc_code",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "httpCode",
            "baseName": "http_code",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "httpStatus",
            "baseName": "http_status",
            "type": "string",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RuntimeStreamError.attributeTypeMap;
    }

    public constructor() {
    }
}

