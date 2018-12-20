package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		
		assertEquals("NO", Solution.twoStrings("", ""));
		assertEquals("NO", Solution.twoStrings("hello", ""));
		assertEquals("NO", Solution.twoStrings("", "hello"));
		
		assertEquals("YES", Solution.twoStrings("hello", "world"));
		assertEquals("NO", Solution.twoStrings("hi", "world"));

		assertEquals("YES", Solution.twoStrings("dapkqnowwvdrknfvcmanjuroumppajrzklucroxvpfmcsclqa",
				"ivtnjtgiogmwhqybjaxlktqbwsdhqrwovoavetymkpcco"));
		assertEquals("YES", Solution.twoStrings("hrtybirxncuiailznohfawjwipdtupnxnisbwcplozwrzt",
				"ngdmqotxkpnuhmpfmajthzdtnztrqyugendiublcwp"));
		assertEquals("NO", Solution.twoStrings("rmpwlddwttapjzhdldjmuhmgruufltzszprzdcziigc",
				"bbvvkeqkqekqqennyxqxkxnyxnyqnnybnbvnyqqe"));
		assertEquals("NO", Solution.twoStrings("annbjookwtqkoivcgbqckqtvgvktobctktgkkjiac",
				"zsspfhmzpurrrlurdsdlrfldzyldfhudfedrszdpmsudh"));
		assertEquals("NO", Solution.twoStrings("yuuuydwovzawzamvydaaadkakukpynwfmpnmuaazokxkmjxawo",
				"rqiqbhgscsetgihrrrgsqrlqgcbcbrettlehbeistbiqbisie"));
		assertEquals("NO", Solution.twoStrings("ibvmfltfdvlmentbfdemebbnvllfneeefnaamtblt",
				"gukzzrqruyxsrqhyuggkrjujkwjhqhqsrqgkrkqxpszrzk"));
		assertEquals("YES", Solution.twoStrings("nakqzfroqouhgunxqvqbxwtibfodsvoilqrpvhtgzoholxd",
				"bqluorjgkkrvmiptnxegxwlhrstiiafbfoxodzyguhdwi"));
		assertEquals("NO", Solution.twoStrings("oyvgelovlyevhhedoeolyhdevcvhgceydcdehgvoc",
				"wsqswjnjpiarszzzxpmptrquwbnbzqiqqtzqnbajnpsjfaxr"));
		assertEquals("NO", Solution.twoStrings("hvkmgwawagozzabgmdmdvbbaxadawmbazvxohxzv",
				"sfiltrslqepytjpfffqlrpejiueftrnisnnppnlpuficrjys"));
		assertEquals("YES", Solution.twoStrings("nvsovybaljmzenkfgayfoxzcjantbdidxflbkhbixgzk",
				"qdphnbrjmznztnphhutkdbwjzmjwugtxggxchzcidngplj"));

	}

}
