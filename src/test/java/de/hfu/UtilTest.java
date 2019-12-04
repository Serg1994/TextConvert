package de.hfu;

import org.junit.Test;

public class UtilTest {
	@Test(expected=IllegalArgumentException.class, timeout=1000)
		public void testistErstesHalbjahr() {
			Util.istErstesHalbjahr(0);
			Util.istErstesHalbjahr(13);
		}
	}