package com.utility.web;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class LookupProgram {

    public static void main(String... args) throws UnknownHostException {

        long ipAddress = new BigInteger(InetAddress.getByName("2401:4900:36af:2c2e:1453:1d9e:2d60:c04").getAddress()).longValue();

        System.out.println("By String IP address: \n" +
                GeoIPv4.getLocation("2401:4900:36af:2c2e:1453:1d9e:2d60:c04"));

        System.out.println("By long IP address: \n" +
                GeoIPv4.getLocation(ipAddress));

        System.out.println("By InetAddress IP address: \n" +
                GeoIPv4.getLocation(InetAddress.getByName("2401:4900:36af:2c2e:1453:1d9e:2d60:c04")));

    }
}