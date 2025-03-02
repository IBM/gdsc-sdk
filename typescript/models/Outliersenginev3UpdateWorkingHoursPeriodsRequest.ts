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

import { Outliersenginev3WorkingHoursPeriod } from '../models/Outliersenginev3WorkingHoursPeriod';
import { HttpFile } from '../http/http';

/**
* UpdateWorkingHoursPeriodsRequest is the request object for UpdateWorkingHoursPeriods API.
*/
export class Outliersenginev3UpdateWorkingHoursPeriodsRequest {
    'period'?: Outliersenginev3WorkingHoursPeriod;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "period",
            "baseName": "period",
            "type": "Outliersenginev3WorkingHoursPeriod",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Outliersenginev3UpdateWorkingHoursPeriodsRequest.attributeTypeMap;
    }

    public constructor() {
    }
}

