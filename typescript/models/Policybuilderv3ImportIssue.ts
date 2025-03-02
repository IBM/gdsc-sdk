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

export enum Policybuilderv3ImportIssue {
    NoImportIssue = 'NO_IMPORT_ISSUE',
    InvalidParams = 'INVALID_PARAMS',
    InvalidActions = 'INVALID_ACTIONS',
    InvalidParamsAndActions = 'INVALID_PARAMS_AND_ACTIONS',
    InvalidRule = 'INVALID_RULE',
    InternalErr = 'INTERNAL_ERR',
    NoRules = 'NO_RULES',
    CommunicationErr = 'COMMUNICATION_ERR',
    UnsupportedAction = 'UNSUPPORTED_ACTION',
    UnsupportedParams = 'UNSUPPORTED_PARAMS',
    UnsupportedParamsAndActions = 'UNSUPPORTED_PARAMS_AND_ACTIONS'
}
