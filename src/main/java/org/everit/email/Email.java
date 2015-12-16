package org.everit.email;

import java.util.Collection;
import java.util.Collections;

/**
 * Representation of an email.
 */
public class Email {

  /**
   * The attachments of the email.
   */
  public Collection<Attachment> attachments = Collections.emptySet();

  /**
   * The sender's email address.
   */
  public EmailAddress from;

  /**
   * HTML content of the email. If null, no HTML content will be sent. Either HTML or Text content
   * or both must be specified.
   */
  public HtmlContent htmlContent;

  public Recipients recipients;

  public String subject;

  /**
   * Text content of the email. If null, no Text content will be sent. Either HTML or Text content
   * or both must be specified.
   */
  public String textContent;

  public Email withAttachments(final Collection<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Email withFrom(final EmailAddress from) {
    this.from = from;
    return this;
  }

  public Email withHtmlContent(final HtmlContent htmlContent) {
    this.htmlContent = htmlContent;
    return this;
  }

  public Email withRecipients(final Recipients recipients) {
    this.recipients = recipients;
    return this;
  }

  public Email withSubject(final String subject) {
    this.subject = subject;
    return this;
  }

  public Email withTextContent(final String textContent) {
    this.textContent = textContent;
    return this;
  }

}
