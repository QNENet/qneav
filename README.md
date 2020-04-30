# QNEAV Audio Visual

## Install in a fresh Apache Karaf 4.3.0-RC1

Add jre additional export into `etc/jre.properties` when using JDK8:

```
jre-1.8= \
...
 sun.audio, \
 sun.security.pkcs11, \
 sun.lwawt, \
 sun.lwawt.macosx
```

Start Karaf and add feature repository:

```
feature:repo-add mvn:net.qnenet.qneav/qavfeatures/1.0-SNAPSHOT/xml/features
```

Install feature:

```
feature:install qneav
```
