/*
 * Copyright (c) 2015, Inversoft Inc., All Rights Reserved
 */
package com.inversoft.passport.plugin.spi.security;

import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.UUID;

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

  /**
   * Generates a random salt that is compatible with the PasswordEncryptor. The default implementation uses two UUIDs
   * and Base 64 encodes them.
   *
   * @return The salt.
   */
  default String generateSalt() {
    ByteBuffer buf = ByteBuffer.allocate(32);
    UUID first = UUID.randomUUID();
    buf.putLong(first.getLeastSignificantBits());
    buf.putLong(first.getMostSignificantBits());
    UUID second = UUID.randomUUID();
    buf.putLong(second.getLeastSignificantBits());
    buf.putLong(second.getMostSignificantBits());
    return Base64.getEncoder().encodeToString(buf.array());
  }
}
