/**
 * 
 */
package com.tsiry.org.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tsiry MANANKASINA
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {
	private String to;
	private String subject;
	private String text;
}
