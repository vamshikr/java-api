package org.continuousassurance.swamp.api;

import org.continuousassurance.swamp.session.Session;

import java.util.Map;

/**
 * <p>Created by Jeff Gaynor<br>
 * on 3/4/15 at  12:39 PM
 */
public class PlatformVersion extends SwampThing {
    public static final String NAME_KEY = "full_name";
    public static final String PLATFORM_UUID_KEY = "platform_uuid";  
    public static final String PLATFORM_VERSION_UUID_KEY = "platform_version_uuid";
    public static final String VERSION_STRING = "version_string";

    protected Platform platform;

	public PlatformVersion(Session session) {
        super(session);
    }
    public PlatformVersion(Session session, Map map) {
        super(session, map);
    }

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	public String getFullName() {
		return this.getConversionMap().getString(NAME_KEY);
	}

	public String getVersionString() {
		return this.getConversionMap().getString(VERSION_STRING);
	}

	public String getPlatformVersionUuid() {
		return this.getConversionMap().getString(PLATFORM_VERSION_UUID_KEY);
	}

	public String getName() {
		return getFullName();
	}
	
    @Override
    public String getIDKey() {
        return PLATFORM_VERSION_UUID_KEY;
    }

    @Override
    protected SwampThing getNewInstance() {
        return new PlatformVersion(getSession());
    }
    
	public enum Bits {
		BITS_32,
		BITS_64;
		
		public String toString () {
			if (this == Bits.BITS_32){
				//return "32-bit";
				return "32";
			}else {
				//return "64-bit";
				return "64";
			}
		}
	}

	
	String shortName;
	String version;
	Bits bits;
	
	protected void standardize (String shortName, String version, Bits bits) {

		this.shortName = shortName;
		this.version = version;
		this.bits = bits;
	}
	
	public void standardize() {

		switch(getFullName()) {
		case ("Android Android on Ubuntu 12.04 64-bit"):
			standardize("Android-Ubuntu", "12.04", Bits.BITS_64);
		break;
		case ("CentOS Linux 5 32-bit"):
			standardize("CentOS", "5", Bits.BITS_32);
		break;
		case ("CentOS Linux 5 64-bit"):
			standardize("CentOS", "5", Bits.BITS_64);
		break;
		case ("CentOS Linux 6 32-bit"):
			standardize("CentOS", "6", Bits.BITS_32);
		break;
		case ("CentOS Linux 6 64-bit"):
			standardize("CentOS", "6", Bits.BITS_64);
		break;
		case ("Debian 7 64-bit"):
			standardize("Debian", "7", Bits.BITS_64);
		break;
		case ("Debian 8 64-bit"):
			standardize("Debian", "8", Bits.BITS_64);
		break;
		case ("Fedora 18 64-bit"):
			standardize("Fedora", "18", Bits.BITS_64);
		break;
		case ("Fedora 19 64-bit"):
			standardize("Fedora", "19", Bits.BITS_64);
		break;
		case ("Fedora 20 64-bit"):
			standardize("Fedora", "20", Bits.BITS_64);
		break;
		case ("Fedora 21 64-bit"):
			standardize("Fedora", "21", Bits.BITS_64);
		break;
		case ("Fedora 22 64-bit"):
			standardize("Fedora", "22", Bits.BITS_64);
		break;
		case ("Fedora 23 64-bit"):
			standardize("Fedora", "23", Bits.BITS_64);
		break;
		case ("Fedora 24 64-bit"):
			standardize("Fedora", "24", Bits.BITS_64);
		break;
		case ("Scientific 5 32-bit"):
			standardize("Scientific", "5.11", Bits.BITS_32);
		break;
		case ("Scientific 5 64-bit"):
			standardize("Scientific", "5", Bits.BITS_64);
		break;
		case ("Scientific 6 32-bit"):
			standardize("Scientific", "6", Bits.BITS_32);
		break;
		case ("Scientific 6 64-bit"):
			standardize("Scientific", "6", Bits.BITS_64);
		break;
		case ("Ubuntu 10.04 64-bit"):
			standardize("Ubuntu", "10.04", Bits.BITS_64);
		break;
		case ("Ubuntu 12.04 64-bit"):
			standardize("Ubuntu", "12.04", Bits.BITS_64);
		break;
		case ("Ubuntu 14.04 64-bit"):
			standardize("Ubuntu", "14.04", Bits.BITS_64);
		break;
		case ("Ubuntu 16.04 64-bit"):
			standardize("Ubuntu", "16.04", Bits.BITS_64);
		break;
		default:
			break;
		}
	}

