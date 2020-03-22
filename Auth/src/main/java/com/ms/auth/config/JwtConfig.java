package com.ms.auth.config;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Bharat2010
 *
 */
@ToString
@Getter
@Setter
public class JwtConfig {

	@Value("${security.jwt.uri:/auth/**}")
	private String Uri;

	@Value("${security.jwt.header:Authorization}")
	private String header;

	@Value("${security.jwt.prefix:Bearer }")
	private String prefix;

	@Value("${security.jwt.expiration:#{24*60*60}}")
	private int expiration;

	@Value("${security.jwt.secret:JwtSecretKey}")
	private String secretKey;

}