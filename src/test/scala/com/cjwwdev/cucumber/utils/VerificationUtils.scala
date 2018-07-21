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
package com.cjwwdev.cucumber.utils

import org.openqa.selenium.{By, WebDriver}
import org.scalatest.Matchers

trait VerificationUtils extends Matchers {

  val driver: WebDriver

  def verifyPageByTitle(id: String, title: String) = driver.findElement(By.id(id)).getText shouldBe title

  def verifyErrorPanelIsDisplayed(`class`: String) = driver.findElement(By.className(`class`)).isDisplayed

  def verifyDivIsDisplayed(id: String) = driver.findElement(By.id(id)).isDisplayed
}