	public void standardize_old() {

		switch(getFullName()) {
		case ("Android Android on Ubuntu 12.04 64-bit"):
			standardize("Android-Ubuntu", "12.04", Bits.BITS_64);
		break;
		case ("CentOS Linux 5 32-bit 5.11 32-bit"):
			standardize("CentOS", "5.11", Bits.BITS_32);
		break;
		case ("CentOS Linux 5 64-bit 5.11 64-bit"):
			standardize("CentOS", "5.11", Bits.BITS_64);
		break;
		case ("CentOS Linux 6 32-bit 6.7 32-bit"):
			standardize("CentOS", "6.7", Bits.BITS_32);
		break;
		case ("CentOS Linux 6 64-bit 6.7 64-bit"):
			standardize("CentOS", "6.7", Bits.BITS_64);
		break;
		case ("Debian Linux 7.11 64-bit"):
			standardize("Debian", "7.11", Bits.BITS_64);
		break;
		case ("Debian Linux 8.6 64-bit"):
			standardize("Debian", "8.6", Bits.BITS_64);
		break;
		case ("Fedora Linux 18 64-bit"):
			standardize("Fedora", "18", Bits.BITS_64);
		break;
		case ("Fedora Linux 19 64-bit"):
			standardize("Fedora", "19", Bits.BITS_64);
		break;
		case ("Fedora Linux 20 64-bit"):
			standardize("Fedora", "20", Bits.BITS_64);
		break;
		case ("Fedora Linux 21 64-bit"):
			standardize("Fedora", "21", Bits.BITS_64);
		break;
		case ("Fedora Linux 22 64-bit"):
			standardize("Fedora", "22", Bits.BITS_64);
		break;
		case ("Fedora Linux 23 64-bit"):
			standardize("Fedora", "23", Bits.BITS_64);
		break;
		case ("Fedora Linux 24 64-bit"):
			standardize("Fedora", "24", Bits.BITS_64);
		break;
		case ("Red Hat Enterprise Linux 6 32-bit 6.7 32-bit"):
			standardize("RHEL", "6.7", Bits.BITS_32);
		break;
		case ("Red Hat Enterprise Linux 6 64-bit 6.7 64-bit"):
			standardize("RHEL", "6.7", Bits.BITS_64);
		break;
		case ("Scientific Linux 5 32-bit 5.11 32-bit"):
			standardize("Scientific", "5.11", Bits.BITS_32);
		break;
		case ("Scientific Linux 5 64-bit 5.11 64-bit"):
			standardize("Scientific", "5.11", Bits.BITS_64);
		break;
		case ("Scientific Linux 6 32-bit 6.7 32-bit"):
			standardize("Scientific", "6.7", Bits.BITS_32);
		break;
		case ("Scientific Linux 6 64-bit 6.7 64-bit"):
			standardize("Scientific", "6.7", Bits.BITS_64);
		break;
		case ("Ubuntu Linux 10.04 LTS 64-bit Lucid Lynx"):
			standardize("Ubuntu", "10.04", Bits.BITS_64);
		break;
		case ("Ubuntu Linux 12.04 LTS 64-bit Precise Pangolin"):
			standardize("Ubuntu", "12.04", Bits.BITS_64);
		break;
		case ("Ubuntu Linux 14.04 LTS 64-bit Trusty Tahr"):
			standardize("Ubuntu", "14.04", Bits.BITS_64);
		break;
		case ("Ubuntu Linux 16.04 LTS 64-bit Xenial Xerus"):
			standardize("Ubuntu", "16.04", Bits.BITS_64);
		break;
		default:
			break;
		}
	}

	public String getShortName() {
		return shortName;
	}

	public String getVersion() {
		return version;
	}

	public Bits getBits() {
		return bits;
	}

	public String getDisplayString() {
		return String.format("%s-%s-%s", getShortName().toLowerCase(), getVersion(), getBits());
	}
	
	public String toString() {
		return getDisplayString();
	}

}
