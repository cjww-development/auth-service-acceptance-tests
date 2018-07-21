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

class LoginStepDef extends ScalaDsl with EN with BasePage {
  Given("""^the user is on the login page$""") { () =>
    navigateToPage(s"$accountServiceUrl/login")
    verifyPageByTitle("main-heading", "Login here")
  }

  And("""^the user has entered some login credentials$""") { (dataTable: DataTable) =>
    enterDataFromTable(dataTable)
    clickButtonById("login-button")
  }

  Then("""^the user is redirected to the service director page$""") { () =>
    verifyPageByTitle("main-heading", "Where would you like to go? Choose below")
  }

  Then("""^the user is presented with the login screen containing errors$""") { () =>
    verifyPageByTitle("main-heading", "Login here")
    verifyErrorPanelIsDisplayed("panel-danger")
  }
}
