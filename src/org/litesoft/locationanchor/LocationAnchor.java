package org.litesoft.locationanchor;

@SuppressWarnings({"UnusedDeclaration"})
public class LocationAnchor
{
    public String toString()
    {
        return getClass().getProtectionDomain().getCodeSource().getLocation().toString();
    }
}
