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

import { Riskanalyticscontrollerv3Finding } from '../models/Riskanalyticscontrollerv3Finding';
import { Riskanalyticscontrollerv3Indicator } from '../models/Riskanalyticscontrollerv3Indicator';
import { Riskanalyticsenginev3SeverityLevel } from '../models/Riskanalyticsenginev3SeverityLevel';
import { HttpFile } from '../http/http';

/**
* RiskEventHourlyFindings message represents the hourly findings of a given risk.
*/
export class Riskanalyticscontrollerv3RiskEventHourlyFindings {
    /**
    * Start date of the data in format YYYY-MM-DDTHH:mm:ssZ.
    */
    'dateFrom'?: Date;
    /**
    * End date of the data in format YYYY-MM-DDTHH:mm:ssZ.
    */
    'dateTo'?: Date;
    /**
    * list of all the observations of the risk.
    */
    'findings'?: Array<Riskanalyticscontrollerv3Finding>;
    /**
    * Classification of the risk in the given hour.
    */
    'hourlyCategory'?: string;
    /**
    * Classification description of the risk in the given hour.
    */
    'hourlyCategoryDescription'?: string;
    /**
    * Description of the risk.
    */
    'hourlyDescription'?: string;
    'hourlySeverityLevel'?: Riskanalyticsenginev3SeverityLevel;
    /**
    * list of all the indicators - Optional (depending on include_indicators).
    */
    'indicators'?: Array<Riskanalyticscontrollerv3Indicator>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "dateFrom",
            "baseName": "date_from",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "dateTo",
            "baseName": "date_to",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "findings",
            "baseName": "findings",
            "type": "Array<Riskanalyticscontrollerv3Finding>",
            "format": ""
        },
        {
            "name": "hourlyCategory",
            "baseName": "hourly_category",
            "type": "string",
            "format": ""
        },
        {
            "name": "hourlyCategoryDescription",
            "baseName": "hourly_category_description",
            "type": "string",
            "format": ""
        },
        {
            "name": "hourlyDescription",
            "baseName": "hourly_description",
            "type": "string",
            "format": ""
        },
        {
            "name": "hourlySeverityLevel",
            "baseName": "hourly_severity_level",
            "type": "Riskanalyticsenginev3SeverityLevel",
            "format": ""
        },
        {
            "name": "indicators",
            "baseName": "indicators",
            "type": "Array<Riskanalyticscontrollerv3Indicator>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Riskanalyticscontrollerv3RiskEventHourlyFindings.attributeTypeMap;
    }

    public constructor() {
    }
}



