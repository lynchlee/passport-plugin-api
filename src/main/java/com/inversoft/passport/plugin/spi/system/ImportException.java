/*
 * Copyright (c) 2017, Inversoft Inc., All Rights Reserved
 */
package com.inversoft.passport.plugin.spi.system;

/**
 * Implementors of the {@link Importer} interface should throw this exception if a problem is encountered during the
 * import process.
 *
 * @author Daniel DeGroff
 */
public class ImportException extends RuntimeException {
  public ImportException() {
  }

  public ImportException(String message) {
    super(message);
  }

  public ImportException(String message, Throwable cause) {
    super(message, cause);
  }

  public ImportException(Throwable cause) {
    super(cause);
  }

  public ImportException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
