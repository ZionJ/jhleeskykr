/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d)  {
		
		System.out.println("parameter value : " + d);
		
		int rd = 0;
		
		rd = (int)Math.round(d/2.0);
		
		System.out.println("return value  : " + rd);
		
		return rd;
	}

	static boolean quest2(String s) {
		
		String rs;
		
		rs = s.substring(2,3);

		return rs.equals("}")?true:false;
		
		/*
		if(rs.equals("}")){
			return true;
		}else{
			return false;
		}
		*/
		
	}
}
