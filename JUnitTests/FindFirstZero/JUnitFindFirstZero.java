
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class JUnitFindFirstZero {

	@Test
	public void test() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {543781664, 1629508709, 1936990306, 2032157037, 1769104993, 1919443300, 542009708, 1769628004, 1701326346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}
	}

	@Test
	public void test1() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}	
	}

	@Test
	public void test2() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {543781664, 1629508709, 1936990306, 2032158829, 1769103632};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}	
	}

	@Test
	public void test3() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {943154791, 1949316407, 1411786793, 710879275, 1599088751, 1533833262, 1836086895, 959263540, 1785558560, 991982190, 1882810997, 959475786, 1210730792, 1496872298, 1882924912, 1532717929, 808282485, 676284494, 1836071785, 1969893433, 947219055, 1833913421, 542137136, 1764569144, 810503243, 673534519, 909387102, 2033727840, 828407422, 2117482356, 1949788527, 1244276821, 1246580815, 1229596727, 908338472, 926443630, 1835618383, 963979816, 859062305, 1077964393, 1752131690, 1768648301, 1864586570, 1650947433, 1734883640, 963995753, 1869228328, 676677967, 589524841, 1852336441, 946497593, 1768759410, 1952608048, 1768631603, 1818062892, 876293152, 1265201258, 1832463722, 1798069099, 1868378217, 758147435, 1331636309, 640166229, 1249607209, 1431257674, 1428188460, 1819156587, 1768451944, 942684528, 1749635151, 1311342206, 2117302117, 875980405, 2036889186, 1768454471, 643705428, 1495684424, 1112428320, 1282108523, 1781545261, 1764304941, 172124519, 1647916842, 1195911464, 1246580575, 691562863, 810117688, 943207732, 825636148, 1852337975, 947206504, 1882732601, 1748580469, 943208543, 1596469305, 930441785, 758149168, 1347766824, 690845049, 963995754, 1852403817, 710486317, 808148797, 962537528, 1769302133, 1768908857, 2033739897, 808991081, 809006440, 2036035445, 943206461, 1059991405, 1869637992, 1782081871, 1310748475, 1816934989, 1248817209, 1781560633, 810887209, 1428648027, 1560960816, 761870384, 1764765033, 959264823, 943224121, 825439605, 1784834165, 1869114939, 1802260042, 1229934666, 1428695593, 1428760681, 1852533098, 1768976234, 1802449003, 1764764982, 875968817, 1768910441, 1869244728, 1785212985, 946367093, 959449691, 1701997680, 1651273586, 758145641, 1865446452, 1966094644, 893214003, 878390331, 1885039476, 757084231, 1430408777, 1430804774, 1499623029};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}		
	}

	@Test
	public void test4() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {511639552, 0, 8323072, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1350267904, 0, -1, 0, 2033727840, 828407422, 14196, 1949788527, 1620079616, 0, -1, -1, 926443374, 1835618383, 1888515072, 0, 0, 0, 1768648301, 1864586570, 1650947433, 1734883640, -1, 1869228328, 676677967, 589524841, 1852336441, 946497593, -520709589, 511639552, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1781545261, 1764304941, 172124519, 1647916842, 1195911464, 1246580575, 691562863, 810117688, 943207732, 825636148, 1852337975, 947206504, 1882732601, 1748580469, 943208543, 1596469305, 930441785, 758149168, 1347766824, 690845049, 963995754, 1852403817, 710486317, 808148797, 962537528, 1769302133, 1768908857, 2033739897, 808991081, 809006440, 2036035445, 943206461, 1059991405, 1869637992, 1782081871, 1310748475, 1816934989, 1248817209, 1781560633, 810887209, 1428648027, 1560960816, 761870384, 1764765033, 959264823, 943224121, 825439605, 1784834165, 1869114939, 1802260042, 1229934666, 1428695593, 1428760681, 1852533098, 1626511915, 511639552, 1895890944, 0, -670262485, 511639552};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}		
	}

	@Test
	public void test5() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {875770425, 1752787302, 1802399088, 991967605, 879390054, 1882945056, 1768450336, 1848668012, 2004230249, 959590451, 963981875, 760965664, 1835676468, 758740256, 807426914, 1986672948, 1969889390, 1768436281, 1748593518, 1766337065, 812149102, 543910256, 1782142249, 641087274, 1230324302, 541806416, 1228502329, 760941168, 1802334318, 1835691887, 959280441, 1969907821, 1852791658, 1832480560, 1786081034, 1114204002, 959916615, 1210656842, 1297047337, 946433840, 1231697976, 943010865, 1178881056, 1245859410, 1246711874, 542591307, 861028938, 1344294732, 860564546, 1162628430, 859190580, 1852337975, 947206504, 1882732601, 1748580469, 943208543, 1596469305, 930441785, 758149168, 1347766824, 690845049, 963995754, 1852403817, 710486317, 808148797, 962537528, 1769302133, 1768908857, 2033739897, 808991081, 809006440, 2036035445, 947353187, 1819634295, 1752130934, 1768122480, 1903652709, 942685503, 774860143, 1885956202, 946425678, 544160620, 1278889290, 1869625706, 812988720, 1428695381, 661674845, 174010413, 1765290066, 1161975376, 1330791754, 1447186267, 1277645356, 1263954224, 761870637, 943142968, 1966682419, 896887394, 1752526696, 1849387884, 1313491279, 1347048744, 707351909, 2004252517, 1986290788, 1684300835, 561916200, 1768844137, 1785294959, 1785425712, 1802055725, 909391417, 828993390, 1768909417, 946497584, 959998058, 1966682122, 1533375084, 1885498479, 1915564130, 1768894580, 880095289, 875904349, 859069228, 997219179, 1949114416, 1196769870, 1230325849, 643392110, 1969842297, 943290669, 946367081, 812280170, 1801810541, 1852270191, 1701998697, 1751595065, 1919576182, 2122214774, 1701996394, 1534028145, 859400053, 858810222, 1981836394, 1848849512, 963082552, 845703792, 842215469, 1769103977, 1882403943, 959657077, 1748579120, 880097647, 1785536571, 1835675701, 963983667, 875572587, 744315693, 876439853};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}		
	}

	@Test
	public void test6() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {-2055274496, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1353385729, 0, -1, 0, 760941168, 1802334318, 28527, 959280441, 1623197441, 0, -1, -1, 1114204002, 959916615, 1891632897, 0, 0, 0, 943010865, 1178881056, 1245859410, 1246711874, -1, 861028938, 1344294732, 860564546, 1162628430, 859190580, -533270498, -2055274496, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1885956202, 946425678, 544160620, 1278889290, 1869625706, 812988720, 1428695381, 661674845, 174010413, 1765290066, 1161975376, 1330791754, 1447186267, 1277645356, 1263954224, 761870637, 943142968, 1966682419, 896887394, 1752526696, 1849387884, 1313491279, 1347075624, 707351909, 2004252517, 1986290788, 1684300835, 561916200, 1768844137, 1785294959, 1785425712, 1802055725, 909391417, 828993390, 1768909417, 946497584, 959998058, 1966682122, 1533375084, 1885498479, 1915564130, 1768894580, 880095289, 875904349, 859069228, 997219179, 1949114416, 1196769870, 1230325849, 643392110, 1969842297, 1278834989, 946367081, 812280170, 1613951006, -2055274496, 553713664, 0, -2008223714, -2055274496, -2008223714, -2055274496, 859400053, 858810222, 1981836394, 1848849512, 963082552, 845703792, 842215469, 1769103977, 1882403943, 959657077, 1748579120, 880097647, 1785536571, 1835675701, 963983667, 875572587, 744315693, 876439853, 1763717165, 1869245749, 874527024, 1784821097, 1965057592, 858929456, 1969633641, 845835885, 1802051616, 1061109566, 1045188400, 1230322005, 959990090, 1296770924, 975335532, 1802447199, 1965582952, 1849638718, 978340944, 1529891129, 757672486, 894711349, 1498704489, 809063753, 1431117882, 1886350185, 1596532264, 1431915080, 1313689417, 944388408, 1768843304};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}	
	}

	@Test
	public void test7() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {1701208944, 661482272, 1986945643, 2003138104, 1769043816, 1853253995, 544088182, 745237866, 1852405605, 1751791664, 1735812981, 947284587, 1847602294, 1768255591, 544565805, 963144224, 1734506089, 1701997922, 1836216431, 1651337847, 1785688179, 1685483370, 1697659242, 1966094694, 1731408429, 807430774, 1852514402, 1765373802, 1981835632, 1903042678, 1802072167, 1987129907, 154691449, 1966631272, 1850297166, 1212765481, 710496330, 1229803599, 675883605, 963145323, 1769432434, 1784837680, 1916287349, 1647915119, 1785620589, 1814066747, 1815181105, 1697739087, 1246308437, 707351882, 1298884974, 1751726201, 928928293, 1719036021, 2034706005, 1229934666, 963669834, 690497066, 174010413, 1765290066, 1161975376, 1330791754, 1447186267, 1277645356, 1263954224, 761870637, 943142968, 1966682419, 896887394, 1752526696, 1849387884, 1313491279, 1347052919, 1751279222, 2037737834, 1702322805, 1718577521, 1632970871, 1701930609, 2003202401, 711292790, 1718056805, 693462391, 1987536246, 1684300900, 1684284279, 1701212518, 1903649126, 560358775, 1719100774, 2121365350, 1719103841, 1713973353, 1852533098, 1768976234, 1802449003, 1764764982, 875968817, 1768910441, 1869244728, 1785212985, 946367093, 959449691, 1701997680, 1651273586, 758145641, 1865446452, 1966094644, 893214003, 878390391, 1902539127, 1718712166, 793920827, 1885039476, 1785031794, 1853252201, 1919903081, 1650944621, 1701998703, 1785033273, 813000249, 1764911726, 1835755808, 541015871, 1044270159, 810112313, 1429813321, 1246579488, 1815749232, 1818980137, 1601513578, 1752055615, 1044009036, 1348153417, 959260970, 641029174, 895046762, 1764768085, 1230327072, 980447083, 1767844134, 1702324584, 946304569, 813131056, 1966631542, 1734963250, 862417763, 1935762291, 1635217764, 1915826739, 1919168881, 154232433, 2003136887, 1717925683, 1717790071, 1668685928, 842215541, 963267112, 1330271529, 1430927417, 810889273, 1430932816, 1163348551, 1446008394, 1348151126, 541932342, 892614708, 1396197717, 1397176153, 1430669112, 1230452601, 1751736933, 1769301607, 1987667304, 1728711178, 1416128883, 543781664, 1629508709, 1936990306, 2032157037, 1769104993};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}	
	}

	@Test
	public void test8() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {578748416, 0, 0, 0, 0, 0, 0, 0, 16384, 255, 0, 0, 0, 0, 0, 1677721600, 0, 0, 0, 0, 0, 0, 0, 279681536, 0, -1, 0, 1765373802, 1428761177, 1347039457, -1711276032, 0, 0, 27234, 1982886422, 963994169, 661613166, 1751990272, 27697, 1999725873, 1901021769, 676669993, 1428245867, 1768874198, -844488065, 0, 524288, 0, 0, 0, 0, 2130706432, 0, 0, 0, 1024, 16777216, 0, 0, 0, 0, 0, 0, 0, 13312, 0, 1572864, 0, 0, 0, 14614528, 30566, 1902193253, 2004252529, 1718712166, 1903650351, 1383494756, 1684300900, 595027430, 1903325559, 1634083174, 1702323831, 1701215857, 2003199607, 1902208553, 677998187, 1762286437, 1919709282, 1819700073, 1885806784, -1711276032, 65535, 1785294959, 1785425712, 1802055696, 57, 828993390, 1768909417, 946497584, 959998058, 1966682122, 1533375084, 1885498486, 1802072167, 549493248, 0, -1, -1, 604008306, 758145641, 1865446452, 1966094644, 893214003, 878390391, 1902539127, 1718712166, 793920827, 1885039476, 1785031794, 1853252201, 1919903081, 1650944616, 809056360, 1786067248, 173761906, 1819304556, 1869753648, 1651076453, 1919971178, 1701984560};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}		
	}

	@Test
	public void test9() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {1852339817, 1920362602, 809067375, 1702324323, 1718186085, 2003462518, 1768645988, 1667855983, 1780496222, 1378182774, 1752529223, 643123535, 1347041648, 1867131176, 640312690, 1786143333, 1797287529, 1869768040, 943286134, 1647916088, 862482025, 1797288546, 1815687220, 859384106, 1428703867, 745352496, 963210060, 1011699514, 1330325599, 710172198, 640308552, 1330530640, 1765373232, 961497677, 1263290698, 1210463799, 947480936, 1851924587, 1819240761, 1785215343, 1768977721, 1869179739, 762259312, 1785547048, 1430923306, 640316007, 1714713141, 1748264809, 1868904552, 2036820280, 1748251246, 863006567, 892627817, 1882220656, 1785738036, 1762287408, 761870384, 1380270678, 1347375685, 1247167055, 1531717458, 743134825, 808282425, 758658872, 947206449, 859141482, 1651012975, 1752054635, 1817070153, 1330661989, 2003329638, 1987671401, 1785034594, 1969647465, 1902204200};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}		
	}

	@Test
	public void test10() {
		FindFirstZero a = new FindFirstZero();
		int[] array = {1585381376, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int loc = a.FindFirstZero(array);

		if (loc != -1) {
			assertTrue("The value of array's location is not zero", array[loc] == 0);	
			for (int i = 0; i < loc; i++)
				assertTrue("There is a zero value before detected location", array[i] != 0);
		}
		else {
			for (int i = 0; i < array.length; i++)
				assertTrue("There is a zero value but the method did not find it", array[i] != 0);
		}
	}
}
