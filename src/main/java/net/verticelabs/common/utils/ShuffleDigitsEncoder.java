package net.verticelabs.common.utils;

import java.util.ArrayList;
import java.util.List;

public class ShuffleDigitsEncoder {

	public String shuffleDigits(CharSequence number) {
		int len = number.length();
		StringBuffer buffer = new StringBuffer(len);
		List<Integer> control = new ArrayList<>(len);
		for (int i = 0; i < len; i++) {
			buffer.append(' ');
			control.add(i);
		}
		int i = len, p = 0;
		char ch;

		while (--i > -1) {
			ch = number.charAt(i);
			buffer.setCharAt(control.remove(p), ch);
			if (!control.isEmpty()) {
				p = (p + Character.digit(ch, 10)) % control.size();
			}
		}
		return buffer.toString();
	}

	public String unshuffleDigits(CharSequence number) {
		int len = number.length();
		StringBuffer buffer = new StringBuffer(len);
		List<Integer> control = new ArrayList<>(len);
		for (int i = 0; i < len; i++) {
			buffer.append(' ');
			control.add(i);
		}
		int i = len, p = 0;
		char ch;

		while (--i > -1) {
			ch = number.charAt(control.remove(p));
			buffer.setCharAt(i, ch);
			if (!control.isEmpty()) {
				p = (p + Character.digit(ch, 10)) % control.size();
			}
		}
		return buffer.toString();
	}

}
