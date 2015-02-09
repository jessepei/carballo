package com.alonsoruibal.chess;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;

public class EloTest extends EpdTest {

	@Test
	@Category(SlowTest.class)
	public void testBS2830() {
		long time = processEpdFile(this.getClass().getResourceAsStream("/bs2830.epd"), 15 * 60000);
		double timeMinutes = time / 60000;
		double elo = 2850 - (timeMinutes / 1.5) - (timeMinutes * timeMinutes) / (22 * 22);
		System.out.println("BS2830 Elo = " + elo);
	}

	@Test
	@Category(SlowTest.class)
	public void testBT2450() {
		long time = processEpdFile(this.getClass().getResourceAsStream("/bt2450.epd"), 15 * 60000);
		double timeSeconds = time / 1000;
		double elo = 2450 - (timeSeconds / 30);
		System.out.println("BT2450 Elo = " + elo);
	}

	@Test
	@Category(SlowTest.class)
	public void testBT2630() {
		long time = processEpdFile(this.getClass().getResourceAsStream("/bt2630.epd"), 15 * 60000);
		double timeSeconds = time / 1000;
		double elo = 2630 - (timeSeconds / 30);
		System.out.println("BT2630 Elo = " + elo);
		assertTrue("BT2630 ELO is " + elo + ", lower than 2470", elo > 2470);
	}

	@Test
	@Category(SlowTest.class)
	public void testLCTII() {
		long time = processEpdFile(this.getClass().getResourceAsStream("/lctii.epd"), 10 * 60000);
		double timeSeconds = time / 1000;
		System.out.println("time in seconds = " + timeSeconds);
		System.out.println("LCTII ELO = " + (1900 + getLctPoints()));
	}

	@Test
	@Category(SlowTest.class)
	public void testArasan() {
		long time = processEpdFile(this.getClass().getResourceAsStream("/arasan.epd"), 30000);
		double timeSeconds = time / 1000;
		System.out.println("time in seconds = " + timeSeconds);
	}

	@Test
	@Category(SlowTest.class)
	public void testWinningChessSacrificesAndCombinations() {
		long time = processEpdFile(this.getClass().getResourceAsStream("/wcsac.epd"), 5000);
		double timeSeconds = time / 1000;
		System.out.println("time in seconds = " + timeSeconds);
	}

	@Test
	@Category(SlowTest.class)
	public void testSilentButDeadly() {
		long time = processEpdFile(this.getClass().getResourceAsStream("/silentbutdeadly.epd"), 5000);
		double timeSeconds = time / 1000;
		System.out.println("time in seconds = " + timeSeconds);
	}

	@Test
	@Category(SlowTest.class)
	public void testECMGCP() {
		long time = processEpdFile(this.getClass().getResourceAsStream("/ecmgcp.epd"), 10000);
		double timeSeconds = time / 1000;
		System.out.println("time in seconds = " + timeSeconds);
	}
}