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

import { Reportsv3ChartSettingsv2 } from '../models/Reportsv3ChartSettingsv2';
import { HttpFile } from '../http/http';

/**
* UpdateChartv2Request is the argument type used to update a VEGA chart.
*/
export class Reportsv3UpdateChartv2Request {
    /**
    * Unique chart ID.
    */
    'chartId'?: string;
    'chartSettingsV2'?: Reportsv3ChartSettingsv2;
    'primaryCategory'?: number;
    'primaryMeasure'?: number;
    'secondaryCategory'?: number;
    'secondaryMeasure'?: number;
    'tertiaryCategory'?: number;
    'tertiaryMeasure'?: number;
    /**
    * The VEGA chart definition in a stringified JSON.
    */
    'vegaDefinition'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "chartId",
            "baseName": "chart_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "chartSettingsV2",
            "baseName": "chart_settings_v2",
            "type": "Reportsv3ChartSettingsv2",
            "format": ""
        },
        {
            "name": "primaryCategory",
            "baseName": "primary_category",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "primaryMeasure",
            "baseName": "primary_measure",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "secondaryCategory",
            "baseName": "secondary_category",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "secondaryMeasure",
            "baseName": "secondary_measure",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "tertiaryCategory",
            "baseName": "tertiary_category",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "tertiaryMeasure",
            "baseName": "tertiary_measure",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "vegaDefinition",
            "baseName": "vega_definition",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsv3UpdateChartv2Request.attributeTypeMap;
    }

    public constructor() {
    }
}

