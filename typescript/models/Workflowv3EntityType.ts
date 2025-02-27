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
* Assignment type.   - UNDEFINED_ENTITY_TYPE: Undefined.  - EMAIL: External e-mail.  - USER: GDSC user.  - ROLE: GDSC role.  - DISTRIBUTION: GDSC distribution rule.
*/
export enum Workflowv3EntityType {
    UndefinedEntityType = 'UNDEFINED_ENTITY_TYPE',
    Email = 'EMAIL',
    User = 'USER',
    Role = 'ROLE',
    Distribution = 'DISTRIBUTION'
}
