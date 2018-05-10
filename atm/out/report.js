$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nicebank/cash_withdrawal.feature");
formatter.feature({
  "line": 1,
  "name": "Cash Withdrawal",
  "description": "",
  "id": "cash-withdrawal",
  "keyword": "Feature"
});
formatter.before({
  "duration": 400793851,
  "status": "passed"
});
formatter.before({
  "duration": 1887699,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Successful withdrawal from an account in credit",
  "description": "",
  "id": "cash-withdrawal;successful-withdrawal-from-an-account-in-credit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have credited $100.00 in my account",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I withdraw $20",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "$20 should be dispensed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the balance of my account should be $80.00",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "$100.00",
      "offset": 16
    }
  ],
  "location": "AccountSteps.i_have_credited_$_in_my_account(Money)"
});
formatter.result({
  "duration": 79085347,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 12
    }
  ],
  "location": "TellerSteps.i_withdraw_$(int)"
});
formatter.result({
  "duration": 3147061892,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 1
    }
  ],
  "location": "CashSlotSteps.$_should_be_dispensed(int)"
});
formatter.result({
  "duration": 3867873,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$80.00",
      "offset": 36
    }
  ],
  "location": "AccountSteps.the_balance_of_my_account_should_be_$(Money)"
});
formatter.result({
  "duration": 103094,
  "status": "passed"
});
formatter.after({
  "duration": 8462541,
  "status": "passed"
});
formatter.after({
  "duration": 124981,
  "status": "passed"
});
});