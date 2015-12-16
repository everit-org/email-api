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
package org.everit.email.sender;

import java.io.Closeable;

import org.everit.email.Email;

/**
 * When more emails are available at the same time, it is better to use a bulk e-mail sender. It
 * keeps the sending channel opened so processing the e-mails will be faster. A
 * {@link BulkEmailSender} should be closed as soon as the last email from the queue is processed.
 */
public interface BulkEmailSender extends Closeable {

  @Override
  void close();

  /**
   * Sends an email.
   *
   * @param mail
   *          The email.
   */
  void sendEmail(Email mail);
}
