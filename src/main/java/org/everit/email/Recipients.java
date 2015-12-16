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
