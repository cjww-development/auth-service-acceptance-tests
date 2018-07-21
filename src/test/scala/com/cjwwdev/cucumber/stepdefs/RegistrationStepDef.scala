/*
 * Copyright 2018 CJWW Development
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cjwwdev.cucumber.stepdefs

import com.cjwwdev.cucumber.utils.BasePage
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}

class RegistrationStepDef extends ScalaDsl with EN with BasePage {
  Given("""^the user is on the org registration page$""") { () =>
    navigateToPage(s"$accountServiceUrl/create-an-organisation-account")
    verifyPageByTitle("main-heading", "New around here?")
  }

  Given("""^the user is on the individual registration page$""") { () =>
    navigateToPage(s"$accountServiceUrl/create-an-account")
    verifyPageByTitle("main-heading", "New around here?")
  }

  And("""^the user has entered their org registration information$""")  { dataTable: DataTable =>
    enterDataFromTable(dataTable)
    clickButtonById("org-register-submit")
  }

  And("""^the user has entered their user registration information$""")  { dataTable: DataTable =>
    enterDataFromTable(dataTable)
    clickButtonById("user-register-submit")
  }

  Then("""^the user is redirected to the registration success page that displays org account info$""") { () =>
    verifyPageByTitle("main-heading", "Welcome, to CJWW")
    verifyDivIsDisplayed("organisation-success")
  }

  Then("""^the user is redirected to the registration success page the displays user account info$""") { () =>
    verifyPageByTitle("main-heading", "Welcome, to CJWW")
    verifyDivIsDisplayed("individual-success")
  }
}
