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

import { Reportsv3ChartDisplayLayout } from '../models/Reportsv3ChartDisplayLayout';
import { Reportsv3ModelType } from '../models/Reportsv3ModelType';
import { HttpFile } from '../http/http';

/**
* GetChartQueryResponse is the return type of the GetQueryByChartID() api and GetQueryByReportChartSettings() api.
*/
export class Reportsv3GetChartQueryResponse {
    'chartLayout'?: Reportsv3ChartDisplayLayout;
    'modelType'?: Reportsv3ModelType;
    /**
    * The chart\'s query.
    */
    'query'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "chartLayout",
            "baseName": "chart_layout",
            "type": "Reportsv3ChartDisplayLayout",
            "format": ""
        },
        {
            "name": "modelType",
            "baseName": "model_type",
            "type": "Reportsv3ModelType",
            "format": ""
        },
        {
            "name": "query",
            "baseName": "query",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3GetChartQueryResponse.attributeTypeMap;
    }

    public constructor() {
    }
}



