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
