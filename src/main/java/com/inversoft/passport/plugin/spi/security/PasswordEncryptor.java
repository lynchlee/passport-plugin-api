/*
 * Copyright (c) 2015, Inversoft Inc., All Rights Reserved
 */
package com.inversoft.passport.plugin.spi.security;

/**
 * Used to encrypt user passwords.
 *
 * @author Brian Pontarelli
 */
public interface PasswordEncryptor {
  /**
   * @return The default factor for this PasswordEncryptor.
   */
  int defaultFactor();

  /**
   * Encrypts the given password using the given salt.
   *
   * @param password The password to encrypt.
   * @param salt     The salt that can optionally be used to increase the security of the password encryption.
   * @param factor   The load or iteration factor for this encryption operation.
   * @return The encrypted password.
   */
  String encrypt(String password, String salt, int factor);


}
