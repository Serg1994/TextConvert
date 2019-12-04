package de.hfu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilTest2 {
	@Test
		public void testistErstesHalbjahr() {
			assertTrue("Soll True sein.", Util.istErstesHalbjahr(1));
			assertTrue("Soll True sein.", Util.istErstesHalbjahr(6));
			assertFalse("Soll False sein.", Util.istErstesHalbjahr(7));
			assertFalse("Soll False sein.", Util.istErstesHalbjahr(12));
		}
	}
