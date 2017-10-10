package integration;
import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {

	/* 
	 * Testando os numeros romanos padrões I, V, X, L, C, D e M
	 */
	@Test
	public void testStaticNumbers(){
				
		assertEquals(1, Validator.arabicEquivalent('I'));
		assertEquals(5, Validator.arabicEquivalent('V'));
		assertEquals(10, Validator.arabicEquivalent('X'));
		assertEquals(50, Validator.arabicEquivalent('L'));
		assertEquals(100, Validator.arabicEquivalent('C'));
		assertEquals(500, Validator.arabicEquivalent('D'));
		assertEquals(1000, Validator.arabicEquivalent('M'));
		
	}
	
	/*
	 * Testando se o numero pesquisado está dentro do limite estipulado em sala (0 e 1000)
	 */
	@Test
	public void testLimitNumber(){
		
		assertTrue(Validator.isValidNumber(1000));
	}
	
	/*
	 * Teste para verificar qual o maior numero romano
	 * OBS: Não foi necessário, pois de acordo com os testes, tive que decrementar o i do for(convertToArabic)
	 * em -1 para o mesmo pular uma letra no caso de o subtração na conversão.	
	 */
//	@Test
//	public void testBigger(){
//		assertEquals(9,Validator.isBiggerThan('I', 'X'));
//		assertEquals(50,Validator.isBiggerThan('L', 'X'));
//	}
	/*
	 * Teste de conversão direta de romano para arabico
	 */
	@Test
	public void testRomanToArabic(){
		assertEquals(71, Validator.toArabic("LXXI"));
		assertEquals(1000, Validator.toArabic("M"));
		assertEquals(745, Validator.toArabic("DCCXLV"));
		assertEquals(900, Validator.toArabic("CM"));
		
		/*
		 * "0" por que MI não é um numero entre 0 e 1000. Como 0 não existe em romano, retorno o mesmo como sinal
		 * de erro
		*/
		assertEquals(0, Validator.toArabic("MI"));
		System.out.println(Validator.toArabic("DCCXLV"));
		System.out.println(Validator.toArabic("DCC10"));
		assertEquals(0, Validator.toArabic("M20"));
		assertEquals(0, Validator.toArabic("X29"));
		assertEquals(0, Validator.toArabic("asd"));
		assertEquals(30, Validator.toArabic("xxx"));
		
		
		assertTrue(false);
		
		
	}
	/*
	 * Teste de fato da conversão de Arábico para romano
	 */
	@Test
	public void testArabicToRoman(){
		assertEquals("LXXI", Validator.toRoman("71"));
		assertEquals("", Validator.toRoman("0"));
		assertEquals("", Validator.toRoman("1001"));
		System.out.println(Validator.toRoman("998"));
		assertEquals("", Validator.toRoman("X29"));
		assertEquals("", Validator.toRoman("asd"));
		assertEquals("", Validator.toRoman("xxx"));
		
		assertTrue(false);
	}

	

}
