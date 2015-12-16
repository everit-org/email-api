/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.email;

/**
 * Representation of an email address.
 */
public class EmailAddress {

  /**
   * The email address.
   */
  public String address;

  /**
   * Name of the person who owns the email address.
   */
  public String personal;

  public EmailAddress withAddress(final String address) {
    this.address = address;
    return this;
  }

  public EmailAddress withPersonal(final String personal) {
    this.personal = personal;
    return this;
  }
}
