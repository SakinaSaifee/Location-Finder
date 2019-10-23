package com.utility.web;

import com.maxmind.geoip.LookupService;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;

public class GeoIPv4 {

    private static LookupService lookUp;
    static File datafile = new File(
		    "D:\\java\\GeoLiteCity.dat");

    static {
        try {
            lookUp = new LookupService(datafile ,LookupService.GEOIP_MEMORY_CACHE);

            System.out.println("GeoIP Database loaded: " + lookUp.getDatabaseInfo());
        } catch (IOException e) {
            System.out.println("Could not load geo ip database: " + e.getMessage());
        }
    }

    public static GeoLocation getLocation(String ipAddress) {
        return GeoLocation.map(lookUp.getLocation(ipAddress));
    }

    public static GeoLocation getLocation(long ipAddress){
        return GeoLocation.map(lookUp.getLocation(ipAddress));
    }

    public static GeoLocation getLocation(InetAddress ipAddress){
        return GeoLocation.map(lookUp.getLocation(ipAddress));
    }
}