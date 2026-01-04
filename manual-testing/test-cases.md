# Test Cases

## TC-LOGIN-001 — Login with valid credentials

**Precondition:**  
User is registered and on the login page.

**Steps:**
1. Enter a valid username or email
2. Enter a valid password
3. Click the Login button

**Expected Result:**  
User is redirected to the dashboard and login is successful.

---

## TC-LOGIN-002 — Login with invalid password

**Precondition:**  
User is registered and on the login page.

**Steps:**
1. Enter a valid username or email
2. Enter an invalid password
3. Click the Login button

**Expected Result:**  
Error message is displayed and login is not successful.

---

## TC-LOGIN-003 — Login with empty fields

**Precondition:**  
User is on the login page.

**Steps:**
1. Leave username and password fields empty
2. Click the Login button

**Expected Result:**  
Validation message is displayed for required fields.
