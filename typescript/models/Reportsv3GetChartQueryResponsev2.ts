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
* GetChartQueryResponsev2 is the return type of the GetQueryByChartIDv2() api and GetQueryByReportChartSettingsv2() api.
*/
export class Reportsv3GetChartQueryResponsev2 {
    /**
    * The chart\'s query.
    */
    'query'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "query",
            "baseName": "query",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3GetChartQueryResponsev2.attributeTypeMap;
    }

    public constructor() {
    }
}

