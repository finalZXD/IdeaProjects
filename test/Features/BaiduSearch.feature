Feature: BaiduSearch
  @RegressionTest
  Scenario Outline: Testing Search with Baidu
    Given Open Browser With Chrome
    When browser baidu url "<url>"
    And input SearchText "<context>"
    And Click Search
    Then verify page Iscontains search keywork "<context>"
    Examples:
      |url  |context|
      |https://www.baidu.com  |context|
      |https://www.baidu.com  |Hello World|