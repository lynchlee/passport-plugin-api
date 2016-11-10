# Passport Plugin API ![semver 2.0.0 compliant](http://img.shields.io/badge/semver-2.0.0-brightgreen.svg?style=flat-square)

This project provides the APIs and SPIs that are used to write Passport plugins.

Currently, there is a single plugin SPI for Passport that allows customers to support different password encryption schemes. This interface is `com.inversoft.passport.plugin.spi.security.PasswordEncryptor`.

You can learn more about Passport plugins by visiting our documentation page at [https://www.inversoft.com/docs/passport/1.x/tech/plugins/](https://www.inversoft.com/docs/passport/1.x/tech/plugins/).

## Building this project

If you would like to clone and build this project yourself, you will need to install the Savant build tool if you don't already have it installed. Follow these instructions to install Savant.

```bash
$ mkdir ~/savant
$ cd ~/savant
$ wget http://savant.inversoft.org/org/savantbuild/savant-core/1.0.0/savant-1.0.0.tar.gz
$ tar xvfz savant-1.0.0.tar.gz
$ ln -s ./savant-1.0.0 current
$ export PATH=$PATH:~/savant/current/bin/
```

Then, perform an integration build of the project by running:

```bash
$ sb int
```

For more information, checkout [savantbuild.org](http://savantbuild.org/).
