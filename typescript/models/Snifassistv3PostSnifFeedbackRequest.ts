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

import { Snifassistv3Feedback } from '../models/Snifassistv3Feedback';
import { HttpFile } from '../http/http';

/**
* PostSnifFeedbackRequest is the request message to post sniffer feedback for the installed policies.
*/
export class Snifassistv3PostSnifFeedbackRequest {
    /**
    * Specify edge_id if known.
    */
    'edgeId'?: string;
    'snifFeedback'?: Snifassistv3Feedback;
    /**
    * Specify tenant_id.
    */
    'tenantId'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "edgeId",
            "baseName": "edge_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "snifFeedback",
            "baseName": "snif_feedback",
            "type": "Snifassistv3Feedback",
            "format": ""
        },
        {
            "name": "tenantId",
            "baseName": "tenant_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Snifassistv3PostSnifFeedbackRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

