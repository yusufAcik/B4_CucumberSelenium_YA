@regression @parallel
Feature: Edit Profile Page

  @editprofile
  Scenario Outline: edit profile test
    Given The user is on the login page
    When The user logs in using "<userEmail>" and "<password>"
    And The user navigates to "<name>" and "<menu>" sub menu
    And The user navigates to "<sub menu>"
    And The user adds "about" "<about>"
    And The user adds "company" "<company>"
    And The user selects "<job>" from menu
    And The user adds "website" "<website>"
    And The user adds "location" "<location>"
    And The user adds "skills" "<skills>"
    And The user clicks on save changes button
    Examples:
      | userEmail        | password  | name         | menu       | sub menu     | about               | company   | job              | website           | location | skills                     |
      | mike@gmail.com   | mike1234  | mike         | My Profile | Edit Profile | graduated SDET 2023 | KraftTech | QA Test Engineer | www.krafttech.com | Istanbul | Java,Selenium              |
      | john@gmail.com   | John1234. | John         | My Profile | Edit Profile | graduated SDET 2022 | Google    | QA               | www.google.com    | Istanbul | Java,Selenium              |
      | eddiem@kraft.com | eddiem12  | Eddie Murphy | My Profile | Edit Profile | graduated SDET 2021 | Microsoft | SDET             | www.microsoft.com | Istanbul | Java,Selenium,Api,DataBase |

    # yaptığımız değişiklikleri assert edeceğiz

