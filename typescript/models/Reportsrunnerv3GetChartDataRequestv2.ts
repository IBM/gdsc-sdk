/**
 * IBM Guardium Data Security Center
 * IBM Guardium Data Security Center simplifies your organization\'s Data Security architecture and enables access to long-term data security and compliance data. It provides security teams with risk-based views and alerts, as well as advanced analytics based on proprietary ML technology to uncover hidden threats. IBM Guardium Data Security Center gives security professionals the ability to quickly create data security and audit reports, monitor activity in on-prem and DBaaS sources, and take action from a central location.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Reportsv3ChartSettingsv2 } from '../models/Reportsv3ChartSettingsv2';
import { Reportsv3ModelType } from '../models/Reportsv3ModelType';
import { Reportsv3ReportDefinition } from '../models/Reportsv3ReportDefinition';
import { Reportsv3RunTimeParameter } from '../models/Reportsv3RunTimeParameter';
import { HttpFile } from '../http/http';

/**
* GetChartDataRequestv2 is the argument type used to run api.
*/
export class Reportsrunnerv3GetChartDataRequestv2 {
    /**
    * Optional: the ID of the chart we wish to get its data.
    */
    'chartId'?: string;
    'chartSettings'?: Reportsv3ChartSettingsv2;
    'modelType'?: Reportsv3ModelType;
    'reportDefinition'?: Reportsv3ReportDefinition;
    /**
    * Runtime parameters.
    */
    'runtimeParameterList'?: Array<Reportsv3RunTimeParameter>;
    /**
    * Optional: time zone.
    */
    'timeZone'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "chartId",
            "baseName": "chart_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "chartSettings",
            "baseName": "chart_settings",
            "type": "Reportsv3ChartSettingsv2",
            "format": ""
        },
        {
            "name": "modelType",
            "baseName": "model_type",
            "type": "Reportsv3ModelType",
            "format": ""
        },
        {
            "name": "reportDefinition",
            "baseName": "report_definition",
            "type": "Reportsv3ReportDefinition",
            "format": ""
        },
        {
            "name": "runtimeParameterList",
            "baseName": "runtime_parameter_list",
            "type": "Array<Reportsv3RunTimeParameter>",
            "format": ""
        },
        {
            "name": "timeZone",
            "baseName": "time_zone",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Reportsrunnerv3GetChartDataRequestv2.attributeTypeMap;
    }

    public constructor() {
    }
}



