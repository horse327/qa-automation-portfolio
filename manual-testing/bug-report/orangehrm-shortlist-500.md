**Title**

# [OrangeHRM] 500 Internal Server Error When Shortlisting Candidates for Specific Vacancies


**Environment**

* Application: OrangeHRM Open Source Demo
* Version: 5.8 (current live demo build)
* URL: https://opensource-demo.orangehrmlive.com/
* Browser(s):

 	- Google Chrome (latest)

 	- Mozilla Firefox 147.0 (64-bit)

* OS: Windows 11
* User Role: Admin / HR Manager



**Preconditions**

* User is logged in with Admin or HR Manager privileges.
* Candidate is assigned to the “Senior QA Lead” vacancy (or other affected vacancies).
* Candidate status is “Application Initiated.”



**Steps to Reproduce**

1\. Navigate to Recruitment → Candidates.

2\. Open a candidate profile assigned to the “Senior QA Lead” vacancy (e.g. Gautham Raj R).

3\. Click the Shortlist button.

4\. Click Save in the Shortlist dialog.



**Expected Result**

The candidate status should update successfully to “Shortlisted”, and the action should be recorded in the candidate history, regardless of the assigned vacancy.



Actual Result

* A red toast notification appears with the message “Unexpected Error Occurred.”
* The candidate status is not updated.
* The issue occurs consistently for specific vacancies, while shortlisting works as expected for others (e.g. “Payroll Administrator”).



**Impact**

**High**

* Recruitment Workflow Blocker:

Shortlisting is a mandatory step before interviews. This issue prevents hiring teams from progressing candidates for multiple job roles, effectively creating a dead-end in the recruitment pipeline.

* Operational \& Business Risk:

Inability to shortlist candidates for critical roles (e.g. Senior QA Lead) can delay hiring decisions and increase manual workarounds.

* Data Consistency Concern:

Inconsistent behavior across vacancies suggests a potential backend validation or mapping issue related to vacancy-specific logic.



**Technical Evidence**

* Browser DevTools shows a failing PUT request with HTTP 500 (Internal Server Error) during the shortlist action.
* Failing endpoint:

PUT /web/index.php/api/v2/recruitment/shortlist

* Console error:

Request failed with status code 500 (ERR\_BAD\_RESPONSE)

* Stack trace references:

ShortlistAction.vue:95

api.service.ts:110

* Issue reproduced consistently on both Chrome and Firefox, indicating it is not browser-specific.

* **API Failure:** Browser DevTools Network tab captures a failing `PUT` request with an **HTTP 500 (Internal Server Error)**.
    * **Failing Endpoint:** `/web/index.php/api/v2/recruitment/candidates/81/shortlist`
    * **Evidence:** `network_api_500_error.png`
* **Console Logs:** Axios library reports an `AxiosError` with code `ERR_BAD_RESPONSE`.
    * **Evidence:** `chrome_axios_error.png`
* **Code Reference:** Stack trace points to a failure originating in the frontend component at `ShortlistAction.vue:95`.
    * **Evidence:** `chrome_console_trace.png`
* **Consistency:** Issue is reproduced on both Chrome and Firefox, confirming a server-side (Backend) origin.




**Attachments**

## Attachments

| Evidence Type | Description | File |
|-------------|-------------|------|
| UI Error | Red toast “Unexpected Error Occurred” | evidence/orangehrm/01_shortlist_ui_error_toast.png |
| Control Test | Successful shortlist for Payroll vacancy | evidence/orangehrm/02_shortlist_ui_success_other_vacancy.png |
| Network Error | PUT shortlist request returning HTTP 500 | evidence/orangehrm/03_network_500_error_shortlist_request.png |
| Response Headers | 500 Internal Server Error response details | evidence/orangehrm/04_network_500_response_headers.png |
| Console Error | Axios ERR_BAD_RESPONSE with stack trace | evidence/orangehrm/05_console_axios_500_error.png |


---


### Temporary Workaround (Testing Only)

For testing or demo purposes, users who need to continue validating the recruitment workflow (e.g. scheduling interviews or hiring actions) can assign candidates to vacancies such as “Payroll Administrator” or other unaffected test vacancies.

The Shortlist functionality currently works as expected for these data sets, allowing end-to-end testing of the recruitment module while this issue is being investigated.
