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

import { Riskanalyticscontrollerv3ObservationReportFilter } from '../models/Riskanalyticscontrollerv3ObservationReportFilter';
import { Riskanalyticscontrollerv3Statistics } from '../models/Riskanalyticscontrollerv3Statistics';
import { HttpFile } from '../http/http';

/**
* [risk-details] A reference link within a finding; used for representing a deep-link to relevant report.
*/
export class Riskanalyticscontrollerv3FindingReferenceLink {
    'reportFilters'?: Array<Riskanalyticscontrollerv3ObservationReportFilter>;
    'statistics'?: Riskanalyticscontrollerv3Statistics;
    /**
    * Final text, generated from text_template (localized) and text_variables (as-is).
    */
    'text'?: string;
    /**
    * Text template key in insights-nls project; used to create the final text for the UI, during the response.
    */
    'textTemplate'?: string;
    /**
    * [optional] Variable text tokens that replace placeholders in the text template; ordered according to appearance in template.
    */
    'textVariables'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "reportFilters",
            "baseName": "report_filters",
            "type": "Array<Riskanalyticscontrollerv3ObservationReportFilter>",
            "format": ""
        },
        {
            "name": "statistics",
            "baseName": "statistics",
            "type": "Riskanalyticscontrollerv3Statistics",
            "format": ""
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string",
            "format": ""
        },
        {
            "name": "textTemplate",
            "baseName": "text_template",
            "type": "string",
            "format": ""
        },
        {
            "name": "textVariables",
            "baseName": "text_variables",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3FindingReferenceLink.attributeTypeMap;
    }

    public constructor() {
    }
}

