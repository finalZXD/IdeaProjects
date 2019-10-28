$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BaiduSearch.feature");
formatter.feature({
  "line": 1,
  "name": "BaiduSearch",
  "description": "",
  "id": "baidusearch",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Testing Search with Baidu",
  "description": "",
  "id": "baidusearch;testing-search-with-baidu",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser With Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "browser baidu url \"\u003curl\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "input SearchText \"\u003ccontext\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click Search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify page Iscontains search keywork \"\u003ccontext\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "baidusearch;testing-search-with-baidu;",
  "rows": [
    {
      "cells": [
        "url",
        "context"
      ],
      "line": 10,
      "id": "baidusearch;testing-search-with-baidu;;1"
    },
    {
      "cells": [
        "https://www.baidu.com",
        "context"
      ],
      "line": 11,
      "id": "baidusearch;testing-search-with-baidu;;2"
    },
    {
      "cells": [
        "https://www.baidu.com",
        "Hello World"
      ],
      "line": 12,
      "id": "baidusearch;testing-search-with-baidu;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Testing Search with Baidu",
  "description": "",
  "id": "baidusearch;testing-search-with-baidu;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser With Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "browser baidu url \"https://www.baidu.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "input SearchText \"context\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click Search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify page Iscontains search keywork \"context\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BaiduSearchStep.open_browser_with_chrome()"
});
formatter.result({
  "duration": 13790969700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.baidu.com",
      "offset": 19
    }
  ],
  "location": "BaiduSearchStep.browserBaiduUrl(String)"
});
formatter.result({
  "duration": 2537346400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "context",
      "offset": 18
    }
  ],
  "location": "BaiduSearchStep.inputSearchText(String)"
});
formatter.result({
  "duration": 636193900,
  "status": "passed"
});
formatter.match({
  "location": "BaiduSearchStep.clickSearch()"
});
formatter.result({
  "duration": 105166300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "context",
      "offset": 39
    }
  ],
  "location": "BaiduSearchStep.verifyPageIscontainsSearchKeywork(String)"
});
formatter.result({
  "duration": 1767462500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Testing Search with Baidu",
  "description": "",
  "id": "baidusearch;testing-search-with-baidu;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Open Browser With Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "browser baidu url \"https://www.baidu.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "input SearchText \"Hello World\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click Search",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify page Iscontains search keywork \"Hello World\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BaiduSearchStep.open_browser_with_chrome()"
});
formatter.result({
  "duration": 9445665000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.baidu.com",
      "offset": 19
    }
  ],
  "location": "BaiduSearchStep.browserBaiduUrl(String)"
});
formatter.result({
  "duration": 1410429300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello World",
      "offset": 18
    }
  ],
  "location": "BaiduSearchStep.inputSearchText(String)"
});
formatter.result({
  "duration": 339727900,
  "status": "passed"
});
formatter.match({
  "location": "BaiduSearchStep.clickSearch()"
});
formatter.result({
  "duration": 199626100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello World",
      "offset": 39
    }
  ],
  "location": "BaiduSearchStep.verifyPageIscontainsSearchKeywork(String)"
});
formatter.result({
  "duration": 1916764700,
  "status": "passed"
});
});