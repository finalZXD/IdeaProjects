Feature: Baidu Search
  Scenario Outline: Search in baidu
    Given go to baidu site
    When I type the search keyword "<context>"
    And click the search button
    Then verify page contains search keywork "<context>"

    Examples:
      |context|
      | Cucumber|
      | TestNG|
      | Devops|