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

import java.util.Collection;
import java.util.Collections;

/**
 * Recipients of an e-mail.
 */
public class Recipients {

  /**
   * Recipients who get copy of the email but are not shown for others.
   */
  public Collection<EmailAddress> bcc = Collections.emptySet();

  /**
   * Recipients who get copy of the email.
   */
  public Collection<EmailAddress> cc = Collections.emptySet();

  /**
   * Recipients of the email.
   */
  public Collection<EmailAddress> to = Collections.emptySet();

  public Recipients withBcc(final Collection<EmailAddress> bcc) {
    this.bcc = bcc;
    return this;
  }

  public Recipients withCc(final Collection<EmailAddress> cc) {
    this.cc = cc;
    return this;
  }

  public Recipients withTo(final Collection<EmailAddress> to) {
    this.to = to;
    return this;
  }
}
