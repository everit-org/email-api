package org.everit.email.sender;

import org.everit.email.Email;

/**
 * The simplest api to send mails.
 */
public interface EmailSender {

  /**
   * Sends an email.
   *
   * @param mail
   *          The email.
   */
  void sendMail(Email mail);
}
