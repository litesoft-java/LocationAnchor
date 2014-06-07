// This Source Code is in the Public Domain per: http://unlicense.org
package org.litesoft.locationanchor;

@SuppressWarnings({"UnusedDeclaration"})
public class LocationAnchor {
    public String toString() {
        return getClass().getProtectionDomain().getCodeSource().getLocation().toString();
    }
}
