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

import { Healthcollectorv3Usage } from '../models/Healthcollectorv3Usage';
import { HttpFile } from '../http/http';

export class Healthcollectorv3GetTopGDPCollectorsResponse {
    'topGdpCollectors'?: Array<Healthcollectorv3Usage>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "topGdpCollectors",
            "baseName": "top_gdp_collectors",
            "type": "Array<Healthcollectorv3Usage>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Healthcollectorv3GetTopGDPCollectorsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

