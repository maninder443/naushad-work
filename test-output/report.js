$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTests/Patient.feature");
formatter.feature({
  "name": "To Test Feature of DaVita Application With Patient User",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User is logged In with patient",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user submit username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_submit_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_click_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_should_be_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to play video through education menu",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on patient home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_is_on_patient_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Education menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.click_on_Education_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on first video link",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.click_on_first_video_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to play video successfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_is_able_to_play_video_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is logged In with patient",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user submit username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_submit_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_click_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_should_be_logged_in_successfully()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"app-task-list section h2\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MW-LT-076\u0027, ip: \u0027192.168.43.190\u0027, os.name: \u0027Windows 8.1\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_40\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\NAUSHA~1.ALA\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:49945}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 374337c55be262dba9c478be1023b7fd\n*** Element info: {Using\u003dcss selector, value\u003dapp-task-list section h2}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\r\n\tat pageObjects.PatientPage.patientDashboardText(PatientPage.java:57)\r\n\tat stepDefinitions.PatientUser.user_should_be_logged_in_successfully(PatientUser.java:57)\r\n\tat ✽.user should be logged in successfully(file:///C:/Users/naushad.alam/eclipse-workspace/Cucumber/./src/test/resources/functionalTests/Patient.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Verify user is able to play video through Entertainment menu",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on patent user home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.user_is_on_patent_user_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Entertainment menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.click_on_Entertainment_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on Go to next education task",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.click_on_Go_to_next_education_task()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on first video",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.click_on_first_video()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "video wil play successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PatientUser.video_wil_play_successfully()"
});
formatter.result({
  "status": "skipped"
});
});