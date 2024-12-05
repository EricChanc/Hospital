package com.example.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * md5加密
 */
public class MD5Utils {

	/**
	 * 加盐MD5
	 */
	public static String slatMD5(String source, String slat) {
		return MD5(source+slat);
	}

	/**
	 * md5加密
	 * @param sourcMMr
	 * @return
	 */
	public static String MD5(String sourcMMr) {
		String result = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(sourcMMr.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			result = buf.toString();
		} catch (NoSuchAlgorithmException e) {
			System.out.println(e);
		}
		return result;
	}
}
