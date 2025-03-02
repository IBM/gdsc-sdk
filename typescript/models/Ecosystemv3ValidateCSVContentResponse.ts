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
import { HttpFile } from '../http/http';

/**
* ValidateCSVContentResponse message as the response for the ValidateCSVContent api.
*/
export class Ecosystemv3ValidateCSVContentResponse {
    /**
    * Error messages for the result.
    */
    'errorMsgs'?: Array<string>;
    'status'?: GooglerpcStatus;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "errorMsgs",
            "baseName": "error_msgs",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "GooglerpcStatus",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Ecosystemv3ValidateCSVContentResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

